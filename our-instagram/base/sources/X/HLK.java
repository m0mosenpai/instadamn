package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HLK extends C155376yQ {
    public final /* synthetic */ C38288GsX A00;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (X.AbstractC35085Fcw.A00(r0) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006d, code lost:
    
        if (r0.A07 == X.EnumC33416Epn.A05) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    @Override // X.C155376yQ
    /* renamed from: A00 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean EjD(X.C38321qM r7) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            int r0 = r7.A00
            r5 = 0
            if (r0 != 0) goto La2
            X.3YU r1 = r7.A1y()
            X.3YU r0 = X.C3YU.A04
            if (r1 == r0) goto La2
            r1 = 1
            X.GsX r4 = r6.A00
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            java.lang.String r2 = "collection"
            if (r0 == 0) goto L1f
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r0.A05
            if (r0 == 0) goto L4e
            return r1
        L1f:
            X.C14360o3.A0F(r2)
            goto L2c
        L23:
            X.HdN r1 = r4.A09
            java.lang.String r0 = "savedFeedMode"
            if (r1 != 0) goto L31
            X.C14360o3.A0F(r0)
        L2c:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L31:
            X.HdN r0 = X.EnumC39551HdN.A03
            if (r1 == r0) goto L3d
            X.HdN r0 = X.EnumC39551HdN.A04
            if (r1 == r0) goto L3d
            X.HdN r0 = X.EnumC39551HdN.A02
            if (r1 != r0) goto L6f
        L3d:
            java.util.List r1 = r7.BqL()
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.A0F
            boolean r0 = r1.contains(r0)
            r3 = r0 ^ 1
            goto L70
        L4e:
            boolean r0 = X.C38288GsX.A09(r4)
            if (r0 == 0) goto L23
            java.util.List r1 = r7.BqL()
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.A0F
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L6f
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            if (r0 == 0) goto L1f
            X.Epn r1 = r0.A07
            X.Epn r0 = X.EnumC33416Epn.A05
            r3 = 0
            if (r1 != r0) goto L70
        L6f:
            r3 = 1
        L70:
            com.instagram.save.model.SavedCollection r1 = r4.A0C
            if (r1 == 0) goto L1f
            com.instagram.common.session.UserSession r0 = r4.A03
            java.lang.String r2 = "userSession"
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.userId
            boolean r0 = r1.A07(r0)
            if (r0 != 0) goto L8d
            com.instagram.common.session.UserSession r0 = r4.A03
            if (r0 == 0) goto L1f
            boolean r0 = X.AbstractC35085Fcw.A00(r0)
            r1 = 1
            if (r0 != 0) goto L8e
        L8d:
            r1 = 0
        L8e:
            if (r3 == 0) goto L9e
            com.instagram.common.session.UserSession r0 = r4.A03
            if (r0 == 0) goto L1f
            X.2kZ r0 = X.C57602kZ.A00(r0)
            boolean r0 = r0.A0O(r7)
            if (r0 != 0) goto La0
        L9e:
            if (r1 == 0) goto La2
        La0:
            r5 = 1
            return r5
        La2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HLK.EjD(X.1qM):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HLK(UserSession userSession, C38288GsX c38288GsX) {
        super(userSession);
        this.A00 = c38288GsX;
    }
}
