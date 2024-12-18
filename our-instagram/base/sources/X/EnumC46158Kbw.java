package X;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46158Kbw {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46158Kbw[] A01;
    public static final EnumC46158Kbw A02;
    public static final EnumC46158Kbw A03;
    public static final EnumC46158Kbw A04;
    public static final EnumC46158Kbw A05;

    static {
        EnumC46158Kbw enumC46158Kbw = new EnumC46158Kbw("Error", 0);
        A02 = enumC46158Kbw;
        EnumC46158Kbw enumC46158Kbw2 = new EnumC46158Kbw("ErrorPinBackoff", 1);
        A03 = enumC46158Kbw2;
        EnumC46158Kbw enumC46158Kbw3 = new EnumC46158Kbw("ErrorPinExpired", 2);
        A04 = enumC46158Kbw3;
        EnumC46158Kbw enumC46158Kbw4 = new EnumC46158Kbw(ReactProgressBarViewManager.DEFAULT_STYLE, 3);
        A05 = enumC46158Kbw4;
        EnumC46158Kbw[] enumC46158KbwArr = {enumC46158Kbw, enumC46158Kbw2, enumC46158Kbw3, enumC46158Kbw4};
        A01 = enumC46158KbwArr;
        A00 = AbstractC12190kN.A00(enumC46158KbwArr);
    }

    public static EnumC46158Kbw valueOf(String str) {
        return (EnumC46158Kbw) Enum.valueOf(EnumC46158Kbw.class, str);
    }

    public static EnumC46158Kbw[] values() {
        return (EnumC46158Kbw[]) A01.clone();
    }

    public EnumC46158Kbw(String str, int i) {
    }
}
