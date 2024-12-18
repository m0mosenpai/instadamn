package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Lly, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49010Lly implements C7Q6 {
    public final /* synthetic */ C49110Lnn A00;

    public C49010Lly(C49110Lnn c49110Lnn) {
        this.A00 = c49110Lnn;
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        KTI kti = (KTI) obj;
        C49110Lnn c49110Lnn = this.A00;
        C14360o3.A0A(kti);
        boolean BCt = kti.BCt();
        MessageIdentifier BSy = kti.BSy();
        InterfaceC165247aD interfaceC165247aD = c49110Lnn.A01;
        if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) interfaceC165247aD, BSy, BCt)) {
            ((InterfaceC165747b1) interfaceC165247aD).Crc(kti.A06, kti.BSy().A01);
            return true;
        }
        return true;
    }
}
