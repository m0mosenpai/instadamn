package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HQh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39230HQh extends C17T implements JMI {
    @Override // X.JMI
    public final List CAd() {
        return A08(-405853034, C39232HQj.class);
    }

    @Override // X.JMI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40038HpP.A00(this));
    }

    @Override // X.JMI
    public final String B1I() {
        return A0i(-1226012370);
    }

    @Override // X.JMI
    public final String BZl() {
        return A0i(-740105691);
    }

    @Override // X.JMI
    public final String C0h() {
        return A0i(1462626351);
    }

    @Override // X.JMI
    public final H41 Evn() {
        ArrayList arrayList;
        String A0n = AbstractC37301Gc2.A0n(this);
        String A0i = A0i(-1226012370);
        String A0e = A0e();
        String A0i2 = A0i(-740105691);
        String A0i3 = A0i(1462626351);
        String A0l = AbstractC37301Gc2.A0l(this);
        List CAd = CAd();
        if (CAd != null) {
            arrayList = AbstractC167017dG.A0q(CAd);
            Iterator it = CAd.iterator();
            while (it.hasNext()) {
                arrayList.add(((JKN) it.next()).Evq());
            }
        } else {
            arrayList = null;
        }
        return new H41(A0n, A0i, A0e, A0i2, A0i3, A0l, arrayList);
    }

    @Override // X.JMI
    public final String getBackgroundColor() {
        return AbstractC37301Gc2.A0n(this);
    }

    @Override // X.JMI
    public final String getId() {
        return A0e();
    }

    @Override // X.JMI
    public final String getTextColor() {
        return AbstractC37301Gc2.A0l(this);
    }
}
