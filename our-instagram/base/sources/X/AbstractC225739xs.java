package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.TransparentModalActivity;
import java.io.IOException;

/* renamed from: X.9xs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225739xs {
    public static final Object A00(C6FQ c6fq) {
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C22P c22p = C22P.A25;
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Bundle A0b = AbstractC166987dD.A0b();
        C88X c88x = new C88X(new C189128Zd(null, C88Z.A0F, null));
        try {
            A0b.putString("create_mode_attribution", ADL.A00(c88x));
            C82R.A01(A0b, c22p);
            C6XJ A02 = C6XJ.A02(A04, A0b, A0B, TransparentModalActivity.class, "attribution_quick_camera_fragment");
            A02.A07();
            A02.A0C(A04);
            return null;
        } catch (IOException e) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(AbstractC111324zv.A00(635));
            C88Z c88z = c88x.A04;
            if (c88z == null) {
                c88z = C88Z.A0G;
            }
            C0w9.A06(AbstractC111324zv.A00(1258), AbstractC166997dE.A0v(c88z, A1C), e);
            return null;
        }
    }
}
