package X;

/* renamed from: X.TvA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65849TvA extends AbstractC65392xb {
    @Override // X.AbstractC65392xb
    public final void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        onChanged();
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeChanged(int i, int i2) {
        onChanged();
    }
}
