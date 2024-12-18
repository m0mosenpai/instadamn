package X;

/* loaded from: classes9.dex */
public final class OzW implements BC2 {
    public final String A00;

    @Override // X.BC2
    public final Object Cq7(C128175qm c128175qm, InterfaceC23621Ds interfaceC23621Ds) {
        String str = this.A00;
        if (str == null || !str.equals(c128175qm.A0W)) {
            MXY mxy = new MXY();
            mxy.A0F = MXZ.A00(str);
            return mxy.A01(c128175qm);
        }
        return c128175qm;
    }

    public OzW(String str) {
        this.A00 = str;
    }
}
