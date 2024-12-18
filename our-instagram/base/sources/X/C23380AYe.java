package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.OdinContext;
import java.util.Collection;

/* renamed from: X.AYe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23380AYe implements InterfaceC73623Ro {
    public final C0JM A00;
    public final InterfaceC73623Ro A01;
    public final InterfaceC73603Rm A02;
    public final String A03;
    public final Boolean A04;

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        C16930sl c16930sl;
        String str;
        C3SN ATr;
        if (AbstractC166997dE.A1Z(this.A04, true)) {
            C3SN EKt = this.A02.EKt(this.A03);
            if (!EKt.A02) {
                c16930sl = C16930sl.A00;
                str = EKt.A01;
            } else if (this.A00.now() > AbstractC166987dD.A0N(EKt.A00) + 2592000000L) {
                c16930sl = C16930sl.A00;
                str = AbstractC111324zv.A00(3073);
            } else {
                InterfaceC73623Ro interfaceC73623Ro = this.A01;
                if (interfaceC73623Ro != null && (ATr = interfaceC73623Ro.ATr(null)) != null) {
                    return ATr;
                }
                c16930sl = C16930sl.A00;
                str = "shared prefs source not available";
            }
            return new C3SN(c16930sl, str, false);
        }
        C3SN E82 = this.A02.E82(null, this.A03);
        if (!E82.A02) {
            return C3SO.A00(E82, C16930sl.A00);
        }
        Collection values = ((Example) E82.A00).A02.values();
        C14360o3.A07(values);
        return new C3SN(AbstractC001800i.A0a(values), null, true);
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "Server";
    }

    public C23380AYe(C0JM c0jm, InterfaceC73623Ro interfaceC73623Ro, InterfaceC73603Rm interfaceC73603Rm, Boolean bool, String str) {
        AbstractC167017dG.A1P(c0jm, interfaceC73603Rm);
        this.A00 = c0jm;
        this.A02 = interfaceC73603Rm;
        this.A03 = str;
        this.A01 = interfaceC73623Ro;
        this.A04 = bool;
    }
}
