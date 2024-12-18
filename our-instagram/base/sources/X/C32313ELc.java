package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.ELc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32313ELc extends AbstractC59962oe implements InterfaceC60072op, InterfaceC37291Gbs {
    public static final String __redex_internal_original_name = "DirectThreadBottomSheetFragmentImpl";
    public C3DN A00;
    public C3DN A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_thread_toggle";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            super.onViewCreated(r6, r7)
            r0 = 2131431195(0x7f0b0f1b, float:1.8484112E38)
            X.3DP r0 = r5.A00(r0)
            r5.A01 = r0
            r0 = 2131431196(0x7f0b0f1c, float:1.8484114E38)
            X.3DP r0 = r5.A00(r0)
            r5.A00 = r0
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto Lbb
            r0 = 929(0x3a1, float:1.302E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto Lbb
            int r1 = r2.hashCode()
            r0 = -2107409558(0xffffffff82637b6a, float:-1.6712744E-37)
            if (r1 == r0) goto La9
            r0 = -714477863(0xffffffffd569eed9, float:-1.6075753E13)
            if (r1 != r0) goto Lbb
            java.lang.String r0 = "fragment_thread"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lbb
            X.51C r3 = new X.51C
            r3.<init>()
        L44:
            android.os.Bundle r0 = r5.mArguments
            r3.setArguments(r0)
            X.0do r0 = r5.A02
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            X.8aO r4 = X.AbstractC34055F1i.A00(r0)
            r0 = 1
            r4.A1I = r0
            r4.A10 = r0
            boolean r0 = r3 instanceof X.C51D
            if (r0 == 0) goto L61
            r0 = r3
            X.51D r0 = (X.C51D) r0
            r4.A0T = r0
        L61:
            r1 = 8
            X.LwG r0 = new X.LwG
            r0.<init>(r3, r1)
            r4.A0U = r0
            android.os.Bundle r1 = r5.mArguments
            r2 = 0
            if (r1 == 0) goto L85
            r0 = 931(0x3a3, float:1.305E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            float r1 = r1.getFloat(r0)
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L85
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L85
            r4.A03 = r1
        L85:
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L9b
            r0 = 930(0x3a2, float:1.303E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            int r1 = r1.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L9b
            r4.A07 = r1
        L9b:
            X.8aR r2 = r4.A00()
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.3DN r0 = r5.A01
            X.C189478aR.A00(r1, r1, r3, r2, r0)
            return
        La9:
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lbb
            X.EJx r3 = new X.EJx
            r3.<init>()
            goto L44
        Lbb:
            X.AbstractC25231BEo.A16(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32313ELc.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C3DN c3dn = this.A00;
        if (c3dn != null && c3dn.A0Y()) {
            return true;
        }
        C3DN c3dn2 = this.A01;
        if (c3dn2 != null && c3dn2.A0Y()) {
            return true;
        }
        return false;
    }

    private final C3DP A00(int i) {
        LayoutInflater from = LayoutInflater.from(requireActivity());
        View requireView = requireView();
        C14360o3.A0C(requireView, "null cannot be cast to non-null type android.view.ViewGroup");
        View inflate = from.inflate(R.layout.bottom_sheet_container, (ViewGroup) requireView, false);
        View requireView2 = requireView();
        C14360o3.A0C(requireView2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) requireView2).addView(inflate);
        AbstractC31176DnK.A1D(inflate, R.id.bottom_sheet_container);
        inflate.requireViewById(R.id.layout_container_bottom_sheet).setId(i);
        Activity rootActivity = getRootActivity();
        if (rootActivity != null) {
            AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A02);
            AbstractC10360h2 childFragmentManager = getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            C14360o3.A0B(A0o, 2);
            C3DP c3dp = new C3DP(rootActivity, inflate, childFragmentManager, A0o, i, false);
            C14360o3.A0C(c3dp, "null cannot be cast to non-null type com.instagram.ui.bottomsheet.IgBottomSheetNavigator");
            return c3dp;
        }
        throw AbstractC25227BEk.A0n();
    }

    @Override // X.GXV
    public final C3DN Ahc() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        int i;
        int A02 = C0f9.A02(1302242765);
        if (viewGroup == null) {
            frameLayout = null;
            i = 539597178;
        } else {
            frameLayout = new FrameLayout(AbstractC166997dE.A0L(viewGroup));
            i = 1932094364;
        }
        C0f9.A09(i, A02);
        return frameLayout;
    }
}
