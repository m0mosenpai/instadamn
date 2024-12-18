package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes11.dex */
public final class X55 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X55(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new X55(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                interfaceC09390do = ((N5O) this.A01).A0A;
                break;
            case 1:
                V11 v11 = (V11) this.A01;
                return new W6E(v11.requireActivity(), v11, (UserSession) v11.A0N.getValue());
            case 2:
                return new C67968V4h((V11) this.A01);
            case 3:
                V11 v112 = (V11) this.A01;
                return new V26(v112.A03, v112, 7);
            case 4:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 26:
            case 40:
                return InterfaceC72021XFj.A00((Fragment) this.A01);
            case 5:
            case 14:
            case 28:
            case Seq.NULL_REFNUM /* 41 */:
                return XFZ.A00((Fragment) this.A01);
            case 6:
                AbstractC12990ll A0M = AbstractC31178DnM.A0M(((V11) this.A01).A0N);
                return A0M.A01(C70813WhW.class, new C50163MDq(A0M, 42));
            case 7:
                V11 v113 = (V11) this.A01;
                UserSession userSession = V11.A00(v113).A0y;
                if (userSession != null) {
                    return userSession;
                }
                return v113.A0K.getValue();
            case 8:
            case 31:
            case 34:
            case 36:
            case 45:
            default:
                return ((Fragment) this.A01).requireActivity().getViewModelStore();
            case 9:
            case 32:
            case 35:
            case 37:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                return new C67984V4z(bundle);
            case 10:
                return VRC.A00((UserSession) ((C67871V0c) this.A01).A0I.getValue());
            case 11:
                interfaceC09390do = ((C67871V0c) this.A01).A0I;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C67871V0c c67871V0c = (C67871V0c) this.A01;
                return new W6E(c67871V0c.requireActivity(), c67871V0c, C67871V0c.A00(c67871V0c).A0y);
            case Process.SIGTERM /* 15 */:
                V0Q v0q = (V0Q) this.A01;
                return new C69785VvQ(v0q.requireContext(), v0q, (UserSession) v0q.A0C.getValue());
            case 16:
                return VRC.A00((UserSession) ((V0Q) this.A01).A0C.getValue());
            case 17:
                return new C66081TzI(this.A01, 15);
            case 18:
                return new C66412UGg((AbstractC59962oe) this.A01);
            case Process.SIGSTOP /* 19 */:
                return this.A01;
            case 20:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 21:
                return AbstractC167027dH.A0B(this.A01);
            case 22:
                return new C67980V4v((UserSession) ((V0Q) this.A01).A0C.getValue());
            case 23:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                if (bundle2 != null) {
                    return bundle2.getString("audience_id");
                }
                return null;
            case 24:
                if (((C67872V0d) this.A01).A0V.getValue() != null) {
                    return VG4.A0e;
                }
                return VG4.A0X;
            case 25:
                C67872V0d c67872V0d = (C67872V0d) this.A01;
                return new W6E(c67872V0d.getActivity(), c67872V0d, (UserSession) AbstractC166987dD.A17(c67872V0d.A0b));
            case 27:
                return C70399WUb.A00((UserSession) AbstractC166987dD.A17(((C67872V0d) this.A01).A0b));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((PromoteData) AbstractC166987dD.A17(((C67872V0d) this.A01).A0Y)).A0y;
            case 30:
                interfaceC09390do = ((C6QR) this.A01).A0S;
                break;
            case 33:
                interfaceC09390do = ((V0O) this.A01).A0E;
                break;
            case 38:
                C67875V0g c67875V0g = (C67875V0g) this.A01;
                return new C68955Vet(c67875V0g.requireActivity(), c67875V0g, (UserSession) AbstractC166987dD.A17(c67875V0g.A0G));
            case 39:
                return C70399WUb.A00((UserSession) AbstractC166987dD.A17(((C67875V0g) this.A01).A0G));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return ((PromoteData) AbstractC166987dD.A17(((C67875V0g) this.A01).A0E)).A0y;
            case 43:
                V04 v04 = (V04) this.A01;
                FragmentActivity activity = v04.getActivity();
                if (activity != null) {
                    return new C68955Vet(activity, v04, (UserSession) v04.A0A.getValue());
                }
                return null;
            case 44:
                interfaceC09390do = ((V04) this.A01).A0A;
                break;
            case 47:
                UserSession userSession2 = ((V0Z) this.A01).A03;
                if (userSession2 != null) {
                    return C70399WUb.A00(userSession2);
                }
                C14360o3.A0F("session");
                throw C00O.createAndThrow();
            case 48:
                interfaceC09390do = ((V0F) this.A01).A02;
                break;
        }
        return AbstractC43594JPz.A0N(interfaceC09390do);
    }
}
