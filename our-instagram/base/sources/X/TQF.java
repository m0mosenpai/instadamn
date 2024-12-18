package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public final class TQF implements Runnable {
    public final /* synthetic */ AbstractC61578Rq2 A00;
    public final /* synthetic */ C62687SMb A01;
    public final /* synthetic */ C62515SEr A02;

    public TQF(AbstractC61578Rq2 abstractC61578Rq2, C62687SMb c62687SMb, C62515SEr c62515SEr) {
        this.A01 = c62687SMb;
        this.A02 = c62515SEr;
        this.A00 = abstractC61578Rq2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C62687SMb c62687SMb = this.A01;
        c62687SMb.A00();
        if (!c62687SMb.A01) {
            C62515SEr c62515SEr = this.A02;
            C131845xK.A00(c62515SEr.A00, AbstractC31179DnN.A0I(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT).A00(), c62515SEr.A01);
            this.A00.A00("client_flashcall_not_found_time_out", null);
        }
    }
}
