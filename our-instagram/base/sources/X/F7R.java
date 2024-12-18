package X;

import android.app.Activity;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class F7R {
    public static final void A00(Activity activity, UserSession userSession, C60484R0k c60484R0k, String str) {
        Enum r0;
        ImmutableList A0E;
        C14360o3.A0B(str, 2);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("media_id", str);
        C60483R0j A0E2 = c60484R0k.A0E();
        ArrayList arrayList = null;
        if (A0E2 != null) {
            r0 = A0E2.getOptionalEnumField(0, "online_eligibility", EnumC33437Eq8.A04);
        } else {
            r0 = null;
        }
        A05.putString("media_eligibility", String.valueOf(r0));
        C60483R0j A0E3 = c60484R0k.A0E();
        if (A0E3 != null && (A0E = A0E3.A0E()) != null) {
            arrayList = AbstractC167017dG.A0q(A0E);
            Iterator<E> it = A0E.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC25225BEi.A0l(it).A08("prompt_text"));
            }
        }
        A05.putString("prompts", String.valueOf(arrayList));
        A05.putString("launcher_value", String.valueOf(C18U.A06(C06090Tz.A06, userSession, 36327404620233267L)));
        C33186EkX c33186EkX = new C33186EkX();
        C189448aO A0W = AbstractC31174DnI.A0W(A05, c33186EkX, userSession);
        A0W.A0d = "Content Deep Dives";
        AbstractC31173DnH.A0w(activity, c33186EkX, A0W);
    }
}
