package com.instagram.direct.fragment.channels.xposting;

import X.AbstractC09440dt;
import X.AbstractC111324zv;
import X.C0w9;
import X.C14360o3;
import X.C2DU;
import X.C2JD;
import X.C37014GSt;
import X.C4A7;
import X.C4A8;
import X.C4GV;
import X.C81543kP;
import X.C9CK;
import X.InterfaceC09390do;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class ChannelXpostingRepository extends C4A7 {
    public final UserSession A00;
    public final InterfaceC09390do A01;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r6 = 0
            boolean r0 = X.MAT.A03(r9, r6)
            if (r0 == 0) goto L77
            r5 = r9
            X.MAT r5 = (X.MAT) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L4b
            if (r0 != r3) goto L84
            X.AbstractC09560e7.A00(r1)
        L23:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L42
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.EBO r0 = (X.EBO) r0
            java.util.List r0 = r0.A00
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L35:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L41
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L7f
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L41:
            return r1
        L42:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L35
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4b:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r7.A00
            X.C14360o3.A0B(r0, r6)
            X.C14360o3.A0B(r8, r3)
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.String r0 = "direct_v2/threads/%s/get_all_channels_for_xposting/"
            r2.A0L(r0, r1)
            java.lang.Class<X.EBO> r1 = X.EBO.class
            java.lang.Class<X.FUg> r0 = X.C34781FUg.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 542899570(0x205bfd72, float:1.863388E-19)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L23
            return r4
        L77:
            r0 = 42
            X.MAT r5 = new X.MAT
            r5.<init>(r7, r9, r6, r0)
            goto L15
        L7f:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L84:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository.A01(java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final void A00(C9CK c9ck, ChannelXpostingRepository channelXpostingRepository, DirectThreadKey directThreadKey) {
        ImmutableList immutableList;
        C2DU c2du = (C2DU) C2JD.A00(channelXpostingRepository.A00);
        synchronized (c2du) {
            C14360o3.A0B(directThreadKey, 0);
            C4GV A0P = c2du.A0P(directThreadKey);
            if (A0P == null) {
                C0w9.A03(AbstractC111324zv.A00(659), AbstractC111324zv.A00(1605));
            } else {
                C81543kP A0K = A0P.A0K();
                C14360o3.A07(A0K);
                if (c9ck == null) {
                    immutableList = null;
                } else {
                    immutableList = ImmutableList.of((Object) c9ck);
                }
                A0K.A0G = immutableList;
                C2DU.A0E(A0P.A0L(A0K), c2du, false);
            }
        }
    }

    public ChannelXpostingRepository(UserSession userSession) {
        super("channels", C4A8.A00(542899570));
        this.A00 = userSession;
        this.A01 = AbstractC09440dt.A01(new C37014GSt(this, 6));
    }
}
