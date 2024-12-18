package X;

import com.google.common.collect.ImmutableList;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HDn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38961HDn extends C124275jh {
    public List A00 = C16930sl.A00;

    @Override // X.C124275jh, X.InterfaceC124295jj
    public final List AoP() {
        List unmodifiableList = Collections.unmodifiableList(this.A00);
        ArrayList A10 = AbstractC31174DnI.A10(unmodifiableList);
        Iterator it = unmodifiableList.iterator();
        while (it.hasNext()) {
            A10.add(((C38252Grv) it.next()).A01());
        }
        ImmutableList A0L = AbstractC31173DnH.A0L(A10);
        ArrayList A0q = AbstractC167017dG.A0q(A0L);
        Iterator<E> it2 = A0L.iterator();
        while (it2.hasNext()) {
            A0q.add(C128085qc.A03((C40971v4) it2.next()));
        }
        return AbstractC31172DnG.A19(A0q);
    }

    @Override // X.C124275jh, X.InterfaceC124295jj
    public final InterfaceC111084zP BbA() {
        C125905mf A00 = InterfaceC111084zP.A00.A00(true);
        A00.A00 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        return A00.A00();
    }

    @Override // X.C124275jh, X.InterfaceC74303Vl
    public final boolean CQG() {
        return true;
    }

    @Override // X.C124275jh, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
    }

    public final void A01() {
        super.A00();
    }
}
