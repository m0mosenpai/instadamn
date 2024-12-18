package X;

import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.LxZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49704LxZ implements InterfaceC42241xE {
    public final /* synthetic */ C41761wQ A00;
    public final /* synthetic */ C132065xh A01;

    public C49704LxZ(C41761wQ c41761wQ, C132065xh c132065xh) {
        this.A00 = c41761wQ;
        this.A01 = c132065xh;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        C14360o3.A0B(mailboxNullable, 0);
        C133075zY c133075zY = (C133075zY) mailboxNullable.value;
        if (c133075zY != null) {
            this.A01.A03(c133075zY);
        }
        this.A00.A01();
    }
}
