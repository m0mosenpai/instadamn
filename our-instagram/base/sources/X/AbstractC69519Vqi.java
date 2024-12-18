package X;

import android.media.MediaCodec;
import android.view.Surface;

/* renamed from: X.Vqi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69519Vqi {
    public final /* synthetic */ C66046Tyj A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.Tyj, java.lang.Object] */
    public final void A00() {
        String str;
        AbstractC69519Vqi c67628Uti;
        C68231VIr c68231VIr;
        try {
            if (this instanceof C67628Uti) {
                C67628Uti c67628Uti2 = (C67628Uti) this;
                switch (c67628Uti2.A00) {
                    case 0:
                        C65831Tuo c65831Tuo = (C65831Tuo) c67628Uti2.A02;
                        if (c65831Tuo != null) {
                            try {
                                StringBuilder sb = c65831Tuo.A08;
                                sb.append("stopB,");
                                ?? obj = new Object();
                                MediaCodec mediaCodec = c65831Tuo.A05;
                                try {
                                    C0fT.A06(mediaCodec, -2100426665);
                                } catch (Exception unused) {
                                    if (c65831Tuo.A0B) {
                                        try {
                                            Thread.sleep(c65831Tuo.A04);
                                            C0fT.A06(mediaCodec, -1425558754);
                                        } catch (Exception unused2) {
                                        }
                                    }
                                }
                                if (c65831Tuo.A0B) {
                                    c67628Uti = new C67627Uth(mediaCodec, obj, c65831Tuo.A04);
                                    c68231VIr = new Object();
                                } else {
                                    c67628Uti = new C67628Uti(mediaCodec, (C66046Tyj) obj);
                                    c68231VIr = new Object();
                                }
                                c68231VIr.A00 = c67628Uti;
                                c68231VIr.A00.A00();
                                c65831Tuo.A02 = null;
                                c65831Tuo.A03 = null;
                                c65831Tuo.A00 = null;
                                Surface surface = c65831Tuo.A06;
                                if (surface != null) {
                                    surface.release();
                                }
                                Throwable th = obj.A00;
                                if (th == null) {
                                    sb.append("stopE,");
                                    return;
                                }
                                throw th;
                            } catch (Throwable th2) {
                                if (th2 instanceof MediaCodec.CodecException) {
                                    str = AbstractC1126356r.A03(th2);
                                } else {
                                    str = "null";
                                }
                                throw new IllegalStateException(AnonymousClass001.A0u("codec info:  ", c65831Tuo.A01, " mediaCodecException: ", str), th2);
                            }
                        }
                        return;
                    case 1:
                        InterfaceC71998XEm interfaceC71998XEm = (InterfaceC71998XEm) c67628Uti2.A02;
                        if (interfaceC71998XEm != null) {
                            interfaceC71998XEm.release();
                            return;
                        }
                        return;
                    case 2:
                        InterfaceC72006XEu interfaceC72006XEu = (InterfaceC72006XEu) c67628Uti2.A02;
                        if (interfaceC72006XEu != null) {
                            interfaceC72006XEu.release();
                            return;
                        }
                        return;
                    default:
                        MediaCodec mediaCodec2 = (MediaCodec) c67628Uti2.A02;
                        if (mediaCodec2 != null) {
                            C0fT.A03(mediaCodec2, -1813984660);
                            return;
                        }
                        return;
                }
            }
            C67627Uth c67627Uth = (C67627Uth) this;
            MediaCodec mediaCodec3 = c67627Uth.A01;
            try {
                C0fT.A03(mediaCodec3, -562929442);
                return;
            } catch (Exception unused3) {
                Thread.sleep(c67627Uth.A00);
                C0fT.A03(mediaCodec3, 116870011);
                return;
            }
        } catch (Throwable th3) {
            C66046Tyj.A00(this.A00, th3);
        }
        C66046Tyj.A00(this.A00, th3);
    }

    public AbstractC69519Vqi(C66046Tyj c66046Tyj) {
        this.A00 = c66046Tyj;
    }
}
