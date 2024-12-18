package X;

import android.graphics.Point;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;

/* renamed from: X.Ogx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnKeyListenerC55334Ogx implements AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public boolean A00;
    public final C41101vI A01;
    public final C55208OeM A02;
    public final UserSession A03;
    public final IE1 A04;
    public final Point A05;
    public final AudioManager A06;
    public final W5s A07;
    public final CameraSpec A08;

    public final void A00() {
        this.A00 = false;
        C55208OeM c55208OeM = this.A02;
        c55208OeM.A06 = null;
        c55208OeM.A07();
        c55208OeM.A08(1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        if (X.C1LE.A0F(r29) == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.XC9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.PzK, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnKeyListenerC55334Ogx(android.content.Context r27, android.view.TextureView r28, com.instagram.common.session.UserSession r29, X.IE1 r30, java.lang.String r31) {
        /*
            r26 = this;
            java.lang.String r19 = ""
            r0 = r26
            r0.<init>()
            r5 = r29
            r0.A03 = r5
            r1 = r30
            r0.A04 = r1
            java.lang.String r1 = "audio"
            r9 = r27
            java.lang.Object r2 = r9.getSystemService(r1)
            boolean r1 = r2 instanceof android.media.AudioManager
            r15 = 0
            if (r1 == 0) goto Lb4
            android.media.AudioManager r2 = (android.media.AudioManager) r2
        L1e:
            r0.A06 = r2
            X.1vI r1 = new X.1vI
            r1.<init>(r2, r5)
            r0.A01 = r1
            android.graphics.Point r1 = X.ALe.A01(r9, r5)
            X.C14360o3.A07(r1)
            r0.A05 = r1
            int r2 = r1.x
            int r1 = r1.y
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r1 = X.C75I.A01(r5, r2, r1)
            r0.A08 = r1
            X.0Tz r3 = X.C06090Tz.A05
            r1 = 36316018662510465(0x81053a00090f81, double:3.02973466281675E-306)
            boolean r21 = X.C18U.A06(r3, r5, r1)
            java.lang.String r1 = "reels_draft_midcard"
            r4 = r31
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L62
            r1 = 36316018662641539(0x81053a000b0f83, double:3.0297346628996415E-306)
            boolean r1 = X.C18U.A06(r3, r5, r1)
            if (r1 == 0) goto L62
            boolean r1 = X.C1LE.A0F(r5)
            r22 = 1
            if (r1 != 0) goto L64
        L62:
            r22 = 0
        L64:
            r7 = 0
            r23 = r7
            r24 = r7
            r25 = r7
            r20 = r5
            X.W5s r3 = X.AbstractC86593tX.A05(r20, r21, r22, r23, r24, r25)
            r0.A07 = r3
            boolean r6 = X.AbstractC53867Nrv.A00(r5)
            boolean r1 = X.AbstractC53867Nrv.A00(r5)
            X.NAo r2 = new X.NAo
            r8 = r28
            r2.<init>(r8, r6, r1)
            X.AbY r16 = X.AbstractC224689vt.A00(r9, r15, r15, r7)
            X.MYi r10 = new X.MYi
            r10.<init>(r5)
            boolean r1 = r3.A0q
            X.VeK r14 = X.AbstractC50522MSa.A0P(r1)
            X.WYi r11 = new X.WYi
            r11.<init>()
            java.util.LinkedHashMap r22 = X.AbstractC53947NtK.A00(r4, r15)
            X.Opc r13 = X.C55768Opc.A00
            X.PzK r12 = new X.PzK
            r12.<init>()
            r23 = 59008(0xe680, float:8.2688E-41)
            X.OeM r8 = new X.OeM
            r20 = r15
            r21 = r15
            r18 = r2
            r17 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.A02 = r8
            return
        Lb4:
            r2 = r15
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnKeyListenerC55334Ogx.<init>(android.content.Context, android.view.TextureView, com.instagram.common.session.UserSession, X.IE1, java.lang.String):void");
    }

    public final void A01(MediaComposition mediaComposition) {
        C55208OeM c55208OeM = this.A02;
        CameraSpec cameraSpec = this.A08;
        c55208OeM.A0A(mediaComposition, cameraSpec.A03, cameraSpec.A02, -1, -1, 0, true);
        this.A00 = true;
        c55208OeM.A06();
        Boolean bool = AbstractC24321Hb.A00(this.A03).A01;
        if (bool != null && !bool.booleanValue()) {
            c55208OeM.A08(0.0f);
            this.A01.A03(this);
        } else {
            this.A01.A04(this);
            c55208OeM.A08(1.0f);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        AbstractC41751IeQ.A04(new C29891DGf(this, 27), new C30180DRl(this, 31), i);
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        AudioManager audioManager;
        if (this.A00 && (audioManager = this.A06) != null) {
            return AbstractC41751IeQ.A05(audioManager, keyEvent, new C29891DGf(this, 28), i);
        }
        return false;
    }
}
