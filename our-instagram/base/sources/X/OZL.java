package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.List;

/* loaded from: classes9.dex */
public final class OZL {
    public static final OZL A00;
    public static final String A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.OZL, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        A01 = AbstractC31173DnH.A0q(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.Ope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final List A00(File file) {
        C09540e5 c09540e5;
        try {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.getPath()));
            ?? A1E = AbstractC166987dD.A1E();
            boolean z = true;
            if (mimeTypeFromExtension == null || !AbstractC002300n.A0h(mimeTypeFromExtension, "image", true)) {
                z = false;
            }
            if (z) {
                A1E.add(AbstractC166987dD.A19(new Object().AUI(android.net.Uri.fromFile(file))));
                c09540e5 = A1E;
            } else {
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(file.getPath());
                int trackCount = mediaExtractor.getTrackCount();
                for (int i = 0; i < trackCount; i++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                    C14360o3.A07(trackFormat);
                    AbstractC166997dE.A1S(trackFormat, A1E);
                }
                mediaExtractor.release();
                c09540e5 = A1E;
            }
        } catch (Throwable th) {
            c09540e5 = MSW.A1D(th);
        }
        Throwable A002 = C09550e6.A00(c09540e5);
        if (A002 != null) {
            C0K8.A0G(A01, "video_format_scan_error", A002);
            C0w9.A07("video_format_scan_error", A002);
        }
        C16930sl c16930sl = C16930sl.A00;
        boolean z2 = c09540e5 instanceof C09540e5;
        Object obj = c09540e5;
        if (z2) {
            obj = c16930sl;
        }
        return (List) obj;
    }
}
