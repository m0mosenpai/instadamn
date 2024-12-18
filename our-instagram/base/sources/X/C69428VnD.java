package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.util.concurrent.Semaphore;

/* renamed from: X.VnD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69428VnD {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public final long A03;
    public final MediaCodec A04;
    public final Handler A05;
    public final C69470Vnt A06;
    public final Semaphore A07;
    public final MediaFormat A08;

    public C69428VnD(MediaCodec mediaCodec, MediaFormat mediaFormat, Handler handler, C69470Vnt c69470Vnt, Semaphore semaphore, long j) {
        this.A04 = mediaCodec;
        this.A08 = mediaFormat;
        this.A06 = c69470Vnt;
        this.A07 = semaphore;
        this.A05 = handler;
        this.A03 = j;
    }
}
