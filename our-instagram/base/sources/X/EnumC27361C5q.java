package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27361C5q {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27361C5q[] A01;
    public static final EnumC27361C5q A02;
    public static final EnumC27361C5q A03;

    static {
        EnumC27361C5q enumC27361C5q = new EnumC27361C5q(ServerW3CShippingAddressConstants.DEFAULT, 0);
        A02 = enumC27361C5q;
        EnumC27361C5q enumC27361C5q2 = new EnumC27361C5q("OnMedia", 1);
        A03 = enumC27361C5q2;
        EnumC27361C5q[] enumC27361C5qArr = {enumC27361C5q, enumC27361C5q2};
        A01 = enumC27361C5qArr;
        A00 = AbstractC12190kN.A00(enumC27361C5qArr);
    }

    public static EnumC27361C5q valueOf(String str) {
        return (EnumC27361C5q) Enum.valueOf(EnumC27361C5q.class, str);
    }

    public static EnumC27361C5q[] values() {
        return (EnumC27361C5q[]) A01.clone();
    }

    public EnumC27361C5q(String str, int i) {
    }
}
