package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.7kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171497kf extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FanClubSubscribeInLiveBottomSheetFragment";
    public InterfaceC171487ke A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fan_club_subscribe_in_live_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A01.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-557134145);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.iglive_fan_club_subscribe_in_live_bottom_sheet, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.subscribe_in_live_headline);
        C14360o3.A07(requireViewById);
        IgdsHeadline igdsHeadline = (IgdsHeadline) requireViewById;
        Context context = inflate.getContext();
        igdsHeadline.setImageDrawable(context.getDrawable(R.drawable.ig_illustrations_illo_subscriber_crown_badge_refresh));
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline(context.getString(2131974801));
        igdsHeadline.setBody(context.getString(2131974800));
        View requireViewById2 = inflate.requireViewById(R.id.subscribe_in_live_setting_bottom_button);
        C14360o3.A07(requireViewById2);
        ((C64P) requireViewById2).setPrimaryAction(context.getString(2131974799), new ARB(this));
        C0f9.A09(1662335975, A02);
        return inflate;
    }
}
