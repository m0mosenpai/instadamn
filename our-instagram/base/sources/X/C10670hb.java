package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* renamed from: X.0hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10670hb extends AbstractC001600g {
    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        Bundle bundleExtra;
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = intentSenderRequest.A02;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                intentSenderRequest = new IntentSenderRequest(null, intentSenderRequest.A03, intentSenderRequest.A00, intentSenderRequest.A01);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        AbstractC10360h2.A0H(2);
        return intent;
    }

    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ Object A02(Intent intent, int i) {
        return new ActivityResult(i, intent);
    }
}
