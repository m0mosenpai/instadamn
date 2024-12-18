package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.KAg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45445KAg extends AbstractC45465KBa implements InterfaceC11380iw, InterfaceC50395MMx {
    public static final String __redex_internal_original_name = "AvatarStickerPickerFragment";
    public boolean A02;
    public String A03;
    public boolean A04;
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(new MHQ(this, 8), new MHQ(this, 6), new B61(10, null, this), AbstractC25225BEi.A1D(C44500Jm6.class));
    public final InterfaceC09390do A06 = MHQ.A00(this, 7);
    public EnumC143286dT A00 = EnumC143286dT.A0F;
    public String A01 = "ig_stories_creation";
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC45465KBa, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC31172DnG.A1B(view.getContext(), view.findViewById(R.id.avatar_sticker_grid_container), R.color.fds_transparent);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.avatar_sticker_grid_empty_text_view);
        if (A0e != null) {
            AbstractC166987dD.A1O(requireContext(), A0e, R.color.design_dark_default_color_on_background);
        }
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.avatar_sticker_grid_editor_button);
        if (A0e2 != null) {
            AbstractC166987dD.A1O(requireContext(), A0e2, R.color.design_dark_default_color_on_background);
        }
        ImageView A08 = AbstractC31171DnF.A08(view, R.id.avatar_sticker_grid_back_button);
        if (A08 != null) {
            AbstractC31173DnH.A11(requireContext(), A08, R.color.design_dark_default_color_on_background);
        }
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.findViewById(R.id.avatar_sticker_grid_search_box);
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.setTextColor(requireContext().getColor(R.color.design_dark_default_color_on_background));
            igdsInlineSearchBox.setClearButtonColor(requireContext().getColor(R.color.design_dark_default_color_on_background));
            igdsInlineSearchBox.setSearchGlyphColor(requireContext().getColor(R.color.design_dark_default_color_on_background));
            igdsInlineSearchBox.setHintColor(requireContext().getColor(R.color.design_dark_default_color_on_background));
        }
        InterfaceC09390do interfaceC09390do = this.A0T;
        if (((C44543Jmn) interfaceC09390do.getValue()).A0A) {
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC166987dD.A1Z(new MC8(c07s, this, viewLifecycleOwner, null, 45), C07Y.A00(viewLifecycleOwner));
            ((IgdsInlineSearchBox) view.findViewById(R.id.avatar_sticker_grid_search_box)).setHints(AbstractC43592JPx.A13(requireContext().getString(2131953542), requireContext().getString(2131953488)));
        }
        boolean z = this.A02;
        C44543Jmn c44543Jmn = (C44543Jmn) interfaceC09390do.getValue();
        if (z) {
            str = "ig_stories_consumption";
        } else {
            str = "ig_stories_creation";
        }
        c44543Jmn.A06 = str;
        AbstractC43593JPy.A0S(this).A00 = str;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A03;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x007b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC25230BEn.A0k(r8.A07, 0), 36321460385818072L) != false) goto L10;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = -423883018(0xffffffffe6bc0ef6, float:-4.4404044E23)
            int r4 = X.C0f9.A02(r0)
            super.onCreate(r9)
            android.os.Bundle r2 = r8.requireArguments()
            java.lang.String r0 = "args_previous_module_name"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L95
            r8.A03 = r0
            java.lang.String r0 = "args_is_from_mentions_consumption_bottom_sheet"
            boolean r0 = r2.getBoolean(r0)
            r8.A02 = r0
            java.lang.String r0 = "args_is_in_story"
            boolean r0 = r2.getBoolean(r0)
            r8.A04 = r0
            X.0do r7 = r8.A0T
            java.lang.Object r1 = r7.getValue()
            X.Jmn r1 = (X.C44543Jmn) r1
            java.lang.String r0 = "args_mentioned_user_ids"
            java.util.ArrayList r0 = r2.getStringArrayList(r0)
            r1.A08 = r0
            X.Jm6 r1 = X.AbstractC43593JPy.A0S(r8)
            X.0do r0 = r8.A06
            java.lang.String r5 = X.AbstractC25225BEi.A15(r0)
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            X.0do r0 = r1.A02
            java.lang.Object r2 = r0.getValue()
            X.LA9 r2 = (X.LA9) r2
            java.lang.Integer r1 = X.C05F.A01
            java.lang.Integer r0 = X.C05F.A00
            r2.A02(r1, r0, r5)
            r6 = 1
            r8.A0L = r6
            r8.A0N = r6
            r8.A0H = r6
            java.lang.Object r5 = r7.getValue()
            X.Jmn r5 = (X.C44543Jmn) r5
            boolean r0 = r8.A04
            if (r0 == 0) goto L93
            boolean r0 = r8.A02
            if (r0 != 0) goto L93
            X.0do r0 = r8.A07
            X.0ll r3 = X.AbstractC25230BEn.A0k(r0, r3)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321460385818072(0x810a2d000525d8, double:3.0331760305485414E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L93
        L7d:
            r5.A0A = r6
            r0 = 4
            r8.A00 = r0
            java.lang.Object r0 = r7.getValue()
            X.Jmn r0 = (X.C44543Jmn) r0
            boolean r0 = r0.A0A
            r8.A0I = r0
            r0 = 684983134(0x28d4035e, float:2.3538188E-14)
            X.C0f9.A09(r0, r4)
            return
        L93:
            r6 = 0
            goto L7d
        L95:
            java.lang.String r0 = "previous module required"
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A14(r0)
            r0 = 35793470(0x2222a3e, float:1.1914003E-37)
            X.C0f9.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45445KAg.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC45465KBa, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(19862782);
        super.onDestroyView();
        C44500Jm6 A0S = AbstractC43593JPy.A0S(this);
        String A15 = AbstractC25225BEi.A15(this.A06);
        String str = AbstractC43593JPy.A0K(this).A05;
        C14360o3.A0B(A15, 0);
        ((LA9) A0S.A02.getValue()).A03(A15, str);
        C0f9.A09(-1284983154, A02);
    }
}
