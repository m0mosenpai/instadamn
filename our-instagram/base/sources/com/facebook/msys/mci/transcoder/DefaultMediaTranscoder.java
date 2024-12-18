package com.facebook.msys.mci.transcoder;

import X.AbstractC55028OXj;
import X.AbstractC61797Rtr;
import X.C0K8;
import X.C0fK;
import X.C4Mm;
import X.C55775Opk;
import X.C60786RSx;
import X.C68681VaH;
import X.C69272Vkg;
import X.C69325VlX;
import X.C69438VnN;
import X.C70111W4i;
import X.RunnableC71254Wqj;
import X.USN;
import X.USO;
import X.USP;
import X.W8x;
import X.WFN;
import X.X9U;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.MediaTranscoder;
import com.facebook.msys.mci.TranscodeImageCompletionCallback;
import com.facebook.msys.mci.TranscodeVideoCompletionCallback;
import com.facebook.msys.mci.VideoSizeEstimatorCompletionCallback;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes11.dex */
public class DefaultMediaTranscoder implements MediaTranscoder {
    public static MediaTranscoder A06;
    public final Context A00;
    public final WFN A01;
    public final C68681VaH A02;
    public final C4Mm A03;
    public final X9U A04 = new C55775Opk();
    public final ExecutorService A05;

    public static C69272Vkg A00(Map map) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        if (map != null) {
            if (map.containsKey("TARGET_IMAGE_SIZE_LIMIT")) {
                try {
                    Integer.parseInt((String) map.get("TARGET_IMAGE_SIZE_LIMIT"));
                } catch (NumberFormatException unused) {
                }
            }
            if (map.containsKey("REMOVE_PII")) {
                map.get("REMOVE_PII");
            }
            if (map.containsKey("ENABLE_RESCALE_ON_ROTATE")) {
                z = ((Boolean) map.get("ENABLE_RESCALE_ON_ROTATE")).booleanValue();
            }
            if (map.containsKey("IS_PREVIEW")) {
                z2 = ((Boolean) map.get("IS_PREVIEW")).booleanValue();
            }
            if (map.containsKey("ENABLE_IMAGE_TRANSCODER_IN_MEMORY_CACHE")) {
                map.get("ENABLE_IMAGE_TRANSCODER_IN_MEMORY_CACHE");
            }
            if (map.containsKey("IS_HD")) {
                z3 = ((Boolean) map.get("IS_HD")).booleanValue();
            }
            r2 = map.containsKey("TRACE_ID") ? (String) map.get("TRACE_ID") : null;
            if (map.containsKey("IS_ARMADILLO")) {
                z4 = ((Boolean) map.get("IS_ARMADILLO")).booleanValue();
            }
        }
        return new C69272Vkg(r2, z4, z3, z2, z);
    }

    public Bitmap decodeBitmap(String str, double d, double d2) {
        String path;
        Integer valueOf;
        Integer valueOf2;
        Bitmap bitmap = null;
        if (str != null) {
            try {
                path = AbstractC55028OXj.A01(str).getPath();
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                C0K8.A0O("DefaultMediaTranscoder", "decodeBitmap: Error parsing inputFileURL: %s, Exception %s", str, e);
                return null;
            }
        } else {
            path = null;
        }
        int min = Math.min((int) d, Integer.MAX_VALUE);
        int min2 = Math.min((int) d2, Integer.MAX_VALUE);
        if (path != null) {
            try {
                int A00 = AbstractC61797Rtr.A00(path);
                Bitmap decodeFile = BitmapFactory.decodeFile(path);
                if (decodeFile != null) {
                    Bitmap A01 = WFN.A01(decodeFile, A00);
                    int width = A01.getWidth();
                    int height = A01.getHeight();
                    if (height <= min2 && width <= min) {
                        valueOf = Integer.valueOf(width);
                        valueOf2 = Integer.valueOf(height);
                    } else {
                        int i = min * height;
                        int i2 = min2 * width;
                        if (i < i2) {
                            min2 = i / width;
                        } else {
                            min = i2 / height;
                        }
                        valueOf = Integer.valueOf(min);
                        valueOf2 = Integer.valueOf(min2);
                    }
                    Pair create = Pair.create(valueOf, valueOf2);
                    try {
                        bitmap = C0fK.A00(A01, ((Number) create.first).intValue(), ((Number) create.second).intValue(), true);
                        if (bitmap == null) {
                            C0K8.A0C("DefaultMediaTranscoder", "decodeBitmap: bitmap scaling returned null");
                            return bitmap;
                        }
                    } catch (IllegalArgumentException e2) {
                        C0K8.A0F("DefaultMediaTranscoder", "decodeBitmap: invalid dimensions passed to bitmap scaling - ", e2);
                    }
                    return bitmap;
                }
                C0K8.A0O("DefaultMediaTranscoder", "decodeBitmap: Error converting to bitmap: %s.", str);
                throw new IllegalStateException("decodeBitmap: Bitmap decoding fail");
            } catch (IOException e3) {
                C0K8.A0O("DefaultMediaTranscoder", "decodeBitmap: Error getting rotation: %s, Exception %s", str, e3);
                return null;
            }
        }
        throw new IllegalStateException("decodeBitmap: At least one of input params should be not null");
    }

    public static HashMap A01(C69272Vkg c69272Vkg, C70111W4i c70111W4i) {
        long j;
        HashMap hashMap = new HashMap();
        if (c70111W4i != null) {
            hashMap.put("ORIGINAL_WIDTH", Long.valueOf(c70111W4i.A03));
            hashMap.put("ORIGINAL_HEIGHT", Long.valueOf(c70111W4i.A01));
            hashMap.put("ORIGINAL_FILE_SIZE", Long.valueOf(c70111W4i.A07));
            hashMap.put("TRANSCODED_WIDTH", Long.valueOf(c70111W4i.A06));
            hashMap.put("TRANSCODED_HEIGHT", Long.valueOf(c70111W4i.A04));
            hashMap.put("TRANSCODED_FILE_SIZE", Long.valueOf(c70111W4i.A08));
            hashMap.put("COMPRESSION_QUALITY", Long.valueOf(c70111W4i.A05));
            if (c69272Vkg.A02) {
                j = 1;
            } else {
                j = 0;
            }
            hashMap.put("IS_HD", Long.valueOf(j));
        }
        return hashMap;
    }

    public static void A02(TranscodeVideoCompletionCallback transcodeVideoCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, Throwable th, int i, int i2) {
        Execution.executeAsync(new USN(transcodeVideoCompletionCallback, defaultMediaTranscoder, th, i, i2), null, 4);
    }

    public static boolean A03(C69325VlX c69325VlX) {
        Double d = c69325VlX.A02;
        if (d == null || d.doubleValue() < 0.0d) {
            Double d2 = c69325VlX.A01;
            if (d2 != null && d2.doubleValue() >= 0.0d) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void estimateVideoSize(String str, long j, Double d, Double d2, VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback) {
        Execution.executeAsync(new USO(videoSizeEstimatorCompletionCallback, this, d, d2, str, j), null, 4);
    }

    public int getImageTranscodeQuality(Bitmap bitmap, Map map) {
        if (bitmap == null) {
            C0K8.A0C("DefaultMediaTranscoder", "getImageTranscodeQuality: Image bitmap is null");
            return 0;
        }
        C69272Vkg A00 = A00(map);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = A00.A02;
        int A002 = WFN.A00(Boolean.valueOf(z), height, width);
        if (!z) {
            return A002;
        }
        return Math.max(A002, 45);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r5 == X.C05F.A0C) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r5 == X.C05F.A0C) goto L20;
     */
    @Override // com.facebook.msys.mci.MediaTranscoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] transcodeImage(java.lang.String r24, double r25, double r27, java.lang.String r29, java.util.Map r30) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.transcoder.DefaultMediaTranscoder.transcodeImage(java.lang.String, double, double, java.lang.String, java.util.Map):byte[]");
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void transcodeImageV2(String str, double d, double d2, double d3, double d4, String str2, Map map, TranscodeImageCompletionCallback transcodeImageCompletionCallback) {
        String path;
        if (str != null) {
            try {
                path = AbstractC55028OXj.A01(str).getPath();
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                C0K8.A0O("DefaultMediaTranscoder", "transcodeImageV2: Error parsing inputFileURL: %s, Exception %s", str, e);
                Execution.executeAsync(new USP(transcodeImageCompletionCallback, this, e, 0.0d, 0.0d, 0.0d, 0.0d), null, 4);
                return;
            }
        } else {
            path = null;
        }
        WFN wfn = this.A01;
        C68681VaH c68681VaH = this.A02;
        int min = Math.min((int) d, Integer.MAX_VALUE);
        int min2 = Math.min((int) d2, Integer.MAX_VALUE);
        int min3 = Math.min((int) d3, 600);
        int min4 = Math.min((int) d4, 600);
        C69272Vkg A00 = A00(map);
        this.A05.execute(new RunnableC71254Wqj(new C69438VnN(wfn, A00, new W8x(transcodeImageCompletionCallback, A00, this, str2), c68681VaH, path, str2, new C60786RSx(), min2, min, min4, min3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.XDf] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.PpU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.OW6, java.lang.Object] */
    @Override // com.facebook.msys.mci.MediaTranscoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void transcodeVideo(java.lang.String r32, com.facebook.msys.mci.VideoEdits r33, long r34, long r36, com.facebook.msys.mci.TranscodeVideoCompletionCallback r38) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.transcoder.DefaultMediaTranscoder.transcodeVideo(java.lang.String, com.facebook.msys.mci.VideoEdits, long, long, com.facebook.msys.mci.TranscodeVideoCompletionCallback):void");
    }

    public DefaultMediaTranscoder(Context context, WFN wfn, C68681VaH c68681VaH, C4Mm c4Mm, ExecutorService executorService) {
        this.A05 = executorService;
        this.A00 = context;
        this.A03 = c4Mm;
        this.A02 = c68681VaH;
        this.A01 = wfn;
    }

    public void reportTranscodeFailure(int i) {
    }
}
