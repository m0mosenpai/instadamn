package X;

import java.util.Map;

/* loaded from: classes11.dex */
public final class U2Z implements XBM {
    public final /* synthetic */ C65918TwP A00;
    public final /* synthetic */ Map A01;

    public U2Z(C65918TwP c65918TwP, Map map) {
        this.A00 = c65918TwP;
        this.A01 = map;
    }

    @Override // X.XBM
    public final void DKw(CharSequence charSequence) {
        String str;
        C66129U0n c66129U0n;
        if (charSequence != null) {
            C65918TwP c65918TwP = this.A00;
            U21 u21 = (U21) c65918TwP.A0g.getValue();
            if (u21.A06.add(charSequence) && (c66129U0n = (C66129U0n) u21.A05.get(charSequence)) != null) {
                u21.A02.add(c66129U0n.A00);
                u21.A03.add(c66129U0n.A01);
                u21.A04.add(c66129U0n.A02);
                C18920wW c18920wW = u21.A00;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_search_recommendation_impression");
                if (A00.isSampled()) {
                    A00.AAP("search_session_id", u21.A01);
                    A00.AAk("recommendations_shown_entity_ids", AbstractC166987dD.A1J(c66129U0n.A00));
                    A00.AAk("recommendations_shown_entity_names", AbstractC166987dD.A1J(c66129U0n.A01));
                    A00.AAk("recommendations_shown_entity_types", AbstractC166987dD.A1J(c66129U0n.A02));
                    AbstractC37302Gc3.A0t(A00);
                    A00.Cht();
                }
            }
            C66129U0n c66129U0n2 = (C66129U0n) this.A01.get(charSequence.toString());
            if (c66129U0n2 != null) {
                str = c66129U0n2.A01;
            } else {
                str = null;
            }
            c65918TwP.A08 = str;
        }
    }
}
