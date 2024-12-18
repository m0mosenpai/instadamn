package X;

import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.browser.lite.views.BrowserLiteWrapperView;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;

/* loaded from: classes11.dex */
public final class Ut2 extends C668630d {
    public final int A00;
    public final Object A01;

    public Ut2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C68742VbL c68742VbL;
        String str;
        switch (this.A00) {
            case 1:
                Dialog dialog = ((WO6) this.A01).A02.A01;
                if (dialog == null) {
                    return;
                }
                dialog.cancel();
                return;
            case 2:
            case 5:
            default:
                super.Dnk(c55982hj);
                return;
            case 3:
                C14360o3.A0B(c55982hj, 0);
                boolean A1N = AbstractC167007dF.A1N((((float) c55982hj.A09.A00) > 0.0f ? 1 : (((float) c55982hj.A09.A00) == 0.0f ? 0 : -1)));
                C56234Oxh c56234Oxh = (C56234Oxh) this.A01;
                if (A1N) {
                    View view = c56234Oxh.A08;
                    if (view != null) {
                        view.setVisibility(8);
                        View view2 = c56234Oxh.A09;
                        if (view2 != null) {
                            view2.setVisibility(8);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                View view3 = c56234Oxh.A0A;
                if (view3 != null) {
                    view3.setVisibility(8);
                    View view4 = c56234Oxh.A08;
                    if (view4 != null) {
                        view4.bringToFront();
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 4:
                UMD umd = (UMD) this.A01;
                C55982hj c55982hj2 = umd.A0C;
                if (C14360o3.A0K(c55982hj, c55982hj2)) {
                    c55982hj2 = umd.A0D;
                }
                if (!c55982hj2.A0C() || (c68742VbL = umd.A04) == null) {
                    return;
                }
                Integer num = umd.A05;
                Integer num2 = umd.A06;
                Integer num3 = C05F.A00;
                if (num2 == num3) {
                    if (num == num3) {
                        str = "top_left";
                    } else if (num == C05F.A01) {
                        str = "top_right";
                    }
                    C159437De c159437De = c68742VbL.A00;
                    c159437De.A09.A0B(((C7UD) c159437De.A0H.getValue()).A00(), str, null);
                    return;
                }
                if (num2 == C05F.A01 && num == num3) {
                    str = "bottom_left";
                } else {
                    str = "bottom_right";
                }
                C159437De c159437De2 = c68742VbL.A00;
                c159437De2.A09.A0B(((C7UD) c159437De2.A0H.getValue()).A00(), str, null);
                return;
            case 6:
                double d = c55982hj.A09.A00;
                ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p = (ViewOnTouchListenerC67974V4p) this.A01;
                if (d == 1.0d) {
                    if (viewOnTouchListenerC67974V4p.A0A != C05F.A0C) {
                        return;
                    }
                    viewOnTouchListenerC67974V4p.A0A = C05F.A0N;
                    InterfaceC101554hQ interfaceC101554hQ = viewOnTouchListenerC67974V4p.A05;
                    if (interfaceC101554hQ != null) {
                        interfaceC101554hQ.DXz();
                    }
                    AbstractC43593JPy.A1A(viewOnTouchListenerC67974V4p.A06.A05);
                    AbstractC26351Pq.A00.A00();
                    if (!ViewOnTouchListenerC67974V4p.A00(viewOnTouchListenerC67974V4p.A04, viewOnTouchListenerC67974V4p.A00).Cff()) {
                        return;
                    }
                    C75113Zb BRZ = viewOnTouchListenerC67974V4p.BRZ(viewOnTouchListenerC67974V4p.A04);
                    viewOnTouchListenerC67974V4p.A0M.A0S(viewOnTouchListenerC67974V4p.A04, viewOnTouchListenerC67974V4p, viewOnTouchListenerC67974V4p.A06.A09, new C4QP(), viewOnTouchListenerC67974V4p.A01, viewOnTouchListenerC67974V4p.A00, BRZ.A01(), true, BRZ.A2G);
                    return;
                }
                ViewOnTouchListenerC67974V4p.A01(c55982hj, viewOnTouchListenerC67974V4p);
                return;
        }
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        switch (this.A00) {
            case 0:
                WO6 wo6 = (WO6) this.A01;
                float f = (float) c55982hj.A09.A00;
                if (Float.compare(f, 0.0f) == 0) {
                    wo6.A00 = C05F.A0N;
                }
                wo6.A01.setTranslationY(f);
                return;
            case 1:
            default:
                super.Dnm(c55982hj);
                return;
            case 2:
                BrowserLiteWrapperView browserLiteWrapperView = (BrowserLiteWrapperView) this.A01;
                View view = browserLiteWrapperView.A04;
                C55992hk c55992hk = c55982hj.A09;
                view.setTranslationY((float) c55992hk.A00);
                browserLiteWrapperView.A03.setAlpha(((float) (1.0d - (c55992hk.A00 / browserLiteWrapperView.getHeight()))) * 0.7f);
                return;
            case 3:
                C14360o3.A0B(c55982hj, 0);
                float f2 = (float) c55982hj.A09.A00;
                C56234Oxh c56234Oxh = (C56234Oxh) this.A01;
                IgEditSeekBar igEditSeekBar = c56234Oxh.A0H;
                if (igEditSeekBar != null) {
                    int height = igEditSeekBar.getHeight();
                    View view2 = c56234Oxh.A09;
                    if (view2 != null) {
                        view2.setAlpha(f2);
                        IgEditSeekBar igEditSeekBar2 = c56234Oxh.A0H;
                        if (igEditSeekBar2 != null) {
                            float f3 = 1.0f - f2;
                            igEditSeekBar2.setAlpha(f3);
                            if (c56234Oxh.A0K) {
                                View view3 = c56234Oxh.A0A;
                                if (view3 != null) {
                                    view3.setTranslationY(height * f2);
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            View view4 = c56234Oxh.A08;
                            if (view4 != null) {
                                view4.setAlpha(f2);
                                View view5 = c56234Oxh.A0A;
                                if (view5 != null) {
                                    view5.setAlpha(f3);
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 4:
                C14360o3.A0B(c55982hj, 0);
                UMD umd = (UMD) this.A01;
                C55982hj c55982hj2 = umd.A0C;
                if (c55982hj.equals(c55982hj2)) {
                    umd.A0A.setTranslationX((float) c55982hj2.A09.A00);
                    return;
                }
                C55982hj c55982hj3 = umd.A0D;
                if (!c55982hj.equals(c55982hj3)) {
                    return;
                }
                umd.A0A.setTranslationY((float) c55982hj3.A09.A00);
                return;
            case 5:
                float A00 = AbstractC13600mm.A00((float) c55982hj.A09.A00, 0.0f, 1.0f);
                C70684Wf5 c70684Wf5 = (C70684Wf5) this.A01;
                View view6 = c70684Wf5.A0A;
                view6.setAlpha(A00);
                int i = 0;
                int i2 = 8;
                if (A00 > 0.0f) {
                    i2 = 0;
                }
                view6.setVisibility(i2);
                float f4 = 1.0f - A00;
                View view7 = c70684Wf5.A0B;
                view7.setAlpha(f4);
                int i3 = 4;
                if (f4 > 0.0f) {
                    i3 = 0;
                }
                view7.setVisibility(i3);
                FrameLayout frameLayout = c70684Wf5.A0D;
                frameLayout.setAlpha(f4);
                if (f4 <= 0.0f) {
                    i = 4;
                }
                frameLayout.setVisibility(i);
                return;
            case 6:
                ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p = (ViewOnTouchListenerC67974V4p) this.A01;
                double d = c55982hj.A09.A00;
                Integer num = viewOnTouchListenerC67974V4p.A0A;
                if (num != C05F.A0N && num != C05F.A0C) {
                    return;
                }
                LinearLayout linearLayout = viewOnTouchListenerC67974V4p.A06.A05;
                float f5 = (float) d;
                viewOnTouchListenerC67974V4p.A02.setAlpha(f5);
                float f6 = (f5 * 0.19999999f) + 0.8f;
                linearLayout.setScaleX(f6);
                linearLayout.setScaleY(f6);
                viewOnTouchListenerC67974V4p.A02.setVisibility(0);
                return;
        }
    }
}
