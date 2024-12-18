package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;

/* renamed from: X.Bqv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26714Bqv extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PAHowAdCodesWorkFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A00;
        AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0k, 36330015960351362L)) {
            ((IgdsBulletCell) AbstractC166997dE.A0R(view, R.id.bullet_cell_run_ads)).setText((Integer) 2131952236, (Integer) 2131952235);
            ((IgdsBulletCell) AbstractC166997dE.A0R(view, R.id.bullet_cell_branded_content)).setText((Integer) 2131952228, (Integer) 2131952227);
        }
        if (C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36328620096044729L)) {
            AbstractC166997dE.A0S(view, R.id.bullet_cell_allows_creative_optimizations).setVisibility(0);
            ((IgdsBulletCell) AbstractC166997dE.A0R(view, R.id.bullet_cell_limit_posts_editing)).setText((Integer) 2131952231, (Integer) 2131952229);
        }
        if (C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36329934355972683L)) {
            AbstractC166997dE.A0S(view, R.id.bullet_cell_testimonial).setVisibility(0);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-40273338);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.pa_how_ad_codes_work, viewGroup, false);
        C0f9.A09(1129589784, A02);
        return inflate;
    }
}
