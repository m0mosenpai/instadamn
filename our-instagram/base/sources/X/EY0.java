package X;

/* loaded from: classes6.dex */
public final class EY0 extends C4F4 {
    public final int A00;
    public final String A01;
    public final boolean A02;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        EY0 ey0 = (EY0) obj;
        if (this.A01.equals(ey0.A01) && this.A00 == ey0.A00 && this.A02 == ey0.A02) {
            return true;
        }
        return false;
    }

    public EY0(String str, int i, boolean z) {
        str.getClass();
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }
}
