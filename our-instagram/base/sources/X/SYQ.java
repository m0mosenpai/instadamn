package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes10.dex */
public final class SYQ {
    public static final String[] A02 = {"_id", "contact_id", "deleted", "mimetype", "data1", "data2", "data3"};
    public final Context A00;
    public final C69541Vr5 A01;

    public final QFO A00() {
        Context context = this.A00;
        if (context.checkCallingOrSelfPermission(AbstractC111324zv.A00(1915)) != 0) {
            return null;
        }
        try {
            ContentResolver contentResolver = context.getContentResolver();
            android.net.Uri uri = ContactsContract.RawContactsEntity.CONTENT_URI;
            String[] strArr = A02;
            C06280Ut.A00(uri.getAuthority(), 0, C05F.A01);
            Cursor query = contentResolver.query(uri, strArr, null, null, "contact_id");
            if (query == null) {
                return null;
            }
            try {
                return new QFO(query);
            } catch (Exception unused) {
                query.close();
                Bundle bundle = new Bundle(1);
                bundle.putString(TraceFieldType.FailureReason, "contacts_iterator_cursor_null");
                this.A01.A00(bundle);
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    public SYQ(Context context, C69541Vr5 c69541Vr5) {
        this.A00 = context;
        this.A01 = c69541Vr5;
    }
}
