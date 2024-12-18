package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.EPk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32409EPk extends C7E1 {
    public final List A00 = AbstractC166987dD.A1E();
    public final ERL A01;

    public final void A0C(String str, boolean z) {
        for (FJW fjw : this.A00) {
            if (C14360o3.A0K(fjw.A01.getId(), str)) {
                fjw.A00 = z;
            }
        }
        A00(this);
    }

    public C32409EPk(InterfaceC11380iw interfaceC11380iw, C31721DwQ c31721DwQ) {
        ERL erl = new ERL(interfaceC11380iw, c31721DwQ);
        this.A01 = erl;
        A0B(erl);
    }

    public static final void A00(C32409EPk c32409EPk) {
        c32409EPk.A06();
        Iterator it = c32409EPk.A00.iterator();
        while (it.hasNext()) {
            c32409EPk.A08(c32409EPk.A01, it.next());
        }
        c32409EPk.A07();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        A00(this);
    }
}
