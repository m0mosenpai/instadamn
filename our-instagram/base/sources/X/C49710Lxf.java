package X;

import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.Lxf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49710Lxf implements InterfaceC42241xE {
    public final /* synthetic */ C132035xe A00;
    public final /* synthetic */ C132025xd A01;
    public final /* synthetic */ boolean A02;

    public C49710Lxf(C132035xe c132035xe, C132025xd c132025xd, boolean z) {
        this.A02 = z;
        this.A01 = c132025xd;
        this.A00 = c132035xe;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        AbstractC1351869s abstractC1351869s;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        if (mailboxNullable == null || ((abstractC1351869s = (AbstractC1351869s) mailboxNullable.value) != null && AbstractC43592JPx.A02(abstractC1351869s) == 0)) {
            if (!this.A02) {
                C132025xd c132025xd = this.A01;
                C44109JeZ.A00(AbstractC132055xg.A00(c132025xd.A01).A00().A0M(new C1342164h(C50323MKb.A00)).A0L(new C135626Bn(C50367MLu.A01(c132025xd, 29))), c132025xd.A00, this.A00, c132025xd, 12);
                return;
            } else {
                C132035xe c132035xe = this.A00;
                if (c132035xe == null) {
                    return;
                }
                c132035xe.A00();
                return;
            }
        }
        C133075zY c133075zY = (C133075zY) mailboxNullable.value;
        if (c133075zY != null) {
            AbstractC132055xg.A00(this.A01.A01).A03(c133075zY);
        }
        C132035xe c132035xe2 = this.A00;
        if (c132035xe2 == null) {
            return;
        }
        c132035xe2.A01();
    }
}
