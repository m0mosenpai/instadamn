package X;

import java.util.Map;

/* renamed from: X.2Zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51792Zc extends C2ZT {
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51792Zc(long j, String str, String str2) {
        super(j, str);
        C14360o3.A0B(str2, 3);
        this.A00 = str2;
    }

    @Override // X.C2ZT
    public final int A00() {
        return 1;
    }

    @Override // X.C2ZT
    public final String A03() {
        return "tap";
    }

    @Override // X.C2ZT
    public final void A05(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A00);
    }

    @Override // X.C2ZT
    public final String A01() {
        String str = this.A00;
        if (!C14360o3.A0K(str, "unknown")) {
            return AnonymousClass001.A0R("tap_", str);
        }
        return "tap";
    }

    @Override // X.C2ZT
    public final String A02() {
        String str = this.A00;
        if (C14360o3.A0K(str, "unknown")) {
            return "user tapped";
        }
        return AnonymousClass001.A0S("user tapped view (", str, ')');
    }

    @Override // X.C2ZT
    public final Map A04() {
        return AbstractC16850sd.A0M(new C09530e4("view_id", this.A00));
    }
}
