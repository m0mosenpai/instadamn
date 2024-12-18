package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.5b2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119455b2 extends View implements InterfaceC119265ai {
    public static Field A0F;
    public static Method A0G;
    public static boolean A0H;
    public static boolean A0I;
    public boolean A00;
    public int A01;
    public long A02;
    public Rect A03;
    public InterfaceC16820sZ A04;
    public InterfaceC16620sF A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final BIP A09;
    public final long A0A;
    public final AnonymousClass595 A0B;
    public final AndroidComposeView A0C;
    public final BIL A0D;
    public final BIO A0E;
    public static final C119465b3 A0K = new Object();
    public static final InterfaceC16620sF A0L = C119475b4.A00;
    public static final ViewOutlineProvider A0J = new ViewOutlineProvider() { // from class: X.5b5
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            C14360o3.A0C(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            boolean z = C119455b2.A0H;
            Outline A01 = ((C119455b2) view).A09.A01();
            C14360o3.A0A(A01);
            outline.set(A01);
        }
    };

    @Override // X.InterfaceC119265ai
    public final void EKy(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        this.A0D.addView(this);
        this.A06 = false;
        this.A07 = false;
        this.A02 = C5AD.A01;
        this.A05 = interfaceC16620sF;
        this.A04 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC119265ai
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.A0C;
        androidComposeView.A09 = true;
        this.A05 = null;
        this.A04 = null;
        androidComposeView.A0J(this);
        this.A0D.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    private final void A00() {
        Rect rect;
        if (this.A06) {
            Rect rect2 = this.A03;
            if (rect2 == null) {
                this.A03 = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.A03;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z) {
        if (z != this.A00) {
            this.A00 = z;
            this.A0C.A0K(this, z);
        }
    }

    @Override // X.InterfaceC119265ai
    public final void COz(float[] fArr) {
        float[] A00 = this.A0E.A00(this);
        if (A00 != null) {
            C5AJ.A05(fArr, A00);
        }
    }

    @Override // X.InterfaceC119265ai
    public final void Cmr(C119515b8 c119515b8, boolean z) {
        float[] A01;
        BIO bio = this.A0E;
        if (z) {
            A01 = bio.A00(this);
            if (A01 == null) {
                c119515b8.A01 = 0.0f;
                c119515b8.A03 = 0.0f;
                c119515b8.A02 = 0.0f;
                c119515b8.A00 = 0.0f;
                return;
            }
        } else {
            A01 = bio.A01(this);
        }
        C5AJ.A01(c119515b8, A01);
    }

    @Override // X.InterfaceC119265ai
    public final long Cms(long j, boolean z) {
        float[] A01;
        BIO bio = this.A0E;
        if (z) {
            A01 = bio.A00(this);
            if (A01 == null) {
                return 9187343241974906880L;
            }
        } else {
            A01 = bio.A01(this);
        }
        return C5AJ.A00(A01, j);
    }

    @Override // X.InterfaceC119265ai
    public final void Cpt(long j) {
        int i = (int) (j >> 32);
        if (i != getLeft()) {
            offsetLeftAndRight(i - getLeft());
            BIO bio = this.A0E;
            bio.A00 = true;
            bio.A01 = true;
        }
        int i2 = (int) (j & 4294967295L);
        if (i2 != getTop()) {
            offsetTopAndBottom(i2 - getTop());
            BIO bio2 = this.A0E;
            bio2.A00 = true;
            bio2.A01 = true;
        }
    }

    @Override // X.InterfaceC119265ai
    public final void EK5(long j) {
        ViewOutlineProvider viewOutlineProvider;
        int i = (int) (j >> 32);
        int A00 = C119055aN.A00(j);
        if (i != getWidth() || A00 != getHeight()) {
            long j2 = this.A02;
            long j3 = C5AD.A01;
            setPivotX(Float.intBitsToFloat((int) (j2 >> 32)) * i);
            setPivotY(Float.intBitsToFloat((int) (this.A02 & 4294967295L)) * A00);
            if (this.A09.A01() != null) {
                viewOutlineProvider = A0J;
            } else {
                viewOutlineProvider = null;
            }
            setOutlineProvider(viewOutlineProvider);
            layout(getLeft(), getTop(), getLeft() + i, getTop() + A00);
            A00();
            BIO bio = this.A0E;
            bio.A00 = true;
            bio.A01 = true;
        }
    }

    @Override // X.InterfaceC119265ai
    public final void F8K(float[] fArr) {
        C5AJ.A05(fArr, this.A0E.A01(this));
    }

    @Override // X.InterfaceC119265ai
    public final void FAl() {
        if (this.A00 && !A0I) {
            A0K.A00(this);
            setInvalidated(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        if (r14.A0I == X.C5AF.A00) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        if (r14.A0I != X.C5AF.A00) goto L48;
     */
    @Override // X.InterfaceC119265ai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FBI(X.C1132059i r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119455b2.FBI(X.59i):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r7.isHardwareAccelerated() == false) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            X.595 r0 = r6.A0B
            X.596 r5 = r0.A00
            android.graphics.Canvas r4 = r5.A00
            r5.A00 = r7
            X.60Y r0 = r6.getManualClipPath()
            r3 = 0
            if (r0 != 0) goto L16
            boolean r0 = r7.isHardwareAccelerated()
            r2 = 0
            if (r0 != 0) goto L1f
        L16:
            r2 = 1
            r5.ELZ()
            X.BIP r0 = r6.A09
            r0.A02(r5)
        L1f:
            X.0sF r1 = r6.A05
            if (r1 == 0) goto L27
            r0 = 0
            r1.invoke(r5, r0)
        L27:
            if (r2 == 0) goto L2c
            r5.EKS()
        L2c:
            r5.A00 = r4
            r6.setInvalidated(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119455b2.dispatchDraw(android.graphics.Canvas):void");
    }

    public final BIL getContainer() {
        return this.A0D;
    }

    public long getLayerId() {
        return this.A0A;
    }

    public final AndroidComposeView getOwnerView() {
        return this.A0C;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC72512XfR.A00(this.A0C);
        }
        return -1L;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.A08;
    }

    public C119455b2(AndroidComposeView androidComposeView, BIL bil, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        super(androidComposeView.getContext());
        this.A0C = androidComposeView;
        this.A0D = bil;
        this.A05 = interfaceC16620sF;
        this.A04 = interfaceC16820sZ;
        this.A09 = new BIP();
        this.A0B = new AnonymousClass595();
        this.A0E = new BIO(A0L);
        this.A02 = C5AD.A01;
        this.A08 = true;
        setWillNotDraw(false);
        bil.addView(this);
        this.A0A = View.generateViewId();
    }

    private final C60Y getManualClipPath() {
        if (getClipToOutline()) {
            BIP bip = this.A09;
            if (!(!bip.A07)) {
                BIP.A00(bip);
                return bip.A04;
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC119265ai
    public final void AQq(AnonymousClass585 anonymousClass585, GraphicsLayer graphicsLayer) {
        boolean z = false;
        if (getElevation() > 0.0f) {
            z = true;
        }
        this.A07 = z;
        if (z) {
            anonymousClass585.ARv();
        }
        this.A0D.A00(this, anonymousClass585, getDrawingTime());
        if (this.A07) {
            anonymousClass585.APZ();
        }
    }

    @Override // X.InterfaceC119265ai
    public final boolean CWG(long j) {
        float A01 = C119365at.A01(j);
        float A02 = C119365at.A02(j);
        if (this.A06) {
            if (0.0f > A01 || A01 >= getWidth() || 0.0f > A02 || A02 >= getHeight()) {
                return false;
            }
        } else if (getClipToOutline()) {
            return this.A09.A03(j);
        }
        return true;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @Override // android.view.View, X.InterfaceC119265ai
    public final void invalidate() {
        int A03 = C0f9.A03(-1441561288);
        if (!this.A00) {
            setInvalidated(true);
            super.invalidate();
            this.A0C.invalidate();
        }
        C0f9.A0A(-1432923878, A03);
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }
}
