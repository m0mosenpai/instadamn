package X;

import android.text.TextUtils;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GPB implements Runnable {
    public final /* synthetic */ EO4 A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;

    public GPB(EO4 eo4, User user, String str) {
        this.A00 = eo4;
        this.A02 = str;
        this.A01 = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean BBV;
        EO4 eo4 = this.A00;
        AbstractC25226BEj.A1Q(eo4);
        String str = this.A02;
        if (!TextUtils.isEmpty(str)) {
            User user = this.A01;
            if (!user.A1a() && (BBV = user.A03.BBV()) != null && BBV.booleanValue()) {
                C2JM A0b = AbstractC25225BEi.A0b();
                AbstractC25231BEo.A18(AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "user_inputted_phone_number"), A0b);
                C195928le.A00(eo4.getSession()).ATV(new C35796FrY(0), new InterfaceC48192Ji() { // from class: X.Fs3
                    @Override // X.InterfaceC48192Ji
                    public final void invoke(AnonymousClass436 anonymousClass436) {
                        Object Bos = anonymousClass436.Bos();
                        if (Bos != null) {
                            ((AbstractC907342m) Bos).A00(E5T.class, "is_whatsapp_business_phone_number");
                        }
                    }
                }, new C907442n(A0b, E5U.class, "IGSendWhatsappLinkCreationVerification", false));
            }
        }
    }
}
