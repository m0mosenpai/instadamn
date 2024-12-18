package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Two, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65943Two extends C2JS implements C2JT {
    public final C37981GnO A0E(C1DV c1dv) {
        ArrayList arrayList;
        C37981GnO c37981GnO = (C37981GnO) reinterpret(C37981GnO.class);
        C1DY c1dy = new C1DY(c1dv, (java.util.Set) new HashSet(), false);
        List<InterfaceC111044zG> AoL = c37981GnO.AoL();
        ArrayList arrayList2 = null;
        if (AoL != null) {
            arrayList = AbstractC167007dF.A0i(AoL);
            for (InterfaceC111044zG interfaceC111044zG : AoL) {
                interfaceC111044zG.E8p(c1dy);
                arrayList.add(interfaceC111044zG);
            }
        } else {
            arrayList = null;
        }
        c37981GnO.A00 = arrayList;
        List<InterfaceC111044zG> items = c37981GnO.getItems();
        ArrayList A0i = AbstractC167007dF.A0i(items);
        for (InterfaceC111044zG interfaceC111044zG2 : items) {
            interfaceC111044zG2.E8p(c1dy);
            A0i.add(interfaceC111044zG2);
        }
        c37981GnO.A01 = A0i;
        List<InterfaceC43554JLo> BKG = c37981GnO.BKG();
        if (BKG != null) {
            arrayList2 = AbstractC167007dF.A0i(BKG);
            for (InterfaceC43554JLo interfaceC43554JLo : BKG) {
                interfaceC43554JLo.E8q(c1dy);
                arrayList2.add(interfaceC43554JLo);
            }
        }
        c37981GnO.A02 = arrayList2;
        return c37981GnO;
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC58320PtC.A0U(C95124Py.A00, new C4OW(C94754Oe.A00, "first_seen_media_id"), new C4OK(C4OO.A02(), C65944Twp.class, DialogModule.KEY_ITEMS, -148814760), new C65928TwZ(new C126315nS(C58596PyO.class, "ClipsProfilePagingInfo", 936321853), "ClipsProfilePagingInfo", "use_stream"), "is_defer_fulfilled(fragment_name:\"ClipsProfilePagingInfo\")");
    }

    public C65943Two(int i) {
        super(i);
    }

    public C65943Two() {
        super(-2107973840);
    }
}
