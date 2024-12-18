package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.LoggingOption;
import java.util.Random;

/* renamed from: X.5pk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127605pk implements MailboxCallback {
    public final /* synthetic */ LoggingOption[] A00;

    public C127605pk(LoggingOption[] loggingOptionArr) {
        this.A00 = loggingOptionArr;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final void onCompletion(Object obj) {
        LoggingOption loggingOption = this.A00[0];
        Random random = AbstractC1346866s.A02;
        AbstractC46567Kj6.A00(loggingOption);
    }
}
