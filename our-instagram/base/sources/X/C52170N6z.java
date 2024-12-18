package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N6z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52170N6z extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC37189Ga0, InterfaceC60122ou, InterfaceC37188GZz {
    public static final String __redex_internal_original_name = "StoryCommentsDashboardFragment";
    public List A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A06 = C1XM.A00(C57506Pfg.A00);

    @Override // X.InterfaceC37189Ga0
    public final void CtN() {
    }

    @Override // X.InterfaceC37188GZz
    public final void Dit() {
    }

    @Override // X.InterfaceC37189Ga0
    public final void F9G(C38266GsB c38266GsB) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "story_comments_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C57159PZd c57159PZd = new C57159PZd(viewLifecycleOwner, c07s, this, null, 35);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, c57159PZd, A00);
        AbstractC23641Du.A05(anonymousClass191, new C57159PZd(A0K, c07s, this, null, 36), C07Y.A00(A0K));
    }

    @Override // X.InterfaceC37188GZz
    public final void Chd() {
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A04);
        AbstractC166987dD.A1Z(new PXT(A0Z, null, 20), AbstractC141776au.A00(A0Z));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C52170N6z() {
        C57237PbL c57237PbL = new C57237PbL(this, 15);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57237PbL(new C57237PbL(this, 12), 13));
        this.A04 = AbstractC25225BEi.A0a(new C57237PbL(A00, 14), c57237PbL, new D8I(43, null, A00), AbstractC25225BEi.A1D(C51046Mgy.class));
        this.A01 = C1XM.A00(new C57237PbL(this, 10));
        this.A05 = C1XM.A00(new C57237PbL(this, 16));
        this.A00 = AbstractC166987dD.A1E();
        this.A02 = AbstractC09440dt.A01(new C57237PbL(this, 11));
    }

    public static final List A00(List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51640MrX c51640MrX = (C51640MrX) it.next();
            String str = c51640MrX.A06;
            ImageUrl imageUrl = c51640MrX.A01;
            String str2 = c51640MrX.A04;
            String str3 = c51640MrX.A05;
            Long l = c51640MrX.A03;
            boolean z = c51640MrX.A07;
            boolean z2 = c51640MrX.A08;
            A0q.add(new C56118Ovd(imageUrl, c51640MrX.A02, l, str, str2, str3, c51640MrX.A00, z, z2, c51640MrX.A09));
        }
        return A0q;
    }

    @Override // X.InterfaceC37188GZz
    public final boolean CL7() {
        return ((C51726Mt3) C51046Mgy.A00(AbstractC50523MSb.A0O(this))).A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (((X.C51726Mt3) X.C51046Mgy.A00(r3)).A09 != false) goto L6;
     */
    @Override // X.InterfaceC37189Ga0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CtK(X.C38266GsB r5) {
        /*
            r4 = this;
            X.Mgy r3 = X.AbstractC50523MSb.A0O(r4)
            java.util.List r2 = r3.A05
            r1 = 1
            X.DHH r0 = new X.DHH
            r0.<init>(r5, r1)
            X.AnonymousClass016.A1A(r2, r0)
            java.lang.Object r0 = X.C51046Mgy.A00(r3)
            X.Mt3 r0 = (X.C51726Mt3) r0
            boolean r0 = r0.A08
            if (r0 != 0) goto L24
            java.lang.Object r0 = X.C51046Mgy.A00(r3)
            X.Mt3 r0 = (X.C51726Mt3) r0
            boolean r1 = r0.A09
            r0 = 0
            if (r1 == 0) goto L25
        L24:
            r0 = 1
        L25:
            X.C51046Mgy.A04(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52170N6z.CtK(X.GsB):void");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131963679));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        int A02 = C0f9.A02(-423815173);
        Context context = getContext();
        if (context != null) {
            recyclerView = new RecyclerView(context, null);
            ((C57112jm) AbstractC166987dD.A17(this.A06)).A08(recyclerView, C71163Hc.A00(this), new InterfaceC57142jp[0]);
            MSZ.A13(recyclerView);
            Context context2 = recyclerView.getContext();
            AbstractC31174DnI.A15(context2, recyclerView);
            AbstractC37304Gc5.A10(recyclerView, this.A01);
            recyclerView.A14((C1I4) this.A02.getValue());
            AbstractC31172DnG.A1B(context2, recyclerView, AbstractC53242c7.A0H(context2, R.attr.igds_color_primary_background));
        } else {
            recyclerView = null;
        }
        C0f9.A09(1174437371, A02);
        return recyclerView;
    }
}
