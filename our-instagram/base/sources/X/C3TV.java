package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3TV, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3TV extends C3SI {
    public final SerialDescriptor A00;

    public Object A08() {
        return new float[0];
    }

    public void A09(Object obj, C4D8 c4d8, int i) {
        float[] fArr = (float[]) obj;
        C14360o3.A0B(c4d8, 0);
        C14360o3.A0B(fArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            c4d8.AS8(this.A00, fArr[i2], i2);
        }
    }

    public C3TV(C3R9 c3r9) {
        super(c3r9);
        final SerialDescriptor descriptor = c3r9.getDescriptor();
        this.A00 = new C3SK(descriptor) { // from class: X.3TY
            public final String A00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(descriptor);
                C14360o3.A0B(descriptor, 1);
                this.A00 = AnonymousClass001.A0R(descriptor.BtR(), "Array");
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public final String BtR() {
                return this.A00;
            }
        };
    }
}
