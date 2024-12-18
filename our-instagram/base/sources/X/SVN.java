package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class SVN {
    public static final Q9q A05 = new AbstractC63646SrC("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
    public static final Q9q A01 = new AbstractC63646SrC("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
    public static final C58792Q9t A0d = new AbstractC63646SrC("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
    public static final Q9r A0C = new AbstractC63646SrC("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
    public static final C58793Q9u A0n = new AbstractC63646SrC("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    @Deprecated
    public static final C58793Q9u A0e = new AbstractC63646SrC("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    @Deprecated
    public static final C58793Q9u A0f = new AbstractC63646SrC("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
    public static final C58793Q9u A0g = new AbstractC63646SrC("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
    public static final C58793Q9u A0h = new AbstractC63646SrC("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
    public static final C58793Q9u A0j = new AbstractC63646SrC("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
    public static final Q9r A0D = new AbstractC63646SrC("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
    public static final Q9r A0F = new AbstractC63646SrC("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
    public static final Q9r A0G = new AbstractC63646SrC("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
    public static final Q9r A0H = new AbstractC63646SrC("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
    public static final Q9r A0E = new AbstractC63646SrC("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
    public static final Q9r A0I = new AbstractC63646SrC("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
    public static final Q9q A04 = new AbstractC63646SrC("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
    public static final Q9q A03 = new AbstractC63646SrC("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
    public static final Q9r A0J = new AbstractC63646SrC("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
    public static final C58793Q9u A0i = new AbstractC63646SrC("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
    public static final Q9r A0K = new AbstractC63646SrC("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
    public static final Q9q A0B = new AbstractC63646SrC("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
    public static final Q9q A0A = new AbstractC63646SrC("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
    public static final C58793Q9u A0k = new AbstractC63646SrC("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
    public static final C58793Q9u A0l = new AbstractC63646SrC("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
    public static final C58793Q9u A0m = new AbstractC63646SrC("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final Q9q A08 = new AbstractC63646SrC("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final Q9q A07 = new AbstractC63646SrC("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final Q9s A0Z = new AbstractC63646SrC("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final Q9q A09 = new AbstractC63646SrC("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final Q9q A00 = new AbstractC63646SrC("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final Q9q A02 = new AbstractC63646SrC("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final Q9q A06 = new AbstractC63646SrC("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final C58792Q9t A0c = new AbstractC63646SrC("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final C58792Q9t A0b = new AbstractC63646SrC("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final C58795Q9w A0q = new AbstractC63646SrC("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final C58795Q9w A0s = new AbstractC63646SrC("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final C58794Q9v A0o = new AbstractC63646SrC("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    public static final C58798Q9z A0u = new ST6();
    public static final C58797Q9y A0t = new ST6();
    public static final C58795Q9w A0r = new AbstractC63646SrC("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final C58796Q9x A0v = new C58796Q9x();
    public static final Q9s A0U = new AbstractC63646SrC("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    public static final Q9s A0R = new AbstractC63646SrC("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final C58795Q9w A0p = new AbstractC63646SrC("FORCE_DARK", "FORCE_DARK");
    public static final Q9s A0O = new AbstractC63646SrC("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final Q9s A0a = new AbstractC63646SrC("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final Q9s A0M = new AbstractC63646SrC("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    public static final Q9s A0V = new AbstractC63646SrC("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final Q9s A0Q = new AbstractC63646SrC("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final Q9s A0N = new AbstractC63646SrC("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    public static final Q9s A0P = new AbstractC63646SrC("GET_COOKIE_INFO", "GET_COOKIE_INFO");
    public static final Q9s A0W = new AbstractC63646SrC("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
    public static final Q9s A0X = new AbstractC63646SrC("USER_AGENT_METADATA", "USER_AGENT_METADATA");
    public static final Q9s A0S = new Q9p();
    public static final Q9s A0L = new AbstractC63646SrC("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
    public static final Q9s A0Y = new AbstractC63646SrC("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
    public static final Q9s A0T = new AbstractC63646SrC("MUTE_AUDIO", "MUTE_AUDIO");

    public static boolean A00(String str) {
        java.util.Set<InterfaceC65190TfY> unmodifiableSet = Collections.unmodifiableSet(AbstractC63646SrC.A02);
        HashSet A1H = AbstractC166987dD.A1H();
        for (InterfaceC65190TfY interfaceC65190TfY : unmodifiableSet) {
            if (((AbstractC63646SrC) interfaceC65190TfY).A00.equals(str)) {
                A1H.add(interfaceC65190TfY);
            }
        }
        if (!A1H.isEmpty()) {
            Iterator it = A1H.iterator();
            while (it.hasNext()) {
                AbstractC63646SrC abstractC63646SrC = (AbstractC63646SrC) ((InterfaceC65190TfY) it.next());
                if (abstractC63646SrC.A00() || abstractC63646SrC.A01()) {
                    return true;
                }
            }
            return false;
        }
        throw MSY.A0d("Unknown feature ", str);
    }
}
