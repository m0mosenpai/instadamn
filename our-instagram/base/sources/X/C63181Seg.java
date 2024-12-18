package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: X.Seg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63181Seg {
    public static final C63181Seg A06 = new C63181Seg();
    public android.net.Uri A00;
    public android.net.Uri A01;
    public boolean A04;
    public final Object A05 = AbstractC58318PtA.A0b();
    public Map A03 = AbstractC166987dD.A1G();
    public Map A02 = AbstractC166987dD.A1G();

    public static Bitmap A00(Context context, android.net.Uri uri) {
        InputStream inputStream;
        while (true) {
            Bitmap bitmap = null;
            try {
                inputStream = context.getContentResolver().openInputStream(uri);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                inputStream = null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 1;
            try {
                bitmap = BitmapFactory.decodeStream(inputStream, null, options);
                return bitmap;
            } catch (OutOfMemoryError unused) {
                int i = options.inSampleSize;
                if (i < 64) {
                    options.inSampleSize = i * 2;
                } else {
                    return bitmap;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Q2e, android.os.AsyncTask] */
    public final void A01(Context context, android.net.Uri uri, InterfaceC65485Tl2 interfaceC65485Tl2, String str, boolean z, boolean z2) {
        synchronized (this.A05) {
            Map map = this.A03;
            boolean containsKey = map.containsKey(uri);
            map.put(uri, interfaceC65485Tl2);
            if (containsKey) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            ?? asyncTask = new AsyncTask();
            asyncTask.A00 = applicationContext;
            asyncTask.A02 = uri;
            asyncTask.A04 = z;
            asyncTask.A05 = z2;
            asyncTask.A03 = str;
            asyncTask.A01 = null;
            asyncTask.execute(new Void[0]);
        }
    }
}
