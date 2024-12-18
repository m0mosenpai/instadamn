package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.889, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass889 extends C42H {
    public ReboundViewPager A00;
    public C88M A01;
    public C88H A02;
    public C62882tR A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public boolean A07;
    public final boolean A08;
    public final View A09;
    public final UserSession A0A;
    public final boolean A0B;

    public AnonymousClass889(View view, UserSession userSession, boolean z, boolean z2) {
        C14360o3.A0B(view, 2);
        this.A0A = userSession;
        this.A09 = view;
        this.A0B = z2;
        this.A08 = C88A.A00(z);
        this.A06 = -1;
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
        C88M c88m;
        C14360o3.A0B(c3vz, 2);
        if (c3vz == C3VZ.A03 && Math.abs(f - f2) <= 0.01f) {
            int rint = (int) Math.rint(f);
            C88M c88m2 = this.A01;
            if (c88m2 != null && c88m2.A07(rint) && (c88m = this.A01) != null && c88m.A01 != rint) {
                c88m.A05(null, rint, false, false, false);
            }
        }
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
        C14360o3.A0B(c3vz, 0);
        C14360o3.A0B(c3vz2, 1);
        C3VZ c3vz3 = C3VZ.A03;
        if (c3vz == c3vz3) {
            C88H c88h = this.A02;
            if (c88h != null) {
                c88h.CkA();
            }
            this.A04 = false;
            ReboundViewPager reboundViewPager = this.A00;
            if (reboundViewPager != null) {
                for (int childCount = reboundViewPager.getChildCount(); -1 < childCount; childCount--) {
                    View childAt = reboundViewPager.getChildAt(childCount);
                    if (childAt != null) {
                        childAt.setLayerType(0, null);
                    }
                }
            }
            C62882tR c62882tR = this.A03;
            if (c62882tR != null) {
                c62882tR.A02(true);
                return;
            }
            return;
        }
        if (c3vz2 == c3vz3) {
            ReboundViewPager reboundViewPager2 = this.A00;
            if (reboundViewPager2 != null) {
                int i = 1;
                if (this.A08) {
                    i = 2;
                }
                for (int childCount2 = reboundViewPager2.getChildCount(); -1 < childCount2; childCount2--) {
                    View childAt2 = reboundViewPager2.getChildAt(childCount2);
                    if (childAt2 != null) {
                        childAt2.setLayerType(i, null);
                    }
                }
            }
            C62882tR c62882tR2 = this.A03;
            if (c62882tR2 != null) {
                c62882tR2.A02(false);
            }
        }
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DyE(int i, float f) {
        this.A07 = true;
    }

    public final void A00(String str) {
        Activity activity = (Activity) AbstractC13320mI.A00(this.A09.getContext(), Activity.class);
        if (activity != null) {
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            this.A03 = new C62882tR(activity, new C19270xB(str), this.A0A, 23603667);
        }
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        if (i != this.A06) {
            this.A06 = i;
            if (this.A05 && !this.A04) {
                C2UY.A01.A05(10L);
            }
            C88M c88m = this.A01;
            if (c88m != null) {
                c88m.A04(i);
            }
        }
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
        C88M c88m = this.A01;
        if (c88m != null) {
            if (!this.A0B) {
                c88m.A03(i);
            } else {
                if (z) {
                    return;
                }
                c88m.A05(null, i, false, this.A07, false);
            }
        }
    }
}
