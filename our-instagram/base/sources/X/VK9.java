package X;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class VK9 {
    public C1125456i A00;
    public String A01;
    public boolean A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A01.equals(((VK9) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01});
    }
}
