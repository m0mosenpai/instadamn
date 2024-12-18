package X;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.Pvc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58454Pvc implements InterfaceC30997Djw {
    public C58453Pvb A00;
    public boolean A01;
    public final HashSet A02 = AbstractC166987dD.A1H();

    @Override // X.InterfaceC30997Djw
    public final synchronized boolean A8k(String str) {
        boolean z;
        z = false;
        C14360o3.A0B(str, 0);
        if (!this.A01) {
            this.A02.addAll(this.A00.A02());
            this.A01 = true;
        }
        String A02 = AbstractC13670mt.A02(str);
        if (A02 != null) {
            z = this.A02.add(A02);
        }
        return z;
    }

    @Override // X.InterfaceC30997Djw
    public final synchronized boolean A8l(String str) {
        boolean z;
        z = false;
        C14360o3.A0B(str, 0);
        if (!this.A01) {
            this.A02.addAll(this.A00.A02());
            this.A01 = true;
        }
        String A02 = AbstractC13670mt.A02(str);
        if (A02 != null) {
            HashSet hashSet = this.A02;
            z = hashSet.add(A02);
            ArrayList A01 = this.A00.A01(A02);
            if (!A01.isEmpty()) {
                hashSet.removeAll(A01);
            }
        }
        return z;
    }

    public C58454Pvc(File file, int i) {
        this.A00 = new C58453Pvb(file, Integer.valueOf(i));
    }
}
