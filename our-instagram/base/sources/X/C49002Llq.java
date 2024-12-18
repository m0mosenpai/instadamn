package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Llq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49002Llq implements C7Q6 {
    public final /* synthetic */ C49108Lnl A00;

    public C49002Llq(C49108Lnl c49108Lnl) {
        this.A00 = c49108Lnl;
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        KTC ktc = (KTC) obj;
        C49153LoW c49153LoW = (C49153LoW) obj2;
        C49108Lnl c49108Lnl = this.A00;
        String str = ktc.BSy().A01;
        String str2 = ktc.A04;
        boolean BCt = ktc.BCt();
        C14360o3.A0A(c49153LoW);
        MessageIdentifier messageIdentifier = new MessageIdentifier(str, null);
        InterfaceC165247aD interfaceC165247aD = c49108Lnl.A01;
        if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) interfaceC165247aD, messageIdentifier, BCt)) {
            ((InterfaceC165397aS) interfaceC165247aD).CqU(AbstractC13880nE.A0G(c49153LoW.A03), null, str2);
            return true;
        }
        return true;
    }
}
