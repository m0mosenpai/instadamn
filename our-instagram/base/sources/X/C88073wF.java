package X;

import java.util.Map;

/* renamed from: X.3wF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88073wF extends C2ZT {
    public final int A00;

    @Override // X.C2ZT
    public final int A00() {
        return 10;
    }

    @Override // X.C2ZT
    public final String A03() {
        return "volume_up";
    }

    @Override // X.C2ZT
    public final void A05(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A00);
    }

    @Override // X.C2ZT
    public final String A02() {
        int i = this.A00;
        if (i == 1) {
            return "user tapped volume up button";
        }
        return AnonymousClass001.A0c("user pressed on volume up button and triggered it ", " times", i);
    }

    @Override // X.C2ZT
    public final Map A04() {
        return AbstractC16850sd.A0M(new C09530e4("count", Integer.valueOf(this.A00)));
    }

    public C88073wF(long j, String str, int i) {
        super(j, str);
        this.A00 = i;
    }
}
