package X;

/* loaded from: classes8.dex */
public final class LSE implements InterfaceC50417MNt {
    public final /* synthetic */ LLH A00;
    public final /* synthetic */ LK0 A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ int[] A03;

    public LSE(LLH llh, LK0 lk0, int[] iArr, boolean z) {
        this.A00 = llh;
        this.A03 = iArr;
        this.A02 = z;
        this.A01 = lk0;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        LK0 lk0;
        Object c44827Jt1;
        EnumC46197KcZ enumC46197KcZ = (EnumC46197KcZ) obj;
        if (enumC46197KcZ == null) {
            enumC46197KcZ = EnumC46197KcZ.A06;
        }
        LLH llh = this.A00;
        int[] iArr = this.A03;
        LLH.A03(llh, "backup_state", enumC46197KcZ.name(), iArr);
        if (enumC46197KcZ != EnumC46197KcZ.A06) {
            boolean z = this.A02;
            int i = 0;
            do {
                int i2 = iArr[i];
                if (i2 != 1021652813 || z) {
                    llh.A03.markerEnd(i2, 0, (short) 2);
                }
                i++;
            } while (i < 2);
            lk0 = this.A01;
            c44827Jt1 = new C44826Jt0(enumC46197KcZ);
        } else {
            LLH.A05(llh, null, iArr, this.A02);
            lk0 = this.A01;
            c44827Jt1 = new C44827Jt1(new Exception());
        }
        lk0.A05(c44827Jt1);
    }
}
