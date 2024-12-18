package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LgK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48690LgK implements InterfaceC50514MRr {
    public final UserSession A00;
    public final int A01;
    public final Context A02;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a6, code lost:
    
        if (r2 <= 0) goto L31;
     */
    @Override // X.InterfaceC50514MRr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C09530e4 Brh(X.C45104JxY r23) {
        /*
            r22 = this;
            r4 = 0
            r5 = r23
            X.C14360o3.A0B(r5, r4)
            java.lang.Integer r6 = X.C05F.A00
            boolean r1 = r5.A01()
            r15 = 0
            r0 = 12
            r11 = 3
            X.Mta r10 = new X.Mta
            r10.<init>(r15, r6, r0, r1)
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            r8 = r22
            com.instagram.common.session.UserSession r9 = r8.A00
            r7 = 1
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36609704232359889(0x821055001a17d1, double:3.215462599766395E-306)
            int r0 = X.AbstractC25225BEi.A07(r2, r9, r0)
            java.util.List r0 = X.LBp.A00(r9, r0)
            java.util.Iterator r14 = r0.iterator()
        L31:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r12 = r14.next()
            X.LzE r12 = (X.C49807LzE) r12
            X.KcB r1 = r12.A03
            X.Km8 r0 = X.AbstractC46751Km8.$redex_init_class
            int r1 = r1.ordinal()
            if (r1 == r4) goto L85
            if (r1 == r7) goto L70
            r0 = 2
            if (r1 == r0) goto L63
            if (r1 == r11) goto L56
            r0 = 4
            if (r1 == r0) goto L31
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L56:
            com.instagram.model.direct.stickerstore.DirectStoreSticker r1 = r12.A05
            if (r1 == 0) goto L31
            X.Jzj r0 = new X.Jzj
            r0.<init>(r10, r1)
            r3.add(r0)
            goto L31
        L63:
            X.6ly r1 = r12.A02
            if (r1 == 0) goto L31
            X.Jza r0 = new X.Jza
            r0.<init>(r1)
            r3.add(r0)
            goto L31
        L70:
            X.6ly r13 = r12.A01
            if (r13 == 0) goto L31
            java.lang.String r12 = ""
            r0 = 7
            X.JWd r1 = new X.JWd
            r1.<init>(r13, r12, r0)
            X.Jzz r0 = new X.Jzz
            r0.<init>(r1, r4)
            r3.add(r0)
            goto L31
        L85:
            X.JwH r1 = r12.A04
            if (r1 == 0) goto L31
            X.Jzi r0 = new X.Jzi
            r0.<init>(r15, r10, r1)
            r3.add(r0)
            goto L31
        L92:
            r0 = 36609704232163279(0x821055001717cf, double:3.215462599642058E-306)
            int r2 = X.AbstractC25225BEi.A07(r2, r9, r0)
            int r1 = r8.A01
            java.lang.Integer r0 = r5.A00
            boolean r0 = X.AbstractC167007dF.A1X(r0, r6)
            if (r0 == 0) goto La8
            int r1 = r1 * r2
            if (r2 > 0) goto La9
        La8:
            r1 = -1
        La9:
            r20 = 2131960414(0x7f13225e, float:1.9557496E38)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r4)
            X.Kc8 r17 = X.EnumC46170Kc8.A03
            X.Jzu r14 = new X.Jzu
            r16 = r15
            r19 = r15
            r21 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r0 = 2131960510(0x7f1322be, float:1.955769E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            X.Kc8 r9 = X.EnumC46170Kc8.A07
            X.Jzu r0 = new X.Jzu
            r6 = r0
            r7 = r15
            r8 = r15
            r10 = r18
            r12 = r20
            r13 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.0e4 r0 = X.AbstractC47846LBo.A01(r14, r0, r5, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48690LgK.Brh(X.JxY):X.0e4");
    }

    @Override // X.InterfaceC50514MRr
    public final C51753Mtc BEM(int i) {
        return KQB.A00(C05F.A01, C05F.A00, this.A02.getString(2131960414), R.drawable.instagram_clock_pano_outline_24, i);
    }

    @Override // X.InterfaceC50514MRr
    public final boolean Ei7(C45104JxY c45104JxY) {
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        C18U.A01(c06090Tz, userSession, 36609704232359889L);
        if (!AbstractC166987dD.A0x(userSession).C2v("recent_direct_stickers").isEmpty() && C18U.A06(c06090Tz, userSession, 36328229255331172L)) {
            return true;
        }
        return false;
    }

    public C48690LgK(Context context, UserSession userSession, int i) {
        this.A02 = context;
        this.A00 = userSession;
        this.A01 = i;
    }
}
