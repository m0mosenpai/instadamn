package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class T4n implements InterfaceC65513Tli {
    public static final android.net.Uri A01;
    public final LogPrinter A00 = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        A01 = builder.build();
    }

    @Override // X.InterfaceC65513Tli
    public final android.net.Uri FFl() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Comparator] */
    @Override // X.InterfaceC65513Tli
    public final void FFt(C63197Sez c63197Sez) {
        ArrayList A0n = AbstractC31180DnO.A0n(c63197Sez.A09);
        Collections.sort(A0n, new Object());
        StringBuilder A1C = AbstractC166987dD.A1C();
        int size = A0n.size();
        int i = 0;
        while (i < size) {
            Object obj = A0n.get(i);
            i++;
            String obj2 = obj.toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (A1C.length() != 0) {
                    AbstractC58318PtA.A1S(A1C);
                }
                A1C.append(obj2);
            }
        }
        this.A00.println(A1C.toString());
    }
}
