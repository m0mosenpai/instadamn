package X;

/* loaded from: classes5.dex */
public final class BI6 {
    public int A00;
    public C57S A01;
    public C57S A02;
    public C58J A03;
    public boolean A04;
    public final /* synthetic */ C59S A05;

    public BI6(C57S c57s, C57S c57s2, C58J c58j, C59S c59s, int i, boolean z) {
        this.A05 = c59s;
        this.A03 = c58j;
        this.A00 = i;
        this.A02 = c57s;
        this.A01 = c57s2;
        this.A04 = z;
    }

    public final boolean A00(int i, int i2) {
        C57S c57s = this.A02;
        int i3 = this.A00;
        Object obj = c57s.A02[i3 + i];
        Object obj2 = this.A01.A02[i3 + i2];
        C114265Dp c114265Dp = AbstractC114255Do.A00;
        if (!C14360o3.A0K(obj, obj2) && obj.getClass() != obj2.getClass()) {
            return false;
        }
        return true;
    }
}
