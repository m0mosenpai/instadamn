package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5Eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC114405Eh {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC114405Eh[] A01;
    public static final EnumC114405Eh A02;
    public static final EnumC114405Eh A03;
    public static final EnumC114405Eh A04;
    public static final EnumC114405Eh A05;
    public static final EnumC114405Eh A06;

    static {
        EnumC114405Eh enumC114405Eh = new EnumC114405Eh("CLICKED_HIDE", 0);
        A02 = enumC114405Eh;
        EnumC114405Eh enumC114405Eh2 = new EnumC114405Eh("FINISHED", 1);
        A03 = enumC114405Eh2;
        EnumC114405Eh enumC114405Eh3 = new EnumC114405Eh("NOT_BUSINESS", 2);
        A05 = enumC114405Eh3;
        EnumC114405Eh enumC114405Eh4 = new EnumC114405Eh("NO_TIME", 3);
        A06 = enumC114405Eh4;
        EnumC114405Eh enumC114405Eh5 = new EnumC114405Eh(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 4);
        A04 = enumC114405Eh5;
        EnumC114405Eh[] enumC114405EhArr = {enumC114405Eh, enumC114405Eh2, enumC114405Eh3, enumC114405Eh4, enumC114405Eh5};
        A01 = enumC114405EhArr;
        A00 = AbstractC12190kN.A00(enumC114405EhArr);
    }

    public static EnumC114405Eh valueOf(String str) {
        return (EnumC114405Eh) Enum.valueOf(EnumC114405Eh.class, str);
    }

    public static EnumC114405Eh[] values() {
        return (EnumC114405Eh[]) A01.clone();
    }

    public EnumC114405Eh(String str, int i) {
    }
}
