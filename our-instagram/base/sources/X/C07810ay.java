package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07810ay extends C0OK {
    @Override // X.C0OK
    public final Intent A0B(BroadcastReceiver broadcastReceiver, Context context, Intent intent, String str) {
        return intent;
    }

    @Override // X.C0OK
    public final boolean A0G() {
        return false;
    }

    @Override // X.C0OK
    public final Intent A0C(Context context, Intent intent, String str) {
        this.A01.EHA("AnyIntentScope", AnonymousClass001.A0R("Any_UNSAFE scope used for launching activity: ", C0OK.A01(intent)), null);
        return intent;
    }

    @Override // X.C0OK
    public final Intent A0D(Context context, Intent intent, String str) {
        this.A01.EHA("AnyIntentScope", AnonymousClass001.A0R("Any_UNSAFE scope used for launching service: ", C0OK.A01(intent)), null);
        return intent;
    }

    @Override // X.C0OK
    public final Integer A0E() {
        return C05F.A15;
    }

    @Override // X.C0OK
    public final List A0F(Context context, Intent intent, String str) {
        this.A01.EHA("AnyIntentScope", AnonymousClass001.A0R("Any_UNSAFE scope used for sending a broadcast: ", C0OK.A01(intent)), null);
        return Collections.singletonList(intent);
    }

    @Override // X.C0OK
    public final boolean A0H(Context context, C08110bX c08110bX) {
        throw new UnsupportedOperationException();
    }
}
