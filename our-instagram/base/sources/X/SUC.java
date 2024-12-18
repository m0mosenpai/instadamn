package X;

import android.accounts.AccountManager;
import android.content.Context;
import android.util.Patterns;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public abstract class SUC {
    public static final InterfaceExecutorServiceC73393Qq A00;

    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 0);
        Object A02 = c6fw.A02();
        AbstractC25225BEi.A1S(A02);
        String str = (String) A02;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            AbstractC12990ll A0A = C6BQ.A0A(C6BQ.A09(c6fq));
            if (str != null && str.length() != 0 && AbstractC31175DnJ.A1Z(str, Patterns.EMAIL_ADDRESS)) {
                C14360o3.A0B("@gmail.com", 1);
                if (str.endsWith("@gmail.com") && !AbstractC23451Ch.A07(context, AbstractC111324zv.A00(59))) {
                    AccountManager accountManager = AccountManager.get(context);
                    InterfaceExecutorServiceC73393Qq interfaceExecutorServiceC73393Qq = A00;
                    ListenableFuture submit = interfaceExecutorServiceC73393Qq.submit(new TUR(accountManager, A0A, str, 0));
                    C14360o3.A07(submit);
                    C2OD.A03(new T8L(c6fq, A0I, str, 2), submit, interfaceExecutorServiceC73393Qq);
                }
            }
            C131845xK.A00(c6fq, AbstractC58320PtC.A0g(null), A0I);
            return null;
        }
        return null;
    }

    static {
        InterfaceScheduledExecutorServiceC73383Qp listeningDecorator = MoreExecutors.listeningDecorator((ScheduledExecutorService) C14250np.A00().A00);
        C14360o3.A07(listeningDecorator);
        A00 = listeningDecorator;
    }
}
