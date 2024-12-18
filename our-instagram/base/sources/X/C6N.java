package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6N {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6N[] A01;
    public static final C6N A02;
    public static final C6N A03;
    public static final C6N A04;

    static {
        C6N c6n = new C6N(ServerW3CShippingAddressConstants.DEFAULT, 0);
        A02 = c6n;
        C6N c6n2 = new C6N("Emphasized", 1);
        A04 = c6n2;
        C6N c6n3 = new C6N("Destructive", 2);
        A03 = c6n3;
        C6N[] c6nArr = {c6n, c6n2, c6n3};
        A01 = c6nArr;
        A00 = AbstractC12190kN.A00(c6nArr);
    }

    public static C6N valueOf(String str) {
        return (C6N) Enum.valueOf(C6N.class, str);
    }

    public static C6N[] values() {
        return (C6N[]) A01.clone();
    }

    public C6N(String str, int i) {
    }
}
