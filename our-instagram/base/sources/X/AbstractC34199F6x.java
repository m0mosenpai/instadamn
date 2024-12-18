package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;

/* renamed from: X.F6x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34199F6x {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.KiG] */
    public static final C43655JSn A00(Context context, UserSession userSession, Capabilities capabilities, InterfaceC83733oI interfaceC83733oI) {
        Object c32863Ed5;
        C5Fn c5Fn = AbstractC142856cl.A00;
        GRM grm = GRM.A00;
        AbstractC42141x4.A01(grm, "supplier is null");
        CallableC72330XbS callableC72330XbS = new CallableC72330XbS(grm);
        AbstractC150996r0 abstractC150996r0 = c5Fn.A00;
        AbstractC42141x4.A01(abstractC150996r0, AbstractC43591JPw.A00(1301));
        C42221xC c42221xC = new C42221xC(new C1346266m(callableC72330XbS, abstractC150996r0));
        boolean z = interfaceC83733oI instanceof MsysThreadId;
        List A1Q = AbstractC16960so.A1Q(new C32868EdA(z), new Object());
        if (z) {
            c32863Ed5 = new C32864Ed6(userSession, capabilities, C137746Lw.A00(userSession, "DirectThreadDetailInfoReduxStore"), (MsysThreadId) interfaceC83733oI);
        } else if (AbstractC1345466e.A02(interfaceC83733oI) != null) {
            c32863Ed5 = new C32863Ed5(context, userSession, capabilities, AbstractC1345466e.A01(interfaceC83733oI));
        } else {
            throw AbstractC166987dD.A14("Unexpected value for threadId");
        }
        return new C43655JSn(c42221xC, c5Fn, A1Q, AbstractC166987dD.A1J(c32863Ed5));
    }
}
