package X;

import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

/* renamed from: X.MjC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51168MjC extends C2UU {
    public final List A00 = AbstractC166987dD.A1E();
    public final Map A01;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        AbstractC09800fd.A01("GridAdapter.onCreateViewHolder", -1509047153);
        try {
            N0H A00 = A00(i).A00(viewGroup);
            AbstractC09800fd.A00(-2018999724);
            return A00;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-716909832);
            throw th;
        }
    }

    private final AbstractC53623NnU A00(int i) {
        AbstractC53623NnU abstractC53623NnU = (AbstractC53623NnU) AbstractC166997dE.A0m(this.A01, i);
        if (abstractC53623NnU != null) {
            return abstractC53623NnU;
        }
        throw AbstractC166987dD.A14("No item definition found for given viewHolder");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        AbstractC51368MmT abstractC51368MmT = (AbstractC51368MmT) c3oo;
        C14360o3.A0B(abstractC51368MmT, 0);
        AbstractC09800fd.A01("GridAdapter.onBindViewHolder", 139602435);
        try {
            if (!(A00(abstractC51368MmT.mItemViewType) instanceof N0J)) {
                C51681MsC c51681MsC = (C51681MsC) this.A00.get(i);
                N0H n0h = (N0H) abstractC51368MmT;
                AbstractC167007dF.A1K(c51681MsC, n0h);
                n0h.A03(c51681MsC);
            }
            AbstractC09800fd.A00(1775988806);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-783744089);
            throw th;
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(C3OO c3oo) {
        AbstractC51368MmT abstractC51368MmT = (AbstractC51368MmT) c3oo;
        C14360o3.A0B(abstractC51368MmT, 0);
        A00(abstractC51368MmT.mItemViewType);
        N0H n0h = (N0H) abstractC51368MmT;
        C14360o3.A0B(n0h, 0);
        n0h.A01.A01();
        return false;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        AbstractC51368MmT abstractC51368MmT = (AbstractC51368MmT) c3oo;
        C14360o3.A0B(abstractC51368MmT, 0);
        AbstractC09800fd.A01("GridAdapter.onViewRecycled", -930240099);
        try {
            if (!(A00(abstractC51368MmT.mItemViewType) instanceof N0J)) {
                N0H n0h = (N0H) abstractC51368MmT;
                C14360o3.A0B(n0h, 0);
                n0h.A01.A01();
            }
            AbstractC09800fd.A00(2104701672);
        } catch (Throwable th) {
            AbstractC09800fd.A00(321194642);
            throw th;
        }
    }

    public C51168MjC(Map map) {
        this.A01 = map;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(39646548);
        int size = this.A00.size();
        C0f9.A0A(-837696817, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(355873893);
        long j = ((C51681MsC) this.A00.get(i)).A02;
        C0f9.A0A(-618686184, A03);
        return j;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-1596196342);
        int i2 = ((C51681MsC) this.A00.get(i)).A01;
        C0f9.A0A(1156454795, A03);
        return i2;
    }
}
