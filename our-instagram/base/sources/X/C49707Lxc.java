package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Lxc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49707Lxc implements InterfaceC42241xE {
    public final int A00;
    public final long A01;
    public final Object A02;

    public C49707Lxc(C46053Ka8 c46053Ka8, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = c46053Ka8;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        int i;
        long j;
        C125815mW c125815mW;
        InterfaceExecutorC135866Co A0C;
        MailboxFutureImpl A0I;
        MailboxCallback lup;
        C125875mc c125875mc = (C125875mc) obj;
        switch (this.A00) {
            case 0:
                i = 0;
                C14360o3.A0B(c125875mc, 0);
                j = this.A01;
                JRS A00 = JRS.A00(this.A02, 37);
                c125815mW = c125875mc.A07;
                A0C = AbstractC43592JPx.A0C(c125815mW, 0);
                A0I = AbstractC43593JPy.A0I(A0C, A00);
                lup = new LVG(c125815mW, A0I, i, j);
                break;
            case 1:
                C14360o3.A0B(c125875mc, 0);
                j = this.A01;
                JRS A002 = JRS.A00(this.A02, 38);
                c125815mW = c125875mc.A07;
                A0C = AbstractC43592JPx.A0C(c125815mW, 0);
                A0I = AbstractC43593JPy.A0I(A0C, A002);
                i = 3;
                lup = new LVG(c125815mW, A0I, i, j);
                break;
            case 2:
                C14360o3.A0B(c125875mc, 0);
                long j2 = this.A01;
                byte[] bArr = C46053Ka8.A03;
                JRS A003 = JRS.A00(this.A02, 39);
                C125815mW c125815mW2 = c125875mc.A07;
                A0C = AbstractC43592JPx.A0C(c125815mW2, 0);
                A0I = AbstractC43593JPy.A0I(A0C, A003);
                lup = new LUP(0, j2, c125815mW2, A0I, bArr);
                break;
            default:
                C14360o3.A0B(c125875mc, 0);
                j = this.A01;
                JRS A004 = JRS.A00(this.A02, 40);
                c125815mW = c125875mc.A07;
                A0C = AbstractC43592JPx.A0C(c125815mW, 0);
                A0I = AbstractC43593JPy.A0I(A0C, A004);
                i = 2;
                lup = new LVG(c125815mW, A0I, i, j);
                break;
        }
        AbstractC25231BEo.A1C(A0C, lup, A0I);
    }
}
