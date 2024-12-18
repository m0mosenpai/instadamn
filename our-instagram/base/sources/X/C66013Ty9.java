package X;

import com.facebook.ffmpeg.FFMpegMediaMetadataRetriever;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Ty9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66013Ty9 implements InterfaceC58019Po5 {
    public final C66014TyA A00;
    public final HashMap A01 = new HashMap();

    @Override // X.InterfaceC58019Po5
    public final MYB AUI(android.net.Uri uri) {
        HashMap hashMap = this.A01;
        if (hashMap.containsKey(uri)) {
            return (MYB) hashMap.get(uri);
        }
        AbstractC1808580n.A03("FFMpegVideoMetadataExtractor.extract");
        try {
            File file = new File(uri.getPath());
            FFMpegMediaMetadataRetriever fFMpegMediaMetadataRetriever = new FFMpegMediaMetadataRetriever(this.A00, file.getPath());
            fFMpegMediaMetadataRetriever.initialize();
            try {
                try {
                    MYB A00 = A00(fFMpegMediaMetadataRetriever, file.length());
                    hashMap.put(uri, A00);
                    AbstractC1808580n.A01();
                    try {
                        fFMpegMediaMetadataRetriever.release();
                    } catch (Exception unused) {
                    }
                    return A00;
                } catch (Exception e) {
                    throw new IOException("Error extracting metadata", e);
                }
            } finally {
                AbstractC1808580n.A01();
                try {
                    fFMpegMediaMetadataRetriever.release();
                } catch (Exception unused2) {
                }
            }
        } catch (Exception e2) {
            throw new IOException(AbstractC167017dG.A0n(uri, "Error initializing FFMpegMetadataExtractor ", new StringBuilder()), e2);
        }
    }

    @Override // X.InterfaceC58019Po5
    public final MYB AUJ(java.net.URL url) {
        HashMap hashMap = this.A01;
        if (hashMap.containsKey(url.toString())) {
            return (MYB) hashMap.get(url.toString());
        }
        AbstractC1808580n.A03("FFMpegVideoMetadataExtractor.extract");
        try {
            FFMpegMediaMetadataRetriever fFMpegMediaMetadataRetriever = new FFMpegMediaMetadataRetriever(this.A00, url.toString());
            fFMpegMediaMetadataRetriever.initialize();
            try {
                try {
                    MYB A00 = A00(fFMpegMediaMetadataRetriever, -1L);
                    hashMap.put(AbstractC08820cl.A03(url.toString()), A00);
                    AbstractC1808580n.A01();
                    try {
                        fFMpegMediaMetadataRetriever.release();
                    } catch (Exception unused) {
                    }
                    return A00;
                } catch (Exception e) {
                    throw new IOException("Error extracting metadata", e);
                }
            } finally {
                AbstractC1808580n.A01();
                try {
                    fFMpegMediaMetadataRetriever.release();
                } catch (Exception unused2) {
                }
            }
        } catch (Exception e2) {
            throw new IOException(AnonymousClass001.A0R("Error initializing FFMpegMetadataExtractor ", url.toString()), e2);
        }
    }

    public C66013Ty9(C66014TyA c66014TyA) {
        this.A00 = c66014TyA;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.MYB A00(com.facebook.ffmpeg.FFMpegMediaMetadataRetriever r33, long r34) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66013Ty9.A00(com.facebook.ffmpeg.FFMpegMediaMetadataRetriever, long):X.MYB");
    }
}
