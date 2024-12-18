package X;

import com.facebook.msys.mca.MailboxCallback;

/* loaded from: classes8.dex */
public final class LVF implements MailboxCallback {
    public static final LVF A00 = new LVF();

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (!AbstractC166987dD.A1a(obj)) {
            C0K8.A0C("SecurityAlertRepository", "Failed to write ParticipantDeviceChange data to msys db");
        }
    }
}
