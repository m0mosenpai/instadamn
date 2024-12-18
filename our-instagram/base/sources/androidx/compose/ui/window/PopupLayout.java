package androidx.compose.ui.window;

import X.AbstractC113765Bo;
import X.AbstractC119215ad;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25227BEk;
import X.AbstractC25228BEl;
import X.AbstractC25231BEo;
import X.AbstractC25232BEp;
import X.AbstractC28378Cfh;
import X.AbstractC28413CgJ;
import X.AnonymousClass583;
import X.B4Z;
import X.C0f9;
import X.C0fH;
import X.C119055aN;
import X.C119365at;
import X.C14360o3;
import X.C28268CdD;
import X.C30499Dbi;
import X.C3Z5;
import X.C57I;
import X.C5BW;
import X.C5TM;
import X.C5Tl;
import X.C5UU;
import X.CUY;
import X.D8S;
import X.DK1;
import X.InterfaceC1127157b;
import X.InterfaceC1131459c;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC30914DiR;
import X.InterfaceC30915DiS;
import X.InterfaceC74953Yl;
import X.InterfaceC74963Ym;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes5.dex */
public final class PopupLayout extends C5TM {
    public static final InterfaceC16660sJ A0J = DK1.A00;
    public AnonymousClass583 A00;
    public InterfaceC30915DiS A01;
    public CUY A02;
    public Object A03;
    public String A04;
    public InterfaceC16820sZ A05;
    public C28268CdD A06;
    public boolean A07;
    public final Rect A08;
    public final View A09;
    public final WindowManager.LayoutParams A0A;
    public final WindowManager A0B;
    public final InterfaceC74953Yl A0C;
    public final InterfaceC74953Yl A0D;
    public final InterfaceC74953Yl A0E;
    public final InterfaceC74963Ym A0F;
    public final C5BW A0G;
    public final InterfaceC30914DiR A0H;
    public final int[] A0I;

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.0pT, java.lang.Object] */
    public final void A09() {
        C119055aN m2getPopupContentSizebOM6tXw;
        C28268CdD c28268CdD = this.A06;
        if (c28268CdD != null && (m2getPopupContentSizebOM6tXw = m2getPopupContentSizebOM6tXw()) != null) {
            long j = m2getPopupContentSizebOM6tXw.A00;
            Rect rect = this.A08;
            InterfaceC30914DiR interfaceC30914DiR = this.A0H;
            this.A09.getWindowVisibleDisplayFrame(rect);
            long A00 = AbstractC119215ad.A00(rect.right - rect.left, rect.bottom - rect.top);
            ?? obj = new Object();
            obj.A00 = 0L;
            this.A0G.A02(this, new D8S(c28268CdD, this, obj, A00, j), A0J);
            WindowManager.LayoutParams layoutParams = this.A0A;
            long j2 = obj.A00;
            layoutParams.x = (int) (j2 >> 32);
            layoutParams.y = AbstractC25228BEl.A02(j2);
            interfaceC30914DiR.EV3(this, (int) (A00 >> 32), C119055aN.A00(A00));
            this.A0B.updateViewLayout(this, layoutParams);
        }
    }

    public C5TM getSubCompositionView() {
        return this;
    }

    public /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.DiR] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PopupLayout(android.view.View r7, X.InterfaceC1128957x r8, X.InterfaceC30915DiS r9, X.CUY r10, java.lang.String r11, java.util.UUID r12, X.InterfaceC16820sZ r13) {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto Lf3
            X.BbB r0 = new X.BbB
            r0.<init>()
        Lb:
            android.content.Context r1 = r7.getContext()
            r2 = 0
            r4 = 0
            r6.<init>(r1, r2, r4)
            r6.A05 = r13
            r6.A02 = r10
            r6.A04 = r11
            r6.A09 = r7
            r6.A0H = r0
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            r0 = 2
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            X.C14360o3.A0C(r1, r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            r6.A0B = r1
            android.view.WindowManager$LayoutParams r3 = new android.view.WindowManager$LayoutParams
            r3.<init>()
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r3.gravity = r0
            X.CUY r5 = r6.A02
            android.view.View r1 = r6.A09
            boolean r0 = X.AbstractC28413CgJ.A02(r1)
            if (r0 == 0) goto Led
            int r0 = r5.A00
            r0 = r0 | 8192(0x2000, float:1.148E-41)
        L48:
            r3.flags = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r3.type = r0
            android.os.IBinder r0 = r1.getApplicationWindowToken()
            r3.token = r0
            r0 = -2
            r3.width = r0
            r3.height = r0
            r0 = -3
            r3.format = r0
            android.content.res.Resources r1 = X.AbstractC25228BEl.A0M(r1)
            r0 = 2131957631(0x7f13177f, float:1.9551851E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setTitle(r0)
            r6.A0A = r3
            r6.A01 = r9
            X.583 r0 = X.AnonymousClass583.Ltr
            r6.A00 = r0
            r3 = 2
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.AbstractC25230BEn.A0U(r2)
            r6.A0E = r0
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.AbstractC25229BEm.A0R(r2)
            r6.A0D = r0
            r1 = 11
            X.Pfo r0 = new X.Pfo
            r0.<init>(r6, r1)
            X.5Bp r0 = X.AbstractC25225BEi.A0L(r2, r0)
            r6.A0F = r0
            r5 = 1090519040(0x41000000, float:8.0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.A08 = r0
            r0 = 47
            X.DRU r1 = X.DRU.A00(r6, r0)
            X.5BW r0 = new X.5BW
            r0.<init>(r1)
            r6.A0G = r0
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            r6.setId(r0)
            X.07X r0 = X.AbstractC55832hO.A00(r7)
            X.AbstractC55832hO.A01(r6, r0)
            X.07e r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner.A00(r7)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.A01(r6, r0)
            X.0c6 r0 = X.AbstractC55842hQ.A00(r7)
            X.AbstractC55842hQ.A01(r6, r0)
            r2 = 2131430570(0x7f0b0caa, float:1.8482845E38)
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Popup:"
            java.lang.String r0 = X.AbstractC167017dG.A0n(r12, r0, r1)
            r6.setTag(r2, r0)
            r6.setClipChildren(r4)
            float r0 = r8.EqT(r5)
            r6.setElevation(r0)
            r1 = 1
            X.BYy r0 = new X.BYy
            r0.<init>(r1)
            r6.setOutlineProvider(r0)
            X.0sF r0 = X.AbstractC27750CLr.A00
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.AbstractC25229BEm.A0R(r0)
            r6.A0C = r0
            int[] r0 = new int[r3]
            r6.A0I = r0
            return
        Led:
            int r0 = r5.A00
            r0 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
            goto L48
        Lf3:
            X.Coc r0 = new X.Coc
            r0.<init>()
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupLayout.<init>(android.view.View, X.57x, X.DiS, X.CUY, java.lang.String, java.util.UUID, X.0sZ):void");
    }

    private final InterfaceC16620sF getContent() {
        return (InterfaceC16620sF) this.A0C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1131459c getParentLayoutCoordinates() {
        return (InterfaceC1131459c) this.A0D.getValue();
    }

    private final void setParentLayoutCoordinates(InterfaceC1131459c interfaceC1131459c) {
        this.A0D.Egh(interfaceC1131459c);
    }

    public final void A0B(AnonymousClass583 anonymousClass583, CUY cuy, String str, InterfaceC16820sZ interfaceC16820sZ) {
        int i;
        this.A05 = interfaceC16820sZ;
        this.A04 = str;
        if (!C14360o3.A0K(this.A02, cuy)) {
            this.A02 = cuy;
            WindowManager.LayoutParams layoutParams = this.A0A;
            if (AbstractC28413CgJ.A02(this.A09)) {
                i = cuy.A00 | 8192;
            } else {
                i = cuy.A00 & (-8193);
            }
            layoutParams.flags = i;
            this.A0B.updateViewLayout(this, layoutParams);
        }
        int ordinal = anonymousClass583.ordinal();
        int i2 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw B4Z.A00();
            }
        } else {
            i2 = 0;
        }
        super.setLayoutDirection(i2);
    }

    public final boolean getCanCalculatePosition() {
        return AbstractC25231BEo.A1U(this.A0F);
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C119055aN m2getPopupContentSizebOM6tXw() {
        return (C119055aN) this.A0E.getValue();
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m3setPopupContentSizefhxjrPA(C119055aN c119055aN) {
        this.A0E.Egh(c119055aN);
    }

    public static final /* synthetic */ InterfaceC1131459c A00(PopupLayout popupLayout) {
        return popupLayout.getParentLayoutCoordinates();
    }

    private final int getDisplayHeight() {
        return Math.round(r2.getResources().getConfiguration().screenHeightDp * AbstractC167007dF.A0K(getContext()).density);
    }

    private final int getDisplayWidth() {
        return Math.round(r2.getResources().getConfiguration().screenWidthDp * AbstractC167007dF.A0K(getContext()).density);
    }

    @Override // X.C5TM
    public final void A05(int i, int i2) {
        super.A05(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    @Override // X.C5TM
    public final void A06(C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-857613600);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, this) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1782097177, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            AbstractC25227BEk.A1P(c5Tl, getContent(), 0);
            if (C0fH.A02()) {
                C0fH.A00(-751951531);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, this, i, 8);
        }
    }

    @Override // X.C5TM
    public final void A07(boolean z, int i, int i2, int i3, int i4) {
        super.A07(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            WindowManager.LayoutParams layoutParams = this.A0A;
            ((ViewGroup.LayoutParams) layoutParams).width = childAt.getMeasuredWidth();
            ((ViewGroup.LayoutParams) layoutParams).height = childAt.getMeasuredHeight();
            this.A0B.updateViewLayout(this, layoutParams);
        }
    }

    public final void A08() {
        InterfaceC1131459c parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null && parentLayoutCoordinates.CQ7()) {
            long Bxd = parentLayoutCoordinates.Bxd();
            long Chp = parentLayoutCoordinates.Chp(0L);
            long A00 = AbstractC113765Bo.A00(Math.round(C119365at.A01(Chp)), Math.round(C119365at.A02(Chp)));
            int i = (int) (A00 >> 32);
            int A02 = AbstractC25228BEl.A02(A00);
            C28268CdD c28268CdD = new C28268CdD(i, A02, i + ((int) (Bxd >> 32)), C119055aN.A00(Bxd) + A02);
            if (!c28268CdD.equals(this.A06)) {
                this.A06 = c28268CdD;
                A09();
            }
        }
    }

    public final void A0A(InterfaceC1131459c interfaceC1131459c) {
        setParentLayoutCoordinates(interfaceC1131459c);
        A08();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && getKeyDispatcherState() != null) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC16820sZ interfaceC16820sZ = this.A05;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                    return true;
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.A0A;
    }

    public final AnonymousClass583 getParentLayoutDirection() {
        return this.A00;
    }

    public final InterfaceC30915DiS getPositionProvider() {
        return this.A01;
    }

    @Override // X.C5TM
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A07;
    }

    public final String getTestTag() {
        return this.A04;
    }

    @Override // X.C5TM, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(2139524641);
        super.onAttachedToWindow();
        C5BW c5bw = this.A0G;
        c5bw.A00 = C3Z5.A01(c5bw.A08);
        if (Build.VERSION.SDK_INT >= 33) {
            Object obj = this.A03;
            if (obj == null) {
                obj = AbstractC28378Cfh.A00(this.A05);
                this.A03 = obj;
            }
            AbstractC28378Cfh.A01(this, obj);
        }
        C0f9.A0D(-723691854, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-335423979);
        super.onDetachedFromWindow();
        C5BW c5bw = this.A0G;
        InterfaceC1127157b interfaceC1127157b = c5bw.A00;
        if (interfaceC1127157b != null) {
            interfaceC1127157b.dispose();
        }
        c5bw.A01();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC28378Cfh.A02(this, this.A03);
        }
        this.A03 = null;
        C0f9.A0D(1433102861, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = C0f9.A05(-958499268);
        boolean z = true;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= AbstractC166987dD.A07(this) || motionEvent.getY() < 0.0f || motionEvent.getY() >= AbstractC166987dD.A08(this))) {
                InterfaceC16820sZ interfaceC16820sZ = this.A05;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                i = -240948272;
            } else if (motionEvent.getAction() == 4) {
                InterfaceC16820sZ interfaceC16820sZ2 = this.A05;
                if (interfaceC16820sZ2 != null) {
                    interfaceC16820sZ2.invoke();
                }
                i = -2012280296;
            }
            C0f9.A0C(i, A05);
            return z;
        }
        z = super.onTouchEvent(motionEvent);
        i = 1611794680;
        C0f9.A0C(i, A05);
        return z;
    }

    public final void setContent(C57I c57i, InterfaceC16620sF interfaceC16620sF) {
        setParentCompositionContext(c57i);
        setContent(interfaceC16620sF);
        this.A07 = true;
    }

    public final void setParentLayoutDirection(AnonymousClass583 anonymousClass583) {
        this.A00 = anonymousClass583;
    }

    public final void setPositionProvider(InterfaceC30915DiS interfaceC30915DiS) {
        this.A01 = interfaceC30915DiS;
    }

    public final void setTestTag(String str) {
        this.A04 = str;
    }

    private final void setContent(InterfaceC16620sF interfaceC16620sF) {
        this.A0C.Egh(interfaceC16620sF);
    }
}
