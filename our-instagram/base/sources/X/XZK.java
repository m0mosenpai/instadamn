package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes12.dex */
public final class XZK extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ XZO A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XZK(XZO xzo, String str, int i, int i2) {
        super(82, 2, false, false);
        this.A02 = xzo;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Y3X y3x;
        final boolean z;
        XZO xzo = this.A02;
        try {
            y3x = new Y3X(C0fT.A02("video/avc", 286193318), xzo.A04, ((AbstractC184988In) xzo).A0F);
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.A01, this.A00);
            createVideoFormat.setInteger(TraceFieldType.Bitrate, (int) (r1 * r0 * 20 * 4 * 0.07d));
            createVideoFormat.setInteger("i-frame-interval", 3);
            createVideoFormat.setInteger("max-input-size", 0);
            int codecCount = MediaCodecList.getCodecCount();
            int i = 0;
            while (true) {
                if (i >= codecCount) {
                    break;
                }
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder()) {
                    for (String str : codecInfoAt.getSupportedTypes()) {
                        if (str.equalsIgnoreCase("video/avc")) {
                            int[] iArr = codecInfoAt.getCapabilitiesForType("video/avc").colorFormats;
                            iArr.getClass();
                            for (int i2 : iArr) {
                                if (i2 == 19 || i2 == 21) {
                                    createVideoFormat.setInteger("color-format", i2);
                                    y3x.A00 = Integer.valueOf(i2);
                                    int i3 = Y3X.A06;
                                    if (i3 == 0) {
                                        int[] iArr2 = Y3X.A07;
                                        int i4 = 0;
                                        do {
                                            int i5 = iArr2[i4];
                                            createVideoFormat.setInteger("frame-rate", i5);
                                            try {
                                                C0fT.A07(y3x.A01, null, createVideoFormat, null, 1, 389405912);
                                                Y3X.A06 = i5;
                                            } catch (RuntimeException unused) {
                                                i4++;
                                            }
                                        } while (i4 < 3);
                                    } else {
                                        createVideoFormat.setInteger("frame-rate", i3);
                                        C0fT.A07(y3x.A01, null, createVideoFormat, null, 1, -791738342);
                                    }
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                i++;
            }
        } catch (Exception e) {
            AbstractC12120kG.A0B("BoomerangCaptureController", "Could not create Boomerang encoder", e);
            C0K8.A0F("BoomerangCaptureController", "Could not create Boomerang encoder", e);
            y3x = null;
        }
        z = false;
        final String str2 = this.A03;
        C11T.A03(new Runnable() { // from class: X.YIb
            @Override // java.lang.Runnable
            public final void run() {
                XZK xzk = this;
                String str3 = str2;
                boolean z2 = z;
                Y3X y3x2 = y3x;
                final XZO xzo2 = xzk.A02;
                str3.getClass();
                if (XZO.A02(xzo2, str3)) {
                    if (z2) {
                        xzo2.A07 = y3x2;
                        C174757qB c174757qB = ((AbstractC184988In) xzo2).A04;
                        c174757qB.getClass();
                        if (c174757qB.CWZ()) {
                            String str4 = xzo2.A0G;
                            Y3X y3x3 = xzo2.A07;
                            y3x3.getClass();
                            final C72807XnU c72807XnU = new C72807XnU(xzo2.A03, y3x3, str4, xzo2.A00, xzo2.A02, xzo2.A01, xzo2.A09);
                            InterfaceC25160BBf interfaceC25160BBf = new InterfaceC25160BBf() { // from class: X.YBl
                                @Override // X.InterfaceC25160BBf
                                public final void Dad(C196708n0 c196708n0) {
                                    final long j;
                                    long j2;
                                    InterfaceC25160BBf interfaceC25160BBf2;
                                    final XZO xzo3 = xzo2;
                                    final C72807XnU c72807XnU2 = c72807XnU;
                                    synchronized (xzo3) {
                                        String str5 = c72807XnU2.A05;
                                        str5.getClass();
                                        if (XZO.A02(xzo3, str5)) {
                                            byte[] bArr = c196708n0.A09;
                                            if (bArr == null) {
                                                AbstractC12120kG.A03("BoomerangCaptureController", "handlePreviewFrame(): data is null");
                                            } else {
                                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                                if (xzo3.A0E == -1) {
                                                    j = 0;
                                                } else {
                                                    j = (long) ((elapsedRealtime - xzo3.A0E) * 1000000.0d);
                                                }
                                                C11T.A03(new Runnable() { // from class: X.YIO
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        long j3;
                                                        XZO xzo4 = xzo3;
                                                        C72807XnU c72807XnU3 = c72807XnU2;
                                                        long j4 = j;
                                                        String str6 = c72807XnU3.A05;
                                                        str6.getClass();
                                                        if (XZO.A02(xzo4, str6)) {
                                                            C8HV c8hv = ((AbstractC184988In) xzo4).A0H;
                                                            float f = (float) j4;
                                                            if (((AbstractC184988In) xzo4).A0A) {
                                                                j3 = 1000000000;
                                                            } else {
                                                                j3 = 1800000000;
                                                            }
                                                            c8hv.A00(f / ((float) j3));
                                                        }
                                                    }
                                                });
                                                if (xzo3.A0E == -1) {
                                                    xzo3.A0E = elapsedRealtime;
                                                } else {
                                                    int i6 = xzo3.A0C;
                                                    xzo3.A0C++;
                                                    xzo3.A0F = j;
                                                    C14120nc.A00().ATO(new XZL(c72807XnU2, xzo3, bArr, i6));
                                                    if (!((AbstractC184988In) xzo3).A0A) {
                                                        j2 = 1800000000;
                                                    } else {
                                                        j2 = 1000000000;
                                                    }
                                                    if (j > j2 || xzo3.A0H) {
                                                        xzo3.A0D = xzo3.A0C;
                                                        C174757qB c174757qB2 = ((AbstractC184988In) xzo3).A04;
                                                        c174757qB2.getClass();
                                                        if (c174757qB2.CWZ() && (interfaceC25160BBf2 = xzo3.A05) != null) {
                                                            ((AbstractC184988In) xzo3).A04.EFz(interfaceC25160BBf2);
                                                            xzo3.A05 = null;
                                                        }
                                                        XZO.A00(xzo3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            };
                            xzo2.A05 = interfaceC25160BBf;
                            C175007qa c175007qa = ((BasicCameraOutputController) C174757qB.A02(((AbstractC184988In) xzo2).A04)).A04;
                            if (c175007qa != null) {
                                c175007qa.A0N.A9g(interfaceC25160BBf);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AbstractC12120kG.A03("BoomerangCaptureController", "encoder.configure failed in startRecordingInternal()");
                    xzo2.A0E(false);
                }
            }
        });
    }
}
