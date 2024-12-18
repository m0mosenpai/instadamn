package com.instagram.direct.inbox.customerdetails.repository;

import X.AbstractC09560e7;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC31173DnH;
import X.AbstractC31178DnM;
import X.AbstractC31670Dva;
import X.AbstractC33541EsF;
import X.C008302x;
import X.C0eB;
import X.C15370ps;
import X.C1JX;
import X.C25621Ms;
import X.C32807EcB;
import X.C32809EcD;
import X.C33090Eip;
import X.GS0;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.customerdetails.repository.BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2", f = "BusinessInboxCustomerDetailsRepository.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ C33090Eip A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2(C33090Eip c33090Eip, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A01 = c33090Eip;
        this.A02 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2(this.A01, this.A02, this.A05, this.A03, this.A04, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C33090Eip c33090Eip = this.A01;
            AbstractC33541EsF abstractC33541EsF = (AbstractC33541EsF) c33090Eip.A05.getValue();
            C15370ps A1F = AbstractC25225BEi.A1F();
            if (abstractC33541EsF instanceof C32807EcB) {
                A1F.A00 = ((C32807EcB) abstractC33541EsF).A00;
            }
            if (abstractC33541EsF instanceof C32809EcD) {
                A1F.A00 = ((C32809EcD) abstractC33541EsF).A00;
            }
            if (A1F.A00 != null) {
                UserSession userSession = c33090Eip.A01;
                String str = c33090Eip.A04;
                String str2 = this.A02;
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                String str4 = this.A05;
                String str5 = str4;
                if (str4 == null) {
                    str5 = "";
                }
                String str6 = this.A03;
                String str7 = str6;
                if (str6 == null) {
                    str7 = "";
                }
                String str8 = this.A04;
                String str9 = str8;
                if (str8 == null) {
                    str9 = "";
                }
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                AbstractC31173DnH.A1P(A0c, "direct_v2/set_customer_details/", str);
                A0c.A9s("address", str3);
                A0c.A9s(AbstractC31670Dva.A01(8, 12, 118), str5);
                A0c.A9s("email", str7);
                C008302x A03 = AbstractC31178DnM.A0K(A0c, "additional_info", str9).A03(994363717);
                GS0 gs0 = new GS0(c33090Eip, str2, str4, str6, str8, A1F);
                this.A00 = 1;
                if (A03.collect(gs0, this) == c1jx) {
                    return c1jx;
                }
            }
        }
        return C0eB.A00;
    }
}
