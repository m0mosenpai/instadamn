package X;

import java.util.Comparator;

/* renamed from: X.Goy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38069Goy implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C38063Gor c38063Gor = (C38063Gor) obj;
        C38063Gor c38063Gor2 = (C38063Gor) obj2;
        Long l = c38063Gor.A02;
        Long l2 = c38063Gor2.A02;
        if (l.equals(l2)) {
            l2 = c38063Gor2.A01;
            l = c38063Gor.A01;
        }
        return l2.compareTo(l);
    }
}
