package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214989fa extends C53Z implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectQuickPromotionCameraFragment";
    public C81Y A00;
    public RectF A01;
    public C81I A02;
    public final InterfaceC25214BDm A03 = new C23765Afc(this, 2);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.direct_quick_camera_container);
        C81I c81i = new C81I();
        this.A02 = c81i;
        registerLifecycleListener(c81i);
        C81J c81j = new C81J();
        InterfaceC25214BDm interfaceC25214BDm = this.A03;
        interfaceC25214BDm.getClass();
        c81j.A0l = interfaceC25214BDm;
        UserSession session = getSession();
        session.getClass();
        c81j.A0S = session;
        C81J.A03(requireActivity(), this, c81j);
        C81J.A0C(getSession(), C81O.A02, C208509Kk.A00, c81j);
        c81j.A3h = true;
        c81j.A0R = this.volumeKeyPressController;
        C81I c81i2 = this.A02;
        c81i2.getClass();
        c81j.A0t = c81i2;
        A0C.getClass();
        c81j.A09 = A0C;
        c81j.A0B = C22P.A2L;
        c81j.A0O = this;
        RectF rectF = this.A01;
        if (rectF == null) {
            C14360o3.A0F("animationBounds");
            throw C00O.createAndThrow();
        }
        c81j.A06 = rectF;
        c81j.A07 = rectF;
        c81j.A3r = false;
        c81j.A3v = false;
        c81j.A33 = false;
        c81j.A04 = 0L;
        c81j.A3H = true;
        c81j.A47 = true;
        c81j.A17 = new C81L(2131960569, 2131960569, false, true, true, true);
        c81j.A3N = true;
        c81j.A3M = true;
        c81j.A3L = true;
        c81j.A3Q = true;
        c81j.A0y = C81K.A02;
        this.A00 = new C81Y(c81j);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_quick_camera_fragment";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C81Y c81y = this.A00;
        if (c81y != null && c81y.A06()) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2029259934);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable(AbstractC43591JPw.A00(24));
        if (parcelable != null) {
            this.A01 = (RectF) parcelable;
            C0f9.A09(1011949400, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(568809842, A02);
            throw A0g;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(420692833);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_quick_camera_fragment_layout, viewGroup, false);
        C0f9.A09(105810072, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(678150476);
        super.onDestroyView();
        C81Y c81y = this.A00;
        if (c81y != null) {
            c81y.A00();
        }
        this.A00 = null;
        unregisterLifecycleListener(this.A02);
        C81I c81i = this.A02;
        C14360o3.A0A(c81i);
        c81i.onDestroyView();
        this.A02 = null;
        C0f9.A09(-1777327650, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1448068959);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null) {
            getSession();
            AbstractC65987Txg.A00(rootActivity);
            C0f9.A09(-1963634292, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-879061971, A02);
            throw A0g;
        }
    }
}
