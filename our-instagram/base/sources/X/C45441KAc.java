package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.KAc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45441KAc extends AbstractC45465KBa {
    public static final String __redex_internal_original_name = "AvatarMusicStickerGridFragment";
    public EnumC143286dT A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public String A04;
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(new C57526Pg0(this, 38), new C57526Pg0(this, 36), new C57531Pg5(7, null, this), AbstractC25225BEi.A1D(C50904MeZ.class));
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    @Override // X.AbstractC45465KBa, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.avatar_sticker_grid_container);
        if (findViewById != null) {
            AbstractC31172DnG.A1B(requireContext(), findViewById, R.color.grey_10);
        }
        TextView A0e = AbstractC166987dD.A0e(view, R.id.avatar_sticker_grid_empty_text_view);
        if (A0e != null) {
            AbstractC166987dD.A1O(requireContext(), A0e, R.color.grey_4);
        }
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.avatar_sticker_grid_editor_button);
        if (A0e2 != null) {
            AbstractC166987dD.A1O(requireContext(), A0e2, R.color.grey_4);
        }
        ImageView A08 = AbstractC31171DnF.A08(view, R.id.avatar_sticker_grid_back_button);
        if (A08 != null) {
            AbstractC31173DnH.A11(requireContext(), A08, R.color.grey_4);
        }
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.findViewById(R.id.avatar_sticker_grid_search_box);
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.setTextColor(requireContext().getColor(R.color.grey_0));
            igdsInlineSearchBox.setClearButtonColor(requireContext().getColor(R.color.grey_0));
            igdsInlineSearchBox.setSearchGlyphColor(requireContext().getColor(R.color.grey_0));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A04;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return AnonymousClass001.A0R(str, "_avatar_sticker_grid");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public C45441KAc() {
        C57526Pg0 c57526Pg0 = new C57526Pg0(this, 37);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57526Pg0(new C57526Pg0(this, 39), 40));
        this.A06 = AbstractC25225BEi.A0a(new C57526Pg0(A00, 41), c57526Pg0, new C57531Pg5(8, null, A00), AbstractC25225BEi.A1D(C143266dR.class));
        this.A03 = true;
        this.A02 = true;
        this.A00 = EnumC143286dT.A0A;
        this.A01 = "ig_music_search";
        this.A07 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        int A02 = C0f9.A02(-1751662395);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("args_previous_module_name")) != null) {
            this.A04 = string;
            int i = 3;
            if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A07), 36319441750924724L)) {
                i = 4;
            }
            super.A00 = i;
            C0f9.A09(-1133944565, A02);
            return;
        }
        IllegalStateException A14 = AbstractC166987dD.A14("previous module required");
        C0f9.A09(-1412285141, A02);
        throw A14;
    }
}
