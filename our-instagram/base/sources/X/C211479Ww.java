package X;

import com.facebook.cameracore.audiograph.AudioPipelineImpl;
import java.nio.ByteBuffer;

/* renamed from: X.9Ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211479Ww extends A4V {
    public final ByteBuffer A00;
    public final /* synthetic */ AudioPipelineImpl A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C211479Ww(AudioPipelineImpl audioPipelineImpl, int i) {
        super(i);
        this.A01 = audioPipelineImpl;
        this.A00 = ByteBuffer.allocateDirect(super.A00);
    }
}
