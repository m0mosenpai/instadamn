package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.SWx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62916SWx {
    public final SJ4 A00;
    public final C62988SaC A01;
    public final Class A02;
    public final Map A03;
    public final List A04;

    public C62916SWx(SJ4 entries, C62988SaC entriesInKeysetOrder, Class primary, List annotations, Map primitiveClass) {
        this.A03 = primitiveClass;
        this.A04 = annotations;
        this.A00 = entries;
        this.A02 = primary;
        this.A01 = entriesInKeysetOrder;
    }

    public static void A00(SJ4 entry, List entries, Map entriesInKeysetOrder) {
        ArrayList A0z = AbstractC31174DnI.A0z(entry);
        C58526Pwu c58526Pwu = entry.A03;
        Collection collection = (Collection) entriesInKeysetOrder.put(c58526Pwu, Collections.unmodifiableList(A0z));
        if (collection != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.addAll(collection);
            A1E.add(entry);
            entriesInKeysetOrder.put(c58526Pwu, Collections.unmodifiableList(A1E));
        }
        entries.add(entry);
    }
}
