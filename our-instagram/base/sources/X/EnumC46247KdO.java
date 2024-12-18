package X;

import com.facebook.common.dextricks.DexOptimization;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KdO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46247KdO {
    public static final Map A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC46247KdO[] A04;
    public static final EnumC46247KdO A05;
    public static final EnumC46247KdO A06;
    public static final EnumC46247KdO A07;
    public static final EnumC46247KdO A08;
    public static final EnumC46247KdO A09;
    public static final EnumC46247KdO A0A;
    public static final EnumC46247KdO A0B;
    public static final EnumC46247KdO A0C;
    public static final EnumC46247KdO A0D;
    public static final EnumC46247KdO A0E;
    public static final EnumC46247KdO A0F;
    public static final EnumC46247KdO A0G;
    public final int A00;
    public final String A01;

    static {
        EnumC46247KdO enumC46247KdO = new EnumC46247KdO(0, 0, "SEND_FAILURE_DOMAIN_UNKNOWN", "unknown");
        A0G = enumC46247KdO;
        EnumC46247KdO enumC46247KdO2 = new EnumC46247KdO(1, 1, "SEND_FAILURE_DOMAIN_CLIENT", DexOptimization.OPT_KEY_CLIENT);
        A0C = enumC46247KdO2;
        EnumC46247KdO enumC46247KdO3 = new EnumC46247KdO(2, 2, "SEND_FAILURE_DOMAIN_HTTP", "http");
        A0D = enumC46247KdO3;
        EnumC46247KdO enumC46247KdO4 = new EnumC46247KdO(3, 3, "SEND_FAILURE_DOMAIN_API", "api");
        A0B = enumC46247KdO4;
        EnumC46247KdO enumC46247KdO5 = new EnumC46247KdO(4, 4, "SEND_FAILURE_DOMAIN_SNAPSHOT", "snapshot");
        A0F = enumC46247KdO5;
        EnumC46247KdO enumC46247KdO6 = new EnumC46247KdO(5, 5, "SEND_FAILURE_DOMAIN_MEM", "mem");
        A0E = enumC46247KdO6;
        EnumC46247KdO enumC46247KdO7 = new EnumC46247KdO(6, 5, "INSTAMADILLO_SEND_FAILURE_DOMAIN_SEND", "IGDirectInstamadilloSendErrorDomain");
        A0A = enumC46247KdO7;
        EnumC46247KdO enumC46247KdO8 = new EnumC46247KdO(7, 5, "INSTAMADILLO_SEND_FAILURE_DOMAIN_ENCRYPTION", "IGDirectInstamadilloEncryptionErrorDomain");
        A06 = enumC46247KdO8;
        EnumC46247KdO enumC46247KdO9 = new EnumC46247KdO(8, 1, "INSTAMADILLO_SEND_FAILURE_DOMAIN_MEDIA_MESSAGE", "IGDirectInstamadilloMediaMessageSendErrorDomain");
        A07 = enumC46247KdO9;
        EnumC46247KdO enumC46247KdO10 = new EnumC46247KdO(9, 1, "INSTAMADILLO_SEND_FAILURE_DOMAIN_MISSING_THREAD_ID", "IGDirectInstamadilloMissingThreadIdErrorDomain");
        A09 = enumC46247KdO10;
        EnumC46247KdO enumC46247KdO11 = new EnumC46247KdO(10, 1, "INSTAMADILLO_SEND_FAILURE_DOMAIN_DISAPPEARING_MESSAGE", "IGDirectInstamadilloDisappearingMessageErrorDomain");
        A05 = enumC46247KdO11;
        EnumC46247KdO enumC46247KdO12 = new EnumC46247KdO(11, 1, "INSTAMADILLO_SEND_FAILURE_DOMAIN_MESSAGE_METADATA_PREFETCH", "IGDirectInstamadilloMessageMetadataPrefetchErrorDomain");
        A08 = enumC46247KdO12;
        EnumC46247KdO[] enumC46247KdOArr = {enumC46247KdO, enumC46247KdO2, enumC46247KdO3, enumC46247KdO4, enumC46247KdO5, enumC46247KdO6, enumC46247KdO7, enumC46247KdO8, enumC46247KdO9, enumC46247KdO10, enumC46247KdO11, enumC46247KdO12};
        A04 = enumC46247KdOArr;
        A03 = AbstractC12190kN.A00(enumC46247KdOArr);
        EnumC46247KdO[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC46247KdO enumC46247KdO13 : values) {
            A18.put(enumC46247KdO13.A01, enumC46247KdO13);
        }
        A02 = A18;
    }

    public static EnumC46247KdO valueOf(String str) {
        return (EnumC46247KdO) Enum.valueOf(EnumC46247KdO.class, str);
    }

    public static EnumC46247KdO[] values() {
        return (EnumC46247KdO[]) A04.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A01;
    }

    public EnumC46247KdO(int i, int i2, String str, String str2) {
        this.A01 = str2;
        this.A00 = i2;
    }
}
