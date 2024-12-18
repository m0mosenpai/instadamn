package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.BWj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25673BWj extends AbstractC25398BLp {
    public final C28184CbX A00;
    public final InterfaceC09390do A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25673BWj(Context context, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C75113Zb c75113Zb, InterfaceC30855DhU interfaceC30855DhU) {
        super(context, c120985dq, c37644Ghd, null, interfaceC11380iw, userSession, c75113Zb, interfaceC30855DhU);
        C14360o3.A0B(userSession, 3);
        AbstractC25234BEr.A0k(4, interfaceC11380iw, c37644Ghd, c75113Zb, interfaceC30855DhU);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C1DW.A00(userSession).A03(c38321qM);
        }
        this.A00 = new C28184CbX(c120985dq.A0F, userSession);
        this.A01 = AbstractC09440dt.A01(DH2.A01(interfaceC11380iw, c120985dq, userSession, 39));
    }
}
