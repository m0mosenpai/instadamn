package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class TI4 implements Serializable {
    public final Class A00;
    public final Class A01;
    public final Object A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            TI4 ti4 = (TI4) obj;
            if (!ti4.A02.equals(this.A02) || ti4.A01 != this.A01 || ti4.A00 != this.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A03;
    }

    public final String toString() {
        String name;
        Object obj = this.A02;
        Class cls = this.A01;
        String str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        if (cls == null) {
            name = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        } else {
            name = cls.getName();
        }
        Class cls2 = this.A00;
        if (cls2 != null) {
            str = cls2.getName();
        }
        return String.format("[ObjectId: key=%s, type=%s, scope=%s]", obj, name, str);
    }

    public TI4(Class cls, Class cls2, Object obj) {
        this.A01 = cls;
        this.A00 = cls2;
        this.A02 = obj;
        int A03 = AbstractC25226BEj.A03(cls.getName(), obj.hashCode());
        this.A03 = cls2 != null ? A03 ^ cls2.getName().hashCode() : A03;
    }
}
