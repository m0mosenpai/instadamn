package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class T25 implements InterfaceC95074Pr, Serializable, Cloneable {
    public final Integer A00;
    public final String A01;
    public static final C95044Pn A04 = new Object();
    public static final C95054Po A03 = new C95054Po("topicName", (byte) 11, 1);
    public static final C95054Po A02 = new C95054Po("qualityOfService", (byte) 8, 2);

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof T25) {
                    T25 t25 = (T25) obj;
                    String str = this.A01;
                    boolean A1W = AbstractC167007dF.A1W(str);
                    String str2 = t25.A01;
                    if (!(AbstractC167007dF.A1W(str2) ^ A1W) && (!A1W || (str != null ? str.equals(str2) : str2 == null))) {
                        Integer num = this.A00;
                        boolean A1W2 = AbstractC167007dF.A1W(num);
                        Integer num2 = t25.A00;
                        if (!(AbstractC167007dF.A1W(num2) ^ A1W2)) {
                            if (A1W2) {
                                if (num == null) {
                                    if (num2 == null) {
                                    }
                                } else if (!num.equals(num2)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return AbstractC63237Sfp.A01(this, AbstractC166987dD.A1C(), 1);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A01, this.A00});
    }

    public T25(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }
}
