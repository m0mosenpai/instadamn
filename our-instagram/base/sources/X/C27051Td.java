package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1Td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27051Td extends ContentObserver {
    public final ContentResolver A00;
    public final Context A01;
    public final List A02;
    public final UriMatcher A03;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
    }

    public C27051Td(ContentResolver contentResolver, Context context, Handler handler) {
        super(handler);
        String packageName;
        this.A02 = new LinkedList();
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.A03 = uriMatcher;
        this.A01 = context;
        this.A00 = contentResolver;
        String str = C1TW.A01;
        if ("com.facebook.appmanager".equals(context.getPackageName())) {
            packageName = "*";
        } else {
            packageName = context.getPackageName();
        }
        uriMatcher.addURI(str, AnonymousClass001.A0u(packageName, "/", "sessions", "/#"), 1);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        String lastPathSegment;
        if (uri != null && this.A03.match(uri) == 1 && (lastPathSegment = uri.getLastPathSegment()) != null && lastPathSegment.length() != 0) {
            try {
                long parseLong = Long.parseLong(lastPathSegment);
                if (parseLong != -1) {
                    List list = this.A02;
                    synchronized (list) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC65343TiQ) it.next()).Dkt(parseLong);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }
}
