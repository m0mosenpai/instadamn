package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33400EpX {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33400EpX[] A02;
    public static final EnumC33400EpX A03;
    public static final EnumC33400EpX A04;
    public static final EnumC33400EpX A05;
    public static final EnumC33400EpX A06;
    public static final EnumC33400EpX A07;
    public static final EnumC33400EpX A08;
    public static final EnumC33400EpX A09;
    public final int A00;

    static {
        EnumC33400EpX enumC33400EpX = new EnumC33400EpX("SMS", 0, 1);
        A05 = enumC33400EpX;
        EnumC33400EpX enumC33400EpX2 = new EnumC33400EpX("BACKUP_CODE", 1, 2);
        A04 = enumC33400EpX2;
        EnumC33400EpX enumC33400EpX3 = new EnumC33400EpX("AUTHENTICATOR_APP", 2, 3);
        A03 = enumC33400EpX3;
        EnumC33400EpX enumC33400EpX4 = new EnumC33400EpX("TRUSTED_NOTIFICATION", 3, 4);
        A07 = enumC33400EpX4;
        EnumC33400EpX enumC33400EpX5 = new EnumC33400EpX("TRUSTED_DEVICE_NONCE", 4, 5);
        A06 = enumC33400EpX5;
        EnumC33400EpX enumC33400EpX6 = new EnumC33400EpX("WHATSAPP", 5, 6);
        A09 = enumC33400EpX6;
        EnumC33400EpX enumC33400EpX7 = new EnumC33400EpX("UNKNOWN", 6, 0);
        A08 = enumC33400EpX7;
        EnumC33400EpX[] enumC33400EpXArr = {enumC33400EpX, enumC33400EpX2, enumC33400EpX3, enumC33400EpX4, enumC33400EpX5, enumC33400EpX6, enumC33400EpX7};
        A02 = enumC33400EpXArr;
        A01 = AbstractC12190kN.A00(enumC33400EpXArr);
    }

    public static EnumC33400EpX valueOf(String str) {
        return (EnumC33400EpX) Enum.valueOf(EnumC33400EpX.class, str);
    }

    public static EnumC33400EpX[] values() {
        return (EnumC33400EpX[]) A02.clone();
    }

    public EnumC33400EpX(String str, int i, int i2) {
        this.A00 = i2;
    }
}
