package X;

/* renamed from: X.7gV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC168967gV {
    public final InterfaceC169817hv A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AbstractC168967gV(C2XE c2xe, C2VF c2vf, int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        AYH ayh;
        boolean z5 = z2;
        boolean z6 = z;
        if ((i2 & 32) != 0) {
            z4 = c2xe.A02.A01.A0M;
        } else {
            z4 = false;
        }
        z6 = (i2 & 128) != 0 ? false : z6;
        z5 = (i2 & 256) != 0 ? false : z5;
        this.A01 = z6;
        if (this instanceof C168957gU) {
            C168957gU c168957gU = (C168957gU) this;
            C169757hp c169757hp = new C169757hp();
            c169757hp.A01 = c168957gU.A00;
            c169757hp.A02 = c168957gU.A01;
            ayh = c169757hp;
        } else {
            C212149aj c212149aj = (C212149aj) this;
            AYH ayh2 = new AYH();
            ayh2.A02 = c212149aj.A01;
            ayh2.A03 = c212149aj.A02;
            ayh2.A00 = c212149aj.A00;
            ayh = ayh2;
        }
        ayh.E34(i);
        ayh.ECj(new C169777hr(new C170417iu(C2V3.A00(null, c2xe.A02.A01, c2vf, null, null, null, null, null, -161, 31, false, false, false, false, z4, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), null, Boolean.valueOf(z3), null, 2.0f, 0, 0, false, false, false, false, false, z5)));
        this.A00 = ayh.AER();
        this.A02 = i == 1;
    }
}
