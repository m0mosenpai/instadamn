package X;

import android.content.Context;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.L6s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47748L6s {
    public final Context A00;
    public final UserSession A01;

    public final List A00(boolean z) {
        String A04 = C18U.A04(C06090Tz.A05, this.A01, 36880656538796378L);
        if (A04.length() == 0) {
            A04 = "astronaut riding a horse, bird wearing sunglasses, skateboarding cat, ballerina with a giraffe, elephant riding a bicycle, rainbow birthday cake, unicorn over the moon, zombie chef, racoon on a motorcycle, a cat in space, alien birthday party, panda picnic, zoo disco, dinosaur roller disco, dog and cat dancing, car full of clowns, mermaid cowboy, pizza playing basketball, pirate under a rainbow, corgi dance party, robot pianist, avocado with sunglasses, space soup, fireworks at sunset";
        }
        List A0m = AbstractC167007dF.A0m(A04, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        ArrayList A0i = AbstractC167007dF.A0i(A0m);
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1S(AbstractC001900j.A0B(AbstractC166987dD.A1B(it)), A0i);
        }
        if (z) {
            ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
            Iterator it2 = A0i.iterator();
            while (it2.hasNext()) {
                A0i2.add(AbstractC167007dF.A0f(this.A00, it2.next(), 2131958713));
            }
            A0i = A0i2;
        }
        return C0eM.A1H(A0i);
    }

    public C47748L6s(Context context, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        this.A00 = context;
        this.A01 = userSession;
    }
}
