package X;

import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.6zH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155876zH extends AbstractC10330gz {
    public List A00;
    public boolean A01;
    public final SparseArray A02;
    public final SparseArray A03;
    public final SparseIntArray A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C155876zH(AbstractC10360h2 abstractC10360h2, boolean z) {
        super(abstractC10360h2, 0);
        C14360o3.A0B(abstractC10360h2, 1);
        this.A05 = z;
        this.A02 = new SparseArray();
        this.A03 = new SparseArray();
        this.A04 = new SparseIntArray();
        this.A00 = C16930sl.A00;
    }

    public final void A03(ViewGroup viewGroup, List list) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(list, 1);
        this.A00 = list;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC152836uD A02 = A02(i);
            if (A02 != null && !C14360o3.A0K(A02.Bi9(), ((InterfaceC156026zW) this.A00.get(i)).C4o())) {
                destroyItem(viewGroup, i, (Object) A02);
            }
        }
        finishUpdate(viewGroup);
        if (!this.A05) {
            this.A02.clear();
            this.A03.clear();
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC10330gz, X.AbstractC021208i
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(obj, 2);
        this.A04.delete(obj.hashCode());
        this.A02.remove(i);
        this.A03.remove(i);
        super.destroyItem(viewGroup, i, obj);
    }

    @Override // X.AbstractC021208i
    public final int getItemPosition(Object obj) {
        C14360o3.A0B(obj, 0);
        String Bi9 = ((InterfaceC152836uD) obj).Bi9();
        int i = this.A04.get(obj.hashCode());
        if (i < this.A00.size() && C14360o3.A0K(((InterfaceC156026zW) this.A00.get(i)).C4o(), Bi9)) {
            return -1;
        }
        return -2;
    }

    @Override // X.AbstractC10330gz, X.AbstractC021208i
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        C14360o3.A0C(instantiateItem, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        if (instantiateItem instanceof InterfaceC152836uD) {
            this.A03.put(i, new WeakReference(instantiateItem));
            this.A04.put(instantiateItem.hashCode(), i);
            return instantiateItem;
        }
        throw new IllegalArgumentException("Fragment in ViewPager does not implement ProfileTabFragment");
    }

    @Override // X.AbstractC10330gz
    @Deprecated(message = "")
    public final Fragment A00(int i) {
        return ((InterfaceC156026zW) this.A00.get(i)).AMq(this.A01).ACb();
    }

    public final int A01(String str) {
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            if (C14360o3.A0K(((InterfaceC156026zW) this.A00.get(i)).C4o(), str)) {
                return i;
            }
        }
        return -1;
    }

    public final InterfaceC152836uD A02(int i) {
        Reference reference = (Reference) this.A03.get(i);
        if (reference != null) {
            return (InterfaceC152836uD) reference.get();
        }
        return null;
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return this.A00.size();
    }

    @Override // X.AbstractC10330gz, X.AbstractC021208i
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        try {
            super.restoreState(parcelable, classLoader);
        } catch (Exception e) {
            C0K8.A0F("ProfileTabPagerAdapter", "Error restoring state of fragment", e);
        }
    }
}
