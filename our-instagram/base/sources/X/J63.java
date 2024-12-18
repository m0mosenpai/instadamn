package X;

import java.util.Comparator;

/* loaded from: classes7.dex */
public final class J63 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        C40861ut c40861ut = (C40861ut) ((C206239Bg) obj).A04;
        int i2 = -1;
        if (c40861ut != null) {
            i = c40861ut.A09();
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        C40861ut c40861ut2 = (C40861ut) ((C206239Bg) obj2).A04;
        if (c40861ut2 != null) {
            i2 = c40861ut2.A09();
        }
        return C2BS.A00(valueOf, Integer.valueOf(i2));
    }
}
