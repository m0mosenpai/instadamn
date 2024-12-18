package X;

import android.media.MediaPlayer;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.Locale;

/* renamed from: X.OZn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55041OZn {
    public MediaPlayer A00;
    public BottomSheetViewController A01;
    public C5RO A02;
    public String A03;
    public String A04;
    public final ViewGroup A05;
    public final AbstractC59962oe A06;
    public final UserSession A07;
    public final AC0 A08;
    public final ClipsCreationViewModel A09;
    public final O2C A0A;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C55041OZn r3, java.lang.String r4) {
        /*
            android.media.MediaPlayer r1 = r3.A00
            if (r1 == 0) goto L2b
            boolean r0 = r1.isPlaying()     // Catch: java.io.IOException -> L14 java.io.FileNotFoundException -> L18 java.lang.IllegalStateException -> L1c
            if (r0 != 0) goto L2b
            r1.setDataSource(r4)     // Catch: java.io.IOException -> L14 java.io.FileNotFoundException -> L18 java.lang.IllegalStateException -> L1c
            r1.prepare()     // Catch: java.io.IOException -> L14 java.io.FileNotFoundException -> L18 java.lang.IllegalStateException -> L1c
            r1.start()     // Catch: java.io.IOException -> L14 java.io.FileNotFoundException -> L18 java.lang.IllegalStateException -> L1c
            return
        L14:
            r2 = move-exception
            java.lang.String r1 = "playTtsAudio-> IOException"
            goto L1f
        L18:
            r2 = move-exception
            java.lang.String r1 = "playTtsAudio-> FileNotFoundException"
            goto L1f
        L1c:
            r2 = move-exception
            java.lang.String r1 = "playTtsAudio-> IllegalStateException"
        L1f:
            android.media.MediaPlayer r0 = r3.A00
            if (r0 == 0) goto L26
            r0.reset()
        L26:
            java.lang.String r0 = "TextToSpeechController"
            X.AbstractC12120kG.A07(r0, r1, r2)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55041OZn.A00(X.OZn, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        if (r2 == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C55041OZn r13, java.lang.String r14) {
        /*
            X.AC0 r6 = r13.A08
            java.util.List r0 = r6.A00()
            java.util.ArrayList r5 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        Lf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r2 = r4.next()
            int r1 = r3 + 1
            if (r3 >= 0) goto L25
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L25:
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r2 = (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r2
            java.lang.String r8 = r2.A00
            java.util.Map r0 = r6.A01()
            java.lang.String r9 = X.AbstractC166987dD.A1A(r2, r0)
            if (r3 != 0) goto L49
            if (r14 == 0) goto L3c
            int r0 = r14.length()
            r11 = 0
            if (r0 != 0) goto L3d
        L3c:
            r11 = 1
        L3d:
            r10 = 0
            X.MvR r7 = new X.MvR
            r12 = r10
            r7.<init>(r8, r9, r10, r11, r12)
            r5.add(r7)
            r3 = r1
            goto Lf
        L49:
            boolean r11 = X.C14360o3.A0K(r14, r8)
            goto L3d
        L4e:
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r0 = r13.A01
            if (r0 == 0) goto Ldd
            X.Psa r4 = r0.A03
            boolean r0 = r4 instanceof X.AbstractC56270Oyf
            if (r0 == 0) goto Ldb
            X.Oyf r4 = (X.AbstractC56270Oyf) r4
            if (r4 == 0) goto Ldb
            r6 = 0
            X.8Jx r0 = r4.A01
            r3 = 0
            r9 = 0
            if (r0 != 0) goto L88
            java.util.Iterator r8 = r5.iterator()
            r7 = r9
            r2 = 0
        L69:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r1 = r8.next()
            r0 = r1
            X.8Jx r0 = (X.InterfaceC185318Jx) r0
            boolean r0 = r0.Cce()
            if (r0 == 0) goto L69
            if (r2 != 0) goto L83
            r7 = r1
            r2 = 1
            goto L69
        L81:
            if (r2 != 0) goto L84
        L83:
            r7 = r9
        L84:
            X.8Jx r7 = (X.InterfaceC185318Jx) r7
            r4.A01 = r7
        L88:
            boolean r0 = X.AbstractC25226BEj.A1b(r5)
            if (r0 == 0) goto Ldb
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00()
            X.2UU r1 = r0.A0A
            boolean r0 = r1 instanceof X.AbstractC51119MiO
            if (r0 == 0) goto L9f
            X.MiO r1 = (X.AbstractC51119MiO) r1
            if (r1 == 0) goto L9f
            r1.A00(r5)
        L9f:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00()
            r0.setVisibility(r6)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00()
            androidx.recyclerview.widget.LinearLayoutManager r2 = X.AbstractC31177DnL.A0J(r0)
            java.util.Iterator r1 = r5.iterator()
        Lb2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r1.next()
            X.8Jx r0 = (X.InterfaceC185318Jx) r0
            boolean r0 = r0.Cce()
            if (r0 != 0) goto Lc8
            int r3 = r3 + 1
            goto Lb2
        Lc7:
            r3 = -1
        Lc8:
            int r0 = r2.A1a()
            if (r3 < r0) goto Ld4
            int r0 = r2.A1b()
            if (r3 <= r0) goto Ldb
        Ld4:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00()
            r0.A0n(r3)
        Ldb:
            r13.A04 = r14
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55041OZn.A01(X.OZn, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.AC0, java.lang.Object] */
    public C55041OZn(ViewGroup viewGroup, AbstractC59962oe abstractC59962oe, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, O2C o2c) {
        C2GT c2gt;
        this.A06 = abstractC59962oe;
        this.A0A = o2c;
        this.A09 = clipsCreationViewModel;
        this.A05 = viewGroup;
        this.A07 = userSession;
        C14360o3.A08(Locale.US);
        this.A08 = new Object();
        if (clipsCreationViewModel != null && (c2gt = clipsCreationViewModel.A0E) != null) {
            AbstractC31180DnO.A1F(abstractC59962oe, c2gt, MSW.A1E(this, 21), 64);
        }
    }
}
