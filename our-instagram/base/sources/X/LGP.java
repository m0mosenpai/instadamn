package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class LGP {
    public static final C47842LBj A01 = new Object();
    public static final InterfaceC09390do A02 = AbstractC09440dt.A01(MFH.A00);
    public final Map A00;

    public final String A01(C2EY c2ey, Object obj) {
        C14360o3.A0B(c2ey, 0);
        return A00(new C47308KvJ(true), c2ey, obj);
    }

    public LGP() {
        C09530e4[] c09530e4Arr = new C09530e4[28];
        System.arraycopy(AbstractC25230BEn.A1b(C2EY.A1w, MDC.A00), AbstractC31175DnJ.A1b(new C09530e4[]{AbstractC166987dD.A1L(C2EY.A1Q, MD3.A00), AbstractC166987dD.A1L(C2EY.A1y, MDD.A00), AbstractC166987dD.A1L(C2EY.A0H, MDE.A00), AbstractC166987dD.A1L(C2EY.A1F, MDF.A00), AbstractC166987dD.A1L(C2EY.A1x, MDG.A00), AbstractC166987dD.A1L(C2EY.A1s, MDH.A00), AbstractC166987dD.A1L(C2EY.A1V, MDI.A00), AbstractC166987dD.A1L(C2EY.A20, MDJ.A00), AbstractC166987dD.A1L(C2EY.A1g, MDK.A00), AbstractC166987dD.A1L(C2EY.A22, MCt.A00), AbstractC166987dD.A1L(C2EY.A1z, MCu.A00), AbstractC166987dD.A1L(C2EY.A1A, C50143MCv.A00), AbstractC166987dD.A1L(C2EY.A1B, MCw.A00), AbstractC166987dD.A1L(C2EY.A1v, C50144MCx.A00), AbstractC166987dD.A1L(C2EY.A1a, C50145MCy.A00), AbstractC166987dD.A1L(C2EY.A0t, C50146MCz.A00), AbstractC166987dD.A1L(C2EY.A0W, MD0.A00), AbstractC166987dD.A1L(C2EY.A1r, MD1.A00), AbstractC166987dD.A1L(C2EY.A0M, MD2.A00), AbstractC166987dD.A1L(C2EY.A1U, MD4.A00), AbstractC166987dD.A1L(C2EY.A1b, MD5.A00), AbstractC166987dD.A1L(C2EY.A1c, MD6.A00), AbstractC166987dD.A1L(C2EY.A14, MD7.A00), AbstractC166987dD.A1L(C2EY.A13, MD8.A00), AbstractC166987dD.A1L(C2EY.A0g, MD9.A00), AbstractC166987dD.A1L(C2EY.A0w, MDA.A00), AbstractC166987dD.A1L(C2EY.A0r, MDB.A00)}, c09530e4Arr) ? 1 : 0, c09530e4Arr, 27, 1);
        this.A00 = AbstractC06930Yk.A06(c09530e4Arr);
    }

    public final String A00(C47308KvJ c47308KvJ, C2EY c2ey, Object obj) {
        Map map = this.A00;
        if (!map.containsKey(c2ey)) {
            return "";
        }
        Object A012 = AbstractC06930Yk.A01(c2ey, map);
        C14360o3.A0C(A012, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"content\")] T of com.instagram.direct.deeplinking.DeeplinkPlugin.getProvider, @[ParameterName(name = \"env\")] com.instagram.direct.deeplinking.Environment, kotlin.String>");
        C15500q5.A06(A012, 2);
        return (String) ((InterfaceC16620sF) A012).invoke(obj, c47308KvJ);
    }
}
