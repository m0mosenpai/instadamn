package X;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: X.OwL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56154OwL implements C11R {
    public final /* synthetic */ String A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    @Override // X.C11R
    public final String getName() {
        return "";
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 0;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onFinish() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    public C56154OwL(String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = str;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.C11R
    public final void run() {
        String str = this.A00;
        InterfaceC16820sZ interfaceC16820sZ = this.A01;
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        AbstractC37302Gc3.A1U(interfaceC16820sZ, interfaceC16660sJ);
        ArrayList A1E = AbstractC166987dD.A1E();
        MediaExtractor mediaExtractor = new MediaExtractor();
        interfaceC16820sZ.invoke();
        try {
            mediaExtractor.setDataSource(str);
        } catch (IOException e) {
            C0w9.A06("ImportAudioUtil", AnonymousClass001.A0g("audio extractor failed to set ", str, " as data source"), e);
            interfaceC16660sJ.invoke(C16930sl.A00);
        }
        int trackCount = mediaExtractor.getTrackCount();
        int i = 0;
        while (true) {
            if (i >= trackCount) {
                break;
            }
            String string = mediaExtractor.getTrackFormat(i).getString("mime");
            if (string != null && AbstractC002300n.A0h(string, "audio/", false)) {
                mediaExtractor.selectTrack(i);
                break;
            }
            i++;
        }
        mediaExtractor.seekTo(0L, 0);
        ByteBuffer allocate = ByteBuffer.allocate(C3OO.FLAG_MOVED);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            if (!mediaExtractor.advance()) {
                break;
            }
            bufferInfo.size = mediaExtractor.readSampleData(allocate, 0);
            bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
            bufferInfo.flags = mediaExtractor.getSampleFlags();
            int i2 = bufferInfo.size;
            if (i2 < 0) {
                interfaceC16660sJ.invoke(C16930sl.A00);
                break;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                float A00 = AbstractC13600mm.A00((float) Math.abs((Math.log(allocate.get(i3)) * 0.25d) - 1.5807000398635864d), 0.0f, 1.0f);
                if (!Float.isNaN(A00)) {
                    MSX.A1Q(A1E, A00);
                }
            }
        }
        interfaceC16660sJ.invoke(A1E);
        mediaExtractor.release();
    }
}
