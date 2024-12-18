package X;

import android.app.Activity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Adapter;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.51C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C51C extends AbstractC59962oe implements InterfaceC60072op, C2d4, C51D {
    public static final String __redex_internal_original_name = "DirectThreadToggleFragment";
    public AnonymousClass983 A00;
    public C31600DuS A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final boolean A03 = true;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_thread_toggle";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttachFragment(Fragment fragment) {
        C14360o3.A0B(fragment, 0);
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null) {
            if ("DirectThreadToggleFragment.THREAD_FRAGMENT_TAG".equals(fragment.mTag)) {
                anonymousClass983.A0F = (C51B) fragment;
                Integer num = anonymousClass983.A0c;
                if (num != null) {
                    AnonymousClass983.A01(anonymousClass983).A0S(num.intValue(), 0, 0, false);
                    return;
                }
                return;
            }
            if (!"DirectThreadToggleFragment.MESSAGE_ACTIONS_FRAGMENT_TAG".equals(fragment.mTag)) {
                return;
            }
            KB3 kb3 = (KB3) fragment;
            anonymousClass983.A0L = kb3;
            float f = anonymousClass983.A00;
            boolean z = false;
            if (kb3.A02 == null) {
                z = true;
            }
            C18C.A0F(z);
            kb3.A00 = f;
            kb3.A0C.add(new C47352Kw1(anonymousClass983));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r1.CYp() == true) goto L27;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigurationChanged(android.content.res.Configuration r5) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            super.onConfigurationChanged(r5)
            X.983 r3 = r4.A00
            if (r3 == 0) goto L4c
            X.7El r1 = r3.A0R
            if (r1 == 0) goto L27
            boolean r0 = X.AbstractC52812bN.A00
            if (r0 == 0) goto L27
            X.7GN r2 = r1.A0u
            if (r2 == 0) goto L27
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r1.A0I
            X.7GJ r0 = r2.A0R
            r0.A00 = r1
            if (r1 == 0) goto L27
            X.7GW r0 = new X.7GW
            r0.<init>(r2)
            r1.setOnTouchListener(r0)
        L27:
            android.app.Activity r0 = X.AnonymousClass983.A00(r3)
            android.view.Window r2 = r0.getWindow()
            if (r2 == 0) goto L4b
            android.app.Activity r0 = X.AnonymousClass983.A00(r3)
            boolean r0 = X.C43687JTw.A02(r0)
            if (r0 == 0) goto L4b
            android.view.View r0 = r2.getDecorView()
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.LQr r0 = new X.LQr
            r0.<init>(r2, r3)
            r1.addOnGlobalLayoutListener(r0)
        L4b:
            return
        L4c:
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L4b
            boolean r0 = r1 instanceof X.InterfaceC53772dG
            if (r0 == 0) goto L85
            X.2dG r1 = (X.InterfaceC53772dG) r1
            r3 = 1
            if (r1 == 0) goto L85
            boolean r0 = r1.CYp()
            if (r0 != r3) goto L85
        L61:
            X.0wb r2 = X.C18950wb.A01
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "DirectThreadToggleFragment - onConfigurationChanged controller null"
            X.0f5 r2 = r2.AEp(r0, r1)
            java.lang.String r0 = "isModalActive"
            r2.ABX(r0, r3)
            boolean r1 = r4.isAdded()
            java.lang.String r0 = "isFragmentAdded"
            r2.ABX(r0, r1)
            boolean r1 = r4.mDetached
            java.lang.String r0 = "isFragmentDetached"
            r2.ABX(r0, r1)
            r2.report()
            return
        L85:
            r3 = 0
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51C.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        ArrayList arrayList;
        C219829nU c219829nU;
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null) {
            bundle.putBoolean("BUNDLE_KEY_IS_AUTOMESSAGE_SENT", anonymousClass983.A0h);
            String str = anonymousClass983.A0e;
            if (str != null) {
                AbstractC226339yq.A00(anonymousClass983.A10).A02(str);
                anonymousClass983.A0e = null;
            }
            C159737El c159737El = anonymousClass983.A0R;
            if (c159737El != null) {
                C7DZ c7dz = c159737El.A0b.A09;
                if (c7dz != null) {
                    List<C9NH> list = c7dz.A00.A02;
                    arrayList = new ArrayList();
                    for (C9NH c9nh : list) {
                        if ((c9nh instanceof C219829nU) && (c219829nU = (C219829nU) c9nh) != null) {
                            arrayList.add(c219829nU.A00);
                        }
                    }
                } else {
                    arrayList = new ArrayList();
                }
                if (!arrayList.isEmpty()) {
                    String valueOf = String.valueOf(C0HN.A00());
                    anonymousClass983.A0e = valueOf;
                    if (valueOf != null) {
                        bundle.putString("BUNDLE_KEY_COMPOSER_ATTACHED_MEDIA_STORE_KEY", valueOf);
                        AbstractC226339yq.A00(anonymousClass983.A10).A01(30000L, valueOf, arrayList, false);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null) {
            anonymousClass983.A0I(view, bundle);
            Activity rootActivity = getRootActivity();
            if (rootActivity != null) {
                C43687JTw.A00(rootActivity, null, (UserSession) this.A02.getValue());
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C2d4
    public final C56352iT AYT() {
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null) {
            return anonymousClass983.A04;
        }
        throw new IllegalStateException("Required value was null.");
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

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A02.getValue();
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

    @Override // X.AbstractC59962oe
    public final boolean isContainerFragment() {
        return this.A03;
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
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null) {
            MessageListLayoutManager messageListLayoutManager = AnonymousClass983.A01(anonymousClass983).A0B;
            if (messageListLayoutManager != null) {
                if (messageListLayoutManager.A1b() == messageListLayoutManager.A0U() - 1) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return false;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null && anonymousClass983.onBackPressed()) {
            return true;
        }
        return false;
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

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.7DQ, X.2pj] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51C.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:5:0x001b, B:7:0x0037, B:8:0x003c, B:13:0x004c, B:15:0x0050, B:16:0x0060, B:18:0x0066, B:19:0x0072, B:21:0x007c, B:23:0x00b7, B:24:0x00bc, B:28:0x0084, B:29:0x008b, B:30:0x008c, B:32:0x0080, B:34:0x0098, B:35:0x0090, B:37:0x0094), top: B:4:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:5:0x001b, B:7:0x0037, B:8:0x003c, B:13:0x004c, B:15:0x0050, B:16:0x0060, B:18:0x0066, B:19:0x0072, B:21:0x007c, B:23:0x00b7, B:24:0x00bc, B:28:0x0084, B:29:0x008b, B:30:0x008c, B:32:0x0080, B:34:0x0098, B:35:0x0090, B:37:0x0094), top: B:4:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7 A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:5:0x001b, B:7:0x0037, B:8:0x003c, B:13:0x004c, B:15:0x0050, B:16:0x0060, B:18:0x0066, B:19:0x0072, B:21:0x007c, B:23:0x00b7, B:24:0x00bc, B:28:0x0084, B:29:0x008b, B:30:0x008c, B:32:0x0080, B:34:0x0098, B:35:0x0090, B:37:0x0094), top: B:4:0x001b }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) {
        /*
            r16 = this;
            r0 = 413738276(0x18a92524, float:4.372298E-24)
            int r2 = X.C0f9.A02(r0)
            r13 = 0
            r0 = r17
            X.C14360o3.A0B(r0, r13)
            r0 = r16
            X.983 r5 = r0.A00
            if (r5 == 0) goto Ld4
            java.lang.String r1 = "DirectThreadToggleController.onCreateView"
            r0 = -208041779(0xfffffffff39988cd, float:-2.4328493E31)
            X.AbstractC09800fd.A01(r1, r0)
            X.98N r0 = r5.A1J     // Catch: java.lang.Throwable -> Lcc
            X.3Av r4 = r0.A06     // Catch: java.lang.Throwable -> Lcc
            r9 = 1
            r3 = 0
            r4.A08(r3)     // Catch: java.lang.Throwable -> Lcc
            X.987 r0 = r5.A1T     // Catch: java.lang.Throwable -> Lcc
            r11 = r18
            r0.A02(r11)     // Catch: java.lang.Throwable -> Lcc
            android.app.Activity r0 = X.AnonymousClass983.A00(r5)     // Catch: java.lang.Throwable -> Lcc
            com.instagram.common.session.UserSession r8 = r5.A10     // Catch: java.lang.Throwable -> Lcc
            boolean r0 = X.C43687JTw.A03(r0, r8)     // Catch: java.lang.Throwable -> Lcc
            if (r0 != 0) goto L3c
            r0 = 8
            X.AnonymousClass983.A0B(r5, r0)     // Catch: java.lang.Throwable -> Lcc
        L3c:
            X.2oC r6 = X.AbstractC59652o8.A00(r8)     // Catch: java.lang.Throwable -> Lcc
            int r0 = r6.A02     // Catch: java.lang.Throwable -> Lcc
            if (r0 > 0) goto L45
            r9 = 0
        L45:
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup"
            java.lang.String r1 = "context"
            if (r9 == 0) goto L4c
            goto L8c
        L4c:
            android.content.Context r0 = r5.A02     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto L84
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)     // Catch: java.lang.Throwable -> Lcc
            r0 = 2131625662(0x7f0e06be, float:1.8878538E38)
            android.view.View r6 = r1.inflate(r0, r11, r13)     // Catch: java.lang.Throwable -> Lcc
            X.C14360o3.A0C(r6, r7)     // Catch: java.lang.Throwable -> Lcc
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch: java.lang.Throwable -> Lcc
        L60:
            boolean r0 = X.C7VR.A00(r8)     // Catch: java.lang.Throwable -> Lcc
            if (r0 != 0) goto L72
            r0 = 2131431844(0x7f0b11a4, float:1.8485429E38)
            android.view.View r0 = r6.requireViewById(r0)     // Catch: java.lang.Throwable -> Lcc
            android.view.ViewStub r0 = (android.view.ViewStub) r0     // Catch: java.lang.Throwable -> Lcc
            r0.inflate()     // Catch: java.lang.Throwable -> Lcc
        L72:
            X.2oe r0 = r5.A0u     // Catch: java.lang.Throwable -> Lcc
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()     // Catch: java.lang.Throwable -> Lcc
            boolean r0 = r1 instanceof com.instagram.base.activity.IgFragmentActivity     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto Lb5
            r3 = r1
            com.instagram.base.activity.IgFragmentActivity r3 = (com.instagram.base.activity.IgFragmentActivity) r3     // Catch: java.lang.Throwable -> Lcc
            goto Lb5
        L80:
            android.content.Context r0 = r5.A02     // Catch: java.lang.Throwable -> Lcc
            if (r0 != 0) goto L98
        L84:
            X.C14360o3.A0F(r1)     // Catch: java.lang.Throwable -> Lcc
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> Lcc
            throw r0     // Catch: java.lang.Throwable -> Lcc
        L8c:
            boolean r0 = r6.A07     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto L80
            android.content.Context r0 = r5.A02     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto L84
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> Lcc
        L98:
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r0)     // Catch: java.lang.Throwable -> Lcc
            X.C14360o3.A07(r9)     // Catch: java.lang.Throwable -> Lcc
            r0 = -1
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> Lcc
            r10.<init>(r0, r0)     // Catch: java.lang.Throwable -> Lcc
            boolean r15 = r6.A06     // Catch: java.lang.Throwable -> Lcc
            r12 = 2131625662(0x7f0e06be, float:1.8878538E38)
            r14 = r13
            android.view.View r6 = X.C50802Vb.A00(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lcc
            X.C14360o3.A0C(r6, r7)     // Catch: java.lang.Throwable -> Lcc
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch: java.lang.Throwable -> Lcc
            goto L60
        Lb5:
            if (r3 == 0) goto Lbc
            X.2pj r0 = r5.A0z     // Catch: java.lang.Throwable -> Lcc
            r3.registerOnActivityResultListener(r0)     // Catch: java.lang.Throwable -> Lcc
        Lbc:
            r4.A05()     // Catch: java.lang.Throwable -> Lcc
            r0 = 1521824074(0x5ab5314a, float:2.5500582E16)
            X.AbstractC09800fd.A00(r0)
            r0 = 1419838618(0x54a1049a, float:5.5325355E12)
            X.C0f9.A09(r0, r2)
            return r6
        Lcc:
            r1 = move-exception
            r0 = -902752985(0xffffffffca311527, float:-2901321.8)
            X.AbstractC09800fd.A00(r0)
            throw r1
        Ld4:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 2110165596(0x7dc6925c, float:3.2993386E37)
            X.C0f9.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51C.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.06B] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController;
        C06K c06k;
        C2EE c2ee;
        Integer num;
        String C7I;
        int i;
        C7GN c7gn;
        int A02 = C0f9.A02(-1309604518);
        super.onDestroy();
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null) {
            AbstractC09800fd.A01("DirectThreadToggleController.onDestroy", 1202134614);
            try {
                UserSession userSession = anonymousClass983.A10;
                C28821aL A00 = C4L0.A00(userSession);
                InterfaceC93894Jz interfaceC93894Jz = anonymousClass983.A1K;
                C14360o3.A0B(interfaceC93894Jz, 0);
                synchronized (A00.A02) {
                    try {
                        A00.A03.remove(interfaceC93894Jz);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                AbstractC59962oe abstractC59962oe = anonymousClass983.A0u;
                abstractC59962oe.getChildFragmentManager().A0F.remove(anonymousClass983.A0s);
                abstractC59962oe.getChildFragmentManager().A09 = new Object();
                C7VQ c7vq = anonymousClass983.A1I;
                C0eR c0eR = abstractC59962oe.mLifecycleRegistry;
                C14360o3.A07(c0eR);
                Iterator it = c7vq.A00.iterator();
                while (it.hasNext()) {
                    ((C7VI) it.next()).A06(c0eR);
                }
                C159737El c159737El = anonymousClass983.A0R;
                if (c159737El != null) {
                    C69556VrL c69556VrL = c159737El.A0p;
                    if (c69556VrL != null) {
                        c69556VrL.A01.EWd(false);
                    }
                    C35152Feu c35152Feu = c159737El.A0s;
                    if (c35152Feu != null) {
                        c35152Feu.A05.EhS(C05F.A00);
                    }
                    DirectStickerSuggestionsController directStickerSuggestionsController = c159737El.A0K;
                    if (directStickerSuggestionsController != null && !DirectStickerSuggestionsController.A02(directStickerSuggestionsController)) {
                        C16930sl c16930sl = C16930sl.A00;
                        directStickerSuggestionsController.A0S = new C9CH("", "", c16930sl, c16930sl);
                    }
                    UserSession userSession2 = c159737El.A1Z;
                    C14360o3.A0B(userSession2, 0);
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (!C18U.A06(c06090Tz, userSession2, 36330720335184873L) && (c7gn = c159737El.A0u) != null) {
                        c7gn.A0E();
                    }
                    if (c159737El.A14) {
                        C171617kr A002 = AbstractC171597kp.A00(userSession2);
                        A002.A03 = null;
                        A002.A00 = 0;
                        A002.A01 = null;
                        A002.A02 = null;
                    }
                    C7I0 c7i0 = c159737El.A0Q;
                    if (c7i0 != null && (c2ee = c159737El.A0W) != null && (num = c7i0.A00) != null && num.intValue() == 11 && C159187Ce.A06(userSession2, c2ee) && (C7I = c2ee.C7I()) != null) {
                        C23031Ai A003 = AbstractC23021Ah.A00(userSession2);
                        String C7I2 = c2ee.C7I();
                        if (C7I2 == null) {
                            C7I2 = "";
                        }
                        InterfaceC19630xq interfaceC19630xq = A003.A01;
                        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                        ARD.E77(AnonymousClass001.A0R("broadcast_channel_engagement_conversation_starters_nux/", C7I2), true);
                        ARD.apply();
                        if (C18U.A06(c06090Tz, userSession2, 36319377334541712L) && (i = interfaceC19630xq.getInt(AnonymousClass001.A0R("broadcast_channel_upranked_replies_pill_impression_count/", C7I), 0)) < 3) {
                            InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                            ARD2.E7D(AnonymousClass001.A0R("broadcast_channel_upranked_replies_pill_impression_count/", C7I), i + 1);
                            ARD2.apply();
                        }
                    }
                    FragmentActivity fragmentActivity = (FragmentActivity) AbstractC13320mI.A00(c159737El.A1R, FragmentActivity.class);
                    if (fragmentActivity != null && (c06k = c159737El.A09) != null) {
                        fragmentActivity.getSupportFragmentManager().A0p(c06k);
                    }
                }
                anonymousClass983.A0R = null;
                if (anonymousClass983.A1H.A1Q) {
                    C44164JfT A004 = AbstractC44152JfH.A00(userSession);
                    synchronized (A004) {
                        A004.A02.clear();
                    }
                }
                if (AbstractC201688vy.A00(userSession) && (directAggregatedMediaViewerController = anonymousClass983.A0D) != null) {
                    anonymousClass983.A0y.unregisterLifecycleListener(directAggregatedMediaViewerController);
                    DirectAggregatedMediaViewerController directAggregatedMediaViewerController2 = anonymousClass983.A0D;
                    if (directAggregatedMediaViewerController2 == null) {
                        C14360o3.A0F("directAggregatedMediaViewerController");
                        throw C00O.createAndThrow();
                    }
                    directAggregatedMediaViewerController2.onDestroy();
                }
                C27B c27b = anonymousClass983.A1N;
                c27b.A00 = null;
                c27b.A01.A03(C27B.class);
                C6QM.A00(anonymousClass983);
                C0L6.A04(C0LK.A9y);
                AbstractC09800fd.A00(2030690203);
                this.A00 = null;
                C0f9.A09(1224072752, A02);
                return;
            } catch (Throwable th2) {
                AbstractC09800fd.A00(795495558);
                throw th2;
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        C0f9.A09(1531204676, A02);
        throw illegalStateException;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view;
        IgFragmentActivity igFragmentActivity;
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController;
        C7GN c7gn;
        LG2 lg2;
        C8SE c8se;
        InterfaceC37220GaV interfaceC37220GaV;
        ViewGroup viewGroup;
        int A02 = C0f9.A02(1030193657);
        super.onDestroyView();
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null) {
            AbstractC09800fd.A01("DirectThreadToggleController.onDestroyView", 2038189842);
            try {
                C3EQ c3eq = anonymousClass983.A0P;
                if (c3eq != null) {
                    c3eq.A01();
                }
                anonymousClass983.A0P = null;
                FrameLayout frameLayout = anonymousClass983.A03;
                if (frameLayout != null) {
                    view = frameLayout.getRootView();
                } else {
                    view = null;
                }
                if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                    viewGroup.removeView(anonymousClass983.A03);
                }
                AnonymousClass983.A0B(anonymousClass983, 0);
                anonymousClass983.A0Z = null;
                anonymousClass983.A0Y = null;
                anonymousClass983.A0N = null;
                C22996ABv c22996ABv = anonymousClass983.A08;
                if (c22996ABv != null) {
                    c22996ABv.A00();
                }
                anonymousClass983.A08 = null;
                FR3 fr3 = anonymousClass983.A09;
                if (fr3 != null) {
                    fr3.A00();
                }
                anonymousClass983.A09 = null;
                C55076OaW c55076OaW = anonymousClass983.A0A;
                if (c55076OaW != null) {
                    AbstractC25651Mw.A00(c55076OaW.A0H).A02(c55076OaW.A0G, C36076FwC.class);
                    C30D.A04(c55076OaW.A0F, AbstractC53242c7.A0F(c55076OaW.A0D, R.attr.igds_color_transparent_navigation_bar));
                }
                anonymousClass983.A0A = null;
                A9L a9l = anonymousClass983.A05;
                if (a9l != null && (interfaceC37220GaV = a9l.A03.A07) != null) {
                    interfaceC37220GaV.DAx();
                }
                anonymousClass983.A05 = null;
                anonymousClass983.A0O = null;
                anonymousClass983.A0S = null;
                anonymousClass983.A03 = null;
                C159737El c159737El = anonymousClass983.A0R;
                if (c159737El != null) {
                    c159737El.A0O = null;
                    c159737El.A0b.A0S.A02(c159737El.A20);
                    C160007Fm c160007Fm = c159737El.A0b;
                    ComposerAutoCompleteTextView composerAutoCompleteTextView = c160007Fm.A0S;
                    composerAutoCompleteTextView.setOnFocusChangeListener(null);
                    C7DZ c7dz = c160007Fm.A09;
                    if (c7dz != null && (c8se = c160007Fm.A06) != null) {
                        c7dz.A00(new ArrayList());
                        c8se.notifyDataSetChanged();
                    }
                    DataSetObserver dataSetObserver = c160007Fm.A03;
                    Adapter adapter = c160007Fm.A04;
                    if (adapter != null && dataSetObserver != null) {
                        adapter.unregisterDataSetObserver(dataSetObserver);
                    }
                    composerAutoCompleteTextView.A02(c160007Fm.A0A);
                    UserSession userSession = c160007Fm.A0K;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36318033005057881L)) {
                        C7ON c7on = c160007Fm.A0B;
                        if (c7on != null) {
                            c160007Fm.A0R.removeTextChangedListener(c7on);
                        }
                        composerAutoCompleteTextView.removeTextChangedListener(c160007Fm.A0H);
                    }
                    composerAutoCompleteTextView.A00 = null;
                    c159737El.A0b.A0R.setInputContentInfoListener(null, null);
                    c159737El.A1b.EFx(c159737El.A1a);
                    C160607Hu c160607Hu = c159737El.A0t;
                    if (c160607Hu != null && (lg2 = c160607Hu.A06) != null) {
                        lg2.A01.A01();
                    }
                    UserSession userSession2 = c159737El.A1Z;
                    C14360o3.A0B(userSession2, 0);
                    if (C18U.A06(c06090Tz, userSession2, 36330720335184873L) && (c7gn = c159737El.A0u) != null) {
                        c7gn.A0E();
                    }
                    c159737El.A0P = null;
                    c159737El.A0t = null;
                    c159737El.A1Y.A01();
                    if (c159737El.A0F != null) {
                        AbstractC25651Mw.A00(userSession2).A02(c159737El.A0F, C36076FwC.class);
                    }
                    InterfaceC41501vz interfaceC41501vz = c159737El.A0E;
                    if (interfaceC41501vz != null) {
                        AbstractC25651Mw.A00(userSession2).A02(interfaceC41501vz, C36081FwH.class);
                    }
                    if (c159737El.A0B != null) {
                        AbstractC25651Mw.A00(userSession2).A02(c159737El.A0B, C23610Ad5.class);
                    }
                    C159737El.A0d(c159737El);
                }
                anonymousClass983.A0U = null;
                anonymousClass983.A07 = null;
                anonymousClass983.A1T.A01();
                C3I9 c3i9 = anonymousClass983.A06;
                if (c3i9 != null) {
                    c3i9.EFx(anonymousClass983.A12);
                }
                if (!AbstractC201688vy.A00(anonymousClass983.A10) && (directAggregatedMediaViewerController = anonymousClass983.A0D) != null) {
                    anonymousClass983.A0y.unregisterLifecycleListener(directAggregatedMediaViewerController);
                }
                C25671My c25671My = anonymousClass983.A0v;
                c25671My.A02(anonymousClass983.A0x, C7IB.class);
                c25671My.A02(anonymousClass983.A0w, C7IC.class);
                FragmentActivity requireActivity = anonymousClass983.A0u.requireActivity();
                if ((requireActivity instanceof IgFragmentActivity) && (igFragmentActivity = (IgFragmentActivity) requireActivity) != null) {
                    igFragmentActivity.unregisterOnActivityResultListener(anonymousClass983.A0z);
                }
                AbstractC09800fd.A00(2112529273);
                C0f9.A09(-1902163653, A02);
                return;
            } catch (Throwable th) {
                AbstractC09800fd.A00(1317681875);
                throw th;
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        C0f9.A09(-620647596, A02);
        throw illegalStateException;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1812148158);
        super.onPause();
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null) {
            AbstractC09800fd.A01("DirectThreadToggleController.onPause", -706899908);
            try {
                C3EQ c3eq = anonymousClass983.A0P;
                if (c3eq != null) {
                    c3eq.A01();
                }
                AnonymousClass983.A06(anonymousClass983).A1C();
                AnonymousClass983.A0D(anonymousClass983, false);
                C3I9 c3i9 = anonymousClass983.A06;
                if (c3i9 != null) {
                    c3i9.onStop();
                }
                anonymousClass983.A0l = false;
                anonymousClass983.A0I = null;
                AbstractC09800fd.A00(751270583);
                C0f9.A09(-1030472613, A02);
                return;
            } catch (Throwable th) {
                AbstractC09800fd.A00(-1667314239);
                throw th;
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        C0f9.A09(-451968309, A02);
        throw illegalStateException;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C3DN A00;
        C56352iT c56352iT;
        int A02 = C0f9.A02(833653553);
        super.onResume();
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null) {
            AbstractC09800fd.A01("DirectThreadToggleController.onResume", 973709640);
            try {
                if (!((C159457Dg) anonymousClass983.A1Z.getValue()).A09) {
                    if (C18U.A06(C06090Tz.A05, anonymousClass983.A10, 36324612892930336L) && (c56352iT = anonymousClass983.A04) != null) {
                        InterfaceC60122ou interfaceC60122ou = anonymousClass983.A0t;
                        C14360o3.A0B(interfaceC60122ou, 0);
                        c56352iT.A0W.put(interfaceC60122ou, null);
                    }
                    C56352iT c56352iT2 = anonymousClass983.A04;
                    if (c56352iT2 != null) {
                        c56352iT2.A0X(anonymousClass983.A0t);
                    }
                }
                ((C98O) anonymousClass983.A1J).A05.A08(null);
                AnonymousClass983.A06(anonymousClass983).A1D();
                UserSession userSession = anonymousClass983.A10;
                C3M9.A00(userSession).A00(anonymousClass983.A1Q);
                C3I9 c3i9 = anonymousClass983.A06;
                if (c3i9 != null) {
                    c3i9.Dnr(anonymousClass983.A0u.requireActivity());
                }
                anonymousClass983.A0l = true;
                C3EQ c3eq = anonymousClass983.A0P;
                if (c3eq != null) {
                    c3eq.A02();
                }
                AnonymousClass983.A0A(anonymousClass983);
                AnonymousClass983.A09(anonymousClass983);
                String str = anonymousClass983.A0e;
                if (str != null) {
                    AbstractC226339yq.A00(userSession).A02(str);
                    anonymousClass983.A0e = null;
                }
                if (C18U.A06(C06090Tz.A05, userSession, 2342163413040505306L) && AnonymousClass983.A0G(anonymousClass983) && (A00 = C3DN.A00.A00(anonymousClass983.A0u.requireActivity())) != null) {
                    A00.A0C();
                }
                AbstractC09800fd.A00(-2146290546);
                C0f9.A09(-1259060686, A02);
                return;
            } catch (Throwable th) {
                AbstractC09800fd.A00(1063804840);
                throw th;
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        C0f9.A09(-1510456451, A02);
        throw illegalStateException;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-272883288);
        super.onStart();
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null) {
            AbstractC09800fd.A01("DirectThreadToggleController.onStart", 1625673167);
            try {
                if (anonymousClass983.A01 > 0) {
                    C226218q.A01(AbstractC12960li.A00).A0T(anonymousClass983.A1M);
                    View view = anonymousClass983.A0u.mView;
                    if (view != null) {
                        view.post(new RunnableC24443AsO(anonymousClass983));
                    }
                }
                Window window = AnonymousClass983.A00(anonymousClass983).getWindow();
                if (window != null) {
                    window.setSoftInputMode(48);
                    AbstractC09800fd.A00(1579814788);
                    C0f9.A09(-816523804, A02);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } catch (Throwable th) {
                AbstractC09800fd.A00(-1932500443);
                throw th;
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        C0f9.A09(-1799205538, A02);
        throw illegalStateException;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1943184973);
        super.onStop();
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null) {
            AbstractC09800fd.A01("DirectThreadToggleController.onStop", 56165399);
            anonymousClass983.A01++;
            AnonymousClass983.A0C(anonymousClass983, true);
            try {
                Window window = AnonymousClass983.A00(anonymousClass983).getWindow();
                if (window != null) {
                    window.setSoftInputMode(48);
                    AbstractC09800fd.A00(-1158606905);
                    C0f9.A09(-352702058, A02);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } catch (Throwable th) {
                AbstractC09800fd.A00(-1173626127);
                throw th;
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        C0f9.A09(1095243848, A02);
        throw illegalStateException;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        int A02 = C0f9.A02(1325369390);
        super.onViewStateRestored(bundle);
        AnonymousClass983 anonymousClass983 = this.A00;
        if (anonymousClass983 != null) {
            AnonymousClass983.A06(anonymousClass983).A1F();
            C0f9.A09(1978853213, A02);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
            C0f9.A09(-1250697934, A02);
            throw illegalStateException;
        }
    }
}
