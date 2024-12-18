package X;

import android.content.Context;
import android.view.GestureDetector;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class DSZ extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSZ(Object obj, Object obj2, String str, int i) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl;
        int i;
        switch (this.A00) {
            case 0:
                AbstractC25225BEi.A1R(obj2);
                C63397SjR A0y = AbstractC25228BEl.A0y((Context) this.A01, (UserSession) this.A02, C2Fb.A35, "https://www.facebook.com/help/148233965247823?ref=learn_more");
                A0y.A0S = this.A03;
                A0y.A0A();
                return C0eB.A00;
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                boolean A1a = AbstractC167017dG.A1a(str, str2);
                String str3 = this.A03;
                if (str3 != null) {
                    GestureDetector gestureDetector = (GestureDetector) this.A02;
                    InterfaceC80043ht interfaceC80043ht = (InterfaceC80043ht) this.A01;
                    C28359CfJ.A00(gestureDetector);
                    interfaceC80043ht.D2X(str, str2, A1a, str3);
                }
                return C0eB.A00;
            case 2:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1596941951, "com.instagram.creation.capture.assetpicker.cutout.ui.setIgContent.<anonymous> (CutoutPhotoStickerStylizedImage.kt:142)");
                    }
                    C5VW.A03(c5Tl, (AbstractC12990ll) this.A02, this.A03, (InterfaceC16620sF) this.A01, 448, 24, false, false, false);
                    if (C0fH.A02()) {
                        i = -1302626569;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 3:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1288521425, "com.instagram.creation.genai.magicmod.common.ui.MagicModGeneratedImageOptionSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MagicModGenAIImageSelector.kt:75)");
                    }
                    C28224CcU c28224CcU = (C28224CcU) this.A01;
                    AbstractC28306Cds.A00(c5Tl, c28224CcU, (InterfaceC16660sJ) this.A02, 8, C14360o3.A0K(c28224CcU.A04, this.A03));
                    if (C0fH.A02()) {
                        i = 1696358538;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 4:
                MailboxFeature mailboxFeature = (MailboxFeature) obj;
                boolean A1R = AbstractC167007dF.A1R(0, mailboxFeature, obj2);
                C47909LEd c47909LEd = (C47909LEd) this.A02;
                Object obj3 = c47909LEd.A02;
                String str4 = this.A03;
                Object obj4 = this.A01;
                synchronized (obj3) {
                    List A1J = AbstractC166987dD.A1J(str4);
                    PrivacyContext privacyContext = c47909LEd.A00;
                    C44176Jff c44176Jff = new C44176Jff(44, obj2, obj4);
                    InterfaceExecutorC135866Co ASj = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(0);
                    MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
                    mailboxFutureImpl.Ecq(c44176Jff);
                    AbstractC25231BEo.A1C(ASj, new LUR(A1R ? 1 : 0, mailboxFeature, mailboxFutureImpl, A1J, privacyContext), mailboxFutureImpl);
                }
                return C0eB.A00;
            case 5:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-361617697, "com.instagram.fanclub.settings.adapter.FanClubMainRecommendationViewHolder.setIgContent.<anonymous> (FanClubMainRecommendationViewHolder.kt:71)");
                    }
                    C5VW.A03(c5Tl, (AbstractC12990ll) this.A02, this.A03, (InterfaceC16620sF) this.A01, 384, 24, false, false, false);
                    if (C0fH.A02()) {
                        i = -1269272929;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            default:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(593408683, "com.instagram.schools.management.ui.SchoolRemovalBottomSheetComposeView.<anonymous> (SchoolRemovalBottomSheetComposeView.kt:27)");
                    }
                    Object obj5 = this.A02;
                    Object obj6 = this.A01;
                    String str5 = this.A03;
                    C1130158n c1130158n = Modifier.A00;
                    InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
                    InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
                    InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
                    int A00 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A01 = C5X3.A01(c5Tl, c1130158n);
                    InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
                    AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A03;
                    InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
                    }
                    InterfaceC16620sF interfaceC16620sF3 = C5X8.A04;
                    C5XJ.A00(c5Tl, A01, interfaceC16620sF3);
                    C6GM c6gm = C6GM.A00;
                    Modifier A08 = AbstractC118175Wb.A08(c1130158n, 32.0f);
                    InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
                    int A002 = C5X2.A00(c5Tl);
                    C59P A042 = C117505Tk.A04(c117505Tk);
                    Modifier A012 = C5X3.A01(c5Tl, A08);
                    AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
                    C5XJ.A00(c5Tl, A022, interfaceC16620sF);
                    if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
                    }
                    C5XJ.A00(c5Tl, A012, interfaceC16620sF3);
                    C2DC A003 = C5Y7.A00(c5Tl, R.drawable.ig_illustrations_illo_delete_confirm_refresh, 0);
                    InterfaceC118245Wl interfaceC118245Wl2 = C118195Wf.A00;
                    C6LQ.A03(c5Tl, c6gm.AB6(interfaceC118245Wl2, c1130158n).Eq3(AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 16.0f)), A003);
                    C5WR.A0T(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 14.0f), AbstractC25226BEj.A0e(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131972294), AbstractC25226BEj.A0G(c5Tl));
                    AbstractC25235BEs.A1F(c5Tl, AbstractC25226BEj.A0c(c5Tl), AbstractC25235BEs.A0p(c5Tl, str5, 2131972293));
                    c5Tl.ASW();
                    Modifier AB6 = c6gm.AB6(interfaceC118245Wl2, c1130158n);
                    String A004 = AbstractC136736Hc.A00(c5Tl, 2131972171);
                    String A005 = AbstractC136736Hc.A00(c5Tl, 2131954754);
                    boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, obj5, -1255984315);
                    Object EEc = c5Tl.EEc();
                    if (A1Y || EEc == C5UI.A00) {
                        EEc = C29886DGa.A00(c5Tl, obj5, 32);
                    }
                    InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc, false);
                    boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, obj6, -1255979131);
                    Object EEc2 = c5Tl.EEc();
                    if (A1Y2 || EEc2 == C5UI.A00) {
                        EEc2 = C29886DGa.A00(c5Tl, obj6, 33);
                    }
                    AbstractC28506Chz.A04(c5Tl, AB6, null, A004, A005, A1A, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), null, 12585984, 3072, 24336, true, false, true, false, false, false, false, false);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        i = 1448872709;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
        }
    }
}
