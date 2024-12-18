package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96464Vf {
    public final UserSession A00;
    public final C4FX A01;
    public final C79293ga A02;
    public final C57332k8 A03;
    public final InterfaceC09390do A04;
    public final C57462kL A05;
    public final C1M1 A06;

    public C96464Vf(UserSession userSession, C4FX c4fx, C79293ga c79293ga, C57332k8 c57332k8, C1M1 c1m1) {
        C14360o3.A0B(c4fx, 2);
        C14360o3.A0B(c79293ga, 5);
        this.A00 = userSession;
        this.A01 = c4fx;
        this.A06 = c1m1;
        this.A03 = c57332k8;
        this.A02 = c79293ga;
        this.A05 = new C57462kL(userSession);
        this.A04 = AbstractC09440dt.A01(new C206939Dy(this, 21));
    }

    public final int A00(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
        UserSession userSession = this.A00;
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC76153bK.A00(userSession, c38321qM, interfaceC60442pS, c75113Zb)), Integer.valueOf(((C75563aN) this.A04.getValue()).A02(userSession, c38321qM, c75113Zb))});
    }

    public final C97404Za A01(Context context, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C33P c33p) {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        Float f;
        Integer num;
        String str;
        ClipsShoppingInfoIntf Buh;
        List BhR;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(interfaceC60442pS, 4);
        C60962qK A00 = AbstractC60952qJ.A00(interfaceC60442pS);
        int A01 = (int) (AbstractC13890nF.A01(context) / c38321qM.A0m());
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        boolean z = false;
        if (clipsMetadata != null && (Buh = clipsMetadata.Buh()) != null && (BhR = Buh.BhR()) != null && (!BhR.isEmpty())) {
            userSession = this.A00;
            c06090Tz = C06090Tz.A05;
            j = 36317414526293142L;
        } else {
            userSession = this.A00;
            c06090Tz = C06090Tz.A05;
            j = 2342160423740052631L;
        }
        if (!C18U.A06(c06090Tz, userSession, j)) {
            z = true;
        }
        C96444Vc A1U = c38321qM.A1U();
        if ((A1U != null && AbstractC96454Vd.A00(A1U)) || c38321qM.A6b(userSession)) {
            f = Float.valueOf(-1.0f);
        } else {
            f = null;
        }
        if (c38321qM.A6b(userSession)) {
            num = Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_media_background)));
        } else {
            num = null;
        }
        boolean A6b = c38321qM.A6b(userSession);
        UserSession userSession2 = this.A05.A00;
        String A04 = C18U.A04(c06090Tz, userSession2, 36879471127494932L);
        Map map = C4ZY.A01;
        C4ZY c4zy = (C4ZY) map.get(A04);
        if (c4zy == null) {
            c4zy = C4ZY.A04;
        }
        C4ZY c4zy2 = C4ZY.A04;
        if (c4zy == c4zy2 && ((c38321qM.CdW() || (c4zy = (C4ZY) map.get(C18U.A04(c06090Tz, userSession2, 36892665266701263L))) == null || c4zy == c4zy2) && (c4zy = (C4ZY) map.get(C18U.A04(c06090Tz, userSession2, 36892665266176972L))) == null)) {
            c4zy = c4zy2;
        }
        float A002 = (float) C18U.A00(c06090Tz, userSession2, 37160946104336553L);
        boolean A0Q = AbstractC75103Za.A0Q(c38321qM, c75113Zb.A03);
        C38321qM A0G = c33p.A0G.A0G();
        if (A0G != null) {
            str = A0G.getId();
        } else {
            str = null;
        }
        boolean A0K = C14360o3.A0K(str, c38321qM.getId());
        return new C97404Za(new C206259Bi(5, new C9FZ(1, this, A00, c75113Zb, c38321qM), new C9EL(c38321qM, 43), new C4ZZ(context, this, c38321qM, interfaceC60442pS, A00, c75113Zb), new C206939Dy(this, 20)), c75113Zb, c4zy, c33p.A01(c38321qM), c33p.A02(c38321qM), f, num, A002, A01, A00(c38321qM, A00, c75113Zb), z, A6b, A0Q, A0K);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r34 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76293bZ A02(android.content.Context r30, X.C38321qM r31, X.InterfaceC60442pS r32, X.C75113Zb r33, boolean r34) {
        /*
            r29 = this;
            r17 = 0
            r2 = 1
            r0 = r31
            X.C14360o3.A0B(r0, r2)
            r1 = 2
            r5 = r33
            X.C14360o3.A0B(r5, r1)
            r19 = 0
            com.instagram.search.common.analytics.SearchContext r21 = new com.instagram.search.common.analytics.SearchContext
            r6 = r21
            r7 = r19
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r23 = ""
            r1 = r29
            com.instagram.common.session.UserSession r4 = r1.A00
            boolean r3 = X.AbstractC76243bU.A01(r4, r0, r5)
            if (r3 != 0) goto L48
            boolean r3 = X.AbstractC76243bU.A00(r4, r0)
            if (r3 != 0) goto L48
            boolean r3 = X.AbstractC76243bU.A03(r4, r0, r5)
            if (r3 != 0) goto L48
            boolean r3 = X.AbstractC76243bU.A04(r4, r0, r5)
            if (r3 != 0) goto L48
            boolean r3 = X.AbstractC76243bU.A02(r4, r0, r5)
            if (r3 != 0) goto L48
            r24 = 0
            if (r34 == 0) goto L4a
        L48:
            r24 = 1
        L4a:
            r4 = r30
            X.C77163d2.A00(r4)
            X.3d0 r6 = X.C77143d0.A0C
            if (r6 != 0) goto L8e
            r3 = 2130970282(0x7f0406aa, float:1.754927E38)
            r6 = 2130970282(0x7f0406aa, float:1.754927E38)
            int r3 = X.AbstractC53242c7.A0H(r4, r3)
            int r7 = r4.getColor(r3)
            r5 = 2130970314(0x7f0406ca, float:1.7549335E38)
            int r3 = X.AbstractC53242c7.A0H(r4, r5)
            int r11 = r4.getColor(r3)
            r3 = 2131099690(0x7f06002a, float:1.781174E38)
            int r12 = r4.getColor(r3)
            int r14 = X.AbstractC53242c7.A0H(r4, r6)
            int r15 = X.AbstractC53242c7.A0H(r4, r5)
            int r3 = X.AbstractC53242c7.A0H(r4, r5)
            int r16 = r4.getColor(r3)
            X.3d0 r6 = new X.3d0
            r8 = r7
            r9 = r7
            r10 = r7
            r13 = r12
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.C77143d0.A0C = r6
        L8e:
            java.lang.Integer r22 = X.C05F.A0C
            X.2kL r3 = r1.A05
            java.lang.String r1 = r32.getModuleName()
            boolean r27 = r3.A06(r0, r1)
            X.3bZ r18 = new X.3bZ
            r20 = r6
            r25 = r2
            r26 = r2
            r28 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96464Vf.A02(android.content.Context, X.1qM, X.2pS, X.3Zb, boolean):X.3bZ");
    }
}
