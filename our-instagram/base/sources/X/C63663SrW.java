package X;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SrW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63663SrW implements InterfaceC65307Thj {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C63663SrW(String str, AtomicBoolean atomicBoolean, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = atomicBoolean;
    }

    @Override // X.InterfaceC65307Thj
    public final void onResult(Object obj) {
        String str = this.A02;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.A01;
        Map map = AbstractC63385Sj0.A00;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            ArrayList A1F = AbstractC166987dD.A1F(AbstractC63385Sj0.A01);
            if (0 < A1F.size()) {
                A1F.get(0);
                throw AbstractC166987dD.A15("onIdleChanged");
            }
        }
    }
}
