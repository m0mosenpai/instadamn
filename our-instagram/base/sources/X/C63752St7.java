package X;

import android.media.MediaMetadataRetriever;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.St7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63752St7 implements InterfaceC65470Tkn {
    public final InterfaceC65571Tn4 A00;
    public final Rs2 A01;
    public final Ti6 A02;
    public static final C62997SaL A04 = new C62997SaL(new C63734Sso(), -1L, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame");
    public static final C62997SaL A03 = new C62997SaL(new C63735Ssp(), 2, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption");
    public static final Rs2 A06 = new Object();
    public static final List A05 = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    @Override // X.InterfaceC65470Tkn
    public final boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        return true;
    }

    public C63752St7(InterfaceC65571Tn4 interfaceC65571Tn4, Ti6 ti6) {
        Rs2 rs2 = A06;
        this.A00 = interfaceC65571Tn4;
        this.A02 = ti6;
        this.A01 = rs2;
    }

    public static boolean A00(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        int parseInt2 = Integer.parseInt(extractMetadata2);
        if ((parseInt == 7 || parseInt == 6) && parseInt2 == 6) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:22|23|24|(1:67)|28|(1:30)|31|(3:63|(0)|(4:51|(1:53)(1:56)|54|55)(2:57|58))(4:35|(3:38|(2:40|41)(1:61)|36)|62|(0)(0))|42|43|44|(2:46|(1:48))|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010b, code lost:
    
        android.util.Log.isLoggable("VideoDecoder", 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d1, code lost:
    
        if (r1 < 33) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123 A[Catch: all -> 0x0129, TRY_ENTER, TryCatch #1 {all -> 0x0129, blocks: (B:16:0x003f, B:20:0x0054, B:31:0x00a0, B:33:0x00ae, B:35:0x00b2, B:36:0x00b8, B:38:0x00be, B:44:0x00d4, B:46:0x00da, B:48:0x00ec, B:60:0x010b, B:57:0x0123, B:58:0x0128, B:63:0x00cb, B:68:0x0096, B:69:0x009c, B:24:0x005a, B:28:0x0081), top: B:15:0x003f, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    @Override // X.InterfaceC65470Tkn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC65558Tme ANo(X.C63729Ssj r15, java.lang.Object r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63752St7.ANo(X.Ssj, java.lang.Object, int, int):X.Tme");
    }
}
