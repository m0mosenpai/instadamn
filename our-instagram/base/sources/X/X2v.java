package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.forker.Process;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes11.dex */
public final class X2v extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2v(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC72021XFj interfaceC72021XFj;
        XFZ xfz;
        String str;
        InterfaceC72021XFj interfaceC72021XFj2;
        switch (this.A00) {
            case 0:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                return new C67984V4z(bundle);
            case 1:
                V0Y v0y = (V0Y) this.A01;
                return new W6E(v0y.getActivity(), v0y, V0Y.A01(v0y));
            case 2:
                return C70399WUb.A00(V0Y.A01((V0Y) this.A01));
            case 3:
            case 11:
                return InterfaceC72021XFj.A00((Fragment) this.A01);
            case 4:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return XFZ.A00((Fragment) this.A01);
            case 5:
                return V0Y.A00((V0Y) this.A01).A0y;
            case 6:
            case Process.SIGTERM /* 15 */:
            case Process.SIGSTOP /* 19 */:
            case 24:
            case 27:
            case 31:
            case 35:
            case 39:
            case 43:
            case 47:
                return this.A01;
            case 7:
            case 16:
            case 20:
            case 25:
            case 28:
            case 32:
            case 36:
            case 40:
            case 44:
            case 48:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 8:
            case 17:
            case 21:
            case 26:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 33:
            case 37:
            case Seq.NULL_REFNUM /* 41 */:
            case 45:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 9:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                return new C50856Mdn(abstractC59962oe.mArguments, abstractC59962oe, null, InterfaceC72021XFj.A00(abstractC59962oe), null, abstractC59962oe);
            case 10:
                Object obj = ((Fragment) this.A01).requireArguments().get(OptSvcAnalyticsStore.LOGGING_KEY_STEP);
                if (obj != null) {
                    return obj;
                }
                throw new IllegalStateException("screen information in extra should never be null");
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return C70399WUb.A00((UserSession) AbstractC166987dD.A17(((V0G) this.A01).A08));
            case 14:
                return ((PromoteData) AbstractC166987dD.A17(((V0G) this.A01).A05)).A0y;
            case 18:
                V1L v1l = (V1L) this.A01;
                Context requireContext = v1l.requireContext();
                UserSession userSession = v1l.A00;
                if (userSession != null) {
                    C1UC activity = v1l.getActivity();
                    if (activity instanceof InterfaceC72021XFj) {
                        interfaceC72021XFj = (InterfaceC72021XFj) activity;
                    } else {
                        interfaceC72021XFj = null;
                    }
                    if (interfaceC72021XFj != null) {
                        PromoteData BiY = interfaceC72021XFj.BiY();
                        C1UC activity2 = v1l.getActivity();
                        if ((activity2 instanceof XFZ) && (xfz = (XFZ) activity2) != null) {
                            return new V51(requireContext, BiY, xfz.Bia(), userSession);
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                C14360o3.A0F("session");
                throw C00O.createAndThrow();
            case 22:
                V0s v0s = (V0s) this.A01;
                UserSession userSession2 = (UserSession) v0s.A05.getValue();
                String str2 = v0s.A04;
                if (str2 == null) {
                    str = "mediaId";
                    break;
                } else {
                    String str3 = v0s.A02;
                    if (str3 == null) {
                        str = "accessToken";
                        break;
                    } else {
                        return new V50(userSession2, str2, str3);
                    }
                }
            case 23:
            case 30:
                AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A01;
                return new C50856Mdn(abstractC59962oe2.mArguments, abstractC59962oe2, null, InterfaceC72021XFj.A00(abstractC59962oe2), XFZ.A00(abstractC59962oe2), abstractC59962oe2);
            case 34:
            case 38:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                AbstractC59962oe abstractC59962oe3 = (AbstractC59962oe) this.A01;
                C1UC requireActivity = abstractC59962oe3.requireActivity();
                PromoteData promoteData = null;
                if ((requireActivity instanceof InterfaceC72021XFj) && (interfaceC72021XFj2 = (InterfaceC72021XFj) requireActivity) != null) {
                    promoteData = interfaceC72021XFj2.BiY();
                }
                return new C50856Mdn(abstractC59962oe3.mArguments, abstractC59962oe3, null, promoteData, null, abstractC59962oe3);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                KCI kci = (KCI) this.A01;
                UserSession userSession3 = kci.A04;
                if (userSession3 != null) {
                    PromoteData promoteData2 = kci.A03;
                    if (promoteData2 == null) {
                        str = "promoteData";
                        break;
                    } else {
                        String str4 = promoteData2.A1A;
                        C14360o3.A06(str4);
                        return new C45581KFv(userSession3, str4);
                    }
                } else {
                    str = "session";
                    break;
                }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
