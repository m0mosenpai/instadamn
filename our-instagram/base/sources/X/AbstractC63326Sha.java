package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.os.Environment;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Sha, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63326Sha {
    public static int A00;
    public static RectF A01;
    public static C102884kP A02;
    public static C102884kP A03;

    public static void A01(Context context, C6FQ c6fq, C6FW c6fw) {
        int i = 0;
        Object A10 = MSW.A10(c6fw, 0);
        if (A10 instanceof Number) {
            int A0H = AbstractC166987dD.A0H(A10);
            synchronized (C0eT.class) {
            }
            String[] strArr = {String.valueOf(AnonymousClass001.A0R(Environment.getExternalStorageDirectory().toString(), "/DCIM/Camera").toLowerCase().hashCode())};
            android.net.Uri contentUri = MediaStore.Images.Media.getContentUri("external");
            ContentResolver contentResolver = context.getContentResolver();
            C06280Ut.A00(contentUri.getAuthority(), 0, C05F.A01);
            Cursor query = contentResolver.query(contentUri, new String[]{"_data"}, "bucket_id = ?", strArr, null);
            ArrayList A17 = AbstractC25225BEi.A17(A0H);
            if (query != null && query.moveToFirst()) {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                do {
                    String string = query.getString(columnIndexOrThrow);
                    if (string != null) {
                        C6BS c6bs = C6BS.A02;
                        AbstractC166997dE.A1S(C6BX.A00(AbstractC08820cl.A03(AnonymousClass001.A0R("file://", string))), A17);
                        i++;
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } while (i < A0H);
                query.close();
            }
            A04(c6fq, c6fw, A17);
        }
    }

    public static void A02(android.net.Uri uri, C6FQ c6fq, C6FW c6fw) {
        Bitmap decodeFile;
        List list = c6fw.A00;
        Object obj = list.get(2);
        Object obj2 = list.get(3);
        if ((obj2 instanceof Number) && (obj instanceof C1344465q)) {
            int A0H = AbstractC166987dD.A0H(obj2);
            InterfaceC103384lE interfaceC103384lE = ((C1344465q) obj).A00;
            String path = uri.getPath();
            if (path != null && (decodeFile = BitmapFactory.decodeFile(path)) != null) {
                int height = decodeFile.getHeight();
                int width = decodeFile.getWidth();
                if ((height > 0 && height < A0H) || (width > 0 && width < A0H)) {
                    SUY.A00 = c6fq;
                    C6FW A0f = AbstractC25227BEk.A0f(AbstractC25225BEi.A0s(), "SIZE_SMALL", 0);
                    C6FQ c6fq2 = SUY.A00;
                    if (c6fq2 != null) {
                        C131845xK.A00(c6fq2, A0f, interfaceC103384lE);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        Object obj3 = list.get(0);
        if (!(obj3 instanceof C1344465q)) {
            return;
        }
        InterfaceC103384lE interfaceC103384lE2 = ((C1344465q) obj3).A00;
        SUY.A00 = c6fq;
        C6FX A0s = AbstractC25225BEi.A0s();
        C6BS c6bs = C6BS.A02;
        C6FW A0f2 = AbstractC25227BEk.A0f(A0s, C6BX.A00(uri).toString(), 0);
        C6FQ c6fq3 = SUY.A00;
        if (c6fq3 != null) {
            C131845xK.A00(c6fq3, A0f2, interfaceC103384lE2);
        }
        OTB A002 = OTB.A01.A00();
        String obj4 = uri.toString();
        C14360o3.A0B(obj4, 0);
        A002.A00.add(obj4);
        A00 = 0;
        A01 = null;
    }

    public static void A03(C6FQ c6fq, C6FW c6fw) {
        Object A10 = MSW.A10(c6fw, 1);
        if (A10 instanceof C1344465q) {
            InterfaceC103384lE interfaceC103384lE = ((C1344465q) A10).A00;
            SUY.A00 = c6fq;
            C6FW A002 = AbstractC25225BEi.A0s().A00();
            if (c6fq != null) {
                C131845xK.A00(c6fq, A002, interfaceC103384lE);
            }
        }
    }

    public static void A04(C6FQ c6fq, C6FW c6fw, ArrayList arrayList) {
        Object A10 = MSW.A10(c6fw, 1);
        if (A10 instanceof C1344465q) {
            InterfaceC103384lE interfaceC103384lE = ((C1344465q) A10).A00;
            SUY.A00 = c6fq;
            C6FW A002 = AbstractC31179DnN.A0I(arrayList).A00();
            C6FQ c6fq2 = SUY.A00;
            if (c6fq2 != null) {
                C131845xK.A00(c6fq2, A002, interfaceC103384lE);
            }
        }
    }

    public static String A00(int i) {
        String A0L;
        C102884kP c102884kP = A02;
        if (c102884kP == null || (A0L = c102884kP.A0L(i)) == null) {
            return "";
        }
        C6BS c6bs = C6BS.A02;
        return C6BX.A01(AbstractC08820cl.A03(A0L), false).toString();
    }
}
