package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;

/* renamed from: X.XEj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC71995XEj {
    void addEffect(MediaEffect mediaEffect);

    void addEffect(Integer num, MediaEffect mediaEffect);

    void configure(C69065VhG c69065VhG);

    void disableTrack(int i);

    void enableTrack(int i);

    int getWarmupDurationInSec();

    boolean isEffectSupported(MediaEffect mediaEffect);

    ByteBuffer process(ByteBuffer[] byteBufferArr, long j);

    void removeEffect(MediaEffect mediaEffect);

    void removeEffect(Integer num, MediaEffect mediaEffect);

    void warmup(ByteBuffer[] byteBufferArr, long j);
}
