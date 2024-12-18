package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.direct.sharetostory.data.MessageShareStickerData;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.G4h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36406G4h implements InterfaceC165177a6 {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC08830cm A02;
    public final InterfaceC08830cm A03;
    public final InterfaceC16820sZ A04;

    public C36406G4h(Activity activity, UserSession userSession, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC25233BEq.A0x(3, interfaceC08830cm, interfaceC08830cm2, interfaceC16820sZ);
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = interfaceC08830cm;
        this.A03 = interfaceC08830cm2;
        this.A04 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC165177a6
    public final void Ei0(C9CJ c9cj, MessageIdentifier messageIdentifier, Integer num) {
        String str;
        C14360o3.A0B(num, 2);
        UserSession userSession = this.A01;
        InterfaceC08830cm interfaceC08830cm = this.A02;
        Capabilities capabilities = ((AnonymousClass988) this.A03.get()).A01;
        String str2 = null;
        if (c9cj != null) {
            str = c9cj.A02;
        } else {
            str = null;
        }
        DirectPromptTypes A01 = C7D2.A01(str);
        if (c9cj != null) {
            str2 = c9cj.A01;
        }
        MessageShareStickerData A00 = AbstractC35064Fcb.A00(userSession, capabilities, A01, messageIdentifier, num, str2, interfaceC08830cm);
        if (A00 != null) {
            AbstractC35064Fcb.A02(this.A00, userSession, A00, (C6WQ) this.A04.invoke());
        }
    }

    @Override // X.InterfaceC165177a6
    public final void Ehw(MessageIdentifier messageIdentifier, Integer num) {
        AbstractC167017dG.A1N(messageIdentifier, num);
        UserSession userSession = this.A01;
        MessageShareStickerData A01 = AbstractC35064Fcb.A01(userSession, ((AnonymousClass988) this.A03.get()).A01, messageIdentifier, num, this.A02);
        if (A01 != null) {
            AbstractC35064Fcb.A02(this.A00, userSession, A01, (C6WQ) this.A04.invoke());
        }
    }
}
