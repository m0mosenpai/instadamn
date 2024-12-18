package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EUR extends C1P1 {
    public AbstractC33619EtV A00;
    public final Context A01;
    public final UserSession A02;

    public EUR(Context context, UserSession userSession, AbstractC33619EtV abstractC33619EtV) {
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = abstractC33619EtV;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        Integer num;
        int A03 = C0f9.A03(2037447252);
        User A10 = AbstractC166987dD.A10(this.A02);
        Integer A0M = A10.A0M();
        Integer num2 = C05F.A0C;
        if (A0M == num2) {
            num = C05F.A01;
        } else {
            num = num2;
        }
        A10.A0n(num);
        AbstractC33619EtV abstractC33619EtV = this.A00;
        if (abstractC33619EtV != null && (abstractC33619EtV instanceof C32998Egl)) {
            C14360o3.A0B(abstractC115105If, 0);
            C33226ElG c33226ElG = ((C32998Egl) abstractC33619EtV).A00;
            C08730cb c08730cb = C17060sy.A01;
            InterfaceC09390do interfaceC09390do = c33226ElG.A0E;
            C33226ElG.A04(c33226ElG, AbstractC167007dF.A1X(AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A0M(), num2));
            AbstractC35254Fgn.A07(c33226ElG, abstractC115105If);
            C35132FeZ.A01(AbstractC166987dD.A0r(interfaceC09390do));
        }
        C0f9.A0A(-327204551, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-26927604);
        AbstractC33619EtV abstractC33619EtV = this.A00;
        if (abstractC33619EtV != null && (abstractC33619EtV instanceof C32998Egl)) {
            ((C32998Egl) abstractC33619EtV).A00.A09 = false;
        }
        C0f9.A0A(-1983286310, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        C0f9.A0A(-286362420, C0f9.A03(-61118774));
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C193328hC A0I;
        int A03 = C0f9.A03(-1493145733);
        EDA eda = (EDA) obj;
        int A032 = C0f9.A03(-1233725082);
        if (eda.A03) {
            String str = eda.A02;
            String str2 = eda.A01;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (eda.A04 && AbstractC166987dD.A10(this.A02).A0M() == C05F.A01) {
                    Context context = this.A01;
                    A0I = AbstractC31176DnK.A0a(context, str2, str);
                    A0I.A0e(DialogInterfaceOnClickListenerC35454FkB.A00(this, 23), context.getString(2131965989));
                    A0I.A0Y(DialogInterfaceOnClickListenerC35454FkB.A00(this, 22), EnumC193348hE.A03, context.getString(2131954754), true);
                    DialogInterfaceOnCancelListenerC35300FhZ.A00(A0I, this, 7);
                } else {
                    A0I = AbstractC31171DnF.A0I(this.A01);
                    A0I.A0s(true);
                    A0I.A0t(true);
                    A0I.A05 = eda.A02;
                    A0I.A0r(eda.A01);
                    A0I.A07();
                    A0I.A0g(new DialogInterfaceOnDismissListenerC35459FkG(1, eda, this));
                }
                AbstractC166987dD.A1W(A0I);
            } else {
                AbstractC35254Fgn.A01(this.A01);
            }
        } else {
            AbstractC33619EtV abstractC33619EtV = this.A00;
            if (abstractC33619EtV != null) {
                abstractC33619EtV.A00(eda);
            }
        }
        C0f9.A0A(-1824819817, A032);
        C0f9.A0A(1114817841, A03);
    }
}
