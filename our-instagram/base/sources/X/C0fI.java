package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;

/* renamed from: X.0fI, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fI {
    public static ContentProviderClient A00(ContentResolver contentResolver, android.net.Uri uri, int i) {
        String str;
        Integer num = C05F.A00;
        if (uri != null) {
            str = uri.getAuthority();
        } else {
            str = null;
        }
        C06280Ut.A00(str, i, num);
        return contentResolver.acquireUnstableContentProviderClient(uri);
    }

    public static Cursor A01(ContentResolver contentResolver, android.net.Uri uri, String str, String str2, String[] strArr, String[] strArr2, int i) {
        String str3;
        Integer num = C05F.A01;
        if (uri != null) {
            str3 = uri.getAuthority();
        } else {
            str3 = null;
        }
        C06280Ut.A00(str3, i, num);
        return contentResolver.query(uri, strArr, str, strArr2, str2);
    }
}
