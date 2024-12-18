package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3TD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TD extends C73833Sq {
    public final InterfaceC09390do A00;
    public final C3RG A01;

    public C3TD(final String str, final int i) {
        super(str, null, i);
        this.A01 = C4DE.A00;
        this.A00 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.4DF
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                int i2 = i;
                String str2 = str;
                C3TD c3td = this;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    serialDescriptorArr[i3] = AbstractC70142W6u.A00(AnonymousClass001.A0T(str2, c3td.A08[i3], '.'), new C71687Wyk(), C192668g8.A00, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            }
        });
    }

    @Override // X.C73833Sq
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof SerialDescriptor)) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (serialDescriptor.BKw() != C4DE.A00 || !C14360o3.A0K(this.A03, serialDescriptor.BtR()) || !C14360o3.A0K(AbstractC192728gE.A00(this), AbstractC192728gE.A00(serialDescriptor))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C73833Sq
    public final int hashCode() {
        int i;
        int hashCode = this.A03.hashCode();
        C71662WyE c71662WyE = new C71662WyE(this);
        int i2 = 1;
        while (c71662WyE.hasNext()) {
            int i3 = i2 * 31;
            String str = (String) c71662WyE.next();
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    @Override // X.C73833Sq
    public final String toString() {
        return AbstractC001800i.A0P(", ", AnonymousClass001.A0C(this.A03, '('), ")", new C71197Wpm(this), null);
    }
}
