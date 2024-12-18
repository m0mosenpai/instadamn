package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.5Le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115685Le {
    public static final void A00(UserSession userSession, C75113Zb c75113Zb, Long l, boolean z) {
        C115725Li A00;
        long j;
        if (c75113Zb != null) {
            if (l != null) {
                if (z) {
                    AbstractC123605iZ.A00(userSession).A02(c75113Zb, l.longValue());
                }
                A00 = AbstractC115715Lh.A00();
                j = l.longValue();
            } else {
                if (z) {
                    AbstractC123605iZ.A00(userSession).A02(c75113Zb, 4000L);
                }
                A00 = AbstractC115715Lh.A00();
                j = 4000;
            }
            A00.A01(c75113Zb, j);
        }
    }

    public static final void A01(final C81373k7 c81373k7, boolean z, boolean z2, final boolean z3) {
        Integer num;
        int i;
        IgTextView igTextView;
        int i2;
        c81373k7.A0P.setSelected(z);
        C75113Zb c75113Zb = c81373k7.A09;
        C38321qM c38321qM = null;
        if (c75113Zb != null) {
            num = Integer.valueOf(c75113Zb.A02);
        } else {
            num = null;
        }
        final C92534Ck c92534Ck = c81373k7.A0U;
        int i3 = c81373k7.A0S.A00;
        C5LT c5lt = c81373k7.A08;
        if (c5lt != null) {
            c38321qM = c5lt.A02;
        }
        final int A00 = AbstractC92514Ci.A00(c38321qM, num, i3);
        if (z2) {
            float[] fArr = {0.0f, 1.0f};
            if (z) {
                // fill-array-data instruction
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.setDuration(200L).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.5za
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IgTextView igTextView2;
                    C14360o3.A0B(valueAnimator, 0);
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue = ((Number) animatedValue).floatValue();
                    C92524Cj c92524Cj = c92534Ck.A00;
                    int A002 = AbstractC75103Za.A00(floatValue, c92524Cj.A09, -1);
                    boolean z4 = z3;
                    C81373k7 c81373k72 = c81373k7;
                    if (z4) {
                        c81373k72.A02.setTextColor(A002);
                        igTextView2 = c81373k72.A07;
                    } else {
                        c81373k72.A01.setTextColor(A002);
                        igTextView2 = c81373k72.A06;
                    }
                    igTextView2.setTextColor(A002);
                    c81373k72.A0L.setTextColor(A002);
                    ((TextView) c81373k72.A0Q.A01()).setTextColor(A002);
                    TextSwitcher textSwitcher = c81373k72.A0K;
                    TextView textView = (TextView) textSwitcher.getCurrentView();
                    if (textView != null) {
                        textView.setTextColor(A002);
                    }
                    TextView textView2 = (TextView) textSwitcher.getNextView();
                    if (textView2 != null) {
                        textView2.setTextColor(A002);
                    }
                    ViewGroup viewGroup = c81373k72.A0J;
                    int i4 = A00;
                    viewGroup.setBackgroundColor(AbstractC75103Za.A00(floatValue, c92524Cj.A01, i4));
                    c81373k72.A0H.setBackgroundColor(AbstractC75103Za.A00(floatValue, c92524Cj.A04, i4));
                    TextView textView3 = c81373k72.A0M;
                    if (textView3.getVisibility() == 0) {
                        textView3.setTextColor(AbstractC75103Za.A00(floatValue, c92524Cj.A06, c92524Cj.A05));
                    }
                    c81373k72.A05.setColorFilter(A002);
                    C5LT c5lt2 = c81373k72.A08;
                    if (c5lt2 != null && c5lt2.A01 != null) {
                        c81373k72.A04.setColorFilter(A002);
                    }
                }
            });
            ofFloat.start();
            return;
        }
        C92524Cj c92524Cj = c92534Ck.A00;
        if (z) {
            i = -1;
        } else {
            i = c92524Cj.A09;
        }
        if (z3) {
            c81373k7.A02.setTextColor(i);
            igTextView = c81373k7.A07;
        } else {
            c81373k7.A01.setTextColor(i);
            igTextView = c81373k7.A06;
        }
        igTextView.setTextColor(i);
        c81373k7.A0L.setTextColor(i);
        ((TextView) c81373k7.A0Q.A01()).setTextColor(i);
        TextSwitcher textSwitcher = c81373k7.A0K;
        TextView textView = (TextView) textSwitcher.getCurrentView();
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = (TextView) textSwitcher.getNextView();
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
        ViewGroup viewGroup = c81373k7.A0J;
        int i4 = A00;
        if (!z) {
            i4 = c92524Cj.A01;
        }
        viewGroup.setBackgroundColor(i4);
        View view = c81373k7.A0H;
        if (!z) {
            A00 = c92524Cj.A04;
        }
        view.setBackgroundColor(A00);
        TextView textView3 = c81373k7.A0M;
        if (textView3.getVisibility() == 0) {
            if (z) {
                i2 = c92524Cj.A05;
            } else {
                i2 = c92524Cj.A06;
            }
            textView3.setTextColor(i2);
        }
        c81373k7.A05.setColorFilter(i);
        C5LT c5lt2 = c81373k7.A08;
        if (c5lt2 == null || c5lt2.A01 == null) {
            return;
        }
        c81373k7.A04.setColorFilter(i);
    }
}
