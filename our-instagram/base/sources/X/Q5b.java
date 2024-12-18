package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes10.dex */
public class Q5b extends UD5 {
    public FrameLayout A00;
    public VK4 A01;
    public VK4 A02;
    public BottomSheetBehavior A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public FrameLayout A08;
    public CoordinatorLayout A09;

    @Override // X.UD5, X.DialogC12630l8, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(A01(view, layoutParams, 0));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q5b(android.content.Context r5, int r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L17
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 2130968782(0x7f0400ce, float:1.7546227E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r3, r0)
            if (r0 == 0) goto L49
            int r6 = r3.resourceId
        L17:
            r4.<init>(r5, r6)
            r2 = 1
            r4.A04 = r2
            r4.A05 = r2
            r1 = 3
            X.ROp r0 = new X.ROp
            r0.<init>(r4, r1)
            r4.A01 = r0
            X.2Zy r0 = r4.A05()
            r0.A0Q(r2)
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            r0 = 2130969357(0x7f04030d, float:1.7547394E38)
            r1 = 0
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r0)
            boolean r0 = r0.getBoolean(r1, r1)
            r4.A07 = r0
            return
        L49:
            r6 = 2132018360(0x7f1404b8, float:1.9675024E38)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q5b.<init>(android.content.Context, int):void");
    }

    private void A02() {
        if (this.A08 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.A08 = frameLayout;
            this.A09 = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.A08.findViewById(R.id.design_bottom_sheet);
            this.A00 = frameLayout2;
            BottomSheetBehavior A01 = BottomSheetBehavior.A01(frameLayout2);
            this.A03 = A01;
            A01.A0a(this.A01);
            this.A03.A0b(this.A04);
        }
    }

    public final BottomSheetBehavior A07() {
        if (this.A03 == null) {
            A02();
        }
        return this.A03;
    }

    private FrameLayout A01(View view, ViewGroup.LayoutParams layoutParams, int i) {
        A02();
        ViewGroup viewGroup = (ViewGroup) this.A08.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = AbstractC31172DnG.A0A(getLayoutInflater(), viewGroup, i);
        }
        if (this.A07) {
            AbstractC008903d.A00(this.A00, new C63594Sq1(this, 2));
        }
        this.A00.removeAllViews();
        FrameLayout frameLayout = this.A00;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        ViewOnClickListenerC63508Sob.A01(viewGroup.findViewById(R.id.touch_outside), 61, this);
        AbstractC010103p.A0B(this.A00, new UEP(this, 2));
        ViewOnTouchListenerC63511Soe.A00(this.A00, 7, this);
        return this.A08;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        A07();
        super.cancel();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (android.graphics.Color.alpha(r3.getNavigationBarColor()) >= 255) goto L8;
     */
    @Override // android.app.Dialog, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            android.view.Window r3 = r4.getWindow()
            if (r3 == 0) goto L38
            boolean r0 = r4.A07
            if (r0 == 0) goto L1a
            int r0 = r3.getNavigationBarColor()
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 < r0) goto L1b
        L1a:
            r2 = 0
        L1b:
            android.widget.FrameLayout r1 = r4.A08
            if (r1 == 0) goto L24
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L24:
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.A09
            if (r1 == 0) goto L2d
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L2d:
            if (r2 == 0) goto L38
            r1 = 768(0x300, float:1.076E-42)
            android.view.View r0 = r3.getDecorView()
            r0.setSystemUiVisibility(r1)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q5b.onAttachedToWindow():void");
    }

    @Override // X.UD5, X.DialogC12630l8, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // X.DialogC12630l8, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A03;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0G == 5) {
            bottomSheetBehavior.A0W(4);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.A04 != z) {
            this.A04 = z;
            BottomSheetBehavior bottomSheetBehavior = this.A03;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0b(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.A04) {
            this.A04 = true;
        }
        this.A05 = z;
        this.A06 = true;
    }

    @Override // X.UD5, X.DialogC12630l8, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(A01(view, null, 0));
    }

    @Override // X.UD5, X.DialogC12630l8, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(A01(null, null, i));
    }
}
