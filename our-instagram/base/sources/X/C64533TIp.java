package X;

import com.facebook.react.LazyReactPackage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.TIp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64533TIp implements Iterable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C64533TIp(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            return new C64765TSz((LazyReactPackage) obj, (List) this.A02, (Map) this.A03);
        }
        return new C64763TSx((AbstractC64130Szs) obj, (R3M) this.A03, (Iterator) this.A02);
    }
}
