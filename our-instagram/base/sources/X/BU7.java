package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class BU7 extends C17T implements InterfaceC87503vI {
    public User A00;
    public List A01;

    private final List A01(C1DY c1dy) {
        List<ImmutablePandoUserDict> A0o = A0o(378965114, ImmutablePandoUserDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        for (ImmutablePandoUserDict immutablePandoUserDict : A0o) {
            Parcelable.Creator creator = User.CREATOR;
            A0q.add(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
        }
        return A0q;
    }

    @Override // X.InterfaceC87503vI
    public final List ByL() {
        return A08(-688652874, C1F.class);
    }

    @Override // X.InterfaceC87503vI
    public final List ByM() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        throw new UnsupportedOperationException("Please call reconciledWithStore() first to access the 'socialContextFacepileUsers' field.");
    }

    @Override // X.InterfaceC87503vI
    public final List ByR() {
        return A08(-1263111006, C1G.class);
    }

    @Override // X.InterfaceC87503vI
    public final SocialContextType ByT() {
        return (SocialContextType) A0M(1882641244, BU6.A00);
    }

    @Override // X.InterfaceC87503vI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, BFJ.A00(this));
    }

    @Override // X.InterfaceC87503vI
    public final String ByN() {
        return A0i(985509442);
    }

    @Override // X.InterfaceC87503vI
    public final User ByQ() {
        return this.A00;
    }

    @Override // X.InterfaceC87503vI
    public final InterfaceC87503vI E9t(C1DY c1dy) {
        User user;
        this.A01 = A01(c1dy);
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(650659597, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            user = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
        } else {
            user = null;
        }
        this.A00 = user;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    @Override // X.InterfaceC87503vI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C87493vH Ezd(X.C1DY r10) {
        /*
            r9 = this;
            java.util.List r1 = r9.ByL()
            r2 = 10
            r7 = 0
            if (r1 == 0) goto L2a
            int r0 = X.AbstractC06950Ym.A1E(r1, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r1.next()
            X.3vG r0 = (X.InterfaceC87483vG) r0
            X.3vF r0 = r0.Ezc()
            r5.add(r0)
            goto L16
        L2a:
            r5 = r7
        L2b:
            java.util.List r1 = r9.A01(r10)
            int r0 = X.AbstractC06950Ym.A1E(r1, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L3c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.17M r0 = r10.A00(r0)
            r6.add(r0)
            goto L3c
        L50:
            r0 = 985509442(0x3abdae42, float:0.0014471489)
            java.lang.String r4 = r9.A0i(r0)
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r1 = com.instagram.user.model.ImmutablePandoUserDict.class
            r0 = 650659597(0x26c8470d, float:1.3897046E-15)
            com.facebook.pando.TreeJNI r1 = r9.A05(r0, r1)
            com.instagram.user.model.ImmutablePandoUserDict r1 = (com.instagram.user.model.ImmutablePandoUserDict) r1
            if (r1 == 0) goto L99
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            com.instagram.user.model.User r0 = X.AbstractC38851rI.A01(r10, r1)
            if (r0 == 0) goto L99
            X.17M r3 = r10.A00(r0)
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
        L72:
            java.util.List r1 = r9.ByR()
            if (r1 == 0) goto L9b
            int r0 = X.AbstractC06950Ym.A1E(r1, r2)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L85:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r1.next()
            X.3vr r0 = (X.InterfaceC87833vr) r0
            X.3vq r0 = r0.Ezf()
            r7.add(r0)
            goto L85
        L99:
            r3 = r7
            goto L72
        L9b:
            com.instagram.api.schemas.SocialContextType r2 = r9.ByT()
            r0 = 567070134(0x21cccdb6, float:1.3878029E-18)
            int r8 = r9.getIntValueByHashCode(r0)
            X.3vH r1 = new X.3vH
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BU7.Ezd(X.1DY):X.3vH");
    }

    @Override // X.InterfaceC87503vI
    public final C87493vH Eze(C1DV c1dv) {
        return Ezd(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC87503vI
    public final int getSocialContextUsersCount() {
        return getIntValueByHashCode(567070134);
    }
}
