package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes6.dex */
public final class EVR extends AbstractC60592pi implements InterfaceC37192Ga3, InterfaceC37163GZa, GYQ, InterfaceC71293Hq {
    public String A00;
    public boolean A04;
    public final AbstractC018607g A06;
    public final C34720FRh A07;
    public final C34408FEy A08;
    public final C35210Fg2 A09;
    public final UserSession A0A;
    public final WeakReference A0B;
    public final EQA A0C;
    public final WeakReference A0D;
    public boolean A05 = false;
    public boolean A03 = true;
    public List A01 = AbstractC166987dD.A1E();
    public List A02 = AbstractC166987dD.A1E();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.1vN] */
    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
        this.A03 = true;
        ImmutableList A00 = this.A07.A00();
        ELS els = this.A08.A00;
        Context context = els.getContext();
        Context requireContext = els.requireContext();
        InterfaceC09390do interfaceC09390do = els.A0B;
        C50674MYs A0W = AbstractC31177DnL.A0W(requireContext, interfaceC09390do);
        A0W.A07(els.getString(2131953191));
        A0W.A09(AbstractC25227BEk.A0v(els, 2131972177), new ViewOnClickListenerC35683FpI(21, A00, els));
        A0W.A0B(AbstractC25227BEk.A0v(els, 2131954754), ViewOnClickListenerC35652Fom.A00);
        if (context != null) {
            C31727DwY.A01(context, A0W);
        }
        ELS.A00(els);
        AbstractC31176DnK.A0Q(interfaceC09390do).E4s(new Object());
    }

    @Override // X.InterfaceC37163GZa
    public final void CzA() {
        this.A03 = false;
        C31349DqE c31349DqE = this.A08.A00.A04;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
        }
        A02();
    }

    @Override // X.InterfaceC37163GZa
    public final void DPE(int i) {
    }

    public EVR(Context context, View view, AbstractC018607g abstractC018607g, LinearLayoutManager linearLayoutManager, C34720FRh c34720FRh, C34408FEy c34408FEy, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A0B = AbstractC25225BEi.A16(context);
        this.A0A = userSession;
        this.A06 = abstractC018607g;
        this.A08 = c34408FEy;
        this.A07 = c34720FRh;
        C35210Fg2 c35210Fg2 = new C35210Fg2(context, abstractC018607g, c34720FRh, this, interfaceC11380iw, userSession, str);
        this.A09 = c35210Fg2;
        EQA eqa = new EQA(context, c35210Fg2, interfaceC11380iw, userSession, this, C05F.A1F);
        this.A0C = eqa;
        eqa.setHasStableIds(true);
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        A0F.setLayoutManager(linearLayoutManager);
        A0F.setAdapter(eqa);
        A0F.setClipToPadding(false);
        A0F.setItemAnimator(null);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) view.requireViewById(R.id.refreshable_container);
        refreshableNestedScrollingParent.A07 = this;
        refreshableNestedScrollingParent.A08 = new C70523Eo(refreshableNestedScrollingParent, false);
        this.A0D = AbstractC25225BEi.A16(refreshableNestedScrollingParent);
    }

    public static void A00(EVR evr) {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) evr.A0D.get();
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        ELS els = evr.A08.A00;
        els.A06 = false;
        ELS.A00(els);
    }

    public static void A01(EVR evr) {
        Context context = (Context) evr.A0B.get();
        if (context != null) {
            C9GR.A07(context, 2131952090);
            evr.A0C.A01(context, ViewOnClickListenerC35679FpE.A00(evr, 18), EnumC153216up.A04);
        }
    }

    public final void A02() {
        EQA eqa = this.A0C;
        C34720FRh c34720FRh = this.A07;
        eqa.A02(this.A00, AbstractC31173DnH.A0L(c34720FRh.A01), AbstractC31173DnH.A0L(c34720FRh.A00), this.A05);
    }

    public final void A03(boolean z) {
        Context context = (Context) this.A0B.get();
        if (context != null) {
            this.A04 = true;
            if (z) {
                this.A0C.A01(context, null, EnumC153216up.A06);
            }
            AbstractC018607g abstractC018607g = this.A06;
            C25621Ms A0D = AbstractC31179DnN.A0D(this.A0A);
            A0D.A0B("friendships/feed_favorites/");
            A0D.A0A = "feed_favorites";
            A0D.A04();
            C32548EUy.A00(context, abstractC018607g, AbstractC25227BEk.A0e(A0D, C168027ex.class, C168037ey.class), this, 38);
        }
    }

    @Override // X.InterfaceC37192Ga3
    public final boolean AFn() {
        return !this.A04;
    }

    @Override // X.InterfaceC37163GZa
    public final void DPD() {
        ELS.A00(this.A08.A00);
    }

    @Override // X.InterfaceC71293Hq
    public final void DeM() {
        this.A08.A00.A06 = true;
        A03(false);
    }

    @Override // X.InterfaceC37192Ga3
    public final void DsF() {
        C31349DqE c31349DqE = this.A08.A00.A04;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
        }
    }

    @Override // X.InterfaceC37192Ga3
    public final void DsM() {
        C31349DqE c31349DqE = this.A08.A00.A04;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        C35210Fg2 c35210Fg2 = this.A09;
        c35210Fg2.A05(this.A0C);
        c35210Fg2.A05(this);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        C35210Fg2 c35210Fg2 = this.A09;
        EQA eqa = this.A0C;
        java.util.Set set = c35210Fg2.A06;
        set.add(AbstractC25225BEi.A16(eqa));
        set.add(AbstractC25225BEi.A16(this));
    }

    @Override // X.InterfaceC37192Ga3
    public final boolean CZb() {
        return this.A05;
    }
}
