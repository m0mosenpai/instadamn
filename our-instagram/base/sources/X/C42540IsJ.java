package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.refinement.model.Refinement;
import java.util.List;

/* renamed from: X.IsJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42540IsJ implements AnonymousClass309, InterfaceC43407JFx, InterfaceC43408JFy {
    public static final String __redex_internal_original_name = "RefinementsController";
    public final RecyclerView A00;
    public final Context A01;
    public final LinearLayoutManager A02;
    public final AbstractC59962oe A03;
    public final InterfaceC43403JFt A04;
    public final C38363Gtz A05;
    public final boolean A06;

    @Override // X.InterfaceC43407JFx
    public final void ClG(Refinement refinement, int i) {
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r3.A05.getItemCount() <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r2 = r3.A00
            boolean r0 = r3.A06
            if (r0 == 0) goto Lf
            X.Gtz r0 = r3.A05
            int r1 = r0.getItemCount()
            r0 = 0
            if (r1 > 0) goto L11
        Lf:
            r0 = 8
        L11:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42540IsJ.A00():void");
    }

    public final void A01(List list) {
        C38363Gtz c38363Gtz = this.A05;
        c38363Gtz.A00 = new C51755Mte(list, 18);
        c38363Gtz.notifyDataSetChanged();
        RecyclerView recyclerView = this.A00;
        int i = 8;
        if (c38363Gtz.getItemCount() > 0) {
            i = 0;
        }
        recyclerView.setVisibility(i);
    }

    @Override // X.InterfaceC43408JFy
    public final void DeK(Refinement refinement, int i) {
        this.A04.DeL(refinement);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03.getModuleName();
    }

    public C42540IsJ(RecyclerView recyclerView, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC43403JFt interfaceC43403JFt, List list, boolean z) {
        AbstractC167017dG.A1Q(userSession, recyclerView);
        this.A03 = abstractC59962oe;
        this.A00 = recyclerView;
        this.A04 = interfaceC43403JFt;
        this.A06 = z;
        Context A0L = AbstractC166997dE.A0L(recyclerView);
        this.A01 = A0L;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(A0L, 0, false);
        this.A02 = linearLayoutManager;
        C57112jm A0N = AbstractC31180DnO.A0N();
        C38363Gtz c38363Gtz = new C38363Gtz(this, new IEU(A0N, this));
        this.A05 = c38363Gtz;
        c38363Gtz.A00 = new C51755Mte(list, 18);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c38363Gtz);
        C14360o3.A0A(list);
        recyclerView.setVisibility(list.isEmpty() ? 8 : 0);
        AbstractC38152GqJ.A01(recyclerView);
        AbstractC37301Gc2.A0v(recyclerView, A0N, abstractC59962oe);
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        return AbstractC37300Gc1.A0B();
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        return AbstractC37300Gc1.A0B();
    }
}
