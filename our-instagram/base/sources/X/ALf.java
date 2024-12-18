package X;

import android.media.MediaMetadataRetriever;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Deprecated;

/* loaded from: classes4.dex */
public final class ALf {
    public static final int A00(String str) {
        String str2;
        String str3;
        C14360o3.A0B(str, 0);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                if (extractMetadata != null) {
                    int parseInt = Integer.parseInt(extractMetadata);
                    if (parseInt > 0) {
                        return parseInt;
                    }
                    str3 = AnonymousClass001.A0O("got invalid integer duration value: ", parseInt);
                } else {
                    str3 = "got null duration metadata string";
                }
                throw A02(null, str3, str);
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused) {
                }
            }
        } catch (IllegalArgumentException e) {
            e = e;
            str2 = "Cannot setDataSource: file corrupted or incomplete";
            throw A02(e, str2, str);
        } catch (RuntimeException e2) {
            e = e2;
            str2 = "Cannot setDataSource: got RuntimeException";
            throw A02(e, str2, str);
        }
    }

    @Deprecated(message = "Use [MediaDurationUtil#extractMediaDurationMs(String)] which forces the caller to\n        properly handle the exception.")
    public static final int A01(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (extractMetadata != null) {
                return Integer.parseInt(extractMetadata);
            }
            throw AbstractC166997dE.A0g();
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused) {
            }
        }
    }

    public static final IOException A02(Exception exc, String str, String str2) {
        String format = String.format(Locale.US, "%s - pathExists=%b, path=%s", Arrays.copyOf(new Object[]{str, Boolean.valueOf(AbstractC166987dD.A11(str2).exists()), str2}, 3));
        C14360o3.A07(format);
        String obj = ALf.class.toString();
        if (exc == null) {
            C14360o3.A07(obj);
            C0w9.A03(obj, format);
        } else {
            C14360o3.A07(obj);
            C0w9.A06(obj, format, exc);
        }
        return new IOException(format, exc);
    }
}
