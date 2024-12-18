package X;

import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class X2D extends UKH {
    public final /* synthetic */ UKI A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2D(AbstractC021208i abstractC021208i, UKI uki) {
        super(abstractC021208i);
        this.A00 = uki;
    }

    @Override // X.AbstractC021208i
    public final int getItemPosition(Object obj) {
        int itemPosition = this.A01.getItemPosition(obj);
        if (itemPosition >= 0) {
            return (getCount() - itemPosition) - 1;
        }
        return itemPosition;
    }

    @Override // X.UKH, X.AbstractC021208i
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, (getCount() - i) - 1, obj);
    }

    @Override // X.AbstractC021208i
    public final CharSequence getPageTitle(int i) {
        return this.A01.getPageTitle((getCount() - i) - 1);
    }

    @Override // X.AbstractC021208i
    public final float getPageWidth(int i) {
        return this.A01.getPageWidth((getCount() - i) - 1);
    }

    @Override // X.AbstractC021208i
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.A01.instantiateItem(viewGroup, (getCount() - i) - 1);
    }

    @Override // X.UKH, X.AbstractC021208i
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, (getCount() - i) - 1, obj);
    }
}
