package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class KCB extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "NametagFragment";
    public RectF A00;
    public C177597ut A01;
    public NametagController A02;
    public C47955LGq A03;
    public LGZ A04;
    public EnumC33405Epc A05;
    public C3I9 A06;
    public C81I A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "nametag";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0S(view, R.id.nametag_container);
        C81I c81i = new C81I();
        registerLifecycleListener(c81i);
        Activity rootActivity = getRootActivity();
        C14360o3.A0A(rootActivity);
        UserSession A0r = AbstractC166987dD.A0r(this.A0D);
        String str2 = this.A0A;
        if (str2 == null) {
            str = AbstractC50529MSi.A00();
        } else {
            String str3 = this.A08;
            String str4 = this.A09;
            if (str4 == null) {
                str = "userId";
            } else {
                RectF rectF = this.A00;
                boolean z = this.A0C;
                boolean A1X = AbstractC167007dF.A1X(this.A05, EnumC33405Epc.A05);
                LGZ lgz = this.A04;
                if (lgz == null) {
                    str = "selfiePhotoManager";
                } else {
                    C47955LGq c47955LGq = this.A03;
                    if (c47955LGq == null) {
                        str = "backgroundImageManager";
                    } else {
                        C3I9 c3i9 = this.A06;
                        if (c3i9 == null) {
                            str = "keyboardHeightChangeDetector";
                        } else {
                            this.A02 = new NametagController(rootActivity, rectF, viewGroup, c47955LGq, lgz, this, this, A0r, c3i9, c81i, str2, str3, str4, z, A1X, this.A0B);
                            this.A07 = c81i;
                            this.A0C = false;
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        NametagController nametagController = this.A02;
        if (nametagController != null && nametagController.A05()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, X.7ut] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String id;
        int A02 = C0f9.A02(-864497071);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC09390do interfaceC09390do = this.A0D;
        AbstractC46618Kjv.A00(AbstractC166987dD.A0r(interfaceC09390do));
        if (requireArguments.containsKey("NametagFragment.ARGUMENT_USERNAME") && requireArguments.containsKey("NametagFragment.ARGUMENT_FULLNAME") && requireArguments.containsKey("NametagFragment.ARGUMENT_USER_ID")) {
            this.A0A = requireArguments.getString("NametagFragment.ARGUMENT_USERNAME", null);
            this.A08 = requireArguments.getString("NametagFragment.ARGUMENT_FULLNAME");
            id = requireArguments.getString("NametagFragment.ARGUMENT_USER_ID", "0");
        } else {
            User A0g = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do);
            this.A0A = A0g.getUsername();
            this.A08 = A0g.getFullName();
            id = A0g.getId();
        }
        this.A09 = id;
        boolean z = false;
        this.A0B = requireArguments.getBoolean(AbstractC111324zv.A00(657), false);
        this.A00 = (RectF) requireArguments.getParcelable("NametagFragment.ARGUMENT_ENTRY_VIEW_BOUNDS");
        Serializable serializable = requireArguments.getSerializable("NametagFragment.ARGUMENT_ENTRY_POINT");
        if (serializable != null) {
            this.A05 = (EnumC33405Epc) serializable;
            if (requireArguments.getBoolean("NametagFragment.ARGUMENT_SCAN_MODE", false)) {
                C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
                if (AbstractC167017dG.A1b(A0l, A0l.A44, C23031Ai.A8c, 102)) {
                    z = true;
                }
            }
            this.A0C = z;
            this.A04 = new LGZ(requireContext(), this, AbstractC166987dD.A0r(interfaceC09390do));
            this.A03 = new C47955LGq(requireContext(), this, AbstractC166987dD.A0r(interfaceC09390do));
            interfaceC09390do.getValue();
            this.A01 = new Object();
            C23031Ai A0l2 = AbstractC25230BEn.A0l(interfaceC09390do);
            AbstractC167007dF.A1L(A0l2, A0l2.A43, C23031Ai.A8c, 101, true);
            if (this.A01 != null) {
                AbstractC23451Ch.A07(requireContext(), "android.permission.CAMERA");
                AbstractC93174Ft.A03(requireContext());
            }
            this.A06 = C3I7.A01(this, false, false);
            AbstractC25230BEn.A0l(interfaceC09390do).A0u(C18U.A04(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36877787501953168L));
            C0f9.A09(-606948386, A02);
            return;
        }
        IllegalStateException A0g2 = AbstractC166997dE.A0g();
        C0f9.A09(1546048048, A02);
        throw A0g2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-227650954);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nametag_fragment_layout, viewGroup, false);
        C0f9.A09(-1119421440, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-383818236);
        super.onDestroy();
        C1QE.A01("instagram_nametag").A08();
        C0f9.A09(-932101942, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(351735999);
        super.onDestroyView();
        unregisterLifecycleListener(this.A07);
        C81I c81i = this.A07;
        if (c81i != null) {
            c81i.onDestroyView();
        }
        this.A07 = null;
        C0f9.A09(-1101982293, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1019405916);
        super.onResume();
        AbstractC31179DnN.A1J(this, 8);
        C0f9.A09(2076737403, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-78296061);
        super.onStart();
        C3I9 c3i9 = this.A06;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.Dnr(requireActivity());
        C0f9.A09(1356407061, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        Window window;
        int A02 = C0f9.A02(467056526);
        super.onStop();
        C3I9 c3i9 = this.A06;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.onStop();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            AbstractC56402iY.A07(window.getDecorView(), window, true);
            AbstractC31179DnN.A1J(this, 0);
            C0f9.A09(1790343534, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-1753015846, A02);
            throw A0g;
        }
    }
}
