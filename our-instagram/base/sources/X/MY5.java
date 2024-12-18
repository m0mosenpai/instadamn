package X;

import android.media.MediaDataSource;
import android.media.MediaExtractor;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MY5 extends MY7 {
    public static final MY9 A01 = new MY9();
    public final String A00;

    public static MY5 A00(String str) {
        try {
            return new MY5(new MediaExtractor(), str);
        } catch (Throwable th) {
            throw new RuntimeException(A01.toString(), th);
        }
    }

    public final void A01(MediaDataSource mediaDataSource) {
        try {
            super.A00.setDataSource(mediaDataSource);
        } catch (Throwable th) {
            throw new IOException(A01.toString(), th);
        }
    }

    @Override // X.MY7, X.InterfaceC58194Pr0
    public final void release() {
        MY9 my9 = A01;
        String str = this.A00;
        int hashCode = hashCode();
        synchronized (my9) {
            Map map = my9.A00;
            java.util.Set set = (java.util.Set) map.get(str);
            if (set != null) {
                set.remove(Integer.valueOf(hashCode));
                if (set.isEmpty()) {
                    map.remove(str);
                }
            }
        }
        super.release();
    }

    public MY5(MediaExtractor mediaExtractor, String str) {
        super.A00 = mediaExtractor;
        this.A00 = str;
        MY9 my9 = A01;
        int hashCode = hashCode();
        synchronized (my9) {
            Map map = my9.A00;
            if (!map.containsKey(str)) {
                map.put(str, AbstractC166987dD.A1H());
            }
            java.util.Set set = (java.util.Set) map.get(str);
            if (set != null) {
                set.add(Integer.valueOf(hashCode));
            }
        }
    }

    @Override // X.MY7, X.InterfaceC58194Pr0
    public final void ESw(String str) {
        try {
            super.ESw(str);
        } catch (Throwable th) {
            throw new IOException(A01.toString(), th);
        }
    }
}
