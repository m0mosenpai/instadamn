package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HVE extends C17T implements InterfaceC43568JMc {
    @Override // X.InterfaceC43568JMc
    public final List CAe() {
        return A08(-1161569546, HVG.class);
    }

    @Override // X.InterfaceC43568JMc
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40412Hvz.A00(this));
    }

    @Override // X.InterfaceC43568JMc
    public final String B1I() {
        return A0i(-1226012370);
    }

    @Override // X.InterfaceC43568JMc
    public final Float B7g() {
        return A0K(-1539906063);
    }

    @Override // X.InterfaceC43568JMc
    public final String C5z() {
        return A0i(-1783100079);
    }

    @Override // X.InterfaceC43568JMc
    public final String C6J() {
        return A0i(-1064897719);
    }

    @Override // X.InterfaceC43568JMc
    public final Boolean CPu() {
        return getOptionalBooleanValueByHashCode(-1530233576);
    }

    @Override // X.InterfaceC43568JMc
    public final Boolean CV0() {
        return getOptionalBooleanValueByHashCode(-1144381605);
    }

    @Override // X.InterfaceC43568JMc
    public final C38798H6n F3F() {
        ArrayList arrayList;
        String A0i = A0i(-1226012370);
        Float A0K = A0K(-1539906063);
        String A0e = A0e();
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1530233576);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1144381605);
        String A0X = A0X();
        String A0i2 = A0i(-1783100079);
        String A0l = AbstractC37301Gc2.A0l(this);
        String A0i3 = A0i(-1064897719);
        List CAe = CAe();
        if (CAe != null) {
            arrayList = AbstractC167017dG.A0q(CAe);
            Iterator it = CAe.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43519JKf) it.next()).F3I());
            }
        } else {
            arrayList = null;
        }
        return new C38798H6n(optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, A0K, A0i, A0e, A0X, A0i2, A0l, A0i3, arrayList);
    }

    @Override // X.InterfaceC43568JMc
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC43568JMc
    public final String getText() {
        return A0X();
    }

    @Override // X.InterfaceC43568JMc
    public final String getTextColor() {
        return AbstractC37301Gc2.A0l(this);
    }
}
