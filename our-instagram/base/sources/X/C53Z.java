package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.53Z, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C53Z extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "UserSessionFragment";
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe
    public final UserSession getSession() {
        return (UserSession) this.session$delegate.getValue();
    }
}
