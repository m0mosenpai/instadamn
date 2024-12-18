package X;

import android.content.ComponentName;
import android.content.Context;
import com.facebook.analytics2.logger.GooglePlayUploadService;

/* renamed from: X.QCt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58858QCt extends AbstractC40481uH {
    public final ComponentName A00;
    public final Context A01;

    @Override // X.AbstractC40481uH
    public final long A01(int i) {
        throw C00O.createAndThrow();
    }

    public C58858QCt(Context context) {
        this.A01 = context;
        this.A00 = new ComponentName(context, (Class<?>) GooglePlayUploadService.class);
    }

    @Override // X.AbstractC40481uH
    public final void A02(C40401u8 c40401u8, String str, int i, long j, long j2) {
        throw C00O.createAndThrow();
    }
}
