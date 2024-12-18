package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* renamed from: X.AZk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23411AZk implements InterfaceC25158BBd {
    public final /* synthetic */ C23416AZp A00;

    public C23411AZk(C23416AZp c23416AZp) {
        this.A00 = c23416AZp;
    }

    @Override // X.InterfaceC25158BBd
    public final MediaFormat BaG() {
        C23416AZp c23416AZp = this.A00;
        ByteBuffer byteBuffer = C23416AZp.A06;
        C177567uq c177567uq = c23416AZp.A00.A01;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", c177567uq.A08, c177567uq.A03);
        createAudioFormat.setInteger("aac-profile", c23416AZp.A00.A01.A00);
        return createAudioFormat;
    }
}
