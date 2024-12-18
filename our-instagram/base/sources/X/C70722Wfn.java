package X;

/* renamed from: X.Wfn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70722Wfn implements InterfaceC41501vz {
    public final /* synthetic */ C147886lK A00;

    public C70722Wfn(C147886lK c147886lK) {
        this.A00 = c147886lK;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(1543900549);
        VBZ vbz = (VBZ) obj;
        int A0N = AbstractC167017dG.A0N(vbz, 1318168388);
        C147886lK c147886lK = this.A00;
        if (!vbz.A03.equals(c147886lK.A02)) {
            i = 1143678922;
        } else {
            EnumC53318Nhu enumC53318Nhu = (EnumC53318Nhu) EnumC53318Nhu.A01.get(vbz.A05);
            if (enumC53318Nhu == null) {
                enumC53318Nhu = EnumC53318Nhu.A07;
            }
            C69714Vu9 c69714Vu9 = c147886lK.A01;
            if (c69714Vu9 != null) {
                long j = vbz.A00;
                long j2 = vbz.A01;
                String str = vbz.A04;
                C14360o3.A06(str);
                C71149Wok c71149Wok = new C71149Wok(vbz.A02, enumC53318Nhu, str, j, j2);
                c69714Vu9.A01(new C71147Woi(new C71145Wog(c71149Wok), c71149Wok));
            }
            i = 277982742;
        }
        C0f9.A0A(i, A0N);
        C0f9.A0A(79970717, A03);
    }
}
