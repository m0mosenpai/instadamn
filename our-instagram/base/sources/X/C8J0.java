package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.8J0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8J0 {
    public long A00;
    public long A01;
    public long A02;
    public final C24Q A03;
    public final C1810981l A04;

    public C8J0(C24Q c24q, C1810981l c1810981l) {
        C14360o3.A0B(c24q, 1);
        this.A03 = c24q;
        this.A04 = c1810981l;
        this.A00 = 518927814L;
        this.A01 = 518928411L;
        this.A02 = 17315248L;
    }

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        C24Q c24q = this.A03;
        c24q.A09(this.A02, TraceFieldType.FailureReason, str);
        c24q.A07(str, "", 17315248, this.A02);
    }

    public final void A00() {
        C55U c55u;
        C1810981l c1810981l = this.A04;
        if (c1810981l != null && (c55u = (C55U) c1810981l.A08.A00) != null) {
            String str = c55u.A02;
            C24Q c24q = this.A03;
            long A03 = c24q.A03(518928411, 12000L);
            this.A01 = A03;
            c24q.A09(A03, "camera_destination", str);
        }
    }
}
