package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import java.util.List;

/* renamed from: X.Tyg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66044Tyg implements InterfaceC71997XEl {
    public MediaFormat A00;
    public U7W A01;
    public long A02 = -1;
    public C66029TyR A03;
    public C65831Tuo A04;
    public C69378VmO A05;
    public boolean A06;
    public final /* synthetic */ WZU A07;

    /* JADX WARN: Type inference failed for: r5v0, types: [X.Tyj, java.lang.Object] */
    @Override // X.InterfaceC71997XEl
    public final void AVe() {
        long j;
        AbstractC66043Tyf.A00("VideoTranscoderJBMR2", "finish", new Object[0]);
        ?? obj = new Object();
        new C67628Uti((C66046Tyj) obj, this.A04).A00();
        C69378VmO c69378VmO = this.A05;
        if (c69378VmO != null) {
            long j2 = c69378VmO.A01;
            C66048Tyl c66048Tyl = c69378VmO.A05;
            c66048Tyl.getClass();
            synchronized (c66048Tyl) {
                j = c66048Tyl.A01;
            }
            AbstractC66043Tyf.A00("VideoTranscoderJBMR2", "finish: mFrameDropPercent=%s", Double.valueOf(((j2 - j) / c69378VmO.A01) * 100.0d));
            C69378VmO c69378VmO2 = this.A05;
            C68923VeN c68923VeN = c69378VmO2.A06;
            String A00 = AbstractC111324zv.A00(1824);
            AbstractC66043Tyf.A00(A00, "release", new Object[0]);
            Surface surface = c69378VmO2.A04;
            if (surface != null) {
                surface.release();
            }
            if (c69378VmO2.A02 != null) {
                InterfaceC72007XEv interfaceC72007XEv = c68923VeN.A00;
                if (interfaceC72007XEv != null) {
                    interfaceC72007XEv.DMH(c69378VmO2.A00);
                }
                c69378VmO2.A02.setOnFrameAvailableListener(null);
                c69378VmO2.A02.release();
            }
            c69378VmO2.A04 = null;
            c69378VmO2.A02 = null;
            c69378VmO2.A05 = null;
            if (c69378VmO2.A03 != null) {
                AbstractC66043Tyf.A00(A00, "release: mHandlerThread.quitSafely", new Object[0]);
                c69378VmO2.A03.quitSafely();
                c69378VmO2.A03 = null;
            }
        }
        obj.A01();
    }

    @Override // X.InterfaceC71997XEl
    public final void E5f(MediaFormat mediaFormat, U7W u7w, List list, int i, boolean z) {
        C65831Tuo A05;
        this.A00 = mediaFormat;
        this.A01 = u7w;
        WZU wzu = this.A07;
        this.A05 = new C69378VmO(wzu.A00, u7w, i);
        if (list.isEmpty() && !z) {
            String string = mediaFormat.getString("mime");
            string.getClass();
            A05 = U7T.A01(mediaFormat, this.A05.A04, u7w, string);
        } else {
            A05 = wzu.A02.A05(mediaFormat, this.A05.A04, u7w, list, z);
        }
        this.A04 = A05;
        if (u7w.A0m()) {
            try {
                this.A04.A02();
                return;
            } catch (Exception e) {
                String str = null;
                try {
                    str = this.A04.A05.getName();
                } catch (IllegalStateException unused) {
                }
                throw new IllegalStateException(AnonymousClass001.A0R("codec name:", str), e);
            }
        }
        this.A04.A02();
    }

    @Override // X.InterfaceC71997XEl
    public final boolean Eju() {
        return false;
    }

    @Override // X.InterfaceC71997XEl
    public final void flush() {
        AbstractC66043Tyf.A00("VideoTranscoderJBMR2", "flush", new Object[0]);
        C65831Tuo c65831Tuo = this.A04;
        c65831Tuo.getClass();
        StringBuilder sb = c65831Tuo.A08;
        sb.append("flushB,");
        c65831Tuo.A05.flush();
        sb.append("flushE,");
        this.A02 = -1L;
        this.A06 = false;
        this.A03 = null;
    }

    public C66044Tyg(WZU wzu) {
        this.A07 = wzu;
    }

    @Override // X.InterfaceC71997XEl
    public final long AO5(long j) {
        MediaFormat mediaFormat;
        U7W u7w;
        C66029TyR c66029TyR = this.A03;
        long j2 = -1;
        if (c66029TyR != null && c66029TyR.A02 >= 0) {
            MediaCodec.BufferInfo bufferInfo = c66029TyR.A00;
            long j3 = bufferInfo.presentationTimeUs;
            if (Build.VERSION.SDK_INT >= 29 && (mediaFormat = this.A00) != null && mediaFormat.containsKey("color-transfer") && this.A00.getInteger("color-transfer") == 6 && (u7w = this.A01) != null && u7w.A15()) {
                int i = this.A03.A02;
                C65831Tuo c65831Tuo = this.A04;
                c65831Tuo.getClass();
                C68685VaL c68685VaL = new C68685VaL(c65831Tuo.A05.getOutputFormat(i));
                C69378VmO c69378VmO = this.A05;
                c69378VmO.getClass();
                InterfaceC72007XEv interfaceC72007XEv = c69378VmO.A06.A00;
                interfaceC72007XEv.getClass();
                interfaceC72007XEv.FB9(c68685VaL, c69378VmO.A00);
            }
            try {
                C65831Tuo c65831Tuo2 = this.A04;
                c65831Tuo2.getClass();
                C66029TyR c66029TyR2 = this.A03;
                boolean z = false;
                if (bufferInfo.presentationTimeUs >= 0) {
                    z = true;
                }
                c65831Tuo2.A04(c66029TyR2, z);
                if ((bufferInfo.flags & 4) != 0) {
                    this.A06 = true;
                } else {
                    if (bufferInfo.presentationTimeUs >= 0) {
                        C69378VmO c69378VmO2 = this.A05;
                        c69378VmO2.getClass();
                        c69378VmO2.A01++;
                        C66048Tyl c66048Tyl = c69378VmO2.A05;
                        c66048Tyl.getClass();
                        c66048Tyl.A00();
                    }
                    j2 = j3;
                }
                this.A03 = null;
            } catch (IllegalStateException e) {
                C65831Tuo c65831Tuo3 = this.A04;
                c65831Tuo3.getClass();
                throw new IllegalStateException(AnonymousClass001.A0q("codec info: ", c65831Tuo3.A01, " , mDecoder Presentation Time: ", j3), e);
            }
        }
        try {
            C65831Tuo c65831Tuo4 = this.A04;
            c65831Tuo4.getClass();
            C66029TyR A01 = c65831Tuo4.A01(j);
            if (A01 != null && A01.A02 >= 0) {
                this.A03 = A01;
                this.A02 = A01.A00.presentationTimeUs;
            }
            return j2;
        } catch (Throwable th) {
            throw new IllegalStateException(AnonymousClass001.A0Q("Previous pts: ", j2), th);
        }
    }

    @Override // X.InterfaceC71997XEl
    public final C66029TyR AOs(long j) {
        C65831Tuo c65831Tuo = this.A04;
        c65831Tuo.getClass();
        return c65831Tuo.A00(j);
    }

    @Override // X.InterfaceC71997XEl
    public final long Aw1() {
        return this.A02;
    }

    @Override // X.InterfaceC71997XEl
    public final String Aw2() {
        C65831Tuo c65831Tuo = this.A04;
        c65831Tuo.getClass();
        return c65831Tuo.A01;
    }

    @Override // X.InterfaceC71997XEl
    public final String Aw4() {
        C65831Tuo c65831Tuo = this.A04;
        c65831Tuo.getClass();
        try {
            return c65831Tuo.A05.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC71997XEl
    public final boolean Cei() {
        return this.A06;
    }

    @Override // X.InterfaceC71997XEl
    public final void E7a(C66029TyR c66029TyR) {
        C65831Tuo c65831Tuo = this.A04;
        c65831Tuo.getClass();
        c65831Tuo.A03(c66029TyR);
    }

    @Override // X.InterfaceC71997XEl
    public final void FAM(int i, Bitmap bitmap) {
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.FAM(i, bitmap);
    }
}
