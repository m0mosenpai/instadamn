package X;

import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormDateTimeQuestionView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.Ozh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56320Ozh implements InterfaceC58115Ppe {
    public final int A00;
    public final Object A01;

    public C56320Ozh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58115Ppe
    public final void D9K(Date date) {
        if (this.A00 != 0) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((N6P) this.A01).A02);
            PZY.A02(date, A0Z, AbstractC141776au.A00(A0Z), 44);
        }
    }

    @Override // X.InterfaceC58115Ppe
    public final void DB6() {
    }

    @Override // X.InterfaceC58115Ppe
    public final void DBG(Date date) {
        String A02;
        if (this.A00 != 0) {
            C51010MgH c51010MgH = (C51010MgH) ((N6P) this.A01).A02.getValue();
            c51010MgH.A0D.Egh(date);
            OUK ouk = c51010MgH.A06;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(ouk.A05), "upcoming_event_creation_action");
            AbstractC31171DnF.A1C(A0f, "set_start_time");
            AbstractC37300Gc1.A0n(A0f, ouk.A03);
            OUK.A00(A0f, ouk, null);
            PZD.A02(c51010MgH, AbstractC141776au.A00(c51010MgH), 19);
            return;
        }
        ODB odb = (ODB) this.A01;
        InterfaceC57834Pl0 interfaceC57834Pl0 = odb.A02;
        UserSession userSession = odb.A00;
        LeadGenFormDateTimeQuestionView leadGenFormDateTimeQuestionView = (LeadGenFormDateTimeQuestionView) interfaceC57834Pl0;
        IgFormField igFormField = leadGenFormDateTimeQuestionView.A00;
        String str = "";
        if (date == null) {
            A02 = "";
        } else {
            A02 = MX0.A02(AbstractC166997dE.A0L(leadGenFormDateTimeQuestionView), userSession, date.getTime());
        }
        igFormField.setText(A02);
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = ((AbstractC50822Mcy) leadGenFormDateTimeQuestionView).A00;
        if (leadGenFormBaseQuestion != null) {
            if (date != null) {
                str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(date);
            }
            C14360o3.A0A(str);
            leadGenFormDateTimeQuestionView.A0F(leadGenFormBaseQuestion, str);
        }
        odb.A01.A01();
    }
}
