package X;

/* loaded from: classes10.dex */
public final class T6Z implements InterfaceC65516Tll {
    public static final T6Z A00 = new T6Z();

    public static T6Z A00() {
        return A00;
    }

    @Override // X.InterfaceC65516Tll
    public final TmQ FFp(Class cls) {
        if (RO8.class.isAssignableFrom(cls)) {
            try {
                return (TmQ) RO8.A03(cls.asSubclass(RO8.class)).A0N(3, null, null);
            } catch (Exception e) {
                throw AbstractC58318PtA.A0e("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
            }
        }
        throw AbstractC166987dD.A12("Unsupported message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // X.InterfaceC65516Tll
    public final boolean FG1(Class cls) {
        return RO8.class.isAssignableFrom(cls);
    }
}
