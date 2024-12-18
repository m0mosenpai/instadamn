package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WaZ implements InterfaceC72013XFb {
    public final C67528UnS A00;
    public final InterfaceC65383TjG A01;

    @Override // X.InterfaceC72013XFb
    public final CharSequence C2i(Context context) {
        String A07;
        String A072;
        C67528UnS c67528UnS = this.A00;
        if (c67528UnS == null || (A07 = c67528UnS.A07("text")) == null || AbstractC001900j.A0T(A07)) {
            return null;
        }
        String A073 = c67528UnS.A07("text");
        if (A073 != null) {
            ImmutableList A0E = c67528UnS.A0E();
            if (A0E != null) {
                InterfaceC65383TjG interfaceC65383TjG = this.A01;
                ArrayList arrayList = new ArrayList();
                C1LC A0I = AbstractC43592JPx.A0I(A0E);
                while (A0I.hasNext()) {
                    C67527UnR c67527UnR = (C67527UnR) A0I.next();
                    if (c67527UnR.A0E() != null) {
                        UZ0 A0E2 = c67527UnR.A0E();
                        String str = null;
                        if (A0E2 != null && (A072 = A0E2.A07("url")) != null && !AbstractC001900j.A0T(A072)) {
                            int A00 = c67527UnR.A00("length");
                            int coercedIntField = c67527UnR.getCoercedIntField(1, "offset");
                            UZ0 A0E3 = c67527UnR.A0E();
                            if (A0E3 != null) {
                                str = A0E3.A07("url");
                            }
                            arrayList.add(new C62901SWh(A00, coercedIntField, str));
                        }
                    }
                }
                SLH A002 = AbstractC62201S1w.A00(A073, arrayList);
                C14360o3.A0B(interfaceC65383TjG, 0);
                return A002.A00(interfaceC65383TjG, false);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public WaZ(C67528UnS c67528UnS, InterfaceC65383TjG interfaceC65383TjG) {
        this.A00 = c67528UnS;
        this.A01 = interfaceC65383TjG;
    }
}
