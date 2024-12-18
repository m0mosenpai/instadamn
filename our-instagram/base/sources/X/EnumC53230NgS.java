package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53230NgS {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53230NgS[] A03;
    public static final EnumC53230NgS A04;
    public static final EnumC53230NgS A05;
    public static final EnumC53230NgS A06;
    public static final EnumC53230NgS A07;
    public final String A00;

    static {
        EnumC53230NgS enumC53230NgS = new EnumC53230NgS("AUTO_TAG", 0, "auto_tag");
        A05 = enumC53230NgS;
        EnumC53230NgS enumC53230NgS2 = new EnumC53230NgS("SHOW_HINT", 1, "show_hint");
        A07 = enumC53230NgS2;
        EnumC53230NgS enumC53230NgS3 = new EnumC53230NgS("AUTO_PLACE", 2, "auto_place");
        A04 = enumC53230NgS3;
        EnumC53230NgS enumC53230NgS4 = new EnumC53230NgS(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 3, NetInfoModule.CONNECTION_TYPE_NONE);
        A06 = enumC53230NgS4;
        EnumC53230NgS[] enumC53230NgSArr = {enumC53230NgS, enumC53230NgS2, enumC53230NgS3, enumC53230NgS4};
        A03 = enumC53230NgSArr;
        A02 = AbstractC12190kN.A00(enumC53230NgSArr);
        EnumC53230NgS[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53230NgS enumC53230NgS5 : values) {
            A18.put(enumC53230NgS5.A00, enumC53230NgS5);
        }
        A01 = A18;
    }

    public static EnumC53230NgS valueOf(String str) {
        return (EnumC53230NgS) Enum.valueOf(EnumC53230NgS.class, str);
    }

    public static EnumC53230NgS[] values() {
        return (EnumC53230NgS[]) A03.clone();
    }

    public EnumC53230NgS(String str, int i, String str2) {
        this.A00 = str2;
    }
}
