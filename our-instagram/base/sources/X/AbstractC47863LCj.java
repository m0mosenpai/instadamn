package X;

import android.content.ContentResolver;
import android.content.Context;
import android.location.Location;
import com.instagram.common.gallery.Medium;
import java.util.NoSuchElementException;

/* renamed from: X.LCj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47863LCj {
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A01(android.content.Context r21, android.location.Location r22, com.instagram.common.session.UserSession r23, X.EnumC222729sD r24, X.C60322pF r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC47863LCj.A01(android.content.Context, android.location.Location, com.instagram.common.session.UserSession, X.9sD, X.2pF, java.util.List):java.util.List");
    }

    public static final Float A00(Context context, Location location, Location location2, Medium medium) {
        ContentResolver contentResolver = context.getContentResolver();
        C14360o3.A07(contentResolver);
        double[] A07 = medium.A07(contentResolver);
        if (A07 != null) {
            int length = A07.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            location2.setLatitude(A07[0]);
            location2.setLongitude(A07[length - 1]);
            return Float.valueOf(location.distanceTo(location2));
        }
        return null;
    }
}
