package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.util.List;

/* loaded from: classes6.dex */
public final class GI2 implements InterfaceC154356wk {
    public final int A00;
    public final Object A01;

    public GI2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC154356wk
    public final View ANI(int i) {
        String str;
        if (this.A00 != 0) {
            UnifiedFollowFragment unifiedFollowFragment = (UnifiedFollowFragment) this.A01;
            List list = unifiedFollowFragment.A0L;
            if (list == null) {
                str = "tabs";
            } else {
                EnumC31556Dtg enumC31556Dtg = (EnumC31556Dtg) list.get(i);
                C14360o3.A0B(enumC31556Dtg, 0);
                View inflate = unifiedFollowFragment.getLayoutInflater().inflate(R.layout.unified_follow_tab_bar_item_layout, (ViewGroup) unifiedFollowFragment.tabLayout, false);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) inflate;
                textView.setText(UnifiedFollowFragment.A00(enumC31556Dtg, unifiedFollowFragment));
                AbstractC56952jT.A01(textView);
                unifiedFollowFragment.A0T.put(enumC31556Dtg, textView);
                ViewOnClickListenerC35668Fp3.A00(textView, unifiedFollowFragment, i, 8);
                return textView;
            }
        } else {
            C32314ELd c32314ELd = (C32314ELd) this.A01;
            TabLayout tabLayout = c32314ELd.A01;
            str = "tabLayout";
            if (tabLayout != null) {
                LayoutInflater A0P = AbstractC25228BEl.A0P(tabLayout);
                TabLayout tabLayout2 = c32314ELd.A01;
                if (tabLayout2 != null) {
                    View A0A = AbstractC31172DnG.A0A(A0P, tabLayout2, R.layout.direct_thread_details_tab_view);
                    C14360o3.A0C(A0A, AbstractC111324zv.A00(69));
                    ImageView imageView = (ImageView) A0A;
                    TabLayout tabLayout3 = c32314ELd.A01;
                    if (tabLayout3 != null) {
                        AbstractC166997dE.A19(tabLayout3.getContext(), imageView, ((EnumC33414Epl) c32314ELd.A14.get(i)).A01);
                        return imageView;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
