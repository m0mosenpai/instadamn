package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class TUV implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ android.net.Uri A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;

    public TUV(Context context, android.net.Uri uri, UserSession userSession, String str, int i) {
        this.A01 = context;
        this.A03 = userSession;
        this.A00 = i;
        this.A02 = uri;
        this.A04 = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            Context context = this.A01;
            UserSession userSession = this.A03;
            int i = this.A00;
            Bitmap A00 = C55620On5.A00(context, this.A02, userSession, i);
            if (A00 != null) {
                int width = A00.getWidth();
                File A04 = AbstractC13530mf.A04(context);
                C14360o3.A07(A04);
                C1NC.A0M(A00, A04);
                A00.recycle();
                if (AbstractC13530mf.A03(A04.getPath()) < OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) {
                    C0w9.A03("profile_image_too_small", AnonymousClass001.A04(i, " : ", this.A04));
                }
                OY4.A01(userSession, this.A04, MSX.A0i(A04), width);
                return null;
            }
            throw AbstractC166987dD.A14("failed to load avatar bitmap");
        } catch (Exception e) {
            return e;
        }
    }
}
