package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7Qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC162657Qc {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC162657Qc[] A01;
    public static final EnumC162657Qc A02;
    public static final EnumC162657Qc A03;
    public static final EnumC162657Qc A04;
    public static final EnumC162657Qc A05;
    public static final EnumC162657Qc A06;

    static {
        EnumC162657Qc enumC162657Qc = new EnumC162657Qc("SENDING", 0);
        A05 = enumC162657Qc;
        EnumC162657Qc enumC162657Qc2 = new EnumC162657Qc("FAILED", 1);
        A02 = enumC162657Qc2;
        EnumC162657Qc enumC162657Qc3 = new EnumC162657Qc("PERMANENTLY_FAILED", 2);
        A04 = enumC162657Qc3;
        EnumC162657Qc enumC162657Qc4 = new EnumC162657Qc("SENT", 3);
        A06 = enumC162657Qc4;
        EnumC162657Qc enumC162657Qc5 = new EnumC162657Qc(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 4);
        A03 = enumC162657Qc5;
        EnumC162657Qc[] enumC162657QcArr = {enumC162657Qc, enumC162657Qc2, enumC162657Qc3, enumC162657Qc4, enumC162657Qc5};
        A01 = enumC162657QcArr;
        A00 = AbstractC12190kN.A00(enumC162657QcArr);
    }

    public static EnumC162657Qc valueOf(String str) {
        return (EnumC162657Qc) Enum.valueOf(EnumC162657Qc.class, str);
    }

    public static EnumC162657Qc[] values() {
        return (EnumC162657Qc[]) A01.clone();
    }

    public EnumC162657Qc(String str, int i) {
    }
}
