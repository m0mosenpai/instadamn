package X;

/* renamed from: X.NpM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53733NpM {
    public static final C2N9 A00(Class cls) {
        C14360o3.A0B(cls, 0);
        try {
            Object obj = cls.getDeclaredField("CONVERTER").get(null);
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.djinni.msys.infra.McfReference.McfTypeConverter<T of com.facebook.rp.platform.statemanagement.rpstate.RpStateKt.getConverter>");
            return (C2N9) obj;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}
