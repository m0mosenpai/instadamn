package X;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.facebook.ffmpeg.FFMpegBadDataException;
import com.facebook.ffmpeg.FFMpegMediaMetadataRetriever;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes9.dex */
public abstract class MY3 {
    public static final int A00(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 270;
        }
        if (i != 2) {
            return i == 3 ? 90 : 0;
        }
        return 180;
    }

    public static final ClipInfo A02(UserSession userSession, File file, long j) {
        C14360o3.A0B(userSession, 2);
        ClipInfo A03 = A03(userSession, MSX.A0h(file), j, j);
        A03.A00 = A03.A09 / A03.A06;
        return A03;
    }

    public static final void A04(ClipInfo clipInfo, C47Z c47z) {
        C14360o3.A0B(clipInfo, 1);
        if (C14360o3.A0K(clipInfo.A0E, "boomerang")) {
            c47z.A5F = true;
        }
        c47z.A0i(AbstractC16960so.A1N(clipInfo));
        c47z.A1N = clipInfo;
        c47z.A0H = clipInfo.A09;
        c47z.A0G = clipInfo.A06;
    }

    public static final int A01(File file) {
        int i;
        FFMpegMediaMetadataRetriever fFMpegMediaMetadataRetriever = new FFMpegMediaMetadataRetriever(AbstractC66016TyE.A00, file.getAbsolutePath());
        fFMpegMediaMetadataRetriever.initialize();
        try {
            int rotation = fFMpegMediaMetadataRetriever.getRotation();
            if (rotation == 90) {
                i = 3;
            } else if (rotation != 180) {
                i = 1;
                if (rotation != 270) {
                    i = 0;
                }
            } else {
                i = 2;
            }
            return i;
        } finally {
            fFMpegMediaMetadataRetriever.release();
        }
    }

    public static final ClipInfo A03(UserSession userSession, String str, long j, long j2) {
        RandomAccessFile randomAccessFile;
        long j3 = j;
        AbstractC167007dF.A1E(str, 0, userSession);
        ClipInfo clipInfo = new ClipInfo(null, 16777215);
        clipInfo.A0F = str;
        clipInfo.A0A = j3;
        clipInfo.A07 = 0;
        if (j2 > 0) {
            j3 = Math.min(j2, j3);
        }
        clipInfo.A05 = (int) j3;
        clipInfo.A03 = -1;
        File A11 = AbstractC166987dD.A11(str);
        try {
            randomAccessFile = new RandomAccessFile(A11, "r");
        } catch (Exception unused) {
        }
        try {
            long length = A11.length();
            int A00 = MY4.A00(randomAccessFile, "ftyp", length, 0L);
            if (A00 >= 0) {
                long j4 = A00;
                while (true) {
                    int A002 = MY4.A00(randomAccessFile, "udta", length, j4);
                    if (A002 <= 0) {
                        break;
                    }
                    if (A002 < 1024) {
                        byte[] bArr = new byte[A002 - 8];
                        randomAccessFile.read(bArr);
                        Charset charset = StandardCharsets.US_ASCII;
                        C14360o3.A08(charset);
                        if (AbstractC001900j.A0a(new String(bArr, charset), "{TakenWith: Boomerang}", false)) {
                            randomAccessFile.close();
                            clipInfo.A0E = "boomerang";
                            break;
                        }
                    }
                    j4 += A002;
                }
            }
            randomAccessFile.close();
            try {
                clipInfo.A0C = Integer.valueOf(A01(AbstractC166987dD.A11(str)));
            } catch (FFMpegBadDataException | IOException | RuntimeException unused2) {
            }
            try {
                String str2 = clipInfo.A0F;
                if (str2 != null && AbstractC166987dD.A11(str2).isFile()) {
                    MediaMetadataRetriever mediaMetadataRetriever = null;
                    int i = 0;
                    do {
                        try {
                            try {
                                try {
                                    MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                                    try {
                                        mediaMetadataRetriever2.setDataSource(str2);
                                        String extractMetadata = mediaMetadataRetriever2.extractMetadata(18);
                                        String extractMetadata2 = mediaMetadataRetriever2.extractMetadata(19);
                                        int i2 = 3;
                                        if (Build.VERSION.SDK_INT >= 30) {
                                            String extractMetadata3 = mediaMetadataRetriever2.extractMetadata(36);
                                            if (extractMetadata3 != null) {
                                                i2 = Integer.parseInt(extractMetadata3);
                                            }
                                        } else {
                                            i2 = AbstractC50720MaJ.A00(str2);
                                        }
                                        clipInfo.A04 = i2;
                                        if (extractMetadata != null && extractMetadata2 != null) {
                                            clipInfo.A01(Integer.parseInt(extractMetadata), Integer.parseInt(extractMetadata2));
                                        }
                                        mediaMetadataRetriever2.release();
                                        return clipInfo;
                                    } catch (RuntimeException e) {
                                        i++;
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        mediaMetadataRetriever.release();
                                        throw th;
                                    }
                                    throw th;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw new IOException("MediaMetadataRetriever failed to retrieve dimensions and exif data", e2);
                            }
                        } catch (RuntimeException e3) {
                            throw new IOException("MediaMetadataRetriever failed to retrieve dimensions and exif data", e3);
                        }
                    } while (i < 6);
                    throw e;
                }
                throw MSY.A0X("Invalid video file path: ", str2);
            } catch (IOException | RuntimeException e4) {
                C0K8.A0F("ClipInfoUtil", "Could not retrieve video metadata", e4);
                return clipInfo;
            }
        } finally {
        }
    }
}
