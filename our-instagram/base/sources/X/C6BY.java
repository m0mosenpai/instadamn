package X;

import java.util.Map;

/* renamed from: X.6BY, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6BY {
    public static InterfaceC16660sJ A00 = C6BZ.A00;

    public static final InterfaceC59172nI A01(String str) {
        android.net.Uri uri;
        if (str != null) {
            uri = (android.net.Uri) A00.invoke(str);
        } else {
            uri = null;
        }
        return A00(uri, null);
    }

    public static final InterfaceC59172nI A00(android.net.Uri uri, Map map) {
        if (uri == null) {
            return C135586Bj.A00;
        }
        C06860Yd c06860Yd = new C06860Yd();
        if (map != null) {
            c06860Yd.putAll(map);
        }
        c06860Yd.put("uri_source", uri);
        return new C59462np(uri, AbstractC16850sd.A0N(c06860Yd));
    }
}
