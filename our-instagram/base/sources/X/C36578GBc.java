package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import java.util.Map;

/* renamed from: X.GBc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36578GBc implements GYA {
    public boolean A00;
    public final C32278EJo A01;
    public final Map A02;
    public final Context A03;
    public final UserSession A04;
    public final C154706xL A05;

    public C36578GBc(Context context, UserSession userSession, C32278EJo c32278EJo) {
        C14360o3.A0B(userSession, 3);
        this.A01 = c32278EJo;
        this.A03 = context;
        this.A04 = userSession;
        this.A02 = AbstractC166987dD.A1G();
        this.A05 = (C154706xL) userSession.A01(C154706xL.class, new GSw(userSession, 24));
    }

    public static final void A00(C36578GBc c36578GBc, C32200ECv c32200ECv, String str) {
        CharSequence charSequence;
        if (c32200ECv.A01 != null) {
            C155506yf A00 = AbstractC155496ye.A00(c36578GBc.A04);
            long j = A00.A02;
            if (j != 0) {
                A00.A06 = true;
                UserFlowLoggerImpl userFlowLoggerImpl = A00.A0A;
                userFlowLoggerImpl.flowAnnotate(j, TraceFieldType.FailureReason, str);
                userFlowLoggerImpl.flowMarkPoint(A00.A02, "username_change_error");
            }
            C9GR.A03(c36578GBc.A03, c32200ECv.A01, str, 0);
            C154706xL c154706xL = c36578GBc.A05;
            IgFormField igFormField = c36578GBc.A01.A03;
            if (igFormField != null) {
                charSequence = igFormField.getText();
            } else {
                charSequence = null;
            }
            c154706xL.A02 = String.valueOf(charSequence);
            return;
        }
        C0w9.A03("check_username", "no server error message");
    }

    @Override // X.GYA
    public final void E4H() {
        CharSequence charSequence;
        if (!this.A00) {
            C32278EJo c32278EJo = this.A01;
            IgFormField igFormField = c32278EJo.A03;
            if (igFormField != null) {
                charSequence = igFormField.getText();
            } else {
                charSequence = null;
            }
            String valueOf = String.valueOf(charSequence);
            if (valueOf.length() == 0) {
                AbstractC167007dF.A0x(c32278EJo.A00);
                ActionButton actionButton = c32278EJo.A02;
                if (actionButton != null) {
                    actionButton.setEnabled(false);
                    return;
                }
                return;
            }
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession = this.A04;
            if (valueOf.equals(AbstractC31173DnH.A0n(userSession, c08730cb))) {
                AbstractC167007dF.A0x(c32278EJo.A00);
                AbstractC31180DnO.A18(c32278EJo.A02);
                return;
            }
            C32200ECv c32200ECv = (C32200ECv) this.A02.get(valueOf);
            if (c32200ECv != null) {
                boolean z = c32200ECv.A02;
                AbstractC167007dF.A0x(c32278EJo.A00);
                if (z) {
                    AbstractC31180DnO.A18(c32278EJo.A02);
                    return;
                }
                ActionButton actionButton2 = c32278EJo.A02;
                if (actionButton2 != null) {
                    actionButton2.setEnabled(false);
                }
                A00(this, c32200ECv, "response_not_available");
                return;
            }
            C1ON A00 = AbstractC152476ta.A00(this.A03, userSession, valueOf);
            A00.A00 = new EUM(this, valueOf);
            C1GJ.A03(A00);
        }
    }
}
