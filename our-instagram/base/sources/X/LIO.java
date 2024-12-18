package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.CancellationSignal;
import android.util.Size;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class LIO {
    public static final LIO A00 = new Object();

    public final void A01(Context context, Size size, UserSession userSession, String str, InterfaceC16660sJ interfaceC16660sJ, C19L c19l) {
        if (C18U.A06(AbstractC25225BEi.A0j(str, 3), userSession, 36328714585259756L)) {
            AbstractC166987dD.A1Z(new MVR(context, size, interfaceC16660sJ, str, (InterfaceC23621Ds) null, 10), c19l);
            return;
        }
        Bitmap bitmap = null;
        try {
            bitmap = context.getContentResolver().loadThumbnail(AbstractC08820cl.A03(str), size, null);
        } catch (IOException unused) {
        }
        interfaceC16660sJ.invoke(bitmap);
    }

    public static final /* synthetic */ Object A00(ContentResolver contentResolver, android.net.Uri uri, Size size, InterfaceC23621Ds interfaceC23621Ds) {
        C24891Jo A0s = JQ0.A0s(interfaceC23621Ds);
        CancellationSignal cancellationSignal = new CancellationSignal();
        A0s.CPA(new C50354MLg(cancellationSignal, 8));
        try {
            Bitmap loadThumbnail = contentResolver.loadThumbnail(uri, size, cancellationSignal);
            C14360o3.A07(loadThumbnail);
            A0s.EKh(null, loadThumbnail);
        } catch (IOException unused) {
            A0s.EKh(null, null);
        }
        return A0s.A0E();
    }
}
