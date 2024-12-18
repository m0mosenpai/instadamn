package X;

import android.app.Activity;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.brandedcontent.repository.BrandedContentApi;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.activity.FbConnectPageActivity;
import com.instagram.business.promote.model.IGBoostPackagesFlowInfo;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.react.modules.base.IgReactQEModule;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import go.Seq;
import java.io.File;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.MDq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50163MDq extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50163MDq(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v115, types: [X.FOi, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        IGBoostPackagesFlowInfo iGBoostPackagesFlowInfo;
        int i;
        Integer num;
        String str;
        boolean z;
        String string;
        switch (this.A00) {
            case 0:
                return new C51157Mj0(AbstractC166987dD.A0r(((C32301EKo) this.A01).A03));
            case 1:
            case 11:
            case 16:
            case 43:
                return this.A01;
            case 2:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 17:
            case 44:
                return AbstractC25226BEj.A1C(this.A01);
            case 3:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 18:
            case 45:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 4:
                return ((C32301EKo) this.A01).A01.invoke();
            case 5:
                C32301EKo c32301EKo = (C32301EKo) this.A01;
                return new NCP(c32301EKo.requireContext(), c32301EKo, AbstractC166987dD.A0r(c32301EKo.A03));
            case 6:
                C08730cb c08730cb = C17060sy.A01;
                KCF kcf = (KCF) this.A01;
                InterfaceC09390do interfaceC09390do = kcf.A02;
                if (!AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A2I() && !kcf.A00) {
                    kcf.A00 = true;
                    C1QE.A01("business_conversion_flow").A08();
                    AbstractC155756z4.A00();
                    Intent intent = new Intent(kcf.requireContext(), (Class<?>) BusinessConversionActivity.class);
                    intent.putExtras(AbstractC167027dH.A09("business_account_flow", 3, AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", AbstractC166987dD.A0r(interfaceC09390do).token), AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "branded_content_settings"), AbstractC166987dD.A1L(AbstractC111324zv.A00(1029), 0)));
                    C12260kU.A06(kcf, intent, 16);
                } else {
                    AbstractC25226BEj.A1P(kcf);
                }
                return C0eB.A00;
            case 7:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                z = true;
                if (bundle == null || !bundle.getBoolean(MSV.A00(953), false)) {
                    z = false;
                    break;
                }
                break;
            case 8:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                if (bundle2 != null) {
                    return bundle2.getString("media_id");
                }
                return null;
            case 9:
                Bundle bundle3 = ((Fragment) this.A01).mArguments;
                if (bundle3 != null && (string = bundle3.getString("argument_media_type")) != null) {
                    return string;
                }
                throw AbstractC166987dD.A12("No string passed in as asset value");
            case 10:
                Bundle bundle4 = ((Fragment) this.A01).mArguments;
                z = false;
                if (bundle4 != null && bundle4.getBoolean("argument_show_action_bar", true)) {
                    z = true;
                    break;
                }
                break;
            case 14:
                return new KFU(AbstractC166987dD.A0r(((N5X) this.A01).A07));
            case Process.SIGTERM /* 15 */:
                UserSession userSession = (UserSession) this.A01;
                return new BrandedContentProjectRepository(userSession, AbstractC40691uc.A01(userSession));
            case Process.SIGSTOP /* 19 */:
                return new KFV(AbstractC166987dD.A0r(((C45520KDl) this.A01).A02));
            case 20:
                UserSession userSession2 = (UserSession) this.A01;
                return new C48253LXc(userSession2, AbstractC40691uc.A01(userSession2), AbstractC31174DnI.A0g(C1AT.A01(userSession2), C1AV.A0Z, C23087AFt.A00));
            case 21:
                UserSession userSession3 = (UserSession) this.A01;
                MonetizationApi monetizationApi = new MonetizationApi(userSession3);
                BrandedContentApi brandedContentApi = new BrandedContentApi(userSession3);
                C2DS A00 = AbstractC28761aE.A00(userSession3);
                BrandedContentProjectRepository A002 = AbstractC46656KkZ.A00(userSession3);
                C14360o3.A0B(userSession3, 0);
                return new BrandedContentSettingsRepository(A002, (C48253LXc) userSession3.A01(C48253LXc.class, new C50163MDq(userSession3, 20)), brandedContentApi, A00, AbstractC40691uc.A01(userSession3), monetizationApi);
            case 22:
                return AbstractC46656KkZ.A00(((BrandedContentFeedDisclosureController) this.A01).A02);
            case 23:
                return AbstractC54051NvA.A00(((C44548Jms) this.A01).A07);
            case 24:
                C19L c19l = C55203OeE.A01;
                List list = (List) this.A01;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0q.add(AbstractC166987dD.A11(((BugReportAttachment) AbstractC43592JPx.A17(it).A00).A03));
                }
                JSONObject A0q2 = AbstractC31171DnF.A0q();
                Iterator it2 = A0q.iterator();
                while (it2.hasNext()) {
                    A0q2.put(((File) it2.next()).getName(), 1);
                }
                return A0q2;
            case 25:
                return new OuS((AbstractC12990ll) this.A01);
            case 26:
                return new OuR((AbstractC12990ll) this.A01);
            case 27:
                CallerContext callerContext = C35788FrQ.A0B;
                BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) this.A01;
                return new C35788FrQ((Bundle) businessConversionActivity.A0D.getValue(), businessConversionActivity.getSession());
            case 28:
                return Boolean.valueOf(((BaseBundle) ((BusinessConversionActivity) this.A01).A0D.getValue()).getBoolean("sign_up_suma_entry", false));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC31176DnK.A0g(C17060sy.A01, ((BusinessConversionActivity) this.A01).A0H).A0I();
            case 30:
                Bundle A0A = AbstractC31173DnH.A0A((Activity) this.A01);
                if (A0A != null) {
                    return A0A;
                }
                throw AbstractC166997dE.A0g();
            case 31:
                BusinessConversionActivity businessConversionActivity2 = (BusinessConversionActivity) this.A01;
                return new C35013Fbk(businessConversionActivity2, businessConversionActivity2, new Object(), (C34404FEu) businessConversionActivity2.A0F.getValue());
            case 32:
                return C023409i.A0A.A04((Bundle) ((BusinessConversionActivity) this.A01).A0D.getValue());
            case 33:
                return new C34404FEu(((IgFragmentActivity) this.A01).getSession());
            case 34:
                return Boolean.valueOf(((Activity) this.A01).getIntent().getBooleanExtra("EXTRA_DISABLE_ACTIVITY_TRANSITION_ANIMATION", false));
            case 35:
                return C023409i.A0A.A06((Bundle) ((BusinessConversionActivity) this.A01).A0D.getValue());
            case 36:
                Bundle A0A2 = AbstractC31173DnH.A0A((Activity) this.A01);
                if (A0A2 != null) {
                    return A0A2;
                }
                throw AbstractC166997dE.A0g();
            case 37:
                return C023409i.A0A.A06((Bundle) ((FbConnectPageActivity) this.A01).A00.getValue());
            case 38:
                return new W6I((UserSession) this.A01);
            case 39:
                return new C70814WhX((UserSession) this.A01);
            case 40:
                return new C70816WhZ((UserSession) this.A01);
            case Seq.NULL_REFNUM /* 41 */:
                return new C70815WhY((UserSession) this.A01);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new C70813WhW((UserSession) this.A01);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                throw AbstractC166987dD.A15("session$delegate");
            case 47:
                try {
                    Bundle bundle5 = ((C67884V0q) this.A01).mArguments;
                    if (bundle5 != null && (iGBoostPackagesFlowInfo = (IGBoostPackagesFlowInfo) bundle5.getParcelable("boost_packages")) != null) {
                        return iGBoostPackagesFlowInfo;
                    }
                    throw AbstractC166997dE.A0g();
                } catch (Exception e) {
                    ((C67884V0q) this.A01).A08 = e;
                    return new Object();
                }
            case 48:
                try {
                    Bundle bundle6 = ((C67884V0q) this.A01).mArguments;
                    if (bundle6 != null) {
                        str = bundle6.getString("currency");
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        return Currency.getInstance(str);
                    }
                    throw AbstractC166997dE.A0g();
                } catch (Exception e2) {
                    ((C67884V0q) this.A01).A08 = e2;
                    return Currency.getInstance("USD");
                }
            case 49:
                try {
                    Bundle bundle7 = ((C67884V0q) this.A01).mArguments;
                    if (bundle7 != null) {
                        num = AbstractC31179DnN.A0X(bundle7, "currency_offset");
                    } else {
                        num = null;
                    }
                } catch (Exception e3) {
                    ((C67884V0q) this.A01).A08 = e3;
                    i = 1;
                }
                if (num != null) {
                    i = num.intValue();
                    return Integer.valueOf(i);
                }
                throw AbstractC166997dE.A0g();
        }
        return Boolean.valueOf(z);
    }
}
