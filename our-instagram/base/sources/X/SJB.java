package X;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SJB {
    public final Context A00;
    public final InterfaceC65390TjN A01;
    public final C49352Or A02;
    public final SF8 A03;
    public final Object A04;
    public final Map A05;
    public final Map A06;
    public final java.util.Set A07;

    public SJB(Context context, C49352Or c49352Or, SF8 sf8, Object obj, Map map, Map map2) {
        AbstractC25229BEm.A1I(sf8, 4, map2);
        this.A00 = context;
        this.A04 = obj;
        this.A05 = map;
        this.A03 = sf8;
        this.A02 = c49352Or;
        this.A06 = map2;
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        Iterator A12 = AbstractC43593JPy.A12(this.A05);
        while (A12.hasNext()) {
            A0l.add(AnonymousClass001.A0R("RSA::", AbstractC166987dD.A1B(A12)));
        }
        this.A07 = A0l;
        this.A01 = new T3Y(this);
    }
}
