package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes9.dex */
public final class N70 extends AbstractC59962oe implements InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitMenuSheetFragment";
    public C189478aR A00;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C57248PbW(this, 42));
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(new C57248PbW(this, 43), new C57248PbW(this, 44), C57535Pg9.A00(null, this, 22), AbstractC25225BEi.A1D(C51053Mh7.class));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC55033OXz.A01(this, C05F.A02);
        C51851Mvt c51851Mvt = (C51851Mvt) MSW.A0l(this.A02).A0M.getValue();
        int i = 1;
        int i2 = 0;
        if (c51851Mvt == null || c51851Mvt.A00 != MediaKitVisibility.A05) {
            i = 0;
        }
        AbstractC166997dE.A0S(view, R.id.mk_option_private_visibility_message).setVisibility(AbstractC167007dF.A05(i ^ 1));
        View A0S = AbstractC166997dE.A0S(view, R.id.mk_share_actions_view);
        if (i == 0) {
            i2 = 8;
        }
        A0S.setVisibility(i2);
        OY0.A01(AbstractC166997dE.A0S(view, R.id.mk_share_action_direct), new C57248PbW(this, 39));
        OY0.A01(AbstractC166997dE.A0S(view, R.id.mk_share_action_share), new C57248PbW(this, 40));
        OY0.A01(AbstractC166997dE.A0S(view, R.id.mk_share_action_link), new C57248PbW(this, 41));
        ViewOnClickListenerC55461OkG.A00(view.requireViewById(R.id.mk_option_edit_media_kit), 66, this);
        ViewOnClickListenerC55461OkG.A00(view.requireViewById(R.id.mk_option_visibility_media_kit), 67, this);
        int color = requireContext().getColor(AbstractC53242c7.A03(view.getContext()));
        IgdsListCell igdsListCell = (IgdsListCell) view.requireViewById(R.id.mk_option_delete_media_kit);
        Drawable drawable = requireContext().getDrawable(R.drawable.instagram_delete_pano_outline_24);
        if (drawable != null) {
            igdsListCell.A0A(drawable, Integer.valueOf(color));
        }
        AbstractC166997dE.A0T(igdsListCell.getTextCellView(), R.id.igds_textcell_title).setTextColor(color);
        ViewOnClickListenerC55461OkG.A00(igdsListCell, 68, this);
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return (C54780OIu) this.A03.getValue();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(501383888);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_kit_menu_sheet_fragment, viewGroup, false);
        C0f9.A09(4547202, A02);
        return inflate;
    }
}
