package X;

/* renamed from: X.4WI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WI {
    public final int A00;
    public final C4WG A01;
    public final Object A02;
    public final C4WD[] A03;
    public final C4WE[] A04;

    public C4WI(C4WG c4wg, Object obj, C4WD[] c4wdArr, C4WE[] c4weArr) {
        this.A03 = c4wdArr;
        this.A04 = (C4WE[]) c4weArr.clone();
        this.A01 = c4wg;
        this.A02 = obj;
        this.A00 = c4wdArr.length;
    }
}
