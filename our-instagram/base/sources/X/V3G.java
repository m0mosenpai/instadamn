package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgButton;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes11.dex */
public final class V3G extends AbstractC65632xz {
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
        return 2;
    }

    public V3G(Context context, ReelDashboardFragment reelDashboardFragment) {
        AbstractC167017dG.A1P(context, reelDashboardFragment);
        this.A00 = context;
        this.A01 = reelDashboardFragment;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        boolean booleanValue;
        int A03 = C0f9.A03(1249429812);
        AbstractC167017dG.A1P(view, obj);
        C69448VnX c69448VnX = (C69448VnX) obj;
        ReelDashboardFragment reelDashboardFragment = this.A01;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type instagram.features.stories.dashboard.ReelViewerListMegaphoneViewBinder.Holder");
        C69399Vmj c69399Vmj = (C69399Vmj) tag;
        View view2 = c69399Vmj.A00;
        TextView textView = c69399Vmj.A05;
        TextView textView2 = c69399Vmj.A02;
        if (c69448VnX.A09 != null) {
            C23031Ai A00 = AbstractC23021Ah.A00(reelDashboardFragment.A06);
            String str = c69448VnX.A09;
            C14360o3.A0B(str, 0);
            String string = A00.A01.getString(AnonymousClass001.A0R(AbstractC111324zv.A00(5200), str), null);
            if (string != null) {
                C18920wW c18920wW = reelDashboardFragment.A05;
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "reel_viewer_dashboard_fb_viewers_nux_impression");
                A002.AAP("module", reelDashboardFragment.getModuleName());
                C38801rC c38801rC = C38321qM.A0h;
                AbstractC25236BEt.A0r(A002, C38801rC.A06(string));
                A002.Cht();
            }
        }
        Boolean bool = c69448VnX.A00;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        if (booleanValue) {
            view2.setOnClickListener(null);
            view2.setVisibility(8);
        } else {
            WNW.A00(view2, 42, reelDashboardFragment, c69448VnX);
            view2.setVisibility(0);
        }
        if (!TextUtils.isEmpty(c69448VnX.A08)) {
            textView.setText(c69448VnX.A08);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (!TextUtils.isEmpty(c69448VnX.A02)) {
            textView2.setText(c69448VnX.A02);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (c69448VnX.A05 != null) {
            String str2 = c69448VnX.A03;
            if (str2 != null) {
                if (str2.equals("button")) {
                    TextView textView3 = c69399Vmj.A03;
                    textView3.setVisibility(8);
                    textView3.setOnClickListener(null);
                    IgButton igButton = c69399Vmj.A06;
                    igButton.setText(c69448VnX.A04);
                    WNW.A00(igButton, 43, reelDashboardFragment, c69448VnX);
                    igButton.setVisibility(0);
                } else if (str2.equals("link")) {
                    IgButton igButton2 = c69399Vmj.A06;
                    igButton2.setVisibility(8);
                    igButton2.setOnClickListener(null);
                    TextView textView4 = c69399Vmj.A03;
                    WNW.A00(textView4, 44, reelDashboardFragment, c69448VnX);
                    textView4.setVisibility(0);
                }
            }
        } else {
            TextView textView5 = c69399Vmj.A03;
            textView5.setOnClickListener(null);
            IgButton igButton3 = c69399Vmj.A06;
            igButton3.setOnClickListener(null);
            textView5.setVisibility(8);
            igButton3.setVisibility(8);
        }
        String str3 = c69448VnX.A07;
        TextView textView6 = c69399Vmj.A04;
        if (str3 != null) {
            textView6.setVisibility(0);
            textView6.setText(c69448VnX.A06);
            WNW.A00(textView6, 45, reelDashboardFragment, c69448VnX);
        } else {
            textView6.setOnClickListener(null);
            textView6.setVisibility(8);
        }
        String str4 = c69448VnX.A01;
        TextView textView7 = c69399Vmj.A01;
        if (str4 != null) {
            textView7.setVisibility(0);
            textView7.setText(c69448VnX.A01);
        } else {
            textView7.setVisibility(8);
        }
        C0f9.A0A(-628830054, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1899961795);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.layout_reel_megaphone);
        A0A.setTag(new C69399Vmj(A0A));
        C0f9.A0A(-207390871, A0G);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
