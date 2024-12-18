package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;
import go.Seq;

/* renamed from: X.J8e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43207J8e extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43207J8e(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C43207J8e(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v91, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2pS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.INS, X.HYp] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Fragment fragment;
        Fragment fragment2;
        Fragment fragment3;
        Bundle requireArguments;
        String str2;
        int i;
        Fragment fragment4;
        Fragment fragment5;
        Fragment fragment6;
        EnumC39649Hie valueOf;
        String string;
        EnumC39650Hif valueOf2;
        String string2;
        EnumC39644HiZ valueOf3;
        String string3;
        EnumC39651Hig valueOf4;
        switch (this.A00) {
            case 0:
            case 18:
            case 36:
            case 43:
                return AbstractC167027dH.A0B(this.A01);
            case 1:
                requireArguments = AbstractC31179DnN.A04(this.A01);
                i = 1806;
                str2 = AbstractC111324zv.A00(i);
                return requireArguments.getString(str2);
            case 2:
                requireArguments = AbstractC31179DnN.A04(this.A01);
                i = 1807;
                str2 = AbstractC111324zv.A00(i);
                return requireArguments.getString(str2);
            case 3:
                return Float.valueOf(AbstractC13880nE.A01(((Fragment) this.A01).requireContext(), AbstractC13880nE.A09(r0.requireContext())));
            case 4:
                C66392zG A0R = AbstractC31174DnI.A0R((Fragment) this.A01);
                A0R.A01(new Object());
                return AbstractC31173DnH.A0R(A0R, new Object());
            case 5:
                C38933HCg c38933HCg = (C38933HCg) this.A01;
                return new C41619Ib9((EnumC39651Hig) c38933HCg.A0B.getValue(), (EnumC39644HiZ) c38933HCg.A0C.getValue(), (EnumC39650Hif) c38933HCg.A0D.getValue(), (EnumC39649Hie) c38933HCg.A0E.getValue(), c38933HCg, AbstractC166987dD.A0r(c38933HCg.A0F), c38933HCg, AbstractC25225BEi.A15(c38933HCg.A0G), AbstractC25225BEi.A15(c38933HCg.A09), AbstractC25225BEi.A15(c38933HCg.A0A));
            case 6:
                return new C43034J0z((C41619Ib9) ((C38933HCg) this.A01).A05.getValue());
            case 7:
                C38933HCg c38933HCg2 = (C38933HCg) this.A01;
                return new IMF(c38933HCg2, AbstractC166987dD.A0r(c38933HCg2.A0F), AbstractC25225BEi.A15(c38933HCg2.A09), ((EnumC39649Hie) c38933HCg2.A0E.getValue()).name(), ((EnumC39644HiZ) c38933HCg2.A0C.getValue()).name());
            case 8:
                fragment3 = (Fragment) this.A01;
                requireArguments = fragment3.requireArguments();
                str2 = "prior_module_name";
                return requireArguments.getString(str2);
            case 9:
                fragment2 = (Fragment) this.A01;
                requireArguments = fragment2.requireArguments();
                str2 = "prior_submodule_name";
                return requireArguments.getString(str2);
            case 10:
                C38933HCg c38933HCg3 = (C38933HCg) this.A01;
                FragmentActivity requireActivity = c38933HCg3.requireActivity();
                UserSession A0r = AbstractC166987dD.A0r(c38933HCg3.A0F);
                String A15 = AbstractC25225BEi.A15(c38933HCg3.A0G);
                c38933HCg3.A09.getValue();
                return new C41149IJo(requireActivity, c38933HCg3, A0r, c38933HCg3, (C41619Ib9) c38933HCg3.A05.getValue(), (IHH) c38933HCg3.A0J.getValue(), A15);
            case 11:
                fragment6 = (Fragment) this.A01;
                string3 = fragment6.requireArguments().getString("analytics_referral_component");
                if (string3 == null && (valueOf4 = EnumC39651Hig.valueOf(string3)) != null) {
                    return valueOf4;
                }
                return EnumC39651Hig.A0I;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                fragment5 = (Fragment) this.A01;
                string2 = fragment5.requireArguments().getString("analytics_referral_experience");
                if (string2 == null && (valueOf3 = EnumC39644HiZ.valueOf(string2)) != null) {
                    return valueOf3;
                }
                return EnumC39644HiZ.UNKNOWN;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                fragment4 = (Fragment) this.A01;
                string = fragment4.requireArguments().getString("analytics_referral_module");
                if (string == null && (valueOf2 = EnumC39650Hif.valueOf(string)) != null) {
                    return valueOf2;
                }
                return EnumC39650Hif.A0I;
            case 14:
                String string4 = AbstractC31179DnN.A04(this.A01).getString("analytics_referral_page");
                if (string4 != null && (valueOf = EnumC39649Hie.valueOf(string4)) != null) {
                    return valueOf;
                }
                return EnumC39649Hie.A0C;
            case Process.SIGTERM /* 15 */:
            case 47:
                fragment = (Fragment) this.A01;
                return AbstractC61112qZ.A00(fragment.mArguments);
            case 16:
            case 34:
            case Seq.NULL_REFNUM /* 41 */:
            case 48:
                return this.A01;
            case 17:
            case 35:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            default:
                return AbstractC25226BEj.A1C(this.A01);
            case Process.SIGSTOP /* 19 */:
                int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                C38933HCg c38933HCg4 = (C38933HCg) this.A01;
                Context requireContext = c38933HCg4.requireContext();
                String moduleName = c38933HCg4.getModuleName();
                InterfaceC09390do interfaceC09390do = c38933HCg4.A0F;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                interfaceC09390do.getValue();
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                return new C61582rL(requireContext, c006802i, A0r2, moduleName, 499007153);
            case 20:
                C38933HCg c38933HCg5 = (C38933HCg) this.A01;
                return new C39057HHh(AbstractC166987dD.A0r(c38933HCg5.A0F), (C61582rL) c38933HCg5.A0H.getValue(), (IMF) c38933HCg5.A08.getValue(), ShoppingReconFeedEndpoint.ReconDestinationFeedEndpoint.A00, AbstractC25225BEi.A15(c38933HCg5.A09), AbstractC25225BEi.A15(c38933HCg5.A0G));
            case 21:
                C38933HCg c38933HCg6 = (C38933HCg) this.A01;
                c38933HCg6.requireContext();
                return new IHH(AbstractC166987dD.A0r(c38933HCg6.A0F), (C57112jm) AbstractC166987dD.A17(c38933HCg6.A0K), (C41619Ib9) c38933HCg6.A05.getValue());
            case 22:
                throw AbstractC166987dD.A15("requireActivity");
            case 23:
                throw AbstractC166987dD.A15("session$delegate");
            case 24:
                throw AbstractC166987dD.A15("session$delegate");
            case 25:
                throw AbstractC166987dD.A15("requireArguments");
            case 26:
                fragment3 = null;
                requireArguments = fragment3.requireArguments();
                str2 = "prior_module_name";
                return requireArguments.getString(str2);
            case 27:
                fragment2 = null;
                requireArguments = fragment2.requireArguments();
                str2 = "prior_submodule_name";
                return requireArguments.getString(str2);
            case 28:
                fragment6 = null;
                string3 = fragment6.requireArguments().getString("analytics_referral_component");
                if (string3 == null) {
                    break;
                }
                return EnumC39651Hig.A0I;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                fragment5 = null;
                string2 = fragment5.requireArguments().getString("analytics_referral_experience");
                if (string2 == null) {
                    break;
                }
                return EnumC39644HiZ.UNKNOWN;
            case 30:
                fragment4 = null;
                string = fragment4.requireArguments().getString("analytics_referral_module");
                if (string == null) {
                    break;
                }
                return EnumC39650Hif.A0I;
            case 31:
                throw AbstractC166987dD.A15("requireArguments");
            case 32:
                fragment = null;
                return AbstractC61112qZ.A00(fragment.mArguments);
            case 33:
                throw AbstractC166987dD.A15("requireContext");
            case 37:
                HCE hce = (HCE) this.A01;
                InterfaceC09390do interfaceC09390do2 = hce.A0G;
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do2);
                String str3 = hce.A0D;
                if (str3 == null) {
                    str = "waterfallId";
                } else {
                    String str4 = hce.A0C;
                    if (str4 == null) {
                        str = "priorModule";
                    } else {
                        C14360o3.A0B(A0r3, 1);
                        return new HHY(hce.requireContext(), AbstractC018607g.A00(hce), AbstractC166987dD.A0r(interfaceC09390do2), new INS(A0r3, hce, str3, str4));
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 38:
                HCF hcf = (HCF) this.A01;
                C39325HYq c39325HYq = new C39325HYq(AbstractC166987dD.A0r(hcf.A09), hcf, AbstractC25225BEi.A15(hcf.A0B), AbstractC25225BEi.A15(hcf.A07));
                ((INS) c39325HYq).A01 = "products";
                return c39325HYq;
            case 39:
                return AbstractC153636vY.A01(AbstractC31179DnN.A04(this.A01), "prior_module");
            case 40:
                HCF hcf2 = (HCF) this.A01;
                return new IFJ(hcf2.requireContext(), hcf2, hcf2.A03, hcf2.A04, hcf2.A00, hcf2.A05);
            case 44:
                HCF hcf3 = (HCF) this.A01;
                return new HHZ(hcf3.requireContext(), AbstractC018607g.A00(hcf3), AbstractC166987dD.A0r(hcf3.A09), (C39325HYq) hcf3.A06.getValue());
            case 45:
                return AbstractC153636vY.A01(AbstractC31179DnN.A04(this.A01), "waterfall_id");
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                ?? obj = new Object();
                C38906HBd c38906HBd = (C38906HBd) this.A01;
                return new C154716xM(AbstractC166987dD.A0r(c38906HBd.A03), c38906HBd.A01, obj);
        }
    }
}
