package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.common.ui.base.IgLinearLayout;

/* loaded from: classes9.dex */
public final class MaW implements InterfaceC155846zE, InterfaceC155836zD {
    public final int A00;
    public final Object A01;

    public MaW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC155846zE
    public final void DWT(AppBarLayout appBarLayout, int i) {
        OH8 oh8;
        C52157N6j c52157N6j;
        int i2;
        double d;
        String str;
        switch (this.A00) {
            case 0:
                if (appBarLayout.getTotalScrollRange() <= 0) {
                    return;
                }
                if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
                    ((C45502KCr) this.A01).A07 = false;
                }
                if (i != 0) {
                    return;
                }
                C45502KCr c45502KCr = (C45502KCr) this.A01;
                if (c45502KCr.A07) {
                    return;
                }
                c45502KCr.A07 = true;
                return;
            case 1:
                if (appBarLayout.getTotalScrollRange() <= 0) {
                    return;
                }
                if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
                    C45503KCs c45503KCs = (C45503KCs) this.A01;
                    C45503KCs.A04(c45503KCs, "scroll");
                    c45503KCs.A09 = false;
                }
                if (i != 0) {
                    return;
                }
                C45503KCs c45503KCs2 = (C45503KCs) this.A01;
                if (c45503KCs2.A09) {
                    return;
                }
                C45503KCs.A01(c45503KCs2);
                c45503KCs2.A09 = true;
                return;
            case 2:
                if (appBarLayout.getTotalScrollRange() <= 0) {
                    return;
                }
                if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
                    C69644Vsl c69644Vsl = (C69644Vsl) this.A01;
                    C70908WkB c70908WkB = c69644Vsl.A00;
                    if (c70908WkB != null) {
                        C70908WkB.A03(c70908WkB, "scroll");
                        c69644Vsl.A01 = false;
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                if (i != 0) {
                    return;
                }
                C69644Vsl c69644Vsl2 = (C69644Vsl) this.A01;
                if (c69644Vsl2.A01) {
                    return;
                }
                C70908WkB c70908WkB2 = c69644Vsl2.A00;
                if (c70908WkB2 != null) {
                    C70908WkB.A02(c70908WkB2);
                    c69644Vsl2.A01 = true;
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 3:
                if (appBarLayout == null) {
                    return;
                }
                GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = (GestureDetectorOnGestureListenerC43829JZs) this.A01;
                gestureDetectorOnGestureListenerC43829JZs.A0Q = false;
                boolean z = true;
                gestureDetectorOnGestureListenerC43829JZs.A0O = AbstractC167007dF.A1P(Math.abs(i), appBarLayout.getTotalScrollRange());
                if (i != 0) {
                    z = false;
                }
                gestureDetectorOnGestureListenerC43829JZs.A0P = z;
                if (gestureDetectorOnGestureListenerC43829JZs.A0X || !gestureDetectorOnGestureListenerC43829JZs.A0U) {
                    return;
                }
                int floor = (int) Math.floor(AbstractC70163Da.A04(i, -appBarLayout.getTotalScrollRange(), 0.0d, gestureDetectorOnGestureListenerC43829JZs.A02, gestureDetectorOnGestureListenerC43829JZs.A05));
                C43830JZt c43830JZt = gestureDetectorOnGestureListenerC43829JZs.A14;
                int A0A = floor - c43830JZt.A0A();
                boolean z2 = gestureDetectorOnGestureListenerC43829JZs.A0P;
                RecyclerView recyclerView = c43830JZt.A0G.A00;
                if (z2) {
                    recyclerView.A0t(0, A0A);
                    return;
                } else {
                    recyclerView.scrollBy(0, A0A);
                    return;
                }
            case 4:
                float abs = Math.abs(i / appBarLayout.getTotalScrollRange());
                C56455P4r c56455P4r = (C56455P4r) this.A01;
                boolean A1P = AbstractC25230BEn.A1P((abs > 0.95f ? 1 : (abs == 0.95f ? 0 : -1)));
                ValueAnimator valueAnimator = c56455P4r.A0I;
                if (!valueAnimator.isRunning()) {
                    TextView textView = c56455P4r.A08;
                    if (textView != null) {
                        if (A1P) {
                            i2 = c56455P4r.A0F;
                        } else {
                            i2 = c56455P4r.A0E;
                        }
                        textView.setTextColor(i2);
                    }
                    float f = c56455P4r.A00;
                    if (Float.compare(f, 1.0f) == 0 && A1P) {
                        valueAnimator.reverse();
                    } else if (Float.compare(f, 0.0f) == 0 && !A1P) {
                        valueAnimator.start();
                    }
                }
                OH8 oh82 = c56455P4r.A0D;
                if (oh82 != null && (c52157N6j = oh82.A00.A0B) != null) {
                    c52157N6j.A03();
                }
                if (AbstractC167007dF.A1X(c56455P4r.A0C, EnumC53120NeX.A02) && AbstractC166987dD.A01(c56455P4r.A01, abs) > 0.0f && (oh8 = c56455P4r.A0D) != null) {
                    N6U n6u = oh8.A00;
                    if (!n6u.A0G) {
                        N6U.A03(n6u);
                    }
                }
                c56455P4r.A01 = abs;
                return;
            case 5:
                if (i == 0) {
                    return;
                }
                C56043OuF c56043OuF = (C56043OuF) this.A01;
                View view = c56043OuF.A01;
                if (view == null) {
                    AppBarLayout appBarLayout2 = c56043OuF.A08;
                    if (appBarLayout2 == null) {
                        str = "appbarLayout";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    view = appBarLayout2.findViewById(R.id.use_in_camera_header_button);
                    c56043OuF.A01 = view;
                }
                if (view != null) {
                    IgLinearLayout igLinearLayout = c56043OuF.A0A;
                    if (igLinearLayout == null) {
                        str = "actionButtonContainer";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    int bottom = igLinearLayout.getBottom();
                    int abs2 = Math.abs(i);
                    C55982hj c55982hj = c56043OuF.A06;
                    if (c55982hj == null) {
                        return;
                    }
                    if (abs2 > bottom) {
                        d = 1.0d;
                    } else {
                        d = 0.0d;
                    }
                    c55982hj.A06(d);
                    return;
                }
                C55982hj c55982hj2 = c56043OuF.A06;
                if (c55982hj2 != null) {
                    c55982hj2.A02();
                }
                appBarLayout.A03(c56043OuF.A07);
                return;
            default:
                return;
        }
    }
}
