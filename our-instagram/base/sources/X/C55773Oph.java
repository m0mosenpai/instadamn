package X;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.Oph, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55773Oph implements InterfaceC58019Po5 {
    public final Context A00;
    public final boolean A01;
    public final HashMap A02 = AbstractC166987dD.A1G();

    public static MYB A01(MediaMetadataRetriever mediaMetadataRetriever, long j) {
        int i;
        int A00 = A00(mediaMetadataRetriever, 18, -1);
        int A002 = A00(mediaMetadataRetriever, 19, -1);
        int A003 = A00(mediaMetadataRetriever, 24, 0);
        int i2 = 3;
        if (Build.VERSION.SDK_INT >= 30) {
            int A004 = A00(mediaMetadataRetriever, 36, 3);
            if (A004 != 6) {
                if (A004 == 7) {
                    i2 = 7;
                }
            } else {
                i2 = 6;
            }
            i = A00(mediaMetadataRetriever, 35, 1);
        } else {
            i = 1;
        }
        long j2 = 0;
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (!TextUtils.isEmpty(extractMetadata)) {
            try {
                j2 = Long.parseLong(extractMetadata);
            } catch (NumberFormatException unused) {
            }
        }
        long j3 = -1;
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
        if (!TextUtils.isEmpty(extractMetadata2)) {
            try {
                j3 = Long.parseLong(extractMetadata2);
            } catch (NumberFormatException unused2) {
            }
        }
        int i3 = i2;
        MYB myb = new MYB(null, null, null, null, mediaMetadataRetriever.extractMetadata(23), mediaMetadataRetriever.extractMetadata(5), null, null, mediaMetadataRetriever.extractMetadata(4), "VIDEO", null, A00, A002, A003, i3, i, -1, j2, j3, j, AbstractC167007dF.A1W(mediaMetadataRetriever.extractMetadata(16)));
        AbstractC1808580n.A01();
        return myb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0071, code lost:
    
        if (0 != 0) goto L58;
     */
    @Override // X.InterfaceC58019Po5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.MYB AUI(android.net.Uri r15) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55773Oph.AUI(android.net.Uri):X.MYB");
    }

    @Override // X.InterfaceC58019Po5
    public final MYB AUJ(java.net.URL url) {
        HashMap hashMap = this.A02;
        if (hashMap.containsKey(url.toString())) {
            return (MYB) hashMap.get(url.toString());
        }
        AbstractC1808580n.A03("SystemVideoMetadataExtractor.extract");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(url.toString(), AbstractC166987dD.A1G());
                MYB A01 = A01(mediaMetadataRetriever, -1L);
                hashMap.put(AbstractC08820cl.A03(url.toString()), A01);
                AbstractC1808580n.A01();
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused) {
                }
                return A01;
            } catch (Exception e) {
                throw new RuntimeException(AnonymousClass001.A0R("Exception in extractMediaMetadata:  file url is: ", url.toString()), e);
            }
        } finally {
            AbstractC1808580n.A01();
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
        }
    }

    public C55773Oph(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }

    public static int A00(MediaMetadataRetriever mediaMetadataRetriever, int i, int i2) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(i);
        if (!TextUtils.isEmpty(extractMetadata)) {
            try {
                i2 = Integer.parseInt(extractMetadata);
                return i2;
            } catch (NumberFormatException unused) {
                return i2;
            }
        }
        return i2;
    }
}
