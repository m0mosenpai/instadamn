package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC168447fe {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC168447fe[] A01;
    public static final EnumC168447fe A02;
    public static final EnumC168447fe A03;
    public static final EnumC168447fe A04;
    public static final EnumC168447fe A05;
    public static final EnumC168447fe A06;
    public static final EnumC168447fe A07;
    public static final EnumC168447fe A08;
    public static final EnumC168447fe A09;
    public static final EnumC168447fe A0A;
    public static final EnumC168447fe A0B;
    public static final EnumC168447fe A0C;
    public static final EnumC168447fe A0D;
    public static final EnumC168447fe A0E;
    public static final EnumC168447fe A0F;
    public static final EnumC168447fe A0G;
    public static final EnumC168447fe A0H;

    static {
        EnumC168447fe enumC168447fe = new EnumC168447fe("DEFAULT", 0);
        A06 = enumC168447fe;
        EnumC168447fe enumC168447fe2 = new EnumC168447fe(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 1);
        A0D = enumC168447fe2;
        EnumC168447fe enumC168447fe3 = new EnumC168447fe("EMPATHY", 2);
        A08 = enumC168447fe3;
        EnumC168447fe enumC168447fe4 = new EnumC168447fe("LWN_WELCOME", 3);
        A0C = enumC168447fe4;
        EnumC168447fe enumC168447fe5 = new EnumC168447fe("LWN_WARNING", 4);
        A0B = enumC168447fe5;
        EnumC168447fe enumC168447fe6 = new EnumC168447fe("LWN_STORY_REPLY_RESPECTFUL", 5);
        A0A = enumC168447fe6;
        EnumC168447fe enumC168447fe7 = new EnumC168447fe("BOTTOMSHEET_MEDIA_CREATION_GENERIC", 6);
        A02 = enumC168447fe7;
        EnumC168447fe enumC168447fe8 = new EnumC168447fe("BOTTOMSHEET_MEDIA_CREATION_STORY", 7);
        A03 = enumC168447fe8;
        EnumC168447fe enumC168447fe9 = new EnumC168447fe("BOTTOMSHEET_STORY_REPLY_RESPECTFUL", 8);
        A05 = enumC168447fe9;
        EnumC168447fe enumC168447fe10 = new EnumC168447fe("BOTTOMSHEET_PENDING_REVIEW_STORY_REPLY", 9);
        A04 = enumC168447fe10;
        EnumC168447fe enumC168447fe11 = new EnumC168447fe("PERSISTENT_WELCOME_LIGHTWEIGHT", 10);
        A0G = enumC168447fe11;
        EnumC168447fe enumC168447fe12 = new EnumC168447fe("PERSISTENT_WARNING_LIGHTWEIGHT", 11);
        A0F = enumC168447fe12;
        EnumC168447fe enumC168447fe13 = new EnumC168447fe("LWN_SET_TONE", 12);
        A09 = enumC168447fe13;
        EnumC168447fe enumC168447fe14 = new EnumC168447fe("PERSISTENT_SET_TONE_LIGHTWEIGHT", 13);
        A0E = enumC168447fe14;
        EnumC168447fe enumC168447fe15 = new EnumC168447fe("DIRECT_CHANNEL_REPLY_NUDGE", 14);
        A07 = enumC168447fe15;
        EnumC168447fe enumC168447fe16 = new EnumC168447fe("TEXT_POST_APP_SET_TONE", 15);
        A0H = enumC168447fe16;
        EnumC168447fe[] enumC168447feArr = {enumC168447fe, enumC168447fe2, enumC168447fe3, enumC168447fe4, enumC168447fe5, enumC168447fe6, enumC168447fe7, enumC168447fe8, enumC168447fe9, enumC168447fe10, enumC168447fe11, enumC168447fe12, enumC168447fe13, enumC168447fe14, enumC168447fe15, enumC168447fe16};
        A01 = enumC168447feArr;
        A00 = AbstractC12190kN.A00(enumC168447feArr);
    }

    public static EnumC168447fe valueOf(String str) {
        return (EnumC168447fe) Enum.valueOf(EnumC168447fe.class, str);
    }

    public static EnumC168447fe[] values() {
        return (EnumC168447fe[]) A01.clone();
    }

    public EnumC168447fe(String str, int i) {
    }
}
