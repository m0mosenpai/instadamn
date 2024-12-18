package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public final class Q9U extends C2UU {
    public ImmutableList A00;
    public final SparseArray A01;

    public Q9U(SparseArray sparseArray) {
        C14360o3.A0B(sparseArray, 1);
        this.A01 = sparseArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r13, int r14) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q9U.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Object obj = this.A01.get(i);
        if (obj != null) {
            C3OO D8V = ((InterfaceC65385TjI) obj).D8V(viewGroup);
            C14360o3.A07(D8V);
            return D8V;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int size;
        int A03 = C0f9.A03(1347653007);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            size = 0;
        } else {
            size = immutableList.size();
        }
        C0f9.A0A(146871296, A03);
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-1622172813);
        ImmutableList immutableList = this.A00;
        C14360o3.A0A(immutableList);
        int i2 = ((SWN) immutableList.get(i)).A00;
        C0f9.A0A(249712601, A03);
        return i2;
    }
}
