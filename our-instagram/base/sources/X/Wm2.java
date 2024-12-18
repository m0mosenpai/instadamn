package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class Wm2 implements C5NL {
    public URN A00 = new URN(null, null, null, null, null, null, null, null, null, null);

    public final float A00() {
        Float f = this.A00.A03;
        if (f != null) {
            return f.floatValue();
        }
        return -1.0f;
    }

    public final int A01() {
        return AbstractC167017dG.A0K(this.A00.A04);
    }

    public final String A02() {
        String str = this.A00.A07;
        if (str == null) {
            str = "";
        }
        if (str.length() > 1000) {
            return "";
        }
        return str;
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A06;
        C148276lx c148276lx = C148276lx.A1L;
        String str = this.A00.A06;
        if (str == null) {
            str = "";
        }
        C148286ly c148286ly = new C148286ly();
        c148286ly.A0S = AnonymousClass001.A0R("emoji_slider_", str);
        c5ng.A06 = new C148276lx(EnumC150226pU.A1V, "slider_sticker_bundle_id", AbstractC166987dD.A1J(c148286ly)).A01();
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0U;
    }

    public final boolean A03() {
        double A00 = A00();
        if (0.0d > A00 || A00 > 1.0d) {
            return false;
        }
        return true;
    }
}
