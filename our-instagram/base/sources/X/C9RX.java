package X;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;

/* renamed from: X.9RX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9RX extends ContentProvider {
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, String str, String[] strArr) {
        C0K8.A02(C9RX.class, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(android.net.Uri uri) {
        C0K8.A02(C9RX.class, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, ContentValues contentValues) {
        C0K8.A02(C9RX.class, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Cursor query(android.net.Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        A97 a97;
        String str3;
        String str4;
        String str5;
        C2ZO.A01.A01();
        if (!C03190Dc.A01(getContext())) {
            if (!((C08610cP) AbstractC166987dD.A17(A3S.A00)).A03(getContext(), null, null)) {
                String A00 = AbstractC111324zv.A00(82);
                C0K8.A02(C9RX.class, A00);
                throw new SecurityException(A00);
            }
        }
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        C14360o3.A0B(A05, 0);
        C3KV c3kv = (C3KV) A05.A01(C3KV.class, new GSw(A05, 19));
        synchronized (c3kv) {
            a97 = c3kv.A00;
        }
        String str6 = null;
        if (a97 != null) {
            str6 = a97.A03;
        }
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        if (a97 == null || (str3 = a97.A02) == null) {
            str3 = "";
        }
        if (a97 == null) {
            str4 = "";
        } else {
            str4 = a97.A00;
        }
        if (a97 != null && (str5 = a97.A01) != null) {
            str7 = str5;
        }
        MatrixCursor matrixCursor = new MatrixCursor(A3R.A00);
        matrixCursor.addRow(new String[]{str6, str3, str4, str7});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C0K8.A02(C9RX.class, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }
}
