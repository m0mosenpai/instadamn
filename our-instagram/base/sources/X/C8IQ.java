package X;

import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8IQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8IQ {
    public static String A00;
    public static InterfaceC19630xq A01;
    public static final List A02 = new ArrayList();

    public static final InterfaceC19630xq A00() {
        if (A01 == null) {
            synchronized (C8IQ.class) {
                if (A01 == null) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("GalleryMetadataUtil.initSharedPreferences()", -638418311);
                    }
                    try {
                        A01 = AbstractC19750y3.A01("GalleryThumbnailCachePreferences");
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-1839611795);
                        }
                    } catch (Throwable th) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-1041004367);
                        }
                        throw th;
                    }
                }
            }
        }
        return A01;
    }
}
