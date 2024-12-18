package X;

import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState;

/* renamed from: X.OLn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54828OLn {
    public final InterfaceC57796PkO A00;
    public final MetaAiVoiceState A01;
    public final boolean A02;
    public final boolean A03;

    public C54828OLn(InterfaceC57796PkO interfaceC57796PkO, MetaAiVoiceState metaAiVoiceState, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC57796PkO, 1);
        this.A00 = interfaceC57796PkO;
        this.A01 = metaAiVoiceState;
        this.A03 = z;
        this.A02 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54828OLn) {
                C54828OLn c54828OLn = (C54828OLn) obj;
                if (!C14360o3.A0K(this.A00, c54828OLn.A00) || !C14360o3.A0K(this.A01, c54828OLn.A01) || this.A03 != c54828OLn.A03 || this.A02 != c54828OLn.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A03, (AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01)) * 31));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("StatusUpdate(connectionState=");
        A1C.append(this.A00);
        A1C.append(", metaAiVoiceState=");
        A1C.append(this.A01);
        A1C.append(", micState=");
        A1C.append(this.A03);
        A1C.append(", botAudioState=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }
}
