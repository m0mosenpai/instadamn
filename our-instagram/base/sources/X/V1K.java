package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: classes11.dex */
public final class V1K extends AbstractC59962oe implements C51D, InterfaceC72039XGh, InterfaceC72523Mz, InterfaceC71943XBs {
    public static final String __redex_internal_original_name = "IgBloksScreenQueryBottomSheetFragment";
    public U6L A00;
    public WTZ A01;
    public C57112jm A02;
    public Integer A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A01(this);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    @Override // X.InterfaceC72039XGh
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D6r(X.WTZ r15) {
        /*
            r14 = this;
            r12 = 0
            X.C14360o3.A0B(r15, r12)
            androidx.fragment.app.FragmentActivity r7 = r14.getActivity()
            if (r7 == 0) goto L9e
            X.U6L r0 = r14.A00
            if (r0 == 0) goto L9e
            X.6T7 r0 = r0.A04
            X.6FG r4 = r0.A02()
            X.C14360o3.A07(r4)
            X.3DO r0 = X.C3DN.A00
            X.3DN r0 = r0.A00(r7)
            X.8aR r3 = X.F86.A00(r0)
            if (r3 == 0) goto L9e
            X.UP2 r0 = r15.A01
            r2 = 0
            if (r0 == 0) goto Lc6
            java.lang.String r1 = r0.A01
            X.UPF r2 = r0.A00
            if (r1 == 0) goto Lc6
            int r0 = r1.length()
            if (r0 == 0) goto Lc6
            r3.A0M(r1)
        L37:
            if (r2 == 0) goto Lc2
            r9 = 0
            java.lang.String r11 = ""
            X.8aP r8 = new X.8aP
            r10 = r9
            r13 = r12
            r8.<init>(r9, r10, r11, r12, r13)
            boolean r0 = r2.A05
            r8.A0A = r0
            java.lang.String r6 = r2.A03
            if (r6 == 0) goto Laa
            java.lang.Integer r5 = X.U5L.A03(r6)
            if (r5 == 0) goto L9f
            int r0 = X.AbstractC65916TwN.A01(r5)
            r8.A02 = r0
            android.content.res.Resources r1 = r7.getResources()
            int r0 = X.AbstractC65916TwN.A00(r5)
            java.lang.String r1 = X.AbstractC166997dE.A0q(r1, r0)
        L63:
            r8.A07 = r1
        L65:
            r1 = 45
            X.WNV r0 = new X.WNV
            r0.<init>(r1, r4, r2)
            r8.A05 = r0
            X.8aQ r0 = r8.A00()
            r3.A0K(r0, r12)
        L75:
            java.lang.Integer r0 = r15.A04
            if (r0 == 0) goto L9e
            int r2 = r0.intValue()
            android.app.Activity r0 = r14.getRootActivity()
            if (r0 == 0) goto L9e
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L9e
            java.lang.Integer r0 = r14.A03
            if (r0 != 0) goto L99
            android.view.WindowManager$LayoutParams r0 = r1.getAttributes()
            int r0 = r0.softInputMode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.A03 = r0
        L99:
            r0 = r2 | 2
            r1.setSoftInputMode(r0)
        L9e:
            return
        L9f:
            X.BSU r1 = X.BSU.OUTLINE
            X.BSV r0 = X.BSV.SIZE_24
            android.graphics.drawable.Drawable r0 = X.AbstractC65877Tvg.A01(r7, r0, r1, r6)
            r8.A04 = r0
            goto Lb0
        Laa:
            java.lang.String r0 = r2.A04
            if (r0 == 0) goto L65
            r8.A06 = r0
        Lb0:
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto Lba
            int r0 = r1.length()
            if (r0 != 0) goto L63
        Lba:
            java.lang.String r1 = "bk.data.screen.navbar.bottomsheet.ig.TrailingButton"
            java.lang.String r0 = "Trailing header buttons must have an accessibility label"
            X.AbstractC25241Le.A02(r1, r0)
            goto L65
        Lc2:
            r3.A0O(r12)
            goto L75
        Lc6:
            r3.A06()
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1K.D6r(X.WTZ):void");
    }

    @Override // X.InterfaceC71943XBs
    public final void DEl(Integer num) {
        Integer num2;
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        U6L u6l = this.A00;
        if (intValue != 1) {
            if (u6l != null) {
                num2 = C05F.A0C;
            } else {
                return;
            }
        } else if (u6l == null) {
            return;
        } else {
            num2 = C05F.A01;
        }
        u6l.A02(num2);
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        U6L u6l = this.A00;
        if (u6l != null) {
            u6l.A01(bundle);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C57112jm c57112jm = this.A02;
        if (c57112jm != null) {
            AbstractC37301Gc2.A0v(view, c57112jm, this);
        }
        WTZ wtz = this.A01;
        if (wtz != null) {
            D6r(wtz);
        }
    }

    @Override // X.InterfaceC72523Mz
    public final String BUi() {
        String str;
        U6L u6l = this.A00;
        if (u6l != null) {
            str = u6l.A03.A05;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "bloks_unknown_class";
        }
        C14360o3.A07(str);
        return str;
    }

    @Override // X.InterfaceC71943XBs
    public final void DDk() {
        U6L u6l = this.A00;
        if (u6l != null) {
            u6l.A00();
        }
    }

    @Override // X.InterfaceC72039XGh
    public final void EZZ(U7A u7a) {
        U6L u6l = this.A00;
        if (u6l != null) {
            u6l.A00 = u7a;
            if (u7a != null) {
                u6l.A00();
            }
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        Bundle bundle;
        String string;
        String str;
        U6L u6l = this.A00;
        Bundle bundle2 = this.mArguments;
        if (u6l == null || (str = u6l.A03.A04) == null) {
            if (bundle2 == null || (bundle = bundle2.getBundle("key_screen_container_props_bundle")) == null || (string = bundle.getString("key_analytics_module")) == null) {
                return "bloks_unknown";
            }
            return string;
        }
        return str;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A04.getValue();
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        U6L u6l = this.A00;
        if (u6l != null) {
            C6FG A02 = u6l.A04.A02();
            C14360o3.A07(A02);
            return VR3.A00(A02);
        }
        return true;
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        U6L u6l = this.A00;
        if (u6l != null) {
            u6l.A04.A06();
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int A02 = C0f9.A02(-996342539);
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC167017dG.A0y(getActivity(), C3DN.A00);
            i = 1012528636;
        } else {
            Bundle requireArguments = requireArguments();
            this.A02 = AbstractC57052jg.A01(null, W1a.A01.A00);
            C62862tP A022 = C62862tP.A02(this, this, getSession(), this.A02);
            InterfaceC65469Tkm interfaceC65469Tkm = WTT.A0A.A01(requireArguments).A01;
            C14360o3.A0C(interfaceC65469Tkm, AbstractC111324zv.A00(1137));
            this.A01 = (WTZ) interfaceC65469Tkm;
            this.A00 = U6L.A05.A01(requireContext(), requireArguments, this, A022);
            new W30(this, this);
            i = -1369484277;
        }
        C0f9.A09(i, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        U3u u3u;
        int A02 = C0f9.A02(-1772612011);
        U6L u6l = this.A00;
        if (u6l != null) {
            Context context = u6l.A02;
            C6T7 c6t7 = u6l.A04;
            C14360o3.A0B(c6t7, 1);
            u3u = new U3u(context);
            MSZ.A13(u3u);
            c6t7.A07(u3u);
        } else {
            u3u = null;
        }
        C0f9.A09(561177663, A02);
        return u3u;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2093518053);
        super.onDestroyView();
        U6L u6l = this.A00;
        if (u6l != null) {
            u6l.A04.A04();
        }
        C0f9.A09(-1004865925, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        int A02 = C0f9.A02(1602117466);
        super.onPause();
        Integer num = this.A03;
        if (num != null) {
            int intValue = num.intValue();
            Activity rootActivity = getRootActivity();
            if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
                window.setSoftInputMode(intValue);
            }
        }
        C0f9.A09(-1650435592, A02);
    }
}
