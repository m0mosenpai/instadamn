package X;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;

/* renamed from: X.2oU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59872oU implements InterfaceC53912dV {
    public Boolean A02;
    public boolean A03;
    public float A04;
    public final int A05;
    public final Activity A06;
    public final ViewGroup A07;
    public final Window A08;
    public final ViewGroup A09;
    public int A01 = 3;
    public int A00 = 0;

    public static void A00(C59872oU c59872oU, boolean z) {
        boolean z2;
        int systemUiVisibility;
        int i;
        int i2;
        int i3 = c59872oU.A01;
        if (i3 == 2) {
            C2OG.A01().A07();
        } else if (i3 == 1 || i3 == 3) {
            C2OG.A01().A08();
        }
        if (c59872oU.A01 == 1) {
            c59872oU.A08.addFlags(1024);
            z2 = true;
        } else {
            Boolean bool = c59872oU.A02;
            if (bool == null || bool.booleanValue()) {
                c59872oU.A08.clearFlags(1024);
                z2 = false;
            }
            Window window = c59872oU.A08;
            systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            i = c59872oU.A01;
            if (i == 1 && i != 2) {
                i2 = systemUiVisibility & (-5);
            } else {
                window.getDecorView().setBackgroundColor(c59872oU.A06.getColor(R.color.black));
                i2 = systemUiVisibility | 4;
            }
            window.getDecorView().setSystemUiVisibility(i2);
            c59872oU.A01(z);
            C30D.A06(c59872oU.A06, z);
            c59872oU.A00 = c59872oU.A01;
        }
        c59872oU.A02 = z2;
        Window window2 = c59872oU.A08;
        systemUiVisibility = window2.getDecorView().getSystemUiVisibility();
        i = c59872oU.A01;
        if (i == 1) {
        }
        window2.getDecorView().setBackgroundColor(c59872oU.A06.getColor(R.color.black));
        i2 = systemUiVisibility | 4;
        window2.getDecorView().setSystemUiVisibility(i2);
        c59872oU.A01(z);
        C30D.A06(c59872oU.A06, z);
        c59872oU.A00 = c59872oU.A01;
    }

    private void A01(boolean z) {
        if (this.A03) {
            if (this.A01 == 3) {
                AbstractC56402iY.A06(this.A06, z);
            }
            if (this.A04 > 0.0f) {
                Activity activity = this.A06;
                AbstractC65987Txg.A01(activity, activity.getColor(R.color.fds_transparent));
            }
        }
        if (this.A01 == 3) {
            AbstractC56402iY.A06(this.A06, z);
        }
    }

    public C59872oU(Activity activity, final View view) {
        this.A06 = activity;
        Window window = activity.getWindow();
        window.getClass();
        this.A08 = window;
        this.A07 = (ViewGroup) activity.requireViewById(R.id.bottom_sheet_camera_container);
        this.A09 = (ViewGroup) activity.requireViewById(R.id.activity_and_camera_shared_views_main_container);
        this.A05 = activity.getColor(AbstractC53242c7.A0H(activity, R.attr.igds_color_primary_background));
        C57982lB.A00(this.A06, new InterfaceC59892oW() { // from class: X.2oV
            @Override // X.InterfaceC59892oW
            public final void Dnp(final int i, final int i2) {
                C59872oU c59872oU = this;
                View view2 = view;
                final int i3 = c59872oU.A05;
                int i4 = 0;
                view2.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(i3, i) { // from class: X.3Nq
                    public final int A00;

                    @Override // android.graphics.drawable.Drawable
                    public final void setBounds(int i5, int i6, int i7, int i8) {
                        super.setBounds(i5, i6, i7, this.A00);
                    }

                    {
                        this.A00 = i;
                    }
                }, new ColorDrawable(i3, i2) { // from class: X.3Nr
                    public final int A00;

                    @Override // android.graphics.drawable.Drawable
                    public final void setBounds(int i5, int i6, int i7, int i8) {
                        super.setBounds(i5, i8 - this.A00, i7, i8);
                    }

                    {
                        this.A00 = i2;
                    }
                }}));
                Activity activity2 = c59872oU.A06;
                View requireViewById = activity2.requireViewById(R.id.layout_container_center_right_coordinator_layout);
                View requireViewById2 = activity2.requireViewById(R.id.overlay_layout_container);
                if (i2 <= 0) {
                    C0w9.A03(AnonymousClass001.A0R("SwipeNavigationStatusBarManagerHideNavBarLayout", "_stable_nav_bar"), AnonymousClass001.A0O("stable nav bar height is ", i2));
                }
                AbstractC13880nE.A0U(requireViewById, i2);
                AbstractC13880nE.A0U(requireViewById2, i2);
                View findViewById = activity2.findViewById(R.id.modal_container_stub);
                if (findViewById == null) {
                    findViewById = activity2.requireViewById(R.id.modal_container);
                }
                AbstractC13880nE.A0U(findViewById, i2);
                if (AbstractC13440mV.A07()) {
                    i4 = AbstractC13440mV.A00();
                }
                ViewGroup viewGroup = c59872oU.A07;
                AbstractC13880nE.A0f(viewGroup, i4);
                AbstractC13880nE.A0U(viewGroup, i2);
            }
        }, false);
        AbstractC13880nE.A0q(view, new Runnable() { // from class: X.2oY
            @Override // java.lang.Runnable
            public final void run() {
                C59872oU.this.A03 = AbstractC13440mV.A07();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (r10.A00 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    @Override // X.InterfaceC53912dV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DWU(X.C54822fg r11) {
        /*
            r10 = this;
            r0 = 1593736988(0x5efe7f1c, float:9.1692035E18)
            int r3 = X.C0f9.A03(r0)
            X.2eL r0 = r11.A04
            float r2 = r11.A01
            float r8 = r10.A04
            float r0 = r0.A01(r2)
            r10.A04 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 0
            r7 = 1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L1d
            r1 = 1
        L1d:
            r4 = r1 ^ 1
            int r0 = (int) r2
            float r0 = (float) r0
            float r2 = r2 - r0
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L28
            r9 = 1
        L28:
            if (r1 == 0) goto L40
            android.view.ViewGroup r5 = r10.A09
            android.view.ViewGroup r2 = r10.A07
        L2e:
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L47
            r1 = 0
            android.view.View r0 = r5.getChildAt(r1)
            r5.removeViewAt(r1)
            r2.addView(r0)
            goto L2e
        L40:
            if (r9 == 0) goto L47
            android.view.ViewGroup r5 = r10.A07
            android.view.ViewGroup r2 = r10.A09
            goto L2e
        L47:
            boolean r0 = r10.A03
            r2 = 3
            if (r0 == 0) goto L64
            r10.A01 = r2
            if (r9 != 0) goto L73
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L5d
            float r0 = r10.A04
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L5d
            r10.A01(r4)
        L5d:
            r0 = 1561135136(0x5d0d0820, float:6.351505E17)
            X.C0f9.A0A(r0, r3)
            return
        L64:
            float r1 = r10.A04
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L7d
            r10.A01 = r7
            r1 = 1
        L6f:
            int r0 = r10.A00
            if (r0 == r1) goto L5d
        L73:
            boolean r0 = X.C57992lC.A03()
            if (r0 == 0) goto L8a
            A00(r10, r4)
            goto L5d
        L7d:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L85
            r10.A01 = r2
            r1 = 3
            goto L6f
        L85:
            r0 = 2
            r10.A01 = r0
            r1 = 2
            goto L6f
        L8a:
            X.3Db r2 = new X.3Db
            r2.<init>()
            android.app.Activity r1 = r10.A06
            X.2lC r0 = X.C57982lB.A0B
            r0.A05(r1, r2)
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59872oU.DWU(X.2fg):void");
    }
}
