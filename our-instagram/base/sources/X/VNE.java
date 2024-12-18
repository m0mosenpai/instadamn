package X;

import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class VNE {
    public static final void A00(TextView textView, C69753Vuo c69753Vuo) {
        C67528UnS c67528UnS;
        ImmutableList A0E;
        String A07;
        if (c69753Vuo != null) {
            InterfaceC72013XFb interfaceC72013XFb = c69753Vuo.A01;
            textView.setText(interfaceC72013XFb.C2i(AbstractC166997dE.A0L(textView)));
            WF7.A02(textView, c69753Vuo.A02);
            InterfaceC72024XFm interfaceC72024XFm = c69753Vuo.A00;
            if (interfaceC72024XFm != null) {
                interfaceC72024XFm.EPs(textView);
            }
            if ((interfaceC72013XFb instanceof WaZ) && (c67528UnS = ((WaZ) interfaceC72013XFb).A00) != null && (A0E = c67528UnS.A0E()) != null) {
                if ((A0E instanceof Collection) && A0E.isEmpty()) {
                    return;
                }
                Iterator<E> it = A0E.iterator();
                while (it.hasNext()) {
                    UZ0 A0E2 = ((C67527UnR) it.next()).A0E();
                    if (A0E2 != null && (A07 = A0E2.A07("url")) != null && A07.length() > 0) {
                        textView.setClickable(true);
                        AbstractC25227BEk.A11(textView);
                        return;
                    }
                }
            }
        }
    }
}
