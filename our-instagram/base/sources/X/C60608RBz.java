package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.Serializable;

/* renamed from: X.RBz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60608RBz extends RC7 implements Serializable {
    public final RC7 A00;
    public final Class A01;

    public C60608RBz(RC7 rc7, Class cls) {
        super(rc7.A04, rc7);
        this.A00 = rc7;
        this.A01 = cls;
    }

    @Override // X.RC7
    public final void A04(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Class<?> cls = abstractC913345m.A07;
        if (cls != null && !this.A01.isAssignableFrom(cls)) {
            C16N c16n = AnonymousClass182.A01;
        } else {
            this.A00.A04(anonymousClass182, abstractC913345m, obj);
        }
    }

    @Override // X.RC7
    public final void A06(JsonSerializer jsonSerializer) {
        this.A00.A06(jsonSerializer);
    }
}
