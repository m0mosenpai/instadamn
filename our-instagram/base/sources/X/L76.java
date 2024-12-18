package X;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class L76 {
    public Context A00;
    public LI4 A01;
    public File A02;

    public final C1F3 A00(String str, String str2) {
        File file = new File(this.A02, str);
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(DialogModule.KEY_TITLE, str);
            contentValues.put(MSV.A00(171), str);
            if (!TextUtils.isEmpty(str2)) {
                contentValues.put("mime_type", str2);
            }
            LI4 li4 = this.A01;
            StringBuilder sb = new StringBuilder(li4.A02);
            Iterator it = li4.A03.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                sb.append(File.separator);
                sb.append(A1B);
            }
            contentValues.put(MSV.A00(1539), sb.toString());
            Context context = this.A00;
            return new T22(contentValues, context, context.getContentResolver().insert(li4.A00, contentValues));
        }
        return new C45349K5i(this.A00, file, this.A01.A04);
    }

    public L76(Context context, LI4 li4) {
        this.A00 = context.getApplicationContext();
        this.A01 = li4;
        File A00 = C0eT.A00(li4.A02);
        Iterator it = li4.A03.iterator();
        while (it.hasNext()) {
            A00 = new File(A00, AbstractC166987dD.A1B(it));
        }
        A00.mkdirs();
        this.A02 = A00;
    }
}
