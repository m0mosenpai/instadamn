package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import com.instagram.user.model.User;
import java.util.Collection;

/* renamed from: X.N7z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52186N7z extends AbstractC43842Ja5 implements InterfaceC71994XEi, GZS {
    public static final String __redex_internal_original_name = "IgLiveAddModeratorFragment";
    public InterfaceC71994XEi A00;
    public TypeaheadHeader A01;
    public String A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void CuK(User user) {
    }

    @Override // X.InterfaceC71994XEi
    public final void CvT(User user, String str) {
        AbstractC167017dG.A1N(user, str);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A04);
        AbstractC166987dD.A1Z(new PZQ(user, A0Z, str, null, 25), AbstractC141776au.A00(A0Z));
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void D1s(User user) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DHz(String str) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DN5(User user, Integer num) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DOl() {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DTp(GZU gzu, User user) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void Df6(User user) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void Dxl(String str) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void E1r(C1P1 c1p1, AbstractC53633Nne abstractC53633Nne, User user, Integer num) {
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new C52350NEo(C57729PjI.A00), new V5U(this, AbstractC166987dD.A0r(this.A03), null, EnumC142806cg.A03, this, C57731PjK.A00));
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewStub A07 = AbstractC31171DnF.A07(view, R.id.recycler_top_view_stub);
        A07.setLayoutResource(R.layout.top_search_bar);
        A07.inflate();
        TypeaheadHeader typeaheadHeader = (TypeaheadHeader) view.findViewById(R.id.search_typeahead_header);
        this.A01 = typeaheadHeader;
        String str = "searchTypeahead";
        if (typeaheadHeader != null) {
            typeaheadHeader.A03(AbstractC25227BEk.A0v(this, 2131972993));
            TypeaheadHeader typeaheadHeader2 = this.A01;
            if (typeaheadHeader2 != null) {
                typeaheadHeader2.A01 = this;
                SearchEditText searchEditText = typeaheadHeader2.A00;
                str = "searchEditText";
                if (searchEditText != null) {
                    searchEditText.A05();
                    SearchEditText searchEditText2 = typeaheadHeader2.A00;
                    if (searchEditText2 != null) {
                        searchEditText2.A06();
                        InterfaceC09390do interfaceC09390do = this.A04;
                        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), AbstractC31172DnG.A0E(((C52883Nae) interfaceC09390do.getValue()).A05), C57755Pji.A02(this, 23), 31);
                        ((C52883Nae) interfaceC09390do.getValue()).A07();
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.GZS
    public final void registerTextViewLogging(TextView textView) {
    }

    @Override // X.GZS
    public final void searchTextChanged(String str) {
        C14360o3.A0B(str, 0);
        int length = str.length();
        C52883Nae c52883Nae = (C52883Nae) this.A04.getValue();
        if (length > 0) {
            AbstractC166997dE.A1Y(c52883Nae.A06, AbstractC167007dF.A1O(length));
            PZ1.A01(c52883Nae, str, AbstractC141776au.A00(c52883Nae), 36);
        } else {
            c52883Nae.A07();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A02;
        if (str == null) {
            C14360o3.A0F(CacheBehaviorLogger.SOURCE);
            throw C00O.createAndThrow();
        }
        if (str.equals("ufi_action_sheet")) {
            return "IgLiveAddModeratorFragment_from_ufi_action_sheet";
        }
        return "IgLiveAddModeratorFragment_from_comment";
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C57732PjL.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C52186N7z() {
        C57555PgT c57555PgT = new C57555PgT(this, 10);
        InterfaceC09390do A01 = C57555PgT.A01(new C57555PgT(this, 7), EnumC09460dv.A02, 8);
        this.A04 = AbstractC25225BEi.A0a(new C57555PgT(A01, 9), c57555PgT, C57530Pg4.A00(null, A01, 18), AbstractC25225BEi.A1D(C52883Nae.class));
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2084094999);
        super.onCreate(bundle);
        this.A02 = requireArguments().getString("live_add_moderator_tap_source", "0");
        C0f9.A09(-1488660524, A02);
    }
}
