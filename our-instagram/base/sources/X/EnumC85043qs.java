package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC85043qs {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC85043qs[] A01;
    public static final EnumC85043qs A02;
    public static final EnumC85043qs A03;
    public static final EnumC85043qs A04;
    public static final EnumC85043qs A05;
    public static final EnumC85043qs A06;

    static {
        EnumC85043qs enumC85043qs = new EnumC85043qs(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC85043qs;
        EnumC85043qs enumC85043qs2 = new EnumC85043qs("SHARE_BUTTON", 1);
        A05 = enumC85043qs2;
        EnumC85043qs enumC85043qs3 = new EnumC85043qs("COMMENT_BUTTON", 2);
        A02 = enumC85043qs3;
        EnumC85043qs enumC85043qs4 = new EnumC85043qs("REPLY_SHEET_MIMICRY_TOOLTIP", 3);
        A04 = enumC85043qs4;
        EnumC85043qs enumC85043qs5 = new EnumC85043qs("SHARE_BUTTON_NUDGE", 4);
        A06 = enumC85043qs5;
        EnumC85043qs[] enumC85043qsArr = {enumC85043qs, enumC85043qs2, enumC85043qs3, enumC85043qs4, enumC85043qs5};
        A01 = enumC85043qsArr;
        A00 = AbstractC12190kN.A00(enumC85043qsArr);
    }

    public static EnumC85043qs valueOf(String str) {
        return (EnumC85043qs) Enum.valueOf(EnumC85043qs.class, str);
    }

    public static EnumC85043qs[] values() {
        return (EnumC85043qs[]) A01.clone();
    }

    public EnumC85043qs(String str, int i) {
    }
}
