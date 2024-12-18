package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Hja, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39704Hja {
    public String A00;
    public String A01;
    public List A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C39704Hja)) {
            return false;
        }
        C39704Hja c39704Hja = (C39704Hja) obj;
        int i = 0;
        while (true) {
            List list = this.A02;
            if (i < list.size()) {
                if (!c39704Hja.A02.get(i).equals(list.get(i))) {
                    return false;
                }
                i++;
            } else {
                if (c39704Hja.A02.size() != list.size() || !c39704Hja.A01.equals(this.A01)) {
                    return false;
                }
                String str = c39704Hja.A00;
                String str2 = this.A00;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
                return true;
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00, Integer.valueOf(this.A02.hashCode())});
    }
}
