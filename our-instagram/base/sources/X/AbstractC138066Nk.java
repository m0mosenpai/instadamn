package X;

/* renamed from: X.6Nk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC138066Nk {
    public Object A00(C114175De c114175De) {
        InterfaceC118895a6 interfaceC118895a6 = ((C138056Nj) this).A00;
        if (c114175De == interfaceC118895a6.BKT()) {
            return interfaceC118895a6.getValue();
        }
        AbstractC28290Cdc.A01("Check failed.");
        throw C00O.createAndThrow();
    }

    public boolean A01(C114175De c114175De) {
        if (c114175De != ((C138056Nj) this).A00.BKT()) {
            return false;
        }
        return true;
    }
}
