package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.R;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Kas, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46094Kas extends JXK {
    public MRJ A00;
    public C5TA A01;
    public Long A02;
    public Runnable A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final Context A07;
    public final Drawable A08;
    public final View A09;
    public final View A0A;
    public final SeekBar.OnSeekBarChangeListener A0B;
    public final SeekBar A0C;
    public final IgSimpleImageView A0D;
    public final IgTextView A0E;
    public final InterfaceC56392iX A0F;
    public final SpinnerImageView A0G;
    public final InterfaceC08830cm A0H;
    public final ObjectAnimator A0I;
    public final Drawable A0J;

    public static final C5TA A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C46094Kas c46094Kas, C7DO c7do) {
        C5TA c5ta = c46094Kas.A01;
        if (c5ta == null) {
            C14360o3.A0C(interfaceC11380iw, AbstractC111324zv.A00(7));
            C5TA c5ta2 = new C5TA(c46094Kas.A07, userSession, new C46089Kan(userSession, c7do, (InterfaceC60442pS) interfaceC11380iw, null), c46094Kas, interfaceC11380iw.getModuleName());
            c46094Kas.A01 = c5ta2;
            return c5ta2;
        }
        return c5ta;
    }

    @Override // X.JXK, X.C6C3
    public final void Dza(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        A02(c4s7);
    }

    @Override // X.JXK, X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        MRJ mrj = this.A00;
        if (mrj != null) {
            mrj.DfQ();
        }
        A02(c4s7);
    }

    public static final void A01(C46094Kas c46094Kas) {
        IgSimpleImageView igSimpleImageView = c46094Kas.A0D;
        igSimpleImageView.setImageDrawable(c46094Kas.A0J);
        AbstractC166997dE.A18(c46094Kas.A07, igSimpleImageView, 2131952537);
    }

    private final void A02(C4S7 c4s7) {
        Long l;
        C38321qM BQN;
        this.A0G.setVisibility(8);
        MRO mro = (MRO) c4s7.A03;
        if ((mro != null && (BQN = mro.BQN()) != null && (l = Long.valueOf(BQN.A1C())) != null) || (l = this.A02) != null) {
            View view = this.A09;
            InterfaceC08830cm interfaceC08830cm = this.A0H;
            int i = 0;
            if ((interfaceC08830cm != null && AbstractC31177DnL.A1b(interfaceC08830cm.get())) || this.A05) {
                i = 8;
            }
            view.setVisibility(i);
            SeekBar seekBar = this.A0C;
            long longValue = l.longValue();
            seekBar.setMax((int) longValue);
            this.A0E.setText(C23831Eq.A02(longValue));
        }
    }

    @Override // X.JXK, X.C6C3
    public final void onProgressStateChanged(boolean z) {
        this.A0G.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        if (z) {
            A01(this);
        }
    }

    @Override // X.JXK, X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        IgSimpleImageView igSimpleImageView = this.A0D;
        igSimpleImageView.setImageDrawable(this.A08);
        AbstractC166997dE.A18(this.A07, igSimpleImageView, 2131952536);
        if (!this.A04) {
            SeekBar seekBar = this.A0C;
            seekBar.setMax(i2);
            if (seekBar.getProgress() < i) {
                ObjectAnimator objectAnimator = this.A0I;
                objectAnimator.cancel();
                objectAnimator.setIntValues(i);
                objectAnimator.setDuration(100L);
                objectAnimator.start();
            } else {
                seekBar.setProgress(i);
            }
        }
        this.A0E.setText(C23831Eq.A02(i2 - i));
    }

    @Override // X.JXK, X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
        MRJ mrj = this.A00;
        if (mrj != null) {
            mrj.DfR();
        }
    }

    public C46094Kas(Context context, View view, InterfaceC56392iX interfaceC56392iX, SpinnerImageView spinnerImageView, InterfaceC08830cm interfaceC08830cm) {
        boolean A1a = AbstractC31175DnJ.A1a(spinnerImageView);
        this.A07 = context;
        this.A0A = view;
        this.A0G = spinnerImageView;
        this.A0F = interfaceC56392iX;
        this.A0H = interfaceC08830cm;
        View A0S = AbstractC166997dE.A0S(view, R.id.intermediate_viewer_video_controls);
        this.A09 = A0S;
        this.A0D = AbstractC31176DnK.A0T(A0S, R.id.video_play_pause_button);
        SeekBar seekBar = (SeekBar) AbstractC166997dE.A0R(A0S, R.id.video_scrubber);
        this.A0C = seekBar;
        this.A0I = ObjectAnimator.ofInt(seekBar, ReactProgressBarViewManager.PROP_PROGRESS, 0);
        this.A0E = AbstractC25231BEo.A0d(A0S, R.id.video_timer);
        Drawable drawable = context.getDrawable(R.drawable.instagram_pause_filled_16);
        if (drawable != null) {
            this.A08 = drawable;
            Drawable drawable2 = context.getDrawable(R.drawable.instagram_play_filled_16);
            if (drawable2 != null) {
                this.A0J = drawable2;
                this.A06 = AbstractC167017dG.A03(context);
                this.A0B = new C55531OlP(this, A1a ? 1 : 0);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.JXK, X.C6C3
    public final void onStopVideo(String str, boolean z) {
        A01(this);
    }
}
