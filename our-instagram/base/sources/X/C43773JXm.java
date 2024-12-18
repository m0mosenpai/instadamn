package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JXm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43773JXm {
    public static final long A05 = TimeUnit.SECONDS.toMillis(5);
    public int A00;
    public final MNS A01;
    public final C69433Ad A02;
    public final C43774JXn A03 = new C43774JXn(this);
    public final List A04 = new ArrayList();

    public static void A00(C43773JXm c43773JXm) {
        List list = c43773JXm.A04;
        list.get(c43773JXm.A00);
        if (list.size() > 1) {
            c43773JXm.A00 = (c43773JXm.A00 + 1) % list.size();
        }
    }

    public C43773JXm(MNS mns, C69433Ad c69433Ad) {
        this.A02 = c69433Ad;
        this.A01 = mns;
    }
}
