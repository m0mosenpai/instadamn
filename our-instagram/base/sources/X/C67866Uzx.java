package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* renamed from: X.Uzx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67866Uzx extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "InstagramConsentFlowBottomSheetFragment";
    public C68914VeE A00;
    public UP0 A01;
    public C69059VhA A02;
    public C6FG A03;
    public String A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A01(this);
    public final C57112jm A06 = C57112jm.A00();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "InstagramConsentFlowBottomSheet";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A05.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r11 != null) goto L18;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r0 = 1797546670(0x6b2462ae, float:1.9872984E26)
            int r2 = X.C0f9.A02(r0)
            r0 = r16
            super.onCreate(r0)
            android.os.Bundle r1 = r15.requireArguments()
            java.lang.String r0 = "prompt_id"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L9d
            r15.A04 = r1
            java.lang.String r5 = "promptId"
            r0 = 0
            java.util.HashMap r3 = X.AbstractC47895LDp.A01
            java.lang.Object r1 = r3.get(r1)
            X.VhA r1 = (X.C69059VhA) r1
            if (r1 != 0) goto L92
            java.lang.String r1 = r15.A04
            if (r1 == 0) goto L95
            X.AbstractC53724NpD.A00(r15, r1)
        L2e:
            java.lang.String r1 = r15.A04
            if (r1 == 0) goto L95
            java.lang.Object r1 = r3.get(r1)
            X.VhA r1 = (X.C69059VhA) r1
            if (r1 == 0) goto L90
            X.4kP r4 = r1.A02
            if (r4 == 0) goto L44
            java.lang.String r11 = r4.A0G()
            if (r11 != 0) goto L46
        L44:
            java.lang.String r11 = "default"
        L46:
            if (r4 == 0) goto L88
            java.lang.String r12 = r4.A0I()
            java.lang.String r13 = r4.A0K()
            java.lang.String r14 = r4.A0H()
            X.4lE r8 = r4.A0A()
            r1 = 41
            X.4lE r9 = r4.A0B(r1)
            r1 = 40
            X.4lE r10 = r4.A0B(r1)
            r1 = 140(0x8c, float:1.96E-43)
            X.4kP r7 = r4.A08(r1)
        L6a:
            X.UP0 r6 = new X.UP0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A01 = r6
            java.lang.String r1 = r15.A04
            if (r1 == 0) goto L95
            java.lang.Object r1 = r3.get(r1)
            X.VhA r1 = (X.C69059VhA) r1
            if (r1 == 0) goto L7f
            X.6FG r0 = r1.A00
        L7f:
            r15.A03 = r0
            r0 = -95980808(0xfffffffffa4772f8, float:-2.5889973E35)
            X.C0f9.A09(r0, r2)
            return
        L88:
            r12 = r0
            r13 = r0
            r14 = r0
            r8 = r0
            r9 = r0
            r10 = r0
            r7 = r0
            goto L6a
        L90:
            r4 = r0
            goto L44
        L92:
            r15.A02 = r1
            goto L2e
        L95:
            X.C14360o3.A0F(r5)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        L9d:
            java.lang.IllegalStateException r1 = X.AbstractC166997dE.A0g()
            r0 = -901552072(0xffffffffca436838, float:-3201550.0)
            X.C0f9.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67866Uzx.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.1Lf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, X.UDx] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        int i;
        LithoView lithoView;
        View onCreateView;
        int i2;
        int A02 = C0f9.A02(-1206233139);
        C14360o3.A0B(layoutInflater, 0);
        if (this.A02 == null) {
            onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            i2 = -703581006;
        } else {
            Context requireContext = requireContext();
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A05.getValue();
            C57112jm c57112jm = this.A06;
            C62862tP A03 = C62862tP.A03(this, abstractC12990ll, c57112jm);
            boolean A00 = AbstractC72723Nt.A00(requireContext);
            UP0 up0 = this.A01;
            String str = "options";
            if (up0 != null) {
                C102884kP c102884kP = up0.A00;
                int color = requireContext.getColor(R.color.direct_widget_primary_background);
                if (c102884kP != null) {
                    int i3 = 36;
                    if (A00) {
                        i3 = 35;
                    }
                    String A0L = c102884kP.A0L(i3);
                    if (A0L != null) {
                        color = C6BE.A03(A0L);
                    }
                }
                C69059VhA c69059VhA = this.A02;
                if (c69059VhA == null) {
                    str = "promptDisplayParameter";
                } else {
                    C1338462s c1338462s = c69059VhA.A01;
                    if (c1338462s != null) {
                        ?? obj2 = new Object();
                        UP0 up02 = this.A01;
                        if (up02 != null) {
                            C6FG c6fg = this.A03;
                            EnumC191908em C73 = obj2.C73();
                            getSession();
                            C50361MLn c50361MLn = new C50361MLn("InstagramConsentFlowBottomSheet", 5);
                            C14360o3.A0B(C73, 8);
                            boolean A0K = C14360o3.A0K(up02.A07, "cds");
                            String str2 = up02.A06;
                            String str3 = up02.A05;
                            String str4 = up02.A04;
                            InterfaceC103384lE interfaceC103384lE = up02.A03;
                            InterfaceC103384lE interfaceC103384lE2 = up02.A01;
                            InterfaceC103384lE interfaceC103384lE3 = up02.A02;
                            if (A0K) {
                                Context requireContext2 = requireContext();
                                int A032 = AbstractC25291Lj.A03(EnumC72394Xcg.A2M, A00);
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(A032);
                                Integer num = C05F.A0C;
                                C14360o3.A0B(AbstractC25291Lj.A00.C73(), 0);
                                float A002 = VSI.A00(requireContext2, XPC.A00(r0).AKz(num));
                                gradientDrawable.setCornerRadii(new float[]{A002, A002, A002, A002, 0.0f, 0.0f, 0.0f, 0.0f});
                                StringBuilder sb = new StringBuilder();
                                sb.append(A002);
                                C66213U4j A003 = AbstractC68319VMf.A00(requireContext2, C73, AbstractC166997dE.A0x("px", sb), A00);
                                obj = new Object();
                                FragmentActivity requireActivity = requireActivity();
                                C65075Td4 c65075Td4 = new C65075Td4(obj, 47);
                                C2XE c2xe = new C2XE(requireActivity);
                                int A004 = AbstractC68321VMh.A00(str3, 0);
                                int A005 = AbstractC68321VMh.A00(str4, Integer.MAX_VALUE);
                                C25560BRx A006 = AbstractC25559BRw.A00(c2xe);
                                A006.A04();
                                A006.A05(new ColorDrawable(0));
                                C25560BRx A007 = AbstractC25559BRw.A00(c2xe);
                                ((AbstractC77733dx) A007).A00.A0a().A0O(EnumC77683ds.CENTER);
                                C26281Bjo A033 = BUG.A03(c2xe);
                                AbstractC50792Va abstractC50792Va = ((AbstractC77733dx) A033).A00;
                                abstractC50792Va.A0a().A0J(A004);
                                abstractC50792Va.A0a().A0H(A005);
                                A033.A0B(c1338462s);
                                A033.A01.A03 = new C29141Ct8(c65075Td4, 1);
                                A033.A0C(A03);
                                A007.A0A(A033.A0A());
                                A006.A0A(A007.A00);
                                C75713ac A022 = ComponentTree.A02(A006.A00, new C2XE(requireActivity), null);
                                A022.A07 = false;
                                LithoView A01 = LithoView.A01(requireActivity, A022.A00());
                                C14360o3.A0A(A01);
                                ?? uDx = new UDx(requireActivity, A01, A003);
                                if (str2 != null) {
                                    A004 = AbstractC68321VMh.A00(str2, 0);
                                    ((AbstractC77733dx) A006).A00.A0a().A0F(A004);
                                    uDx.setMaxHeight(A004);
                                } else {
                                    uDx.setMaxHeight(A005);
                                }
                                uDx.setMinHeight(A004);
                                AbstractC50522MSa.A0z(uDx);
                                uDx.setBackground(gradientDrawable);
                                i = 14;
                                lithoView = uDx;
                            } else {
                                obj = new Object();
                                GradientDrawable gradientDrawable2 = new GradientDrawable();
                                gradientDrawable2.setColor(color);
                                float A008 = VSI.A00(requireActivity(), 16.0f);
                                gradientDrawable2.setCornerRadii(new float[]{A008, A008, A008, A008, 0.0f, 0.0f, 0.0f, 0.0f});
                                FragmentActivity requireActivity2 = requireActivity();
                                C65075Td4 c65075Td42 = new C65075Td4(obj, 48);
                                C2XE c2xe2 = new C2XE(requireActivity2);
                                int A009 = AbstractC68321VMh.A00(str3, 0);
                                int A0010 = AbstractC68321VMh.A00(str4, Integer.MAX_VALUE);
                                C25560BRx A0011 = AbstractC25559BRw.A00(c2xe2);
                                if (str2 != null) {
                                    ((AbstractC77733dx) A0011).A00.A0a().A0F(AbstractC68321VMh.A00(str2, 0));
                                }
                                A0011.A04();
                                A0011.A05(new ColorDrawable(0));
                                C25560BRx A0012 = AbstractC25559BRw.A00(c2xe2);
                                ((AbstractC77733dx) A0012).A00.A0a().A0O(EnumC77683ds.CENTER);
                                C26281Bjo A034 = BUG.A03(c2xe2);
                                AbstractC50792Va abstractC50792Va2 = ((AbstractC77733dx) A034).A00;
                                abstractC50792Va2.A0a().A0J(A009);
                                abstractC50792Va2.A0a().A0H(A0010);
                                A034.A0B(c1338462s);
                                A034.A05(gradientDrawable2);
                                A034.A01.A03 = new C29141Ct8(c65075Td42, 0);
                                A034.A0C(A03);
                                A0012.A0A(A034.A0A());
                                A0011.A0A(A0012.A00);
                                i = 15;
                                lithoView = LithoView.A00(requireActivity2, A0011.A00);
                            }
                            this.A00 = new C68914VeE(lithoView, this, c1338462s, interfaceC103384lE, interfaceC103384lE3, interfaceC103384lE2, str2, new C57533Pg7(i, obj, c6fg), c50361MLn);
                            C71163Hc A0013 = C71163Hc.A00(this);
                            C68914VeE c68914VeE = this.A00;
                            if (c68914VeE == null) {
                                str = "bottomSheetDialogDelegate";
                            } else {
                                c57112jm.A08(c68914VeE.A00, A0013, new InterfaceC57142jp[0]);
                                onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
                                i2 = 1747260242;
                            }
                        }
                    } else {
                        IllegalStateException A0g = AbstractC166997dE.A0g();
                        C0f9.A09(1807193283, A02);
                        throw A0g;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A09(i2, A02);
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1494554114);
        super.onStart();
        C68914VeE c68914VeE = this.A00;
        if (c68914VeE != null) {
            C0fJ.A00(c68914VeE.A01);
        }
        C0f9.A09(2046992789, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        FragmentActivity activity;
        int A02 = C0f9.A02(1135384529);
        if (this.mRemoving && this.A00 != null && (activity = getActivity()) != null && !activity.isDestroyed()) {
            C68914VeE c68914VeE = this.A00;
            if (c68914VeE == null) {
                C14360o3.A0F("bottomSheetDialogDelegate");
                throw C00O.createAndThrow();
            }
            DialogC51582Yg dialogC51582Yg = c68914VeE.A01;
            if (dialogC51582Yg.isShowing()) {
                dialogC51582Yg.dismiss();
            }
        }
        super.onStop();
        C0f9.A09(-1475298003, A02);
    }
}
