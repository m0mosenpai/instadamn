package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3i1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC80123i1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC80123i1[] A01;
    public static final EnumC80123i1 A02;
    public static final EnumC80123i1 A03;
    public static final EnumC80123i1 A04;
    public static final EnumC80123i1 A05;

    static {
        EnumC80123i1 enumC80123i1 = new EnumC80123i1("LOCAL", 0);
        A02 = enumC80123i1;
        EnumC80123i1 enumC80123i12 = new EnumC80123i1("REMOTE", 1);
        A04 = enumC80123i12;
        EnumC80123i1 enumC80123i13 = new EnumC80123i1("VIDEO", 2);
        A05 = enumC80123i13;
        EnumC80123i1 enumC80123i14 = new EnumC80123i1(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 3);
        A03 = enumC80123i14;
        EnumC80123i1[] enumC80123i1Arr = {enumC80123i1, enumC80123i12, enumC80123i13, enumC80123i14};
        A01 = enumC80123i1Arr;
        A00 = AbstractC12190kN.A00(enumC80123i1Arr);
    }

    public static EnumC80123i1 valueOf(String str) {
        return (EnumC80123i1) Enum.valueOf(EnumC80123i1.class, str);
    }

    public static EnumC80123i1[] values() {
        return (EnumC80123i1[]) A01.clone();
    }

    public EnumC80123i1(String str, int i) {
    }
}
