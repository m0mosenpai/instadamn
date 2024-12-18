package X;

import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nh6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53268Nh6 {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC53268Nh6[] A04;
    public static final EnumC53268Nh6 A05;
    public static final EnumC53268Nh6 A06;
    public static final EnumC53268Nh6 A07;
    public final DirectMessageInteropReachabilityOptions A00;
    public final DirectMessageInteropReachabilityOptions A01;
    public final String A02;

    static {
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = DirectMessageInteropReachabilityOptions.A0G;
        EnumC53268Nh6 enumC53268Nh6 = new EnumC53268Nh6(directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, "ANYONE", "anyone", 0);
        A05 = enumC53268Nh6;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = DirectMessageInteropReachabilityOptions.A0A;
        EnumC53268Nh6 enumC53268Nh62 = new EnumC53268Nh6(directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions2, "YOUR_FOLLOWERS", "your_followers", 1);
        A07 = enumC53268Nh62;
        EnumC53268Nh6 enumC53268Nh63 = new EnumC53268Nh6(directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, "NO_ONE", "no_one", 2);
        A06 = enumC53268Nh63;
        EnumC53268Nh6[] enumC53268Nh6Arr = {enumC53268Nh6, enumC53268Nh62, enumC53268Nh63};
        A04 = enumC53268Nh6Arr;
        A03 = AbstractC12190kN.A00(enumC53268Nh6Arr);
    }

    public static EnumC53268Nh6 valueOf(String str) {
        return (EnumC53268Nh6) Enum.valueOf(EnumC53268Nh6.class, str);
    }

    public static EnumC53268Nh6[] values() {
        return (EnumC53268Nh6[]) A04.clone();
    }

    public EnumC53268Nh6(DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2, String str, String str2, int i) {
        this.A01 = directMessageInteropReachabilityOptions;
        this.A00 = directMessageInteropReachabilityOptions2;
        this.A02 = str2;
    }
}
