package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWF extends C17T implements InterfaceC38551qj {
    @Override // X.InterfaceC38551qj
    public final JLF BMt() {
        return (JLF) A05(972484720, HWG.class);
    }

    @Override // X.InterfaceC38551qj
    public final List Bjh() {
        return A08(-1782234803, HWH.class);
    }

    @Override // X.InterfaceC38551qj
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I2V.A00(this));
    }

    @Override // X.InterfaceC38551qj
    public final String AZE() {
        return A0i(92655287);
    }

    @Override // X.InterfaceC38551qj
    public final String BgS() {
        return A0i(-1047805541);
    }

    @Override // X.InterfaceC38551qj
    public final Boolean Bwi() {
        return getOptionalBooleanValueByHashCode(451991893);
    }

    @Override // X.InterfaceC38551qj
    public final Boolean Bwo() {
        return getOptionalBooleanValueByHashCode(-1755811660);
    }

    @Override // X.InterfaceC38551qj
    public final String C4U() {
        return A0h(1917932576);
    }

    @Override // X.InterfaceC38551qj
    public final String C4V() {
        return A0h(592587007);
    }

    @Override // X.InterfaceC38551qj
    public final String CAR() {
        return AbstractC37304Gc5.A0f(this);
    }

    @Override // X.InterfaceC38551qj
    public final Boolean CSW() {
        return getOptionalBooleanValueByHashCode(2081772504);
    }

    @Override // X.InterfaceC38551qj
    public final C38541qi F5I() {
        H7Y h7y;
        String A0i = A0i(92655287);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(2081772504);
        JLF BMt = BMt();
        ArrayList arrayList = null;
        if (BMt != null) {
            h7y = BMt.F5J();
        } else {
            h7y = null;
        }
        String A0i2 = A0i(-1047805541);
        List Bjh = Bjh();
        if (Bjh != null) {
            arrayList = AbstractC167017dG.A0q(Bjh);
            Iterator it = Bjh.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43565JLz) it.next()).F5K());
            }
        }
        return new C38541qi(h7y, optionalBooleanValueByHashCode, getOptionalBooleanValueByHashCode(451991893), getOptionalBooleanValueByHashCode(-1755811660), A0i, A0i2, A0h(1917932576), A0h(592587007), AbstractC37304Gc5.A0f(this), arrayList);
    }
}
