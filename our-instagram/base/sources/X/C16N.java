package X;

/* renamed from: X.16N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16N {
    public int A00;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.16N] */
    public static C16N A00(InterfaceC222215y[] interfaceC222215yArr) {
        int length = interfaceC222215yArr.length;
        if (length <= 31) {
            int i = 0;
            for (InterfaceC222215y interfaceC222215y : interfaceC222215yArr) {
                if (interfaceC222215y.ARw()) {
                    i |= interfaceC222215y.BPk();
                }
            }
            ?? obj = new Object();
            obj.A00 = i;
            return obj;
        }
        throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", interfaceC222215yArr[0].getClass().getName(), Integer.valueOf(length)));
    }
}
