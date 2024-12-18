package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.List;

/* renamed from: X.Dy6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31787Dy6 extends AbstractC10330gz {
    public final SparseArray A00;
    public final List A01;

    @Override // X.AbstractC021208i
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // X.AbstractC10330gz, X.AbstractC021208i
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        if (instantiateItem instanceof Fragment) {
            if (instantiateItem instanceof InterfaceC37211GaM) {
                this.A00.put(i, instantiateItem);
            }
            return instantiateItem;
        }
        throw AbstractC166987dD.A14("Fragment must be a child of a Fragment");
    }

    @Override // X.AbstractC10330gz
    public final Fragment A00(int i) {
        InterfaceC37180GZr interfaceC37180GZr = (InterfaceC37180GZr) AbstractC001800i.A0O(this.A01, i);
        if (interfaceC37180GZr != null) {
            return (Fragment) interfaceC37180GZr.ANG();
        }
        throw AbstractC166987dD.A14("Saved Tab Providers should have position within");
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return this.A01.size();
    }

    public C31787Dy6(AbstractC10360h2 abstractC10360h2, int i) {
        super(abstractC10360h2, i);
        this.A00 = new SparseArray();
        this.A01 = AbstractC166987dD.A1E();
    }

    @Override // X.AbstractC10330gz, X.AbstractC021208i
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        AbstractC167017dG.A1O(viewGroup, obj);
        this.A00.remove(i);
        super.destroyItem(viewGroup, i, obj);
    }
}
