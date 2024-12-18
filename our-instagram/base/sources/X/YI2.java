package X;

import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes12.dex */
public final class YI2 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Y9T A01;
    public final /* synthetic */ InterfaceC176207sd A02;

    public YI2(Handler handler, Y9T y9t, InterfaceC176207sd interfaceC176207sd) {
        this.A01 = y9t;
        this.A02 = interfaceC176207sd;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y9T y9t = this.A01;
        InterfaceC176207sd interfaceC176207sd = this.A02;
        Handler handler = this.A00;
        if (y9t.A0B != C05F.A00) {
            y9t.A04.A01("pAEe");
            AbstractC72880XqE.A01(handler, interfaceC176207sd, AbstractC31175DnJ.A0V("Must only call prepare() on a stopped AudioEncoder. Current state is: ", AbstractC72532Xfl.A00(y9t.A0B)));
            return;
        }
        try {
            C177567uq c177567uq = y9t.A05;
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", c177567uq.A08, c177567uq.A03);
            createAudioFormat.setInteger("aac-profile", c177567uq.A00);
            createAudioFormat.setInteger(TraceFieldType.Bitrate, c177567uq.A01);
            int i = c177567uq.A02;
            if (i > 0) {
                createAudioFormat.setInteger("max-input-size", i);
            }
            createAudioFormat.setInteger("pcm-encoding", c177567uq.A07);
            y9t.A01 = XgV.A00(null, createAudioFormat, "audio/mp4a-latm");
        } catch (Exception unused) {
            C175927s7 c175927s7 = y9t.A04;
            c175927s7.A01("pAEe1");
            try {
                C177567uq c177567uq2 = y9t.A05;
                MediaFormat createAudioFormat2 = MediaFormat.createAudioFormat("audio/mp4a-latm", c177567uq2.A08, c177567uq2.A03);
                createAudioFormat2.setInteger("aac-profile", c177567uq2.A00);
                createAudioFormat2.setInteger(TraceFieldType.Bitrate, c177567uq2.A01);
                createAudioFormat2.setInteger("max-input-size", 0);
                createAudioFormat2.setInteger("pcm-encoding", c177567uq2.A07);
                y9t.A01 = XgV.A00(null, createAudioFormat2, "audio/mp4a-latm");
            } catch (Exception e) {
                c175927s7.A01("pAEe2");
                AbstractC72880XqE.A01(handler, interfaceC176207sd, e);
                return;
            }
        }
        y9t.A0B = C05F.A01;
        y9t.A04.A01("pAEs");
        AbstractC72880XqE.A00(handler, interfaceC176207sd);
    }
}
