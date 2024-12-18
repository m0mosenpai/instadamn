package X;

import android.media.MediaFormat;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.Vqk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69521Vqk {
    public C65831Tuo A00;

    public final void A00(C70087W2j c70087W2j) {
        int i = c70087W2j.A04;
        int i2 = c70087W2j.A01;
        int i3 = 2;
        int i4 = c70087W2j.A00;
        C69520Vqj c69520Vqj = c70087W2j.A02;
        if (c69520Vqj != null) {
            i3 = c69520Vqj.A00;
        }
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        createAudioFormat.setInteger("aac-profile", i3);
        createAudioFormat.setInteger("max-input-size", 64000);
        if (i4 > 0) {
            createAudioFormat.setInteger(TraceFieldType.Bitrate, i4);
        }
        if (i > 0) {
            createAudioFormat.setInteger("sample-rate", i);
        }
        if (i2 > 0) {
            createAudioFormat.setInteger("channel-count", i2);
        }
        C65831Tuo A02 = U7T.A02(createAudioFormat, VCV.BUFFERS, null, "audio/mp4a-latm", null);
        this.A00 = A02;
        A02.A02();
    }
}
