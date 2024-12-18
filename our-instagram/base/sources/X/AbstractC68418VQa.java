package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* renamed from: X.VQa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68418VQa {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Object A01 = c6fw.A01();
        if (A01 instanceof String) {
            str = (String) A01;
        } else {
            str = null;
        }
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        HashMap hashMap = new HashMap();
        hashMap.put("timezone_offset", String.valueOf(C23831Eq.A00()));
        C66277U6x A012 = C66277U6x.A01(str, hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(A0B);
        igBloksScreenConfig.A0U = A04.getResources().getString(2131962828);
        igBloksScreenConfig.A0l = true;
        igBloksScreenConfig.A0P = C05F.A01;
        A012.A04(A04, igBloksScreenConfig);
        return null;
    }
}
