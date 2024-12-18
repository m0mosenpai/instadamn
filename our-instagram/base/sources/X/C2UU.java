package X;

import android.database.Observable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.2UU, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2UU {
    public final C65352xX mObservable = new Observable();
    public boolean mHasStableIds = false;
    public EnumC65362xY mStateRestorationPolicy = EnumC65362xY.ALLOW;

    public int findRelativeAdapterPositionIn(C2UU c2uu, C3OO c3oo, int i) {
        if (c2uu != this) {
            return -1;
        }
        return i;
    }

    public abstract int getItemCount();

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(C3OO c3oo, int i);

    public abstract C3OO onCreateViewHolder(ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(C3OO c3oo) {
        return false;
    }

    public void onViewAttachedToWindow(C3OO c3oo) {
    }

    public void onViewDetachedFromWindow(C3OO c3oo) {
    }

    public void onViewRecycled(C3OO c3oo) {
    }

    public boolean canRestoreState() {
        int ordinal = this.mStateRestorationPolicy.ordinal();
        if (ordinal == 2) {
            return false;
        }
        if (ordinal == 1 && getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    public final EnumC65362xY getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.A06();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.A00();
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.A05(i, 1, null);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.A03(i, 1);
    }

    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.A02(i, i2);
    }

    public final void notifyItemRangeChanged(int i, int i2) {
        this.mObservable.A05(i, i2, null);
    }

    public final void notifyItemRangeInserted(int i, int i2) {
        this.mObservable.A03(i, i2);
    }

    public final void notifyItemRangeRemoved(int i, int i2) {
        this.mObservable.A04(i, i2);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.A04(i, 1);
    }

    public void registerAdapterDataObserver(AbstractC65392xb abstractC65392xb) {
        this.mObservable.registerObserver(abstractC65392xb);
    }

    public void setHasStableIds(boolean z) {
        if (!this.mObservable.A06()) {
            this.mHasStableIds = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void setStateRestorationPolicy(EnumC65362xY enumC65362xY) {
        this.mStateRestorationPolicy = enumC65362xY;
        this.mObservable.A01();
    }

    public void unregisterAdapterDataObserver(AbstractC65392xb abstractC65392xb) {
        this.mObservable.unregisterObserver(abstractC65392xb);
    }

    public final void bindViewHolder(C3OO c3oo, int i) {
        IllegalStateException illegalStateException;
        int i2;
        int A03 = C0f9.A03(1769557546);
        boolean z = false;
        if (c3oo.mBindingAdapter == null) {
            z = true;
            c3oo.mPosition = i;
            if (hasStableIds()) {
                c3oo.mItemId = getItemId(i);
            }
            c3oo.setFlags(1, 519);
            AbstractC09780fb.A01("RV OnBindView", 1983356480);
        }
        c3oo.mBindingAdapter = this;
        if (RecyclerView.A1C) {
            if (c3oo.itemView.getParent() == null) {
                boolean isAttachedToWindow = c3oo.itemView.isAttachedToWindow();
                boolean isTmpDetached = c3oo.isTmpDetached();
                if (isAttachedToWindow != isTmpDetached) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Temp-detached state out of sync with reality. holder.isTmpDetached(): ");
                    sb.append(isTmpDetached);
                    sb.append(", attached to window: ");
                    sb.append(c3oo.itemView.isAttachedToWindow());
                    sb.append(", holder: ");
                    sb.append(c3oo);
                    illegalStateException = new IllegalStateException(sb.toString());
                    i2 = -982920651;
                    C0f9.A0A(i2, A03);
                    throw illegalStateException;
                }
            }
            if (c3oo.itemView.getParent() == null && c3oo.itemView.isAttachedToWindow()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Attempting to bind attached holder with no parent (AKA temp detached): ");
                sb2.append(c3oo);
                illegalStateException = new IllegalStateException(sb2.toString());
                i2 = 1373383808;
                C0f9.A0A(i2, A03);
                throw illegalStateException;
            }
        }
        c3oo.getUnmodifiedPayloads();
        onBindViewHolder(c3oo, i);
        if (z) {
            c3oo.clearPayload();
            ViewGroup.LayoutParams layoutParams = c3oo.itemView.getLayoutParams();
            if (layoutParams instanceof C3OP) {
                ((C3OP) layoutParams).A00 = true;
            }
            AbstractC09780fb.A00(-1474762564);
        }
        C0f9.A0A(-126637296, A03);
    }

    public final C3OO createViewHolder(ViewGroup viewGroup, int i) {
        int A03 = C0f9.A03(-629964243);
        try {
            AbstractC09780fb.A01("RV CreateView", -227498666);
            C3OO onCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (onCreateViewHolder.itemView.getParent() == null) {
                onCreateViewHolder.mItemViewType = i;
                AbstractC09780fb.A00(54678396);
                C0f9.A0A(1905615051, A03);
                return onCreateViewHolder;
            }
            IllegalStateException illegalStateException = new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            C0f9.A0A(1160812649, A03);
            throw illegalStateException;
        } catch (Throwable th) {
            AbstractC09780fb.A00(1241124621);
            C0f9.A0A(1184021504, A03);
            throw th;
        }
    }

    public long getItemId(int i) {
        C0f9.A0A(971060828, C0f9.A03(-875337064));
        return -1L;
    }

    public int getItemViewType(int i) {
        C0f9.A0A(864819468, C0f9.A03(-1698878897));
        return 0;
    }

    public void onBindViewHolder(C3OO c3oo, int i, List list) {
        onBindViewHolder(c3oo, i);
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.A05(i, 1, obj);
    }

    public final void notifyItemRangeChanged(int i, int i2, Object obj) {
        this.mObservable.A05(i, i2, obj);
    }
}
