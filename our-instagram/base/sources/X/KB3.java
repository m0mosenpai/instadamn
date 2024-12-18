package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class KB3 extends AbstractC72473Mu implements InterfaceC11380iw, InterfaceC60072op {
    public static final String __redex_internal_original_name = "MessageActionsFragment";
    public float A00;
    public int A01;
    public C48259LXi A02;
    public InterfaceC08830cm A03;
    public int A04;
    public Context A05;
    public UserSession A06;
    public MRL A07;
    public InterfaceC83713oG A08;
    public C3o9 A09;
    public boolean A0A;
    public boolean A0B;
    public final Map A0D = new WeakHashMap();
    public final List A0C = AbstractC166987dD.A1E();

    public final void A0M(int i) {
        C18C.A0F(AbstractC25229BEm.A1Z(this.A02));
        this.A04 = i;
    }

    public final void A0N(MRL mrl) {
        C18C.A0F(AbstractC25229BEm.A1Z(this.A02));
        this.A07 = mrl;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_message_actions_fragment";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C48259LXi.A03(this.A02);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        if (X.AbstractC166987dD.A0x(r5).getInt("direct_reactions_customize_nux_count", 0) >= 3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x054b, code lost:
    
        if (r1.A0E != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
    
        if (r4 >= 2) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(final android.view.View r40, android.os.Bundle r41) {
        /*
            Method dump skipped, instructions count: 1415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KB3.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static KB3 A01(UserSession userSession, MessageActionsViewModel messageActionsViewModel, InterfaceC83713oG interfaceC83713oG, C3o9 c3o9, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("MESSAGE_ACTIONS_VIEW_MODEL_KEY", messageActionsViewModel);
        A0b.putInt("THEME_OVERRIDE_KEY", i);
        if (c3o9 != null) {
            AbstractC43826JZo.A01(A0b, c3o9, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        }
        A0b.putBoolean("IS_GROUP", z);
        A0b.putBoolean("IS_MIXED_VANISH_MODE", z2);
        A0b.putBoolean("IS_IN_SHH_MODE", z3);
        A0b.putBoolean("IS_MIXED_VANISH_MODE_ELIGIBLE", z4);
        if (interfaceC83713oG != null) {
            AbstractC2054897w.A02(A0b, interfaceC83713oG, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TARGET");
        }
        AbstractC03240Dh.A00(A0b, userSession);
        KB3 kb3 = new KB3();
        kb3.setArguments(A0b);
        return kb3;
    }

    private void A02(View view) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != view) {
                    AbstractC37301Gc2.A1T(childAt, this.A0D, childAt.getImportantForAccessibility());
                    childAt.setImportantForAccessibility(4);
                }
            }
        }
        Fragment fragment = this.mParentFragment;
        if ((fragment != null && parent == fragment.mView) || !(parent instanceof View)) {
            return;
        }
        A02((View) parent);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C48259LXi c48259LXi = this.A02;
        FrameLayout frameLayout = c48259LXi.A0A;
        if (frameLayout != null) {
            ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC48094LQu(1, viewTreeObserver, c48259LXi));
        }
        C47988LJq c47988LJq = c48259LXi.A0F;
        if (c47988LJq != null) {
            C14360o3.A0B(configuration, 0);
            LKK lkk = c47988LJq.A08;
            if (lkk == null) {
                C14360o3.A0F("reactionsTrayController");
                throw C00O.createAndThrow();
            }
            ViewTreeObserver viewTreeObserver2 = lkk.A0D.getViewTreeObserver();
            viewTreeObserver2.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC48094LQu(2, lkk, viewTreeObserver2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d7, code lost:
    
        if (r4.isTouchExplorationEnabled() != false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0081  */
    @Override // X.C0SG, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r34) {
        /*
            r33 = this;
            r0 = -192098782(0xfffffffff48cce22, float:-8.92459E31)
            int r8 = X.C0f9.A02(r0)
            r9 = r33
            r0 = r34
            super.onCreate(r0)
            r1 = 2132017944(0x7f140318, float:1.967418E38)
            r0 = 1
            r9.A09(r0, r1)
            android.os.Bundle r2 = r9.requireArguments()
            java.lang.String r0 = "MESSAGE_ACTIONS_VIEW_MODEL_KEY"
            android.os.Parcelable r7 = r2.getParcelable(r0)
            r7.getClass()
            com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel r7 = (com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel) r7
            com.instagram.common.session.UserSession r0 = X.AbstractC31176DnK.A0S(r9)
            r9.A06 = r0
            java.lang.String r0 = "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY"
            X.3o9 r0 = X.AbstractC43826JZo.A00(r2, r0)
            r9.A09 = r0
            java.lang.String r0 = "IS_GROUP"
            boolean r0 = r2.getBoolean(r0)
            r9.A0A = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TARGET"
            X.3oG r0 = X.AbstractC2054897w.A00(r2, r0)
            r9.A08 = r0
            java.lang.String r0 = "IS_MIXED_VANISH_MODE"
            boolean r30 = r2.getBoolean(r0)
            java.lang.String r0 = "IS_IN_SHH_MODE"
            boolean r31 = r2.getBoolean(r0)
            java.lang.String r0 = "IS_MIXED_VANISH_MODE_ELIGIBLE"
            boolean r32 = r2.getBoolean(r0)
            r1 = 0
            if (r31 == 0) goto Leb
            r6 = 2132017528(0x7f140178, float:1.9673337E38)
        L5a:
            android.content.Context r1 = r9.requireContext()
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r1, r6)
        L63:
            r9.A05 = r0
            androidx.fragment.app.FragmentActivity r16 = r9.requireActivity()
            com.instagram.common.session.UserSession r14 = r9.A06
            X.MRL r13 = r9.A07
            X.0cm r12 = r9.A03
            float r10 = r9.A00
            int r5 = r9.A04
            X.3o9 r4 = r9.A09
            boolean r3 = r9.A0A
            X.3oG r2 = r9.A08
            int r1 = r9.A01
            androidx.fragment.app.FragmentActivity r11 = r9.getActivity()
            if (r11 == 0) goto Le8
            boolean r0 = r11 instanceof X.GXV
            if (r0 == 0) goto Le3
            X.GXV r11 = (X.GXV) r11
            X.3DN r23 = r11.Ahc()
        L8b:
            X.KwN r0 = new X.KwN
            r0.<init>(r9)
            X.LXi r15 = new X.LXi
            r28 = r1
            r29 = r3
            r25 = r10
            r26 = r5
            r27 = r6
            r22 = r4
            r24 = r12
            r20 = r7
            r21 = r2
            r18 = r0
            r19 = r13
            r17 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r9.A02 = r15
            android.content.Context r1 = r9.requireContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r4 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r4 = (android.view.accessibility.AccessibilityManager) r4
            com.instagram.common.session.UserSession r3 = r9.A06
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36311053680247209(0x8100b6000801a9, double:3.026594788041088E-306)
            boolean r0 = X.AbstractC31178DnM.A1X(r2, r3, r0)
            if (r0 == 0) goto Ld9
            if (r4 == 0) goto Ld9
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto Ld9
            boolean r1 = r4.isTouchExplorationEnabled()
            r0 = 1
            if (r1 != 0) goto Lda
        Ld9:
            r0 = 0
        Lda:
            r9.A0B = r0
            r0 = 381926265(0x16c3bb79, float:3.162226E-25)
            X.C0f9.A09(r0, r8)
            return
        Le3:
            X.3DN r23 = X.AbstractC31172DnG.A0r(r11)
            goto L8b
        Le8:
            r23 = 0
            goto L8b
        Leb:
            java.lang.String r0 = "THEME_OVERRIDE_KEY"
            int r6 = r2.getInt(r0, r1)
            if (r6 != 0) goto L5a
            android.content.Context r0 = r9.requireContext()
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KB3.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(339160014);
        C48259LXi c48259LXi = this.A02;
        LayoutInflater from = LayoutInflater.from(this.A05);
        int i = c48259LXi.A0S.A01;
        if (i != 0) {
            from = AbstractC43593JPy.A0C(c48259LXi.A0O, from, i);
        }
        View A0A = AbstractC31172DnG.A0A(from, viewGroup, R.layout.fragment_message_actions);
        C0f9.A09(-1208236154, A02);
        return A0A;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1140122601);
        super.onDestroyView();
        if (this.A0B) {
            Map map = this.A0D;
            Iterator A12 = AbstractC43593JPy.A12(map);
            while (A12.hasNext()) {
                View A09 = AbstractC43592JPx.A09(A12);
                A09.setImportantForAccessibility(AbstractC166987dD.A0H(map.get(A09)));
            }
            map.clear();
        }
        C0f9.A09(-2063344825, A02);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDetach() {
        int A02 = C0f9.A02(-1179150294);
        super.onDetach();
        C48259LXi c48259LXi = this.A02;
        PopupWindow popupWindow = c48259LXi.A0C;
        if (popupWindow != null) {
            popupWindow.dismiss();
            c48259LXi.A0C = null;
        }
        List list = this.A0C;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass983.A01(((C47352Kw1) it.next()).A00).A0P();
        }
        list.clear();
        C0f9.A09(539613291, A02);
    }

    @Override // X.C0SG, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        MRL mrl = this.A02.A0E;
        if (mrl != null) {
            mrl.DB6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-542306383);
        super.onPause();
        C48259LXi c48259LXi = this.A02;
        View view = c48259LXi.A07;
        if (view != null && !c48259LXi.A0Z) {
            AbstractC008903d.A00(view, null);
        }
        c48259LXi.A0I = true;
        C0f9.A09(-1927967686, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(537944983);
        super.onResume();
        this.A02.A0I = false;
        C0f9.A09(-214948047, A02);
    }
}
