package instagram.features.clips.audio.ui;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC189358aC;
import X.AbstractC31174DnI;
import X.B4Z;
import X.C00O;
import X.C14360o3;
import X.C16930sl;
import X.C37846Gl0;
import X.C3P9;
import X.C41574IaN;
import X.C8G4;
import X.C8G5;
import X.C8G6;
import X.InterfaceC150336ph;
import X.InterfaceC43498JJk;
import X.InterfaceC678133v;
import X.J60;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.ui.LoadingSpinnerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class SegmentsMusicPlayerView extends ConstraintLayout implements InterfaceC150336ph, SeekBar.OnSeekBarChangeListener {
    public float A00;
    public int A01;
    public InterfaceC678133v A02;
    public InterfaceC43498JJk A03;
    public List A04;
    public boolean A05;
    public int A06;
    public MusicDataSource A07;
    public boolean A08;
    public final SeekBar A09;
    public final TextView A0A;
    public final LoadingSpinnerView A0B;
    public final int A0C;
    public final int A0D;
    public final View A0E;
    public final View A0F;
    public final ImageView A0G;
    public final C8G6 A0H;
    public final String A0I;
    public final String A0J;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentsMusicPlayerView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A0D() {
        if (this.A07 != null) {
            InterfaceC678133v interfaceC678133v = this.A02;
            if (interfaceC678133v != null) {
                if (!interfaceC678133v.isPlaying()) {
                    setPreviewButtonState(C8G5.A03);
                    InterfaceC678133v interfaceC678133v2 = this.A02;
                    if (interfaceC678133v2 != null) {
                        MusicDataSource musicDataSource = this.A07;
                        if (musicDataSource != null) {
                            interfaceC678133v2.ESz(musicDataSource, this, null, 0, -1, -1, false, false);
                            InterfaceC678133v interfaceC678133v3 = this.A02;
                            if (interfaceC678133v3 != null) {
                                interfaceC678133v3.seekTo(this.A06 + this.A09.getProgress());
                                InterfaceC678133v interfaceC678133v4 = this.A02;
                                if (interfaceC678133v4 != null) {
                                    interfaceC678133v4.E4S();
                                    return;
                                }
                            }
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F("musicPlayer");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlayTimeUpdated(int i) {
        int i2 = (int) (i * this.A00);
        int i3 = this.A06;
        SeekBar seekBar = this.A09;
        if (i2 >= i3 + seekBar.getMax()) {
            onCurrentTrackCompleted();
            return;
        }
        int i4 = this.A06;
        if (i2 < i4) {
            InterfaceC678133v interfaceC678133v = this.A02;
            if (interfaceC678133v != null) {
                if (i4 < interfaceC678133v.Azm()) {
                    InterfaceC678133v interfaceC678133v2 = this.A02;
                    if (interfaceC678133v2 != null) {
                        interfaceC678133v2.seekTo(this.A06);
                        return;
                    }
                }
            }
            C14360o3.A0F("musicPlayer");
            throw C00O.createAndThrow();
        }
        setPreviewButtonState(C8G5.A05);
        seekBar.setProgress(i2 - this.A06);
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackSeekComplete() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStartedPlaying() {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C14360o3.A0B(seekBar, 0);
        InterfaceC678133v interfaceC678133v = this.A02;
        if (interfaceC678133v == null) {
            C14360o3.A0F("musicPlayer");
            throw C00O.createAndThrow();
        }
        interfaceC678133v.seekTo(this.A06 + seekBar.getProgress());
        if (this.A08) {
            A0D();
        }
        this.A08 = false;
    }

    public final void setMusicDataSource(MusicDataSource musicDataSource) {
        C14360o3.A0B(musicDataSource, 0);
        this.A07 = musicDataSource;
        if (!this.A05) {
            InterfaceC678133v interfaceC678133v = this.A02;
            if (interfaceC678133v == null) {
                C14360o3.A0F("musicPlayer");
                throw C00O.createAndThrow();
            }
            interfaceC678133v.ESz(musicDataSource, this, null, 0, -1, -1, false, false);
        }
        setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPreviewButtonState(C8G5 c8g5) {
        String str;
        this.A0H.A01(c8g5);
        int ordinal = c8g5.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 3 && ordinal != 2) {
                throw B4Z.A00();
            }
            str = this.A0I;
        } else {
            str = this.A0J;
        }
        setContentDescription(str);
        this.A0G.setContentDescription(getContentDescription());
    }

    public static /* synthetic */ void setProgressSpeedFactor$default(SegmentsMusicPlayerView segmentsMusicPlayerView, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        segmentsMusicPlayerView.A00 = f;
    }

    private final void setTrackScrubberVisibility(boolean z) {
        ColorStateList valueOf;
        SeekBar seekBar = this.A09;
        seekBar.setEnabled(z);
        Drawable mutate = seekBar.getThumb().mutate();
        int i = 0;
        if (z) {
            i = 255;
        }
        mutate.setAlpha(i);
        if (z) {
            valueOf = null;
        } else {
            valueOf = ColorStateList.valueOf(0);
        }
        seekBar.setProgressTintList(valueOf);
    }

    public final View getSegmentsChevron() {
        return this.A0F;
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackCompleted() {
        InterfaceC678133v interfaceC678133v = this.A02;
        if (interfaceC678133v != null) {
            interfaceC678133v.seekTo(this.A06);
            this.A09.setProgress(0);
            InterfaceC678133v interfaceC678133v2 = this.A02;
            if (interfaceC678133v2 != null) {
                interfaceC678133v2.E4S();
                return;
            }
        }
        C14360o3.A0F("musicPlayer");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlaybackStarted() {
        setPreviewButtonState(C8G5.A05);
        setTrackScrubberVisibility(true);
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPrepared(int i) {
        int min = Math.min(i, this.A01);
        SeekBar seekBar = this.A09;
        if (seekBar.getMax() != min) {
            seekBar.setMax(min);
            seekBar.setProgress(0);
        }
        List list = this.A04;
        if (AbstractC166987dD.A1b(list) && i != 0) {
            List A1Q = AbstractC16960so.A1Q(Integer.valueOf(R.id.segment_button_0), Integer.valueOf(R.id.segment_button_1), Integer.valueOf(R.id.segment_button_2));
            ArrayList A0q = AbstractC167017dG.A0q(A1Q);
            Iterator it = A1Q.iterator();
            while (it.hasNext()) {
                A0q.add(findViewById(AbstractC167007dF.A0B(it)));
            }
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                it2.next();
                C14360o3.A0C(((View) A0q.get(0)).getLayoutParams(), AbstractC111324zv.A00(0));
                throw AbstractC166987dD.A15("getStartTimeMs");
            }
            post(new J60(this, A0q));
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStopped() {
        if (!this.A08) {
            setPreviewButtonState(C8G5.A04);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.A0A.setText(AbstractC189358aC.A01(this.A06 + i));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        InterfaceC678133v interfaceC678133v = this.A02;
        if (interfaceC678133v != null) {
            if (interfaceC678133v.isPlaying()) {
                this.A08 = true;
                InterfaceC678133v interfaceC678133v2 = this.A02;
                if (interfaceC678133v2 != null) {
                    interfaceC678133v2.pause();
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("musicPlayer");
        throw C00O.createAndThrow();
    }

    public final void setPreviewStartTimeMs(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            if (!this.A05) {
                InterfaceC678133v interfaceC678133v = this.A02;
                if (interfaceC678133v == null) {
                    C14360o3.A0F("musicPlayer");
                    throw C00O.createAndThrow();
                }
                interfaceC678133v.seekTo(i);
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i;
        int i2;
        super.setEnabled(z);
        this.A0G.setEnabled(isEnabled());
        this.A0H.A02(isEnabled());
        SeekBar seekBar = this.A09;
        Drawable mutate = seekBar.getThumb().mutate();
        if (isEnabled()) {
            i = this.A0D;
        } else {
            i = this.A0C;
        }
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        seekBar.setEnabled(isEnabled());
        TextView textView = this.A0A;
        if (isEnabled()) {
            i2 = this.A0D;
        } else {
            i2 = this.A0C;
        }
        textView.setTextColor(i2);
    }

    public static final /* synthetic */ void A00(C8G5 c8g5, SegmentsMusicPlayerView segmentsMusicPlayerView) {
        segmentsMusicPlayerView.setPreviewButtonState(c8g5);
    }

    public final void setPreviewDurationMs(int i) {
        this.A01 = i;
    }

    public final void setProgressSpeedFactor(float f) {
        this.A00 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentsMusicPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        int A01 = AbstractC31174DnI.A01(context);
        this.A0D = A01;
        int A03 = AbstractC31174DnI.A03(context);
        this.A0C = A03;
        this.A0J = AbstractC166997dE.A0p(context, 2131973217);
        this.A0I = AbstractC166997dE.A0p(context, 2131973216);
        this.A01 = 60000;
        this.A03 = C41574IaN.A00;
        this.A00 = 1.0f;
        this.A04 = C16930sl.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.segments_music_player_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.preview_button);
        this.A0G = imageView;
        C8G4 c8g4 = new C8G4(context);
        c8g4.A06 = 0;
        c8g4.A0C = 0;
        c8g4.A01 = context.getDrawable(R.drawable.pause);
        c8g4.A02(AbstractC167017dG.A0E(context));
        c8g4.A01(A01);
        c8g4.A05 = Integer.valueOf(A03);
        C8G6 A00 = c8g4.A00();
        this.A0H = A00;
        imageView.setImageDrawable(A00);
        C37846Gl0 c37846Gl0 = new C37846Gl0(this, 14);
        C3P9 A0s = AbstractC166987dD.A0s(imageView);
        A0s.A07 = true;
        A0s.A04 = c37846Gl0;
        A0s.A00();
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.track_time);
        A0e.setText(AbstractC189358aC.A01(0));
        this.A0A = A0e;
        this.A0F = inflate.findViewById(R.id.segments_chevron);
        this.A0E = inflate.findViewById(R.id.close_button);
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.track_scrubber);
        seekBar.setOnSeekBarChangeListener(this);
        seekBar.setMax(this.A01);
        this.A09 = seekBar;
        this.A0B = (LoadingSpinnerView) inflate.findViewById(R.id.loading_spinner_view);
        setEnabled(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentsMusicPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ SegmentsMusicPlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
