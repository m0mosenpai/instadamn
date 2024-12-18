package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GIb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36754GIb implements C38M {
    public final /* synthetic */ EQJ A00;

    @Override // X.C38M
    public final void D4P(SparseArray sparseArray, Integer num) {
    }

    @Override // X.C38M
    public final void D4Q() {
    }

    @Override // X.C38M
    public final void D4R() {
    }

    @Override // X.C38M
    public final void D4S() {
    }

    public C36754GIb(EQJ eqj) {
        this.A00 = eqj;
    }

    @Override // X.C38M
    public final void D4T(SparseArray sparseArray) {
        if (sparseArray != null) {
            int A0D = AbstractC25230BEn.A0D(sparseArray.get(2), "null cannot be cast to non-null type kotlin.Int");
            EQJ eqj = this.A00;
            ArrayList arrayList = (ArrayList) AbstractC31173DnH.A0i(eqj.A0H, A0D);
            C47K c47k = (C47K) AbstractC31173DnH.A0i(eqj.A0G, A0D);
            if (AbstractC25226BEj.A1b(arrayList)) {
                int i = eqj.A01 - 1;
                int size = arrayList.size() - 1;
                if (i > size) {
                    i = size;
                }
                List A0i = AbstractC001800i.A0i(arrayList, new C17u(0, i));
                List list = c47k.A0M;
                if (list != null) {
                    list.addAll(A0i);
                }
                arrayList.removeAll(A0i);
                EQJ.A03(eqj, A0i);
            }
            EQJ.A01(eqj);
        }
    }
}
