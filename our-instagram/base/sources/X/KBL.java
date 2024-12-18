package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class KBL extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CreatorActivationNullStateFragment";
    public int A00;
    public AbstractC65852TvD A01;
    public ViewPager2 A02;
    public C44804JsW A03;
    public String A04;
    public List A05;
    public final Handler A07 = AbstractC167007dF.A0J();
    public boolean A06 = true;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "channel_creation_null_state_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewPager2 viewPager2 = (ViewPager2) view.requireViewById(R.id.null_state_pager);
        this.A02 = viewPager2;
        String str = "viewPager";
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(2);
            List list = this.A05;
            if (list != null) {
                this.A00 = list.size();
                UserSession A0r = AbstractC166987dD.A0r(this.A08);
                List list2 = this.A05;
                if (list2 != null) {
                    C44804JsW c44804JsW = new C44804JsW(this, A0r, this, list2);
                    this.A03 = c44804JsW;
                    ViewPager2 viewPager22 = this.A02;
                    if (viewPager22 != null) {
                        viewPager22.setAdapter(c44804JsW);
                        ViewPager2 viewPager23 = this.A02;
                        if (viewPager23 != null) {
                            AbstractC65852TvD abstractC65852TvD = this.A01;
                            if (abstractC65852TvD == null) {
                                str = "onPageChangeListener";
                            } else {
                                viewPager23.A05(abstractC65852TvD);
                                return;
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("slides");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(538700700);
        super.onCreate(bundle);
        this.A01 = new C43748JWj(this, 4);
        C0f9.A09(2068514747, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1722999481);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_thread_null_state, false);
        C0f9.A09(-160181433, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(861582296);
        super.onDestroyView();
        ViewPager2 viewPager2 = this.A02;
        if (viewPager2 == null) {
            str = "viewPager";
        } else {
            AbstractC65852TvD abstractC65852TvD = this.A01;
            if (abstractC65852TvD == null) {
                str = "onPageChangeListener";
            } else {
                viewPager2.A05.A00.remove(abstractC65852TvD);
                C0f9.A09(-1007891853, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
