package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;

/* renamed from: X.UGp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66420UGp extends C2UU {
    public View.OnAttachStateChangeListener A00;
    public ImmutableList A01;
    public final SparseArray A02;

    public C66420UGp(SparseArray sparseArray) {
        C14360o3.A0B(sparseArray, 1);
        this.A02 = sparseArray;
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        this.A01 = of;
    }

    public final void A00(ImmutableList immutableList) {
        C14360o3.A0B(immutableList, 0);
        C66582za A00 = AbstractC66552zX.A00(new UGI(this, this.A01, immutableList));
        this.A01 = immutableList;
        A00.A03(this);
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        BJ6 bj6 = new BJ6(2, recyclerView, this);
        this.A00 = bj6;
        recyclerView.addOnAttachStateChangeListener(bj6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        ((AbstractC70120W4v) this.A01.get(i)).A01(c3oo);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return ((InterfaceC71899X9j) this.A02.get(i)).D8Y(viewGroup);
    }

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        recyclerView.removeOnAttachStateChangeListener(this.A00);
    }

    @Override // X.C2UU
    public final void onViewRecycled(C3OO c3oo) {
        AbstractC66440UHq abstractC66440UHq;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof AbstractC66440UHq) && (abstractC66440UHq = (AbstractC66440UHq) c3oo) != null) {
            abstractC66440UHq.A00();
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1243391509);
        int size = this.A01.size();
        C0f9.A0A(266034162, A03);
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(1252620778);
        int i2 = ((AbstractC70120W4v) this.A01.get(i)).A00.A05;
        C0f9.A0A(-130196553, A03);
        return i2;
    }
}
