package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class GFg implements InterfaceC169507hQ, GZD {
    public InterfaceC169517hR A00;
    public boolean A01;
    public final View A02;
    public final UserSession A03;
    public final IgdsInlineSearchBox A04;
    public final Context A05;
    public final AbstractC018607g A06;
    public final EQ8 A07;

    public final void A00() {
        this.A01 = false;
        this.A02.setVisibility(8);
        IgdsInlineSearchBox igdsInlineSearchBox = this.A04;
        igdsInlineSearchBox.A0E.setText("");
        igdsInlineSearchBox.A03();
        this.A07.A01();
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        EQ8 eq8;
        C14360o3.A0B(interfaceC169517hR, 0);
        if (this.A01) {
            String BjQ = interfaceC169517hR.BjQ();
            if (BjQ == null || BjQ.length() == 0) {
                eq8 = this.A07;
                List list = eq8.A0E;
                if (AbstractC166987dD.A1b(AbstractC31173DnH.A0L(list))) {
                    eq8.clear();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C32069E6v.A00(eq8, it);
                    }
                    eq8.notifyDataSetChangedSmart();
                }
            }
            eq8 = this.A07;
            List A0m = AbstractC31171DnF.A0m(interfaceC169517hR);
            boolean isLoading = interfaceC169517hR.isLoading();
            C14360o3.A0B(A0m, 0);
            eq8.clear();
            if (isLoading) {
                eq8.addModel(eq8.A0F.getValue(), eq8.A0G.getValue(), eq8.A0C);
            } else if (A0m.isEmpty()) {
                eq8.addModel(eq8.A07.getString(2131968660), eq8.A0B);
            } else {
                Iterator it2 = A0m.iterator();
                while (it2.hasNext()) {
                    User A15 = AbstractC25226BEj.A15(it2);
                    List list2 = eq8.A0D;
                    boolean z = false;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            } else if (C14360o3.A0K(((C32069E6v) it3.next()).A02, A15)) {
                                z = true;
                                break;
                            }
                        }
                    }
                    eq8.addModel(new C32069E6v(A15, z, eq8.A04), eq8.A08);
                }
            }
            eq8.notifyDataSetChangedSmart();
        }
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC169517hR interfaceC169517hR = this.A00;
        if (interfaceC169517hR != null) {
            interfaceC169517hR.Eby(str);
        } else {
            C14360o3.A0F("searchProvider");
            throw C00O.createAndThrow();
        }
    }

    public final void A01(String str, String str2) {
        String A00 = MSV.A00(28);
        C169127gl A002 = AbstractC169097gi.A00(new C35880Fsu(this, 4), this.A03, new C61972ry(this.A05, this.A06, null), new C36693GFo(this, str2, str, 1), A00, null, true);
        this.A00 = A002;
        A002.EYJ(this);
    }

    public GFg(Context context, View view, AbstractC018607g abstractC018607g, UserSession userSession, IgdsInlineSearchBox igdsInlineSearchBox, EQ8 eq8, String str) {
        AbstractC167017dG.A1R(userSession, igdsInlineSearchBox);
        this.A05 = context;
        this.A03 = userSession;
        this.A04 = igdsInlineSearchBox;
        this.A02 = view;
        this.A06 = abstractC018607g;
        this.A07 = eq8;
        A01("users/search/", str == null ? "top_search_page" : str);
        igdsInlineSearchBox.A02 = this;
        C37088GVx c37088GVx = C37088GVx.A00;
        C14360o3.A0B(c37088GVx, 0);
        this.A04.A00 = new ViewOnFocusChangeListenerC35693FpT(1, c37088GVx, this);
        GUM gum = GUM.A00;
        C14360o3.A0B(gum, 0);
        ViewOnClickListenerC35687FpM.A00(this.A02, 51, gum, this);
    }
}
