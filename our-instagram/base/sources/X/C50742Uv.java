package X;

import java.util.Random;

/* renamed from: X.2Uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50742Uv extends AbstractC50752Uw {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.2V0] */
    @Override // X.AbstractC50752Uw
    public final C2V0 A00() {
        Integer num = AbstractC50762Ux.A00;
        if (num != null && num.intValue() < 34) {
            return new C2V0() { // from class: X.3vy
                public final C87913vz A00 = new ThreadLocal() { // from class: X.3vz
                    @Override // java.lang.ThreadLocal
                    public final /* bridge */ /* synthetic */ Object initialValue() {
                        return new Random();
                    }
                };

                @Override // X.C2V0
                public final Random A0C() {
                    Object obj = get();
                    C14360o3.A07(obj);
                    return (Random) obj;
                }
            };
        }
        return new Object();
    }

    @Override // X.AbstractC50752Uw
    public final void A01(Throwable th, Throwable th2) {
        Integer num = S8C.A00;
        if (num != null && num.intValue() < 19) {
            super.A01(th, th2);
        } else {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        }
    }
}
