package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Lvh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49588Lvh implements C0JG {
    public final /* synthetic */ C48182Jh A00;
    public final /* synthetic */ AtomicReference A01;

    public C49588Lvh(C48182Jh c48182Jh, AtomicReference atomicReference) {
        this.A00 = c48182Jh;
        this.A01 = atomicReference;
    }

    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        this.A01.set(C2KW.A00(userSession));
        interfaceC03960Jm.AIn(null);
    }
}
