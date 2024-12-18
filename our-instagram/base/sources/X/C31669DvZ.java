package X;

import android.content.Context;
import android.text.SpannableString;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "legacy translation feature")
/* renamed from: X.DvZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31669DvZ implements InterfaceC37207GaI {
    public final C18920wW A00;
    public final UserSession A01;
    public final InterfaceC08830cm A02;
    public final InterfaceC09390do A03 = C37058GUs.A01(this, 8);

    @Override // X.InterfaceC37207GaI
    public final void Dtc(MessageIdentifier messageIdentifier, Integer num) {
        C14360o3.A0B(num, 1);
        ((C36412G4n) this.A03.getValue()).DtZ(messageIdentifier, num);
    }

    @Override // X.InterfaceC37207GaI
    public final void onDestroy() {
    }

    @Override // X.InterfaceC37207GaI
    public final boolean APD() {
        return ((C36412G4n) this.A03.getValue()).A01();
    }

    @Override // X.InterfaceC37207GaI
    public final SpannableString BVr(Context context, InterfaceC164947Zj interfaceC164947Zj, MessageIdentifier messageIdentifier, Integer num, int i) {
        return ((C36412G4n) this.A03.getValue()).Dm5(context, messageIdentifier, num, i);
    }

    @Override // X.InterfaceC37207GaI
    public final void F8Y(C7TT c7tt, List list, boolean z, boolean z2) {
        ((C36412G4n) this.A03.getValue()).A00(c7tt, list, z);
    }

    public C31669DvZ(C18920wW c18920wW, UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        this.A01 = userSession;
        this.A00 = c18920wW;
        this.A02 = interfaceC08830cm;
    }
}
