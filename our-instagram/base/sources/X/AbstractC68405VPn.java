package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceEventType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.VPn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68405VPn {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) A02;
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC167007dF.A1E(A04, 0, map);
        HashMap A0H = C6BQ.A0H(map);
        C62862tP A06 = C6BQ.A06(c6fq);
        Integer A00 = VR2.A00(TraceEventType.Push);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(C6BQ.A0B(c6fq));
        igBloksScreenConfig.A07 = null;
        igBloksScreenConfig.A0l = false;
        igBloksScreenConfig.A0f = false;
        igBloksScreenConfig.A0h = false;
        igBloksScreenConfig.A0g = false;
        igBloksScreenConfig.A0c = A06.A00;
        igBloksScreenConfig.A0P = A00;
        igBloksScreenConfig.A0S = null;
        igBloksScreenConfig.A0R = null;
        C66277U6x A01 = C66277U6x.A01(A0e, A0H);
        A01.A00 = 719983200;
        A01.A04(A04, igBloksScreenConfig);
        return null;
    }
}
