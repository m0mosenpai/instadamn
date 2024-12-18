package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.MYn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50669MYn extends AbstractC52922bZ implements InterfaceC58066Por {
    public C31349DqE A00;
    public InterfaceC16820sZ A01;
    public InterfaceC16820sZ A02;
    public final C52678NSa A03;
    public final Map A04;
    public final java.util.Set A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;

    public C50669MYn(C52678NSa c52678NSa) {
        C14360o3.A0B(c52678NSa, 1);
        this.A03 = c52678NSa;
        this.A04 = AbstractC166987dD.A1I();
        this.A02 = C57385Pdj.A00;
        this.A01 = C57384Pdi.A00;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A06 = A12;
        this.A07 = AbstractC07080Za.A03(A12);
        this.A05 = AbstractC31171DnF.A0l();
    }

    public final C2GT A00(JIN jin) {
        C14360o3.A0B(jin, 0);
        Map map = this.A04;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((C2GT) ((Map.Entry) it.next()).getValue()).A02.A00 <= 0) {
                it.remove();
            }
        }
        String BgD = jin.BgD();
        Object obj = map.get(BgD);
        if (obj == null) {
            obj = AbstractC58232lf.A00(AnonymousClass191.A00, this.A03.A03(jin.BgD(), jin.isBookmarked()));
            map.put(BgD, obj);
        }
        return (C2GT) obj;
    }

    public final void A01(JIN jin, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        C14360o3.A0B(interfaceC16820sZ2, 3);
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
        java.util.Set set = this.A05;
        if (set.contains(jin)) {
            set.remove(jin);
        }
        set.add(jin);
        AbstractC166987dD.A1Z(new PZO(jin, this, null, 21, z), AbstractC141776au.A00(this));
    }

    @Override // X.InterfaceC58066Por
    public final void DqJ(boolean z) {
        this.A02.invoke();
    }

    @Override // X.InterfaceC58066Por
    public final void DEM(Integer num, String str, boolean z) {
        AbstractC167017dG.A1P(num, str);
        AbstractC54180NxH.A00(num, str, z);
        PZW.A01(this, AbstractC141776au.A00(this), 31, z);
        this.A01.invoke();
    }
}
