package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.creation.MediaCaptureConfig;
import java.io.IOException;

/* renamed from: X.LsA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49376LsA implements MSN {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC686136y A03;

    @Override // X.C37U
    public final InterfaceC85133r1 BS2() {
        return this.A03.BS2();
    }

    @Override // X.MSN
    public final void Cvl(InterfaceC31134DmH interfaceC31134DmH, String str) {
        try {
            FragmentActivity requireActivity = this.A00.requireActivity();
            C69963Cf A00 = AbstractC69933Cc.A00(requireActivity, this.A01, new C48635LfC(requireActivity, 3));
            EnumC69983Ch enumC69983Ch = EnumC69983Ch.A02;
            C43846JaA c43846JaA = new C43846JaA(enumC69983Ch);
            c43846JaA.A0A = false;
            c43846JaA.A0F = true;
            A00.Emz(EnumC33447EqK.A0A, new MediaCaptureConfig(c43846JaA), enumC69983Ch);
        } catch (IOException unused) {
            C0w9.A01.EmN("FeedAddYoursMediaCTABarDelegateImpl", "Failed to deserialize MediaPromptData from onAddYoursCreationLabelClicked");
        }
    }

    @Override // X.MSN
    public final void Cvm(InterfaceC31134DmH interfaceC31134DmH) {
        C1GL c1gl = (C1GL) this.A00;
        AbstractC192798gL A05 = C192108fB.A05(this.A01, "com.instagram.feed.prompt.open_participation_screen", AbstractC167017dG.A0r("prompt_id", interfaceC31134DmH.Big()));
        A05.A00(new C45530KDv(this, 3));
        c1gl.schedule(A05);
    }

    public C49376LsA(Fragment fragment, UserSession userSession, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = interfaceC60442pS;
        this.A03 = interfaceC686136y;
    }
}
