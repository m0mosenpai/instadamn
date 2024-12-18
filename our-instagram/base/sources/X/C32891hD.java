package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.UUID;

/* renamed from: X.1hD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C32891hD implements InterfaceC29451bM {
    public final InterfaceC11360iu A00;
    public final InterfaceC11380iw A01;
    public final String A02;

    @Override // X.InterfaceC29451bM
    public void EHt(C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC29451bM
    public void EHu(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC29451bM
    public final void EHv(C19260xA c19260xA, C1OW c1ow, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC29451bM
    public final void EHw(C1OW c1ow, boolean z) {
        InterfaceC11360iu interfaceC11360iu = this.A00;
        C19280xC A00 = C19280xC.A00(this.A01, this.A02);
        A00.A0C("dedupe_token", UUID.randomUUID().toString());
        A00.A0C("action", "send_intent");
        A00.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c1ow.A02());
        A00.A0C("mutation_token", c1ow.A05);
        interfaceC11360iu.EHW(A00);
    }

    @Override // X.InterfaceC29451bM
    public final void EHx(C19260xA c19260xA, C1OW c1ow, boolean z) {
        InterfaceC11360iu interfaceC11360iu = this.A00;
        C19280xC A00 = C19280xC.A00(this.A01, this.A02);
        A00.A0C("dedupe_token", UUID.randomUUID().toString());
        A00.A0C("action", "sent");
        A00.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c1ow.A02());
        A00.A0C("mutation_token", c1ow.A05);
        interfaceC11360iu.EHW(A00);
    }

    public C32891hD(InterfaceC11360iu interfaceC11360iu, InterfaceC11380iw interfaceC11380iw, String str) {
        this.A00 = interfaceC11360iu;
        this.A02 = str;
        this.A01 = interfaceC11380iw;
    }
}
