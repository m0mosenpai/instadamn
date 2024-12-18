package X;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes10.dex */
public final class T22 implements C1F3 {
    public final ContentValues A00;
    public final Context A01;
    public final android.net.Uri A02;

    @Override // X.C1F3
    public final void AIh() {
        android.net.Uri uri = this.A02;
        if (uri != null) {
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = this.A00;
            Long valueOf = Long.valueOf(currentTimeMillis);
            contentValues.put("date_added", valueOf);
            contentValues.put(AbstractC43591JPw.A00(903), valueOf);
            if (Build.VERSION.SDK_INT >= 29) {
                contentValues.put("datetaken", valueOf);
                contentValues.put("is_pending", AbstractC25227BEk.A0p());
            }
            this.A01.getContentResolver().update(uri, contentValues, null, null);
            return;
        }
        throw MSW.A0y("Content Resolver resource is not available");
    }

    @Override // X.C1F3
    public final OutputStream CHy() {
        android.net.Uri uri = this.A02;
        if (uri != null) {
            OutputStream openOutputStream = this.A01.getContentResolver().openOutputStream(uri);
            if (openOutputStream != null) {
                return openOutputStream;
            }
            throw MSW.A0y("CRWritableResource returned a null output stream");
        }
        throw MSW.A0y("Content Resolver resource is not available");
    }

    public T22(ContentValues contentValues, Context context, android.net.Uri uri) {
        this.A01 = context;
        this.A00 = contentValues;
        this.A02 = uri;
    }

    @Override // X.C1F3
    public final void FEV(InputStream inputStream) {
        C1FH.A00(inputStream, CHy());
    }
}
