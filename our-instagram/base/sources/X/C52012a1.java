package X;

import java.util.Map;

/* renamed from: X.2a1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52012a1 extends C2ZT {
    public boolean A00;

    @Override // X.C2ZT
    public final int A00() {
        return 12;
    }

    @Override // X.C2ZT
    public final String A03() {
        return "keyboard";
    }

    @Override // X.C2ZT
    public final void A05(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A00);
    }

    @Override // X.C2ZT
    public final String A01() {
        if (this.A00) {
            return "single_key";
        }
        return "multiple_key";
    }

    @Override // X.C2ZT
    public final String A02() {
        if (!this.A00) {
            return "user tapped a key on the keyboard";
        }
        return "user was typing on the keyboard";
    }

    @Override // X.C2ZT
    public final Map A04() {
        return AbstractC16850sd.A0M(new C09530e4("is_multiple", Boolean.valueOf(this.A00)));
    }
}
