package X;

import android.content.Context;

/* renamed from: X.F0v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34042F0v {
    public static final void A00(Context context, AbstractC115105If abstractC115105If, String str) {
        EBK ebk;
        if (abstractC115105If != null && (ebk = (EBK) abstractC115105If.A00()) != null) {
            String str2 = ebk.A00;
            String errorMessage = ebk.getErrorMessage();
            if (errorMessage != null && !AbstractC001900j.A0T(errorMessage)) {
                C146106i8 A0j = AbstractC25229BEm.A0j();
                A0j.A0H = str;
                A0j.A0D = str2;
                A0j.A0I = errorMessage;
                AbstractC25233BEq.A1F(A0j);
                return;
            }
        }
        if (context == null) {
            return;
        }
        C9GR.A07(context, 2131961880);
    }
}
