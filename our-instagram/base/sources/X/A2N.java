package X;

import android.os.Build;
import android.webkit.MimeTypeMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class A2N {
    public static final String A00(String str) {
        List list;
        if (str != null) {
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
            if (extensionFromMimeType == null && Build.VERSION.SDK_INT < 29) {
                Locale locale = Locale.US;
                C14360o3.A08(locale);
                String lowerCase = str.toLowerCase(locale);
                C14360o3.A07(lowerCase);
                List A03 = new C11L("/").A03(lowerCase);
                if (!A03.isEmpty()) {
                    ListIterator listIterator = A03.listIterator(A03.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = AbstractC001800i.A0d(A03, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = C16930sl.A00;
                String[] strArr = (String[]) list.toArray(new String[0]);
                if (strArr.length == 2) {
                    String str2 = strArr[1];
                    if ("heic".equals(str2) || "heif".equals(str2)) {
                        return str2;
                    }
                }
            }
            return extensionFromMimeType;
        }
        return null;
    }
}
