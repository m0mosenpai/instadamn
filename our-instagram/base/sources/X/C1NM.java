package X;

import java.util.Comparator;

/* renamed from: X.1NM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NM implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j;
        C41181vS c41181vS = (C41181vS) obj;
        C41181vS c41181vS2 = (C41181vS) obj2;
        long j2 = Long.MAX_VALUE;
        if (c41181vS != null) {
            j = c41181vS.A03();
        } else {
            j = Long.MAX_VALUE;
        }
        if (c41181vS2 != null) {
            j2 = c41181vS2.A03();
        }
        return C14360o3.A01(j, j2);
    }
}
