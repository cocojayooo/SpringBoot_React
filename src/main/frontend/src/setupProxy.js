const {createProxyMiddleware} = require('http-proxy-middleware');

module.exports = function (prx) {
    prx.use(
        createProxyMiddleware('/prxUrl',{
           target: 'http://localhost:8080',
           changeOrigin: true
        })
    );
};