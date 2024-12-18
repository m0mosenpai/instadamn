package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.On7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55622On7 implements CallerContextable {
    public static final CallerContext A03 = CallerContext.A00(C55622On7.class);
    public static final String __redex_internal_original_name = "FacebookCrossPostManager";
    public InterfaceC16660sJ A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;

    public C55622On7(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A00 = C57640Phq.A00;
    }
}
