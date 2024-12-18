package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LmC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49024LmC implements C7Q6 {
    public final InterfaceC164887Zb A00;

    public final void A00(MessageIdentifier messageIdentifier, String str, String str2, String str3) {
        this.A00.Cs7(null, null, null, messageIdentifier, null, null, null, str, str2, null, null, str3, null, null, null, null, null, null, null, null, AbstractC167007dF.A1R(0, str, str2) ? 1 : 0, false);
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        C7QY c7qy;
        KT2 kt2 = (KT2) obj;
        C14360o3.A0B(kt2, 0);
        if (kt2.A06 != null && (c7qy = kt2.A02) != null) {
            C9C9 c9c9 = c7qy.A08;
            A00(c7qy.A0L, c9c9.A01, c9c9.A00, kt2.A07);
            return true;
        }
        return true;
    }

    public C49024LmC(InterfaceC164887Zb interfaceC164887Zb) {
        this.A00 = interfaceC164887Zb;
    }
}
