package com.instagram.direct.ui.countdowntimer;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.AbstractC31173DnH;
import X.AbstractC53242c7;
import X.C0f9;
import X.C14360o3;
import X.C44343Jii;
import X.EnumC68123VCh;
import X.InterfaceC16820sZ;
import X.JQ0;
import X.M71;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.direct.ui.countertextview.CounterTextView;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class CountdownTimerPill extends IgFrameLayout {
    public CountDownTimer A00;
    public Runnable A01;
    public final C44343Jii A02;
    public final CounterTextView A03;
    public static final long A06 = TimeUnit.DAYS.toMillis(1);
    public static final long A05 = TimeUnit.MINUTES.toMillis(15);
    public static final long A04 = TimeUnit.SECONDS.toMillis(1);

    public static final String A00(CountdownTimerPill countdownTimerPill, long j, long j2, boolean z) {
        int days;
        Resources A0M;
        int i;
        String A0k;
        long j3 = A06;
        if (z) {
            if (j <= j3) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM:dd", Locale.getDefault());
                Long valueOf = Long.valueOf(j2);
                if (C14360o3.A0K(simpleDateFormat.format(valueOf), new SimpleDateFormat("MM:dd", Locale.getDefault()).format(AbstractC31173DnH.A0g()))) {
                    A0k = AbstractC167007dF.A0f(countdownTimerPill.getContext(), new SimpleDateFormat("h:mm a", Locale.getDefault()).format(valueOf), 2131956881);
                } else {
                    A0k = countdownTimerPill.getContext().getString(2131956882);
                }
                C14360o3.A0A(A0k);
                return A0k;
            }
            days = ((int) TimeUnit.MILLISECONDS.toDays(j)) + 1;
            A0M = AbstractC25228BEl.A0M(countdownTimerPill);
            i = R.plurals.countdown_timer_days_remaining;
        } else {
            if (j <= j3) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                return AbstractC166997dE.A0z("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L))}, 3));
            }
            days = ((int) TimeUnit.MILLISECONDS.toDays(j)) + 1;
            A0M = AbstractC25228BEl.A0M(countdownTimerPill);
            i = R.plurals.countdown_timer_days_remaining_old;
        }
        A0k = AbstractC167017dG.A0k(A0M, days, i);
        C14360o3.A0A(A0k);
        return A0k;
    }

    public static /* synthetic */ void setRemainingTimeInMillis$default(CountdownTimerPill countdownTimerPill, long j, long j2, boolean z, boolean z2, boolean z3, InterfaceC16820sZ interfaceC16820sZ, int i, Object obj) {
        InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        if ((i & 4) != 0) {
            z6 = false;
        }
        if ((i & 8) != 0) {
            z5 = false;
        }
        if ((i & 16) != 0) {
            z4 = true;
        }
        if ((i & 32) != 0) {
            interfaceC16820sZ2 = null;
        }
        countdownTimerPill.A02(interfaceC16820sZ2, j, j2, z6, z5, z4);
    }

    public final void A01() {
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        Runnable runnable = this.A01;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        CounterTextView counterTextView = this.A03;
        counterTextView.setVisibility(0);
        Context context = getContext();
        counterTextView.A06(0, context.getString(2131961853), false);
        setPillColor(context.getColor(AbstractC53242c7.A0B(context)));
    }

    public final void A02(InterfaceC16820sZ interfaceC16820sZ, long j, long j2, boolean z, boolean z2, boolean z3) {
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CounterTextView counterTextView = this.A03;
        counterTextView.setVisibility(0);
        Runnable runnable = this.A01;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C44343Jii c44343Jii = this.A02;
        int A09 = AbstractC167007dF.A09(c44343Jii.A07, R.attr.igds_color_controls);
        Paint paint = c44343Jii.A09;
        paint.setColor(A09);
        c44343Jii.invalidateSelf();
        c44343Jii.A06.cancel();
        c44343Jii.A05.cancel();
        c44343Jii.A02 = 0.0f;
        c44343Jii.A00 = 0.0f;
        paint.setAlpha(255);
        c44343Jii.invalidateSelf();
        long j3 = 0;
        if (0 < j) {
            j3 = j;
        }
        counterTextView.A06((int) j3, A00(this, j3, j2, z3), false);
        if (!z) {
            long j4 = A06;
            if (j3 <= j4 || j3 % j4 < A05) {
                M71 m71 = new M71(this, interfaceC16820sZ, j3, j2, z3, z2);
                this.A01 = m71;
                postDelayed(m71, A04);
            }
        }
    }

    public final void setPillColor(int i) {
        C44343Jii c44343Jii = this.A02;
        c44343Jii.A09.setColor(i);
        c44343Jii.invalidateSelf();
    }

    public final void setPillTextColor(int i) {
        this.A03.setTextColor(i);
    }

    public /* synthetic */ CountdownTimerPill(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A062 = C0f9.A06(1265280724);
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        Runnable runnable = this.A01;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0f9.A0D(-274481403, A062);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownTimerPill(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C44343Jii c44343Jii = new C44343Jii(context);
        this.A02 = c44343Jii;
        View.inflate(context, R.layout.countdown_timer_layout, this);
        CounterTextView counterTextView = (CounterTextView) findViewById(R.id.timer_textview);
        this.A03 = counterTextView;
        counterTextView.setAnimationStyle(EnumC68123VCh.A03);
        setBackground(c44343Jii);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountdownTimerPill(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountdownTimerPill(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
