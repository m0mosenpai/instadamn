package X;

import android.media.MediaCodec;
import android.os.Handler;

/* loaded from: classes12.dex */
public final class YI0 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Y9S A01;
    public final /* synthetic */ InterfaceC176207sd A02;

    public YI0(Handler handler, Y9S y9s, InterfaceC176207sd interfaceC176207sd) {
        this.A01 = y9s;
        this.A02 = interfaceC176207sd;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y9S y9s = this.A01;
        InterfaceC176207sd interfaceC176207sd = this.A02;
        Handler handler = this.A00;
        if (y9s.A08 != C05F.A01) {
            AbstractC72880XqE.A01(handler, interfaceC176207sd, AbstractC31175DnJ.A0V("prepare() must be called before starting audio encoding. Current state is: ", AbstractC72532Xfl.A00(y9s.A08)));
            return;
        }
        try {
            MediaCodec mediaCodec = y9s.A01;
            if (mediaCodec != null) {
                C0fT.A05(mediaCodec, 876997999);
                y9s.A08 = C05F.A0C;
                if (y9s instanceof C72169XRd) {
                    C72169XRd c72169XRd = (C72169XRd) y9s;
                    c72169XRd.A03.post(c72169XRd.A01);
                }
                AbstractC72880XqE.A00(handler, interfaceC176207sd);
                return;
            }
            AbstractC72880XqE.A01(handler, interfaceC176207sd, AbstractC166987dD.A14("Unexpected null MediaCodec during start"));
        } catch (Exception e) {
            AbstractC72880XqE.A01(handler, interfaceC176207sd, e);
        }
    }
}
