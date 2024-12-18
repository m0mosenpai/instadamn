package X;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WZT implements InterfaceC72004XEs {
    public final /* synthetic */ WZV A00;

    @Override // X.InterfaceC72004XEs
    public final void A8L(MediaEffect mediaEffect, int i) {
    }

    @Override // X.InterfaceC72004XEs
    public final void AAf(int i) {
    }

    @Override // X.InterfaceC72004XEs
    public final void E5g(Context context, MYB myb, WDI wdi, VN4 vn4, U7W u7w, int i) {
    }

    @Override // X.InterfaceC72004XEs
    public final void EFF(MediaEffect mediaEffect, int i) {
    }

    @Override // X.InterfaceC72004XEs
    public final void EGU(int i) {
    }

    @Override // X.InterfaceC72004XEs
    public final void EGl(long j) {
    }

    @Override // X.InterfaceC72004XEs
    public final void flush() {
    }

    public WZT(WZV wzv) {
        this.A00 = wzv;
    }

    @Override // X.InterfaceC72004XEs
    public final void APt(long j) {
        WZV wzv = this.A00;
        C66029TyR c66029TyR = wzv.A01;
        if (c66029TyR != null) {
            c66029TyR.A00.presentationTimeUs = j;
            wzv.A05.offer(c66029TyR);
            wzv.A01 = null;
        }
    }

    @Override // X.InterfaceC72004XEs
    public final void AVe() {
        this.A00.A05.clear();
    }

    @Override // X.InterfaceC72004XEs
    public final String B1p() {
        return "VideoTranscoderPassThrough";
    }

    @Override // X.InterfaceC72004XEs
    public final void EEO(C66029TyR c66029TyR) {
        LinkedBlockingQueue linkedBlockingQueue;
        if (c66029TyR.A02 >= 0 && (linkedBlockingQueue = this.A00.A04) != null) {
            linkedBlockingQueue.offer(c66029TyR);
        }
    }

    @Override // X.InterfaceC72004XEs
    public final void Elz() {
        C66029TyR c66029TyR = new C66029TyR(0, null, new MediaCodec.BufferInfo());
        c66029TyR.EQc(0, 0, 0L, 4);
        this.A00.A05.offer(c66029TyR);
    }

    @Override // X.InterfaceC72004XEs
    public final MediaFormat getOutputFormat() {
        try {
            this.A00.A03.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MediaFormat mediaFormat = this.A00.A00;
        mediaFormat.getClass();
        return mediaFormat;
    }

    @Override // X.InterfaceC72004XEs
    public final C66029TyR AOt(long j) {
        WZV wzv = this.A00;
        if (wzv.A08) {
            wzv.A08 = false;
            C66029TyR c66029TyR = new C66029TyR(-1, null, new MediaCodec.BufferInfo());
            c66029TyR.A01 = true;
            return c66029TyR;
        }
        if (!wzv.A07) {
            wzv.A07 = true;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
            ArrayList arrayList = wzv.A02;
            if (arrayList == null) {
                arrayList = new ArrayList();
                wzv.A02 = arrayList;
            }
            arrayList.add(allocateDirect);
            C66029TyR c66029TyR2 = new C66029TyR(0, allocateDirect, new MediaCodec.BufferInfo());
            MediaFormat mediaFormat = wzv.A00;
            mediaFormat.getClass();
            if (VN3.A00(mediaFormat, c66029TyR2)) {
                return c66029TyR2;
            }
        }
        return (C66029TyR) wzv.A05.poll(250000L, TimeUnit.MICROSECONDS);
    }

    @Override // X.InterfaceC72004XEs
    public final int BaL() {
        MediaFormat outputFormat = getOutputFormat();
        String str = "rotation-degrees";
        if (!outputFormat.containsKey("rotation-degrees")) {
            str = "rotation";
            if (!outputFormat.containsKey("rotation")) {
                return 0;
            }
        }
        return outputFormat.getInteger(str);
    }
}
