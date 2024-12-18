package X;

/* renamed from: X.HbT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39441HbT extends C4S7 {
    public final float A00;
    public final C38951HDd A01;
    public final C120985dq A02;
    public final J2W A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39441HbT(C38951HDd c38951HDd, C120985dq c120985dq, J2W j2w, int i) {
        super(c120985dq, i);
        float f;
        C96444Vc A1U;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (A1U = c38321qM.A1U()) != null) {
            f = A1U.A01 / A1U.A00;
        } else {
            f = 0.5625f;
        }
        this.A02 = c120985dq;
        this.A03 = j2w;
        this.A01 = c38951HDd;
        this.A00 = f;
    }
}
