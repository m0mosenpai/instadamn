package com.instagram.liteprovider.v2;

import X.AbstractC06960Yn;
import X.AbstractC18880wL;
import X.AbstractC226009yJ;
import X.C03190Dc;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;

/* loaded from: classes.dex */
public final class FirstPartyUserValuesLiteProviderV2 extends ContentProvider {
    public static final String[] A00 = {PublicKeyCredentialControllerUtility.JSON_KEY_NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE};

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    private final void A00() {
        if (!C03190Dc.A01(getContext()) && !AbstractC226009yJ.A00(getContext())) {
            throw new SecurityException("Component access not allowed.");
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        A00();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        A00();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        A00();
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor;
        A00();
        Context context = getContext();
        String[] strArr3 = A00;
        if (context == null) {
            matrixCursor = new MatrixCursor(strArr3);
        } else {
            matrixCursor = new MatrixCursor(strArr3);
            if (str != null) {
                switch (str.hashCode()) {
                    case -1734026053:
                        if (str.equals("name='mas_session_info'")) {
                            for (String str3 : AbstractC18880wL.A00(context, "multiple_logged_in_user")) {
                                matrixCursor.addRow(new String[]{"name='mas_session_info'", str3});
                            }
                            break;
                        }
                        break;
                    case 217257341:
                        if (str.equals("name='all_session_info'")) {
                            for (String str4 : (String[]) AbstractC06960Yn.A0b(AbstractC18880wL.A00(context, "saved_user"), AbstractC18880wL.A00(context, "multiple_logged_in_user"))) {
                                matrixCursor.addRow(new String[]{"name='all_session_info'", str4});
                            }
                            break;
                        }
                        break;
                    case 1063606563:
                        if (str.equals("name='saved_session_info'")) {
                            for (String str5 : AbstractC18880wL.A00(context, "saved_user")) {
                                matrixCursor.addRow(new String[]{"name='saved_session_info'", str5});
                            }
                            break;
                        }
                        break;
                }
            }
            String[] A002 = AbstractC18880wL.A00(context, "current_user");
            for (String str6 : A002) {
                matrixCursor.addRow(new String[]{"name='active_session_info'", str6});
            }
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A00();
        throw new UnsupportedOperationException();
    }
}
