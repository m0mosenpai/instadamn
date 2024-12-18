package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes9.dex */
public final class MYK {
    public Bitmap A00;
    public MYN A01;
    public InterfaceC58173Pqd A02;
    public boolean A03;
    public int A04;
    public final InterfaceC58163PqS A05;
    public final C58617Pyl A06;
    public final List A07;
    public final int A08;
    public final int A09;
    public final boolean A0A;
    public final boolean A0B;

    public final long A00() {
        MYL myl;
        MYN myn = this.A01;
        if (myn != null) {
            try {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                MediaCodec mediaCodec = myn.A03;
                int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000L);
                if (dequeueOutputBuffer >= 0) {
                    ByteBuffer[] byteBufferArr = myn.A02;
                    byteBufferArr.getClass();
                    myl = new MYL(dequeueOutputBuffer, byteBufferArr[dequeueOutputBuffer], bufferInfo);
                } else if (dequeueOutputBuffer != -3) {
                    if (dequeueOutputBuffer != -2) {
                        return -1L;
                    }
                    myn.A00 = mediaCodec.getOutputFormat();
                    C0K8.A0O("MediaCodecWrapper", "codec: %s changed format %s", mediaCodec.getName(), myn.A00);
                    myl = new MYL(-1, null, null);
                } else {
                    myn.A02 = mediaCodec.getOutputBuffers();
                    myl = new MYL(-1, null, null);
                }
                int i = myl.A01;
                if (i >= 0) {
                    MediaCodec.BufferInfo bufferInfo2 = myl.A00;
                    if (bufferInfo2 != null) {
                        long j = bufferInfo2.presentationTimeUs;
                        MYN myn2 = this.A01;
                        if (j >= 0) {
                            if (myn2 != null) {
                                myn2.A03.releaseOutputBuffer(i, myn2.A05);
                            }
                        } else if (myn2 != null) {
                            myn2.A03.releaseOutputBuffer(i, false);
                        }
                        if ((bufferInfo2.flags & 4) != 0) {
                            this.A03 = true;
                            Bitmap bitmap = this.A00;
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            this.A00 = null;
                            if (this.A0A) {
                                long j2 = bufferInfo2.presentationTimeUs;
                                InterfaceC58163PqS interfaceC58163PqS = this.A05;
                                interfaceC58163PqS.Eel(true);
                                interfaceC58163PqS.AQj(j2);
                            }
                        } else if (bufferInfo2.presentationTimeUs >= 0) {
                            InterfaceC58163PqS interfaceC58163PqS2 = this.A05;
                            interfaceC58163PqS2.AD7();
                            long j3 = bufferInfo2.presentationTimeUs;
                            interfaceC58163PqS2.Eel(false);
                            interfaceC58163PqS2.AQj(j3);
                            if (this.A02.Ehv(this.A04, bufferInfo2.presentationTimeUs)) {
                                if (this.A0B) {
                                    Bitmap bitmap2 = this.A00;
                                    if (bitmap2 != null && bitmap2.isRecycled()) {
                                        C0K8.A0C("DecoderWrapper", "mReusableBitmap should not be recycled at this point.");
                                    }
                                    Bitmap bitmap3 = this.A00;
                                    if (bitmap3 == null || bitmap3.isRecycled()) {
                                        this.A00 = Bitmap.createBitmap(this.A09, this.A08, Bitmap.Config.ARGB_8888);
                                    }
                                    int i2 = this.A09;
                                    int i3 = this.A08;
                                    Bitmap bitmap4 = this.A00;
                                    if (bitmap4 != null) {
                                        ByteBuffer A00 = AbstractC66019TyH.A00(i2, i3);
                                        AbstractC66019TyH.A01(A00, i2, i3);
                                        bitmap4.copyPixelsFromBuffer(A00);
                                        InterfaceC58173Pqd interfaceC58173Pqd = this.A02;
                                        Bitmap bitmap5 = this.A00;
                                        if (bitmap5 != null) {
                                            interfaceC58173Pqd.CzY(bufferInfo2.presentationTimeUs, this.A04, bitmap5);
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    int i4 = this.A09;
                                    int i5 = this.A08;
                                    ByteBuffer A002 = AbstractC66019TyH.A00(i4, i5);
                                    AbstractC66019TyH.A01(A002, i4, i5);
                                    Bitmap createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                                    C14360o3.A07(createBitmap);
                                    createBitmap.copyPixelsFromBuffer(A002);
                                    this.A02.CzY(bufferInfo2.presentationTimeUs, this.A04, createBitmap);
                                }
                            }
                        }
                        this.A04++;
                        return bufferInfo2.presentationTimeUs;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return A00();
            } catch (Exception e) {
                MYN.A00(e);
                throw C00O.createAndThrow();
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01(MYL myl) {
        MYN myn = this.A01;
        if (myn != null) {
            try {
                myl.A00.getClass();
                MediaCodec mediaCodec = myn.A03;
                int i = myl.A01;
                MediaCodec.BufferInfo bufferInfo = myl.A00;
                mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                MediaCodec.BufferInfo bufferInfo2 = myl.A00;
                if (bufferInfo2 != null && bufferInfo2.size > 0) {
                    this.A02.DMF(bufferInfo2.presentationTimeUs);
                    return;
                }
                return;
            } catch (Exception e) {
                MYN.A00(e);
                throw C00O.createAndThrow();
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    public MYK(InterfaceC58163PqS interfaceC58163PqS, C58617Pyl c58617Pyl, InterfaceC58173Pqd interfaceC58173Pqd, List list, int i, int i2, boolean z, boolean z2) {
        this.A06 = c58617Pyl;
        this.A05 = interfaceC58163PqS;
        this.A09 = i;
        this.A08 = i2;
        this.A02 = interfaceC58173Pqd;
        this.A0A = z;
        this.A0B = z2;
        this.A07 = list;
    }
}
