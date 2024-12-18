package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NhG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53278NhG {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53278NhG[] A01;
    public static final EnumC53278NhG A02;
    public static final EnumC53278NhG A03;
    public static final EnumC53278NhG A04;
    public static final EnumC53278NhG A05;

    static {
        EnumC53278NhG enumC53278NhG = new EnumC53278NhG("EARPIECE", 0);
        A03 = enumC53278NhG;
        EnumC53278NhG enumC53278NhG2 = new EnumC53278NhG("SPEAKERPHONE", 1);
        A05 = enumC53278NhG2;
        EnumC53278NhG enumC53278NhG3 = new EnumC53278NhG("BLUETOOTH", 2);
        A02 = enumC53278NhG3;
        EnumC53278NhG enumC53278NhG4 = new EnumC53278NhG("HEADSET", 3);
        A04 = enumC53278NhG4;
        EnumC53278NhG[] enumC53278NhGArr = {enumC53278NhG, enumC53278NhG2, enumC53278NhG3, enumC53278NhG4};
        A01 = enumC53278NhGArr;
        A00 = AbstractC12190kN.A00(enumC53278NhGArr);
    }

    public static EnumC53278NhG valueOf(String str) {
        return (EnumC53278NhG) Enum.valueOf(EnumC53278NhG.class, str);
    }

    public static EnumC53278NhG[] values() {
        return (EnumC53278NhG[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 2) {
            if (ordinal != 0) {
                if (ordinal != 3) {
                    if (ordinal == 1) {
                        return "speaker";
                    }
                    throw B4Z.A00();
                }
                return "headset";
            }
            return "earpiece";
        }
        return NetInfoModule.CONNECTION_TYPE_BLUETOOTH;
    }

    public EnumC53278NhG(String str, int i) {
    }
}
