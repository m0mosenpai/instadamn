package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.Lm1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49013Lm1 implements C7Q6 {
    public final /* synthetic */ C49118Lnv A00;

    public C49013Lm1(C49118Lnv c49118Lnv) {
        this.A00 = c49118Lnv;
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        C7SY c7sy = (C7SY) obj;
        C49118Lnv c49118Lnv = this.A00;
        C14360o3.A0A(c7sy);
        boolean BCt = c7sy.BCt();
        DirectMessageIdentifier directMessageIdentifier = c7sy.A01;
        InterfaceC165247aD interfaceC165247aD = c49118Lnv.A02;
        if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) interfaceC165247aD, directMessageIdentifier, BCt) && c7sy.Ar9() == C2EY.A0O) {
            ((InterfaceC165517ae) interfaceC165247aD).EkP(C7P3.A0S, AbstractC43592JPx.A0w(c7sy.A00), c7sy.CVC());
            return true;
        }
        return true;
    }
}
