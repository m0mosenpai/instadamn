package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4dy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC99774dy {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC99774dy[] A01;
    public static final EnumC99774dy A02;
    public static final EnumC99774dy A03;

    static {
        EnumC99774dy enumC99774dy = new EnumC99774dy("START", 0);
        A03 = enumC99774dy;
        EnumC99774dy enumC99774dy2 = new EnumC99774dy("END", 1);
        A02 = enumC99774dy2;
        EnumC99774dy[] enumC99774dyArr = {enumC99774dy, enumC99774dy2};
        A01 = enumC99774dyArr;
        A00 = AbstractC12190kN.A00(enumC99774dyArr);
    }

    public static EnumC99774dy valueOf(String str) {
        return (EnumC99774dy) Enum.valueOf(EnumC99774dy.class, str);
    }

    public static EnumC99774dy[] values() {
        return (EnumC99774dy[]) A01.clone();
    }

    public EnumC99774dy(String str, int i) {
    }
}
