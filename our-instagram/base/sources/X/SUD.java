package X;

import android.accounts.AccountManager;
import android.content.Context;
import android.util.Patterns;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public abstract class SUD {
    public static final InterfaceExecutorServiceC73393Qq A00;

    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            String A0e = AbstractC31177DnL.A0e(c6fw, 0);
            InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
            AbstractC12990ll A0A = C6BQ.A0A(C6BQ.A09(c6fq));
            if (A0e != null && A0e.length() != 0 && AbstractC31175DnJ.A1Z(A0e, Patterns.EMAIL_ADDRESS)) {
                C14360o3.A0B("gmail.com", 1);
                if (A0e.endsWith("gmail.com") && !AbstractC23451Ch.A07(context, AbstractC111324zv.A00(59))) {
                    AccountManager accountManager = AccountManager.get(context);
                    InterfaceExecutorServiceC73393Qq interfaceExecutorServiceC73393Qq = A00;
                    ListenableFuture submit = interfaceExecutorServiceC73393Qq.submit(new TUR(accountManager, A0A, A0e, 1));
                    C14360o3.A07(submit);
                    C2OD.A03(new T8J(2, A0G, c6fq), submit, interfaceExecutorServiceC73393Qq);
                }
            }
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A03("", 0);
            AbstractC25227BEk.A1M(c6fq, A0s, A0G);
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
