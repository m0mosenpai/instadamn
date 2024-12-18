package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EPg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32405EPg extends C7E1 {
    public final Context A00;
    public final C31545DtV A01;
    public final List A02 = AbstractC166987dD.A1E();
    public final ER5 A03;

    public C32405EPg(Context context, ENK enk) {
        this.A00 = context;
        ER5 er5 = new ER5(context, enk);
        this.A03 = er5;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A01 = c31545DtV;
        A0B(er5, c31545DtV);
    }

    public static final void A00(C32405EPg c32405EPg) {
        c32405EPg.A06();
        Iterator it = c32405EPg.A02.iterator();
        while (it.hasNext()) {
            c32405EPg.A09(c32405EPg.A03, it.next(), null);
        }
        c32405EPg.A07();
    }
}
