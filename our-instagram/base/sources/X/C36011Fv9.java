package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.wellbeing.reporting.common.impersonation.SelectVictimSearchBottomSheetFragment;

/* renamed from: X.Fv9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36011Fv9 implements InterfaceC11380iw, InterfaceC71990XEd, GYT {
    public static final String __redex_internal_original_name = "DirectGenericSearchController";
    public C36683GFd A00;
    public InterfaceC169517hR A01;
    public SearchController A02;
    public String A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final AbstractC018607g A07;
    public final C5e4 A08;
    public final UserSession A09;
    public final InterfaceC132405yL A0A;
    public final boolean A0B;
    public final SelectVictimSearchBottomSheetFragment A0C;

    @Override // X.InterfaceC71990XEd
    public final float Aby(SearchController searchController, Integer num) {
        return 0.0f;
    }

    @Override // X.InterfaceC71990XEd
    public final void Cwf(SearchController searchController, Integer num, float f, float f2) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DTR() {
    }

    @Override // X.InterfaceC71990XEd
    public final void DTT() {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjB(SearchController searchController, boolean z) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjP(String str, boolean z) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DoO(SearchController searchController, Integer num, Integer num2) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "DIRECT_GENERIC_SEARCH_USER_CONTROLLER";
    }

    @Override // X.InterfaceC71990XEd
    public final void DEw() {
        SearchController searchController = this.A02;
        if (searchController != null) {
            searchController.A00();
        }
        AbstractC71170Wp5 abstractC71170Wp5 = this.A0C.A01;
        if (abstractC71170Wp5 != null) {
            ((C33313Eo8) abstractC71170Wp5).A00.A04.A08();
        }
    }

    @Override // X.GYT
    public final void DjF() {
        this.A01.getClass();
        this.A01.EKu();
    }

    @Override // X.InterfaceC71990XEd
    public final void DjS(String str, String str2) {
        InterfaceC169517hR interfaceC169517hR = this.A01;
        if (interfaceC169517hR != null) {
            interfaceC169517hR.Eby(str);
        }
    }

    public C36011Fv9(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC132405yL interfaceC132405yL, SelectVictimSearchBottomSheetFragment selectVictimSearchBottomSheetFragment, int i, int i2, boolean z) {
        this.A06 = context;
        this.A09 = userSession;
        this.A0A = interfaceC132405yL;
        this.A07 = abstractC018607g;
        this.A05 = i;
        this.A0B = z;
        this.A08 = AbstractC121115e3.A00(userSession);
        this.A0C = selectVictimSearchBottomSheetFragment;
        this.A04 = i2;
    }
}
