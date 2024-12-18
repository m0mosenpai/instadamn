package X;

import com.instagram.direct.inbox.DirectInviteContactViewModel;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import java.util.HashSet;

/* renamed from: X.G5t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36444G5t implements GZ0 {
    public final int A00;
    public final Object A01;

    public C36444G5t(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GZ0
    public final void DNR(YP3 yp3) {
        C32872EdE c32872EdE;
        C32873EdF c32873EdF;
        switch (this.A00) {
            case 0:
                EVU evu = (EVU) this.A01;
                HashSet hashSet = evu.A0q;
                synchronized (hashSet) {
                    if (yp3 instanceof E9O) {
                        E9O e9o = (E9O) yp3;
                        DirectSearchResult directSearchResult = e9o.A03;
                        if (directSearchResult instanceof DirectInviteContactViewModel) {
                            hashSet.remove((DirectShareTarget) hashSet.stream().filter(new C31424DrU((DirectInviteContactViewModel) directSearchResult, 4)).findFirst().orElse(null));
                            C32872EdE c32872EdE2 = evu.A0o.A02;
                            if (c32872EdE2 != null) {
                                c32872EdE2.A05(e9o);
                            }
                        }
                    }
                }
                return;
            case 1:
                EVU evu2 = ((G29) this.A01).A00;
                HashSet hashSet2 = evu2.A0q;
                synchronized (hashSet2) {
                    E9O e9o2 = (E9O) yp3;
                    if (e9o2 != null && hashSet2.remove(e9o2.A03) && (c32872EdE = evu2.A0o.A02) != null) {
                        c32872EdE.A05(e9o2);
                    }
                }
                return;
            case 2:
            case 3:
                C14360o3.A0B(yp3, 0);
                c32873EdF = ((DirectSearchInboxFragment) this.A01).A05;
                if (c32873EdF == null) {
                    return;
                }
                break;
            case 4:
                C14360o3.A0B(yp3, 0);
                c32873EdF = ((EMC) this.A01).A00;
                if (c32873EdF == null) {
                    C14360o3.A0F("impressionHelper");
                    throw C00O.createAndThrow();
                }
                break;
            default:
                return;
        }
        c32873EdF.A05(yp3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // X.GZ0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DNS(X.YP3 r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L30;
                case 1: goto L27;
                case 2: goto L6;
                case 3: goto L6;
                case 4: goto L11;
                default: goto L5;
            }
        L5:
            return
        L6:
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            java.lang.Object r0 = r1.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r0 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r0
            X.EdF r0 = r0.A05
            goto L3a
        L11:
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            java.lang.Object r0 = r1.A01
            X.EMC r0 = (X.EMC) r0
            X.EdF r0 = r0.A00
            if (r0 != 0) goto L3c
            java.lang.String r0 = "impressionHelper"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L27:
            if (r2 == 0) goto L5
            java.lang.Object r0 = r1.A01
            X.G29 r0 = (X.G29) r0
            X.EVU r0 = r0.A00
            goto L36
        L30:
            if (r2 == 0) goto L5
            java.lang.Object r0 = r1.A01
            X.EVU r0 = (X.EVU) r0
        L36:
            X.DuS r0 = r0.A0o
            X.EdE r0 = r0.A02
        L3a:
            if (r0 == 0) goto L5
        L3c:
            r0.A04(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36444G5t.DNS(X.YP3):void");
    }
}
