package X;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TSE implements Comparator {
    public final int A00;

    public TSE(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        Long l;
        switch (this.A00) {
            case 0:
                return 0;
            case 1:
                l = (Long) obj;
                return l.compareTo((Long) obj2);
            case 2:
                i = ((C62959SZc) obj).A00;
                i2 = ((C62959SZc) obj2).A00;
                return i - i2;
            case 3:
                Sb5 sb5 = (Sb5) obj;
                Sb5 sb52 = (Sb5) obj2;
                if (sb5 == null) {
                    if (sb52 != null) {
                        return -1;
                    }
                    return 0;
                }
                if (sb52 != null) {
                    long j = sb5.A03 - sb52.A03;
                    if (j == 0) {
                        return 0;
                    }
                    if (j < 0) {
                        return -1;
                    }
                    return 1;
                }
                return 1;
            case 4:
                ExecutorC64806TUu executorC64806TUu = C63276Sga.A07;
                l = (Long) ((Map.Entry) obj).getValue();
                obj2 = ((Map.Entry) obj2).getValue();
                return l.compareTo((Long) obj2);
            case 5:
                i = ((C63282Sgh) obj2).A02;
                i2 = ((C63282Sgh) obj).A02;
                return i - i2;
            case 6:
                if (((C62594SHx) obj).A03) {
                    return -1;
                }
                return 0;
            case 7:
                int i3 = ((C62594SHx) obj).A00;
                int i4 = ((C62594SHx) obj2).A00;
                if (i3 != i4) {
                    if (i3 >= i4) {
                        return 1;
                    }
                    return -1;
                }
                return 0;
            case 8:
                String str = (String) obj;
                String str2 = (String) obj2;
                int length = str.length();
                int length2 = str2.length();
                int min = Math.min(length, length2);
                for (int i5 = 4; i5 < min; i5++) {
                    char charAt = str.charAt(i5);
                    char charAt2 = str2.charAt(i5);
                    if (charAt != charAt2) {
                        if (charAt < charAt2) {
                            return -1;
                        }
                        return 1;
                    }
                }
                if (length != length2) {
                    if (length < length2) {
                        return -1;
                    }
                    return 1;
                }
                return 0;
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
