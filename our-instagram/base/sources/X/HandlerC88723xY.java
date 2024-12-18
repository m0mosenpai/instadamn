package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader;
import java.util.Iterator;

/* renamed from: X.3xY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC88723xY extends Handler {
    public PrivacyControlledUploader A00;
    public C88923xt A01;
    public Iterator A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final C005001p A07;
    public final C88743xa A08;
    public final C88663xS A09;
    public final InterfaceC88683xU A0A;
    public final HandlerThread A0B;
    public final boolean A0C;
    public static final C04060Jx A0E = C04060Jx.A00();
    public static final C88733xZ A0D = new Object();

    private void A00() {
        AbstractC020908f.A00("exitStateMachine");
        try {
            Context context = this.A06;
            C88663xS c88663xS = this.A09;
            int i = c88663xS.A00;
            AbstractC42721y0.A01(context, this.A07, c88663xS.A02, i, this.A05);
            this.A0A.onExit();
            if (this.A0C) {
                this.A0B.quit();
            }
        } finally {
            AbstractC021008g.A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (r1 == null) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.1qu] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r18) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC88723xY.handleMessage(android.os.Message):void");
    }

    public HandlerC88723xY(Context context, HandlerThread handlerThread, C88663xS c88663xS, InterfaceC88683xU interfaceC88683xU, boolean z) {
        super(handlerThread.getLooper());
        this.A07 = new C005001p(2);
        this.A03 = false;
        this.A04 = false;
        this.A08 = new C88743xa(this);
        this.A06 = context;
        this.A0B = handlerThread;
        this.A09 = c88663xS;
        this.A0A = interfaceC88683xU;
        this.A0C = z;
    }
}
