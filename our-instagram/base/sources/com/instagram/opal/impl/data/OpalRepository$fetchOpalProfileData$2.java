package com.instagram.opal.impl.data;

import X.AbstractC09560e7;
import X.AbstractC167007dF;
import X.AbstractC23611Dp;
import X.AbstractC37300Gc1;
import X.AnonymousClass189;
import X.C05A;
import X.C0eB;
import X.C109974xR;
import X.C14360o3;
import X.C15370ps;
import X.C18A;
import X.C1JX;
import X.C38688GzT;
import X.C40701ud;
import X.C74;
import X.InterfaceC109984xS;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.opal.impl.data.OpalRepository$fetchOpalProfileData$2", f = "OpalRepository.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class OpalRepository$fetchOpalProfileData$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ OpalRepository A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C15370ps A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpalRepository$fetchOpalProfileData$2(OpalRepository opalRepository, String str, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, boolean z) {
        super(1, interfaceC23621Ds);
        this.A04 = z;
        this.A01 = opalRepository;
        this.A02 = str;
        this.A03 = c15370ps;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new OpalRepository$fetchOpalProfileData$2(this.A01, this.A02, interfaceC23621Ds, this.A03, this.A04);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((OpalRepository$fetchOpalProfileData$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C05A c05a;
        String str;
        OpalProfileData A00;
        Object value;
        C38688GzT A002;
        Object value2;
        C38688GzT A003;
        Object value3;
        C38688GzT A004;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            boolean z = this.A04;
            OpalRepository opalRepository = this.A01;
            if (z) {
                C05A c05a2 = opalRepository.A08;
                do {
                    value2 = c05a2.getValue();
                    C38688GzT c38688GzT = (C38688GzT) value2;
                    A003 = C38688GzT.A00(c38688GzT, null, null, null, OpalProfileData.A00((OpalProfileData) c38688GzT.A02, C74.A02, null, null, null, null, null, null, 0, 7935, false, false), 14);
                } while (!c05a2.AIi(value2, A003));
            } else {
                C18A A005 = AnonymousClass189.A00(opalRepository.A03);
                String str2 = this.A02;
                User A02 = A005.A02(str2);
                if (A02 != null && A02.A03.BYy() != null) {
                    InterfaceC109984xS BYy = A02.A03.BYy();
                    C14360o3.A0C(BYy, "null cannot be cast to non-null type com.instagram.api.schemas.OpalInfo");
                    C109974xR c109974xR = (C109974xR) BYy;
                    c05a = opalRepository.A08;
                    OpalProfileData opalProfileData = (OpalProfileData) AbstractC37300Gc1.A04(c05a).A02;
                    String username = A02.getUsername();
                    String str3 = c109974xR.A03;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = c109974xR.A04;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = c109974xR.A01;
                    if (str5 == null) {
                        str5 = "";
                    }
                    C74 c74 = C74.A02;
                    int i = c109974xR.A00;
                    boolean z2 = c109974xR.A05;
                    String str6 = opalProfileData.A03;
                    boolean z3 = opalProfileData.A0C;
                    boolean z4 = opalProfileData.A0B;
                    List list = opalProfileData.A08;
                    AbstractC167007dF.A1I(str2, 1, c74);
                    C14360o3.A0B(list, 11);
                    A00 = new OpalProfileData(c74, str2, username, str3, str4, str6, str5, list, i, true, z3, z4, z2);
                } else {
                    c05a = opalRepository.A08;
                    OpalProfileData opalProfileData2 = (OpalProfileData) AbstractC37300Gc1.A04(c05a).A02;
                    if (A02 != null) {
                        str = A02.getUsername();
                    } else {
                        str = ((OpalProfileData) AbstractC37300Gc1.A04(c05a).A02).A07;
                    }
                    A00 = OpalProfileData.A00(opalProfileData2, C74.A05, str2, str, null, null, null, null, 0, 7929, false, false);
                }
                do {
                    value = c05a.getValue();
                    A002 = C38688GzT.A00((C38688GzT) value, null, null, null, A00, 14);
                } while (!c05a.AIi(value, A002));
            }
            OpalRepoUtil opalRepoUtil = OpalRepoUtil.A00;
            String str7 = this.A02;
            UserSession userSession = opalRepository.A03;
            C40701ud c40701ud = opalRepository.A04;
            this.A00 = 1;
            obj2 = opalRepoUtil.A02(userSession, c40701ud, str7, this);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        OpalProfileData opalProfileData3 = (OpalProfileData) obj2;
        this.A03.A00 = opalProfileData3;
        C05A c05a3 = this.A01.A08;
        do {
            value3 = c05a3.getValue();
            A004 = C38688GzT.A00((C38688GzT) value3, null, null, null, opalProfileData3, 14);
        } while (!c05a3.AIi(value3, A004));
        return C0eB.A00;
    }
}
