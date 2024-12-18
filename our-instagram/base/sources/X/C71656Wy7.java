package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.Wy7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71656Wy7 implements Comparator {
    public static final C71656Wy7 A00 = new C71656Wy7();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((C69112Vi2) ((Map.Entry) obj2).getValue()).A01 - ((C69112Vi2) ((Map.Entry) obj).getValue()).A01;
    }
}
