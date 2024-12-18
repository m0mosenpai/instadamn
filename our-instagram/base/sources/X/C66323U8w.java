package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.ByteBuffer;

/* renamed from: X.U8w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66323U8w extends MediaCodec.Callback {
    public boolean A00;
    public final /* synthetic */ AbstractC71188Wpa A01;
    public final /* synthetic */ UF9 A02;

    public C66323U8w(UF9 uf9) {
        this.A02 = uf9;
        this.A01 = uf9;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        AbstractC71188Wpa abstractC71188Wpa = this.A01;
        if (mediaCodec == abstractC71188Wpa.A02) {
            android.util.Log.e("EncoderBase", AbstractC167017dG.A0n(codecException, "onError: ", new StringBuilder()));
            abstractC71188Wpa.A02();
            if (codecException == null) {
                W8u.A00(abstractC71188Wpa.A0O, null);
            } else {
                W8u.A00(abstractC71188Wpa.A0O, codecException);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        AbstractC71188Wpa abstractC71188Wpa = this.A01;
        if (mediaCodec == abstractC71188Wpa.A02 && !abstractC71188Wpa.A09) {
            AbstractC166997dE.A1W(abstractC71188Wpa.A0P, i);
            abstractC71188Wpa.A01();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        IllegalStateException illegalStateException;
        AbstractC71188Wpa abstractC71188Wpa = this.A01;
        if (mediaCodec == abstractC71188Wpa.A02 && !this.A00) {
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                AbstractC50522MSa.A0v(bufferInfo, outputBuffer);
                C70107W4e c70107W4e = abstractC71188Wpa.A07;
                if (c70107W4e != null) {
                    long j = bufferInfo.presentationTimeUs;
                    synchronized (c70107W4e) {
                        c70107W4e.A04 = j;
                        C70107W4e.A00(c70107W4e);
                    }
                }
                W8u w8u = abstractC71188Wpa.A0O;
                if (!w8u.A00) {
                    C71187WpZ c71187WpZ = w8u.A01;
                    if (c71187WpZ.A05 == null) {
                        illegalStateException = new IllegalStateException("Output buffer received before format info");
                    } else {
                        if (c71187WpZ.A01 < c71187WpZ.A00) {
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            bufferInfo2.set(outputBuffer.position(), outputBuffer.remaining(), 0L, 0);
                            c71187WpZ.A02.writeSampleData(c71187WpZ.A05[c71187WpZ.A01 / c71187WpZ.A00], outputBuffer, bufferInfo2);
                        }
                        int i2 = c71187WpZ.A01 + 1;
                        c71187WpZ.A01 = i2;
                        if (i2 == c71187WpZ.A00) {
                            illegalStateException = null;
                        }
                    }
                    W8u.A00(w8u, illegalStateException);
                }
            }
            this.A00 = AbstractC167007dF.A1M(bufferInfo.flags & 4) | this.A00;
            mediaCodec.releaseOutputBuffer(i, false);
            if (this.A00) {
                abstractC71188Wpa.A02();
                W8u.A00(abstractC71188Wpa.A0O, null);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        UF9 uf9 = this.A02;
        if (mediaCodec == uf9.A02) {
            String string = mediaFormat.getString("mime");
            String A00 = AbstractC58317Pt9.A00(289);
            if (!A00.equals(string)) {
                mediaFormat.setString("mime", A00);
                mediaFormat.setInteger(IgReactMediaPickerNativeModule.WIDTH, uf9.A0L);
                mediaFormat.setInteger(IgReactMediaPickerNativeModule.HEIGHT, uf9.A0I);
                if (uf9.A0T) {
                    mediaFormat.setInteger("tile-width", uf9.A0H);
                    mediaFormat.setInteger("tile-height", uf9.A0F);
                    mediaFormat.setInteger("grid-rows", uf9.A0G);
                    mediaFormat.setInteger("grid-cols", uf9.A0E);
                }
            }
            W8u w8u = uf9.A0O;
            if (!w8u.A00) {
                C71187WpZ c71187WpZ = w8u.A01;
                if (c71187WpZ.A05 != null) {
                    W8u.A00(w8u, new IllegalStateException("Output format changed after muxer started"));
                    return;
                }
                try {
                    c71187WpZ.A00 = mediaFormat.getInteger("grid-rows") * mediaFormat.getInteger("grid-cols");
                } catch (ClassCastException | NullPointerException unused) {
                    c71187WpZ.A00 = 1;
                }
                c71187WpZ.A05 = new int[1];
                for (int i = 0; i < c71187WpZ.A05.length; i++) {
                    mediaFormat.setInteger("is-default", AbstractC167007dF.A1P(i, 0) ? 1 : 0);
                    c71187WpZ.A05[i] = c71187WpZ.A02.addTrack(mediaFormat);
                }
                c71187WpZ.A02.start();
                c71187WpZ.A0C.set(true);
                c71187WpZ.A01();
            }
        }
    }
}
