package X;

/* renamed from: X.0lR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12790lR extends AbstractC20490zQ {
    public C12800lS[] A00;
    public final /* synthetic */ C12780lQ A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12790lR(C12780lQ c12780lQ, int i, int i2) {
        super(c12780lQ, i, i2);
        this.A01 = c12780lQ;
        int i3 = 1 << (i + i2);
        C12800lS[] c12800lSArr = new C12800lS[i3];
        this.A00 = c12800lSArr;
        for (int i4 = 0; i4 < i3; i4++) {
            c12800lSArr[i4] = new C12800lS(this);
        }
    }
}
