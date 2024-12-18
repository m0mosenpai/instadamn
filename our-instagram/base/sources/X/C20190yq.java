package X;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* renamed from: X.0yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20190yq extends AbstractC001600g {
    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        Intent intent = (Intent) obj;
        C14360o3.A0B(intent, 1);
        return intent;
    }

    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ Object A02(Intent intent, int i) {
        return new ActivityResult(i, intent);
    }
}
