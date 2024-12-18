package X;

import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy;

/* renamed from: X.MzZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52020MzZ extends MetaAiVoiceStateProxy {
    public final C0UO A00;
    public final C05A A01;

    @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
    public final void onUpdate(MetaAiVoiceState metaAiVoiceState) {
        C14360o3.A0B(metaAiVoiceState, 0);
        this.A01.Egh(metaAiVoiceState);
    }

    public C52020MzZ() {
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A01 = A0z;
        this.A00 = AbstractC208910l.A02(A0z);
    }
}
