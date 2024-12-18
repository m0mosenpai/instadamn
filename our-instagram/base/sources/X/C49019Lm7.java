package X;

import android.view.MotionEvent;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Lm7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49019Lm7 implements C7Q6 {
    public final /* synthetic */ InterfaceC165017Zq A00;
    public final /* synthetic */ C49106Lnj A01;

    public C49019Lm7(InterfaceC165017Zq interfaceC165017Zq, C49106Lnj c49106Lnj) {
        this.A01 = c49106Lnj;
        this.A00 = interfaceC165017Zq;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.7Zq, X.7YI] */
    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        KTF ktf = (KTF) obj;
        MessageIdentifier BSy = ktf.BSy();
        MessagingUser messagingUser = ktf.A02;
        boolean BCt = ktf.BCt();
        ?? r1 = this.A00;
        if (BCt) {
            ((InterfaceC164967Zl) r1).Eku(BSy);
            return true;
        }
        r1.Cre(messagingUser, "direct_thread_profile_message");
        return true;
    }
}
