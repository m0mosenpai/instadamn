package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class TPY implements Runnable {
    public final /* synthetic */ C6F7 A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ String A02;

    public TPY(C6F7 c6f7, C6FG c6fg, String str) {
        this.A00 = c6f7;
        this.A01 = c6fg;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6F7 c6f7 = this.A00;
        Context context = this.A01.A00;
        C50269MHy c50269MHy = new C50269MHy(this.A02, c6f7, 0);
        if (AbstractC61671Rrl.A00()) {
            ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
            android.net.Uri contentUri = MediaStore.Files.getContentUri("external");
            String[] strArr = {"bucket_id", "bucket_display_name"};
            String A00 = AbstractC61672Rrm.A00(C05F.A0C);
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Querying albums:\n        |uri = ");
            A1C.append(contentUri);
            A1C.append(",\n        |projection = ");
            String arrays = Arrays.toString(strArr);
            C14360o3.A07(arrays);
            A1C.append(arrays);
            AbstractC16490ru.A0q(AbstractC166997dE.A0x("\n      ", A1C), "|");
            Cursor A01 = C0fI.A01(contentResolver, contentUri, A00, null, strArr, null, 732311764);
            if (A01 != null) {
                try {
                    if (A01.getCount() != 0) {
                        int columnIndex = A01.getColumnIndex("bucket_id");
                        int columnIndex2 = A01.getColumnIndex("bucket_display_name");
                        LinkedHashMap A1I = AbstractC166987dD.A1I();
                        while (A01.moveToNext()) {
                            int i = A01.getInt(columnIndex);
                            String string = A01.getString(columnIndex2);
                            if (string != null && AbstractC25225BEi.A1Y(string)) {
                                Integer valueOf = Integer.valueOf(i);
                                if (!A1I.containsKey(valueOf)) {
                                    A1I.put(valueOf, AbstractC06930Yk.A06(AbstractC25229BEm.A1b(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, string, AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(i)))));
                                }
                            }
                        }
                        if (MSW.A1b(A1I)) {
                            c50269MHy.invoke(AbstractC001800i.A0a(A1I.values()));
                        }
                    }
                    A01.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C20I.A00(A01, th);
                        throw th2;
                    }
                }
            }
        }
    }
}
