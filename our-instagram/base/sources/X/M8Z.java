package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: classes8.dex */
public final class M8Z implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public M8Z(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) this.A02;
                List list = ((C6FW) obj).A00;
                interfaceC16610sE.invoke(list.get(0), list.get(1), list.get(2));
                return null;
            case 1:
                return AbstractC47035Kqs.A00((C47915LEj) this.A01, (List) this.A02, (InterfaceC23621Ds) obj);
            case 2:
                Context context = (Context) this.A01;
                Object obj2 = this.A02;
                return new C25282BGy((String) obj).A00(context, new C71680WyY(obj2, 0), AbstractC72723Nt.A00(context));
            default:
                MailboxFeature mailboxFeature = (MailboxFeature) obj;
                InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(mailboxFeature);
                MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
                AbstractC43594JPz.A1G(A0H, new C44176Jff(29, mailboxFeature, A0D), A0D);
                A0D.addResultCallback(new JVL(this, 33));
                return C0eB.A00;
        }
    }
}
