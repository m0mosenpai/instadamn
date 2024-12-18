package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3BS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BS extends AbstractC60592pi {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC684136e A02;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        UserSession userSession = this.A01;
        List A08 = C25A.A00(userSession).A08();
        if (!A08.isEmpty()) {
            C47Z c47z = (C47Z) A08.get(A08.size() - 1);
            final String str = c47z.A33;
            if (c47z.A5P && str != null && C17060sy.A01.A01(userSession).A0M() == C05F.A01) {
                C11T.A04(new Runnable() { // from class: X.Awd
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        C3BS c3bs = C3BS.this;
                        String str2 = str;
                        Activity activity = c3bs.A00;
                        if (activity instanceof InterfaceC53722dB) {
                            i = ((InterfaceC53722dB) activity).BHR(AbstractC58592mI.A00(c3bs.A01).A00());
                        } else {
                            i = -1;
                        }
                        c3bs.A02.Enu(activity, AbstractC167007dF.A0I(str2), i);
                    }
                }, 200L);
            }
        }
    }

    public C3BS(Activity activity, UserSession userSession, InterfaceC684136e interfaceC684136e) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = interfaceC684136e;
    }
}
