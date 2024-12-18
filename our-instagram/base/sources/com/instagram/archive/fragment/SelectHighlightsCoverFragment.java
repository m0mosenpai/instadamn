package com.instagram.archive.fragment;

import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC59962oe;
import X.AbstractC86593tX;
import X.C0f9;
import X.C12260kU;
import X.C1NJ;
import X.C1OG;
import X.C25821No;
import X.C50804McL;
import X.C54662OCo;
import X.C55197Oe4;
import X.C55772hI;
import X.C56185Ows;
import X.C56352iT;
import X.C73033Pe;
import X.C82183lf;
import X.InterfaceC56362iU;
import X.InterfaceC59502nt;
import X.InterfaceC60072op;
import X.InterfaceC60112ot;
import X.InterfaceC69913Ca;
import X.PLM;
import X.ViewOnClickListenerC55467OkM;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;
import java.io.File;

/* loaded from: classes9.dex */
public class SelectHighlightsCoverFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC69913Ca, C1NJ, InterfaceC60112ot {
    public Bitmap A00;
    public C50804McL A01;
    public C55197Oe4 A02;
    public C54662OCo A03;
    public UserSession A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public C56185Ows A0A;
    public PunchedOverlayView mPunchedOverlayView;
    public View mRootView;
    public TouchImageView mTouchImageView;
    public ReboundViewPager mViewPager;
    public InterfaceC59502nt A0B = null;
    public boolean A09 = false;

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void CKE(Intent intent) {
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return true;
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void En7(File file, int i) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_highlights_cover_pic";
    }

    public static void A00(SelectHighlightsCoverFragment selectHighlightsCoverFragment) {
        if (selectHighlightsCoverFragment.A03 != null) {
            C1OG A0J = C25821No.A00().A0J(selectHighlightsCoverFragment.A03.A02, "reel_highlights_cover_pic");
            A0J.A02(selectHighlightsCoverFragment);
            InterfaceC59502nt A00 = A0J.A00();
            selectHighlightsCoverFragment.A0B = A00;
            A00.E7X();
        }
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        TouchImageView touchImageView = this.mTouchImageView;
        if (touchImageView != null && this.A0B == interfaceC59502nt && this.A03 != null) {
            this.A00 = c73033Pe.A01;
            touchImageView.post(new PLM(this));
        }
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        C55772hI.A00(this.A04).A09(requireActivity(), "new_highlight_cover_photo");
        Context context = getContext();
        if (context != null && AbstractC86593tX.A0o(context, intent)) {
            C12260kU.A06(this, intent, i);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r0 >= 10) goto L16;
     */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r7 = this;
            boolean r0 = r7.A05
            r5 = 0
            if (r0 == 0) goto L8
            r7.A05 = r5
        L7:
            return r5
        L8:
            X.OCo r0 = r7.A03
            if (r0 == 0) goto L7
            android.graphics.Rect r6 = r0.A00
            com.instagram.common.ui.widget.touchimageview.TouchImageView r0 = r7.mTouchImageView
            android.graphics.Rect r3 = r0.getCropRect()
            int r1 = r6.bottom
            int r0 = r3.bottom
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            r2 = 10
            boolean r0 = X.AbstractC167007dF.A1Q(r0, r2)
            r4 = 1
            if (r0 == 0) goto L48
            int r1 = r6.left
            int r0 = r3.left
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            if (r0 >= r2) goto L48
            int r1 = r6.right
            int r0 = r3.right
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            if (r0 >= r2) goto L48
            int r1 = r6.top
            int r0 = r3.top
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            r3 = 1
            if (r0 < r2) goto L49
        L48:
            r3 = 0
        L49:
            X.Oe4 r0 = r7.A02
            X.OCo r0 = r0.A00
            r2 = 0
            if (r0 == 0) goto L96
            java.lang.String r2 = r0.A03
            java.lang.String r1 = r0.A04
        L54:
            if (r3 != 0) goto L5a
            boolean r0 = r7.A09
            if (r0 == 0) goto L6e
        L5a:
            X.OCo r0 = r7.A03
            java.lang.String r0 = r0.A03
            boolean r0 = X.AbstractC50102Ry.A00(r0, r2)
            if (r0 == 0) goto L6e
            X.OCo r0 = r7.A03
            java.lang.String r0 = r0.A04
            boolean r0 = X.AbstractC50102Ry.A00(r0, r1)
            if (r0 != 0) goto L7
        L6e:
            X.8hC r3 = X.AbstractC31175DnJ.A0O(r7)
            r0 = 2131976209(0x7f136011, float:1.9589532E38)
            r3.A0A(r0)
            r0 = 2131976208(0x7f136010, float:1.958953E38)
            r3.A09(r0)
            r0 = 2131960929(0x7f132461, float:1.955854E38)
            java.lang.String r2 = r7.getString(r0)
            r0 = 3
            X.Ogh r1 = X.DialogInterfaceOnClickListenerC55319Ogh.A00(r7, r0)
            X.8hE r0 = X.EnumC193348hE.A06
            r3.A0Z(r1, r0, r2, r4)
            r3.A06()
            X.AbstractC166987dD.A1W(r3)
            return r4
        L96:
            r1 = r2
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.SelectHighlightsCoverFragment.onBackPressed():boolean");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        if (getContext() != null) {
            interfaceC56362iU.EkS(true);
            interfaceC56362iU.setTitle(AbstractC166997dE.A0N(this).getString(2131963617));
            C56352iT.A0t.A03(requireActivity()).AAF(new ViewOnClickListenerC55467OkM(this, 20), 2131961124);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        if (r2.A03 == null) goto L14;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            super.onActivityResult(r7, r8, r9)
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r7 != r0) goto L79
            r0 = -1
            if (r8 != r0) goto L79
            if (r9 == 0) goto L79
            java.lang.String r0 = r9.getAction()
            r0.getClass()
            android.net.Uri r2 = X.AbstractC167007dF.A0I(r0)
            java.lang.String r0 = "pending_media_key"
            java.lang.String r1 = r9.getStringExtra(r0)
            r1.getClass()
            com.instagram.common.session.UserSession r0 = r6.A04
            X.47Z r5 = X.AbstractC43593JPy.A0h(r0, r1)
            java.lang.String r0 = r2.getPath()
            r0.getClass()
            android.graphics.Rect r0 = X.C1NC.A0H(r0)
            int r1 = r0.width()
            int r0 = r0.height()
            com.instagram.common.typedurl.SimpleImageUrl r4 = X.AbstractC81033jX.A00(r2, r1, r0)
            int r3 = r4.A01
            int r2 = r4.A00
            r1 = 0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1, r1, r3, r2)
            android.graphics.Rect r3 = X.MX2.A01(r0)
            if (r5 == 0) goto L7a
            java.lang.String r2 = r5.A3t
        L4f:
            r1 = 0
            X.OCo r0 = new X.OCo
            r0.<init>(r3, r4, r1, r2)
            r6.A03 = r0
            A00(r6)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r3 = r6.mViewPager
            X.OCo r2 = r6.A03
            if (r2 == 0) goto L65
            java.lang.String r1 = r2.A03
            r0 = 1
            if (r1 != 0) goto L66
        L65:
            r0 = 0
        L66:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0Q = r0
            if (r2 == 0) goto L79
            X.McL r1 = r6.A01
            java.lang.String r0 = r2.A03
            int r0 = r1.A00(r0)
            r3.A0K(r0)
        L79:
            return
        L7a:
            r2 = 0
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.SelectHighlightsCoverFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (X.C18U.A06(X.AbstractC25225BEi.A0j(r5, 0), r5, 36328925038853999L) != false) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = -341543928(0xffffffffeba47408, float:-3.9762355E26)
            int r2 = X.C0f9.A02(r0)
            super.onCreate(r7)
            com.instagram.common.session.UserSession r0 = X.AbstractC31176DnK.A0S(r6)
            r6.A04 = r0
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r0)
            boolean r0 = r0.A2P()
            r3 = 0
            if (r0 != 0) goto L2d
            com.instagram.common.session.UserSession r5 = r6.A04
            X.0Tz r4 = X.AbstractC25225BEi.A0j(r5, r3)
            r0 = 36328925038853999(0x8110f700033f6f, double:3.037896707186207E-306)
            boolean r1 = X.C18U.A06(r4, r5, r0)
            r0 = 0
            if (r1 == 0) goto L2e
        L2d:
            r0 = 1
        L2e:
            r6.A06 = r0
            com.instagram.common.session.UserSession r0 = r6.A04
            X.Oe4 r1 = X.C55197Oe4.A00(r0)
            r6.A02 = r1
            java.util.Map r0 = r1.A05
            java.util.Set r4 = r0.keySet()
            X.OCo r0 = r1.A00
            if (r0 == 0) goto L5b
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L5b
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L5b
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L5b
            X.Oe4 r1 = r6.A02
            android.content.Context r0 = r6.requireContext()
            r1.A06(r0)
        L5b:
            X.Oe4 r0 = r6.A02
            X.OCo r0 = r0.A00
            r6.A03 = r0
            android.view.Window r1 = X.AbstractC31174DnI.A0H(r6)
            r1.getClass()
            r0 = 48
            r1.setSoftInputMode(r0)
            android.os.Bundle r1 = r6.mArguments
            if (r1 == 0) goto L7e
            r0 = 3584(0xe00, float:5.022E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L7e
            r3 = 1
        L7e:
            r6.A07 = r3
            r0 = r3 ^ 1
            r6.A08 = r0
            r0 = 1387928429(0x52ba1b6d, float:3.9966202E11)
            X.C0f9.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.SelectHighlightsCoverFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1037935326);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_highlights_cover_frame_fragment);
        C0f9.A09(-1268641305, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-987346653);
        super.onDestroyView();
        SelectHighlightsCoverFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(-1625114656, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(605428199);
        super.onPause();
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setSoftInputMode(0);
        C0f9.A09(-1189756124, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ac, code lost:
    
        if (r1 == null) goto L9;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            super.onViewCreated(r6, r7)
            r5.mRootView = r6
            r0 = 2131438924(0x7f0b2d4c, float:1.8499789E38)
            android.view.View r3 = r6.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r3 = (com.instagram.common.ui.widget.imageview.PunchedOverlayView) r3
            r5.mPunchedOverlayView = r3
            android.content.Context r2 = r5.requireContext()
            boolean r1 = r5.A06
            r0 = 2130970866(0x7f0408f2, float:1.7550454E38)
            if (r1 == 0) goto L1e
            r0 = 2130970129(0x7f040611, float:1.754896E38)
        L1e:
            int r0 = X.AbstractC53242c7.A0F(r2, r0)
            r3.A01 = r0
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r0 = r5.mPunchedOverlayView
            r3 = 0
            X.ViewOnLayoutChangeListenerC55476OkV.A00(r0, r3, r5)
            r0 = 2131433995(0x7f0b1a0b, float:1.8489791E38)
            android.view.View r0 = r6.requireViewById(r0)
            com.instagram.common.ui.widget.touchimageview.TouchImageView r0 = (com.instagram.common.ui.widget.touchimageview.TouchImageView) r0
            r5.mTouchImageView = r0
            X.Ows r0 = new X.Ows
            r0.<init>()
            r5.A0A = r0
            com.instagram.common.ui.widget.touchimageview.TouchImageView r1 = r5.mTouchImageView
            r1.A06 = r0
            boolean r0 = r5.A06
            r0 = r0 ^ 1
            r1.A0G = r0
            A00(r5)
            r0 = 2131436100(0x7f0b2244, float:1.849406E38)
            android.view.View r0 = r6.requireViewById(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r5.mViewPager = r0
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r5)
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            int r4 = r1.getDimensionPixelSize(r0)
            int r0 = X.MSX.A03(r5)
            float r1 = (float) r0
            float r0 = (float) r4
            float r1 = r1 / r0
            int r0 = java.lang.Math.round(r1)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.mViewPager
            r1.A0C = r4
            int r0 = r0 + (-1)
            int r0 = r0 / 2
            int r0 = r0 + 2
            r1.A0M(r0, r3)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.mViewPager
            r0 = 0
            r1.setPageSpacing(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.mViewPager
            X.3Va r0 = X.EnumC74213Va.A04
            r1.setScrollMode(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.mViewPager
            X.NFu r0 = new X.NFu
            r0.<init>(r5)
            r1.A0P(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r5.mViewPager
            r1 = 1065353216(0x3f800000, float:1.0)
            X.42E r0 = new X.42E
            r0.<init>(r4, r3, r1)
            r2.A0J = r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.mViewPager
            X.Ldm r0 = new X.Ldm
            r0.<init>(r5, r3)
            r1.A0P(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r5.mViewPager
            X.OCo r0 = r5.A03
            if (r0 == 0) goto Lae
            java.lang.String r1 = r0.A03
            r0 = 1
            if (r1 != 0) goto Laf
        Lae:
            r0 = 0
        Laf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0Q = r0
            X.Oe4 r0 = r5.A02
            java.util.ArrayList r2 = X.C55197Oe4.A02(r0)
            X.O1k r0 = new X.O1k
            r0.<init>(r5)
            X.McL r1 = new X.McL
            r1.<init>(r0, r5, r2)
            r5.A01 = r1
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r5.mViewPager
            r0.setAdapter(r1)
            X.OCo r0 = r5.A03
            if (r0 == 0) goto Ldd
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r5.mViewPager
            X.McL r1 = r5.A01
            java.lang.String r0 = r0.A03
            int r0 = r1.A00(r0)
            r2.A0K(r0)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.SelectHighlightsCoverFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
