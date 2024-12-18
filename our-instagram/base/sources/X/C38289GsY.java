package X;

import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.List;

/* renamed from: X.GsY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38289GsY implements JIJ {
    public final /* synthetic */ ContextualFeedFragment A00;

    @Override // X.JIJ
    public final void DgU(String str, String str2, List list, List list2, boolean z, boolean z2) {
        C14360o3.A0B(list, 1);
        if (z2) {
            HY4 hy4 = this.A00.A0N;
            if (hy4 != null) {
                hy4.A05();
            }
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        ContextualFeedFragment contextualFeedFragment = this.A00;
        HY4 hy42 = contextualFeedFragment.A0N;
        if (hy42 != null) {
            if (hy42 instanceof C38284GsT) {
                C38284GsT c38284GsT = (C38284GsT) hy42;
                ((AbstractC65332xV) ((AbstractC65202xI) c38284GsT).A00).A0B(list);
                C38284GsT.A00(c38284GsT);
            }
            AbstractC37303Gc4.A19(contextualFeedFragment);
            return;
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    public C38289GsY(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.JIJ
    public final void A8t(List list) {
        String str;
        ContextualFeedFragment contextualFeedFragment = this.A00;
        AbstractC37439GeJ abstractC37439GeJ = contextualFeedFragment.A0B;
        if (abstractC37439GeJ == null) {
            str = "contextualFeedController";
        } else {
            boolean A0a = abstractC37439GeJ.A0a();
            str = "adapter";
            HY4 hy4 = contextualFeedFragment.A0N;
            if (A0a) {
                if (hy4 != null) {
                    if (!(hy4 instanceof C37432GeC)) {
                        ((AbstractC65332xV) ((AbstractC65202xI) hy4).A00).A0B(list);
                        return;
                    }
                    return;
                }
            } else if (hy4 != null) {
                if (!(hy4 instanceof C38284GsT)) {
                    return;
                }
                C38284GsT c38284GsT = (C38284GsT) hy4;
                ((AbstractC65332xV) ((AbstractC65202xI) c38284GsT).A00).A0B(list);
                C38284GsT.A00(c38284GsT);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.JIJ
    public final void AVM(User user) {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.A09(user);
    }

    @Override // X.JIJ
    public final List AZV() {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return hy4.A03();
    }

    @Override // X.JIJ
    public final /* bridge */ /* synthetic */ C75113Zb BRa(Object obj) {
        C3XG c3xg = (C3XG) obj;
        C14360o3.A0B(c3xg, 0);
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        C38321qM A0E = AbstractC37300Gc1.A0E(c3xg);
        if (A0E != null) {
            return hy4.BRZ(A0E);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.JIJ
    public final C75113Zb BRb(String str) {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        if (hy4 instanceof C38284GsT) {
            return (C75113Zb) ((C38284GsT) hy4).A0B.get(str);
        }
        return null;
    }

    @Override // X.JIJ
    public final void CtR(C38321qM c38321qM) {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.CtR(c38321qM);
    }

    @Override // X.JIJ
    public final void DGM(String str) {
        this.A00.A05("favorites_feed_nav_bar");
    }

    @Override // X.JIJ
    public final void Dfp() {
        ContextualFeedFragment contextualFeedFragment = this.A00;
        HY4 hy4 = contextualFeedFragment.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.CtR(null);
        AbstractC37303Gc4.A19(contextualFeedFragment);
    }

    @Override // X.JIJ
    public final void Dfz() {
        AbstractC37303Gc4.A19(this.A00);
    }

    @Override // X.JIJ
    public final void DgF() {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.CtR(null);
    }

    @Override // X.JIJ
    public final /* bridge */ /* synthetic */ void EFT(Object obj) {
        C3XG c3xg = (C3XG) obj;
        C14360o3.A0B(c3xg, 0);
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        if (!(hy4 instanceof C37432GeC)) {
            C38284GsT c38284GsT = (C38284GsT) hy4;
            ((AbstractC65332xV) ((AbstractC65202xI) c38284GsT).A00).A0D(c3xg);
            C38284GsT.A00(c38284GsT);
        }
    }

    @Override // X.JIJ
    public final void F9B(String str) {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.A0A(str);
    }

    @Override // X.JIJ
    public final void FAg() {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.FAg();
    }
}
