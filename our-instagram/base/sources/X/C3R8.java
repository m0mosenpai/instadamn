package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.3R8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3R8 implements C3R9 {
    public final Enum[] A00;
    public final InterfaceC09390do A01;

    public C3R8(final String str, Enum[] enumArr) {
        C14360o3.A0B(enumArr, 2);
        this.A00 = enumArr;
        this.A01 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.3RC
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C3R8 c3r8 = this;
                String str2 = str;
                C14360o3.A0B(c3r8, 0);
                Enum[] enumArr2 = c3r8.A00;
                C3TD c3td = new C3TD(str2, enumArr2.length);
                for (Enum r0 : enumArr2) {
                    c3td.A01(r0.name(), false);
                }
                return c3td;
            }
        });
    }

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        int AO0 = decoder.AO0(getDescriptor());
        if (AO0 >= 0) {
            Enum[] enumArr = this.A00;
            if (AO0 < enumArr.length) {
                return enumArr[AO0];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AO0);
        sb.append(" is not among valid ");
        sb.append(getDescriptor().BtR());
        sb.append(" enum values, values size is ");
        sb.append(this.A00.length);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14360o3.A0B(encoder, 0);
        C14360o3.A0B(obj, 1);
        Enum[] enumArr = this.A00;
        int A02 = AbstractC009903n.A02(enumArr, obj);
        if (A02 != -1) {
            SerialDescriptor descriptor = getDescriptor();
            C14360o3.A0B(descriptor, 0);
            ((C4DC) encoder).ASK(descriptor.B0v(A02));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().BtR());
        sb.append(AbstractC58317Pt9.A00(435));
        String arrays = Arrays.toString(enumArr);
        C14360o3.A07(arrays);
        sb.append(arrays);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.A01.getValue();
    }

    public final String toString() {
        return AnonymousClass001.A0S("kotlinx.serialization.internal.EnumSerializer<", getDescriptor().BtR(), '>');
    }
}
