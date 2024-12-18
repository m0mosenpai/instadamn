package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N8g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52191N8g extends C7E1 {
    public List A00;
    public List A01;
    public final Context A02;
    public final N92 A03;
    public final C52207N8w A04;
    public final C51133Mic A05;
    public final C32444EQw A06;
    public final C32444EQw A07;

    public C52191N8g(Context context, N7U n7u, InterfaceC58161PqQ interfaceC58161PqQ) {
        this.A02 = context;
        C32444EQw c32444EQw = new C32444EQw(context);
        this.A07 = c32444EQw;
        C52207N8w c52207N8w = new C52207N8w(context);
        this.A04 = c52207N8w;
        C32444EQw c32444EQw2 = new C32444EQw(context);
        this.A06 = c32444EQw2;
        N92 n92 = new N92(context, n7u);
        this.A03 = n92;
        this.A05 = new C51133Mic(context, interfaceC58161PqQ);
        A0B(c32444EQw, c52207N8w, c32444EQw2, n92);
    }

    public final void A0C(N31 n31) {
        int i;
        A06();
        List list = n31.A01;
        this.A01 = list;
        this.A00 = n31.A00;
        if (!list.isEmpty()) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((OUX) it.next()).A0B = true;
            }
            A08(this.A07, this.A02.getString(2131965741));
            C51133Mic c51133Mic = this.A05;
            c51133Mic.A00 = this.A01;
            A08(this.A04, c51133Mic);
        }
        if (!this.A00.isEmpty()) {
            Iterator it2 = this.A00.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else {
                    ((OUX) it2.next()).A0B = false;
                }
            }
            A08(this.A06, this.A02.getString(2131965735));
            for (i = 0; i < this.A00.size(); i++) {
                OUX oux = (OUX) this.A00.get(i);
                oux.A02 = i;
                A08(this.A03, oux);
            }
        }
        A07();
    }
}
