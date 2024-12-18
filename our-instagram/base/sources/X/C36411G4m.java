package X;

import android.content.Context;
import android.text.SpannableString;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.G4m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36411G4m implements InterfaceC165217aA {
    public final InterfaceC164947Zj A00;
    public final InterfaceC16820sZ A01;

    public C36411G4m(InterfaceC164947Zj interfaceC164947Zj, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC164947Zj, 2);
        this.A01 = interfaceC16820sZ;
        this.A00 = interfaceC164947Zj;
    }

    @Override // X.InterfaceC165217aA
    public final SpannableString Dm5(Context context, MessageIdentifier messageIdentifier, Integer num, int i) {
        AbstractC167027dH.A12(context, messageIdentifier, num);
        return ((InterfaceC37207GaI) ((C7YO) this.A01.invoke()).A03.getValue()).BVr(context, this.A00, messageIdentifier, num, i);
    }

    @Override // X.InterfaceC165217aA
    public final void DtZ(MessageIdentifier messageIdentifier, Integer num) {
        C14360o3.A0B(num, 1);
        ((InterfaceC37207GaI) ((C7YO) this.A01.invoke()).A03.getValue()).Dtc(messageIdentifier, num);
    }
}
