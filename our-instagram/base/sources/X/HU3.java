package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HU3 extends C17T implements InterfaceC43574JMi {
    @Override // X.InterfaceC43574JMi
    public final List BZN() {
        return A08(-1249474914, HU6.class);
    }

    @Override // X.InterfaceC43574JMi
    public final List C5D() {
        return A08(-1543665910, HU6.class);
    }

    @Override // X.InterfaceC43574JMi
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40312HuH.A00(this));
    }

    @Override // X.InterfaceC43574JMi
    public final Integer Arx() {
        return getOptionalIntValueByHashCode(-1791284941);
    }

    @Override // X.InterfaceC43574JMi
    public final String AwK() {
        return A0i(2068129058);
    }

    @Override // X.InterfaceC43574JMi
    public final Boolean B6X() {
        return getOptionalBooleanValueByHashCode(-673660814);
    }

    @Override // X.InterfaceC43574JMi
    public final String Bjo() {
        return A0j(659010373);
    }

    @Override // X.InterfaceC43574JMi
    public final Integer CFy() {
        return getOptionalIntValueByHashCode(1931473547);
    }

    @Override // X.InterfaceC43574JMi
    public final Boolean CG0() {
        return getOptionalBooleanValueByHashCode(-2100963494);
    }

    @Override // X.InterfaceC43574JMi
    public final URM F1U() {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1791284941);
        String A0i = A0i(2068129058);
        String A0i2 = A0i(-209971210);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-673660814);
        String A0e = A0e();
        List BZN = BZN();
        ArrayList arrayList2 = null;
        if (BZN != null) {
            arrayList = AbstractC167007dF.A0i(BZN);
            Iterator it = BZN.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43540JLa) it.next()).F1Z());
            }
        } else {
            arrayList = null;
        }
        String A0i3 = A0i(-1165870106);
        String A0j = A0j(659010373);
        String A0i4 = A0i(-132220081);
        List C5D = C5D();
        if (C5D != null) {
            arrayList2 = AbstractC167007dF.A0i(C5D);
            Iterator it2 = C5D.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InterfaceC43540JLa) it2.next()).F1Z());
            }
        }
        return new URM(optionalBooleanValueByHashCode, getOptionalBooleanValueByHashCode(-2100963494), optionalIntValueByHashCode, getOptionalIntValueByHashCode(1931473547), A0i, A0i2, A0e, A0i3, A0j, A0i4, AbstractC37301Gc2.A0l(this), arrayList, arrayList2);
    }

    @Override // X.InterfaceC43574JMi
    public final String getEndBackgroundColor() {
        return A0i(-209971210);
    }

    @Override // X.InterfaceC43574JMi
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC43574JMi
    public final String getQuestion() {
        return A0i(-1165870106);
    }

    @Override // X.InterfaceC43574JMi
    public final String getStartBackgroundColor() {
        return A0i(-132220081);
    }

    @Override // X.InterfaceC43574JMi
    public final String getTextColor() {
        return AbstractC37301Gc2.A0l(this);
    }
}
