package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27391C6u {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27391C6u[] A01;
    public static final EnumC27391C6u A02;
    public static final EnumC27391C6u A03;
    public static final EnumC27391C6u A04;
    public static final EnumC27391C6u A05;
    public static final EnumC27391C6u A06;

    static {
        EnumC27391C6u enumC27391C6u = new EnumC27391C6u("Play", 0);
        A05 = enumC27391C6u;
        EnumC27391C6u enumC27391C6u2 = new EnumC27391C6u("Loading", 1);
        A03 = enumC27391C6u2;
        EnumC27391C6u enumC27391C6u3 = new EnumC27391C6u("Paused", 2);
        A04 = enumC27391C6u3;
        EnumC27391C6u enumC27391C6u4 = new EnumC27391C6u("Scrubbing", 3);
        A06 = enumC27391C6u4;
        EnumC27391C6u enumC27391C6u5 = new EnumC27391C6u(ServerW3CShippingAddressConstants.DEFAULT, 4);
        A02 = enumC27391C6u5;
        EnumC27391C6u[] enumC27391C6uArr = {enumC27391C6u, enumC27391C6u2, enumC27391C6u3, enumC27391C6u4, enumC27391C6u5};
        A01 = enumC27391C6uArr;
        A00 = AbstractC12190kN.A00(enumC27391C6uArr);
    }

    public static EnumC27391C6u valueOf(String str) {
        return (EnumC27391C6u) Enum.valueOf(EnumC27391C6u.class, str);
    }

    public static EnumC27391C6u[] values() {
        return (EnumC27391C6u[]) A01.clone();
    }

    public EnumC27391C6u(String str, int i) {
    }
}
