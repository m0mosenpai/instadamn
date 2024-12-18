package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5Qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC116885Qs {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC116885Qs[] A01;
    public static final EnumC116885Qs A02;
    public static final EnumC116885Qs A03;
    public static final EnumC116885Qs A04;
    public static final EnumC116885Qs A05;

    static {
        EnumC116885Qs enumC116885Qs = new EnumC116885Qs(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A04 = enumC116885Qs;
        EnumC116885Qs enumC116885Qs2 = new EnumC116885Qs("ANIMATE", 1);
        A02 = enumC116885Qs2;
        EnumC116885Qs enumC116885Qs3 = new EnumC116885Qs("INSTANT", 2);
        A03 = enumC116885Qs3;
        EnumC116885Qs enumC116885Qs4 = new EnumC116885Qs("SKIP", 3);
        A05 = enumC116885Qs4;
        EnumC116885Qs[] enumC116885QsArr = {enumC116885Qs, enumC116885Qs2, enumC116885Qs3, enumC116885Qs4};
        A01 = enumC116885QsArr;
        A00 = AbstractC12190kN.A00(enumC116885QsArr);
    }

    public static EnumC116885Qs valueOf(String str) {
        return (EnumC116885Qs) Enum.valueOf(EnumC116885Qs.class, str);
    }

    public static EnumC116885Qs[] values() {
        return (EnumC116885Qs[]) A01.clone();
    }

    public EnumC116885Qs(String str, int i) {
    }
}
