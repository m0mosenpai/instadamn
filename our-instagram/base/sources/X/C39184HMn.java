package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HMn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39184HMn extends C17T implements C5FS {
    @Override // X.C5FS
    public final List Bjh() {
        return A08(-1782234803, C39180HMi.class);
    }

    @Override // X.C5FS
    public final REPETITION_UI_TYPE Bme() {
        return (REPETITION_UI_TYPE) A0N(-1627767124, J90.A00);
    }

    @Override // X.C5FS
    public final InterfaceC106354qp CCS() {
        return (InterfaceC106354qp) A05(1220821741, C39179HMh.class);
    }

    @Override // X.C5FS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39736Hk6.A00(this));
    }

    @Override // X.C5FS
    public final String AyP() {
        return A0i(968815275);
    }

    @Override // X.C5FS
    public final String Bmy() {
        return A0i(1575858778);
    }

    @Override // X.C5FS
    public final H2C Eqi() {
        ArrayList arrayList;
        String A0i = A0i(968815275);
        List Bjh = Bjh();
        C106344qo c106344qo = null;
        if (Bjh != null) {
            arrayList = AbstractC167017dG.A0q(Bjh);
            Iterator it = Bjh.iterator();
            while (it.hasNext()) {
                AbstractC37302Gc3.A1Z(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        REPETITION_UI_TYPE Bme = Bme();
        String A0i2 = A0i(1575858778);
        InterfaceC106354qp CCS = CCS();
        if (CCS != null) {
            c106344qo = CCS.Eqd();
        }
        return new H2C(c106344qo, Bme, A0i, A0i2, arrayList);
    }
}
