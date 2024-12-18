package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.YHz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73529YHz implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Y9S A01;
    public final /* synthetic */ InterfaceC176207sd A02;

    public RunnableC73529YHz(Handler handler, Y9S y9s, InterfaceC176207sd interfaceC176207sd) {
        this.A01 = y9s;
        this.A02 = interfaceC176207sd;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C72168XRc c72168XRc;
        MediaCodec mediaCodec;
        Y9S y9s = this.A01;
        InterfaceC176207sd interfaceC176207sd = this.A02;
        Handler handler = this.A00;
        if (y9s.A08 != C05F.A00) {
            AbstractC72880XqE.A01(handler, interfaceC176207sd, AbstractC31175DnJ.A0V("Must only call prepare() on a stopped AudioEncoder. Current state is: ", AbstractC72532Xfl.A00(y9s.A08)));
            return;
        }
        try {
            try {
                C177567uq c177567uq = y9s.A04;
                MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", c177567uq.A08, c177567uq.A03);
                createAudioFormat.setInteger("aac-profile", 1);
                createAudioFormat.setInteger(TraceFieldType.Bitrate, c177567uq.A01);
                int i = c177567uq.A02;
                if (i > 0) {
                    createAudioFormat.setInteger("max-input-size", i);
                }
                createAudioFormat.setInteger("pcm-encoding", c177567uq.A07);
                y9s.A01 = XgV.A00(null, createAudioFormat, "audio/mp4a-latm");
            } catch (Exception unused) {
                C177567uq c177567uq2 = y9s.A04;
                MediaFormat createAudioFormat2 = MediaFormat.createAudioFormat("audio/mp4a-latm", c177567uq2.A08, c177567uq2.A03);
                createAudioFormat2.setInteger("aac-profile", 1);
                createAudioFormat2.setInteger(TraceFieldType.Bitrate, c177567uq2.A01);
                createAudioFormat2.setInteger("max-input-size", 0);
                createAudioFormat2.setInteger("pcm-encoding", c177567uq2.A07);
                y9s.A01 = XgV.A00(null, createAudioFormat2, "audio/mp4a-latm");
            }
            if (!(y9s instanceof C72169XRd) && (mediaCodec = (c72168XRc = (C72168XRc) y9s).A01) != null) {
                mediaCodec.setCallback(new XPZ(c72168XRc), c72168XRc.A03);
            }
            y9s.A08 = C05F.A01;
            AbstractC72880XqE.A00(handler, interfaceC176207sd);
        } catch (Exception e) {
            AbstractC72880XqE.A01(handler, interfaceC176207sd, e);
        }
    }
}
