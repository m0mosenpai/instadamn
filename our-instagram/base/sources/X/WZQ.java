package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.util.List;

/* loaded from: classes11.dex */
public final class WZQ implements InterfaceC71997XEl {
    public final /* synthetic */ WZW A00;

    @Override // X.InterfaceC71997XEl
    public final void E5f(MediaFormat mediaFormat, U7W u7w, List list, int i, boolean z) {
        C65831Tuo A05;
        boolean isEmpty = list.isEmpty();
        WZW wzw = this.A00;
        if (isEmpty) {
            A05 = U7T.A01(mediaFormat, wzw.A07.A04, u7w, mediaFormat.getString("mime"));
        } else {
            A05 = wzw.A0A.A05(mediaFormat, wzw.A07.A04, u7w, list, false);
        }
        wzw.A05 = A05;
        A05.A02();
    }

    @Override // X.InterfaceC71997XEl
    public final void FAM(int i, Bitmap bitmap) {
    }

    @Override // X.InterfaceC71997XEl
    public final void flush() {
    }

    public WZQ(WZW wzw) {
        this.A00 = wzw;
    }

    @Override // X.InterfaceC71997XEl
    public final long AO5(long j) {
        WZW wzw = this.A00;
        C66029TyR c66029TyR = wzw.A04;
        long j2 = -1;
        if (c66029TyR != null && c66029TyR.A02 >= 0) {
            MediaCodec.BufferInfo bufferInfo = c66029TyR.A00;
            long j3 = bufferInfo.presentationTimeUs;
            wzw.A05.A04(c66029TyR, MSY.A1R((j3 > 0L ? 1 : (j3 == 0L ? 0 : -1))));
            if ((bufferInfo.flags & 4) != 0) {
                wzw.A09 = true;
            } else {
                if (bufferInfo.presentationTimeUs >= 0) {
                    C69463Vnm c69463Vnm = wzw.A07;
                    c69463Vnm.A01++;
                    C66048Tyl c66048Tyl = c69463Vnm.A0A;
                    c66048Tyl.getClass();
                    c66048Tyl.A00();
                }
                j2 = j3;
            }
            wzw.A04 = null;
        }
        C66029TyR A01 = wzw.A05.A01(j);
        if (A01 != null && A01.A02 >= 0) {
            wzw.A04 = A01;
            wzw.A00 = A01.A00.presentationTimeUs;
        }
        return j2;
    }

    @Override // X.InterfaceC71997XEl
    public final C66029TyR AOs(long j) {
        return this.A00.A05.A00(j);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Tyj, java.lang.Object] */
    @Override // X.InterfaceC71997XEl
    public final void AVe() {
        ?? obj = new Object();
        new C67628Uti((C66046Tyj) obj, this.A00.A05).A00();
        obj.A01();
    }

    @Override // X.InterfaceC71997XEl
    public final long Aw1() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC71997XEl
    public final String Aw2() {
        return this.A00.A05.A01;
    }

    @Override // X.InterfaceC71997XEl
    public final String Aw4() {
        try {
            return this.A00.A05.A05.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC71997XEl
    public final boolean Cei() {
        return this.A00.A09;
    }

    @Override // X.InterfaceC71997XEl
    public final void E7a(C66029TyR c66029TyR) {
        this.A00.A05.A03(c66029TyR);
    }

    @Override // X.InterfaceC71997XEl
    public final boolean Eju() {
        return this.A00.A08;
    }
}
