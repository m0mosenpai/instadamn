package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class GSv extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSv(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C26742BrO c26742BrO;
        boolean z;
        String string;
        switch (this.A00) {
            case 0:
            case 8:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGSTOP /* 19 */:
            case 23:
            case 28:
            case Seq.NULL_REFNUM /* 41 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 1:
            case 9:
            case 14:
            case 20:
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 2:
                return new C156296zz(C12L.A00, new FanClubApi((UserSession) this.A01));
            case 3:
                c26742BrO = (C26742BrO) this.A01;
                z = true;
                C26742BrO.A00(c26742BrO, z);
                return C0eB.A00;
            case 4:
                c26742BrO = (C26742BrO) this.A01;
                z = false;
                C26742BrO.A00(c26742BrO, z);
                return C0eB.A00;
            case 5:
                C26742BrO c26742BrO2 = (C26742BrO) this.A01;
                Bundle bundle = c26742BrO2.mArguments;
                if (bundle != null && (string = bundle.getString(AbstractC111324zv.A00(1214))) != null) {
                    return C1OU.A04(AbstractC166987dD.A0r(c26742BrO2.A02)).A0M(string);
                }
                return null;
            case 6:
                C26742BrO c26742BrO3 = (C26742BrO) this.A01;
                return new OI5(c26742BrO3, AbstractC166987dD.A0r(c26742BrO3.A02));
            case 7:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 18:
            case 22:
            case 27:
            case 40:
                return this.A01;
            case 10:
                return new C27000Bvf(AbstractC166987dD.A0r(((C26742BrO) this.A01).A02));
            case 11:
                return AbstractC154876xc.A00(AbstractC166987dD.A0r(((EMH) this.A01).A04));
            case Process.SIGTERM /* 15 */:
                EMH emh = (EMH) this.A01;
                Bundle requireArguments = emh.requireArguments();
                String A01 = AbstractC153636vY.A01(requireArguments, "ProfileTabbedExplorerFragment.USER_ID");
                String A012 = AbstractC153636vY.A01(requireArguments, AbstractC111324zv.A00(666));
                return new EWY(AbstractC166987dD.A0r(emh.A04), EnumC33379EpC.valueOf(A012), A01, AbstractC31172DnG.A1X(requireArguments, "ProfileTabbedExplorerFragment.ONLY_SHOW_SELECTED_TAB"));
            case 16:
                UserSession userSession = ((MUB) this.A01).A0A;
                C14360o3.A0B(userSession, 0);
                return userSession.A01(NSM.class, new C50157MDk(userSession, 20));
            case 17:
                return ((C8CV) this.A01).A00();
            case 21:
                C32339EMl c32339EMl = (C32339EMl) this.A01;
                return new EWD(AbstractC166987dD.A0r(c32339EMl.A02), AbstractC153636vY.A01(c32339EMl.requireArguments(), "ProfileMultipleAddressesBottomsheetFragment.USER_ID"));
            case 25:
                ArrayList parcelableArrayList = AbstractC31179DnN.A04(this.A01).getParcelableArrayList("address_list_key");
                if (parcelableArrayList != null) {
                    return new C32571EVw(parcelableArrayList);
                }
                throw AbstractC166997dE.A0g();
            case 26:
                return FAE.A00(AbstractC166987dD.A0r(((C26768Brp) this.A01).A03));
            case 30:
                return new C32572EVx(AbstractC166987dD.A0r(((C26768Brp) this.A01).A03));
            case 31:
            case 32:
                ((C25849Bc4) this.A01).A01.A0A(C1Z.A00);
                return C0eB.A00;
            case 33:
                return new C36291Fzl((UserSession) this.A01);
            case 34:
                Drawable drawable = AbstractC31172DnG.A07(this.A01).getDrawable(R.drawable.account_link_recyclerview_divider);
                if (drawable != null) {
                    return drawable;
                }
                throw AbstractC166997dE.A0g();
            case 35:
                C32287EJz c32287EJz = (C32287EJz) this.A01;
                AbstractC35216Fg9.A04(new GSg(c32287EJz, 22), AbstractC166987dD.A0r(c32287EJz.A0B));
                return null;
            case 36:
                C32287EJz c32287EJz2 = (C32287EJz) this.A01;
                AbstractC35216Fg9.A04(new GSg(c32287EJz2, 23), AbstractC166987dD.A0r(c32287EJz2.A0B));
                return null;
            case 37:
                return AbstractC155496ye.A00(AbstractC166987dD.A0r(((C32277EJm) this.A01).A09));
            case 38:
                return AbstractC31176DnK.A0Q(((C32277EJm) this.A01).A09);
            case 39:
                return AbstractC31176DnK.A0g(C17060sy.A01, ((C32277EJm) this.A01).A09);
            case 43:
                EJK ejk = (EJK) this.A01;
                return new EWE(AbstractC25231BEo.A0L(ejk), AbstractC166987dD.A0r(ejk.A05));
            case 44:
                C006802i c006802i = (C006802i) this.A01;
                C14360o3.A0A(c006802i);
                return new C154736xO(c006802i);
            case 45:
                final UserSession userSession2 = (UserSession) this.A01;
                return new Object(userSession2) { // from class: X.6t9
                    public final UserSession A00;

                    {
                        C14360o3.A0B(userSession2, 1);
                        this.A00 = userSession2;
                        C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                        A00.A4c.CES(A00, C23031Ai.A8c[160]);
                    }
                };
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C52156N6i c52156N6i = (C52156N6i) this.A01;
                return new C54443O3x(c52156N6i.requireContext(), c52156N6i, c52156N6i.A00);
            case 47:
                C52156N6i c52156N6i2 = (C52156N6i) this.A01;
                return AbstractC69933Cc.A00(c52156N6i2.requireActivity(), AbstractC166987dD.A0r(c52156N6i2.A05), new C36324G0t(c52156N6i2, 3));
            case 48:
                return AbstractC31179DnN.A04(this.A01).getString(AbstractC111324zv.A00(1494));
            case 49:
                C52156N6i c52156N6i3 = (C52156N6i) this.A01;
                return new C75H(c52156N6i3.requireContext(), AbstractC166987dD.A0r(c52156N6i3.A05));
        }
    }
}
