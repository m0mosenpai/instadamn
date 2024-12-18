package com.instagram.creation.capture.quickcapture.mediasend;

import X.A8X;
import X.ACA;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C211689Zc;
import X.C26086BgF;
import X.C36941nr;
import X.C47Z;
import X.InterfaceC16620sF;
import X.InterfaceC185598Lb;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.mediasend.PermanentMediaSenderImpl$sendVideo$1", f = "PermanentMediaSenderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class PermanentMediaSenderImpl$sendVideo$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ C26086BgF A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C36941nr A02;
    public final /* synthetic */ InterfaceC185598Lb A03;
    public final /* synthetic */ ACA A04;
    public final /* synthetic */ C211689Zc A05;
    public final /* synthetic */ A8X A06;
    public final /* synthetic */ C47Z A07;
    public final /* synthetic */ String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermanentMediaSenderImpl$sendVideo$1(C26086BgF c26086BgF, UserSession userSession, C36941nr c36941nr, InterfaceC185598Lb interfaceC185598Lb, ACA aca, C211689Zc c211689Zc, A8X a8x, C47Z c47z, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = c36941nr;
        this.A01 = userSession;
        this.A08 = str;
        this.A07 = c47z;
        this.A04 = aca;
        this.A05 = c211689Zc;
        this.A06 = a8x;
        this.A00 = c26086BgF;
        this.A03 = interfaceC185598Lb;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C36941nr c36941nr = this.A02;
        UserSession userSession = this.A01;
        String str = this.A08;
        C47Z c47z = this.A07;
        return new PermanentMediaSenderImpl$sendVideo$1(this.A00, userSession, c36941nr, this.A03, this.A04, this.A05, this.A06, c47z, str, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PermanentMediaSenderImpl$sendVideo$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.AbstractC09560e7.A00(r18)
            r2 = r17
            X.1nr r11 = r2.A02
            com.instagram.common.session.UserSession r10 = r2.A01
            java.lang.String r9 = r2.A08
            android.media.MediaMetadataRetriever r8 = new android.media.MediaMetadataRetriever
            r8.<init>()
            r4 = 0
            r6 = 0
            r8.setDataSource(r9)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7f
            r0 = 9
            java.lang.String r0 = r8.extractMetadata(r0)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7f
            if (r0 == 0) goto L28
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r0)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7f
            if (r0 == 0) goto L28
            int r7 = r0.intValue()     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7f
            goto L29
        L28:
            r7 = 0
        L29:
            r0 = 18
            java.lang.String r0 = r8.extractMetadata(r0)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7e
            if (r0 == 0) goto L3c
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r0)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7e
            if (r0 == 0) goto L3c
            int r5 = r0.intValue()     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7e
            goto L3d
        L3c:
            r5 = 0
        L3d:
            r0 = 19
            java.lang.String r0 = r8.extractMetadata(r0)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L82
            if (r0 == 0) goto L50
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r0)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L82
            if (r0 == 0) goto L50
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L82
            goto L51
        L50:
            r3 = 0
        L51:
            r0 = 24
            java.lang.String r0 = r8.extractMetadata(r0)     // Catch: java.lang.IllegalArgumentException -> L76 java.lang.Throwable -> L79
            if (r0 == 0) goto L63
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r0)     // Catch: java.lang.IllegalArgumentException -> L76 java.lang.Throwable -> L79
            if (r0 == 0) goto L63
            int r6 = r0.intValue()     // Catch: java.lang.IllegalArgumentException -> L76 java.lang.Throwable -> L79
        L63:
            android.graphics.Bitmap r1 = X.ALv.A01(r8)     // Catch: java.lang.Throwable -> L68
            goto L6e
        L68:
            r0 = move-exception
            X.0e5 r1 = new X.0e5     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L86
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L86
        L6e:
            boolean r0 = r1 instanceof X.C09540e5     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L86
            if (r0 == 0) goto L73
            r1 = r4
        L73:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L86
            goto L8e
        L76:
            r6 = r7
            r0 = 0
            goto L88
        L79:
            r0 = move-exception
            r8.release()
            throw r0
        L7e:
            r6 = r7
        L7f:
            r0 = 0
            r5 = 0
            goto L84
        L82:
            r6 = r7
            r0 = 0
        L84:
            r3 = 0
            goto L88
        L86:
            r0 = r6
            r6 = r7
        L88:
            r8.release()
            r7 = r6
            r6 = r0
            goto L92
        L8e:
            r8.release()
            r4 = r1
        L92:
            java.io.File r1 = X.AbstractC166987dD.A11(r9)
            r0 = 3
            com.instagram.common.gallery.Medium r9 = X.C8IU.A03(r1, r0, r7)
            r9.A04 = r3
            r9.A0B = r5
            r9.A07 = r6
            if (r4 == 0) goto Lb5
            r1 = 1
            java.io.File r0 = X.AbstractC917048o.A00()
            X.AHW.A02(r4, r0, r1)
            java.lang.String r0 = r0.getCanonicalPath()
            r9.A0a = r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r9.A0G
            r0.A0B = r1
        Lb5:
            X.47Z r0 = r2.A07
            X.ACA r13 = r2.A04
            X.9Zc r14 = r2.A05
            X.A8X r15 = r2.A06
            X.BgF r8 = r2.A00
            X.8Lb r12 = r2.A03
            X.B01 r7 = new X.B01
            r16 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.C11T.A02(r7)
            X.0eB r0 = X.C0eB.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.mediasend.PermanentMediaSenderImpl$sendVideo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
