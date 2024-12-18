package X;

import android.accounts.AccountManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public abstract class SUE {
    public static final InterfaceExecutorServiceC73393Qq A00;

    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 0);
        ArrayList A03 = C35269Fh4.A03(C1LZ.A00().A00, A0B, "LOG_IN");
        if (A03.isEmpty()) {
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A03(AbstractC06930Yk.A0E(), 0);
            AbstractC25227BEk.A1M(c6fq, A0s, A0I);
            return null;
        }
        AccountManager accountManager = AccountManager.get(C1LZ.A00().A00);
        InterfaceExecutorServiceC73393Qq interfaceExecutorServiceC73393Qq = A00;
        ListenableFuture submit = interfaceExecutorServiceC73393Qq.submit(new TUQ(1, accountManager, A03, A0B));
        C14360o3.A07(submit);
        C2OD.A03(new T8J(3, A0I, c6fq), submit, interfaceExecutorServiceC73393Qq);
        return null;
    }

    static {
        InterfaceScheduledExecutorServiceC73383Qp listeningDecorator = MoreExecutors.listeningDecorator((ScheduledExecutorService) C14250np.A00().A00);
        C14360o3.A07(listeningDecorator);
        A00 = listeningDecorator;
    }
}
