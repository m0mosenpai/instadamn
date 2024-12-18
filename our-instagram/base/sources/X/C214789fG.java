package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9fG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214789fG extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectConversationStarterCameraFragment";
    public C81Y A01;
    public C81I A02;
    public C22P A00 = C22P.A03;
    public final InterfaceC25214BDm A03 = new C23764Afb(3);
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        C81I c81i = new C81I();
        this.A02 = c81i;
        registerLifecycleListener(c81i);
        this.A00 = AbstractC167027dH.A0D(requireArguments, AbstractC111324zv.A00(1570));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.direct_quick_camera_container);
        C81J c81j = new C81J();
        InterfaceC25214BDm interfaceC25214BDm = this.A03;
        interfaceC25214BDm.getClass();
        c81j.A0l = interfaceC25214BDm;
        InterfaceC09390do interfaceC09390do = this.A04;
        C81J.A0L(c81j, interfaceC09390do);
        C81J.A03(getRootActivity(), this, c81j);
        C81P c81p = C81O.A02;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        C81T c81t = C81T.A00;
        C81J.A0C(userSession, c81p, c81t, c81j);
        c81j.A3h = true;
        c81j.A0R = this.volumeKeyPressController;
        C81I c81i2 = this.A02;
        c81i2.getClass();
        c81j.A0t = c81i2;
        viewGroup.getClass();
        c81j.A09 = viewGroup;
        c81j.A0B = this.A00;
        c81j.A0O = this;
        c81j.A3H = true;
        c81j.A3Q = true;
        c81j.A3G = true;
        c81j.A3i = true;
        c81j.A3t = false;
        c81j.A3s = true;
        c81j.A44 = false;
        c81j.A47 = true;
        c81j.A3L = false;
        c81j.A03 = 8;
        c81j.A28 = C05F.A00;
        c81j.A0V = C82R.A00(c81t, new C81W[0]);
        c81j.A3J = true;
        Window window = requireActivity().getWindow();
        C14360o3.A07(window);
        AbstractC56402iY.A07(AbstractC43592JPx.A08(requireActivity()), window, false);
        AbstractC167007dF.A0z(this, new RunnableC24678AwJ(c81j, this));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A04.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C81Y c81y = this.A01;
        if (c81y == null || !c81y.A06()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1215747448);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_quick_camera_fragment_layout, viewGroup, false);
        C0f9.A09(-872069539, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(927119031);
        Window window = requireActivity().getWindow();
        C14360o3.A07(window);
        AbstractC56402iY.A07(AbstractC43592JPx.A08(requireActivity()), window, true);
        super.onDestroyView();
        this.A01 = null;
        unregisterLifecycleListener(this.A02);
        C81I c81i = this.A02;
        if (c81i != null) {
            c81i.onDestroyView();
        }
        this.A02 = null;
        C0f9.A09(86724197, A02);
    }
}
