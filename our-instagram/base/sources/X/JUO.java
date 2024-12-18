package X;

import com.instagram.common.typedurl.ImageCacheKey;

/* loaded from: classes8.dex */
public final class JUO extends C0T6 implements MNL {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof JUO) && C14360o3.A0K(this.A00, ((JUO) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public JUO(String str) {
        this.A00 = str;
    }

    public static void A00(InterfaceC222716g interfaceC222716g, MRJ mrj) {
        String str = ((ImageCacheKey) interfaceC222716g.AjX()).A03;
        C14360o3.A07(str);
        mrj.DSH(new JUO(str));
    }
}
