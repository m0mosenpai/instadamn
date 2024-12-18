package X;

/* loaded from: classes12.dex */
public final class YCZ implements YNt {
    public final YNt A00;
    public final YNt A01 = new Object();
    public final YNt A02;

    @Override // X.YNt
    public final /* bridge */ /* synthetic */ Object ECl(Object obj, Object obj2) {
        C72813Xnc c72813Xnc = (C72813Xnc) obj;
        Y06 y06 = c72813Xnc.A00;
        Y06 y062 = y06;
        C72763Xmf c72763Xmf = c72813Xnc.A02;
        Y07 y07 = c72813Xnc.A03;
        Y07 y072 = y07;
        YNt yNt = this.A01;
        Y0H y0h = c72813Xnc.A01;
        Y0H y0h2 = (Y0H) yNt.ECl(y0h, obj2);
        boolean z = true;
        boolean A1a = AbstractC25229BEm.A1a(y0h2, y0h);
        YNt yNt2 = this.A00;
        if (yNt2 != null) {
            y062 = (Y06) yNt2.ECl(y06, obj2);
            A1a |= AbstractC25229BEm.A1a(y062, y06);
        }
        YNt yNt3 = this.A02;
        if (yNt3 != null) {
            y072 = (Y07) yNt3.ECl(y07, obj2);
            if (y072 == y07) {
                z = false;
            }
            A1a |= z;
        }
        if (A1a) {
            boolean z2 = c72813Xnc.A04;
            return new C72813Xnc(y062, y0h2, c72763Xmf, y072, c72813Xnc.A05, z2, c72813Xnc.A09, c72813Xnc.A07, c72813Xnc.A06, c72813Xnc.A08);
        }
        return c72813Xnc;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.YNt, java.lang.Object] */
    public YCZ(YNt yNt, YNt yNt2) {
        this.A00 = yNt;
        this.A02 = yNt2;
    }
}
