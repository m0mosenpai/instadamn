package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.regex.Pattern;

/* renamed from: X.Wny, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71102Wny implements C88U {
    public boolean A00;
    public final C208199Jd A01 = new C208199Jd();
    public final XB5 A02 = new C71010WmR(this);
    public final /* synthetic */ V4T A03;
    public final /* synthetic */ C6FG A04;
    public final /* synthetic */ SearchEditText A05;

    @Override // X.C88U
    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        C14360o3.A0B(str, 1);
        if (!AbstractC001900j.A0T(str)) {
            V4T v4t = this.A03;
            if (!v4t.A00) {
                V4T.A00(v4t, str);
            }
        }
    }

    @Override // X.C88U
    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        UserSession userSession;
        C14360o3.A0B(searchEditText, 0);
        AbstractC12990ll A0A = C6BQ.A0A(this.A04);
        if ((A0A instanceof UserSession) && (userSession = (UserSession) A0A) != null) {
            String searchString = searchEditText.getSearchString();
            Pattern pattern = AbstractC13670mt.A00;
            if (searchString != null && searchString.length() >= 2) {
                C1ON A00 = U3F.A00(userSession, searchString, "meta_ai_qp", null, null, "fbsearch/keyword_typeahead/", 1);
                A00.A00 = new EUP(searchString, this, 0);
                C1GJ.A06(A00, 879992394, 1, true, true);
                A00(this);
            }
        }
    }

    public C71102Wny(V4T v4t, C6FG c6fg, SearchEditText searchEditText) {
        this.A03 = v4t;
        this.A04 = c6fg;
        this.A05 = searchEditText;
    }

    public static final void A00(C71102Wny c71102Wny) {
        XB5 xb5 = c71102Wny.A02;
        SearchEditText searchEditText = c71102Wny.A05;
        Boolean CYf = xb5.CYf(searchEditText.getSearchString());
        V4T v4t = c71102Wny.A03;
        String searchString = searchEditText.getSearchString();
        Pattern pattern = AbstractC13670mt.A00;
        int A0A = AbstractC167007dF.A0A(searchString);
        boolean z = false;
        if (A0A > 2 && (CYf == null ? !c71102Wny.A00 : CYf.equals(false))) {
            z = true;
        }
        v4t.A00 = z;
        searchEditText.setDisableButtonsForIntegrity(z);
    }
}
