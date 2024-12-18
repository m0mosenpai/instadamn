package X;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.enums.EnumEntries;

/* renamed from: X.08b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C020508b<T extends Enum<T>> extends AbstractC06990Yq<T> implements EnumEntries<T>, Serializable {
    public final Enum[] A00;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.length;
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        C14360o3.A0B(r3, 0);
        if (AbstractC009903n.A06(this.A00, r3.ordinal()) != r3) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        Enum[] enumArr = this.A00;
        C0eC.A02(i, enumArr.length);
        return enumArr[i];
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            Enum r3 = (Enum) obj;
            C14360o3.A0B(r3, 0);
            int ordinal = r3.ordinal();
            if (AbstractC009903n.A06(this.A00, ordinal) == r3) {
                return ordinal;
            }
            return -1;
        }
        return -1;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        C14360o3.A0B(obj, 0);
        return indexOf(obj);
    }

    public C020508b(Enum[] enumArr) {
        this.A00 = enumArr;
    }
}
