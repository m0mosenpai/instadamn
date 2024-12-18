package X;

import android.graphics.Picture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.2kJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC57442kJ extends Handler {
    public final Picture A00;
    public final C18240vB A01;
    public final /* synthetic */ C57332k8 A02;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r14.A0a == X.C05F.A01) goto L19;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r27) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC57442kJ.handleMessage(android.os.Message):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC57442kJ(Looper looper, C57332k8 c57332k8) {
        super(looper);
        this.A02 = c57332k8;
        this.A00 = new Picture();
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "MediaRenderCache";
        this.A01 = new C18240vB(A00);
    }

    public final void A00(Message message) {
        int i;
        if (C20150ym.A07(AbstractC20100yh.A00(36310778803912996L))) {
            int i2 = message.what;
            if (i2 != 0) {
                if (i2 != 1) {
                    i = 744540911;
                    if (i2 != 2) {
                        i = 1428024056;
                    }
                } else {
                    i = 1550501481;
                }
            } else {
                i = 966097012;
            }
            this.A01.ATO(new V6R(message, this, i));
            return;
        }
        sendMessage(message);
    }
}
