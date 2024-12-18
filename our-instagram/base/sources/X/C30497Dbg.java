package X;

import androidx.compose.ui.Modifier;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creator.agent.settings.facts.viewmodel.LinkPreviewUseCaseImpl;
import com.instagram.creator.agent.settings.facts.viewmodel.QuestionAnswerFactPreviewUseCaseImpl;
import com.instagram.creator.agent.settings.facts.viewmodel.SingularFactPreviewUseCaseImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.schools.management.data.SchoolInfo;
import go.Seq;
import java.util.ArrayList;

/* renamed from: X.Dbg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30497Dbg extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30497Dbg(int i, int i2, Object obj) {
        super(2);
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
    }

    public static int A00(C30497Dbg c30497Dbg) {
        return AbstractC128295qy.A00(c30497Dbg.A01 | 1);
    }

    public static void A01(C5UU c5uu, Object obj, int i, int i2) {
        c5uu.A06 = new C30497Dbg(i, i2, obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl;
        C0UO c0uo;
        int i;
        switch (this.A00) {
            case 0:
                CI7.A00(AbstractC25226BEj.A0S(obj, obj2), (C50679MYx) this.A02, A00(this));
                return C0eB.A00;
            case 1:
                CYQ.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                return C0eB.A00;
            case 2:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-151201644, "com.instagram.creator.agent.settings.facts.fragment.AddFactFragment.onCreateView.<anonymous>.<anonymous> (AddFactFragment.kt:129)");
                    }
                    C26765Brm c26765Brm = (C26765Brm) this.A02;
                    InterfaceC09390do interfaceC09390do = c26765Brm.A09;
                    InterfaceC74963Ym A02 = C6IB.A02(c5Tl, ((C26901Bu4) interfaceC09390do.getValue()).A00.A05, 0);
                    AbstractC26895Btw abstractC26895Btw = ((C26901Bu4) interfaceC09390do.getValue()).A02;
                    if (abstractC26895Btw instanceof SingularFactPreviewUseCaseImpl) {
                        c0uo = ((SingularFactPreviewUseCaseImpl) abstractC26895Btw).A03;
                    } else if (abstractC26895Btw instanceof QuestionAnswerFactPreviewUseCaseImpl) {
                        c0uo = ((QuestionAnswerFactPreviewUseCaseImpl) abstractC26895Btw).A03;
                    } else {
                        c0uo = ((LinkPreviewUseCaseImpl) abstractC26895Btw).A04;
                    }
                    InterfaceC74963Ym A022 = C6IB.A02(c5Tl, c0uo, 0);
                    int i2 = this.A01;
                    String A15 = AbstractC25225BEi.A15(c26765Brm.A06);
                    String A152 = AbstractC25225BEi.A15(c26765Brm.A05);
                    Object value = interfaceC09390do.getValue();
                    boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, value, 1543588046);
                    Object EEc = c5Tl.EEc();
                    if (A1Z || EEc == C5UI.A00) {
                        EEc = AbstractC25229BEm.A0s(c5Tl, value, 29);
                    }
                    C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                    InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) ((C0YS) EEc);
                    Object value2 = interfaceC09390do.getValue();
                    boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, value2, 1543589889);
                    Object EEc2 = c5Tl.EEc();
                    if (A1Z2 || EEc2 == C5UI.A00) {
                        EEc2 = AbstractC25229BEm.A0s(c5Tl, value2, 30);
                    }
                    InterfaceC16620sF A0w = AbstractC25235BEs.A0w(A0K, EEc2, false);
                    CIC.A00(c5Tl, (C26084BgD) A022.getValue(), (C26045BfY) A02.getValue(), A15, A152, interfaceC16620sF, A0w, i2, 0);
                    C0eB c0eB = C0eB.A00;
                    boolean A1Z3 = AbstractC25227BEk.A1Z(c5Tl, c26765Brm, 1543595237);
                    Object EEc3 = c5Tl.EEc();
                    if (A1Z3 || EEc3 == C5UI.A00) {
                        EEc3 = D4z.A02(c26765Brm, null, 45);
                        c5Tl.FBy(EEc3);
                    }
                    if (AbstractC25232BEp.A1V(c5Tl, A0K, EEc3, c0eB, false)) {
                        i = 340519453;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 3:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1858112781, "com.instagram.creator.agent.settings.facts.fragment.AddFactFragment.onCreateView.<anonymous> (AddFactFragment.kt:128)");
                    }
                    if (AbstractC25235BEs.A1Y(c5Tl, AbstractC25228BEl.A0W(), new C30497Dbg(this.A01, 2, this.A02), 386785404)) {
                        i = 1892293741;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 4:
                CYV.A01(AbstractC25226BEj.A0S(obj, obj2), (ArrayList) this.A02, A00(this));
                return C0eB.A00;
            case 5:
                AbstractC28314Ce0.A00(AbstractC25226BEj.A0S(obj, obj2), (C6MK) this.A02, A00(this));
                return C0eB.A00;
            case 6:
                AbstractC28314Ce0.A01(AbstractC25226BEj.A0S(obj, obj2), (C6MK) this.A02, A00(this));
                return C0eB.A00;
            case 7:
                AbstractC28316Ce2.A01((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 8:
                AbstractC28316Ce2.A02((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 9:
                CIT.A00(AbstractC25226BEj.A0S(obj, obj2), (C34476FHo) this.A02, A00(this));
                return C0eB.A00;
            case 10:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(2106371971, "com.instagram.direct.fragment.thread.chatsettings.customthemepreview.CustomThemePreviewFragment.updateViews.<anonymous>.<anonymous> (CustomThemePreviewFragment.kt:268)");
                    }
                    CIU.A00(c5Tl, new C50165MDs(this.A02, 10), this.A01, 0);
                    if (C0fH.A02()) {
                        i = -179052666;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 11:
                CIV.A00(AbstractC25226BEj.A0S(obj, obj2), (C25864BcJ) this.A02, A00(this));
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC27658CId.A00(AbstractC25226BEj.A0S(obj, obj2), (AnonymousClass781) this.A02, A00(this));
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Ce4.A02(AbstractC25226BEj.A0S(obj, obj2), (MR5) this.A02, A00(this));
                return C0eB.A00;
            case 14:
                AbstractC28054CYi.A01(AbstractC25226BEj.A0S(obj, obj2), (C44532Jmc) this.A02, A00(this));
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                AbstractC28056CYk.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                return C0eB.A00;
            case 16:
                C26830Bss.A03(AbstractC25226BEj.A0S(obj, obj2), (C26830Bss) this.A02, A00(this));
                return C0eB.A00;
            case 17:
                C26830Bss.A04(AbstractC25226BEj.A0S(obj, obj2), (C26830Bss) this.A02, A00(this));
                return C0eB.A00;
            case 18:
                AbstractC28465ChH.A02(AbstractC25226BEj.A0S(obj, obj2), (C45997KXl) this.A02, A00(this));
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                AbstractC28465ChH.A03(AbstractC25226BEj.A0S(obj, obj2), (C45997KXl) this.A02, A00(this));
                return C0eB.A00;
            case 20:
                AbstractC28500Cht.A08(AbstractC25226BEj.A0S(obj, obj2), (C45994KXi) this.A02, A00(this));
                return C0eB.A00;
            case 21:
                CJ5.A00((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 22:
                AbstractC28417CgO.A01((BVY) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 23:
                BG8.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                return C0eB.A00;
            case 24:
                BG8.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                return C0eB.A00;
            case 25:
                AbstractC28498Chr.A07((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 26:
                CJO.A00((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 27:
                AbstractC25280BGu.A00(AbstractC25226BEj.A0S(obj, obj2), (C6C7) this.A02, A00(this));
                return C0eB.A00;
            case 28:
                AbstractC25280BGu.A01(AbstractC25226BEj.A0S(obj, obj2), (C6C7) this.A02, A00(this));
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            default:
                AbstractC28507Ci0.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                return C0eB.A00;
            case 31:
                AbstractC27683CJc.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC31039Dkd) this.A02, A00(this));
                return C0eB.A00;
            case 32:
                AbstractC28397Cg3.A02(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                return C0eB.A00;
            case 33:
                AbstractC28323CeB.A01((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 34:
                AbstractC28323CeB.A02((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 35:
                AbstractC27691CJk.A00((C5Hc) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 36:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(429637577, "com.instagram.profilecard.ui.ProfileCardDownloadBottomSheetFragment.onCreateView.<anonymous> (ProfileCardDownloadBottomSheetFragment.kt:45)");
                    }
                    int i3 = this.A01;
                    C54695ODv c54695ODv = ((C26717Bqy) this.A02).A00;
                    if (c54695ODv == null) {
                        C14360o3.A0F("delegate");
                        throw C00O.createAndThrow();
                    }
                    AbstractC28325CeD.A01(c5Tl, c54695ODv, i3, 0);
                    if (C0fH.A02()) {
                        i = 507808384;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 37:
                AbstractC27696CJp.A00(AbstractC25226BEj.A0S(obj, obj2), (ImageUrl) this.A02, A00(this));
                return C0eB.A00;
            case 38:
                CK5.A00((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 39:
                AbstractC28327CeF.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                return C0eB.A00;
            case 40:
                AbstractC28327CeF.A02(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                AbstractC28329CeH.A01((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                AbstractC28329CeH.A02((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 43:
                AbstractC28445Cgt.A04((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 44:
                AbstractC28402Cg8.A02(AbstractC25226BEj.A0S(obj, obj2), (SchoolInfo) this.A02, A00(this));
                return C0eB.A00;
            case 45:
                AbstractC28402Cg8.A03(AbstractC25226BEj.A0S(obj, obj2), (SchoolInfo) this.A02, A00(this));
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                AbstractC28508Ci2.A0G((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                return C0eB.A00;
            case 47:
                AbstractC28332CeK.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                return C0eB.A00;
            case 48:
                AbstractC28332CeK.A02(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                return C0eB.A00;
            case 49:
                AbstractC28490Chi.A03(AbstractC25226BEj.A0S(obj, obj2), (GraphGuardianContent) this.A02, A00(this));
                return C0eB.A00;
        }
    }
}
