package X;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* renamed from: X.1sf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39581sf {
    public final C39601sh A00;
    public final Locale A01;

    public C39581sf(String str, ByteBuffer byteBuffer) {
        List list;
        String str2;
        C14360o3.A0B(str, 2);
        this.A00 = new C39601sh(str, byteBuffer);
        List A03 = new C11L("_").A03(str);
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
        String str3 = strArr[0];
        if (strArr.length > 1) {
            str2 = strArr[1];
        } else {
            str2 = "";
        }
        this.A01 = new Locale(str3, str2);
    }
}
