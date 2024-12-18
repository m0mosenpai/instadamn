package X;

import java.util.Comparator;

/* renamed from: X.4Gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93424Gv implements Comparator {
    public static final C93424Gv A00 = new C93424Gv();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int length = str.length() - str2.length();
        if (length == 0) {
            return str.compareTo(str2);
        }
        return length;
    }
}
