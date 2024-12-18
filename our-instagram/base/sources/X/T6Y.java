package X;

/* loaded from: classes10.dex */
public final class T6Y implements InterfaceC65516Tll {
    public final InterfaceC65516Tll[] A00;

    public T6Y(InterfaceC65516Tll... interfaceC65516TllArr) {
        this.A00 = interfaceC65516TllArr;
    }

    @Override // X.InterfaceC65516Tll
    public final TmQ FFp(Class cls) {
        int i = 0;
        do {
            InterfaceC65516Tll interfaceC65516Tll = this.A00[i];
            if (interfaceC65516Tll.FG1(cls)) {
                return interfaceC65516Tll.FFp(cls);
            }
            i++;
        } while (i < 2);
        throw AbstractC166987dD.A1D("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // X.InterfaceC65516Tll
    public final boolean FG1(Class cls) {
        int i = 0;
        while (!this.A00[i].FG1(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }
}
