package X;

import android.text.SpannableStringBuilder;
import java.util.Iterator;

/* renamed from: X.CwI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29323CwI implements InterfaceC30949Dj6 {
    public static final C29323CwI A00 = new Object();
    public static final C11L A01 = new C11L("(?<=\\})|(?=\\{)");
    public static final C11L A02 = new C11L("[{}]");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.11L] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.text.SpannableStringBuilder] */
    @Override // X.InterfaceC30949Dj6
    public final void E68(SpannableStringBuilder spannableStringBuilder, String str, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(str, 0);
        Iterator it = A01.A03(str).iterator();
        while (it.hasNext()) {
            ?? A1B = AbstractC166987dD.A1B(it);
            int i = 0;
            for (int i2 = 0; i2 < A1B.length(); i2++) {
                if (A1B.charAt(i2) == '|') {
                    i++;
                }
            }
            if (3 <= i && i < 5) {
                A1B = (CharSequence) interfaceC16660sJ.invoke(A02.A00(A1B, ""));
            }
            spannableStringBuilder.append(A1B);
        }
    }
}
