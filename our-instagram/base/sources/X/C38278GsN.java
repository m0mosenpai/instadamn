package X;

import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GsN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38278GsN implements XDm {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C38278GsN(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.XDm
    public final java.util.Set AZX() {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        if (hy4 instanceof C37432GeC) {
            return AbstractC166987dD.A1H();
        }
        return ((C38284GsT) hy4).A0C;
    }

    @Override // X.XDm
    public final List AZY() {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        if (hy4 instanceof C37432GeC) {
            return AbstractC31173DnH.A0L(((C37432GeC) hy4).A0C);
        }
        return ((C38284GsT) hy4).A09;
    }

    @Override // X.XDm
    public final java.util.Set B5o() {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        if (hy4 instanceof C37432GeC) {
            return AbstractC166987dD.A1H();
        }
        return ((C38284GsT) hy4).A0D;
    }

    @Override // X.XDm
    public final HashMap C9S() {
        if (this.A00.A0N == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return AbstractC166987dD.A1G();
    }
}
