package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.audience.ClipsAudienceControlViewModel$viewState$1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Mfy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50991Mfy extends AbstractC52922bZ {
    public final C2GT A00;
    public final C45124Jxt A01;
    public final UserSession A02;
    public final Map A03;
    public final InterfaceC19390xP A04;
    public final InterfaceC06180Ui A05;
    public final C05A A06;
    public final C05A A07;
    public final InterfaceC15070pN A08;
    public final C0UO A09;
    public final boolean A0A;
    public final C2GT A0B;
    public final C2GT A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final C05A A0G;

    public C50991Mfy(C45124Jxt c45124Jxt, UserSession userSession) {
        LinkedHashMap A07;
        int A06 = AbstractC167007dF.A06(1, userSession, c45124Jxt);
        this.A02 = userSession;
        this.A01 = c45124Jxt;
        C008002u A0u = MSY.A0u(0);
        this.A0D = A0u;
        this.A09 = AbstractC208910l.A02(A0u);
        C008002u A00 = C10E.A00(null);
        this.A07 = A00;
        C008002u A002 = C10E.A00(Integer.valueOf(AbstractC167017dG.A0K(AbstractC166997dE.A0Y(userSession).A03.B7S())));
        this.A0E = A002;
        C008002u A1H = AbstractC25225BEi.A1H(EnumC53134Nen.A02);
        this.A06 = A1H;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A0B = AbstractC58232lf.A00(anonymousClass191, A1H);
        C008002u A1H2 = AbstractC25225BEi.A1H(false);
        this.A0G = A1H2;
        this.A0C = AbstractC58232lf.A00(anonymousClass191, A1H2);
        boolean A1X = AbstractC167007dF.A1X(MSZ.A0h(userSession), C05F.A0C);
        this.A0A = A1X;
        C09530e4[] c09530e4Arr = new C09530e4[A06];
        if (A1X) {
            c09530e4Arr[0] = AbstractC166987dD.A1L(EnumC53171NfS.A06, false);
            c09530e4Arr[1] = AbstractC166987dD.A1L(EnumC53171NfS.A02, false);
            A07 = AbstractC06930Yk.A07(c09530e4Arr);
        } else {
            c09530e4Arr[0] = AbstractC166987dD.A1L(EnumC53171NfS.A03, false);
            c09530e4Arr[1] = AbstractC166987dD.A1L(EnumC53171NfS.A02, false);
            A07 = AbstractC06930Yk.A07(c09530e4Arr);
        }
        this.A03 = A07;
        this.A04 = C10Q.A01(new ClipsAudienceControlViewModel$viewState$1(this, null), A0u, A00, A1H, A002);
        AnonymousClass057 A003 = C10M.A00(C05F.A00, 1, 0);
        this.A05 = A003;
        this.A08 = new C06160Ug(null, A003);
        C008002u A1H3 = AbstractC25225BEi.A1H(EnumC76383bi.A06);
        this.A0F = A1H3;
        this.A00 = AbstractC58232lf.A00(anonymousClass191, A1H3);
        Integer Afv = AbstractC166997dE.A0Y(userSession).A03.Afv();
        if (Afv != null) {
            A0u.Egh(Afv);
        }
        if (this.A01.A01) {
            UserSession userSession2 = this.A02;
            InterfaceC16530ry interfaceC16530ry = AbstractC23021Ah.A00(userSession2).A2b;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!AbstractC167017dG.A1b(r1, interfaceC16530ry, c0yrArr, 195)) {
                this.A07.Egh(EnumC53105NeI.A02);
                C23031Ai A004 = AbstractC23021Ah.A00(userSession2);
                AbstractC167007dF.A1L(A004, A004.A2b, c0yrArr, 195, true);
                return;
            }
        }
        this.A07.Egh(null);
    }

    public final void A01(EnumC53171NfS enumC53171NfS, boolean z) {
        EnumC76383bi enumC76383bi;
        C14360o3.A0B(enumC53171NfS, 0);
        if (z) {
            Map map = this.A03;
            AbstractC43592JPx.A1W(enumC53171NfS, map, true);
            C05A c05a = this.A0F;
            int ordinal = enumC53171NfS.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            enumC76383bi = EnumC76383bi.A06;
                        } else {
                            enumC76383bi = EnumC76383bi.A0C;
                        }
                    } else {
                        enumC76383bi = EnumC76383bi.A07;
                    }
                } else {
                    enumC76383bi = EnumC76383bi.A08;
                }
            } else {
                enumC76383bi = EnumC76383bi.A04;
            }
            c05a.Egh(enumC76383bi);
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (A1K.getKey() != enumC53171NfS && AbstractC166987dD.A1a(A1K.getValue())) {
                    AbstractC43592JPx.A1W(A1K.getKey(), map, false);
                }
            }
        }
        PZT.A03(this, AbstractC141776au.A00(this), 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0.containsKey("close_friend_count") == true) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.content.Intent r5) {
        /*
            r4 = this;
            X.0cb r1 = X.C17060sy.A01
            com.instagram.common.session.UserSession r0 = r4.A02
            X.17P r0 = X.AbstractC31171DnF.A0T(r0, r1)
            java.lang.Integer r3 = r0.Afv()
            java.lang.String r2 = "private_story_audience_member_count"
            r1 = 1
            if (r5 == 0) goto L3a
            android.os.Bundle r0 = r5.getExtras()
            if (r0 == 0) goto L3a
            boolean r0 = r0.containsKey(r2)
            if (r0 != r1) goto L3a
        L1d:
            android.os.Bundle r0 = r5.getExtras()
            if (r0 == 0) goto L32
            int r0 = r0.getInt(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L2b:
            if (r3 == 0) goto L32
            X.05A r0 = r4.A0D
            r0.Egh(r3)
        L32:
            X.05A r1 = r4.A06
            X.Nen r0 = X.EnumC53134Nen.A02
            r1.Egh(r0)
            return
        L3a:
            java.lang.String r2 = "close_friend_count"
            if (r5 == 0) goto L2b
            android.os.Bundle r0 = r5.getExtras()
            if (r0 == 0) goto L2b
            boolean r0 = r0.containsKey(r2)
            if (r0 != r1) goto L2b
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50991Mfy.A00(android.content.Intent):void");
    }
}
