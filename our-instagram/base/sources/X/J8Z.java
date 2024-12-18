package X;

import android.content.Context;
import android.os.PowerManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes7.dex */
public final class J8Z extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8Z(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C17050sx A00(Object obj, int i) {
        return AbstractC09440dt.A01(new J8Z(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        InterfaceC16820sZ interfaceC16820sZ;
        long A01;
        int A012;
        String str2;
        C52134N5i c52134N5i;
        C50870Me1 A00;
        C38321qM A0h;
        C3x9 A0u;
        switch (this.A00) {
            case 0:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 1:
                return Boolean.valueOf(AbstractC25225BEi.A1Y(AbstractC001900j.A0B(((BX7) this.A01).A00())));
            case 2:
                interfaceC16820sZ = ((C26563BoM) this.A01).A02;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 3:
                PowerManager.WakeLock newWakeLock = ((C54812OKl) this.A01).A01.newWakeLock(32, "ProximitySensorManager:ProximitySensor");
                C0BX.A02(newWakeLock, "ProximitySensorManager:ProximitySensor");
                return newWakeLock;
            case 4:
                C26711Bqs c26711Bqs = (C26711Bqs) this.A01;
                return c26711Bqs.requireArguments().getString(c26711Bqs.A01);
            case 5:
                C37700Gib c37700Gib = (C37700Gib) this.A01;
                c37700Gib.A03.DGn(new C85633rs(null, null, null, null, null, null, null, null, c37700Gib.A0d, false, false, false, false));
                return C0eB.A00;
            case 6:
                C37700Gib c37700Gib2 = (C37700Gib) this.A01;
                UserSession userSession = c37700Gib2.A0Q;
                if (C18U.A06(C06090Tz.A06, userSession, 36319209822821414L)) {
                    return new C37702Gid(c37700Gib2.A0M, c37700Gib2.A0O, c37700Gib2.A0P, userSession, c37700Gib2.A0S, c37700Gib2.A04, c37700Gib2.A0X, c37700Gib2.A0W, new J8Z(c37700Gib2, 5));
                }
                return null;
            case 7:
                return AbstractC37654Ghn.A01(((C37700Gib) this.A01).A0Q);
            case 8:
                return new C37695GiW((UserSession) this.A01);
            case 9:
                return C006802i.A0p;
            case 10:
                C38229GrY c38229GrY = (C38229GrY) this.A01;
                return new C38231Gra(c38229GrY.A01, c38229GrY.A02, c38229GrY.A04);
            case 11:
                C38229GrY c38229GrY2 = (C38229GrY) this.A01;
                return new C38233Grc(c38229GrY2.A01, c38229GrY2.A02, c38229GrY2.A04);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C38229GrY c38229GrY3 = (C38229GrY) this.A01;
                return new C38232Grb(c38229GrY3.A00, c38229GrY3.A01, c38229GrY3.A02, c38229GrY3.A03);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC37654Ghn.A01(((C37533Gfp) this.A01).A03);
            case 14:
                C42153Im1 c42153Im1 = (C42153Im1) this.A01;
                return new C42384Ipl(c42153Im1.A00, c42153Im1.A03);
            case Process.SIGTERM /* 15 */:
                C42153Im1 c42153Im12 = (C42153Im1) this.A01;
                return new HK0(c42153Im12.A00, c42153Im12.A01, c42153Im12.A02, c42153Im12.A03, c42153Im12.A04);
            case 16:
                C42153Im1 c42153Im13 = (C42153Im1) this.A01;
                return new HK3(c42153Im13.A00, c42153Im13.A02, c42153Im13.A04);
            case 17:
                UserSession userSession2 = ((IKW) this.A01).A04;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession2, 36316117446168575L)) {
                    return EnumC125615m7.A04;
                }
                if (C18U.A06(c06090Tz, userSession2, 36316117446365186L)) {
                    return EnumC125615m7.A02;
                }
                return EnumC125615m7.A03;
            case 18:
                ((AbstractC153666vb) this.A01).A04.A02.clear();
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                C38335GtV c38335GtV = (C38335GtV) this.A01;
                String str3 = c38335GtV.A0E;
                if (str3 == null || (A0h = AbstractC25229BEm.A0h(c38335GtV.A0A, str3)) == null || (A0u = AbstractC25226BEj.A0u(A0h)) == null) {
                    return null;
                }
                return AbstractC117245Sj.A01(A0u);
            case 20:
                return new Object[((InterfaceC19390xP[]) this.A01).length];
            case 21:
                N4X n4x = (N4X) this.A01;
                Context requireContext = n4x.requireContext();
                UserSession A0r = AbstractC166987dD.A0r(n4x.A07);
                String str4 = n4x.A02;
                if (str4 == null) {
                    str2 = "musicBrowseSessionId";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                return new C56303OzO(requireContext, n4x, A0r, new O6N(n4x), str4);
            case 22:
                N4X n4x2 = (N4X) this.A01;
                return new NDP(n4x2.requireActivity(), AbstractC166987dD.A0r(n4x2.A07), (AudioOverlayTrack) n4x2.requireArguments().getParcelable(AbstractC43591JPw.A00(1310)), AbstractC153636vY.A02(n4x2.requireArguments(), Medium.class, MSV.A00(1584)));
            case 23:
                Fragment fragment = ((Fragment) this.A01).mParentFragment;
                if ((fragment instanceof C52134N5i) && (c52134N5i = (C52134N5i) fragment) != null && (A00 = A35.A00(c52134N5i)) != null) {
                    return A00;
                }
                throw AbstractC166987dD.A14("Invalid parent fragment for AudioPickerFragment");
            case 24:
            case 30:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return this.A01;
            case 25:
            case 31:
            case 43:
                return AbstractC25226BEj.A1C(this.A01);
            case 26:
            case 32:
            case 44:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 27:
                N4X n4x3 = new N4X();
                n4x3.setArguments(AbstractC31179DnN.A04(this.A01));
                return n4x3;
            case 28:
                return A35.A00((C52134N5i) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C38337GtX c38337GtX = ((C45507KCw) this.A01).A04;
                if (c38337GtX == null) {
                    str2 = "adapter";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                c38337GtX.A05();
                return C0eB.A00;
            case 33:
                C45507KCw c45507KCw = (C45507KCw) this.A01;
                return new C52316NDf(AbstractC25231BEo.A0L(c45507KCw), c45507KCw.A01, AbstractC166987dD.A0r(c45507KCw.A0A), c45507KCw.A05, c45507KCw.A07, c45507KCw.A06);
            case 34:
                return new HYD((UserSession) this.A01);
            case 35:
                UserSession userSession3 = ((HYD) this.A01).A01;
                A01 = C18U.A01(AbstractC166997dE.A0U(userSession3), userSession3, 36609931864053754L);
                if (A01 == 0) {
                    A012 = 10;
                    return Integer.valueOf(A012);
                }
                A012 = (int) A01;
                return Integer.valueOf(A012);
            case 36:
                HYD hyd = (HYD) this.A01;
                UserSession userSession4 = hyd.A01;
                A01 = C18U.A01(AbstractC166997dE.A0U(userSession4), userSession4, 36609931863922681L);
                if (A01 == 0) {
                    A012 = AbstractC167027dH.A01(hyd.A02);
                    return Integer.valueOf(A012);
                }
                A012 = (int) A01;
                return Integer.valueOf(A012);
            case 37:
                AudioFilterType audioFilterType = ((C26369BlE) this.A01).A00;
                if (audioFilterType != null) {
                    return audioFilterType;
                }
                return AudioFilterType.A0A;
            case 38:
                interfaceC16820sZ = ((ICW) this.A01).A00;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 39:
                InterfaceC19610xo A0g = AbstractC167017dG.A0g(((C37420Ge0) this.A01).A01.A01, "blend_direct_thread_nux_seen_count");
                A0g.E7G("blend_direct_thread_nux_last_shown_time_ms", System.currentTimeMillis());
                A0g.apply();
                return C0eB.A00;
            case 40:
                IHX ihx = (IHX) this.A01;
                View inflate = LayoutInflater.from(ihx.A00).inflate(R.layout.direct_dismissable_image_nux_banner, (ViewGroup) null);
                C14360o3.A07(inflate);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
                AbstractC166997dE.A19(imageView.getContext(), imageView, R.drawable.instagram_icons_exceptions_illo_blend_refresh_outline_96);
                TextView A0e = AbstractC166987dD.A0e(inflate, R.id.title);
                AbstractC166987dD.A1P(A0e.getContext(), A0e, 2131955356);
                TextView A0e2 = AbstractC166987dD.A0e(inflate, R.id.message);
                AbstractC166987dD.A1P(A0e2.getContext(), A0e2, 2131955355);
                ViewOnClickListenerC42035Ik4.A01(inflate.findViewById(R.id.dismiss_button), 65, ihx);
                return inflate;
            case Seq.NULL_REFNUM /* 41 */:
                C25842Bbx c25842Bbx = (C25842Bbx) ((C26741BrM) this.A01).A09.getValue();
                InterfaceC57806PkY interfaceC57806PkY = (InterfaceC57806PkY) c25842Bbx.A00.A04.getValue();
                if (MU9.A01(interfaceC57806PkY, 1)) {
                    str = ((C51701MsW) ((MU9) interfaceC57806PkY).A01).A04;
                } else {
                    str = null;
                }
                AbstractC166987dD.A1Z(new PXV(c25842Bbx, str, null, 6), AbstractC141776au.A00(c25842Bbx));
                return C0eB.A00;
            case 45:
                C26741BrM c26741BrM = (C26741BrM) this.A01;
                return new C39059HHj(AbstractC166987dD.A0r(c26741BrM.A06), AbstractC25225BEi.A15(c26741BrM.A08), AbstractC25225BEi.A15(c26741BrM.A00), AbstractC25225BEi.A15(c26741BrM.A02), AbstractC25225BEi.A15(c26741BrM.A03), AbstractC25225BEi.A15(c26741BrM.A05), AbstractC167007dF.A1Z(c26741BrM.A07), AbstractC167007dF.A1Z(c26741BrM.A04));
            case 47:
                ((InterfaceC74953Yl) this.A01).Egh(C6F.A02);
                return C0eB.A00;
            case 48:
                ((Fragment) this.A01).requireActivity().getOnBackPressedDispatcher().A04();
                return C0eB.A00;
            case 49:
                ((C27911CRw) this.A01).A01.F8m(EnumC27388C6r.A04);
                return C0eB.A00;
        }
    }
}
