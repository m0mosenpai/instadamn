package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.ILc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41189ILc {
    public final Context A00;
    public final C38370Gu6 A01;
    public final J1J A02;

    public C41189ILc(AbstractC59962oe abstractC59962oe, UserSession userSession, JPi jPi, Integer num, String str, String str2) {
        this.A00 = abstractC59962oe.requireContext();
        J1J j1j = new J1J(abstractC59962oe, userSession, this, str, str2);
        this.A02 = j1j;
        final String moduleName = abstractC59962oe.getModuleName();
        this.A01 = new C38370Gu6(new InterfaceC11380iw() { // from class: X.Imz
            public static final String __redex_internal_original_name = "QuestionResponsesListHelper$$ExternalSyntheticLambda0";

            @Override // X.InterfaceC11380iw
            public final String getModuleName() {
                return moduleName;
            }
        }, userSession, jPi, j1j, num);
    }

    public final void A00(RecyclerView recyclerView, int i, int i2) {
        recyclerView.setAdapter(this.A01);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.A00, 2);
        gridLayoutManager.A01 = new C37922GmJ(this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.A14(new C153156uj(gridLayoutManager, this.A02, C153146ui.A0A));
        recyclerView.A10(new C38379GuG(this, i2, i, 3));
    }
}
