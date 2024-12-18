package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53121NeY {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53121NeY[] A01;
    public static final EnumC53121NeY A02;
    public static final EnumC53121NeY A03;

    static {
        EnumC53121NeY enumC53121NeY = new EnumC53121NeY("DEFAULT", 0);
        A02 = enumC53121NeY;
        EnumC53121NeY enumC53121NeY2 = new EnumC53121NeY("SPEAKER", 1);
        A03 = enumC53121NeY2;
        EnumC53121NeY[] enumC53121NeYArr = {enumC53121NeY, enumC53121NeY2, new EnumC53121NeY("EARPIECE", 2)};
        A01 = enumC53121NeYArr;
        A00 = AbstractC12190kN.A00(enumC53121NeYArr);
    }

    public static EnumC53121NeY valueOf(String str) {
        return (EnumC53121NeY) Enum.valueOf(EnumC53121NeY.class, str);
    }

    public static EnumC53121NeY[] values() {
        return (EnumC53121NeY[]) A01.clone();
    }

    public EnumC53121NeY(String str, int i) {
    }
}
