package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7Eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159697Eh implements C7ZZ, InterfaceC165027Zr {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final UserSession A01;
    public final InterfaceC08830cm A02;

    @Override // X.InterfaceC165027Zr
    public final C47349Kvy ChN(InterfaceC50467MPv interfaceC50467MPv, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        UserSession userSession = this.A01;
        InterfaceC09390do interfaceC09390do = LKn.A05;
        AbstractC46712KlV.A00(userSession).A04(new C48272LXv(this, interfaceC50467MPv, atomicBoolean), str);
        return new C47349Kvy(atomicBoolean);
    }

    @Override // X.C7ZZ
    public final L7B ChZ(InterfaceC50432MOm interfaceC50432MOm, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C47385Kwa ChY = ((C7U0) this.A02.get()).Avk().ChY(new L1N(this, interfaceC50432MOm, atomicBoolean), str);
        if (ChY != null) {
            return new L7B(this, ChY, atomicBoolean);
        }
        return null;
    }

    public C159697Eh(UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        this.A01 = userSession;
        this.A02 = interfaceC08830cm;
    }
}
