package X;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes9.dex */
public final class OT1 {
    public final AudioManager A00;

    public /* synthetic */ OT1(Context context) {
        AudioManager A0E = AbstractC50522MSa.A0E(context.getApplicationContext());
        C14360o3.A0B(A0E, 2);
        this.A00 = A0E;
    }

    public static final int A00() {
        return (AbstractC41221vX.A00().A01 * 100) / AbstractC41221vX.A00().A00;
    }
}
