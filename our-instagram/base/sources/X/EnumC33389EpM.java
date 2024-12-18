package X;

import java.util.HashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33389EpM {
    public static final HashMap A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33389EpM[] A03;
    public static final EnumC33389EpM A04;
    public static final EnumC33389EpM A05;
    public final String A00;

    static {
        EnumC33389EpM enumC33389EpM = new EnumC33389EpM("DEFAULT", 0, "");
        A05 = enumC33389EpM;
        EnumC33389EpM enumC33389EpM2 = new EnumC33389EpM("DATE_FOLLOWED_LATEST", 1, "date_followed_latest");
        A04 = enumC33389EpM2;
        EnumC33389EpM[] enumC33389EpMArr = {enumC33389EpM, enumC33389EpM2, new EnumC33389EpM("DATE_FOLLOWED_EARLIEST", 2, "date_followed_earliest")};
        A03 = enumC33389EpMArr;
        A02 = AbstractC12190kN.A00(enumC33389EpMArr);
        A01 = AbstractC166987dD.A1G();
        for (EnumC33389EpM enumC33389EpM3 : values()) {
            A01.put(enumC33389EpM3.A00, enumC33389EpM3);
        }
    }

    public static EnumC33389EpM valueOf(String str) {
        return (EnumC33389EpM) Enum.valueOf(EnumC33389EpM.class, str);
    }

    public static EnumC33389EpM[] values() {
        return (EnumC33389EpM[]) A03.clone();
    }

    public EnumC33389EpM(String str, int i, String str2) {
        this.A00 = str2;
    }
}
