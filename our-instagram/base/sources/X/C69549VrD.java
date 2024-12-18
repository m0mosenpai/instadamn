package X;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.VrD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69549VrD {
    public final long A00;
    public final Integer A01;

    public final String toString() {
        String str;
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(1, 1);
        Locale locale = Locale.US;
        String A10 = AbstractC43593JPy.A10(dateTimeInstance, this.A00);
        Integer num = this.A01;
        if (num != null) {
            str = AbstractC62186S1h.A00(num);
        } else {
            str = "Purchased";
        }
        return AbstractC58318PtA.A0o(locale, "Checkout Timestamp [%s], Checkout Outcome [%s]", Arrays.copyOf(new Object[]{A10, str}, 2));
    }

    public C69549VrD(long j, Integer num) {
        this.A00 = j;
        this.A01 = num;
    }
}
