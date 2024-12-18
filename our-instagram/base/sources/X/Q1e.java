package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

/* loaded from: classes10.dex */
public final class Q1e extends BroadcastReceiver {
    public C61654RrU A00;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        android.net.Uri uri;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -1035343889);
        Bundle extras = intent.getExtras();
        if (this.A00 != null && extras != null) {
            if (extras.containsKey("extra_error") && extras.getSerializable("extra_error") != null) {
                extras.getSerializable("extra_error");
            } else if (extras.containsKey("extra_uri") && extras.getParcelable("extra_uri") != null && (uri = (android.net.Uri) extras.getParcelable("extra_uri")) != null) {
                C63181Seg.A06.A00 = uri;
                Bitmap bitmap = SUT.A00;
                if (bitmap == null) {
                    Q5A q5a = SUT.A01;
                    if (q5a != null) {
                        q5a.setImageURI(uri);
                        SUT.A01.invalidate();
                    }
                } else {
                    SUT.A00(context, bitmap);
                }
            }
        }
        C0f9.A0E(522721513, A04, intent);
    }
}
