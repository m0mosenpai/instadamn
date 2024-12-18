package X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.MbN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC50757MbN extends Handler {
    public C51698MsT A00;
    public final AudioManager A01;
    public final C55193Odz A02;
    public final OIh A03;

    public final void A00(int i) {
        sendMessage(obtainMessage(0, i, -1, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r8) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC50757MbN.handleMessage(android.os.Message):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC50757MbN(AudioManager audioManager, Looper looper, C55193Odz c55193Odz, OIh oIh) {
        super(looper);
        AbstractC37302Gc3.A1U(oIh, audioManager);
        this.A02 = c55193Odz;
        this.A03 = oIh;
        this.A01 = audioManager;
        this.A00 = new C51698MsT(31, false, false, false);
    }
}
