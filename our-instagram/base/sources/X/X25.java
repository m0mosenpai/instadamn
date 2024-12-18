package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/* loaded from: classes11.dex */
public final class X25 extends HashSet<C84923qg> {
    public final java.util.Set A00 = new HashSet();
    public final Integer A01;

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final boolean add(C84923qg c84923qg) {
        C14360o3.A0B(c84923qg, 0);
        boolean add = super.add(c84923qg);
        if (add) {
            A00();
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        boolean addAll = super.addAll(collection);
        if (addAll) {
            A00();
        }
        return addAll;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        boolean removeAll = super.removeAll(AbstractC001800i.A0k(collection));
        if (removeAll) {
            A00();
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        C14360o3.A0B(predicate, 0);
        boolean removeIf = super.removeIf(predicate);
        if (removeIf) {
            A00();
        }
        return removeIf;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        boolean retainAll = super.retainAll(AbstractC001800i.A0k(collection));
        if (retainAll) {
            A00();
        }
        return retainAll;
    }

    private final void A00() {
        for (C68861VdH c68861VdH : this.A00) {
            Integer num = this.A01;
            LimitedCommentsFragment limitedCommentsFragment = c68861VdH.A00;
            if (limitedCommentsFragment.isAdded() && C05F.A00 == num) {
                FragmentActivity activity = limitedCommentsFragment.getActivity();
                C56352iT A03 = C56352iT.A0t.A03(activity);
                if (activity instanceof BaseFragmentActivity) {
                    A03.A0T();
                }
            }
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C84923qg)) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C84923qg)) {
            return false;
        }
        C14360o3.A0B(obj, 0);
        boolean remove = super.remove(obj);
        if (!remove) {
            return remove;
        }
        A00();
        return remove;
    }

    public X25(Integer num) {
        this.A01 = num;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            A00();
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return super.size();
    }
}
