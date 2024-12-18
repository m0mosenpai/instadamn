package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Lmb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49049Lmb implements InterfaceC165367aP {
    public final InterfaceC08830cm A00;
    public final InterfaceC16820sZ A01;

    @Override // X.InterfaceC165367aP
    public final void DS3(MessageIdentifier messageIdentifier) {
        C14360o3.A0B(messageIdentifier, 0);
        ((View) this.A01.invoke()).post(new RunnableC49948M3p(this, messageIdentifier));
    }

    public C49049Lmb(InterfaceC08830cm interfaceC08830cm, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167017dG.A1P(interfaceC08830cm, interfaceC16820sZ);
        this.A00 = interfaceC08830cm;
        this.A01 = interfaceC16820sZ;
    }
}
