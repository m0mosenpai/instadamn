package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes8.dex */
public final class KK3 extends C2AG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C105824pt A01;
    public final /* synthetic */ C145386gx A02;

    @Override // X.C11R
    public final int getRunnableId() {
        return 768;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C11T.A03(new GP3(this.A02, false));
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C11T.A03(new GP3(this.A02, true));
    }

    public KK3(Context context, C105824pt c105824pt, C145386gx c145386gx) {
        this.A00 = context;
        this.A01 = c105824pt;
        this.A02 = c145386gx;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        Context context = this.A00;
        File A11 = AbstractC166987dD.A11(AbstractC916948n.A0A(context, ".mp4", System.nanoTime(), true));
        C105824pt c105824pt = this.A01;
        C145386gx c145386gx = this.A02;
        UserSession userSession = c145386gx.A01;
        if (userSession != null) {
            C75363a3 A04 = c105824pt.A04(userSession);
            if (A04 != null && (str = A04.A0L) != null) {
                UserSession userSession2 = c145386gx.A01;
                if (userSession2 != null) {
                    File A08 = AbstractC50633MWu.A08(userSession2, A11, str, -1L);
                    if (A08 != null) {
                        if (!A08.equals(A11)) {
                            AbstractC13530mf.A0B(A11, new FileInputStream(A08));
                        }
                        AbstractC50633MWu.A09(context, A11);
                        C11T.A03(new GP3(c145386gx, true));
                        return null;
                    }
                }
            }
            throw new Exception("Attempt to download archive could not find cache or file");
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }
}
