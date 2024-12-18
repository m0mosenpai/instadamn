package X;

import java.util.Comparator;

/* renamed from: X.GlI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37863GlI implements Comparator {
    public final int A00;

    public C37863GlI(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer valueOf;
        int length;
        int i;
        switch (this.A00) {
            case 0:
                return ((C38669GzA) obj2).A00 - ((C38669GzA) obj).A00;
            case 1:
                valueOf = Integer.valueOf(((C32061E6n) obj).A01);
                length = ((C32061E6n) obj2).A01;
                return C2BS.A00(valueOf, Integer.valueOf(length));
            case 2:
                valueOf = Integer.valueOf(((String) obj).length());
                length = ((String) obj2).length();
                return C2BS.A00(valueOf, Integer.valueOf(length));
            default:
                C40861ut c40861ut = (C40861ut) ((C206239Bg) obj).A04;
                length = -1;
                if (c40861ut != null) {
                    i = c40861ut.A09();
                } else {
                    i = -1;
                }
                valueOf = Integer.valueOf(i);
                C40861ut c40861ut2 = (C40861ut) ((C206239Bg) obj2).A04;
                if (c40861ut2 != null) {
                    length = c40861ut2.A09();
                }
                return C2BS.A00(valueOf, Integer.valueOf(length));
        }
    }
}
