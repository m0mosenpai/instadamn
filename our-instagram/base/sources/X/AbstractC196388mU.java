package X;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;

/* renamed from: X.8mU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196388mU {
    public static final ImmutableSet A00;

    static {
        EnumC196398mV[] values = EnumC196398mV.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (EnumC196398mV enumC196398mV : values) {
            arrayList.add(enumC196398mV.name());
        }
        ImmutableSet A03 = ImmutableSet.A03(AbstractC001800i.A0k(arrayList));
        C14360o3.A07(A03);
        A00 = A03;
    }
}
