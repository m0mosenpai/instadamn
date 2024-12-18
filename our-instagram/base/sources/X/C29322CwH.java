package X;

import android.text.SpannableStringBuilder;
import java.util.Iterator;

/* renamed from: X.CwH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29322CwH implements InterfaceC30949Dj6 {
    public static final C29322CwH A00 = new Object();
    public static final C11L A01 = new C11L("\\{|\\}");

    @Override // X.InterfaceC30949Dj6
    public final void E68(SpannableStringBuilder spannableStringBuilder, String str, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(str, 0);
        Iterator it = A01.A03(str).iterator();
        while (it.hasNext()) {
            CharSequence A1B = AbstractC166987dD.A1B(it);
            if (AbstractC001900j.A0a(A1B, "|", false)) {
                A1B = (CharSequence) interfaceC16660sJ.invoke(A1B);
            }
            spannableStringBuilder.append(A1B);
        }
    }
}
