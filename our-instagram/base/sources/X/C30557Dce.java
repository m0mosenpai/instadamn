package X;

import androidx.compose.ui.Modifier;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;
import java.util.List;

/* renamed from: X.Dce, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30557Dce extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30557Dce(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(3);
        this.A00 = i;
        this.A05 = obj;
        this.A01 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl;
        int i;
        InterfaceC57989PnZ interfaceC57989PnZ;
        C26449BmW c26449BmW;
        switch (this.A00) {
            case 0:
                C5Tl c5Tl2 = (C5Tl) obj2;
                boolean A1X = AbstractC25231BEo.A1X(obj3, obj);
                if (C0fH.A02()) {
                    C0fH.A01(629674397, "com.instagram.creation.genai.magicmod.common.ui.MagicModPromptView.<anonymous>.<anonymous> (MagicModPromptView.kt:55)");
                }
                InterfaceC30813Dgo interfaceC30813Dgo = (InterfaceC30813Dgo) this.A05;
                AbstractC28308Cdu.A00(c5Tl2, AbstractC25227BEk.A0H(Modifier.A00, 10.0f), interfaceC30813Dgo, (MagicModPostCaptureTransform) this.A01, (InterfaceC16820sZ) this.A03, (InterfaceC16620sF) this.A04, (InterfaceC16620sF) this.A02, 4536, A1X ? 1 : 0, true);
                if (C0fH.A02()) {
                    i = 973931705;
                    C0fH.A00(i);
                    break;
                }
                break;
            case 1:
                c5Tl = (C5Tl) obj2;
                if (AbstractC25228BEl.A0D(obj3) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1343302936, "com.instagram.settings2.core.view.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:129)");
                    }
                    InterfaceC30954DjB interfaceC30954DjB = (InterfaceC30954DjB) this.A02;
                    C26228Bis c26228Bis = (C26228Bis) interfaceC30954DjB;
                    if (c26228Bis.A02 != null) {
                        interfaceC57989PnZ = c26228Bis.A03;
                    } else {
                        interfaceC57989PnZ = ((C26231Biv) ((InterfaceC30954DjB) this.A05)).A05;
                    }
                    InterfaceC57989PnZ interfaceC57989PnZ2 = interfaceC57989PnZ;
                    C38688GzT c38688GzT = (C38688GzT) this.A01;
                    if (c38688GzT != null) {
                        SettingsScreenViewModel settingsScreenViewModel = (SettingsScreenViewModel) this.A03;
                        Object obj4 = this.A04;
                        Object obj5 = this.A05;
                        boolean A1X2 = AbstractC25226BEj.A1X(c5Tl, obj5, AbstractC25232BEp.A1X(c5Tl, interfaceC30954DjB, obj4, 1814043777));
                        Object EEc = c5Tl.EEc();
                        if (A1X2 || EEc == C5UI.A00) {
                            EEc = new C43210J8h(14, obj5, obj4, interfaceC30954DjB);
                            c5Tl.FBy(EEc);
                        }
                        boolean A1W = AbstractC25228BEl.A1W(c5Tl);
                        CKJ.A00(c5Tl, c38688GzT, settingsScreenViewModel, interfaceC57989PnZ2, (InterfaceC16820sZ) EEc, A1W ? 1 : 0, A1W ? 1 : 0);
                    }
                    if (C0fH.A02()) {
                        i = 47634359;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 2:
                c5Tl = (C5Tl) obj2;
                int A0H = AbstractC166987dD.A0H(obj3);
                C14360o3.A0B(obj, 0);
                if ((A0H & 17) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1570209023, "com.instagram.settings2.core.view.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:147)");
                    }
                    C26228Bis c26228Bis2 = (C26228Bis) ((InterfaceC30954DjB) this.A02);
                    boolean A1Z = AbstractC25229BEm.A1Z(this.A01);
                    InterfaceC58302Psu interfaceC58302Psu = c26228Bis2.A03;
                    boolean z = c26228Bis2.A07;
                    boolean z2 = c26228Bis2.A06;
                    List list = c26228Bis2.A04;
                    C38688GzT c38688GzT2 = c26228Bis2.A02;
                    C51759Mti c51759Mti = c26228Bis2.A01;
                    C51759Mti c51759Mti2 = c26228Bis2.A00;
                    AbstractC167007dF.A1F(interfaceC58302Psu, 0, list);
                    C14360o3.A0B(c51759Mti, 6);
                    C26228Bis c26228Bis3 = new C26228Bis(c51759Mti, c51759Mti2, c38688GzT2, interfaceC58302Psu, list, z, A1Z, z2);
                    BY0.A04(c5Tl, (InterfaceC30953DjA) this.A05, c26228Bis3, (SettingsScreenViewModel) this.A04, (InterfaceC16660sJ) this.A03, 0);
                    if (C0fH.A02()) {
                        i = 1470760602;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            default:
                C168877gM c168877gM = (C168877gM) obj;
                List list2 = (List) obj2;
                boolean A1a = AbstractC166987dD.A1a(obj3);
                AbstractC167017dG.A1N(c168877gM, list2);
                FoaUserSession foaUserSession = ((C26398Blh) this.A05).A00;
                String str = ((UserAccountInfo) this.A02).A08;
                if (A1a) {
                    int size = list2.size();
                    c26449BmW = new C26449BmW(EnumC72394Xcg.A0R, AbstractC25225BEi.A0p(Double.doubleToRawLongBits(60.0d)), Float.valueOf(100.0f), C05F.A00, size, AbstractC25230BEn.A0K());
                } else {
                    c26449BmW = null;
                }
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A03;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
                AbstractC27448C9q abstractC27448C9q = (AbstractC27448C9q) this.A01;
                AbstractC167007dF.A1F(foaUserSession, 1, interfaceC16620sF);
                AbstractC25229BEm.A1J(interfaceC16660sJ, 9, abstractC27448C9q);
                AbstractC28336CeO.A02(c168877gM, abstractC27448C9q, new DIJ(interfaceC16660sJ, list2, null, null, c26449BmW, interfaceC16620sF, foaUserSession, str, 1));
                break;
        }
        return C0eB.A00;
    }
}
