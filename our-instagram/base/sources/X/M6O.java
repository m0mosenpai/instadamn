package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* loaded from: classes8.dex */
public final class M6O implements Runnable {
    public final /* synthetic */ L1V A00;
    public final /* synthetic */ C1580377n A01;
    public final /* synthetic */ DirectMessageIdentifier A02;
    public final /* synthetic */ Exception A03;

    public M6O(L1V l1v, C1580377n c1580377n, DirectMessageIdentifier directMessageIdentifier, Exception exc) {
        this.A01 = c1580377n;
        this.A02 = directMessageIdentifier;
        this.A00 = l1v;
        this.A03 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1580377n c1580377n = this.A01;
        DirectMessageIdentifier directMessageIdentifier = this.A02;
        c1580377n.FAT(new C45117Jxm(C05F.A0C), directMessageIdentifier);
        L1V l1v = this.A00;
        Exception exc = this.A03;
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown error.";
        }
        l1v.A01.A02(directMessageIdentifier);
        C7DM c7dm = l1v.A00.A05;
        long A0L = AbstractC166987dD.A0L(l1v.A02.A00);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c7dm.A00, "audio_clips_transcription_failure");
        if (A0f.isSampled()) {
            AbstractC43593JPy.A1F(A0f, A0L);
            A0f.AAP("error_message", message);
            A0f.Cht();
        }
        C129805tk c129805tk = c1580377n.A00;
        if (c129805tk != null) {
            int hashCode = directMessageIdentifier.hashCode();
            String message2 = exc.getMessage();
            if (message2 != null) {
                c129805tk.A00.markerAnnotate(331815788, hashCode, AbstractC58317Pt9.A00(68), message2);
            }
            c129805tk.A00.markerEnd(331815788, hashCode, (short) 3);
        }
    }
}
