package X;

/* loaded from: classes8.dex */
public final class JYQ implements YO2 {
    public static final JYQ A00 = new JYQ();

    @Override // X.YO2
    public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        Number number = (Number) obj2;
        int intValue = ((Number) obj).intValue();
        C14360o3.A0A(number);
        return Integer.valueOf(intValue + number.intValue());
    }
}
