package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel;
import com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DH4 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH4(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C28174CbM A00(AbstractC12990ll abstractC12990ll) {
        return (C28174CbM) abstractC12990ll.A01(C28174CbM.class, new DH4(abstractC12990ll, 46));
    }

    public static DH4 A01(C5Tl c5Tl, Object obj, int i) {
        DH4 dh4 = new DH4(obj, i);
        c5Tl.FBy(dh4);
        return dh4;
    }

    public static DH4 A02(C5Tl c5Tl, Object obj, int i) {
        DH4 dh4 = new DH4(obj, i);
        c5Tl.FBy(dh4);
        return dh4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        C61 c61;
        boolean A1X;
        InterfaceC74953Yl interfaceC74953Yl;
        boolean z;
        BottomSheetFragment bottomSheetFragment;
        C189478aR c189478aR;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                return ((CRT) this.A01).A01.getValue();
            case 1:
            case 2:
            case 3:
            case 5:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 22:
            case 23:
            case 24:
            case 30:
            case 33:
            case 34:
            case 36:
            case 37:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
            case 44:
            case 45:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 4:
                ((InterfaceC16660sJ) this.A01).invoke(AbstractC25227BEk.A0S(""));
                return C0eB.A00;
            case 6:
                A1X = AbstractC25225BEi.A1Y(((C5C3) this.A01).A01.A00);
                return Boolean.valueOf(A1X);
            case 7:
            case 49:
                return ((C8CV) this.A01).A00();
            case 8:
            case Process.SIGTERM /* 15 */:
                return ((Fragment) this.A01).requireParentFragment();
            case 9:
                C26790BsE c26790BsE = (C26790BsE) this.A01;
                ContextualBackgroundViewModel contextualBackgroundViewModel = (ContextualBackgroundViewModel) c26790BsE.A02.getValue();
                C27949CTj c27949CTj = contextualBackgroundViewModel.A00;
                if (((C51739MtM) contextualBackgroundViewModel.A0A.getValue()).A02 == C05F.A00) {
                    str2 = "AI_CONTEXTUAL_BACKGROUND_PRE_GEN_CANCEL";
                } else {
                    str2 = "IMAGINE_POST_GEN_CANCEL";
                }
                c27949CTj.A00(str2, null);
                C26790BsE.A00(c26790BsE, false);
                return C0eB.A00;
            case 10:
                C9GR.A01(((Fragment) this.A01).getContext(), "imagine_toast", 2131972370, 1);
                return C0eB.A00;
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 26:
                return AbstractC25226BEj.A1C(this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case 27:
                return AbstractC167027dH.A0B(this.A01);
            case 16:
                C26790BsE c26790BsE2 = (C26790BsE) this.A01;
                return new C27008Bvn(AbstractC25231BEo.A0L(c26790BsE2), AbstractC166987dD.A0r(c26790BsE2.A01));
            case 20:
                interfaceC74953Yl = (InterfaceC74953Yl) this.A01;
                z = true;
                AbstractC25227BEk.A1A(interfaceC74953Yl, z);
                return C0eB.A00;
            case 21:
            case 31:
                interfaceC74953Yl = (InterfaceC74953Yl) this.A01;
                z = false;
                AbstractC25227BEk.A1A(interfaceC74953Yl, z);
                return C0eB.A00;
            case 25:
                return this.A01;
            case 28:
                C28196Cbq c28196Cbq = C28196Cbq.A00;
                C26870BtX c26870BtX = (C26870BtX) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c26870BtX.A04);
                FragmentActivity requireActivity = c26870BtX.requireActivity();
                C22P c22p = C22P.A4h;
                EnumC193878i8 enumC193878i8 = c26870BtX.A01;
                if (enumC193878i8 == null) {
                    str = "tool";
                } else {
                    CameraTool cameraTool = enumC193878i8.A05;
                    GenAIToolInfoDictIntf genAIToolInfoDictIntf = c26870BtX.A00;
                    if (genAIToolInfoDictIntf == null) {
                        str = "genAIToolInfo";
                    } else {
                        c28196Cbq.A00(requireActivity, c22p, cameraTool, A0r, null, genAIToolInfoDictIntf.Ar1(), null);
                        return C0eB.A00;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C26870BtX c26870BtX2 = (C26870BtX) this.A01;
                InterfaceC09390do interfaceC09390do = c26870BtX2.A04;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                String str3 = c26870BtX2.A02;
                if (str3 == null) {
                    str = "mediaId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C26869BtW A00 = AbstractC27620CGr.A00(A0r2, str3);
                Fragment fragment = c26870BtX2.mParentFragment;
                if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null && (c189478aR = bottomSheetFragment.A02) != null) {
                    C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do);
                    AbstractC25226BEj.A1M(c26870BtX2.requireContext(), A0g, 2131956992);
                    C14360o3.A0C(A00, MSV.A00(3));
                    A0g.A0T = A00;
                    c189478aR.A0F(A00, A0g);
                }
                return C0eB.A00;
            case 32:
                obj = this.A01;
                c61 = C61.A03;
                A1X = AbstractC167007dF.A1X(obj, c61);
                return Boolean.valueOf(A1X);
            case 35:
                obj = this.A01;
                c61 = C61.A02;
                A1X = AbstractC167007dF.A1X(obj, c61);
                return Boolean.valueOf(A1X);
            case 38:
                List list = ((C6IF) ((LazyListState) this.A01).A02()).A0D;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC166997dE.A1W(A0q, ((C137036Ig) ((InterfaceC137046Ii) it.next())).A07);
                }
                return A0q;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C28174CbM((UserSession) this.A01);
            case 47:
                return new MagicModImageGenerationDataSource(C12L.A00, (MQ9) this.A01);
            case 48:
                return new C27270C1s((UserSession) this.A01);
        }
    }
}
