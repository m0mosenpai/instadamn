package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.messagethread.voice.VoiceMessageControlsView;
import com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.JTm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43678JTm implements C7QD, InterfaceC161707Mf, C7QE, C7GU, InterfaceC162937Re {
    public int A00;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public L7B A04;
    public C7SX A05;
    public InterfaceC16660sJ A06;
    public C7QH A07;
    public final FrameLayout A08;
    public final VoiceVisualizer A09;
    public final IgImageView A0A;
    public final InterfaceC56392iX A0B;
    public final VoiceMessageControlsView A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final C47380KwV A0F;

    public C43678JTm(View view, C47380KwV c47380KwV) {
        C14360o3.A0B(view, 1);
        this.A0F = c47380KwV;
        this.A0B = AbstractC166997dE.A0X(view, R.id.voice_message_transcription);
        this.A0C = (VoiceMessageControlsView) AbstractC166997dE.A0R(view, R.id.voice_message_controls);
        this.A01 = -16777216;
        this.A00 = -16777216;
        this.A0E = MHH.A00(view, 16);
        this.A08 = (FrameLayout) AbstractC166997dE.A0R(view, R.id.message_content_voice_bubble_container);
        this.A0A = AbstractC167007dF.A0T(view, R.id.playback_control);
        this.A09 = (VoiceVisualizer) AbstractC166997dE.A0R(view, R.id.message_content_voice_visualizer);
        this.A0D = C1XM.A00(MGF.A00);
        this.A06 = MKR.A00;
    }

    public final void A01(C45117Jxm c45117Jxm, DirectMessageIdentifier directMessageIdentifier) {
        C7SX c7sx = this.A05;
        if (c7sx != null && c7sx.A07.A02(directMessageIdentifier)) {
            ((VoiceMessageTranscriptionTextView) this.A0B.getView()).setStatus(A00(c45117Jxm, this));
            this.A0C.A0D();
        }
    }

    @Override // X.InterfaceC161707Mf
    public final void APo(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C47380KwV c47380KwV = this.A0F;
        RectF A0G = AbstractC13880nE.A0G(this.A09);
        float rawX = (motionEvent.getRawX() - A0G.left) / A0G.width();
        C7DK c7dk = c47380KwV.A00.A04;
        if (c7dk != null) {
            c7dk.A04(AbstractC166987dD.A0B(rawX, c7dk.A02()));
        }
    }

    @Override // X.C7GU
    public final void Cy3() {
        this.A0A.setImageDrawable(this.A03);
        this.A09.A09 = false;
        this.A0C.A0E(null, false);
    }

    @Override // X.C7GU
    public final void Cy4(int i, int i2, boolean z) {
        this.A09.setPlaybackPercentage(i / i2);
        if (i != i2) {
            i2 -= i;
        }
        this.A0C.setTimerValueMs(i2);
    }

    @Override // X.InterfaceC161707Mf
    public final void DBy(float f, float f2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r4 != r0.A00) goto L12;
     */
    @Override // X.InterfaceC161707Mf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Eiq(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.KwV r0 = r4.A0F
            r3 = 1
            X.77j r0 = r0.A00
            X.7DK r1 = r0.A04
            if (r1 == 0) goto L3c
            X.5TA r0 = r1.A06
            if (r0 == 0) goto L1e
            boolean r0 = r0.A01
            if (r0 != 0) goto L1e
            X.L2x r0 = r1.A02
            if (r0 == 0) goto L1e
            X.7GU r0 = r0.A00
            r1 = 1
            if (r4 == r0) goto L1f
        L1e:
            r1 = 0
        L1f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L3c
            if (r1 != r3) goto L3c
            com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer r0 = r4.A09
            android.graphics.RectF r2 = X.AbstractC13880nE.A0G(r0)
            float r1 = r5.getRawX()
            float r0 = r5.getRawY()
            boolean r0 = r2.contains(r1, r0)
            if (r0 == 0) goto L3c
            return r3
        L3c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43678JTm.Eiq(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Ej5() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.KhE] */
    public static final AbstractC46454KhE A00(C45117Jxm c45117Jxm, C43678JTm c43678JTm) {
        int A0H = AbstractC166987dD.A0H(c45117Jxm.A01);
        boolean z = true;
        if (A0H != 2) {
            if (A0H != 3 && A0H != 1 && A0H != 0) {
                if (A0H == 4) {
                    String str = c45117Jxm.A03;
                    String str2 = (String) AbstractC166987dD.A17(c43678JTm.A0E);
                    if (!c45117Jxm.A05 && !c45117Jxm.A04) {
                        z = false;
                    }
                    return new KVR(str, str2, c43678JTm.A06, z);
                }
                throw B4Z.A00();
            }
            return KVS.A00;
        }
        return new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.KhE] */
    public final void A02(DirectMessageIdentifier directMessageIdentifier) {
        C7SX c7sx = this.A05;
        if (c7sx != null && c7sx.A07.A02(directMessageIdentifier)) {
            ((VoiceMessageTranscriptionTextView) this.A0B.getView()).setStatus(new Object());
            this.A0C.A0D();
        }
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A08;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A07;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A07 = c7qh;
    }

    @Override // X.InterfaceC162937Re
    public final void F82(int i) {
        C7MU.A00(this.A08.getBackground(), i);
        C7MU.A00(this.A0A.getDrawable(), i);
    }
}
