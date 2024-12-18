package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.O9o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54587O9o {
    public final C153126ug A00;
    public final C153126ug A01;
    public final List A02;

    public C54587O9o(C153126ug c153126ug, List list) {
        this.A02 = list;
        this.A00 = c153126ug;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i = 0; i < c153126ug.A01(); i++) {
            MSZ.A1P(((OF4) c153126ug.A02(i)).A03, A1E);
        }
        this.A01 = new C153126ug(A1E, 0, A1E.size());
    }
}
