package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N8q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52201N8q extends C2US implements InterfaceC65242xM {
    public boolean A00;
    public boolean A01;
    public final EQR A02;
    public final List A03 = AbstractC166987dD.A1E();
    public final List A04 = AbstractC166987dD.A1E();
    public final ERA A05;
    public final EQR A06;
    public final EQR A07;

    public final void A01(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC43594JPz.A1Q(it.next(), this.A03);
        }
        A00(this);
    }

    public final void A02(boolean z) {
        if (z != this.A00 && this.A06 != null) {
            this.A00 = z;
            if (z) {
                this.A01 = false;
            }
            A00(this);
        }
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.EQR] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.EQR] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.EQR] */
    public C52201N8q(N5Z n5z, GYX gyx, GYX gyx2, GYX gyx3, boolean z) {
        EQR eqr;
        EQR eqr2;
        EQR eqr3;
        ERA era = new ERA(n5z, z);
        this.A05 = era;
        ArrayList A0z = AbstractC31174DnI.A0z(era);
        if (gyx != null) {
            ?? obj = new Object();
            obj.A00 = gyx;
            A0z.add(obj);
            eqr = obj;
        } else {
            eqr = null;
        }
        this.A07 = eqr;
        if (gyx2 != null) {
            ?? obj2 = new Object();
            obj2.A00 = gyx2;
            A0z.add(obj2);
            eqr2 = obj2;
        } else {
            eqr2 = null;
        }
        this.A02 = eqr2;
        if (gyx3 != null) {
            ?? obj3 = new Object();
            obj3.A00 = gyx3;
            A0z.add(obj3);
            eqr3 = obj3;
        } else {
            eqr3 = null;
        }
        this.A06 = eqr3;
        init(A0z);
        A00(this);
    }

    public static final void A00(C52201N8q c52201N8q) {
        c52201N8q.clear();
        EQR eqr = c52201N8q.A07;
        if (eqr != null) {
            c52201N8q.addModel(null, eqr);
        }
        EQR eqr2 = c52201N8q.A02;
        if (eqr2 != null && c52201N8q.A01) {
            c52201N8q.addModel(null, eqr2);
        }
        EQR eqr3 = c52201N8q.A06;
        if (eqr3 != null && c52201N8q.A00) {
            c52201N8q.addModel(null, eqr3);
        }
        Iterator it = c52201N8q.A03.iterator();
        while (it.hasNext()) {
            c52201N8q.addModel(it.next(), c52201N8q.A05);
        }
        Iterator it2 = c52201N8q.A04.iterator();
        while (it2.hasNext()) {
            c52201N8q.addModel(it2.next(), c52201N8q.A05);
        }
        c52201N8q.updateListView();
    }
}
