package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDE {
    public static final Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ VDE[] A02;
    public static final VDE A03;
    public static final VDE A04;
    public static final VDE A05;
    public static final VDE A06;
    public static final VDE A07;
    public static final VDE A08;
    public static final VDE A09;
    public static final VDE A0A;
    public static final VDE A0B;
    public static final VDE A0C;
    public static final VDE A0D;
    public static final VDE A0E;

    static {
        VDE vde = new VDE("START_DOWNLOAD_URL", 0);
        A09 = vde;
        VDE vde2 = new VDE("FAILED_DOWNLOAD_URL", 1);
        A05 = vde2;
        VDE vde3 = new VDE("START_DOWNLOAD", 2);
        A08 = vde3;
        VDE vde4 = new VDE("WAITING_DOWNLOAD", 3);
        A0D = vde4;
        VDE vde5 = new VDE("RUNNING_DOWNLOAD", 4);
        A07 = vde5;
        VDE vde6 = new VDE("CANCEL_DOWNLOAD", 5);
        A03 = vde6;
        VDE vde7 = new VDE("SUCCESS_DOWNLOAD", 6);
        A0B = vde7;
        VDE vde8 = new VDE("FAILED_DOWNLOAD", 7);
        A04 = vde8;
        VDE vde9 = new VDE("START_INSTALL", 8);
        A0A = vde9;
        VDE vde10 = new VDE("FAILED_INSTALL", 9);
        A06 = vde10;
        VDE vde11 = new VDE("SUCCESS_INSTALL", 10);
        A0C = vde11;
        VDE vde12 = new VDE("WAITING_WIFI_FOR_DOWNLOAD", 11);
        A0E = vde12;
        VDE[] vdeArr = {vde, vde2, vde3, vde4, vde5, vde6, vde7, vde8, vde9, vde10, vde11, vde12};
        A02 = vdeArr;
        A01 = AbstractC12190kN.A00(vdeArr);
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put(vde5, ImmutableSet.A00(vde3, vde5));
        builder.put(vde6, ImmutableSet.A05(new Object[]{vde3, vde5, vde, vde2}, 4));
        builder.put(vde7, ImmutableSet.A00(vde3, vde5));
        ImmutableMap buildOrThrow = builder.buildOrThrow();
        C14360o3.A07(buildOrThrow);
        A00 = buildOrThrow;
    }

    public static VDE valueOf(String str) {
        return (VDE) Enum.valueOf(VDE.class, str);
    }

    public static VDE[] values() {
        return (VDE[]) A02.clone();
    }

    public VDE(String str, int i) {
    }
}
