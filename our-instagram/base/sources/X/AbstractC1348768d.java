package X;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;

/* renamed from: X.68d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1348768d extends AbstractC1348868e implements C68Y {
    public C68Y A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        Class cls;
        if (this instanceof C1348668c) {
            cls = C68g.class;
        } else if (this instanceof C68j) {
            cls = C1349368r.class;
        } else if (this instanceof C1349568u) {
            cls = C1349868x.class;
        } else if (this instanceof C68t) {
            cls = C1349668v.class;
        } else {
            cls = C68o.class;
        }
        this.A00 = AbstractC1348468a.A01(cls, byteBuffer, i, 0);
        float[] A05 = AbstractC1348468a.A05(byteBuffer, i, 2);
        if (A05 != null) {
            ((C68f) this).A00 = A05;
            Object[] A06 = AbstractC1348468a.A06(cls, byteBuffer, i, 1);
            if (A06 == null) {
                if (this.A00 != null) {
                    A06 = (Object[]) Array.newInstance((Class<?>) cls, 1);
                    A06[0] = this.A00;
                } else {
                    return;
                }
            }
            ((AbstractC1348868e) this).A00 = A06;
            AnonymousClass690[] anonymousClass690Arr = (AnonymousClass690[]) AbstractC1348468a.A06(C1350068z.class, byteBuffer, i, 3);
            if (anonymousClass690Arr != null) {
                this.A01 = anonymousClass690Arr;
            }
        }
    }
}
