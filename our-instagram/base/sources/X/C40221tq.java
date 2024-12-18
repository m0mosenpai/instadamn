package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.1tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40221tq implements InterfaceC40171tl {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1tr
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C40221tq parseFromJson = AbstractC53934Nt7.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C40221tq c40221tq;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            if (obj instanceof C40221tq) {
                c40221tq = (C40221tq) obj;
            } else {
                c40221tq = null;
            }
            anonymousClass182.A0d();
            anonymousClass182.A0Q("sub_share_id", c40221tq.A00);
            anonymousClass182.A0T("is_configured_in_server", c40221tq.A01);
            anonymousClass182.A0a();
        }
    };
    public int A00;
    public boolean A01;
    public final ShareType A02 = ShareType.A0S;

    @Override // X.InterfaceC40181tm
    public final /* bridge */ /* synthetic */ Object AEm(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        return new C27830COt(c47z);
    }

    @Override // X.InterfaceC40171tl
    public final boolean CUB() {
        return false;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CUC() {
        return false;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CVX() {
        return false;
    }

    @Override // X.InterfaceC40181tm
    public final /* synthetic */ void DEN(InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
    }

    @Override // X.InterfaceC40181tm
    public final C38321qM DqT(Context context, InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
        N3A n3a;
        C14360o3.A0B(c47z, 1);
        C38321qM c38321qM = null;
        if ((interfaceC40821up instanceof N3A) && (n3a = (N3A) interfaceC40821up) != null) {
            c38321qM = n3a.A00;
        }
        c47z.A1C = c38321qM;
        return c38321qM;
    }

    @Override // X.InterfaceC40181tm
    public final N3A E3U(C3JY c3jy, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c3jy, 1);
        return (N3A) new C56150OwG(new C07510aQ(userSession), new C55917Os9()).A00(c3jy);
    }

    @Override // X.InterfaceC40181tm
    public final void E4y(UserSession userSession, C47Z c47z, C54783OIx c54783OIx) {
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(c54783OIx, 2);
        c54783OIx.A00(c47z.A1C, c47z, false);
    }

    @Override // X.C1OX
    public final String getTypeName() {
        return "PotatoMediaShareTarget";
    }

    @Override // X.InterfaceC40171tl
    public final ShareType BuN() {
        return this.A02;
    }

    @Override // X.InterfaceC40171tl
    public final int C3D() {
        return this.A00;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CRc() {
        return this.A01;
    }

    @Override // X.InterfaceC40171tl
    public final void ERy(boolean z) {
        this.A01 = z;
    }

    @Override // X.InterfaceC40171tl
    public final void Ef4(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r0 != null) goto L13;
     */
    @Override // X.InterfaceC40181tm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C26461Qb AEa(android.content.Context r19, X.C22P r20, com.instagram.common.gallery.metadata.MediaUploadMetadata r21, com.instagram.common.session.UserSession r22, com.instagram.pendingmedia.model.constants.ShareType r23, java.lang.Object r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.util.List r32, long r33, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            r18 = this;
            r2 = r24
            X.COt r2 = (X.C27830COt) r2
            r1 = 0
            r4 = r19
            X.C14360o3.A0B(r4, r1)
            r0 = 1
            r6 = r22
            X.C14360o3.A0B(r6, r0)
            r0 = 2
            X.C14360o3.A0B(r2, r0)
            r0 = 4
            r8 = r25
            X.C14360o3.A0B(r8, r0)
            r0 = 5
            r3 = r26
            X.C14360o3.A0B(r3, r0)
            r0 = 6
            r3 = r27
            X.C14360o3.A0B(r3, r0)
            r0 = 9
            r3 = r23
            X.C14360o3.A0B(r3, r0)
            r0 = 12
            r5 = r21
            X.C14360o3.A0B(r5, r0)
            X.Ni0 r7 = X.EnumC53323Ni0.A0I
            java.lang.String r10 = X.C16030qx.A00(r4)
            X.C14360o3.A07(r10)
            r12 = 0
            r11 = r30
            r9 = r28
            r16 = r37
            r15 = r36
            r14 = r35
            r13 = r32
            r4 = r20
            r17 = r1
            X.1Ms r5 = X.C55230Of1.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.47Z r2 = r2.A00
            X.OFu r7 = X.AbstractC54080Nve.A00(r2)
            r8 = r33
            r10 = r14
            X.C55230Of1.A0J(r5, r6, r7, r8, r10)
            X.PrB r1 = X.AbstractC54079Nvd.A00(r2)
            boolean r0 = r2.A0t()
            X.C55230Of1.A0I(r5, r6, r1, r0)
            X.1QN r0 = X.C1QM.A00
            X.1QQ r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r5.A0H(r0, r1)
            X.Jxl r0 = r2.A0p
            if (r0 == 0) goto L7b
            java.lang.String r12 = r0.A00
        L7b:
            java.lang.String r2 = ""
            if (r12 != 0) goto L80
            r12 = r2
        L80:
            if (r0 == 0) goto L86
            java.lang.String r1 = r0.A01
            if (r1 != 0) goto L89
        L86:
            r1 = r2
            if (r0 == 0) goto L8e
        L89:
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L8e
            r2 = r0
        L8e:
            r0 = 6
            X.Jxl r4 = new X.Jxl
            r4.<init>(r12, r1, r2, r0)
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            X.15v r0 = X.AbstractC221915u.A00
            X.17z r2 = r0.A0A(r3)
            r2.A0d()
            java.lang.String r1 = r4.A01
            if (r1 == 0) goto Lac
            java.lang.String r0 = "prompt_id"
            r2.A0S(r0, r1)
        Lac:
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto Lb6
            java.lang.String r0 = "prompt_text"
            r2.A0S(r0, r1)
        Lb6:
            java.lang.String r1 = r4.A00
            if (r1 == 0) goto Lbf
            java.lang.String r0 = "container_media_id"
            r2.A0S(r0, r1)
        Lbf:
            r2.A0a()
            r2.close()
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "potato_info"
            r5.A9s(r0, r1)
            X.1Qb r0 = r5.A0O()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40221tq.AEa(android.content.Context, X.22P, com.instagram.common.gallery.metadata.MediaUploadMetadata, com.instagram.common.session.UserSession, com.instagram.pendingmedia.model.constants.ShareType, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, long, boolean, boolean, boolean, boolean, boolean):X.1Qb");
    }
}
