package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.datatype.guava.ser.CacheSerializer;
import com.fasterxml.jackson.datatype.guava.ser.RangeSerializer;
import com.fasterxml.jackson.datatype.guava.ser.TableSerializer;
import com.google.common.collect.Range;

/* renamed from: X.4jE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C102394jE implements C46e {
    /* JADX WARN: Type inference failed for: r0v27, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    @Override // X.C46e
    public JsonSerializer AVc(AbstractC910944l abstractC910944l, C45R c45r, C45B c45b) {
        if (this instanceof C102384jD) {
            Class cls = abstractC910944l.A00;
            if (SPS.class.isAssignableFrom(cls)) {
                return new Object();
            }
            if (Range.class.isAssignableFrom(cls)) {
                return new RangeSerializer(C102384jD.A00(abstractC910944l, Range.class), null, C63105Sd9.A00);
            }
            if (InterfaceC73597YMx.class.isAssignableFrom(cls)) {
                return new TableSerializer(C102384jD.A00(abstractC910944l, InterfaceC73597YMx.class));
            }
            if (!TIC.class.isAssignableFrom(cls) && !C63202Sf5.class.isAssignableFrom(cls) && !SJX.class.isAssignableFrom(cls) && !C200148tJ.class.isAssignableFrom(cls) && !AbstractC50542Tz.class.isAssignableFrom(cls)) {
                if (AbstractC58576Pxu.class.isAssignableFrom(cls)) {
                    return new StdDelegatingSerializer(C102384jD.A00(abstractC910944l, Iterable.class), null, C64182T2o.A00);
                }
                if (InterfaceC200458to.class.isAssignableFrom(cls)) {
                    return new CacheSerializer();
                }
                return null;
            }
            return ToStringSerializer.A00;
        }
        return null;
    }
}
