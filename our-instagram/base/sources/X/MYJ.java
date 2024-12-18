package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* loaded from: classes9.dex */
public final class MYJ {
    public static final InterfaceC58173Pqd A0G = new MYY();
    public long A00;
    public long A01;
    public MediaFormat A02;
    public MY5 A03;
    public C50662MYe A04;
    public InterfaceC58173Pqd A05;
    public boolean A06;
    public boolean A07;
    public long A08;
    public final Context A09;
    public final MYK A0A;
    public final List A0B;
    public final PriorityQueue A0C;
    public final boolean A0D;
    public final UserSession A0E;
    public final File A0F;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.Pyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public MYJ(Context context, InterfaceC58163PqS interfaceC58163PqS, UserSession userSession, MYU myu, InterfaceC58173Pqd interfaceC58173Pqd, File file, List list, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3) {
        ?? r8;
        C14360o3.A0B(myu, 13);
        this.A09 = context;
        this.A0E = userSession;
        this.A05 = interfaceC58173Pqd;
        this.A0F = file;
        this.A01 = j;
        this.A00 = j2;
        this.A0D = z3;
        this.A0C = new PriorityQueue(11, new C31460Ds4((InterfaceC16620sF) MYP.A00, 19));
        this.A00 += 500000;
        if (file.exists() && file.length() > 0) {
            MYK myk = new MYK(interfaceC58163PqS, new Object(), this.A05, list, i, i2, z, z2);
            this.A0A = myk;
            try {
                android.net.Uri fromFile = android.net.Uri.fromFile(file);
                C14360o3.A07(fromFile);
                MY5 A00 = MY5.A00("decoder_frame_retriever");
                this.A03 = A00;
                try {
                    ((MY7) A00).A00.setDataSource(this.A09, fromFile, (Map<String, String>) null);
                    int trackCount = ((MY7) A00).A00.getTrackCount();
                    for (int i3 = 0; i3 < trackCount; i3++) {
                        MediaFormat trackFormat = ((MY7) A00).A00.getTrackFormat(i3);
                        C14360o3.A07(trackFormat);
                        String string = trackFormat.getString("mime");
                        if (string != null && AbstractC002300n.A0h(string, "video/", false)) {
                            A00.EMv(i3);
                            this.A02 = trackFormat;
                            if (z3) {
                                r8 = AbstractC166987dD.A1E();
                                MY5 my5 = this.A03;
                                if (my5 != null) {
                                    long j3 = -1;
                                    while (((MY7) my5).A00.getSampleTime() != -1 && ((MY7) my5).A00.getSampleTime() != j3) {
                                        j3 = ((MY7) my5).A00.getSampleTime();
                                        if ((((MY7) my5).A00.getSampleFlags() & 1) > 0) {
                                            r8.add(Long.valueOf(j3));
                                        }
                                        my5.AAz();
                                        my5.EMi(((MY7) my5).A00.getSampleTime(), 1);
                                    }
                                }
                            } else {
                                r8 = C16930sl.A00;
                            }
                            this.A0B = r8;
                            MediaFormat mediaFormat = this.A02;
                            if (mediaFormat != null) {
                                MYN A002 = myk.A06.A00(mediaFormat, myk.A05.getSurface(), userSession, myk.A07);
                                myk.A01 = A002;
                                try {
                                    MediaCodec mediaCodec = A002.A03;
                                    C0fT.A05(mediaCodec, 1892540199);
                                    A002.A01 = mediaCodec.getInputBuffers();
                                    A002.A02 = mediaCodec.getOutputBuffers();
                                    return;
                                } catch (Exception e) {
                                    MYN.A00(e);
                                    throw C00O.createAndThrow();
                                }
                            }
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    throw AbstractC166987dD.A14(AbstractC13670mt.A06("No Video Track to select %s", AbstractC50670MYo.A04(A00)));
                } catch (Throwable th) {
                    throw new IOException(MY5.A01.toString(), th);
                }
            } catch (Throwable th2) {
                C0K8.A0F("DecoderFrameRetriever", "decoding err ", th2);
                A00();
                throw new RuntimeException("Failed extract frames from video", th2);
            }
        }
        throw AbstractC167007dF.A0c("File is missing: ", file.getAbsolutePath());
    }

    public final void A00() {
        try {
            MYK myk = this.A0A;
            MYN myn = myk.A01;
            InterfaceC58163PqS interfaceC58163PqS = myk.A05;
            if (myn != null) {
                MediaCodec mediaCodec = myn.A03;
                if (C18U.A06(C06090Tz.A05, myn.A04, 36316654317671003L)) {
                    Y2X.A01(mediaCodec);
                    Y2X.A00(mediaCodec);
                } else {
                    C0fT.A06(mediaCodec, -2084989773);
                    C0fT.A03(mediaCodec, 2103565012);
                }
                myn.A01 = null;
                myn.A02 = null;
                myn.A00 = null;
            }
            if (myk.A00 != null) {
                C0K8.A0C("DecoderWrapper", "finish() mReusableBitmap has not be recycled.");
                Bitmap bitmap = myk.A00;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                myk.A00 = null;
            }
            interfaceC58163PqS.release();
        } catch (Throwable th) {
            C0K8.A0G("DecoderFrameRetriever", "decoder wrapper release error", th);
            C0w9.A07("decoder_wrapper_release_err", th);
        }
        try {
            MY5 my5 = this.A03;
            if (my5 != null) {
                my5.release();
            }
            this.A03 = null;
        } catch (Throwable th2) {
            C0K8.A0G("DecoderFrameRetriever", "extractor release error", th2);
            C0w9.A07("extractor_release_err", th2);
        }
        this.A0C.clear();
    }

    public final void A01() {
        Long AVb;
        C11T.A05("This operation can't be run on UI thread.");
        try {
            if (this.A03 != null) {
                int i = 0;
                if (this.A0D && (AVb = this.A05.AVb(this.A0B)) != null) {
                    this.A01 = AVb.longValue();
                    i = 2;
                }
                MY5 my5 = this.A03;
                if (my5 != null) {
                    long j = this.A01;
                    if (j == 0) {
                        i = 2;
                    }
                    my5.EMi(j, i);
                    while (true) {
                        if (this.A06 && this.A07) {
                            break;
                        } else {
                            A02();
                        }
                    }
                    C50662MYe c50662MYe = this.A04;
                    if (c50662MYe != null) {
                        c50662MYe.A00.A04 = null;
                        c50662MYe.A01.run();
                    }
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        } catch (Throwable th) {
            try {
                C0K8.A0F("DecoderFrameRetriever", "decoding err ", th);
                throw new RuntimeException("Failed extract frames from video", th);
            } finally {
                A00();
            }
        }
    }

    public final boolean A02() {
        MY5 my5 = this.A03;
        if (my5 != null) {
            boolean z = false;
            while (!this.A06 && !z) {
                MYK myk = this.A0A;
                MYN myn = myk.A01;
                if (myn != null) {
                    try {
                        int dequeueInputBuffer = myn.A03.dequeueInputBuffer(10000L);
                        if (dequeueInputBuffer >= 0) {
                            ByteBuffer[] byteBufferArr = myn.A01;
                            byteBufferArr.getClass();
                            MYL myl = new MYL(dequeueInputBuffer, byteBufferArr[dequeueInputBuffer], null);
                            ByteBuffer byteBuffer = (ByteBuffer) myl.A02.get();
                            if (byteBuffer != null) {
                                int readSampleData = ((MY7) my5).A00.readSampleData(byteBuffer, 0);
                                long sampleTime = ((MY7) my5).A00.getSampleTime();
                                this.A08 = sampleTime;
                                long j = sampleTime - this.A01;
                                int sampleFlags = ((MY7) my5).A00.getSampleFlags();
                                if (myk.A02.Cs9() && readSampleData > 0) {
                                    long j2 = this.A08;
                                    if (j2 <= this.A00) {
                                        this.A0C.add(Long.valueOf(j2));
                                        MediaCodec.BufferInfo bufferInfo = myl.A00;
                                        if (bufferInfo == null) {
                                            bufferInfo = new MediaCodec.BufferInfo();
                                            myl.A00 = bufferInfo;
                                        }
                                        bufferInfo.set(0, readSampleData, j, sampleFlags);
                                        myk.A01(myl);
                                        my5.AAz();
                                    }
                                }
                                MediaCodec.BufferInfo bufferInfo2 = myl.A00;
                                if (bufferInfo2 == null) {
                                    bufferInfo2 = new MediaCodec.BufferInfo();
                                    myl.A00 = bufferInfo2;
                                }
                                bufferInfo2.set(0, 0, 0L, 4);
                                myk.A01(myl);
                                this.A06 = true;
                            }
                        }
                        z = true;
                    } catch (Exception e) {
                        MYN.A00(e);
                        throw C00O.createAndThrow();
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (this.A07) {
                return false;
            }
            MYK myk2 = this.A0A;
            long A00 = myk2.A00();
            this.A0C.remove(Long.valueOf(A00));
            this.A07 = myk2.A03;
            if (A00 != -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
