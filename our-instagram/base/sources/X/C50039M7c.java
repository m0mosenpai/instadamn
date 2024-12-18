package X;

import java.util.Comparator;

/* renamed from: X.M7c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50039M7c implements Comparator {
    public static final C50039M7c A00 = new C50039M7c();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        L31 l31 = (L31) obj;
        L31 l312 = (L31) obj2;
        float f = l31.A00;
        float f2 = l312.A00;
        if (f > f2) {
            return -1;
        }
        if (f < f2) {
            return 1;
        }
        int i = l312.A02;
        int i2 = l31.A02;
        int i3 = i - i2;
        Integer valueOf = Integer.valueOf(i3);
        if (i2 != i && valueOf != null) {
            return i3;
        }
        return l31.A01 - l312.A01;
    }
}
