package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "Please use UserExperimentParameterProvider instead.")
/* renamed from: X.2Ei, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47162Ei implements InterfaceC08830cm {
    public final UserSession A00;
    public final C0tH A01;

    public final Object A00() {
        return this.A01.A00(this.A00);
    }

    @Override // X.InterfaceC08830cm
    public final Object get() {
        return this.A01.A01(this.A00);
    }

    public C47162Ei(UserSession userSession, C0tH c0tH) {
        this.A00 = userSession;
        this.A01 = c0tH;
    }
}
