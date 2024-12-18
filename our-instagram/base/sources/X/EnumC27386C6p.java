package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27386C6p {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27386C6p[] A01;
    public static final EnumC27386C6p A02;
    public static final EnumC27386C6p A03;
    public static final EnumC27386C6p A04;
    public static final EnumC27386C6p A05;

    static {
        EnumC27386C6p enumC27386C6p = new EnumC27386C6p(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A02 = enumC27386C6p;
        EnumC27386C6p enumC27386C6p2 = new EnumC27386C6p("SHOW_EXIT_DIALOG", 1);
        A04 = enumC27386C6p2;
        EnumC27386C6p enumC27386C6p3 = new EnumC27386C6p("SHOW_EFFECT_LOAD_FAILURE_DIALOG", 2);
        A03 = enumC27386C6p3;
        EnumC27386C6p enumC27386C6p4 = new EnumC27386C6p("SHOW_UPLOAD_FAILURE_DIALOG", 3);
        A05 = enumC27386C6p4;
        EnumC27386C6p[] enumC27386C6pArr = {enumC27386C6p, enumC27386C6p2, enumC27386C6p3, enumC27386C6p4};
        A01 = enumC27386C6pArr;
        A00 = AbstractC12190kN.A00(enumC27386C6pArr);
    }

    public static EnumC27386C6p valueOf(String str) {
        return (EnumC27386C6p) Enum.valueOf(EnumC27386C6p.class, str);
    }

    public static EnumC27386C6p[] values() {
        return (EnumC27386C6p[]) A01.clone();
    }

    public EnumC27386C6p(String str, int i) {
    }
}
