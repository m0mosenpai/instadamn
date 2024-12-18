package X;

import java.util.Map;

/* renamed from: X.2Zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51802Zd extends C2ZT {
    public final boolean A00;

    @Override // X.C2ZT
    public final int A00() {
        return 2;
    }

    @Override // X.C2ZT
    public final String A03() {
        return "scroll";
    }

    @Override // X.C2ZT
    public final void A05(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A00);
        sb.append("|");
    }

    @Override // X.C2ZT
    public final String A01() {
        if (this.A00) {
            return "scroll_vertically";
        }
        return "scroll_horizontally";
    }

    @Override // X.C2ZT
    public final Map A04() {
        return AbstractC16850sd.A0M(new C09530e4("is_vertical", Boolean.valueOf(this.A00)));
    }

    public C51802Zd(long j, String str, boolean z) {
        super(j, str);
        this.A00 = z;
    }

    @Override // X.C2ZT
    public final String A02() {
        String str;
        if (this.A00) {
            str = "vertically";
        } else {
            str = "horizontally";
        }
        return AnonymousClass001.A0g("user ", str, " scrolled");
    }
}
