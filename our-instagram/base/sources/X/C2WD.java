package X;

import android.view.View;
import java.util.List;

/* renamed from: X.2WD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2WD implements InterfaceC220315d {
    public final InterfaceC09390do A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    @Override // X.InterfaceC220315d
    public final void F8d(C1KJ c1kj) {
        C14360o3.A0B(c1kj, 0);
        if ((this.A01 & (1 << c1kj.ordinal())) != 0) {
            ((C005001p) this.A00.getValue()).clear();
        }
    }

    public final int A00(int i) {
        List list = (List) ((C005001p) this.A00.getValue()).get(Integer.valueOf(i));
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final View A01(int i) {
        if (this.A02) {
            try {
                List list = (List) ((C005001p) this.A00.getValue()).get(Integer.valueOf(i));
                if (list == null) {
                    return null;
                }
                return (View) AnonymousClass016.A15(list);
            } catch (Exception unused) {
                return null;
            }
        }
        List list2 = (List) ((C005001p) this.A00.getValue()).get(Integer.valueOf(i));
        if (list2 == null) {
            return null;
        }
        return (View) AnonymousClass016.A15(list2);
    }

    public final void A02(View view, int i) {
        InterfaceC09390do interfaceC09390do = this.A00;
        C005001p c005001p = (C005001p) interfaceC09390do.getValue();
        Integer valueOf = Integer.valueOf(i);
        if (c005001p.get(valueOf) == null) {
            ((C005001p) interfaceC09390do.getValue()).put(valueOf, AbstractC16960so.A1N(view));
            return;
        }
        boolean z = this.A03;
        List list = (List) ((C005001p) interfaceC09390do.getValue()).get(valueOf);
        if (z) {
            if (list == null) {
                return;
            }
            list.add(0, view);
        } else {
            if (list == null) {
                return;
            }
            list.add(view);
        }
    }

    public C2WD(int i, boolean z, boolean z2) {
        this.A01 = i;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C2WJ.A00);
        if (i != 0) {
            AbstractC25061Kk.A00().EDS(this);
        }
    }

    public C2WD() {
        this(0, false, false);
    }
}
