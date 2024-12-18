package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.IMg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41217IMg {
    public final ArrayList A00 = AbstractC166987dD.A1E();

    public final void A00() {
        Iterator A13 = AbstractC166997dE.A13(this.A00);
        while (A13.hasNext()) {
            ((C39690HjM) AbstractC166997dE.A0l(A13)).A00.setHasTransientState(false);
        }
    }

    public final void A01() {
        Iterator A13 = AbstractC166997dE.A13(this.A00);
        while (A13.hasNext()) {
            ((C39690HjM) AbstractC166997dE.A0l(A13)).A00.setHasTransientState(true);
        }
    }
}
