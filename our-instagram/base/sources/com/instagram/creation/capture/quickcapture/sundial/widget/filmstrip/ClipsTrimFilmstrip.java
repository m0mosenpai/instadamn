package com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip;

import X.AbstractC13880nE;
import X.AbstractC43591JPw;
import X.C14360o3;
import X.C8RB;
import X.C8RH;
import X.InterfaceC184088Ex;
import X.InterfaceC184998Io;
import X.RunnableC24867AzS;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class ClipsTrimFilmstrip extends ConstraintLayout implements InterfaceC184998Io {
    public int A00;
    public int A01;
    public InterfaceC184088Ex A02;
    public boolean A03;
    public final Animation A04;
    public final Animation A05;
    public final IgTextView A06;
    public final FilmstripTimelineView A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipsTrimFilmstrip(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void A0D(int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A03 = true;
        AbstractC13880nE.A0q(this.A07, new RunnableC24867AzS(this, i, i2, i3, i4));
    }

    private final int A00(float f) {
        C8RB c8rb = this.A07.A0B;
        return (int) (((c8rb.getWidthScrollXPercent() * f) + c8rb.getScrollXPercent()) * this.A00);
    }

    public static final void A01(ClipsTrimFilmstrip clipsTrimFilmstrip) {
        if (clipsTrimFilmstrip.A03) {
            FilmstripTimelineView filmstripTimelineView = clipsTrimFilmstrip.A07;
            C8RH c8rh = filmstripTimelineView.A0A;
            long A00 = clipsTrimFilmstrip.A00(c8rh.getRightTrimmerValue()) - clipsTrimFilmstrip.A00(c8rh.getLeftTrimmerValue());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long minutes = timeUnit.toMinutes(A00) % 60;
            long seconds = timeUnit.toSeconds(A00) % 60;
            IgTextView igTextView = clipsTrimFilmstrip.A06;
            String format = String.format(AbstractC43591JPw.A00(100), Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf((A00 / 10) % 100)}, 3));
            C14360o3.A07(format);
            igTextView.setText(format);
            float width = igTextView.getWidth();
            igTextView.setTranslationX(Math.min(r0.getRight() - width, Math.max(filmstripTimelineView.A08.getLeft(), (((filmstripTimelineView.A06 + filmstripTimelineView.A05) + r5) + (filmstripTimelineView.getMaxSelectedFilmstripWidth() * ((c8rh.getRightTrimmerValue() + c8rh.getLeftTrimmerValue()) / 2.0f))) - (width / 2.0f))));
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DOn(float f, float f2) {
        InterfaceC184088Ex interfaceC184088Ex = this.A02;
        if (interfaceC184088Ex != null) {
            interfaceC184088Ex.DOq(A00(this.A07.A0A.getLeftTrimmerValue()));
        }
        InterfaceC184088Ex interfaceC184088Ex2 = this.A02;
        if (interfaceC184088Ex2 != null) {
            interfaceC184088Ex2.DhS(A00(this.A07.A0A.getRightTrimmerValue()));
        }
        A01(this);
    }

    @Override // X.InterfaceC184998Io
    public final void DOp(float f) {
        InterfaceC184088Ex interfaceC184088Ex = this.A02;
        if (interfaceC184088Ex != null) {
            interfaceC184088Ex.DOq(A00(this.A07.A0A.getLeftTrimmerValue()));
        }
        A01(this);
    }

    @Override // X.InterfaceC184998Io
    public final void DhR(float f) {
        InterfaceC184088Ex interfaceC184088Ex = this.A02;
        if (interfaceC184088Ex != null) {
            interfaceC184088Ex.DhS(A00(this.A07.A0A.getRightTrimmerValue()));
        }
        A01(this);
    }

    @Override // X.InterfaceC184998Io
    public final void Djx(float f) {
        InterfaceC184088Ex interfaceC184088Ex = this.A02;
        if (interfaceC184088Ex != null) {
            interfaceC184088Ex.Djy(A00(f));
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DuJ(boolean z) {
        if (z && this.A03) {
            IgTextView igTextView = this.A06;
            if (igTextView.getVisibility() == 0) {
                igTextView.setVisibility(8);
                igTextView.clearAnimation();
                igTextView.startAnimation(this.A05);
            }
        }
        InterfaceC184088Ex interfaceC184088Ex = this.A02;
        if (interfaceC184088Ex != null) {
            interfaceC184088Ex.DuJ(z);
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DuL(boolean z) {
        InterfaceC184088Ex interfaceC184088Ex = this.A02;
        if (interfaceC184088Ex != null) {
            interfaceC184088Ex.DuL(z);
        }
        if (z && this.A03) {
            IgTextView igTextView = this.A06;
            if (igTextView.getVisibility() == 8) {
                igTextView.setVisibility(0);
                igTextView.clearAnimation();
                igTextView.startAnimation(this.A04);
                A01(this);
            }
        }
    }

    @Override // X.InterfaceC184998Io
    public final void E2A(float f) {
        InterfaceC184088Ex interfaceC184088Ex = this.A02;
        if (interfaceC184088Ex != null) {
            interfaceC184088Ex.DOq(A00(this.A07.A0A.getLeftTrimmerValue()));
        }
        InterfaceC184088Ex interfaceC184088Ex2 = this.A02;
        if (interfaceC184088Ex2 != null) {
            interfaceC184088Ex2.DhS(A00(this.A07.A0A.getRightTrimmerValue()));
        }
    }

    public final FilmstripTimelineView getFilmstripTimelineView() {
        return this.A07;
    }

    public final InterfaceC184088Ex getListener() {
        return this.A02;
    }

    public final int getTotalWidth() {
        return this.A01;
    }

    public final void setSeekPosition(int i) {
        FilmstripTimelineView filmstripTimelineView = this.A07;
        C8RB c8rb = filmstripTimelineView.A0B;
        filmstripTimelineView.setSeekPosition(((i / this.A00) - c8rb.getScrollXPercent()) / c8rb.getWidthScrollXPercent());
    }

    public final void setListener(InterfaceC184088Ex interfaceC184088Ex) {
        this.A02 = interfaceC184088Ex;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsTrimFilmstrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_clips_trim_filmstrip, (ViewGroup) this, true);
        C14360o3.A07(inflate);
        IgTextView igTextView = (IgTextView) inflate.requireViewById(R.id.clips_trim_filmstrip_time_indicator);
        this.A06 = igTextView;
        AbstractC13880nE.A0q(igTextView, new Runnable() { // from class: X.8RO
            @Override // java.lang.Runnable
            public final void run() {
                ClipsTrimFilmstrip.A01(ClipsTrimFilmstrip.this);
            }
        });
        FilmstripTimelineView filmstripTimelineView = (FilmstripTimelineView) inflate.requireViewById(R.id.clips_trim_filmstrip_view);
        this.A07 = filmstripTimelineView;
        filmstripTimelineView.A00 = this;
        filmstripTimelineView.A03(true, false, false);
        int integer = context.getResources().getInteger(android.R.integer.config_mediumAnimTime);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A04 = alphaAnimation;
        long j = integer;
        alphaAnimation.setDuration(j);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.A05 = alphaAnimation2;
        alphaAnimation2.setDuration(j);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        C8RB c8rb = filmstripTimelineView.A0B;
        c8rb.A0C = true;
        c8rb.A00 = 0.0f;
        c8rb.invalidate();
        filmstripTimelineView.setTrimmerMaximumRange(1.0f);
        filmstripTimelineView.A01(0.0f, 1.0f);
        filmstripTimelineView.setScrollXMargin(dimensionPixelSize);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipsTrimFilmstrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
