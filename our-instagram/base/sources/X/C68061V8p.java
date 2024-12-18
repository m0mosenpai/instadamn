package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V8p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68061V8p extends C17T implements XG5 {
    @Override // X.XG5
    public final InterfaceC72032XFu Abr() {
        return (InterfaceC72032XFu) A05(1118509956, V8o.class);
    }

    @Override // X.XG5
    public final XG4 Aet() {
        return (XG4) A05(-1332194002, C68057V8j.class);
    }

    @Override // X.XG5
    public final InterfaceC72031XFt AfD() {
        return (InterfaceC72031XFt) A05(93494179, C68056V8i.class);
    }

    @Override // X.XG5
    public final List Bd0() {
        return A08(-989034367, V8n.class);
    }

    @Override // X.XG5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC68379VOn.A00(this), this);
    }

    @Override // X.XG5
    public final URA ExA() {
        UR9 ur9;
        UR4 ur4;
        UR3 ur3;
        InterfaceC72032XFu Abr = Abr();
        ArrayList arrayList = null;
        if (Abr != null) {
            ur9 = Abr.Ex9();
        } else {
            ur9 = null;
        }
        XG4 Aet = Aet();
        if (Aet != null) {
            ur4 = Aet.Ex6();
        } else {
            ur4 = null;
        }
        InterfaceC72031XFt AfD = AfD();
        if (AfD != null) {
            ur3 = AfD.Ex4();
        } else {
            ur3 = null;
        }
        List Bd0 = Bd0();
        if (Bd0 != null) {
            arrayList = AbstractC167017dG.A0q(Bd0);
            Iterator it = Bd0.iterator();
            while (it.hasNext()) {
                arrayList.add(((XGC) it.next()).ExB());
            }
        }
        return new URA(ur3, ur4, ur9, arrayList);
    }
}
