package X;

import java.io.Reader;
import java.nio.CharBuffer;

/* renamed from: X.433, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass433 {
    public static String A00(Readable r) {
        StringBuilder sb = new StringBuilder();
        if (r instanceof Reader) {
            Reader reader = (Reader) r;
            char[] cArr = new char[C3OO.FLAG_MOVED];
            while (true) {
                int read = reader.read(cArr);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
        } else {
            CharBuffer allocate = CharBuffer.allocate(C3OO.FLAG_MOVED);
            while (r.read(allocate) != -1) {
                allocate.flip();
                sb.append((CharSequence) allocate);
                allocate.clear();
            }
        }
        return sb.toString();
    }
}
