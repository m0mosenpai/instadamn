package X;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creator.inspiration.repository.CreatorInspirationHubAudioPagingSource;
import com.instagram.creatortools.api.CreatorToolsMonetizationApi;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes5.dex */
public final class D87 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D87(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String string;
        switch (this.A00) {
            case 0:
            case 5:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 21:
            case 28:
            case 44:
                return this.A01;
            case 1:
            case 6:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 22:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 45:
                return AbstractC25226BEj.A1C(this.A01);
            case 2:
            case 7:
            case 14:
            case 23:
            case 30:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 3:
                return AbstractC25230BEn.A0l(((C26819Bsh) this.A01).A07);
            case 4:
                KD0 kd0 = (KD0) this.A01;
                FragmentActivity requireActivity = kd0.requireActivity();
                Application application = kd0.requireActivity().getApplication();
                UserSession A0r = AbstractC166987dD.A0r(kd0.A09);
                EnumC39549HdL enumC39549HdL = EnumC39549HdL.A03;
                AbstractC167017dG.A1P(application, A0r);
                return new C52942bb(new C27034BwE(application, A0r, enumC39549HdL), requireActivity).A00(C53063Ndc.class);
            case 8:
                Fragment fragment = ((Fragment) this.A01).mParentFragment;
                if (fragment == null) {
                    return null;
                }
                InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new D87(new D87(fragment, 5), 6));
                return AbstractC25225BEi.A0a(new D87(A00, 7), new C50169MDw(17, fragment, A00), new C50169MDw(16, A00, null), AbstractC25225BEi.A1D(C25863BcI.class)).getValue();
            case 9:
                AbstractC12990ll A0o = AbstractC166987dD.A0o(((KD0) this.A01).A09);
                return AbstractC166997dE.A0c(AbstractC166997dE.A0U(A0o), A0o, 36323908517244602L);
            case 10:
                KD0 kd02 = (KD0) this.A01;
                InterfaceC09390do interfaceC09390do = kd02.A06;
                ((Gt5) AbstractC166987dD.A17(interfaceC09390do)).A0I();
                InterfaceC19390xP A0H = ((Gt5) AbstractC166987dD.A17(interfaceC09390do)).A0H();
                if (A0H != null) {
                    AbstractC18560vj.A03(AbstractC25229BEm.A0a(kd02), new C15340po(new D53(kd02, null, 28), A0H));
                }
                return C0eB.A00;
            case 11:
                KD0 kd03 = (KD0) this.A01;
                FragmentActivity fragmentActivity = kd03.A01;
                if (fragmentActivity == null) {
                    str = "activity";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C35156Fey.A00(fragmentActivity, C22P.A29, kd03, AbstractC166987dD.A0r(kd03.A09));
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                return new CVK((UserSession) this.A01);
            case 16:
                return C1QS.A00((AbstractC12990ll) this.A01);
            case 17:
                return new CreatorInspirationHubAudioPagingSource((UserSession) this.A01);
            case 18:
            case 35:
            case 39:
                return AbstractC25235BEs.A0U(this.A01);
            case Process.SIGSTOP /* 19 */:
                return new C26996Bvb(AbstractC166987dD.A0r(((C45496KCl) this.A01).A03));
            case 20:
                return F1E.A00(AbstractC166987dD.A0r(((EOQ) this.A01).A0G));
            case 24:
                return new C32567EVr(AbstractC166987dD.A0r(((EOQ) this.A01).A0G));
            case 25:
                UserSession userSession = ((C34723FRm) this.A01).A01;
                if (userSession != null) {
                    return Integer.valueOf(AbstractC2051396d.A00(userSession));
                }
                str = "userSession";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 26:
                UserSession userSession2 = ((C34723FRm) this.A01).A01;
                if (userSession2 != null) {
                    return F1E.A00(userSession2);
                }
                str = "userSession";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 27:
                return F1E.A00(AbstractC166987dD.A0r(((EOR) this.A01).A0J));
            case 31:
                return new C32566EVq(AbstractC166987dD.A0r(((EOR) this.A01).A0J));
            case 32:
                return new C36296Fzq((UserSession) this.A01);
            case 33:
                return new CreatorToolsMonetizationApi((UserSession) this.A01);
            case 34:
                C26761Bri c26761Bri = (C26761Bri) this.A01;
                return new C25893Bcu(c26761Bri, AbstractC166987dD.A0r(c26761Bri.A01), C16930sl.A00);
            case 36:
                return new C26997Bvc(AbstractC166987dD.A0r(((C26761Bri) this.A01).A01));
            case 37:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle != null) {
                    return bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                }
                return null;
            case 38:
                C26775Brw c26775Brw = (C26775Brw) this.A01;
                return new C25893Bcu(c26775Brw, AbstractC166987dD.A0r(c26775Brw.A02), C16930sl.A00);
            case 40:
                return new C26997Bvc(AbstractC166987dD.A0r(((C26775Brw) this.A01).A02));
            case Seq.NULL_REFNUM /* 41 */:
                C26762Brj c26762Brj = (C26762Brj) this.A01;
                return new C51144Min(c26762Brj, AbstractC166987dD.A0r(c26762Brj.A03), C16930sl.A00);
            case 43:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                if (bundle2 != null && (string = bundle2.getString("value_props_flow_type")) != null) {
                    return string;
                }
                return ValuePropsFlow.A0C.A00;
            case 47:
                return new C26997Bvc(AbstractC166987dD.A0r(((C26762Brj) this.A01).A03));
            case 48:
                return new A7F((UserSession) this.A01);
            case 49:
                return C97N.A00(C97M.A00(((A7F) this.A01).A00));
        }
    }
}
