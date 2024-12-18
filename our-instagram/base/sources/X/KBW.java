package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class KBW extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CommentStickerSuggestionBottomsheetFragment";
    public AvatarStore A00;
    public L3F A01;
    public L3F A02;
    public IgLinearLayout A03;
    public IgdsInlineSearchBox A04;
    public String A05 = "";
    public String A06;
    public boolean A07;
    public final String A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SpinnerImageView spinnerImageView;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgLinearLayout igLinearLayout = (IgLinearLayout) AbstractC166997dE.A0S(view, R.id.root_container);
        this.A03 = igLinearLayout;
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
        this.A04 = igdsInlineSearchBox;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A0E.setText(this.A06);
        }
        AbstractC439921h abstractC439921h = null;
        if (this.A07) {
            A00(this, igLinearLayout, false);
        }
        AvatarStore avatarStore = this.A00;
        if (avatarStore != null) {
            abstractC439921h = avatarStore.A01.A00;
        }
        if (C14360o3.A0K(abstractC439921h, C125535lz.A00)) {
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC166987dD.A1Z(new MC8(c07s, this, viewLifecycleOwner, null, 27), C07Y.A00(viewLifecycleOwner));
        }
        Context requireContext = requireContext();
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        A0R.A01(new KIJ(AbstractC166987dD.A0r(this.A0C)));
        L3F l3f = new L3F(requireContext, A0R, igLinearLayout, 2131974418, false);
        this.A02 = l3f;
        TextView textView = l3f.A01;
        if (textView != null) {
            ViewOnClickListenerC48064LPp.A00(textView, 54, this);
        }
        C07S c07s2 = C07S.STARTED;
        C07X viewLifecycleOwner2 = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner2);
        MC8 mc8 = new MC8(c07s2, this, viewLifecycleOwner2, null, 28);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mc8, A00);
        String str = this.A06;
        if (str != null) {
            ((C166667cc) this.A09.getValue()).A00(str);
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0B);
            AbstractC23641Du.A05(anonymousClass191, new C50120MBu(A0Z, str, null, 34), AbstractC141776au.A00(A0Z));
            L3F l3f2 = this.A02;
            if (l3f2 != null && (spinnerImageView = l3f2.A04) != null) {
                spinnerImageView.setVisibility(0);
            }
        }
        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A04;
        if (igdsInlineSearchBox2 != null) {
            igdsInlineSearchBox2.A02 = new C49485Lty(this, 1);
        }
    }

    public static final void A01(KBW kbw, boolean z) {
        String str;
        Fragment A09;
        C3DN A0l = AbstractC43593JPy.A0l(kbw, C3DN.A00);
        C189478aR A00 = F86.A00(A0l);
        String str2 = kbw.A08;
        KD9 kd9 = new KD9();
        AbstractC25227BEk.A1C(kd9, new C09530e4[]{AbstractC166987dD.A1L("args_entry_surface_module_name", str2)});
        if (z) {
            str = "avatar_tab";
        } else {
            str = "gif_tab";
        }
        InterfaceC09390do interfaceC09390do = kbw.A0C;
        kd9.A00(AbstractC166987dD.A0r(interfaceC09390do), str);
        if (A00 != null) {
            if (A0l != null && (A09 = A0l.A09()) != null) {
                ((BottomSheetFragment) A09).A0T(0);
            }
            C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do);
            A0g.A11 = true;
            AbstractC25225BEi.A1Q(A0g, true);
            A0g.A03 = 0.8f;
            A0g.A0T = kd9;
            A00.A0F(kd9, A0g);
            return;
        }
        if (A0l == null) {
            return;
        }
        A0l.A0K(kd9);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A08;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    public KBW() {
        D89 d89 = new D89(this, 26);
        D89 d892 = new D89(this, 30);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new D89(d892, 31));
        this.A09 = AbstractC25225BEi.A0a(new D89(A00, 32), d89, new D8L(35, null, A00), AbstractC25225BEi.A1D(C166667cc.class));
        D89 d893 = new D89(this, 28);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new D89(new D89(this, 33), 34));
        this.A0B = AbstractC25225BEi.A0a(new D89(A002, 35), d893, new D8L(36, null, A002), AbstractC25225BEi.A1D(C44491Jlx.class));
        this.A0A = AbstractC25225BEi.A0a(new D89(this, 29), new D89(this, 27), new D8L(34, null, this), AbstractC25225BEi.A1D(C167377dr.class));
        this.A08 = "comment_sticker_suggestion_bottomsheet_fragment";
        this.A0C = AbstractC60492pY.A02(this);
    }

    public static final void A00(KBW kbw, IgLinearLayout igLinearLayout, boolean z) {
        Context requireContext = kbw.requireContext();
        C66392zG A0R = AbstractC31174DnI.A0R(kbw);
        A0R.A01(new KII(AbstractC166987dD.A0r(kbw.A0C)));
        L3F l3f = new L3F(requireContext, A0R, igLinearLayout, 2131974417, z);
        kbw.A01 = l3f;
        TextView textView = l3f.A01;
        if (textView != null) {
            ViewOnClickListenerC48064LPp.A00(textView, 53, kbw);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-266388452);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A06 = requireArguments.getString(AbstractC111324zv.A00(3957));
        this.A07 = requireArguments.getBoolean(AbstractC111324zv.A00(3954));
        String string = requireArguments.getString(AbstractC111324zv.A00(3953));
        if (string == null) {
            string = "";
        }
        this.A05 = string;
        this.A00 = C20Y.A00(AbstractC166987dD.A0r(this.A0C));
        C0f9.A09(-27762385, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(929434085);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_comment_sticker_suggestion_bottomsheet_fragment, viewGroup, false);
        C0f9.A09(-1770721915, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1849076007);
        super.onDestroy();
        this.A04 = null;
        this.A03 = null;
        L3F l3f = this.A01;
        if (l3f != null) {
            l3f.A02 = null;
            l3f.A04 = null;
            l3f.A00 = null;
            l3f.A01 = null;
        }
        L3F l3f2 = this.A02;
        if (l3f2 != null) {
            l3f2.A02 = null;
            l3f2.A04 = null;
            l3f2.A00 = null;
            l3f2.A01 = null;
        }
        C0f9.A09(1156234159, A02);
    }
}
