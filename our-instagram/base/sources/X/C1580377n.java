package X;

import com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$startTranscription$1;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.77n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1580377n implements InterfaceC165007Zp {
    public final C129805tk A00;
    public final InterfaceC09390do A01;
    public final C1580477o A02;
    public final InterfaceC08830cm A03;

    @Override // X.InterfaceC165007Zp
    public final boolean Cej() {
        if (this.A02 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC165007Zp
    public final void Eo4(L1V l1v, C38321qM c38321qM, DirectMessageIdentifier directMessageIdentifier, String str) {
        C129805tk c129805tk = this.A00;
        if (c129805tk != null) {
            int hashCode = directMessageIdentifier.hashCode();
            C006802i c006802i = c129805tk.A00;
            c006802i.markerStart(331815788, hashCode);
            c006802i.markerAnnotate(331815788, hashCode, "MESSAGE_ID", ((MessageIdentifier) directMessageIdentifier).A01);
        }
        ((InterfaceC163597Tw) this.A03.get()).FAi(new C45117Jxm(C05F.A01), directMessageIdentifier);
        L7E l7e = new L7E(l1v, this, directMessageIdentifier);
        C1580477o c1580477o = this.A02;
        if (c1580477o != null) {
            int hashCode2 = directMessageIdentifier.hashCode();
            if (!C1580477o.A06()) {
                l7e.A00(new IllegalStateException("Trying to start transcription before setup."));
                return;
            }
            C19L c19l = c1580477o.A05;
            AbstractC23641Du.A05(AnonymousClass191.A00, new VoiceMessageTranscriptionApi$startTranscription$1(c1580477o, l7e, c38321qM, str, null, hashCode2), c19l);
        }
    }

    @Override // X.InterfaceC165007Zp
    public final void FAT(C45117Jxm c45117Jxm, DirectMessageIdentifier directMessageIdentifier) {
        ((InterfaceC163597Tw) this.A03.get()).FAi(c45117Jxm, directMessageIdentifier);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (X.C1580477o.A06() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1580377n(com.instagram.common.session.UserSession r5, X.InterfaceC08830cm r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.A03 = r6
            X.5tk r3 = X.AbstractC125065lC.A00(r5)
            r4.A00 = r3
            boolean r0 = X.AbstractC229319v.A00()
            if (r0 != 0) goto L44
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325454705079374(0x810dcf0000344e, double:3.0357020541332214E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L44
            r0 = 22
            X.MHU r1 = new X.MHU
            r1.<init>(r0, r3, r5)
            java.lang.Class<X.77o> r0 = X.C1580477o.class
            java.lang.Object r1 = r5.A01(r0, r1)
            X.77o r1 = (X.C1580477o) r1
            boolean r0 = X.C1580477o.A06()
            if (r0 == 0) goto L44
        L33:
            r4.A02 = r1
            X.0dv r2 = X.EnumC09460dv.A02
            r1 = 2
            X.9E3 r0 = new X.9E3
            r0.<init>(r5, r1)
            X.0do r0 = X.AbstractC09440dt.A00(r2, r0)
            r4.A01 = r0
            return
        L44:
            r1 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1580377n.<init>(com.instagram.common.session.UserSession, X.0cm):void");
    }
}
