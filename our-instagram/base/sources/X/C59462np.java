package X;

import java.util.Map;

/* renamed from: X.2np, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59462np implements InterfaceC59172nI {
    public final android.net.Uri A00;
    public final android.net.Uri A01;
    public final Map A02;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C14360o3.A0K(cls2, cls)) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.source.SingleImageSourceImpl");
        C59462np c59462np = (C59462np) obj;
        return C14360o3.A0K(this.A00, c59462np.A00) && C14360o3.A0K(this.A02, c59462np.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SingleImageSourceImpl(uri=");
        sb.append(this.A01);
        sb.append(MSV.A00(288));
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A00.hashCode() * 31;
        Map map = this.A02;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public C59462np(android.net.Uri uri, Map map) {
        this.A01 = uri;
        this.A02 = map;
        this.A00 = uri;
    }
}
