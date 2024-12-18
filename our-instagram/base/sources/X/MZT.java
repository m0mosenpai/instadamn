package X;

/* loaded from: classes9.dex */
public final class MZT implements InterfaceC66482zP {
    public final MZV A00;
    public final Object A01;

    public MZT(MZV mzv) {
        C14360o3.A0B(mzv, 1);
        this.A00 = mzv;
        this.A01 = new Object();
        if (mzv != MZV.FULL_WIDTH_WITH_BOTTOM_MARGIN && mzv != MZV.FULL_WIDTH_WITH_SMALL_TOP_AND_BOTTOM_MARGIN) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // X.InterfaceC66482zP
    public final Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
