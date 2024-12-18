package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class CSM {
    public int A00;
    public int A01;
    public final List A02;
    public final List[] A03;
    public final /* synthetic */ C25277BGr A04;

    public CSM(C25277BGr c25277BGr, List list) {
        this.A04 = c25277BGr;
        this.A02 = list;
        this.A03 = new List[list.size()];
        if (AbstractC166987dD.A1b(list)) {
        } else {
            throw AbstractC166987dD.A12("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
