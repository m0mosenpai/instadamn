package X;

import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegMediaDemuxer;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import com.facebook.ffmpeg.FFMpegMediaMuxer;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class WGM {
    public static final WGM A00 = new Object();
    public static final X9U A01 = C70491WYy.A00;

    public static final FFMpegMediaDemuxer A00(C66014TyA c66014TyA, File file) {
        FFMpegMediaDemuxer fFMpegMediaDemuxer;
        C14360o3.A0B(c66014TyA, 0);
        String path = file.getPath();
        int i = 0;
        do {
            fFMpegMediaDemuxer = new FFMpegMediaDemuxer(c66014TyA, path, new FFMpegMediaDemuxer.Options());
            try {
                fFMpegMediaDemuxer.initialize();
                return fFMpegMediaDemuxer;
            } catch (IOException e) {
                if (i != 4) {
                    File file2 = new File(path);
                    if (file2.exists()) {
                        if (file2.canRead()) {
                            i++;
                        } else {
                            throw new IOException("Cannot read a concat file", e);
                        }
                    } else {
                        throw new IOException("Cannot find a concat file", e);
                    }
                } else {
                    throw e;
                }
            }
        } while (i < 5);
        return fFMpegMediaDemuxer;
    }

    public static final FFMpegMediaFormat A01(FFMpegMediaDemuxer fFMpegMediaDemuxer, String str) {
        int trackCount = fFMpegMediaDemuxer.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            FFMpegMediaFormat trackFormat = fFMpegMediaDemuxer.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            if (string != null && string.startsWith(str)) {
                trackFormat.setInteger("track_id", i);
                return trackFormat;
            }
        }
        return null;
    }

    public static final File A02(X9U x9u, String str) {
        File createTempFile = x9u.createTempFile("ffconcat", null);
        if (createTempFile != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
                C14360o3.A07(forName);
                byte[] bytes = str.getBytes(forName);
                C14360o3.A07(bytes);
                fileOutputStream.write(bytes);
                fileOutputStream.close();
                return createTempFile;
            } catch (Exception e) {
                createTempFile.delete();
                throw e;
            }
        }
        throw new IllegalStateException("file cannot be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r2.length() == 0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.VJ8, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String A03(java.util.ArrayList r24, java.util.List r25, long r26) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGM.A03(java.util.ArrayList, java.util.List, long):java.lang.String");
    }

    public static final void A04(WGM wgm, X9U x9u, File file, List list, List list2, int i) {
        File A02;
        File file2;
        FFMpegMediaMuxer fFMpegMediaMuxer;
        FFMpegMediaDemuxer fFMpegMediaDemuxer;
        FFMpegMediaFormat[] fFMpegMediaFormatArr;
        FFMpegAVStream[] fFMpegAVStreamArr;
        long j = -1;
        ArrayList arrayList = new ArrayList();
        C66014TyA c66014TyA = VYI.A00;
        FFMpegMediaMuxer fFMpegMediaMuxer2 = null;
        FFMpegAVStream fFMpegAVStream = null;
        fFMpegMediaMuxer2 = null;
        try {
            try {
                A02 = A02(x9u, wgm.A03(arrayList, list, -1L));
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    if (!arrayList.isEmpty()) {
                        double d = 0.0d;
                        double d2 = -1.0d;
                        Iterator A13 = AbstractC166997dE.A13(arrayList);
                        while (A13.hasNext()) {
                            VJ8 vj8 = (VJ8) AbstractC166997dE.A0l(A13);
                            double d3 = vj8.A01;
                            d += (d3 - (d2 + 1.0d)) / vj8.A00;
                            d2 = d3;
                        }
                        j = (long) d;
                    }
                    file2 = A02(x9u, wgm.A03(arrayList2, list2, j));
                } else {
                    file2 = null;
                }
                fFMpegMediaMuxer = new FFMpegMediaMuxer(c66014TyA, file.getPath(), false);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            if (fFMpegMediaMuxer2 == null) {
                throw th;
            }
        }
        try {
            fFMpegMediaMuxer.initialize();
            try {
                FFMpegMediaDemuxer A002 = A00(c66014TyA, A02);
                if (file2 != null) {
                    try {
                        fFMpegMediaDemuxer = A00(c66014TyA, file2);
                    } catch (Throwable th2) {
                        th = th2;
                        fFMpegMediaDemuxer = null;
                        A002.release();
                        if (file2 != null && fFMpegMediaDemuxer != null) {
                            fFMpegMediaDemuxer.release();
                        }
                        A02.delete();
                        throw th;
                    }
                } else {
                    fFMpegMediaDemuxer = A002;
                }
                try {
                    FFMpegMediaFormat A012 = A01(A002, "video/");
                    if (A012 != null) {
                        A002.selectTrack(AbstractC65702TsY.A0E("track_id", A012.mMap));
                        int A0E = AbstractC65702TsY.A0E("rotation", A012.mMap);
                        FFMpegMediaMuxer.NativeWrapper nativeWrapper = fFMpegMediaMuxer.mNativeWrapper;
                        int i2 = fFMpegMediaMuxer.A02;
                        FFMpegAVStream nativeAddStream = nativeWrapper.nativeAddStream(A012, 15, i2);
                        nativeAddStream.setOrientationHint(A0E);
                        FFMpegMediaFormat A013 = A01(fFMpegMediaDemuxer, "audio/");
                        if (A013 != null) {
                            fFMpegMediaDemuxer.selectTrack(AbstractC65702TsY.A0E("track_id", A013.mMap));
                            fFMpegAVStream = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(A013, 15, i2);
                        }
                        fFMpegMediaMuxer.A00();
                        if (file2 == null) {
                            if (fFMpegAVStream == null || A013 == null) {
                                fFMpegMediaFormatArr = new FFMpegMediaFormat[]{A012};
                                fFMpegAVStreamArr = new FFMpegAVStream[]{nativeAddStream};
                            } else {
                                fFMpegMediaFormatArr = new FFMpegMediaFormat[]{A012, A013};
                                fFMpegAVStreamArr = new FFMpegAVStream[]{nativeAddStream, fFMpegAVStream};
                            }
                            AbstractC68336VMw.A00(A002, arrayList, fFMpegAVStreamArr, fFMpegMediaFormatArr, i);
                        } else {
                            C68921VeL A003 = AbstractC68336VMw.A00(A002, arrayList, new FFMpegAVStream[]{nativeAddStream}, new FFMpegMediaFormat[]{A012}, i);
                            if (fFMpegAVStream != null && A013 != null) {
                                C68921VeL A004 = AbstractC68336VMw.A00(fFMpegMediaDemuxer, arrayList, new FFMpegAVStream[]{fFMpegAVStream}, new FFMpegMediaFormat[]{A013}, i);
                                new C68921VeL(A003.A01 + A004.A01, A003.A00 + A004.A00);
                            }
                        }
                        A002.release();
                        if (file2 != null) {
                            fFMpegMediaDemuxer.release();
                        }
                        A02.delete();
                        fFMpegMediaMuxer.A01();
                        return;
                    }
                    throw new Exception();
                } catch (Throwable th3) {
                    th = th3;
                    A002.release();
                    if (file2 != null) {
                        fFMpegMediaDemuxer.release();
                    }
                    A02.delete();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fFMpegMediaDemuxer = null;
            }
        } catch (Exception e2) {
            e = e2;
            fFMpegMediaMuxer2 = fFMpegMediaMuxer;
            C14360o3.A0B("Unable to create stitched files", 1);
            throw new Exception("Unable to create stitched files", e);
        } catch (Throwable th5) {
            th = th5;
            fFMpegMediaMuxer2 = fFMpegMediaMuxer;
            fFMpegMediaMuxer2.A01();
            throw th;
        }
    }

    public static final void A05(List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
