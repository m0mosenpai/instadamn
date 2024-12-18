package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46184KcM {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46184KcM[] A01;
    public static final EnumC46184KcM A02;
    public static final EnumC46184KcM A03;
    public static final EnumC46184KcM A04;
    public static final EnumC46184KcM A05;
    public static final EnumC46184KcM A06;
    public static final EnumC46184KcM A07;
    public static final EnumC46184KcM A08;
    public static final EnumC46184KcM A09;
    public static final EnumC46184KcM A0A;

    static {
        EnumC46184KcM enumC46184KcM = new EnumC46184KcM(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A06 = enumC46184KcM;
        EnumC46184KcM enumC46184KcM2 = new EnumC46184KcM("MUSIC_NOTE", 1);
        A05 = enumC46184KcM2;
        EnumC46184KcM enumC46184KcM3 = new EnumC46184KcM("LOCATION_NOTE", 2);
        A04 = enumC46184KcM3;
        EnumC46184KcM enumC46184KcM4 = new EnumC46184KcM("PROMPT_NOTE", 3);
        A08 = enumC46184KcM4;
        EnumC46184KcM enumC46184KcM5 = new EnumC46184KcM("PROMPT_NOTE_WITH_MUSIC", 4);
        A09 = enumC46184KcM5;
        EnumC46184KcM enumC46184KcM6 = new EnumC46184KcM("NOTE_CHAT", 5);
        A07 = enumC46184KcM6;
        EnumC46184KcM enumC46184KcM7 = new EnumC46184KcM("SPOTIFY_NOTE", 6);
        A0A = enumC46184KcM7;
        EnumC46184KcM enumC46184KcM8 = new EnumC46184KcM("COLLAB_NOTE", 7);
        A02 = enumC46184KcM8;
        EnumC46184KcM enumC46184KcM9 = new EnumC46184KcM("GIF_NOTE", 8);
        A03 = enumC46184KcM9;
        EnumC46184KcM[] enumC46184KcMArr = {enumC46184KcM, enumC46184KcM2, enumC46184KcM3, enumC46184KcM4, enumC46184KcM5, enumC46184KcM6, enumC46184KcM7, enumC46184KcM8, enumC46184KcM9};
        A01 = enumC46184KcMArr;
        A00 = AbstractC12190kN.A00(enumC46184KcMArr);
    }

    public static EnumC46184KcM valueOf(String str) {
        return (EnumC46184KcM) Enum.valueOf(EnumC46184KcM.class, str);
    }

    public static EnumC46184KcM[] values() {
        return (EnumC46184KcM[]) A01.clone();
    }

    public EnumC46184KcM(String str, int i) {
    }
}
