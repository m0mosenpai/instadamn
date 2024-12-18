package X;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* renamed from: X.0yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20180yp extends AbstractC001600g {
    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
        C14360o3.A0B(intentSenderRequest, 1);
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        C14360o3.A07(putExtra);
        return putExtra;
    }

    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ Object A02(Intent intent, int i) {
        return new ActivityResult(i, intent);
    }
}
