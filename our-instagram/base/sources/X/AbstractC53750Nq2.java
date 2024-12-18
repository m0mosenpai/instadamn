package X;

import android.media.MediaCodec;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: X.Nq2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53750Nq2 {
    public static final String A00(Throwable th) {
        StringBuilder A1C;
        String message;
        Throwable th2 = new Throwable(th);
        Throwable th3 = null;
        boolean z = false;
        while (th != null && !th.equals(th2)) {
            if ((th instanceof IOException) && (message = th.getMessage()) != null && AbstractC001900j.A0a(message, "No space left on device", false)) {
                return "NoSpaceLeftOnDevice";
            }
            if (!(th instanceof FileNotFoundException) && !(th instanceof C53411Nk0)) {
                if (th instanceof C52036N0k) {
                    return "CodecNotSupportedException";
                }
                if (th instanceof C52037N0l) {
                    return "MediaCodecConfigureException";
                }
                if (!(th instanceof InterfaceC57820Pkm)) {
                    if (th instanceof C223589u1) {
                        return "ImageTextureNullPointerException";
                    }
                    if (th instanceof PW0) {
                        return "TranscodeOutputSurfaceException";
                    }
                    if (th instanceof B4M) {
                        return "RendererTimeoutRuntimeException";
                    }
                    if (th instanceof C53413Nk2) {
                        return "VideoRenderResultException";
                    }
                    if (th instanceof J6R) {
                        return "ValidationException";
                    }
                    if (th instanceof C80D) {
                        A1C = AbstractC166987dD.A1C();
                        A1C.append("GlException(");
                        A1C.append(((C80D) th).A00);
                    } else {
                        if (th instanceof InterruptedException) {
                            return "InterruptedException";
                        }
                        if (!(th instanceof MediaCodec.CodecException)) {
                            if ((th instanceof AbstractC53392Njh) || (th instanceof AbstractC223559ty)) {
                                th3 = th;
                            }
                            th = th.getCause();
                            if (z) {
                                if (th2 != null) {
                                    th2 = th2.getCause();
                                } else {
                                    th2 = null;
                                }
                            }
                            z = !z;
                        }
                    }
                }
                return "MediaCodecException";
            }
            A1C = AbstractC166987dD.A1C();
            A1C.append("FileNotFoundException(");
            A1C.append(C50702MZx.A05(th));
            return MSX.A0l(A1C, ')');
        }
        if (th3 instanceof AbstractC223559ty) {
            return AnonymousClass001.A0I("OneCameraException(", ')', ((AbstractC223559ty) th3).A01);
        }
        if (th3 instanceof C52038N0m) {
            return "MediaDemuxerException";
        }
        if (th3 instanceof C52039N0n) {
            return "NoTrackException";
        }
        if (th3 instanceof C52040N0o) {
            return "NoVideoTrackException";
        }
        if (th3 instanceof AbstractC53392Njh) {
            return "VideoTranscoderException";
        }
        return "UnknownException";
    }
}
