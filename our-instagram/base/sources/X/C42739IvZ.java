package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.IvZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42739IvZ implements InterfaceC150336ph, SeekBar.OnSeekBarChangeListener {
    public InterfaceC88573xF A00;
    public InterfaceC88563xE A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final View A05;
    public final ImageView A06;
    public final SeekBar A07;
    public final TextView A08;
    public final C3PE A09;
    public final C8G6 A0A;
    public final InterfaceC678133v A0B;
    public final int A0C;
    public final UserSession A0D;
    public final JHC A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;

    public C42739IvZ(View view, UserSession userSession, InterfaceC60442pS interfaceC60442pS, JHC jhc, C677733r c677733r) {
        AbstractC25233BEq.A0v(1, view, userSession, interfaceC60442pS);
        HJA hja = new HJA(0, jhc, this);
        this.A09 = hja;
        Context context = view.getContext();
        this.A05 = view;
        this.A0D = userSession;
        int A01 = AbstractC31174DnI.A01(context);
        this.A04 = A01;
        int A03 = AbstractC31174DnI.A03(context);
        this.A03 = A03;
        this.A0G = context.getString(2131954079);
        this.A0F = context.getString(2131954078);
        this.A0B = AbstractC677833s.A00(context, userSession, interfaceC60442pS, c677733r, "BottomSheetMusicPlayerController", AbstractC677833s.A02(userSession));
        this.A0E = jhc;
        this.A0H = true;
        this.A0C = 60000;
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.preview_button);
        this.A06 = A0I;
        C8G4 c8g4 = new C8G4(AbstractC166997dE.A0L(A0I));
        c8g4.A06 = 0;
        c8g4.A0C = 0;
        c8g4.A01 = context.getDrawable(R.drawable.pause);
        c8g4.A02(context.getResources().getDimensionPixelSize(R.dimen.music_bottom_sheet_preview_button_size));
        c8g4.A01(A01);
        c8g4.A05 = Integer.valueOf(A03);
        C8G6 A00 = c8g4.A00();
        this.A0A = A00;
        A0I.setImageDrawable(A00);
        C3P9 A0s = AbstractC166987dD.A0s(A0I);
        A0s.A07 = true;
        A0s.A04 = hja;
        A0s.A00();
        SeekBar seekBar = (SeekBar) view.requireViewById(R.id.track_scrubber);
        this.A07 = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        seekBar.setMax(60000);
        this.A08 = AbstractC166987dD.A0e(view, R.id.track_time);
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackCompleted() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlaybackStarted() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackSeekComplete() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStartedPlaying() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r1 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C42739IvZ r4) {
        /*
            android.view.View r0 = r4.A05
            android.content.Context r3 = r0.getContext()
            X.3xE r0 = r4.A01
            r2 = 0
            if (r0 == 0) goto L2e
            r1 = 1
            boolean r0 = r0.Ej0()
            if (r0 != r1) goto L2e
            X.3xE r0 = r4.A01
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.getShouldMuteAudioReason()
            if (r0 == 0) goto L2e
            int r0 = r0.length()
            if (r0 == 0) goto L2e
            X.3xE r0 = r4.A01
            if (r0 == 0) goto L2a
            java.lang.String r2 = r0.getShouldMuteAudioReason()
        L2a:
            X.C9GR.A09(r3, r2)
            return
        L2e:
            X.3xF r0 = r4.A00
            if (r0 == 0) goto L3b
            com.instagram.music.common.model.MusicDataSource r1 = r0.BVb()
            r0 = 2131968065(0x7f134041, float:1.9573014E38)
            if (r1 == 0) goto L3e
        L3b:
            r0 = 2131968045(0x7f13402d, float:1.9572974E38)
        L3e:
            java.lang.String r2 = r3.getString(r0)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42739IvZ.A00(X.IvZ):void");
    }

    public static final void A02(C42739IvZ c42739IvZ, boolean z) {
        int i;
        ViewOnTouchListenerC42050IkJ viewOnTouchListenerC42050IkJ;
        int i2;
        c42739IvZ.A06.setEnabled(z);
        c42739IvZ.A0A.A02(z);
        SeekBar seekBar = c42739IvZ.A07;
        Drawable mutate = seekBar.getThumb().mutate();
        if (z) {
            i = c42739IvZ.A04;
        } else {
            i = c42739IvZ.A03;
        }
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        seekBar.setEnabled(z);
        TextView textView = c42739IvZ.A08;
        if (textView != null) {
            if (z) {
                i2 = c42739IvZ.A04;
            } else {
                i2 = c42739IvZ.A03;
            }
            textView.setTextColor(i2);
        }
        View view = c42739IvZ.A05;
        if (z) {
            viewOnTouchListenerC42050IkJ = null;
        } else {
            viewOnTouchListenerC42050IkJ = new ViewOnTouchListenerC42050IkJ(c42739IvZ, 2);
        }
        view.setOnTouchListener(viewOnTouchListenerC42050IkJ);
        if (textView != null) {
            textView.setText(AbstractC189358aC.A01(0));
        }
        seekBar.setProgress(0);
        A01(c42739IvZ, C8G5.A04);
    }

    public static final boolean A03(C42739IvZ c42739IvZ) {
        InterfaceC88563xE interfaceC88563xE;
        InterfaceC88573xF interfaceC88573xF = c42739IvZ.A00;
        if (interfaceC88573xF != null && c42739IvZ.A01 != null && interfaceC88573xF.BVb() != null && (interfaceC88563xE = c42739IvZ.A01) != null && !interfaceC88563xE.Ej0() && C36A.A08(c42739IvZ.A0D)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlayTimeUpdated(int i) {
        SeekBar seekBar = this.A07;
        if (i >= seekBar.getMax()) {
            this.A0B.pause();
            i = 0;
        } else {
            A01(this, C8G5.A05);
        }
        seekBar.setProgress(i);
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPrepared(int i) {
        if (this.A0H) {
            i = Math.min(i, this.A0C);
        }
        SeekBar seekBar = this.A07;
        if (seekBar.getMax() != i) {
            seekBar.setMax(i);
            seekBar.setProgress(0);
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStopped() {
        if (!this.A02) {
            A01(this, C8G5.A04);
            this.A0E.DUe();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        TextView textView = this.A08;
        if (textView != null) {
            textView.setText(AbstractC189358aC.A01(this.A07.getProgress()));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        InterfaceC678133v interfaceC678133v = this.A0B;
        if (interfaceC678133v.isPlaying()) {
            this.A02 = true;
            interfaceC678133v.pause();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.A02) {
            InterfaceC678133v interfaceC678133v = this.A0B;
            interfaceC678133v.seekTo(this.A07.getProgress());
            interfaceC678133v.E4S();
        }
        this.A02 = false;
    }

    public static final void A01(C42739IvZ c42739IvZ, C8G5 c8g5) {
        String str;
        int ordinal = c8g5.ordinal();
        ImageView imageView = c42739IvZ.A06;
        if (ordinal != 0) {
            str = c42739IvZ.A0F;
        } else {
            str = c42739IvZ.A0G;
        }
        imageView.setContentDescription(str);
        c42739IvZ.A0A.A01(c8g5);
    }
}
