package X;

import java.util.Comparator;

/* renamed from: X.5az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119425az implements Comparator {
    public static final C119425az A00 = new Object();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass599 anonymousClass599 = (AnonymousClass599) obj;
        AnonymousClass599 anonymousClass5992 = (AnonymousClass599) obj2;
        int A002 = C14360o3.A00(anonymousClass5992.A00, anonymousClass599.A00);
        if (A002 == 0) {
            return C14360o3.A00(anonymousClass599.hashCode(), anonymousClass5992.hashCode());
        }
        return A002;
    }
}
