package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Llw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49008Llw implements C7Q6 {
    public final InterfaceC165147a3 A00;

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        C163157Sa c163157Sa = (C163157Sa) obj;
        AbstractC46449Kh9 abstractC46449Kh9 = c163157Sa.A08;
        boolean BCt = c163157Sa.BCt();
        MessageIdentifier messageIdentifier = (MessageIdentifier) c163157Sa.A0F.getValue();
        InterfaceC165147a3 interfaceC165147a3 = this.A00;
        if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) interfaceC165147a3, messageIdentifier, BCt) && abstractC46449Kh9 != null && (abstractC46449Kh9 instanceof C45948KUz)) {
            C45948KUz c45948KUz = (C45948KUz) abstractC46449Kh9;
            String str = c45948KUz.A04;
            interfaceC165147a3.CrG(c45948KUz.A01, str, c45948KUz.A02, c45948KUz.A06, c45948KUz.A03, c45948KUz.A05, c45948KUz.A00, c45948KUz.A07);
            return true;
        }
        return true;
    }

    public C49008Llw(InterfaceC165147a3 interfaceC165147a3) {
        this.A00 = interfaceC165147a3;
    }
}
