package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class OTO {
    public final String A00;
    public final boolean A01;

    public OTO(String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        OTO oto = (OTO) it.next();
        C2JO c2jo = new C2JO();
        c2jo.A09("FB", "destination_app");
        c2jo.A09("EVERYONE", "destination_audience");
        String str = oto.A00;
        c2jo.A09(str, "destination_surface");
        c2jo.A09(str, AbstractC111324zv.A00(528));
        C2JO c2jo2 = new C2JO();
        c2jo2.A06(c2jo, "app_surface");
        c2jo2.A08("crosspost_setting", Boolean.valueOf(oto.A01));
        abstractCollection.add(c2jo2);
    }
}
