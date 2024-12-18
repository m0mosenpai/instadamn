package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.7Os, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162307Os extends AbstractC60592pi {
    public View A00;
    public ViewGroup A01;
    public AbstractC46442Kh2 A02;
    public AbstractC46524KiP A03;
    public C43689JTy A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC50493MQv A0B;
    public final java.util.Set A0C = new LinkedHashSet();
    public final AbstractRunnableC14200nk A0D = new C43681JTq(this);
    public final InterfaceC37159GYw A0A = new C43683JTs(this);
    public final InterfaceC50428MOi A09 = new C48773Lhg(this);

    public static final void A00(C162307Os c162307Os) {
        c162307Os.A03 = null;
        java.util.Set set = c162307Os.A0C;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((AbstractC46524KiP) it.next()).A02();
        }
        set.clear();
        c162307Os.A06 = false;
        ViewGroup viewGroup = c162307Os.A01;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(8);
        }
    }

    public static final void A01(C162307Os c162307Os) {
        if (c162307Os.A02 != null && c162307Os.A01 != null) {
            C14120nc.A00().ATO(c162307Os.A0D);
        }
    }

    public static final void A02(C162307Os c162307Os, AbstractC46524KiP abstractC46524KiP, boolean z) {
        Context context;
        ViewGroup viewGroup = c162307Os.A01;
        if (viewGroup != null) {
            if (c162307Os.A07) {
                context = new C52182aJ(viewGroup.getContext(), R.style.DirectShhMode);
            } else {
                context = viewGroup.getContext();
            }
            C14360o3.A0A(context);
            View A06 = abstractC46524KiP.A06(context);
            viewGroup.removeAllViews();
            viewGroup.addView(A06);
            viewGroup.setVisibility(0);
            abstractC46524KiP.A04(z);
            abstractC46524KiP.A00 = new C48774Lhh(c162307Os);
            c162307Os.A03 = abstractC46524KiP;
            c162307Os.A0C.add(abstractC46524KiP);
        }
    }

    public final void A03(View view) {
        if (!C14360o3.A0K(this.A00, view)) {
            this.A00 = view;
            this.A0B.reset();
            A00(this);
            A01(this);
        }
    }

    public final void A04(AbstractC46442Kh2 abstractC46442Kh2) {
        C48775Lhi c48775Lhi;
        this.A02 = abstractC46442Kh2;
        Boolean bool = null;
        boolean z = true;
        if (abstractC46442Kh2 instanceof KRA) {
            InterfaceC50493MQv interfaceC50493MQv = this.A0B;
            if ((interfaceC50493MQv instanceof C48775Lhi) && (c48775Lhi = (C48775Lhi) interfaceC50493MQv) != null) {
                InterfaceC50507MRk interfaceC50507MRk = ((KRA) abstractC46442Kh2).A00;
                C14360o3.A0B(interfaceC50507MRk, 0);
                InterfaceC50507MRk interfaceC50507MRk2 = c48775Lhi.A00;
                if (interfaceC50507MRk2 != null) {
                    C45304K3h c45304K3h = ((C49200LpH) interfaceC50507MRk2).A00;
                    int count = c45304K3h.mResultSet.getCount();
                    C45304K3h c45304K3h2 = ((C49200LpH) interfaceC50507MRk).A00;
                    if (c45304K3h2.mResultSet.getCount() == count) {
                        Iterable A0C = C17s.A0C(0, count);
                        if (!(A0C instanceof Collection) || !((Collection) A0C).isEmpty()) {
                            Iterator it = A0C.iterator();
                            while (it.hasNext()) {
                                int A00 = ((AbstractC16880sg) it).A00();
                                if (c45304K3h.mResultSet.getLong(A00, 0) == c45304K3h2.mResultSet.getLong(A00, 0)) {
                                }
                            }
                        }
                        z = false;
                        bool = Boolean.valueOf(z);
                    }
                }
                c48775Lhi.A00 = interfaceC50507MRk;
                bool = Boolean.valueOf(z);
            }
        } else {
            bool = true;
        }
        if (C14360o3.A0K(bool, true)) {
            this.A0B.reset();
            A00(this);
            A01(this);
        }
    }

    public final void A05(boolean z, String str) {
        ViewGroup viewGroup;
        AbstractC46524KiP abstractC46524KiP;
        if (this.A03 != null && (viewGroup = this.A01) != null && viewGroup.getVisibility() == 0 && (abstractC46524KiP = this.A03) != null && abstractC46524KiP.A05()) {
            return;
        }
        this.A0B.reset();
        A00(this);
        this.A06 = z;
        this.A05 = str;
        A01(this);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            ((AbstractC46524KiP) it.next()).A02();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        if (!this.A08) {
            this.A0B.E5G();
            this.A08 = true;
        }
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            ((AbstractC46524KiP) it.next()).A03();
        }
    }

    public C162307Os(ViewGroup viewGroup, InterfaceC50493MQv interfaceC50493MQv, boolean z) {
        this.A0B = interfaceC50493MQv;
        this.A01 = viewGroup;
        this.A07 = z;
    }
}
