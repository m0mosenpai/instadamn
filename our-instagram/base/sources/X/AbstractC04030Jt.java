package X;

import java.io.FilterWriter;
import java.io.Writer;

/* renamed from: X.0Jt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04030Jt extends FilterWriter {
    public static void A00(Writer writer, char c) {
        String str;
        if (c != '\f') {
            if (c != '\r') {
                if (c == '\"' || c == '\\') {
                    writer.write(92);
                } else {
                    switch (c) {
                        case '\b':
                            writer.write(92);
                            c = 'b';
                            break;
                        case '\t':
                            writer.write(92);
                            c = 't';
                            break;
                        case '\n':
                            writer.write(92);
                            str = "n";
                            writer.write(str);
                            return;
                        default:
                            if (c <= 31 || c == 8232 || c == 8233) {
                                str = String.format("\\u%04x", Integer.valueOf(c));
                                writer.write(str);
                                return;
                            }
                            break;
                    }
                }
            } else {
                writer.write(92);
                c = 'r';
            }
        } else {
            writer.write(92);
            c = 'f';
        }
        writer.write(c);
    }
}
