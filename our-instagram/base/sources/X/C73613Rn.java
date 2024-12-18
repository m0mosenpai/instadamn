package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.OdinContext;
import java.util.Collection;

/* renamed from: X.3Rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73613Rn implements InterfaceC73623Ro {
    public final InterfaceC73603Rm A00;
    public final String A01;

    public C73613Rn(InterfaceC73603Rm interfaceC73603Rm, String str) {
        C14360o3.A0B(interfaceC73603Rm, 1);
        C14360o3.A0B(str, 2);
        this.A00 = interfaceC73603Rm;
        this.A01 = str;
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        String str;
        InterfaceC73603Rm interfaceC73603Rm = this.A00;
        String str2 = this.A01;
        if (odinContext == null || (str = odinContext.A01) == null) {
            str = "";
        }
        if (str2.equals("FB_CP")) {
            str2 = AnonymousClass001.A0T(str2, str, '_');
        }
        C3SN E82 = interfaceC73603Rm.E82(null, str2);
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
}
