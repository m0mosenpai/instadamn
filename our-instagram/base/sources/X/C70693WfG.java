package X;

/* renamed from: X.WfG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70693WfG implements InterfaceC126005ms {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C14510oO A01;
    public final /* synthetic */ Integer[] A02;

    public C70693WfG(C6FG c6fg, C14510oO c14510oO, Integer[] numArr) {
        this.A02 = numArr;
        this.A00 = c6fg;
        this.A01 = c14510oO;
    }

    @Override // X.InterfaceC126005ms
    public final boolean FDk(C102884kP c102884kP) {
        XAJ xaj;
        C14360o3.A0B(c102884kP, 0);
        if (AbstractC009903n.A0O(Integer.valueOf(c102884kP.A05), this.A02) && (xaj = (XAJ) AnonymousClass634.A06(this.A00, c102884kP)) != null) {
            C14510oO c14510oO = this.A01;
            c14510oO.A00 = xaj.isScrolledToTop() & c14510oO.A00;
        }
        return !this.A01.A00;
    }
}
