package com.instagram.opal.impl.data;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC37300Gc1;
import X.AnonymousClass435;
import X.AnonymousClass755;
import X.C05A;
import X.C05F;
import X.C0eB;
import X.C120985dq;
import X.C1JX;
import X.C26010Bey;
import X.C2JS;
import X.C38321qM;
import X.C38688GzT;
import X.C3NX;
import X.C3NY;
import X.C40701ud;
import X.C51751Mta;
import X.C58595PyN;
import X.C58596PyO;
import X.C65942Twn;
import X.C65943Two;
import X.C72083XNc;
import X.C74;
import X.EnumC125615m7;
import X.EnumC40111tc;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.opal.impl.data.OpalRepository$fetchOpalClipsData$2", f = "OpalRepository.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class OpalRepository$fetchOpalClipsData$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ OpalRepository A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpalRepository$fetchOpalClipsData$2(OpalRepository opalRepository, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(1, interfaceC23621Ds);
        this.A03 = z;
        this.A01 = opalRepository;
        this.A02 = str;
        this.A04 = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new OpalRepository$fetchOpalClipsData$2(this.A01, this.A02, interfaceC23621Ds, this.A03, this.A04);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((OpalRepository$fetchOpalClipsData$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object value;
        String str3;
        C2JS A05;
        C2JS A01;
        C2JS reinterpretIfFulfills;
        C2JS requiredTreeField;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        boolean z = true;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            boolean z2 = this.A03;
            if (z2 || ((C51751Mta) AbstractC37300Gc1.A04(this.A01.A08).A00).A03) {
                if (!z2) {
                    OpalRepository.A01(this.A01, C74.A05);
                }
                AnonymousClass755 anonymousClass755 = AnonymousClass755.A00;
                OpalRepository opalRepository = this.A01;
                UserSession userSession = opalRepository.A03;
                String str4 = this.A02;
                Integer num = C05F.A00;
                if (z2) {
                    str = null;
                } else {
                    str = ((C51751Mta) AbstractC37300Gc1.A04(opalRepository.A08).A00).A02;
                }
                PandoGraphQLRequest A03 = anonymousClass755.A03(userSession, num, str4, str, "opal", false, true, false);
                C40701ud c40701ud = opalRepository.A04;
                this.A00 = 1;
                obj2 = c40701ud.A04(A03, this);
                if (obj2 == c1jx) {
                    return c1jx;
                }
            }
            return C0eB.A00;
        }
        C3NY c3ny = (C3NY) obj2;
        if (c3ny instanceof C3NX) {
            AnonymousClass435 anonymousClass435 = (AnonymousClass435) ((C3NX) c3ny).A00;
            C2JS c2js = (C2JS) anonymousClass435.A01;
            if (c2js != null && (A05 = c2js.A05(C65942Twn.class, "xdt_user_clips_graphql(data:$data)", 352468645)) != null && (A01 = A05.A01(C65943Two.class, -2107973840)) != null && (reinterpretIfFulfills = A01.reinterpretIfFulfills(2, C58596PyO.class, 936321853, null, null, null, "ClipsProfilePagingInfo", "use_stream")) != null && (requiredTreeField = reinterpretIfFulfills.getRequiredTreeField(0, "paging_info", C58595PyN.class, -1503270175)) != null) {
                str2 = requiredTreeField.getOptionalStringField(0, "max_id");
            } else {
                str2 = null;
            }
            OpalRepository opalRepository2 = this.A01;
            UserSession userSession2 = opalRepository2.A03;
            C72083XNc A00 = AnonymousClass755.A00(userSession2, anonymousClass435);
            List list = A00.A02;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C38321qM c38321qM = ((C120985dq) it.next()).A02;
                if (c38321qM != null) {
                    ImageUrl A1S = c38321qM.A1S();
                    if (A1S != null) {
                        String url = A1S.getUrl();
                        String id = c38321qM.getId();
                        if (id != null) {
                            boolean A5F = c38321qM.A5F();
                            EnumC40111tc BRp = c38321qM.BRp();
                            boolean A5P = c38321qM.A5P();
                            boolean A5R = c38321qM.A5R();
                            Integer Bdm = c38321qM.A0C.Bdm();
                            if (Bdm == null) {
                                Bdm = c38321qM.A0C.CFm();
                            }
                            String AXw = c38321qM.A0C.AXw();
                            User A2E = c38321qM.A2E(userSession2);
                            if (A2E != null) {
                                str3 = A2E.getUsername();
                            } else {
                                str3 = "";
                            }
                            A1E.add(new C26010Bey(BRp, Bdm, url, id, AXw, str3, A5F, A5P, A5R));
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            if (!this.A03) {
                A1E2.addAll((Collection) ((C51751Mta) AbstractC37300Gc1.A04(opalRepository2.A08).A00).A00);
            }
            A1E2.addAll(AbstractC001800i.A0a(A1E));
            C74 c74 = C74.A04;
            if (str2 == null) {
                z = false;
            }
            C51751Mta c51751Mta = new C51751Mta(c74, str2, A1E2, z);
            C05A c05a = opalRepository2.A08;
            do {
                value = c05a.getValue();
            } while (!c05a.AIi(value, C38688GzT.A00((C38688GzT) value, null, c51751Mta, null, null, 11)));
            opalRepository2.A05.A03(A00.BbA(), EnumC125615m7.A05, opalRepository2.A06, list, this.A04, true);
        } else {
            OpalRepository.A01(this.A01, C74.A03);
        }
        return C0eB.A00;
    }
}
