package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import java.io.File;

/* renamed from: X.OlS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC55534OlS implements SeekBar.OnSeekBarChangeListener, TextureView.SurfaceTextureListener, InterfaceC58280PsY {
    public C55208OeM A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final FrameLayout A05;
    public final SeekBar A06;
    public final UserSession A07;
    public final ConstrainedTextureView A08;
    public final C50743Max A09;
    public final C47Z A0A;
    public final InterfaceC58130Ppt A0B;
    public final C50982Mfp A0C;
    public final C51012MgJ A0D;
    public final P1I A0E;
    public final InterfaceC09390do A0F;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (X.C1LE.A08(r0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r29.A07, 36330398212572000L) != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.PzK, java.lang.Object] */
    @Override // android.view.TextureView.SurfaceTextureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r30, int r31, int r32) {
        /*
            r29 = this;
            r9 = 0
            r11 = r30
            X.C14360o3.A0B(r11, r9)
            r1 = r29
            X.Mfp r5 = r1.A0C
            X.2GT r0 = r5.A05
            java.lang.Object r0 = r0.A02()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto Le9
            int r27 = r0.intValue()
            if (r27 <= 0) goto Le9
            com.instagram.common.session.UserSession r4 = r1.A07
            X.0Tz r0 = X.C06090Tz.A05
            r2 = 36330398212572000(0x81124e00024360, double:3.038828348177465E-306)
            boolean r0 = X.C18U.A06(r0, r4, r2)
            if (r0 == 0) goto Le9
        L29:
            X.47Z r4 = r1.A0A
            X.8Kc r0 = r4.A12
            if (r0 == 0) goto Le6
            X.8aZ r2 = r0.A03
        L31:
            X.8aZ r0 = X.EnumC189548aZ.A06
            boolean r0 = X.AbstractC167007dF.A1X(r2, r0)
            r6 = r0 ^ 1
            java.lang.String r5 = r4.A3t
            if (r5 != 0) goto L41
            java.lang.String r5 = X.AbstractC167017dG.A0j()
        L41:
            com.instagram.common.session.UserSession r0 = r1.A07
            X.0Tz r8 = X.C06090Tz.A05
            r2 = 36316018662510465(0x81053a00090f81, double:3.02973466281675E-306)
            boolean r13 = X.C18U.A06(r8, r0, r2)
            r3 = 0
            float r2 = r4.A00()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5e
            boolean r2 = X.C1LE.A08(r0)
            r14 = 1
            if (r2 != 0) goto L5f
        L5e:
            r14 = 0
        L5f:
            r12 = r0
            r15 = r9
            r16 = r9
            r17 = r9
            X.W5s r10 = X.AbstractC86593tX.A05(r12, r13, r14, r15, r16, r17)
            android.content.Context r12 = r1.A04
            X.NAn r7 = new X.NAn
            r7.<init>(r11)
            if (r6 == 0) goto Le0
            boolean r11 = X.AbstractC50707Ma2.A01(r4)
            r2 = 36327469044939356(0x810fa400033a5c, double:3.0369759307717696E-306)
            boolean r2 = X.C18U.A06(r8, r0, r2)
            X.AbY r19 = X.ADB.A01(r12, r0, r11, r9, r2)
        L83:
            X.MYi r13 = new X.MYi
            r13.<init>(r0)
            boolean r3 = r10.A0q
            r2 = 0
            X.VeK r17 = X.AbstractC50522MSa.A0P(r3)
            int r8 = X.AbstractC188878Yd.A01(r12)
            r3 = 1080(0x438, float:1.513E-42)
            int r8 = java.lang.Math.min(r3, r8)
            r3 = 1
            X.WYi r14 = new X.WYi
            r14.<init>(r3, r8)
            java.lang.String r8 = "cover_photo_selector"
            java.util.LinkedHashMap r25 = X.AbstractC53947NtK.A00(r8, r2)
            X.Opc r16 = X.C55768Opc.A00
            X.PzK r15 = new X.PzK
            r15.<init>()
            r26 = 59008(0xe680, float:8.2688E-41)
            X.OeM r11 = new X.OeM
            r22 = r5
            r23 = r2
            r24 = r2
            r18 = r2
            r20 = r10
            r21 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.A00 = r11
            com.facebook.videolite.transcoder.base.composition.MediaComposition r22 = X.C55183Odo.A03(r12, r0, r4, r6)
            if (r22 == 0) goto Ldf
            X.OeM r4 = r1.A00
            if (r4 == 0) goto Ldf
            int r2 = r1.A03
            int r0 = r1.A02
            r25 = -1
            r26 = r25
            r28 = r3
            r21 = r4
            r23 = r2
            r24 = r0
            r21.A0A(r22, r23, r24, r25, r26, r27, r28)
        Ldf:
            return
        Le0:
            r2 = 0
            X.AbY r19 = X.AbstractC224689vt.A00(r12, r2, r2, r9)
            goto L83
        Le6:
            r2 = 0
            goto L31
        Le9:
            X.Pqj r0 = r5.A0D
            int r27 = r0.Bzi()
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TextureViewSurfaceTextureListenerC55534OlS.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public TextureViewSurfaceTextureListenerC55534OlS(Context context, FrameLayout frameLayout, SeekBar seekBar, C07X c07x, UserSession userSession, C51012MgJ c51012MgJ, C50743Max c50743Max, C47Z c47z, InterfaceC58130Ppt interfaceC58130Ppt, C50982Mfp c50982Mfp, InterfaceC09390do interfaceC09390do, int i, int i2) {
        AbstractC167007dF.A1H(userSession, 2, c51012MgJ);
        C14360o3.A0B(c07x, 13);
        this.A04 = context;
        this.A07 = userSession;
        this.A05 = frameLayout;
        this.A06 = seekBar;
        this.A09 = c50743Max;
        this.A0C = c50982Mfp;
        this.A0D = c51012MgJ;
        this.A0B = interfaceC58130Ppt;
        this.A0A = c47z;
        this.A03 = i;
        this.A02 = i2;
        this.A0F = interfaceC09390do;
        this.A0E = new P1I(c50982Mfp);
        ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(context);
        this.A08 = constrainedTextureView;
        constrainedTextureView.setVisibility(0);
        constrainedTextureView.setSurfaceTextureListener(this);
        constrainedTextureView.setAspectRatio(0.5625f);
        frameLayout.addView(constrainedTextureView, 0);
        seekBar.setOnSeekBarChangeListener(this);
        AbstractC37301Gc2.A0w(c07x, c50982Mfp.A07, new C57746PjZ(this, 25), 15);
    }

    @Override // X.InterfaceC58280PsY
    public final Bitmap AuD() {
        return this.A08.getBitmap();
    }

    @Override // X.InterfaceC58280PsY
    public final void ELc(boolean z, float f) {
        this.A01 = z;
        Context context = this.A04;
        UserSession userSession = this.A07;
        Bitmap bitmap = this.A08.getBitmap();
        Bitmap bitmap2 = (Bitmap) ((MWT) this.A0D.A01.getValue()).A01;
        int i = this.A03;
        int i2 = this.A02;
        C55186Odr.A01(context, bitmap, bitmap2, userSession, this.A0E, (File) this.A0F.getValue(), 0.5625f, i, i2);
        this.A0A.A06 = AbstractC167017dG.A0K((Number) this.A0C.A06.A02());
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        C55208OeM c55208OeM = this.A00;
        if (c55208OeM != null) {
            c55208OeM.A05();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            int max = (i * 100) / this.A06.getMax();
            C50982Mfp c50982Mfp = this.A0C;
            c50982Mfp.A00(max, false);
            int A06 = AbstractC25227BEk.A06((Number) c50982Mfp.A05.A02(), 0);
            C55208OeM c55208OeM = this.A00;
            if (c55208OeM != null) {
                c55208OeM.A09(A06);
            }
            this.A05.postDelayed(new POV(this), 50L);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C55208OeM c55208OeM = this.A00;
        if (c55208OeM != null) {
            c55208OeM.A06();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.A0B.DoA();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.A0B.Dp1();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C55208OeM c55208OeM = this.A00;
        if (c55208OeM != null) {
            c55208OeM.A07();
        }
        this.A00 = null;
        return true;
    }
}
