package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SOE {
    public FrameLayout A00;
    public C60884Ras A01;
    public C1338462s A02;
    public UserSession A03;
    public boolean A04;
    public View A05;
    public AbstractC10360h2 A06;
    public final InterfaceC58362lv A07;
    public final C5G6 A08;
    public final C58883QEt A09;
    public final C58883QEt A0A;
    public final C63380Siu A0B;
    public final C63380Siu A0C;
    public final Map A0D;

    public SOE(View view, AbstractC10360h2 abstractC10360h2, C5G6 c5g6, C58883QEt c58883QEt, C63380Siu c63380Siu, UserSession userSession) {
        AbstractC25233BEq.A0w(2, userSession, view, c63380Siu);
        AbstractC25229BEm.A1I(abstractC10360h2, 5, c5g6);
        this.A09 = c58883QEt;
        this.A0C = c63380Siu;
        this.A08 = c5g6;
        this.A0A = c58883QEt;
        this.A07 = C63628Sqa.A00(this, 9);
        this.A0B = c63380Siu;
        this.A0D = AbstractC166987dD.A1G();
        this.A06 = abstractC10360h2;
        this.A03 = userSession;
        this.A05 = view;
        C62415SAp c62415SAp = new C62415SAp(this);
        C14360o3.A0B(userSession, 0);
        try {
            C2JM A0b = AbstractC25225BEi.A0b();
            A0b.A04("bloks_versioning_id", "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf");
            C1ON A00 = Sg3.A00(new C907442n(A0b, QHW.class, "IGIABAutofillBloksGraphQLRootQuery", false), userSession);
            A00.A00 = new C207879Ht(c62415SAp, 0);
            Sg3.A02(A00);
        } catch (IOException e) {
            C0w9.A06("AutofillGraphQLRequest", "Error creating Bloks view query request", e);
        }
    }

    public final void A00() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.A00;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8 && (frameLayout = this.A00) != null) {
            frameLayout.setVisibility(8);
        }
    }

    public final void A01() {
        C58883QEt c58883QEt;
        C63380Siu c63380Siu;
        C62694SMi c62694SMi;
        if (this.A02 != null) {
            if (this.A00 == null) {
                this.A00 = (FrameLayout) this.A05.findViewById(R.id.iab_autofill_soft_keyboard_container);
                String str = this.A03.token;
                C14360o3.A0B(str, 0);
                C60884Ras c60884Ras = new C60884Ras();
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
                c60884Ras.setArguments(A0b);
                C14240no c14240no = new C14240no(this.A06);
                c14240no.A0A(c60884Ras, R.id.iab_autofill_soft_keyboard_container);
                c14240no.A01();
                C1338462s c1338462s = this.A02;
                if (c1338462s != null) {
                    c60884Ras.A01 = c1338462s;
                    this.A01 = c60884Ras;
                    C66237U5h c66237U5h = new C66237U5h(new C65075Td4(this, 5));
                    Map map = this.A0D;
                    map.put("on_accept_payment_autofill", c66237U5h);
                    map.put("open_browser_settings", new C66237U5h(new C65075Td4(this, 11)));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            if (this.A04 && (c63380Siu = (c58883QEt = this.A0A).A05) != null && (c62694SMi = c63380Siu.A08) != null) {
                C63628Sqa A00 = C63628Sqa.A00(this, 8);
                InterfaceC172727mi interfaceC172727mi = ((AbstractC63223SfY) c58883QEt).A04;
                if (interfaceC172727mi instanceof C07X) {
                    C07X c07x = (C07X) interfaceC172727mi;
                    if (c07x != null) {
                        c62694SMi.A00().A06(c07x, A00);
                        return;
                    }
                    return;
                }
                AbstractC63402SjX.A0A(c58883QEt.A03(), c58883QEt.A0Y, c58883QEt.A0X.A00("NULL_LIFE_CYCLE_OWNER", false).A00());
            }
        }
    }
}
