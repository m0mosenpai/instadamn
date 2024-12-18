package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.Llx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49009Llx implements C7Q6 {
    public final InterfaceC50515MRs A00;

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        String str;
        C45896KSz c45896KSz = (C45896KSz) obj;
        C44786Js7 c44786Js7 = (C44786Js7) obj2;
        boolean A1R = AbstractC167007dF.A1R(0, c45896KSz, c44786Js7);
        C7QY c7qy = c45896KSz.A00;
        DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
        InterfaceC50515MRs interfaceC50515MRs = this.A00;
        if (interfaceC50515MRs.CSC(directMessageIdentifier)) {
            interfaceC50515MRs.stop();
            return true;
        }
        C9C3 c9c3 = c7qy.A05;
        if (c9c3 != null && (str = c9c3.A01) != null) {
            long j = 0;
            long A0t = AbstractC25232BEp.A0t((Number) c9c3.A04);
            Number number = (Number) c9c3.A00;
            if (number != null) {
                j = number.longValue();
            }
            c44786Js7.Cy4(0, 0, A1R);
            interfaceC50515MRs.E4U(c44786Js7, directMessageIdentifier, str, A0t, A0t + j);
            return true;
        }
        return false;
    }

    public C49009Llx(InterfaceC50515MRs interfaceC50515MRs) {
        this.A00 = interfaceC50515MRs;
    }
}
