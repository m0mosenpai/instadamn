package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ImmutablePandoTextAppSearchDiscussionTopic;
import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.api.schemas.TextPostAppPostUnavailableReason;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V97 extends C17T implements InterfaceC99334d2 {
    public InterfaceC99414dE A00;
    public InterfaceC99384d8 A01;
    public C38321qM A02;
    public C4d0 A03;
    public User A04;
    public User A05;
    public List A06;

    private final List A01(C1DY c1dy) {
        ImmutableList A08 = A08(1759540429, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) it.next();
                Parcelable.Creator creator = User.CREATOR;
                C14360o3.A0A(immutablePandoUserDict);
                A0q.add(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
            }
            return A0q;
        }
        return null;
    }

    @Override // X.InterfaceC99334d2
    public final /* synthetic */ C72858XpE AKk() {
        return new C72858XpE(this);
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99344d3 Avu() {
        return (InterfaceC99344d3) A05(-1840544998, V92.class);
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99294cv B5U() {
        return (InterfaceC99294cv) A05(-74191364, V8W.class);
    }

    @Override // X.InterfaceC99334d2
    public final TextPostAppHeaderFollowVariant BDD() {
        return (TextPostAppHeaderFollowVariant) A0N(-1059180055, C71818X5w.A00);
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99354d5 BEQ() {
        return (InterfaceC99354d5) A05(805787307, V8Z.class);
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99374d7 BNR() {
        return (InterfaceC99374d7) A05(2023272031, C0q.class);
    }

    @Override // X.InterfaceC99334d2
    public final C38321qM BNd() {
        return this.A02;
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99384d8 BPK() {
        InterfaceC99384d8 interfaceC99384d8 = this.A01;
        if (interfaceC99384d8 == null) {
            return (InterfaceC99384d8) A05(858554943, V96.class);
        }
        return interfaceC99384d8;
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99394dA BdJ() {
        return (InterfaceC99394dA) A05(1702103366, V93.class);
    }

    @Override // X.InterfaceC99334d2
    public final TextPostAppPostUnavailableReason BfA() {
        return (TextPostAppPostUnavailableReason) A0N(-1511037166, C71819X5x.A00);
    }

    @Override // X.InterfaceC99334d2
    public final User Bgg() {
        return this.A04;
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99404dC BmB() {
        return (InterfaceC99404dC) A05(1393759939, V90.class);
    }

    @Override // X.InterfaceC99334d2
    public final ReplyControlStr BnB() {
        return (ReplyControlStr) A0N(1276679432, C71820X5y.A00);
    }

    @Override // X.InterfaceC99334d2
    public final List BnD() {
        return this.A06;
    }

    @Override // X.InterfaceC99334d2
    public final User BnR() {
        return this.A05;
    }

    @Override // X.InterfaceC99334d2
    public final TextAppSearchDiscussionTopic BrJ() {
        return (TextAppSearchDiscussionTopic) A05(1890351552, ImmutablePandoTextAppSearchDiscussionTopic.class);
    }

    @Override // X.InterfaceC99334d2
    public final C4d0 BuA() {
        C4d0 c4d0 = this.A03;
        if (c4d0 == null) {
            return (C4d0) A05(-1788288754, C1R.class);
        }
        return c4d0;
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99414dE C6L() {
        InterfaceC99414dE interfaceC99414dE = this.A00;
        if (interfaceC99414dE == null) {
            return (InterfaceC99414dE) A05(1125241745, HV7.class);
        }
        return interfaceC99414dE;
    }

    @Override // X.InterfaceC99334d2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC72892XqR.A01(this), this);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean Akb() {
        return getOptionalBooleanValueByHashCode(1358926591);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean Aki() {
        return getOptionalBooleanValueByHashCode(373873083);
    }

    @Override // X.InterfaceC99334d2
    public final Long Awf() {
        return A0L(-653144190);
    }

    @Override // X.InterfaceC99334d2
    public final Integer Axb() {
        return getOptionalIntValueByHashCode(345297956);
    }

    @Override // X.InterfaceC99334d2
    public final Long B3G() {
        return A0L(971668746);
    }

    @Override // X.InterfaceC99334d2
    public final Integer BH7() {
        return getOptionalIntValueByHashCode(-1260987559);
    }

    @Override // X.InterfaceC99334d2
    public final Integer BSL() {
        return getOptionalIntValueByHashCode(2144418426);
    }

    @Override // X.InterfaceC99334d2
    public final String Bf4() {
        return A0i(-1447261488);
    }

    @Override // X.InterfaceC99334d2
    public final Integer Bjq() {
        return getOptionalIntValueByHashCode(1087448460);
    }

    @Override // X.InterfaceC99334d2
    public final List BmG() {
        return getOptionalStringListByHashCode(1829773748);
    }

    @Override // X.InterfaceC99334d2
    public final Integer BnC() {
        return getOptionalIntValueByHashCode(139882362);
    }

    @Override // X.InterfaceC99334d2
    public final Integer BnG() {
        return getOptionalIntValueByHashCode(147896815);
    }

    @Override // X.InterfaceC99334d2
    public final Integer Bnp() {
        return getOptionalIntValueByHashCode(-1621000413);
    }

    @Override // X.InterfaceC99334d2
    public final Integer BoO() {
        return getOptionalIntValueByHashCode(1456374940);
    }

    @Override // X.InterfaceC99334d2
    public final Integer Bt0() {
        return getOptionalIntValueByHashCode(-1819645779);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean BvH() {
        return getOptionalBooleanValueByHashCode(-1275976529);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean BwR() {
        return getOptionalBooleanValueByHashCode(1406270433);
    }

    @Override // X.InterfaceC99334d2
    public final String Bz5() {
        return A0i(847875056);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean CGD() {
        return getOptionalBooleanValueByHashCode(285376571);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean CHk() {
        return getOptionalBooleanValueByHashCode(-356477449);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean CQ1() {
        return getOptionalBooleanValueByHashCode(1843628887);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean CUr() {
        return getOptionalBooleanValueByHashCode(2144466692);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean Ca2() {
        return getOptionalBooleanValueByHashCode(-1055756535);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean Cam() {
        return getOptionalBooleanValueByHashCode(2058022310);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean Cbs() {
        return getOptionalBooleanValueByHashCode(123370389);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean Ccw() {
        return getOptionalBooleanValueByHashCode(141295674);
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99334d2 EBZ(C1DY c1dy) {
        this.A02 = AbstractC37304Gc5.A0D(c1dy, this, -1332702428);
        InterfaceC99384d8 BPK = BPK();
        InterfaceC99414dE interfaceC99414dE = null;
        if (BPK != null) {
            BPK.EBT(c1dy);
        } else {
            BPK = null;
        }
        this.A01 = BPK;
        this.A04 = AbstractC37303Gc4.A0J(c1dy, this, -1903189321);
        this.A06 = A01(c1dy);
        this.A05 = AbstractC37303Gc4.A0J(c1dy, this, 1192612026);
        C4d0 BuA = BuA();
        if (BuA != null) {
            BuA.EBW(c1dy);
        } else {
            BuA = null;
        }
        this.A03 = BuA;
        InterfaceC99414dE C6L = C6L();
        if (C6L != null) {
            C6L.EB4(c1dy);
            interfaceC99414dE = C6L;
        }
        this.A00 = interfaceC99414dE;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    @Override // X.InterfaceC99334d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C99324d1 F4y(X.C1DY r52) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V97.F4y(X.1DY):X.4d1");
    }

    @Override // X.InterfaceC99334d2
    public final C99324d1 F4z(C1DV c1dv) {
        return F4y(AbstractC25235BEs.A0b(c1dv));
    }
}
