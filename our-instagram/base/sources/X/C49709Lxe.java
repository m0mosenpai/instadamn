package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Lxe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49709Lxe implements InterfaceC42241xE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C46053Ka8 A02;

    public C49709Lxe(C46053Ka8 c46053Ka8, int i, long j) {
        this.A01 = j;
        this.A02 = c46053Ka8;
        this.A00 = i;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C125875mc c125875mc = (C125875mc) obj;
        C14360o3.A0B(c125875mc, 0);
        long j = this.A01;
        LVJ lvj = new LVJ(c125875mc, this.A02, this.A00, j);
        C125815mW c125815mW = c125875mc.A07;
        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(c125815mW, 0);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0C, lvj);
        AbstractC25231BEo.A1C(A0C, new LVG(c125815mW, A0I, 1, j), A0I);
    }
}
