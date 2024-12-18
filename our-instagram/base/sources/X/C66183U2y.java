package X;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.U2y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66183U2y extends C65957Tx9 {
    public final void A05(String str, List list, boolean z) {
        String str2;
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC65924TwV abstractC65924TwV = (AbstractC65924TwV) it.next();
            if ((abstractC65924TwV instanceof C66130U0o) && C14360o3.A0K(((C66130U0o) abstractC65924TwV).A01.A07, "meta_ai_suggestion")) {
                if (z) {
                    str2 = "meta_ai_recent";
                }
            } else {
                str2 = "null_state_recent";
            }
            C65954Twz c65954Twz = new C65954Twz();
            c65954Twz.A09 = str2;
            c65954Twz.A08 = "RECENT";
            c65954Twz.A06 = str;
            c65954Twz.A0F = true;
            Locale locale = Locale.getDefault();
            C14360o3.A07(locale);
            String lowerCase = "RECENT".toLowerCase(locale);
            C14360o3.A07(lowerCase);
            c65954Twz.A05 = lowerCase;
            A01(c65954Twz, abstractC65924TwV);
        }
    }
}
