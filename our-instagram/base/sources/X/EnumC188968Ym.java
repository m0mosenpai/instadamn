package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8Ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC188968Ym {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC188968Ym[] A01;
    public static final EnumC188968Ym A02;
    public static final EnumC188968Ym A03;
    public static final EnumC188968Ym A04;
    public static final EnumC188968Ym A05;
    public static final EnumC188968Ym A06;

    static {
        EnumC188968Ym enumC188968Ym = new EnumC188968Ym("STATIC_PHOTO_ONLY", 0);
        A05 = enumC188968Ym;
        EnumC188968Ym enumC188968Ym2 = new EnumC188968Ym("PHOTO_ONLY", 1);
        A04 = enumC188968Ym2;
        EnumC188968Ym enumC188968Ym3 = new EnumC188968Ym("VIDEO_ONLY", 2);
        A06 = enumC188968Ym3;
        EnumC188968Ym enumC188968Ym4 = new EnumC188968Ym("PHOTO_AND_VIDEO", 3);
        A02 = enumC188968Ym4;
        EnumC188968Ym enumC188968Ym5 = new EnumC188968Ym("PHOTO_AND_VIDEO_NO_SVG", 4);
        A03 = enumC188968Ym5;
        EnumC188968Ym[] enumC188968YmArr = {enumC188968Ym, enumC188968Ym2, enumC188968Ym3, enumC188968Ym4, enumC188968Ym5, new EnumC188968Ym(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 5)};
        A01 = enumC188968YmArr;
        A00 = AbstractC12190kN.A00(enumC188968YmArr);
    }

    public static EnumC188968Ym valueOf(String str) {
        return (EnumC188968Ym) Enum.valueOf(EnumC188968Ym.class, str);
    }

    public static EnumC188968Ym[] values() {
        return (EnumC188968Ym[]) A01.clone();
    }

    public EnumC188968Ym(String str, int i) {
    }
}
