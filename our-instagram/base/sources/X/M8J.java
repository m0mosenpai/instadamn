package X;

import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;
import java.util.function.Consumer;

/* loaded from: classes8.dex */
public final class M8J implements Consumer {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C49593Lvm A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ C15370ps A03;

    public M8J(UserSession userSession, C49593Lvm c49593Lvm, InterfaceC16820sZ interfaceC16820sZ, C15370ps c15370ps) {
        this.A01 = c49593Lvm;
        this.A00 = userSession;
        this.A03 = c15370ps;
        this.A02 = interfaceC16820sZ;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        if (!this.A01.A0Q.get()) {
            C137266Jf c137266Jf = new C137266Jf(mailbox);
            C6AG A00 = C6AE.A00(C42221xC.A09(c137266Jf), this.A00, ((C1334460n) this.A03.A00).A04, null, "MsysMultiInstancesBackgroundUserSessionOperation");
            C41761wQ c41761wQ = new C41761wQ(null);
            c41761wQ.A02(A00.A00(), new C44109JeZ(14, c41761wQ, this.A02));
        }
    }
}
