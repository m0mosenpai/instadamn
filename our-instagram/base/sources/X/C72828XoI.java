package X;

import java.util.ArrayList;

/* renamed from: X.XoI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72828XoI {
    public InterfaceC199678sJ A00 = null;
    public ArrayList A02 = AbstractC166987dD.A1E();
    public ArrayList A01 = AbstractC166987dD.A1E();

    public final boolean A00() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A01;
            if (i >= arrayList.size()) {
                return false;
            }
            C200598u2 c200598u2 = (C200598u2) arrayList.get(i);
            if (c200598u2.A08 && c200598u2.A05.isEnabled()) {
                return true;
            }
            i++;
        }
    }
}
