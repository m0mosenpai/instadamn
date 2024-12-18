package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HXg extends C17T implements InterfaceC38021pm {
    @Override // X.InterfaceC38021pm
    public final List Ayp() {
        return A08(99612, HXe.class);
    }

    @Override // X.InterfaceC38021pm
    public final InterfaceC39571se BjE() {
        return (InterfaceC39571se) A05(-1201547431, HSR.class);
    }

    @Override // X.InterfaceC38021pm
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I9U.A00(this));
    }

    @Override // X.InterfaceC38021pm
    public final Integer AmV() {
        return getOptionalIntValueByHashCode(691009648);
    }

    @Override // X.InterfaceC38021pm
    public final Integer AqU() {
        return getOptionalIntValueByHashCode(1083575266);
    }

    @Override // X.InterfaceC38021pm
    public final Integer AqV() {
        return getOptionalIntValueByHashCode(-1015241329);
    }

    @Override // X.InterfaceC38021pm
    public final Integer BDy() {
        return getOptionalIntValueByHashCode(1189631779);
    }

    @Override // X.InterfaceC38021pm
    public final Integer BDz() {
        return getOptionalIntValueByHashCode(-1440277513);
    }

    @Override // X.InterfaceC38021pm
    public final Integer BQ0() {
        return getOptionalIntValueByHashCode(1558741194);
    }

    @Override // X.InterfaceC38021pm
    public final Integer BTp() {
        return getOptionalIntValueByHashCode(364593787);
    }

    @Override // X.InterfaceC38021pm
    public final Integer BTq() {
        return getOptionalIntValueByHashCode(491153610);
    }

    @Override // X.InterfaceC38021pm
    public final Integer BTt() {
        return getOptionalIntValueByHashCode(1800745576);
    }

    @Override // X.InterfaceC38021pm
    public final Integer BeS() {
        return getOptionalIntValueByHashCode(987198673);
    }

    @Override // X.InterfaceC38021pm
    public final Integer BlU() {
        return getOptionalIntValueByHashCode(826692981);
    }

    @Override // X.InterfaceC38021pm
    public final Integer BlV() {
        return getOptionalIntValueByHashCode(-386404958);
    }

    @Override // X.InterfaceC38021pm
    public final Integer Bsy() {
        return getOptionalIntValueByHashCode(-604529053);
    }

    @Override // X.InterfaceC38021pm
    public final Integer C5S() {
        return getOptionalIntValueByHashCode(1709232679);
    }

    @Override // X.InterfaceC38021pm
    public final Float C8P() {
        return A0K(776480260);
    }

    @Override // X.InterfaceC38021pm
    public final Boolean CY6() {
        return getOptionalBooleanValueByHashCode(-174861114);
    }

    @Override // X.InterfaceC38021pm
    public final C38011pl F7F() {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(691009648);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(1083575266);
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(-1015241329);
        List Ayp = Ayp();
        C39561sd c39561sd = null;
        if (Ayp != null) {
            arrayList = AbstractC167017dG.A0q(Ayp);
            Iterator it = Ayp.iterator();
            while (it.hasNext()) {
                arrayList.add(((JK6) it.next()).F7D());
            }
        } else {
            arrayList = null;
        }
        Integer optionalIntValueByHashCode4 = getOptionalIntValueByHashCode(1189631779);
        Integer optionalIntValueByHashCode5 = getOptionalIntValueByHashCode(-1440277513);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-174861114);
        Integer optionalIntValueByHashCode6 = getOptionalIntValueByHashCode(1558741194);
        Integer optionalIntValueByHashCode7 = getOptionalIntValueByHashCode(364593787);
        Integer optionalIntValueByHashCode8 = getOptionalIntValueByHashCode(491153610);
        Integer optionalIntValueByHashCode9 = getOptionalIntValueByHashCode(1800745576);
        Integer optionalIntValueByHashCode10 = getOptionalIntValueByHashCode(987198673);
        InterfaceC39571se BjE = BjE();
        if (BjE != null) {
            c39561sd = BjE.Eyq();
        }
        return new C38011pl(c39561sd, optionalBooleanValueByHashCode, A0K(776480260), optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, optionalIntValueByHashCode4, optionalIntValueByHashCode5, optionalIntValueByHashCode6, optionalIntValueByHashCode7, optionalIntValueByHashCode8, optionalIntValueByHashCode9, optionalIntValueByHashCode10, getOptionalIntValueByHashCode(826692981), getOptionalIntValueByHashCode(-386404958), getOptionalIntValueByHashCode(-604529053), getOptionalIntValueByHashCode(1709232679), arrayList);
    }
}
