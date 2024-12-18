package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HSO extends C17T implements InterfaceC38731r5 {
    public List A00;

    @Override // X.InterfaceC38731r5
    public final List CAz() {
        List list = this.A00;
        if (list == null) {
            return A08(-16393611, C39280HUb.class);
        }
        return list;
    }

    @Override // X.InterfaceC38731r5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40195HsF.A00(this));
    }

    @Override // X.InterfaceC38731r5
    public final String AYe() {
        return A0i(1583739286);
    }

    @Override // X.InterfaceC38731r5
    public final String AvB() {
        return A0i(-1349119146);
    }

    @Override // X.InterfaceC38731r5
    public final Long BF7() {
        return AbstractC37303Gc4.A0P(this);
    }

    @Override // X.InterfaceC38731r5
    public final String BWb() {
        return A0i(-1594628439);
    }

    @Override // X.InterfaceC38731r5
    public final String BWe() {
        return A0i(-1852539703);
    }

    @Override // X.InterfaceC38731r5
    public final String CAR() {
        return AbstractC37304Gc5.A0f(this);
    }

    @Override // X.InterfaceC38731r5
    public final Long CBm() {
        return A0L(3575610);
    }

    @Override // X.InterfaceC38731r5
    public final Boolean CdK() {
        return getOptionalBooleanValueByHashCode(-722325276);
    }

    @Override // X.InterfaceC38731r5
    public final Boolean Cf0() {
        return getOptionalBooleanValueByHashCode(-1947593954);
    }

    @Override // X.InterfaceC38731r5
    public final InterfaceC38731r5 E9i(C1DY c1dy) {
        ArrayList arrayList;
        List<JMD> CAz = CAz();
        if (CAz != null) {
            arrayList = AbstractC167017dG.A0q(CAz);
            for (JMD jmd : CAz) {
                jmd.EAq(c1dy);
                arrayList.add(jmd);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.InterfaceC38731r5
    public final C38721r4 Eym(C1DY c1dy) {
        ArrayList arrayList;
        String A0i = A0i(1583739286);
        String A0i2 = A0i(-1349119146);
        Long A0P = AbstractC37303Gc4.A0P(this);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-722325276);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1947593954);
        String A0i3 = A0i(-1594628439);
        String A0i4 = A0i(-1852539703);
        String A0f = AbstractC37304Gc5.A0f(this);
        List CAz = CAz();
        if (CAz != null) {
            arrayList = AbstractC167017dG.A0q(CAz);
            Iterator it = CAz.iterator();
            while (it.hasNext()) {
                arrayList.add(((JMD) it.next()).F2I(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new C38721r4(optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, A0P, A0L(3575610), A0i, A0i2, A0i3, A0i4, A0f, arrayList);
    }
}
