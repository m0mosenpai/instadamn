package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes11.dex */
public final class V3F extends AbstractC65632xz {
    public final Context A00;
    public final ReelDashboardFragment A01;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return obj.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return obj.hashCode();
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 3;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C69179Vj8 c69179Vj8 = (C69179Vj8) obj;
        boolean A1R = AbstractC167007dF.A1R(0, anonymousClass306, c69179Vj8);
        switch (c69179Vj8.A01.intValue()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
                anonymousClass306.A7a(0);
                return;
            case 1:
            case 6:
                anonymousClass306.A7a(A1R ? 1 : 0);
                return;
            default:
                throw new UnsupportedOperationException("Unknown CTA type");
        }
    }

    public V3F(Context context, ReelDashboardFragment reelDashboardFragment) {
        AbstractC167017dG.A1P(context, reelDashboardFragment);
        this.A00 = context;
        this.A01 = reelDashboardFragment;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C69179Vj8 c69179Vj8;
        TextView textView;
        int i2;
        int A03 = C0f9.A03(-1813631192);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        if (i != 0) {
            if (i != 1) {
                if (i != A06) {
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                    C0f9.A0A(2011027547, A03);
                    throw unsupportedOperationException;
                }
            } else {
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type instagram.features.stories.dashboard.ReelDashboardCTAButtonViewBinder.Holder");
                VgW vgW = (VgW) tag;
                c69179Vj8 = (C69179Vj8) obj;
                ReelDashboardFragment reelDashboardFragment = this.A01;
                View view2 = vgW.A00;
                Resources resources = view2.getResources();
                if (c69179Vj8.A01 == C05F.A01) {
                    i2 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                } else {
                    i2 = 0;
                }
                AbstractC13880nE.A0Y(view2, i2);
                textView = vgW.A01;
                C0fQ.A00(new WNW(c69179Vj8, reelDashboardFragment, 38), textView);
                textView.setText(c69179Vj8.A02);
                C0f9.A0A(-1046202846, A03);
            }
        }
        Object tag2 = view.getTag();
        C14360o3.A0C(tag2, "null cannot be cast to non-null type instagram.features.stories.dashboard.ReelDashboardCTATextViewBinder.Holder");
        VgX vgX = (VgX) tag2;
        c69179Vj8 = (C69179Vj8) obj;
        ReelDashboardFragment reelDashboardFragment2 = this.A01;
        C0fQ.A00(new WNW(c69179Vj8, reelDashboardFragment2, 39), vgX.A00);
        textView = vgX.A01;
        textView.setText(c69179Vj8.A02);
        C0f9.A0A(-1046202846, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        Context context;
        int i2;
        View view;
        Object obj;
        int A03 = C0f9.A03(-1608303756);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    context = this.A00;
                    i2 = R.layout.row_reel_dashboard_cta_primary_text;
                } else {
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                    C0f9.A0A(79412005, A03);
                    throw unsupportedOperationException;
                }
            } else {
                view = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_reel_dashboard_cta_button);
                obj = new VgW(view);
                view.setTag(obj);
                C0f9.A0A(195302740, A03);
                return view;
            }
        } else {
            context = this.A00;
            i2 = R.layout.row_reel_dashboard_cta_text_with_arrow;
        }
        view = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, i2);
        obj = new VgX(view);
        view.setTag(obj);
        C0f9.A0A(195302740, A03);
        return view;
    }
}
