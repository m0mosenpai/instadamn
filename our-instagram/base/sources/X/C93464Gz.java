package X;

import java.util.Comparator;

/* renamed from: X.4Gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93464Gz implements Comparator {
    public static final C93464Gz A00 = new C93464Gz();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        if (C14360o3.A0K(obj, obj2)) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return C93404Gt.A01.compare(obj, obj2);
    }
}
