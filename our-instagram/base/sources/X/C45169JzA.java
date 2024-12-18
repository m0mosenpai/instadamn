package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.JzA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45169JzA extends C0T6 implements MRM {
    public final C47Z A00;
    public final boolean A01;

    @Override // X.MRM
    public final Boolean Akb() {
        return null;
    }

    @Override // X.MRM
    public final Boolean Aki() {
        return null;
    }

    @Override // X.MRM
    public final String Bjv() {
        return null;
    }

    @Override // X.MRM
    public final String Bnv() {
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45169JzA) && C14360o3.A0K(this.A00, ((C45169JzA) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.MRM
    public final String Bgh() {
        return null;
    }

    @Override // X.MRM
    public final boolean Cb2() {
        return this.A01;
    }

    @Override // X.MRM
    public final String getId() {
        return this.A00.A35;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4.A0J != X.EnumC46199Kcb.A07.A00) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45169JzA(X.C47Z r4) {
        /*
            r3 = this;
            r3.<init>()
            r3.A00 = r4
            X.3bi r1 = r4.A1F
            X.3bi r0 = X.EnumC76383bi.A0E
            if (r1 != r0) goto L14
            int r2 = r4.A0J
            X.Kcb r0 = X.EnumC46199Kcb.A07
            int r1 = r0.A00
            r0 = 1
            if (r2 == r1) goto L15
        L14:
            r0 = 0
        L15:
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45169JzA.<init>(X.47Z):void");
    }

    @Override // X.MRM
    public final Integer Axb() {
        return AbstractC25227BEk.A0p();
    }

    @Override // X.MRM
    public final User Bnx(UserSession userSession) {
        return AbstractC166987dD.A10(userSession);
    }

    @Override // X.MRM
    public final User CDk(UserSession userSession) {
        return AbstractC166987dD.A10(userSession);
    }
}
