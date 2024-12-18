package X;

import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.common.session.UserSession;

/* renamed from: X.BxO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27099BxO extends AbstractC64162vb {
    public final UserSession A00;
    public final C38321qM A01;
    public final InterfaceC16620sF A02;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        WearablesAppAttributionType wearablesAppAttributionType;
        InterfaceC16620sF interfaceC16620sF;
        BQL bql;
        AbstractC29162CtT abstractC29162CtT;
        AbstractC29162CtT abstractC29162CtT2 = (AbstractC29162CtT) obj;
        AbstractC25225BEi.A1R(obj2);
        C14360o3.A0B(abstractC29162CtT2, 0);
        if (abstractC29162CtT2 instanceof C26928BuV) {
            interfaceC16620sF = this.A02;
            bql = BQL.A11;
            abstractC29162CtT = abstractC29162CtT2;
        } else if (abstractC29162CtT2 instanceof C26930BuX) {
            interfaceC16620sF = this.A02;
            bql = BQL.A0f;
            abstractC29162CtT = abstractC29162CtT2;
        } else if (abstractC29162CtT2 instanceof AbstractC26915BuI) {
            interfaceC16620sF = this.A02;
            bql = BQL.A0B;
            abstractC29162CtT = abstractC29162CtT2;
        } else if (abstractC29162CtT2 instanceof C26916BuJ) {
            interfaceC16620sF = this.A02;
            bql = BQL.A02;
            abstractC29162CtT = abstractC29162CtT2;
        } else if (abstractC29162CtT2 instanceof C26919BuM) {
            interfaceC16620sF = this.A02;
            bql = BQL.A0o;
            abstractC29162CtT = abstractC29162CtT2;
        } else if (abstractC29162CtT2 instanceof C26920BuN) {
            interfaceC16620sF = this.A02;
            bql = BQL.A0q;
            abstractC29162CtT = abstractC29162CtT2;
        } else if (abstractC29162CtT2 instanceof C26924BuR) {
            interfaceC16620sF = this.A02;
            C26924BuR c26924BuR = (C26924BuR) abstractC29162CtT2;
            if (c26924BuR.A06) {
                bql = BQL.A08;
                abstractC29162CtT = c26924BuR;
            } else {
                bql = BQL.A06;
                abstractC29162CtT = c26924BuR;
            }
        } else {
            if (!(abstractC29162CtT2 instanceof C26922BuP)) {
                return;
            }
            this.A02.invoke(BQL.A1Z, AbstractC25231BEo.A0j(0, abstractC29162CtT2.getKey()));
            UserSession userSession = this.A00;
            C8i c8i = C8i.ATTRIBUTE_IMPRESSION;
            C38321qM c38321qM = this.A01;
            InterfaceC43580JMo A0t = AbstractC25226BEj.A0t(c38321qM);
            if (A0t != null) {
                wearablesAppAttributionType = A0t.AdN();
            } else {
                wearablesAppAttributionType = null;
            }
            CZH.A01(c8i, wearablesAppAttributionType, userSession, c38321qM.getId(), "reels");
            return;
        }
        interfaceC16620sF.invoke(bql, AbstractC25231BEo.A0j(0, abstractC29162CtT.getKey()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27099BxO(UserSession userSession, C38321qM c38321qM, InterfaceC16620sF interfaceC16620sF) {
        super(C1BX.A03.A01(AbstractC62752tE.A00(userSession, AbstractC111324zv.A00(2954))));
        AbstractC167017dG.A1Q(userSession, c38321qM);
        this.A00 = userSession;
        this.A02 = interfaceC16620sF;
        this.A01 = c38321qM;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        AbstractC25225BEi.A1R(obj2);
    }
}
