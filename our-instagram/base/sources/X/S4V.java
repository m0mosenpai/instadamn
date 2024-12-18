package X;

import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class S4V {
    public static String A00(C6FW c6fw) {
        String replaceAll = ((String) c6fw.A01()).replaceAll("(%\\d)", "$0\\$s");
        ArrayList A1E = AbstractC166987dD.A1E();
        try {
            A1E.addAll((List) c6fw.A02());
            try {
                replaceAll = String.format(replaceAll, A1E.toArray());
                return replaceAll;
            } catch (IllegalFormatException e) {
                C0w9.A07("ig-action-string-printf-error", e);
                return replaceAll;
            }
        } catch (ClassCastException unused) {
            C0w9.A03("bloks-print-invalid-args", "ig.action.string.Printf only supports string args");
            return replaceAll;
        }
    }
}
