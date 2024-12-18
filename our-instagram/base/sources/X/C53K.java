package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import java.lang.ref.WeakReference;

/* renamed from: X.53K, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C53K extends UserDetailFragment {
    public static final String __redex_internal_original_name = "SelfFragment";
    public C3CZ A00;
    public C151696sF A01;
    public final C53O A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC41501vz A07;
    public final InterfaceC41501vz A08;
    public final InterfaceC41501vz A09;
    public final C36118Fws A0A;

    @Override // com.instagram.profile.fragment.UserDetailFragment, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C3CZ c3cz = this.A00;
        if (c3cz == null) {
            C14360o3.A0F("updateProfilePictureHelper");
            throw C00O.createAndThrow();
        }
        c3cz.A08(intent, i, i2, false);
        if (i == 1111 && i2 == -1) {
            AbstractC151826sS.A01(requireContext(), intent, (UserSession) this.A06.getValue(), new GSZ(this), new C37008GSa(this), new GSk(this));
        }
    }

    @Override // com.instagram.profile.fragment.UserDetailFragment, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A06;
        Object value = interfaceC09390do.getValue();
        requireActivity();
        C14360o3.A0B(value, 1);
        AbstractC151786sO.A01 = true;
        C60852q9 c60852q9 = (C60852q9) this.A05.getValue();
        Context requireContext = requireContext();
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C3CZ c3cz = this.A00;
        if (c3cz == null) {
            str2 = "updateProfilePictureHelper";
        } else {
            C151696sF c151696sF = this.A01;
            if (c151696sF == null) {
                str2 = "editProfileAvatarHandler";
            } else {
                C151796sP c151796sP = new C151796sP(this);
                AbstractC151826sS.A02(requireContext, viewLifecycleOwner, c3cz, c60852q9, userSession, c151696sF, "ig_self_profile", new C151816sR(this), new C31472DsG(this), new C151806sQ(this), c151796sP);
                if (!AbstractC31248DoW.A05((UserSession) interfaceC09390do.getValue())) {
                    C20Y.A00((UserSession) interfaceC09390do.getValue()).A04(new C206969Eb(this, 42));
                }
                AbstractC25651Mw.A00((AbstractC12990ll) interfaceC09390do.getValue()).A01(this.A07, C3HX.class);
                UserSession userSession2 = (UserSession) interfaceC09390do.getValue();
                FragmentActivity requireActivity = requireActivity();
                C14360o3.A0B(userSession2, 0);
                if (AbstractC151856sV.A00 && C18U.A06(C06090Tz.A06, userSession2, 36328525606829674L)) {
                    String str3 = "control_group";
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (!C18U.A06(c06090Tz, userSession2, 36328525606698600L) && !C18U.A06(c06090Tz, userSession2, 36328525606764137L)) {
                        str = "515473607779528";
                    } else {
                        str3 = "test_group";
                        str = "1534085557478153";
                    }
                    FWZ.A01(userSession2, C05F.A0u, C05F.A0N, str3);
                    C1VN c1vn = C1VN.A00;
                    if (c1vn != null) {
                        c1vn.A02(userSession2, requireActivity, str);
                    }
                    AbstractC151856sV.A00 = false;
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public C53K() {
        C0YZ c0yz = new C0YZ(C60852q9.class);
        this.A05 = new C60842q8(new C9EY(this, 26), new C9EY(this, 27), new C9F7(1, null, this), c0yz);
        C0YZ c0yz2 = new C0YZ(C31476DsK.class);
        this.A04 = new C60842q8(new C9EY(this, 28), new C9EY(this, 29), new C9F7(2, null, this), c0yz2);
        C9EY c9ey = new C9EY(this, 21);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EY(new C9EY(this, 30), 31));
        this.A03 = new C60842q8(new C9EY(A00, 32), c9ey, new C9F7(3, null, A00), new C0YZ(C31475DsJ.class));
        this.A08 = new C36147FxL(this);
        this.A07 = new C56028Otz(this);
        this.A09 = new C36148FxM(this);
        this.A0A = new C36118Fws(this);
        this.A02 = new C35908FtS(this);
    }

    @Override // com.instagram.profile.fragment.UserDetailFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int i2;
        int A02 = C0f9.A02(-253821101);
        C206969Eb c206969Eb = new C206969Eb(this, 41);
        boolean z = C3CZ.A0F;
        InterfaceC09390do interfaceC09390do = this.A06;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 != null) {
            this.A00 = new C3CZ(this, abstractC10360h2, null, userSession, C17060sy.A01.A01((UserSession) interfaceC09390do.getValue()), C05F.A0r, c206969Eb);
            super.onCreate(bundle);
            UserSession userSession2 = (UserSession) interfaceC09390do.getValue();
            this.A01 = new C151696sF(requireContext(), null, null, this, userSession2, null, null, new WeakReference(requireActivity()), new WeakReference(this), null, null, new C9EY(this, 22), new C9EY(this, 23), null, new C31471DsF(this));
            C1UC activity = getActivity();
            if (activity instanceof InterfaceC53722dB) {
                UserDetailTabController userDetailTabController = this.A0z;
                C14360o3.A0C(activity, "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgMainActivityLegacy");
                C54212eX c54212eX = ((InstagramMainActivity) ((InterfaceC53722dB) activity)).A08;
                if (c54212eX != null) {
                    i2 = c54212eX.A00;
                } else {
                    i2 = 0;
                }
                userDetailTabController.A0J(i2);
            }
            C25671My A00 = AbstractC25651Mw.A00((AbstractC12990ll) interfaceC09390do.getValue());
            A00.A01(this.A0A, C151736sJ.class);
            A00.A01(this.A08, C71883Kl.class);
            if (C18U.A06(C06090Tz.A06, (AbstractC12990ll) interfaceC09390do.getValue(), 36312350759978035L)) {
                AbstractC25651Mw.A00((AbstractC12990ll) interfaceC09390do.getValue()).A01(this.A09, C151746sK.class);
            }
            Parcelable parcelable = requireArguments().getParcelable("ProfileLaunchConstants.LAUNCH_CONFIG");
            if (parcelable != null) {
                if (((UserDetailLaunchConfig) parcelable).A0U) {
                    C3CZ c3cz = this.A00;
                    if (c3cz == null) {
                        C14360o3.A0F("updateProfilePictureHelper");
                        throw C00O.createAndThrow();
                    }
                    C3CZ.A00(requireContext(), c3cz, false);
                }
                C0f9.A09(-1143101934, A02);
                return;
            }
            illegalStateException = new IllegalStateException("Required value was null.");
            i = 70253064;
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -2059992898;
        }
        C0f9.A09(i, A02);
        throw illegalStateException;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
        if (onCreateAnimation == null) {
            int i3 = C2U8.A00;
            return null;
        }
        return onCreateAnimation;
    }

    @Override // com.instagram.profile.fragment.UserDetailFragment, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1168884896);
        super.onDestroy();
        InterfaceC09390do interfaceC09390do = this.A06;
        C25671My A00 = AbstractC25651Mw.A00((AbstractC12990ll) interfaceC09390do.getValue());
        A00.A02(this.A08, C71883Kl.class);
        A00.A02(this.A0A, C151736sJ.class);
        if (C18U.A06(C06090Tz.A06, (AbstractC12990ll) interfaceC09390do.getValue(), 36312350759978035L)) {
            AbstractC25651Mw.A00((AbstractC12990ll) interfaceC09390do.getValue()).A02(this.A09, C151746sK.class);
        }
        AbstractC33575Esn.A00 = null;
        C0f9.A09(-987875594, A02);
    }

    @Override // com.instagram.profile.fragment.UserDetailFragment, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1865351082);
        super.onDestroyView();
        InterfaceC09390do interfaceC09390do = this.A06;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        FragmentActivity requireActivity = requireActivity();
        C14360o3.A0B(userSession, 1);
        AbstractC151786sO.A01 = false;
        AbstractC151786sO.A00(requireActivity, userSession);
        AbstractC25651Mw.A00((AbstractC12990ll) interfaceC09390do.getValue()).A02(this.A07, C3HX.class);
        C0f9.A09(-1160771870, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
    @Override // com.instagram.profile.fragment.UserDetailFragment, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1720765253);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A06;
        AbstractC25651Mw.A00((AbstractC12990ll) interfaceC09390do.getValue()).E4s(new Object());
        C3CZ c3cz = this.A00;
        if (c3cz != null) {
            c3cz.A03();
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) interfaceC09390do.getValue();
            C14360o3.A0B(abstractC12990ll, 0);
            C152146sz c152146sz = (C152146sz) abstractC12990ll.A01(C152146sz.class, new C50152MDf(abstractC12990ll, 27));
            if (c152146sz.A00()) {
                if (this.A00 != null) {
                    if (C3CZ.A0F) {
                        C3CZ.A0F = false;
                        UserSession userSession = (UserSession) interfaceC09390do.getValue();
                        C14360o3.A0B(userSession, 0);
                        new Handler(Looper.getMainLooper()).postDelayed(new PSX(this, userSession, c152146sz), 1000L);
                    }
                }
            }
            C0f9.A09(-2014267395, A02);
            return;
        }
        C14360o3.A0F("updateProfilePictureHelper");
        throw C00O.createAndThrow();
    }
}
