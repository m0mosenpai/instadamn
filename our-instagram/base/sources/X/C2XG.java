package X;

import android.content.res.Configuration;

/* renamed from: X.2XG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XG extends C2XF {
    public final C75693aa A00;

    @Override // X.C2XF
    public final void A00(int i, Object obj) {
        C14360o3.A0B(obj, 1);
        A05(Integer.valueOf(i), obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3aa] */
    public C2XG(Configuration configuration) {
        super(configuration);
        this.A00 = new C003701c() { // from class: X.3aa
            @Override // X.C003701c
            public final /* bridge */ /* synthetic */ int A01(Object obj, Object obj2) {
                ((Number) obj).intValue();
                C14360o3.A0B(obj2, 1);
                if (obj2 instanceof String) {
                    return ((String) obj2).length();
                }
                return 1;
            }
        };
    }
}
