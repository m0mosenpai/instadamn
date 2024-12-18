package X;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IED {
    public final C153126ug A00;
    public final C153126ug A01;

    public IED(C153126ug c153126ug) {
        this.A00 = c153126ug;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i = 0; i < c153126ug.A01(); i++) {
            IJT ijt = ((C41087IHe) c153126ug.A02(i)).A00;
            if (!A1E.contains(ijt)) {
                A1E.add(ijt);
            }
        }
        this.A01 = new C153126ug(A1E, 0, A1E.size());
    }
}
