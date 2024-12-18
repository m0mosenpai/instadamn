package X;

import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.VQx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68441VQx {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 0);
        Map map = (Map) c6fw.A00();
        if (A0F == null) {
            AbstractC25241Le.A02("bk.action.cds.PushCdsBottomSheet", "Error opening CDS Bottom Sheet with a null screen.");
            return null;
        }
        C6FG A09 = C6BQ.A09(c6fq);
        C62862tP A06 = C6BQ.A06(c6fq);
        String A07 = U5E.A07(A0F);
        String A062 = U5E.A06(A0F);
        C66273U6s c66273U6s = new C66273U6s(new SparseArray(), null, null, null, null, A07, null, null, C6BQ.A0H(map), new ArrayList(), null, null, null, -1, U5E.A00(A0F), -1L, -1L, false, false);
        IgBloksScreenConfig A01 = U5E.A01(A06, A09, c6fq, A0F);
        C1338462s A00 = VR1.A00(c6fq, A0F);
        if (A01.A07 == null) {
            A01.A07 = A00;
        }
        A01.A0R = A062;
        if (U5E.A0C(A0F)) {
            A01.A0A = U5E.A05(A0F);
        }
        FragmentActivity A04 = C6BQ.A04(c6fq);
        String A08 = U5E.A08(A0F);
        VBp vBp = new VBp(null, null, null, 32, false);
        WGI.A02(A04, c66273U6s, A01.A07, A01.A04(), vBp, A08);
        return null;
    }
}
