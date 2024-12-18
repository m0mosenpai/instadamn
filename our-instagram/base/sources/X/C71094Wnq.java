package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.ui.widget.refresh.IgSwipeRefreshLayout;

/* renamed from: X.Wnq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71094Wnq implements InterfaceC70513Em {
    public final IgSwipeRefreshLayout A00;

    @Override // X.InterfaceC70513Em
    public final void APU() {
        this.A00.setEnabled(false);
    }

    @Override // X.InterfaceC70513Em
    public final void ARj() {
        this.A00.setEnabled(true);
    }

    @Override // X.InterfaceC70513Em
    public final void EWY(boolean z, boolean z2) {
        if (z2) {
            this.A00.setRefreshing(z);
        }
    }

    @Override // X.InterfaceC70513Em
    public final void Eg0(int i) {
        if (i > 0) {
            int i2 = i / 3;
            this.A00.A08(i2, i + i2);
        }
    }

    @Override // X.InterfaceC70513Em
    public final boolean isLoading() {
        return this.A00.A0G;
    }

    @Override // X.InterfaceC70513Em
    public final void setIsLoading(boolean z) {
        this.A00.setRefreshing(z);
    }

    public C71094Wnq(View view, InterfaceC70493Ek interfaceC70493Ek) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.swiperefreshlayout_stub);
        if (viewStub != null) {
            viewStub.inflate();
        }
        View findViewById = view.findViewById(R.id.swipe_refresh);
        if (findViewById != null) {
            IgSwipeRefreshLayout igSwipeRefreshLayout = (IgSwipeRefreshLayout) findViewById;
            this.A00 = igSwipeRefreshLayout;
            igSwipeRefreshLayout.setVisibility(0);
            igSwipeRefreshLayout.A0E = new WT7(interfaceC70493Ek);
            Context context = view.getContext();
            igSwipeRefreshLayout.setColorSchemeColors(AbstractC53242c7.A01(context));
            igSwipeRefreshLayout.setProgressBackgroundColorSchemeColor(AbstractC53242c7.A0F(context, R.attr.igds_color_elevated_background));
            return;
        }
        throw AbstractC31175DnJ.A0V("SwipeRefreshLayout not found in view: ", AbstractC31173DnH.A0q(view));
    }
}
