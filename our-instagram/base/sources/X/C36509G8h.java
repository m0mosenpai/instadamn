package X;

import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.G8h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36509G8h implements GZD {
    public final int A00;
    public final Object A01;

    public C36509G8h(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
        switch (this.A00) {
            case 0:
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A01;
                CategorySearchFragment.A08(categorySearchFragment, "clear_category_search_box", null);
                IgdsInlineSearchBox igdsInlineSearchBox = categorySearchFragment.searchBox;
                if (igdsInlineSearchBox != null) {
                    igdsInlineSearchBox.A0E.setText("");
                }
                CategorySearchFragment.A07(categorySearchFragment);
                return;
            case 8:
                EON eon = (EON) this.A01;
                ((C31828Dym) eon.A09.getValue()).A01.A01.Egh(AbstractC25228BEl.A1A(""));
                eon.A05 = true;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        String A16;
        String str2;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C14360o3.A0B(str, 0);
                ((InterfaceC37290Gbr) this.A01).DjR(str);
                return;
            case 2:
                C14360o3.A0B(str, 0);
                if (str.length() == 0) {
                    A16 = null;
                } else {
                    A16 = AbstractC31172DnG.A16(C1Q2.A02(), str);
                }
                FOV fov = (FOV) this.A01;
                InterfaceC169517hR interfaceC169517hR = fov.A01;
                if (interfaceC169517hR != null) {
                    interfaceC169517hR.Eby(A16);
                }
                C35783FrL c35783FrL = fov.A00;
                if (c35783FrL == null) {
                    str2 = "dataController";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                Integer num = C05F.A00;
                C14360o3.A0B(num, 0);
                c35783FrL.A00 = num;
                return;
            case 3:
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                DirectShareSheetFragment.A0C(directShareSheetFragment);
                directShareSheetFragment.DjR(str);
                return;
            case 4:
                C14360o3.A0B(str, 0);
                C31877Dzj c31877Dzj = ((EK4) this.A01).A01;
                if (c31877Dzj == null) {
                    str2 = "adapter";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                List list = c31877Dzj.A01;
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : list) {
                    if (AbstractC001900j.A0a(((C26055Bfi) obj).A03, str, true)) {
                        A1E.add(obj);
                    }
                }
                c31877Dzj.A00 = A1E;
                c31877Dzj.notifyDataSetChanged();
                return;
            case 5:
                C14360o3.A0B(str, 0);
                EME eme = (EME) this.A01;
                EME.A04(eme);
                ((InterfaceC169517hR) eme.A0U.getValue()).Eby(str);
                return;
            case 6:
                C14360o3.A0B(str, 0);
                C36472G6w c36472G6w = (C36472G6w) this.A01;
                ViewOnFocusChangeListenerC35694FpU viewOnFocusChangeListenerC35694FpU = c36472G6w.A01;
                ((C35151Fet) viewOnFocusChangeListenerC35694FpU.A01).A05.DjT(str, AbstractC25229BEm.A1Z(c36472G6w.A03.getTag()));
                return;
            case 7:
                C14360o3.A0B(str, 0);
                E2T e2t = (E2T) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                FanClubMemberListViewModel fanClubMemberListViewModel = (FanClubMemberListViewModel) e2t.A01.A02.getValue();
                fanClubMemberListViewModel.A0G.Egh(str);
                fanClubMemberListViewModel.A06.A01(str);
                return;
            case 8:
                C14360o3.A0B(str, 0);
                EON eon = (EON) this.A01;
                ((C31828Dym) eon.A09.getValue()).A01.A01.Egh(AbstractC25228BEl.A1A(str));
                eon.A05 = true;
                return;
            default:
                C14360o3.A0B(str, 0);
                InterfaceC169517hR interfaceC169517hR2 = ((C32330EMc) this.A01).A08;
                if (interfaceC169517hR2 == null) {
                    str2 = "searchResultsProvider";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                interfaceC169517hR2.Eby(AbstractC13670mt.A01(str));
                return;
        }
    }
}
