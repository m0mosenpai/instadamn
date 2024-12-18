package X;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Binder;
import android.os.CancellationSignal;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4iW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102074iW extends ContentProvider {
    public static final String[] A00 = {"COL_FULL_NAME", "COL_PROFILE_PHOTO_URL"};

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    public static final MatrixCursor A00(C102074iW c102074iW) {
        C2ZO.A01.A01();
        AbstractC18680vv A05 = C023409i.A0A.A05(c102074iW);
        if (A05 instanceof UserSession) {
            User A01 = C17060sy.A01.A01((UserSession) A05);
            String[] strArr = {A01.getFullName(), A01.Bhu().getUrl()};
            MatrixCursor matrixCursor = new MatrixCursor(A00);
            matrixCursor.addRow(strArr);
            return matrixCursor;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(android.net.Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final void A01() {
        int callingUid = Binder.getCallingUid();
        Context context = getContext();
        if (context != null) {
            int i = context.getApplicationInfo().uid;
            if (callingUid != i && context.getPackageManager().checkSignatures(i, callingUid) != 0) {
                throw new SecurityException("Access to user information denied");
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(android.net.Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        A01();
        return A00(this);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(android.net.Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        A01();
        return A00(this);
    }
}
