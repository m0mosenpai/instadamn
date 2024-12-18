package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V8m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68060V8m extends C17T implements XGD {
    @Override // X.XGD
    public final XG4 Aet() {
        return (XG4) A05(-1332194002, C68057V8j.class);
    }

    @Override // X.XGD
    public final List BTT() {
        return A08(-1941674320, C68062V8q.class);
    }

    @Override // X.XGD
    public final InterfaceC72036XFy C7x() {
        return (InterfaceC72036XFy) A05(1330532588, V8r.class);
    }

    @Override // X.XGD
    public final XGA C8l() {
        return (XGA) A05(110371416, C68062V8q.class);
    }

    @Override // X.XGD
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC68374VOi.A00(this), this);
    }

    @Override // X.XGD
    public final String BtP() {
        return A0i(189658505);
    }

    @Override // X.XGD
    public final UR7 Ex8() {
        UR4 ur4;
        ArrayList arrayList;
        URC urc;
        XG4 Aet = Aet();
        URB urb = null;
        if (Aet != null) {
            ur4 = Aet.Ex6();
        } else {
            ur4 = null;
        }
        String A0T = A0T();
        List BTT = BTT();
        if (BTT != null) {
            arrayList = AbstractC167017dG.A0q(BTT);
            Iterator it = BTT.iterator();
            while (it.hasNext()) {
                arrayList.add(((XGA) it.next()).ExD());
            }
        } else {
            arrayList = null;
        }
        String A0i = A0i(189658505);
        String A0i2 = A0i(-2115337775);
        InterfaceC72036XFy C7x = C7x();
        if (C7x != null) {
            urc = C7x.ExE();
        } else {
            urc = null;
        }
        XGA C8l = C8l();
        if (C8l != null) {
            urb = C8l.ExD();
        }
        return new UR7(ur4, urb, urc, A0T, A0i, A0i2, arrayList);
    }

    @Override // X.XGD
    public final String getDescription() {
        return A0T();
    }

    @Override // X.XGD
    public final String getTextColor() {
        return A0i(-2115337775);
    }
}
