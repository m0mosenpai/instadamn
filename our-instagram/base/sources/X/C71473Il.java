package X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.3Il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C71473Il {
    public final String A00;

    public C71473Il(String separator) {
        this.A00 = separator;
    }

    public static C71473Il A00(char separator) {
        return new C71473Il(String.valueOf(separator));
    }

    public CharSequence A01(Object part) {
        part.getClass();
        if (part instanceof CharSequence) {
            return (CharSequence) part;
        }
        return part.toString();
    }

    public final String A02(Iterable parts) {
        Iterator it = parts.iterator();
        StringBuilder sb = new StringBuilder();
        A03(sb, it);
        return sb.toString();
    }

    public final void A03(StringBuilder builder, Iterator parts) {
        try {
            if (!parts.hasNext()) {
                return;
            }
            while (true) {
                builder.append(A01(parts.next()));
                if (parts.hasNext()) {
                    builder.append((CharSequence) this.A00);
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public C71473Il() {
        this.A00 = ", ";
    }
}
