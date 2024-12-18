package X;

import android.media.MediaMetadataRetriever;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* loaded from: classes9.dex */
public abstract class MY4 {
    public static final int A00(RandomAccessFile randomAccessFile, String str, long j, long j2) {
        int readInt;
        byte[] bArr = new byte[4];
        randomAccessFile.seek(j2);
        while (randomAccessFile.getFilePointer() < j && (readInt = randomAccessFile.readInt()) >= 8) {
            if (randomAccessFile.read(bArr) == 4) {
                Charset charset = StandardCharsets.US_ASCII;
                C14360o3.A08(charset);
                if (new String(bArr, charset).equals(str)) {
                    return readInt;
                }
            }
            randomAccessFile.skipBytes(readInt - 8);
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.MqV, java.lang.Object] */
    public static final C51577MqV A02(File file) {
        int i;
        Integer A0i;
        C14360o3.A0B(file, 0);
        try {
            String A0h = MSX.A0h(file);
            int i2 = 0;
            do {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(A0h);
                    ?? obj = new Object();
                    obj.A02 = 0L;
                    obj.A01 = 0;
                    obj.A00 = 0;
                    obj.A03 = null;
                    obj.A02 = AbstractC50522MSa.A0C(mediaMetadataRetriever.extractMetadata(9));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    if (extractMetadata != null && (A0i = AbstractC003100w.A0i(extractMetadata)) != null) {
                        i = A0i.intValue();
                    } else {
                        i = 0;
                    }
                    obj.A01 = i;
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    obj.A00 = extractMetadata2 != null ? AbstractC25227BEk.A06(AbstractC003100w.A0i(extractMetadata2), 0) : 0;
                    obj.A03 = mediaMetadataRetriever.extractMetadata(12);
                    return obj;
                } catch (RuntimeException e) {
                    i2++;
                }
            } while (i2 < 6);
            throw e;
        } catch (RuntimeException e2) {
            throw new IllegalArgumentException("Cannot retrieve metadata from file", e2);
        }
    }

    public static final HashMap A03(String str) {
        HashMap A11 = AbstractC31174DnI.A11(str, 0);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(AbstractC166987dD.A11(str).getAbsolutePath());
            A11.put("date_time_original", mediaMetadataRetriever.extractMetadata(5));
        } catch (IllegalArgumentException unused) {
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused2) {
            }
            throw th;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Exception unused3) {
        }
        return A11;
    }

    public static final boolean A04(String str) {
        C14360o3.A0B(str, 0);
        return AbstractC167007dF.A1N((MSY.A06(str) > 0L ? 1 : (MSY.A06(str) == 0L ? 0 : -1)));
    }

    public static final long A01(MediaMetadataRetriever mediaMetadataRetriever) {
        Long A0j;
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (extractMetadata != null && (A0j = AbstractC166997dE.A0j(extractMetadata)) != null) {
            return A0j.longValue();
        }
        return 0L;
    }
}
