package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.CBq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27495CBq {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A01;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            List A0O = c102884kP.A0O(35);
            C14360o3.A07(A0O);
            java.util.Set A0k = AbstractC001800i.A0k(A0O);
            String A0H = c102884kP.A0H();
            DH1 dh1 = new DH1(29, c6fq, c102884kP);
            DH1 dh12 = new DH1(30, c6fq, c102884kP);
            C30484DbT c30484DbT = new C30484DbT(10, c6fq, c102884kP);
            AbstractC69814Vw0.A01(context, A0H, AbstractC166987dD.A1I(), A0k, dh1, dh12, D9q.A00, new C65076Td9(14, c102884kP, c6fq), c30484DbT);
        }
        return null;
    }
}
