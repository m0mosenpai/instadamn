package X;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* loaded from: classes9.dex */
public abstract class OXZ {
    public int A00;
    public C09530e4 A01;
    public boolean A02 = true;
    public float A03;

    public final void A0C() {
        int[] iArr = {0, 0};
        RecyclerView A0A = A0A();
        if (A0A != null) {
            A0A.getLocationOnScreen(iArr);
        }
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, iArr[0], iArr[1], 0);
        RecyclerView A0A2 = A0A();
        if (A0A2 != null) {
            A0A2.dispatchTouchEvent(obtain);
        }
    }

    public final void A0E() {
        AbstractC70663Fe abstractC70663Fe;
        this.A00 = 0;
        RecyclerView A0A = A0A();
        if (A0A != null && (abstractC70663Fe = A0A.A0D) != null) {
            abstractC70663Fe.A1O(0);
        }
    }

    public final int A08() {
        if (this instanceof NI6) {
            NI6 ni6 = (NI6) this;
            if (ni6.A0K) {
                return ni6.A01;
            }
            return MSW.A1B(((AbstractC50863Mdu) ni6.A0J).A01.A09).size() + ni6.A01;
        }
        if (this instanceof NI7) {
            return ((NI7) this).A05;
        }
        return -1;
    }

    public final int A09(int i) {
        int max;
        C09530e4 c09530e4 = this.A01;
        if (c09530e4 != null) {
            int i2 = this.A00 + i;
            if (i >= 0) {
                max = Math.min(i2, AbstractC25229BEm.A0A(c09530e4));
            } else {
                max = Math.max(i2, AbstractC25230BEn.A0F(c09530e4));
            }
            return max - this.A00;
        }
        return i;
    }

    public final RecyclerView A0A() {
        if (this instanceof NI6) {
            return ((NI6) this).A09;
        }
        if (this instanceof ClipsStackedTimelineViewController) {
            return ((ClipsStackedTimelineViewController) this).A0O();
        }
        if (this instanceof NI5) {
            return ((NI5) this).A0A;
        }
        return ((NI7) this).A08;
    }

    public final EnumC53170NfR A0B() {
        if (this instanceof NI6) {
            return ((NI6) this).A0E;
        }
        if (this instanceof ClipsStackedTimelineViewController) {
            return ((ClipsStackedTimelineViewController) this).A0D;
        }
        if (this instanceof NI5) {
            return ((NI5) this).A0G;
        }
        return ((NI7) this).A0C;
    }

    public final void A0G(float f) {
        float f2 = f + this.A03;
        int i = (int) f2;
        this.A03 = f2 - i;
        RecyclerView A0A = A0A();
        if (A0A != null) {
            A0A.scrollBy(i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        if (r2 == (-1)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I(int r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OXZ.A0I(int):void");
    }

    public final void A0J(int i) {
        AbstractC70663Fe abstractC70663Fe;
        this.A00 = i;
        RecyclerView A0A = A0A();
        if (A0A != null && (abstractC70663Fe = A0A.A0D) != null) {
            abstractC70663Fe.A1O(i);
        }
    }

    public final boolean A0M() {
        C187358Sd c187358Sd;
        if (this instanceof NI6) {
            c187358Sd = ((NI6) this).A0H;
        } else if (this instanceof NI5) {
            c187358Sd = ((NI5) this).A0J;
        } else if (this instanceof NI7) {
            c187358Sd = ((NI7) this).A0G;
        } else {
            c187358Sd = ((ClipsStackedTimelineViewController) this).A0G;
        }
        return c187358Sd.A0E() instanceof C187508Ss;
    }

    public static void A07(ClipsStackedTimelineViewController clipsStackedTimelineViewController, ClipsCreationViewModel clipsCreationViewModel, boolean z) {
        clipsStackedTimelineViewController.A0V(ClipsCreationViewModel.A00(clipsCreationViewModel).A00, z);
    }

    public final void A0D() {
        RecyclerView A0A = A0A();
        if (A0A != null) {
            A0A.performHapticFeedback(1);
        }
    }

    public final void A0F() {
        Context context;
        int A0H;
        RecyclerView A0A = A0A();
        if (A0A != null && (A0H = AbstractC53242c7.A0H((context = A0A.getContext()), R.attr.stackedTimelineTrackBackground)) != 0) {
            AbstractC31173DnH.A0z(context, A0A, A0H);
        }
    }

    public final void A0H(int i) {
        RecyclerView A0A = A0A();
        if (A0A != null) {
            A0A.A1E(i, 0);
        }
    }

    public final void A0K(Context context, C50868Mdz c50868Mdz, InterfaceC16820sZ interfaceC16820sZ) {
        RecyclerView A0A = A0A();
        if (A0A != null) {
            A0A.A14(new C51195Mjf(1, c50868Mdz, this, interfaceC16820sZ));
        }
        C008102v c008102v = new C008102v(context, new NI2(this, c50868Mdz));
        RecyclerView A0A2 = A0A();
        if (A0A2 != null) {
            A0A2.A12(new C55589OmS(c008102v, this));
        }
    }

    public final void A0L(boolean z) {
        RecyclerView A0A = A0A();
        if (A0A != null) {
            A0A.setNestedScrollingEnabled(z);
        }
    }
}
