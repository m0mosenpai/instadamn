package X;

import android.util.SparseArray;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46213Kcp {
    public static final SparseArray A03;
    public static final SparseArray A04;
    public static final /* synthetic */ EnumEntries A05;
    public static final /* synthetic */ EnumC46213Kcp[] A06;
    public static final EnumC46213Kcp A07;
    public static final EnumC46213Kcp A08;
    public static final EnumC46213Kcp A09;
    public static final EnumC46213Kcp A0A;
    public final int A00;
    public final int A01;
    public final boolean A02;

    public static EnumC46213Kcp valueOf(String str) {
        return (EnumC46213Kcp) Enum.valueOf(EnumC46213Kcp.class, str);
    }

    public static EnumC46213Kcp[] values() {
        return (EnumC46213Kcp[]) A06.clone();
    }

    static {
        EnumC46213Kcp enumC46213Kcp = new EnumC46213Kcp(0, 0, "COLOR", true, 2131953594);
        A07 = enumC46213Kcp;
        EnumC46213Kcp enumC46213Kcp2 = new EnumC46213Kcp(1, 1, "EMOJI", false, 2131953596);
        A08 = enumC46213Kcp2;
        EnumC46213Kcp enumC46213Kcp3 = new EnumC46213Kcp(2, 2, "SELFIE", false, 2131953598);
        A0A = enumC46213Kcp3;
        EnumC46213Kcp enumC46213Kcp4 = new EnumC46213Kcp(3, 3, "IMAGE", false, 2131953597);
        A09 = enumC46213Kcp4;
        EnumC46213Kcp[] enumC46213KcpArr = {enumC46213Kcp, enumC46213Kcp2, enumC46213Kcp3, enumC46213Kcp4};
        A06 = enumC46213KcpArr;
        A05 = AbstractC12190kN.A00(enumC46213KcpArr);
        A03 = new SparseArray();
        A04 = new SparseArray();
        for (EnumC46213Kcp enumC46213Kcp5 : values()) {
            A03.put(enumC46213Kcp5.A01, enumC46213Kcp5);
            if (enumC46213Kcp5 != A09) {
                A04.put(enumC46213Kcp5.A01, enumC46213Kcp5);
            }
        }
    }

    public EnumC46213Kcp(int i, int i2, String str, boolean z, int i3) {
        this.A01 = i2;
        this.A02 = z;
        this.A00 = i3;
    }
}
