package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8Kw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC185548Kw {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC185548Kw[] A01;
    public static final EnumC185548Kw A02;
    public static final EnumC185548Kw A03;
    public static final EnumC185548Kw A04;
    public static final EnumC185548Kw A05;
    public static final EnumC185548Kw A06;
    public static final EnumC185548Kw A07;
    public static final EnumC185548Kw A08;

    static {
        EnumC185548Kw enumC185548Kw = new EnumC185548Kw("AUDIO", 0);
        A02 = enumC185548Kw;
        EnumC185548Kw enumC185548Kw2 = new EnumC185548Kw("RECENTLY_WATCHED", 1);
        A06 = enumC185548Kw2;
        EnumC185548Kw enumC185548Kw3 = new EnumC185548Kw("EFFECT", 2);
        A04 = enumC185548Kw3;
        EnumC185548Kw enumC185548Kw4 = new EnumC185548Kw("AUDIO_AND_EFFECT", 3);
        A03 = enumC185548Kw4;
        EnumC185548Kw enumC185548Kw5 = new EnumC185548Kw("TEMPLATE", 4);
        A07 = enumC185548Kw5;
        EnumC185548Kw enumC185548Kw6 = new EnumC185548Kw("TEMPLATE_BROWSER", 5);
        A08 = enumC185548Kw6;
        EnumC185548Kw enumC185548Kw7 = new EnumC185548Kw(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 6);
        A05 = enumC185548Kw7;
        EnumC185548Kw[] enumC185548KwArr = {enumC185548Kw, enumC185548Kw2, enumC185548Kw3, enumC185548Kw4, enumC185548Kw5, enumC185548Kw6, enumC185548Kw7};
        A01 = enumC185548KwArr;
        A00 = AbstractC12190kN.A00(enumC185548KwArr);
    }

    public static EnumC185548Kw valueOf(String str) {
        return (EnumC185548Kw) Enum.valueOf(EnumC185548Kw.class, str);
    }

    public static EnumC185548Kw[] values() {
        return (EnumC185548Kw[]) A01.clone();
    }

    public EnumC185548Kw(String str, int i) {
    }
}
