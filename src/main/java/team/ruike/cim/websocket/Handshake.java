package team.ruike.cim.websocket;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * webSocket控制器
 */
public class Handshake implements HandshakeInterceptor {
    /**
     * 初次握手前置
     * @param request serverHttpRequest
     * @param serverHttpResponse serverHttpResponse
     * @param webSocketHandler webSocketHandler
     * @param map map
     * @return true
     * @throws Exception 处理错误
     */
    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Map<String, Object> map) throws Exception {
        if (request instanceof ServletServerHttpRequest) {
            HttpServletRequest servletRequest = ((ServletServerHttpRequest) request).getServletRequest();
            map.put("user", servletRequest.getSession().getAttribute("u"));
        }
        return true;
    }

    /**
     *后置增强
     */
    @Override
    public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Exception e) {

    }
}
