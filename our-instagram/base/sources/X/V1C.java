package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* loaded from: classes11.dex */
public final class V1C extends AbstractC59962oe implements InterfaceC81393k9 {
    public static final String __redex_internal_original_name = "QuickPromotionIGBottomsheetBloksFragment";
    public ViewGroup A00;
    public C6T7 A01;
    public QuickPromotionSlot A02;
    public C64842wi A03;
    public boolean A04;
    public C4NJ A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "quick_promotion_ig_bottomsheet_bloks_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C4NJ c4nj;
        C62862tP c62862tP;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C64842wi c64842wi = this.A03;
        if (c64842wi != null && (c4nj = this.A05) != null && (c62862tP = (C62862tP) c64842wi.A02.getValue()) != null) {
            c62862tP.A01.put(R.id.bloks_action_listener, new C69244VkC(requireContext(), c62862tP, c64842wi, c4nj, this, null));
        }
    }

    @Override // X.InterfaceC81393k9
    public final void DKx(C6T7 c6t7, C69244VkC c69244VkC) {
        this.A01 = c6t7;
        C4NJ c4nj = this.A05;
        if (c4nj != null) {
            C64842wi c64842wi = this.A03;
            if (c64842wi != null) {
                c64842wi.Dcq(c4nj);
            }
            C126545np c126545np = new C126545np(requireContext());
            C6T7 c6t72 = this.A01;
            if (c6t72 != null) {
                c6t72.A07(c126545np);
            }
            ViewGroup viewGroup = this.A00;
            if (viewGroup != null) {
                viewGroup.addView(c126545np);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A06.getValue();
    }

    public static final void A00(V1C v1c) {
        if (v1c.isAdded()) {
            AbstractC167017dG.A0y(v1c.getActivity(), C3DN.A00);
            AbstractC25226BEj.A1P(v1c);
        }
    }

    @Override // X.InterfaceC81393k9
    public final void DPm(String str) {
        A00(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r2.length() == 0) goto L11;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.2fr, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = 721748054(0x2b050056, float:4.725156E-13)
            int r4 = X.C0f9.A02(r0)
            r6 = r11
            super.onCreate(r12)
            androidx.fragment.app.FragmentActivity r1 = r11.getActivity()
            X.EVO r0 = new X.EVO
            r0.<init>(r1)
            r11.registerLifecycleListener(r0)
            android.os.Bundle r1 = r11.requireArguments()
            r0 = 2930(0xb72, float:4.106E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L2e
            r0 = 758803844(0x2d3a6d84, float:1.0597193E-11)
        L2a:
            X.C0f9.A09(r0, r4)
            return
        L2e:
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            r11.A02 = r0
            java.lang.String r0 = "quick_promotion"
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L43
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L44
        L43:
            r0 = 1
        L44:
            r3 = 0
            if (r0 != 0) goto L58
            X.16L r0 = X.C16V.A00(r2)     // Catch: java.io.IOException -> L50
            X.4NJ r3 = X.C4NI.parseFromJson(r0)     // Catch: java.io.IOException -> L50
            goto L58
        L50:
            r2 = move-exception
            java.lang.String r1 = "QuickPromotionIGBottomsheetBloksFragment"
            java.lang.String r0 = "Error parsing bloks bottomsheet promotion"
            X.C0K8.A0F(r1, r0, r2)
        L58:
            r11.A05 = r3
            com.instagram.quickpromotion.intf.QuickPromotionSlot r10 = r11.A02
            X.0do r1 = r11.A06
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L93
            if (r10 == 0) goto L93
            android.os.Handler r3 = X.AbstractC167007dF.A0J()
            X.1Xa r5 = X.AbstractC54912fq.A00()
            java.lang.Object r8 = r1.getValue()
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            X.AbstractC54912fq.A00()
            X.2fr r2 = new X.2fr
            r2.<init>()
            r1 = 1
            X.Wlh r0 = new X.Wlh
            r0.<init>(r1, r3, r11)
            r2.A08 = r0
            X.2fy r9 = r2.A00()
            r7 = r11
            X.2wi r0 = r5.A02(r6, r7, r8, r9, r10)
        L8d:
            r11.A03 = r0
            r0 = 102318143(0x619403f, float:2.8823302E-35)
            goto L2a
        L93:
            r0 = 0
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1C.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(15275454);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bloks_fragment, viewGroup, false);
        if (inflate != null) {
            this.A00 = (ViewGroup) inflate.findViewById(R.id.bloks_container);
        } else {
            inflate = null;
        }
        C0f9.A09(-1009644830, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-142696513);
        C6T7 c6t7 = this.A01;
        if (c6t7 != null) {
            c6t7.A04();
        }
        this.A01 = null;
        this.A00 = null;
        super.onDestroyView();
        C0f9.A09(1945772032, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-420851749);
        super.onResume();
        if (this.A05 == null) {
            A00(this);
            this.A04 = true;
        }
        C0f9.A09(271137863, A02);
    }
}
