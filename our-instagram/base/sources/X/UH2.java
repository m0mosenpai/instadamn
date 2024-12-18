package X;

import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView;

/* loaded from: classes11.dex */
public final class UH2 extends AbstractC65392xb {
    public final int A00;
    public final Object A01;

    public UH2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC65392xb
    public final void onChanged() {
        switch (this.A00) {
            case 1:
                C69319VlR c69319VlR = (C69319VlR) this.A01;
                c69319VlR.A00 = c69319VlR.A03.getItemCount();
                C70371WSz c70371WSz = (C70371WSz) c69319VlR.A02;
                c70371WSz.A03.notifyDataSetChanged();
                C70371WSz.A02(c70371WSz);
                return;
            case 2:
                ((C65969TxM) this.A01).A00(true);
                return;
            case 3:
            default:
                super.onChanged();
                return;
            case 4:
                RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = (RefreshableRecyclerViewLayout) this.A01;
                if (refreshableRecyclerViewLayout.A0R.A0E(0.0d)) {
                    return;
                }
                refreshableRecyclerViewLayout.A0C = true;
                return;
            case 5:
                HeroCarouselScrollbarView heroCarouselScrollbarView = (HeroCarouselScrollbarView) this.A01;
                heroCarouselScrollbarView.post(new RunnableC71378Wsn(heroCarouselScrollbarView));
                return;
            case 6:
                PJ0 pj0 = (PJ0) this.A01;
                pj0.A09.A00 = pj0.A07.getItemCount();
                return;
            case 7:
                ((C70911WkF) this.A01).A00.notifyChanged();
                return;
        }
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        switch (this.A00) {
            case 1:
                C69319VlR c69319VlR = (C69319VlR) this.A01;
                C70371WSz c70371WSz = (C70371WSz) c69319VlR.A02;
                c70371WSz.A03.notifyItemRangeChanged(i + C70371WSz.A00(c70371WSz, c69319VlR), i2, obj);
                return;
            case 2:
            case 7:
                onChanged();
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                super.onItemRangeChanged(i, i2, obj);
                return;
        }
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeInserted(int i, int i2) {
        switch (this.A00) {
            case 0:
                PagingDataAdapter pagingDataAdapter = (PagingDataAdapter) this.A01;
                if (pagingDataAdapter.mStateRestorationPolicy == EnumC65362xY.PREVENT && !pagingDataAdapter.A00) {
                    pagingDataAdapter.setStateRestorationPolicy(EnumC65362xY.ALLOW);
                }
                pagingDataAdapter.unregisterAdapterDataObserver(this);
                return;
            case 1:
                C69319VlR c69319VlR = (C69319VlR) this.A01;
                c69319VlR.A00 += i2;
                C70371WSz c70371WSz = (C70371WSz) c69319VlR.A02;
                c70371WSz.A03.notifyItemRangeInserted(i + C70371WSz.A00(c70371WSz, c69319VlR), i2);
                if (c69319VlR.A00 <= 0 || c69319VlR.A03.mStateRestorationPolicy != EnumC65362xY.PREVENT_WHEN_EMPTY) {
                    return;
                }
                C70371WSz.A02(c70371WSz);
                return;
            case 2:
            case 7:
                onChanged();
                return;
            case 3:
                if (i != 0) {
                    return;
                }
                RecyclerView recyclerView = (RecyclerView) this.A01;
                if (recyclerView.getChildCount() == 0) {
                    return;
                }
                recyclerView.A0n(0);
                return;
            case 4:
            default:
                super.onItemRangeInserted(i, i2);
                return;
            case 5:
                HeroCarouselScrollbarView heroCarouselScrollbarView = (HeroCarouselScrollbarView) this.A01;
                heroCarouselScrollbarView.post(new RunnableC71378Wsn(heroCarouselScrollbarView));
                return;
            case 6:
                PJ0 pj0 = (PJ0) this.A01;
                pj0.A09.A00 = pj0.A07.getItemCount();
                return;
        }
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeMoved(int i, int i2, int i3) {
        switch (this.A00) {
            case 1:
                boolean z = true;
                if (i3 != 1) {
                    z = false;
                }
                C02R.A06(z, "moving more than 1 item is not supported in RecyclerView");
                C69319VlR c69319VlR = (C69319VlR) this.A01;
                C70371WSz c70371WSz = (C70371WSz) c69319VlR.A02;
                int A00 = C70371WSz.A00(c70371WSz, c69319VlR);
                c70371WSz.A03.notifyItemMoved(i + A00, i2 + A00);
                return;
            case 2:
            case 7:
                onChanged();
                return;
            case 3:
            case 4:
            case 6:
            default:
                super.onItemRangeMoved(i, i2, i3);
                return;
            case 5:
                HeroCarouselScrollbarView heroCarouselScrollbarView = (HeroCarouselScrollbarView) this.A01;
                heroCarouselScrollbarView.post(new RunnableC71378Wsn(heroCarouselScrollbarView));
                return;
        }
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeRemoved(int i, int i2) {
        switch (this.A00) {
            case 1:
                C69319VlR c69319VlR = (C69319VlR) this.A01;
                c69319VlR.A00 -= i2;
                C70371WSz c70371WSz = (C70371WSz) c69319VlR.A02;
                c70371WSz.A03.notifyItemRangeRemoved(i + C70371WSz.A00(c70371WSz, c69319VlR), i2);
                if (c69319VlR.A00 >= 1 || c69319VlR.A03.mStateRestorationPolicy != EnumC65362xY.PREVENT_WHEN_EMPTY) {
                    return;
                }
                C70371WSz.A02(c70371WSz);
                return;
            case 2:
            case 7:
                onChanged();
                return;
            case 3:
            case 4:
            default:
                super.onItemRangeRemoved(i, i2);
                return;
            case 5:
                HeroCarouselScrollbarView heroCarouselScrollbarView = (HeroCarouselScrollbarView) this.A01;
                heroCarouselScrollbarView.post(new RunnableC71378Wsn(heroCarouselScrollbarView));
                return;
            case 6:
                PJ0 pj0 = (PJ0) this.A01;
                pj0.A09.A00 = pj0.A07.getItemCount();
                return;
        }
    }

    @Override // X.AbstractC65392xb
    public final void onStateRestorationPolicyChanged() {
        if (1 - this.A00 != 0) {
            super.onStateRestorationPolicyChanged();
        } else {
            C70371WSz.A02((C70371WSz) ((C69319VlR) this.A01).A02);
        }
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeChanged(int i, int i2) {
        switch (this.A00) {
            case 1:
                C69319VlR c69319VlR = (C69319VlR) this.A01;
                C70371WSz c70371WSz = (C70371WSz) c69319VlR.A02;
                c70371WSz.A03.notifyItemRangeChanged(i + C70371WSz.A00(c70371WSz, c69319VlR), i2, null);
                return;
            case 2:
            case 7:
                onChanged();
                return;
            case 3:
            case 4:
            case 6:
            default:
                super.onItemRangeChanged(i, i2);
                return;
            case 5:
                HeroCarouselScrollbarView heroCarouselScrollbarView = (HeroCarouselScrollbarView) this.A01;
                heroCarouselScrollbarView.post(new RunnableC71378Wsn(heroCarouselScrollbarView));
                return;
        }
    }
}
