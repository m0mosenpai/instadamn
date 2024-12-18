package X;

import android.media.MediaMuxer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.facebook.tigon.tigonhuc.HucClient;
import java.io.File;
import java.io.IOException;

/* renamed from: X.MbG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC50751MbG extends Handler {
    public final /* synthetic */ C55172Odb A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC50751MbG(Looper looper, C55172Odb c55172Odb) {
        super(looper);
        this.A00 = c55172Odb;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        File parentFile;
        Looper looper;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C55172Odb c55172Odb = this.A00;
                        if (c55172Odb.A09) {
                            C55172Odb.A00(c55172Odb);
                        }
                        if (c55172Odb.A01 != null) {
                            InterfaceC178337w7 interfaceC178337w7 = c55172Odb.A06;
                            if (interfaceC178337w7 != null && interfaceC178337w7.CUZ(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS)) {
                                Y2X.A00(c55172Odb.A01);
                            } else {
                                C0fT.A03(c55172Odb.A01, 483024479);
                            }
                            c55172Odb.A01 = null;
                        }
                        try {
                            try {
                                MediaMuxer mediaMuxer = c55172Odb.A02;
                                if (mediaMuxer != null) {
                                    mediaMuxer.release();
                                }
                            } catch (IllegalStateException e) {
                                C55172Odb.A01(c55172Odb, e, "MediaMuxer.release() Error");
                            }
                            c55172Odb.A02 = null;
                            Surface surface = c55172Odb.A03;
                            if (surface != null) {
                                surface.release();
                                c55172Odb.A03 = null;
                            }
                            HandlerC50751MbG handlerC50751MbG = c55172Odb.A05;
                            if (handlerC50751MbG != null && (looper = handlerC50751MbG.getLooper()) != null) {
                                looper.quitSafely();
                            }
                            InterfaceC58102PpR interfaceC58102PpR = c55172Odb.A04;
                            if (interfaceC58102PpR != null) {
                                interfaceC58102PpR.DDT();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            c55172Odb.A02 = null;
                            throw th;
                        }
                    }
                    throw AbstractC166987dD.A18(AnonymousClass001.A0O("Unsupported msg what = ", i));
                }
                C55172Odb.A00(this.A00);
                return;
            }
            C55172Odb.A03(this.A00, false);
            return;
        }
        Object obj = message.obj;
        if (obj != null) {
            C55172Odb c55172Odb2 = this.A00;
            String str = (String) obj;
            int i2 = message.arg1;
            if (c55172Odb2.A01 == null) {
                C0K8.A0C("BoomerangEncoder", "attempted to handle video encoding without configuring first");
                return;
            }
            try {
                InterfaceC178337w7 interfaceC178337w72 = c55172Odb2.A06;
                if (interfaceC178337w72 != null && !interfaceC178337w72.B5M(3).isEmpty() && (parentFile = AbstractC166987dD.A11(str).getParentFile()) != null) {
                    parentFile.mkdirs();
                }
                MediaMuxer mediaMuxer2 = new MediaMuxer(str, 0);
                c55172Odb2.A02 = mediaMuxer2;
                mediaMuxer2.setOrientationHint(i2);
                C0fT.A05(c55172Odb2.A01, -726206464);
                c55172Odb2.A09 = true;
            } catch (IOException e2) {
                C55172Odb.A01(c55172Odb2, e2, "IOException: Cannot create MediaMuxer");
            } catch (IllegalStateException e3) {
                C55172Odb.A02(c55172Odb2, e3);
            }
        }
    }
}
