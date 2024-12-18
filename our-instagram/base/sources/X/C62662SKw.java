package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.SKw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62662SKw {
    public final Intent A00;
    public final Bundle A01;

    public final void A00(Context context, android.net.Uri uri) {
        Intent intent = this.A00;
        intent.setData(uri);
        context.startActivity(intent, this.A01);
    }

    public C62662SKw(Intent intent, Bundle bundle) {
        this.A00 = intent;
        this.A01 = bundle;
    }
}
