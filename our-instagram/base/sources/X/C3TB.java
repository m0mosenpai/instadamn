package X;

import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.3TB, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3TB implements C3R9 {
    public abstract InterfaceC16510rw A00();

    public C3RB A01(String str, C3T8 c3t8) {
        InterfaceC16660sJ interfaceC16660sJ;
        C3RB c3rb;
        C73803Sk BtX = c3t8.BtX();
        InterfaceC16510rw A00 = A00();
        C14360o3.A0B(A00, 0);
        Map map = (Map) BtX.A03.get(A00);
        if (map != null && (c3rb = (C3RB) map.get(str)) != null) {
            return c3rb;
        }
        Object obj = BtX.A01.get(A00);
        if (!C15500q5.A0B(obj, 1) || (interfaceC16660sJ = (InterfaceC16660sJ) obj) == null) {
            return null;
        }
        return (C3RB) interfaceC16660sJ.invoke(str);
    }

    public C3RA A02(Object obj, Encoder encoder) {
        InterfaceC16660sJ interfaceC16660sJ;
        C3RA c3ra;
        C73803Sk c73803Sk = ((C4DB) encoder).A07;
        InterfaceC16510rw A00 = A00();
        C14360o3.A0B(A00, 0);
        if (AbstractC13230m9.A02(((C0YZ) A00).A00, obj)) {
            Map map = (Map) c73803Sk.A04.get(A00);
            if (map != null && (c3ra = (C3RA) map.get(new C0YZ(obj.getClass()))) != null) {
                return c3ra;
            }
            Object obj2 = c73803Sk.A02.get(A00);
            if (C15500q5.A0B(obj2, 1) && (interfaceC16660sJ = (InterfaceC16660sJ) obj2) != null) {
                return (C3RA) interfaceC16660sJ.invoke(obj);
            }
        }
        return null;
    }

    @Override // X.C3RB
    public final Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor descriptor = getDescriptor();
        C3T8 ADQ = decoder.ADQ(descriptor);
        String str = null;
        Object obj = null;
        while (true) {
            int ANz = ADQ.ANz(getDescriptor());
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (str == null) {
                            str = "unknown class";
                        }
                        throw new IllegalArgumentException(AnonymousClass001.A07(ANz, "Invalid index in polymorphic deserialization of ", str, "\n Expected 0, 1 or DECODE_DONE(-1), but found "));
                    }
                    if (str != null) {
                        obj = ADQ.AOF(null, AbstractC69996VzG.A00(str, ADQ, this), getDescriptor(), 1);
                    } else {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                } else {
                    str = ADQ.AOK(getDescriptor(), ANz);
                }
            } else {
                if (obj != null) {
                    ADQ.ASc(descriptor);
                    return obj;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Polymorphic value has not been read for class ", str));
            }
        }
    }

    @Override // X.C3RA
    public final void serialize(Encoder encoder, Object obj) {
        C14360o3.A0B(encoder, 0);
        C14360o3.A0B(obj, 1);
        C3RA A01 = AbstractC69996VzG.A01(obj, encoder, this);
        SerialDescriptor descriptor = getDescriptor();
        C4D8 ADR = encoder.ADR(descriptor);
        ADR.ASL(A01.getDescriptor().BtR(), getDescriptor(), 0);
        ADR.ASH(obj, A01, getDescriptor(), 1);
        ADR.ASc(descriptor);
    }
}
