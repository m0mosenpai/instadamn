package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;

/* loaded from: classes9.dex */
public final class PSU implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ Matrix A01;
    public final /* synthetic */ NLG A02;

    public PSU(Bitmap bitmap, Matrix matrix, NLG nlg) {
        this.A02 = nlg;
        this.A00 = bitmap;
        this.A01 = matrix;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        NLG nlg = this.A02;
        Context requireContext = nlg.requireContext();
        UserSession A0A = nlg.A0A();
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            if (this.A01 != null) {
                float f = nlg.A01;
                ClipInfo clipInfo = nlg.A07;
                if (clipInfo == null) {
                    str = "clipInfo";
                } else {
                    int i = clipInfo.A09;
                    C47Z c47z = nlg.A08;
                    if (c47z == null) {
                        str = "pendingMedia";
                    } else {
                        C55186Odr.A02(requireContext, bitmap, A0A, new P1K(new C56209OxI(nlg, 1), new P1H(c47z)), null, f, i);
                        bitmap.recycle();
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
