package X;

import java.util.List;

/* renamed from: X.Gqq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38185Gqq extends C5I3 {
    public final Integer A00;
    public final String A01;
    public final /* synthetic */ C206259Bi A02;

    public C38185Gqq(C206259Bi c206259Bi) {
        Integer num;
        String A2W;
        this.A02 = c206259Bi;
        C130455uq c130455uq = (C130455uq) c206259Bi.A02;
        C14360o3.A0B(c130455uq, 1);
        C38321qM A00 = c130455uq.A00();
        this.A01 = (A00 == null || (A2W = A00.A2W()) == null) ? "" : A2W;
        if (C38184Gqp.A00(c206259Bi)) {
            num = C05F.A0C;
        } else {
            num = C05F.A00;
        }
        this.A00 = num;
    }

    @Override // X.C5I4
    public final String AZM() {
        return "";
    }

    @Override // X.C5I3, X.C5I4
    public final Integer Awh() {
        return (Integer) this.A02.A01;
    }

    @Override // X.C5I4
    public final Integer BKD() {
        return this.A00;
    }

    @Override // X.C5I4
    public final List BVA() {
        return null;
    }

    @Override // X.C5I4
    public final int BgX() {
        return 0;
    }

    @Override // X.C5I4
    public final String getId() {
        return this.A01;
    }
}
