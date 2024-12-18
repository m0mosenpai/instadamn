package X;

import com.facebook.msys.mca.MailboxCallback;

/* loaded from: classes8.dex */
public final class LVE implements MailboxCallback {
    public static final LVE A00 = new LVE();

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (!AbstractC166987dD.A1a(obj)) {
            C0K8.A0C("SecurityAlertLocalDataSource", "Failed to write ParticipantDeviceChange data to msys db");
        }
    }
}
