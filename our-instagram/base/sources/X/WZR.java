package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WZR implements InterfaceC71997XEl {
    public boolean A00;
    public final /* synthetic */ WZV A01;

    @Override // X.InterfaceC71997XEl
    public final String Aw2() {
        return null;
    }

    @Override // X.InterfaceC71997XEl
    public final boolean Eju() {
        return false;
    }

    @Override // X.InterfaceC71997XEl
    public final void FAM(int i, Bitmap bitmap) {
    }

    @Override // X.InterfaceC71997XEl
    public final void flush() {
    }

    public WZR(WZV wzv) {
        this.A01 = wzv;
    }

    @Override // X.InterfaceC71997XEl
    public final long AO5(long j) {
        WZV wzv = this.A01;
        if (wzv.A01 != null) {
            LinkedBlockingQueue linkedBlockingQueue = wzv.A04;
            linkedBlockingQueue.getClass();
            linkedBlockingQueue.offer(wzv.A01);
            wzv.A01 = null;
        }
        C66029TyR c66029TyR = (C66029TyR) wzv.A06.poll();
        wzv.A01 = c66029TyR;
        if (c66029TyR != null) {
            MediaCodec.BufferInfo bufferInfo = c66029TyR.A00;
            if (bufferInfo != null && (bufferInfo.flags & 4) != 0) {
                this.A00 = true;
                LinkedBlockingQueue linkedBlockingQueue2 = wzv.A04;
                linkedBlockingQueue2.getClass();
                linkedBlockingQueue2.offer(wzv.A01);
                wzv.A01 = null;
            } else {
                return bufferInfo.presentationTimeUs;
            }
        }
        return -1L;
    }

    @Override // X.InterfaceC71997XEl
    public final C66029TyR AOs(long j) {
        LinkedBlockingQueue linkedBlockingQueue = this.A01.A04;
        linkedBlockingQueue.getClass();
        return (C66029TyR) linkedBlockingQueue.poll(j, TimeUnit.MICROSECONDS);
    }

    @Override // X.InterfaceC71997XEl
    public final void AVe() {
        WZV wzv = this.A01;
        ArrayList arrayList = wzv.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
        LinkedBlockingQueue linkedBlockingQueue = wzv.A04;
        linkedBlockingQueue.getClass();
        linkedBlockingQueue.clear();
        wzv.A06.clear();
        wzv.A04 = null;
    }

    @Override // X.InterfaceC71997XEl
    public final long Aw1() {
        C66029TyR c66029TyR = this.A01.A01;
        if (c66029TyR == null) {
            return -1L;
        }
        return c66029TyR.A00.presentationTimeUs;
    }

    @Override // X.InterfaceC71997XEl
    public final String Aw4() {
        return "VideoTranscoderPassThrough";
    }

    @Override // X.InterfaceC71997XEl
    public final boolean Cei() {
        return this.A00;
    }

    @Override // X.InterfaceC71997XEl
    public final void E5f(MediaFormat mediaFormat, U7W u7w, List list, int i, boolean z) {
        WZV wzv = this.A01;
        wzv.A00 = mediaFormat;
        wzv.A03.countDown();
        int i2 = 0;
        do {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
            ArrayList arrayList = wzv.A02;
            if (arrayList == null) {
                arrayList = new ArrayList();
                wzv.A02 = arrayList;
            }
            arrayList.add(allocateDirect);
            C66029TyR c66029TyR = new C66029TyR(0, allocateDirect, new MediaCodec.BufferInfo());
            LinkedBlockingQueue linkedBlockingQueue = wzv.A04;
            linkedBlockingQueue.getClass();
            linkedBlockingQueue.offer(c66029TyR);
            i2++;
        } while (i2 < 5);
    }

    @Override // X.InterfaceC71997XEl
    public final void E7a(C66029TyR c66029TyR) {
        this.A01.A06.offer(c66029TyR);
    }
}
