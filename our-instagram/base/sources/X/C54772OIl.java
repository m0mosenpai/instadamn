package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.OIl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54772OIl {
    public static C54772OIl A03;
    public C56196Ox3 A01;
    public final List A02 = Collections.synchronizedList(AbstractC166987dD.A1E());
    public Integer A00 = C05F.A0Y;

    public final Integer A00() {
        return this.A00;
    }

    public C54772OIl() {
        C56196Ox3 c56196Ox3 = new C56196Ox3(this);
        this.A01 = c56196Ox3;
        C15670qN c15670qN = C18150uz.A0B;
        c15670qN.A03(c56196Ox3);
        this.A01.onConnectionChanged(c15670qN.A01().A03());
    }
}
