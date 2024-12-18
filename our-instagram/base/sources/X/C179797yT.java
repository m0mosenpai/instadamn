package X;

import android.app.ActivityManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.7yT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179797yT extends AbstractC179807yU implements InterfaceC179827yW {
    public volatile InterfaceC179497xz A00;
    public volatile InterfaceC179597y9 A01;

    @Override // X.AbstractC178227vw
    public final void A09() {
        C178087vh c178087vh = InterfaceC179497xz.A01;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC179807yU) this).A00;
        this.A00 = (InterfaceC179497xz) interfaceC178207vu.Aq0(c178087vh);
        C178087vh c178087vh2 = InterfaceC179597y9.A00;
        if (interfaceC178207vu.CRY(c178087vh2)) {
            this.A01 = (InterfaceC179597y9) interfaceC178207vu.Aq0(c178087vh2);
        }
    }

    @Override // X.InterfaceC179817yV
    public final C179837yX BKZ() {
        C179837yX c179837yX = InterfaceC179827yW.A00;
        C14360o3.A08(c179837yX);
        return c179837yX;
    }

    @Override // X.InterfaceC179827yW
    public final boolean CMF(String str, String str2) {
        long j;
        Number number;
        boolean CUZ;
        Number number2;
        C178087vh c178087vh = InterfaceC179647yE.A00;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC179807yU) this).A00;
        if (interfaceC178207vu.CRY(c178087vh)) {
            ComponentCallbacks2C179637yD componentCallbacks2C179637yD = (ComponentCallbacks2C179637yD) ((InterfaceC179647yE) interfaceC178207vu.Aq0(c178087vh));
            C179657yF c179657yF = componentCallbacks2C179637yD.A01;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            c179657yF.A00.getMemoryInfo(memoryInfo);
            long j2 = memoryInfo.availMem;
            InterfaceC178337w7 interfaceC178337w7 = componentCallbacks2C179637yD.A02;
            boolean z = interfaceC178337w7 instanceof C178317w5;
            if (z) {
                j = C18U.A01(C06090Tz.A06, ((C178317w5) interfaceC178337w7).A00, 36606912502044180L);
            } else {
                j = 0;
            }
            if (j2 < j) {
                CUZ = interfaceC178337w7.CUZ(130);
            } else {
                if (!z) {
                    return true;
                }
                UserSession userSession = ((C178317w5) interfaceC178337w7).A00;
                C06090Tz c06090Tz = C06090Tz.A06;
                if ((C18U.A01(c06090Tz, userSession, 36606912502175253L) != 10 || (number2 = (Number) A42.A00.get(str)) == null || j2 >= number2.longValue()) && (C18U.A01(c06090Tz, userSession, 36606912502175253L) != 30 || (number = (Number) A42.A01.get(str)) == null || j2 >= number.longValue())) {
                    return true;
                }
                CUZ = interfaceC178337w7.CUZ(131);
            }
            return !CUZ;
        }
        return true;
    }

    @Override // X.InterfaceC179827yW
    public final void DIe() {
        C179587y8 c179587y8;
        InterfaceC178817wt interfaceC178817wt;
        InterfaceC179597y9 interfaceC179597y9 = this.A01;
        if (interfaceC179597y9 != null && (interfaceC178817wt = (c179587y8 = (C179587y8) interfaceC179597y9).A03) != null && !AbstractC177217uH.A00(((AbstractC178657wd) c179587y8).A00.getContext())) {
            C177487ui c177487ui = new C177487ui(c179587y8);
            c179587y8.A00 = c177487ui;
            interfaceC178817wt.Eca(c177487ui);
        }
    }
}
