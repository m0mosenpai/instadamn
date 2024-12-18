package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B1Q implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ boolean A03;

    public B1Q(Context context, Bitmap bitmap, UserSession userSession, boolean z) {
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = bitmap;
        this.A03 = z;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Bitmap bitmap = this.A01;
        boolean z = this.A03;
        File A00 = AbstractC917048o.A00();
        AHW.A02(bitmap, A00, z);
        return A00;
    }
}
