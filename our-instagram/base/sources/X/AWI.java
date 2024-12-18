package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class AWI implements BBT {
    public final /* synthetic */ AAB A00;

    public AWI(AAB aab) {
        this.A00 = aab;
    }

    @Override // X.BBT
    public final C177797vD Cpz(C203678zW c203678zW) {
        AAB aab = this.A00;
        C22990ABp c22990ABp = aab.A06;
        AKM akm = new AKM(c22990ABp.A03, c22990ABp.A06, "ar_ads_camera");
        c22990ABp.A02 = akm;
        C22911A8h c22911A8h = c22990ABp.A05;
        akm.A04 = new AX3(c22911A8h);
        akm.A03 = c22911A8h.A00;
        C1814983c c1814983c = akm.A07;
        C14360o3.A07(c1814983c);
        List list = c22990ABp.A08;
        if (list != null) {
            c1814983c.A01 = new C23576AcV(list);
        }
        AKM akm2 = c22990ABp.A02;
        if (akm2 == null) {
            C14360o3.A0F("renderProvider");
            throw C00O.createAndThrow();
        }
        return new C177797vD(akm2.A01(c203678zW, c22990ABp.A00.A00(EnumC142606cM.A01), null, null, null, c22990ABp.A07).A00, new C51965My1(aab, 0));
    }
}
