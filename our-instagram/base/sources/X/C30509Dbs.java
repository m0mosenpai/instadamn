package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import com.instagram.creator.achievements.modules.models.Badge;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Dbs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30509Dbs extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30509Dbs(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A04 = interfaceC16820sZ;
        switch (i2) {
            case 6:
            case 7:
                this.A03 = interfaceC16820sZ2;
                this.A02 = interfaceC16820sZ3;
                break;
            default:
                this.A02 = interfaceC16820sZ2;
                this.A03 = interfaceC16820sZ3;
                break;
        }
        this.A01 = i;
    }

    public static int A00(C30509Dbs c30509Dbs) {
        return AbstractC128295qy.A00(c30509Dbs.A01 | 1);
    }

    public static C30509Dbs A01(Object obj, Object obj2, Object obj3, int i, int i2) {
        return new C30509Dbs(i, i2, obj, obj2, obj3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        C5Tl c5Tl;
        int i3;
        switch (this.A00) {
            case 0:
                BXG.A06((BXF) this.A03, AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (InterfaceC16620sF) this.A02, A00(this));
                return C0eB.A00;
            case 1:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C28210Cc8 c28210Cc8 = (C28210Cc8) this.A04;
                Object[] objArr = (Object[]) this.A03;
                C28210Cc8.A00(c28210Cc8, A0S, (InterfaceC16660sJ) this.A02, Arrays.copyOf(objArr, objArr.length), A00(this));
                return C0eB.A00;
            case 2:
                AbstractC28376Cfe.A01((InterfaceC30909DiM) this.A04, AbstractC25226BEj.A0S(obj, obj2), (Alignment) this.A03, (InterfaceC16620sF) this.A02, A00(this));
                return C0eB.A00;
            case 3:
                ((C6N3) this.A04).A6z(AbstractC25226BEj.A0S(obj, obj2), this.A03, (InterfaceC16620sF) this.A02, A00(this));
                return C0eB.A00;
            case 4:
            case 5:
                CXF.A00(AbstractC25226BEj.A0S(obj, obj2), (C51757Mtg) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this));
                return C0eB.A00;
            case 6:
                CXI.A01(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, A00(this));
                return C0eB.A00;
            case 7:
                CXJ.A01(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, A00(this));
                return C0eB.A00;
            case 8:
                AbstractC28431Cgf.A01(AbstractC25226BEj.A0S(obj, obj2), (C26050Bfd) this.A04, (C83) this.A03, (InterfaceC16820sZ) this.A02, A00(this));
                return C0eB.A00;
            case 9:
                AbstractC28431Cgf.A04(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this));
                return C0eB.A00;
            case 10:
                CXO.A01(AbstractC25226BEj.A0S(obj, obj2), (C26070Bfy) this.A04, (InterfaceC16620sF) this.A03, (InterfaceC16570sA) this.A02, A00(this));
                return C0eB.A00;
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                CXR.A00(AbstractC25226BEj.A0S(obj, obj2), (C50726MaR) this.A04, (C28370CfW) this.A02, (InterfaceC16660sJ) this.A03, A00(this));
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC27534CDe.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (ImageUrl) this.A02, (InterfaceC16660sJ) this.A04, A00(this));
                return C0eB.A00;
            case 14:
                AbstractC27549CDu.A00(AbstractC25226BEj.A0S(obj, obj2), (CS5) this.A02, (InterfaceC16820sZ) this.A04, (InterfaceC16660sJ) this.A03, A00(this));
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                AbstractC27567CEm.A00((LazyListState) this.A02, AbstractC25226BEj.A0S(obj, obj2), (List) this.A04, (InterfaceC16660sJ) this.A03, A00(this));
                return C0eB.A00;
            case 16:
                AbstractC27597CFq.A00(AbstractC25226BEj.A0S(obj, obj2), (C168497fj) this.A03, (ImageUrl) this.A04, (InterfaceC16660sJ) this.A02, A00(this));
                return C0eB.A00;
            case 17:
                AbstractC28386Cfp.A01((C6GN) this.A02, AbstractC25226BEj.A0S(obj, obj2), (C25814BbV) this.A04, (InterfaceC166367c5) this.A03, A00(this));
                return C0eB.A00;
            case 18:
                AbstractC28463ChF.A04(AbstractC25226BEj.A0S(obj, obj2), (C118125Vw) this.A03, (CharSequence) this.A04, (InterfaceC16660sJ) this.A02, A00(this));
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                AbstractC28463ChF.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (C2DC) this.A02, (InterfaceC31034DkY) this.A04, A00(this));
                return C0eB.A00;
            case 20:
                BGP.A02((LazyListState) this.A04, AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this));
                return C0eB.A00;
            case 21:
                AbstractC28416CgM.A00(AbstractC25226BEj.A0S(obj, obj2), (C114205Dh) this.A03, (EnumC27346C5b) this.A02, (InterfaceC16620sF) this.A04, A00(this));
                return C0eB.A00;
            case 22:
                AbstractC27612CGi.A00((Context) this.A03, (Drawable) this.A04, AbstractC25226BEj.A0S(obj, obj2), (InterfaceC137546La) this.A02, A00(this));
                return C0eB.A00;
            case 23:
                Bitmap bitmap = (Bitmap) obj;
                String str = (String) obj2;
                boolean A1R = AbstractC167007dF.A1R(0, bitmap, str);
                C52408NHe c52408NHe = (C52408NHe) this.A04;
                C183298Bb c183298Bb = c52408NHe.A0A;
                C8Ba c8Ba = c183298Bb.A01;
                if (c8Ba != null) {
                    if (str.equals(new C206899Du(c8Ba, 49).invoke(this.A03))) {
                        C51369MmU c51369MmU = (C51369MmU) this.A02;
                        C8Ba c8Ba2 = c183298Bb.A01;
                        if (c8Ba2 != null) {
                            C51683MsE c51683MsE = new C51683MsE(null, A1R ? 1 : 0, c8Ba2.A02, c8Ba2.A01, false);
                            c51683MsE.A00(0, bitmap);
                            c51369MmU.A00 = c51683MsE;
                            C52408NHe.A02(c52408NHe, c51369MmU, this.A01);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    return C0eB.A00;
                }
                throw AbstractC166997dE.A0g();
            case 24:
                AbstractC28502Chv.A02(AbstractC25226BEj.A0S(obj, obj2), (C51739MtM) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this));
                return C0eB.A00;
            case 25:
                CYH.A01(AbstractC25226BEj.A0S(obj, obj2), (C27125Bxo) this.A04, (MagicModPostCaptureTransform) this.A02, (InterfaceC16660sJ) this.A03, A00(this));
                return C0eB.A00;
            case 26:
                CHT.A00(AbstractC25226BEj.A0S(obj, obj2), (C5C3) this.A04, (MagicModPostCaptureTransform) this.A02, (C26195BiL) this.A03, A00(this));
                return C0eB.A00;
            case 27:
                CYP.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (Badge.ChallengeBadge) this.A02, (InterfaceC16660sJ) this.A04, A00(this));
                return C0eB.A00;
            case 28:
                AbstractC28313Cdz.A01(AbstractC25226BEj.A0S(obj, obj2), (C45116Jxl) this.A04, (InterfaceC16660sJ) this.A03, (InterfaceC16660sJ) this.A02, A00(this));
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(359328882, "com.instagram.creator.agent.settings.facts.fragment.InformationFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InformationFragment.kt:86)");
                    }
                    C26873Bta c26873Bta = (C26873Bta) this.A04;
                    String A15 = AbstractC25225BEi.A15(c26873Bta.A00);
                    C5Hc c5Hc = (C5Hc) this.A02;
                    int i4 = this.A01;
                    String A152 = AbstractC25225BEi.A15(c26873Bta.A01);
                    BP5 bp5 = (BP5) this.A03;
                    boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c26873Bta, 1435569697);
                    Object EEc = c5Tl.EEc();
                    if (A1Z || EEc == C5UI.A00) {
                        EEc = new C29643D5i(c26873Bta, 1);
                        c5Tl.FBy(EEc);
                    }
                    CID.A00(c5Tl, bp5, A15, A152, (C0s9) ((C0YS) EEc), c5Hc, i4, AbstractC25228BEl.A1W(c5Tl) ? 1 : 0);
                    if (C0fH.A02()) {
                        i3 = -847509313;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 30:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1273904598, "com.instagram.creator.agent.settings.facts.fragment.InformationFragment.onCreateView.<anonymous>.<anonymous> (InformationFragment.kt:80)");
                    }
                    Fragment fragment = (Fragment) this.A04;
                    Object obj3 = this.A02;
                    int i5 = this.A01;
                    Object obj4 = this.A03;
                    C1130158n c1130158n = Modifier.A00;
                    InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
                    int A00 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A01 = C5X3.A01(c5Tl, c1130158n);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                    AbstractC25231BEo.A12(c5Tl, A02, A04);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A01);
                    AbstractC25708BXt.A04(c5Tl, new C25707BXs(null, 7, 0), C5YD.A00(c5Tl, 2131957100));
                    AbstractC25230BEn.A17(c5Tl, CZV.A00.A02(fragment.requireActivity()), A01(fragment, obj3, obj4, i5, 29), 117313106);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        i3 = -1122511333;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 31:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1118000727, "com.instagram.creator.agent.settings.facts.fragment.InformationFragment.onCreateView.<anonymous> (InformationFragment.kt:79)");
                    }
                    if (AbstractC25235BEs.A1Z(c5Tl, A01(this.A04, this.A02, this.A03, this.A01, 30), 849556252)) {
                        i3 = 1398308029;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 32:
                AbstractC28476ChU.A04(AbstractC25226BEj.A0S(obj, obj2), (BP5) this.A02, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A03, A00(this));
                return C0eB.A00;
            case 33:
                CYT.A01(AbstractC25226BEj.A0S(obj, obj2), (QJ0) this.A02, (InterfaceC16660sJ) this.A03, (InterfaceC16660sJ) this.A04, A00(this));
                return C0eB.A00;
            case 34:
                CIL.A00(AbstractC25226BEj.A0S(obj, obj2), (CQU) this.A02, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A04, A00(this));
                return C0eB.A00;
            case 35:
                CIW.A00(AbstractC25226BEj.A0S(obj, obj2), (C51755Mte) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16660sJ) this.A03, A00(this));
                return C0eB.A00;
            case 36:
                AbstractC28497Chq.A05(AbstractC25226BEj.A0S(obj, obj2), (C44502Jm8) this.A04, (L7D) this.A03, (FPE) this.A02, A00(this));
                return C0eB.A00;
            case 37:
                AbstractC28497Chq.A04(AbstractC25226BEj.A0S(obj, obj2), (MWT) this.A04, (C148336m3) this.A03, (InterfaceC16660sJ) this.A02, A00(this));
                return C0eB.A00;
            case 38:
                AbstractC28497Chq.A01((Picture) this.A02, AbstractC25226BEj.A0S(obj, obj2), (C148336m3) this.A03, (List) this.A04, A00(this));
                return C0eB.A00;
            case 39:
                AbstractC28497Chq.A07(AbstractC25226BEj.A0S(obj, obj2), (C148336m3) this.A04, (List) this.A02, (InterfaceC16660sJ) this.A03, A00(this));
                return C0eB.A00;
            case 40:
                AbstractC27655CIa.A00((InterfaceC119655bO) this.A04, AbstractC25226BEj.A0S(obj, obj2), (C7T7) this.A02, (InterfaceC16660sJ) this.A03, A00(this));
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C26780Bs3.A00(AbstractC25226BEj.A0S(obj, obj2), (C51760Mtj) this.A03, (CP1) this.A02, (C26780Bs3) this.A04, A00(this));
                return C0eB.A00;
            case 43:
            case 44:
            default:
                C26780Bs3.A01(AbstractC25226BEj.A0S(obj, obj2), (C51760Mtj) this.A03, (CP1) this.A02, (C26780Bs3) this.A04, A00(this));
                return C0eB.A00;
            case 45:
                ((C26780Bs3) this.A04).A06(AbstractC25226BEj.A0S(obj, obj2), (ImageUrl) this.A03, (ImageUrl) this.A02, A00(this));
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                AbstractC28054CYi.A00((LazyListState) this.A02, AbstractC25226BEj.A0S(obj, obj2), (C51748MtX) this.A03, (C44532Jmc) this.A04, A00(this));
                return C0eB.A00;
            case 47:
                C3Y6 c3y6 = (C3Y6) obj;
                Activity activity = (Activity) obj2;
                C14360o3.A0B(c3y6, 0);
                CUD cud = (CUD) this.A04;
                C38321qM c38321qM = (C38321qM) this.A03;
                int i6 = this.A01;
                Context context = (Context) this.A02;
                if (AbstractC52812bN.A00) {
                    int A0G = AbstractC53242c7.A0G(context, AbstractC57322k7.A01(cud.A00)) + i6 + C30D.A00;
                    if (activity != null) {
                        i = AbstractC56402iY.A01(activity);
                    } else {
                        i = 0;
                    }
                    int i7 = A0G + i;
                    Size A012 = C86193sq.A00.A01(context, c38321qM.A1q(context), i7, 0);
                    if (A012 != null) {
                        float height = A012.getHeight() * 1.35f;
                        float A002 = AbstractC13890nF.A00(context) - i7;
                        View view = c3y6.A02;
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (height > A002) {
                            layoutParams2.width = A012.getWidth();
                            layoutParams = view.getLayoutParams();
                            i2 = A012.getHeight();
                        } else {
                            layoutParams2.width = (int) (A002 / 1.35f);
                            layoutParams = view.getLayoutParams();
                            i2 = (int) height;
                        }
                        layoutParams.height = i2;
                    }
                }
                return C0eB.A00;
            case 48:
                User user = (User) obj;
                C14360o3.A0B(user, 0);
                CPA cpa = (CPA) this.A03;
                C51761Mtk c51761Mtk = (C51761Mtk) this.A04;
                C75113Zb c75113Zb = (C75113Zb) this.A02;
                int i8 = this.A01;
                AbstractC167007dF.A1D(c51761Mtk, 0, c75113Zb);
                cpa.A00.A00.D4g((C38321qM) c51761Mtk.A02, c75113Zb, user.getId(), i8, false);
                return C0eB.A00;
            case 49:
                AbstractC28319Ce7.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (C148336m3) this.A02, (InterfaceC16660sJ) this.A04, A00(this));
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30509Dbs(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(2);
        this.A00 = i2;
        this.A04 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = i;
    }
}
