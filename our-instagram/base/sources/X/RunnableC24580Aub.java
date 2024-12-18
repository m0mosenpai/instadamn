package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;

/* renamed from: X.Aub, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24580Aub implements Runnable {
    public final /* synthetic */ MediaEffect A00;
    public final /* synthetic */ C9P2 A01;

    public RunnableC24580Aub(MediaEffect mediaEffect, C9P2 c9p2) {
        this.A01 = c9p2;
        this.A00 = mediaEffect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaEffect mediaEffect = this.A00;
        if (mediaEffect instanceof C23504AbK) {
            C23504AbK c23504AbK = (C23504AbK) mediaEffect;
            if (!(c23504AbK.A01 instanceof C199748sQ)) {
                InterfaceC179077xJ BQr = this.A01.A0G.BQr();
                if (BQr instanceof BER) {
                    ((BER) BQr).EFD(c23504AbK);
                }
            }
        }
    }
}
