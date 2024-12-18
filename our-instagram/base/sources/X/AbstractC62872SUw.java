package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.SUw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62872SUw {
    public static final Pattern A00 = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    public static final Pattern A01 = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    public static final Pattern A02 = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractMap, java.util.HashMap] */
    public static Map A00(java.net.URI uri) {
        String str;
        ?? emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = AbstractC166987dD.A1G();
            C62445SBy c62445SBy = new C62445SBy(new C60677RLm('='));
            AbstractC61296RlG abstractC61296RlG = C60678RLn.A00;
            C60676RLl c60676RLl = new C60676RLl(abstractC61296RlG, new C62445SBy(new C60677RLm('&')), rawQuery, true);
            while (c60676RLl.hasNext()) {
                String A1B = AbstractC166987dD.A1B(c60676RLl);
                A1B.getClass();
                C60676RLl c60676RLl2 = new C60676RLl(abstractC61296RlG, c62445SBy, A1B, false);
                ArrayList A1E = AbstractC166987dD.A1E();
                while (c60676RLl2.hasNext()) {
                    AbstractC58318PtA.A1W(A1E, c60676RLl2);
                }
                List unmodifiableList = Collections.unmodifiableList(A1E);
                if (!unmodifiableList.isEmpty() && unmodifiableList.size() <= 2) {
                    try {
                        String decode = URLDecoder.decode(AbstractC25226BEj.A1I(unmodifiableList, 0), ReactWebViewManager.HTML_ENCODING);
                        if (unmodifiableList.size() == 2) {
                            try {
                                str = URLDecoder.decode(AbstractC25226BEj.A1I(unmodifiableList, 1), ReactWebViewManager.HTML_ENCODING);
                            } catch (UnsupportedEncodingException e) {
                                throw new IllegalArgumentException(e);
                            }
                        } else {
                            str = null;
                        }
                        emptyMap.put(decode, str);
                    } catch (UnsupportedEncodingException e2) {
                        throw new IllegalArgumentException(e2);
                    }
                } else {
                    throw AbstractC166987dD.A12("bad parameter");
                }
            }
        }
        return emptyMap;
    }
}
