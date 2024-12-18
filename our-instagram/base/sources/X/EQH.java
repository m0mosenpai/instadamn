package X;

import android.content.Context;
import android.widget.Filter;
import android.widget.Filterable;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EQH extends C2US implements InterfaceC65242xM, Filter.FilterListener, Filterable {
    public java.util.Set A00;
    public boolean A01;
    public C31772DxV A02;
    public final C34707FQs A03;
    public final List A04;
    public final java.util.Set A05;
    public final Context A06;
    public final EVT A07;
    public final ES1 A08;
    public final C31545DtV A09;
    public final ERQ A0A;
    public final C31699Dw4 A0B;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.FQs] */
    public EQH(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EVT evt, InterfaceC37224GaZ interfaceC37224GaZ, boolean z) {
        super(false);
        this.A06 = context;
        ERQ erq = new ERQ(context, null);
        this.A0A = erq;
        this.A03 = new Object();
        C31699Dw4 c31699Dw4 = new C31699Dw4();
        this.A0B = c31699Dw4;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A09 = c31545DtV;
        ES1 es1 = new ES1(context, interfaceC11380iw, userSession, interfaceC37224GaZ, z);
        this.A08 = es1;
        this.A04 = AbstractC166987dD.A1E();
        this.A05 = AbstractC166987dD.A1H();
        String string = context.getString(2131973064);
        int A02 = AbstractC31173DnH.A02(context);
        c31699Dw4.A01 = string;
        c31699Dw4.A00 = A02;
        this.A07 = evt;
        init(es1, c31545DtV, erq);
    }

    public final void A01(List list) {
        C14360o3.A0B(list, 0);
        List list2 = this.A04;
        list2.clear();
        java.util.Set set = this.A05;
        set.clear();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
            java.util.Set set2 = this.A00;
            if (set2 == null || !set2.contains(A0m.A09())) {
                if (!set.contains(A0m.A09())) {
                    set.add(AbstractC31173DnH.A0o(A0m));
                    A1E.add(A0m);
                }
            }
        }
        list2.addAll(A1E);
        A00();
    }

    @Override // X.InterfaceC65242xM
    public final Object getAdapter() {
        return this;
    }

    @Override // android.widget.Filter.FilterListener
    public final void onFilterComplete(int i) {
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        C31772DxV c31772DxV = this.A02;
        if (c31772DxV == null) {
            C31772DxV c31772DxV2 = new C31772DxV(this);
            this.A02 = c31772DxV2;
            return c31772DxV2;
        }
        return c31772DxV;
    }

    public final void A00() {
        clear();
        if (this.A01 && this.A04.isEmpty()) {
            addModel(this.A06.getString(2131968556), this.A09);
        } else {
            List list = this.A04;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                addModel(list.get(i), Integer.valueOf(i), this.A08);
            }
            C34707FQs c34707FQs = this.A03;
            if (c34707FQs.A00) {
                addModel(this.A0B, c34707FQs, this.A0A);
            }
        }
        updateListView();
        notifyDataSetChanged();
        EVT evt = this.A07;
        C35151Fet c35151Fet = evt.A00;
        if (c35151Fet != null) {
            c35151Fet.A02.DyP(AbstractC31172DnG.A19(evt.A08.A04));
        }
    }
}
