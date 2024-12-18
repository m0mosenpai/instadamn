package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import java.io.Serializable;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public final class RC1 extends RC7 implements Serializable {
    public final SXY A00;

    public RC1(RC7 rc7, SXY sxy) {
        super(rc7.A04, rc7);
        this.A00 = sxy;
    }

    @Override // X.RC7
    public final void A04(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Object invoke;
        Method method = this.A0E;
        if (method == null) {
            invoke = this.A0D.get(obj);
        } else {
            invoke = method.invoke(obj, null);
        }
        if (invoke != null) {
            JsonSerializer A00 = RC7.A00(abstractC913345m, this, invoke);
            Object obj2 = this.A09;
            if (obj2 != null && RC7.A01(A00, abstractC913345m, obj2, invoke)) {
                return;
            }
            if (invoke == obj && A07(anonymousClass182, A00, abstractC913345m)) {
                return;
            }
            if (!A00.A08()) {
                anonymousClass182.A0l(this.A04);
            }
            AbstractC58322PtE.A1K(anonymousClass182, A00, abstractC913345m, this.A03, invoke);
        }
    }

    @Override // X.RC7
    public final void A06(JsonSerializer jsonSerializer) {
        if (jsonSerializer != null) {
            SXY sxy = this.A00;
            if (jsonSerializer.A08() && (jsonSerializer instanceof UnwrappingBeanSerializer)) {
                sxy = new RDC(sxy, ((UnwrappingBeanSerializer) jsonSerializer).A00);
            }
            jsonSerializer = jsonSerializer.A07(sxy);
        }
        super.A06(jsonSerializer);
    }

    public RC1(AnonymousClass164 anonymousClass164, RC1 rc1, SXY sxy) {
        super(anonymousClass164, rc1);
        this.A00 = sxy;
    }
}
