package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.SeekBar;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class BPE extends AbstractC77583di {
    public final long A00;
    public final C2XI A01;
    public final C2XI A02;
    public final C2XI A03;
    public final C2XI A04;
    public final C120985dq A05;
    public final UserSession A06;
    public final WeakReference A07;
    public final WeakReference A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public static final CTW A0G = new Object();
    public static final C51532Yb A0F = AbstractC25232BEp.A1A(BPN.A00);

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        return AbstractC25234BEr.A08(c77993eR, A0F, BPF.A00, BPG.A00, DRY.A00(this, c77993eR, 16));
    }

    public static final ValueAnimator A03(ViewGroup viewGroup, SeekBar seekBar, BPE bpe, int i, int i2) {
        TimeInterpolator linearInterpolator;
        if (i != i2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
            ofInt.setDuration(150L);
            if (bpe.A0B && bpe.A0E) {
                linearInterpolator = new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
            ofInt.setInterpolator(linearInterpolator);
            ofInt.addUpdateListener(new BQ7(viewGroup, seekBar, bpe));
            ofInt.start();
            return ofInt;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            seekBar.setMaxHeight(i2);
            seekBar.setMinHeight(i2);
        }
        seekBar.getLayoutParams().height = i2;
        return null;
    }

    public BPE(C2XI c2xi, C2XI c2xi2, C2XI c2xi3, C2XI c2xi4, C120985dq c120985dq, UserSession userSession, WeakReference weakReference, WeakReference weakReference2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC167017dG.A1P(c2xi, c2xi2);
        C14360o3.A0B(c2xi4, 13);
        this.A03 = c2xi;
        this.A01 = c2xi2;
        this.A02 = c2xi3;
        this.A08 = weakReference;
        this.A09 = z;
        this.A0D = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A0B = z5;
        this.A0E = z6;
        this.A00 = j;
        this.A04 = c2xi4;
        this.A07 = weakReference2;
        this.A06 = userSession;
        this.A05 = c120985dq;
    }

    public static final void A04(ViewGroup viewGroup, Object obj, Object obj2, boolean z) {
        ViewStub viewStub;
        AbstractC166997dE.A0S(viewGroup, R.id.scrubber_preview_thumbnail_view).setTag(obj);
        if (z) {
            View findViewById = viewGroup.findViewById(R.id.scrubber_thumbnail_highlights_text);
            if (findViewById != null || ((viewStub = (ViewStub) viewGroup.findViewById(R.id.scrubber_thumbnail_highlights_stub)) != null && (findViewById = viewStub.inflate()) != null)) {
                findViewById.setTag(obj2);
            }
        }
    }
}
