package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53170NfR {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53170NfR[] A01;
    public static final EnumC53170NfR A02;
    public static final EnumC53170NfR A03;
    public static final EnumC53170NfR A04;
    public static final EnumC53170NfR A05;
    public static final EnumC53170NfR A06;
    public static final EnumC53170NfR A07;

    static {
        EnumC53170NfR enumC53170NfR = new EnumC53170NfR(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC53170NfR;
        EnumC53170NfR enumC53170NfR2 = new EnumC53170NfR("VIDEO_TRACK", 1);
        A06 = enumC53170NfR2;
        EnumC53170NfR enumC53170NfR3 = new EnumC53170NfR("AUDIO_TRACK", 2);
        A02 = enumC53170NfR3;
        EnumC53170NfR enumC53170NfR4 = new EnumC53170NfR("VOICEOVER_TRACK", 3);
        A07 = enumC53170NfR4;
        EnumC53170NfR enumC53170NfR5 = new EnumC53170NfR("TIME_MARKER_TRACK", 4);
        A05 = enumC53170NfR5;
        EnumC53170NfR enumC53170NfR6 = new EnumC53170NfR("TIMED_ELEMENTS_TRACK", 5);
        A04 = enumC53170NfR6;
        EnumC53170NfR[] enumC53170NfRArr = {enumC53170NfR, enumC53170NfR2, enumC53170NfR3, enumC53170NfR4, enumC53170NfR5, enumC53170NfR6};
        A01 = enumC53170NfRArr;
        A00 = AbstractC12190kN.A00(enumC53170NfRArr);
    }

    public static EnumC53170NfR valueOf(String str) {
        return (EnumC53170NfR) Enum.valueOf(EnumC53170NfR.class, str);
    }

    public static EnumC53170NfR[] values() {
        return (EnumC53170NfR[]) A01.clone();
    }

    public EnumC53170NfR(String str, int i) {
    }
}
