package X;

import java.util.ArrayList;

/* renamed from: X.2hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56072hv extends C56082hw {
    public ArrayList A00 = new ArrayList();

    public abstract void A0c();

    @Override // X.C56082hw
    public void A0B() {
        this.A00.clear();
        super.A0B();
    }

    @Override // X.C56082hw
    public final void A0L(C56182i7 c56182i7) {
        super.A0L(c56182i7);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            ((C56082hw) this.A00.get(i)).A0L(c56182i7);
        }
    }
}
