package X;

import android.app.Activity;
import android.content.Intent;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* renamed from: X.Ozm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56325Ozm implements InterfaceC69913Ca {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C22P A01;
    public final /* synthetic */ AnonymousClass840 A02;
    public final /* synthetic */ PendingRecipient A03;
    public final /* synthetic */ Boolean A04;

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void CKE(Intent intent) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void En7(File file, int i) {
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        C14360o3.A0B(intent, 0);
        intent.putExtra("isFromQcc", true);
        intent.putExtra("captureType", EnumC69983Ch.A02);
        intent.putExtra(AbstractC43591JPw.A00(89), AbstractC43593JPy.A0R(this.A02));
        intent.putExtra("isAlbumEdit", true);
        intent.putExtra("cameraEntryPoint", this.A01);
        intent.putExtra("targetGroupProfile", this.A03);
        intent.putExtra("is_quiet_posting_flow", this.A04);
        C12260kU.A08(this.A00, intent, i);
    }

    public C56325Ozm(Activity activity, C22P c22p, AnonymousClass840 anonymousClass840, PendingRecipient pendingRecipient, Boolean bool) {
        this.A02 = anonymousClass840;
        this.A01 = c22p;
        this.A03 = pendingRecipient;
        this.A04 = bool;
        this.A00 = activity;
    }
}
