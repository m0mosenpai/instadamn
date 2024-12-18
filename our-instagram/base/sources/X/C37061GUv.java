package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings2.core.data.SettingsNetworkInteractor;
import com.instagram.settings2.core.data.SettingsRepository;
import go.Seq;

/* renamed from: X.GUv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37061GUv extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37061GUv(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C37061GUv(obj, i));
    }

    public static C37061GUv A01(Object obj, int i) {
        return new C37061GUv(obj, i);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return AbstractC25230BEn.A0l(((C33194Ekg) this.A01).A01);
            case 1:
            case 8:
            case 14:
            case Process.SIGSTOP /* 19 */:
            case 23:
            case 27:
            case 34:
            case 38:
                return this.A01;
            case 2:
            case 9:
            case Process.SIGTERM /* 15 */:
            case 20:
            case 24:
            case 28:
            case 35:
            case 39:
                return AbstractC25226BEj.A1C(this.A01);
            case 3:
            case 10:
            case 16:
            case 21:
            case 25:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 36:
            case 40:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 4:
                return new OKL(AbstractC166987dD.A0r(((N55) this.A01).A0a));
            case 5:
                N55 n55 = (N55) this.A01;
                return new NC8(AbstractC166987dD.A0r(n55.A0a), new C57252Pba(17, n55.requireContext(), n55));
            case 6:
                C31699Dw4 c31699Dw4 = new C31699Dw4();
                Context context = ((EQ8) this.A01).A07;
                String string = context.getString(2131973064);
                int A03 = AbstractC31174DnI.A03(context);
                c31699Dw4.A01 = string;
                c31699Dw4.A00 = A03;
                return c31699Dw4;
            case 7:
                Context context2 = ((C34624FNh) this.A01).A01;
                return AbstractC31174DnI.A0q(context2, AbstractC53242c7.A0D(context2));
            case 11:
                return new C32574EVz(AbstractC166987dD.A0r(((C32244EId) this.A01).A05));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                EIx.A00((EIx) this.A01);
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                C121275eQ c121275eQ = new C121275eQ(new PUG(abstractC59962oe, 4), 1726365662);
                c121275eQ.A00 = new EZ9(abstractC59962oe, 16);
                abstractC59962oe.schedule(c121275eQ);
                break;
            case 17:
                return new EWF(AbstractC166987dD.A0r(((EIx) this.A01).A0N));
            case 18:
                C33224ElC.A00((C33224ElC) this.A01);
                break;
            case 22:
                EJQ ejq = (EJQ) this.A01;
                InterfaceC09390do interfaceC09390do = ejq.A01;
                boolean A06 = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36319531945172463L);
                return new EWS(AbstractC25231BEo.A0L(ejq), AbstractC12220kQ.A01(ejq.A00, AbstractC166987dD.A0o(interfaceC09390do)), A06);
            case 26:
                EJR ejr = (EJR) this.A01;
                return new EWG(AbstractC25231BEo.A0L(ejr), AbstractC166987dD.A0r(ejr.A00));
            case 30:
                return new EWS(AbstractC25231BEo.A0L((Fragment) this.A01), new C12210kP(AbstractC12960li.A00).A00(), false);
            case 31:
                C56719PFl.A00((C56719PFl) this.A01);
                break;
            case 32:
            case 33:
                AbstractC166987dD.A1Y(this.A01);
                break;
            case 37:
                return new EW0(AbstractC166987dD.A0r(((C33203Ekq) this.A01).A01));
            case Seq.NULL_REFNUM /* 41 */:
                return new EW1(AbstractC166987dD.A0r(((C33204Ekr) this.A01).A01));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new C31588DuG((UserSession) this.A01);
            case 43:
                return C006802i.A0p;
            case 44:
                return new SettingsNetworkInteractor((UserSession) this.A01);
            case 45:
                return new OMF((UserSession) this.A01);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C54824OLi(AbstractC31171DnF.A0D(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE), ((SettingsRepository) this.A01).A01);
            case 47:
                return AbstractC31180DnO.A0b((Fragment) this.A01);
            case 48:
            case 49:
                C50685MZd.A00((C50685MZd) this.A01).A04();
                break;
        }
        return C0eB.A00;
    }
}
