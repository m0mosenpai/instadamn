package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.IqC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42409IqC implements GXX {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Product A04;

    @Override // X.GXX
    public final void Dkf(String str) {
        C14360o3.A0B(str, 0);
        int length = str.length();
        int i = length - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= i) {
            int i3 = i;
            if (!z) {
                i3 = i2;
            }
            boolean A19 = AbstractC167027dH.A19(str, i3);
            if (!z) {
                if (!A19) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!A19) {
                break;
            } else {
                i--;
            }
        }
        String obj = str.subSequence(i2, i + 1).toString();
        if (obj != null && obj.length() != 0) {
            C28531Zo.A04.A0E(this.A03, this.A04, this.A00.getModuleName(), "message_merchant", obj);
            InterfaceC103384lE interfaceC103384lE = this.A02;
            C6FX c6fx = new C6FX();
            c6fx.A03(Integer.valueOf(length), 0);
            C131845xK.A00(this.A01, c6fx.A00(), interfaceC103384lE);
        }
    }

    public C42409IqC(InterfaceC11380iw interfaceC11380iw, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, UserSession userSession, Product product) {
        this.A03 = userSession;
        this.A04 = product;
        this.A00 = interfaceC11380iw;
        this.A02 = interfaceC103384lE;
        this.A01 = c6fq;
    }
}
