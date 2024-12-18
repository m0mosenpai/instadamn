package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC168437fd {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC168437fd[] A01;
    public static final EnumC168437fd A02;
    public static final EnumC168437fd A03;
    public static final EnumC168437fd A04;
    public static final EnumC168437fd A05;
    public static final EnumC168437fd A06;
    public static final EnumC168437fd A07;
    public static final EnumC168437fd A08;
    public static final EnumC168437fd A09;
    public static final EnumC168437fd A0A;
    public static final EnumC168437fd A0B;
    public static final EnumC168437fd A0C;
    public static final EnumC168437fd A0D;
    public static final EnumC168437fd A0E;
    public static final EnumC168437fd A0F;
    public static final EnumC168437fd A0G;
    public static final EnumC168437fd A0H;

    static {
        EnumC168437fd enumC168437fd = new EnumC168437fd("EMPATHY", 0);
        A04 = enumC168437fd;
        EnumC168437fd enumC168437fd2 = new EnumC168437fd("DEFAULT", 1);
        A02 = enumC168437fd2;
        EnumC168437fd enumC168437fd3 = new EnumC168437fd("RESPECTFUL_STORY_CREATION_BOTTOM_SHEET", 2);
        A0B = enumC168437fd3;
        EnumC168437fd enumC168437fd4 = new EnumC168437fd("RESPECTFUL_MEDIA_CREATION_BOTTOM_SHEET", 3);
        A0A = enumC168437fd4;
        EnumC168437fd enumC168437fd5 = new EnumC168437fd("RESPECTFUL_STORY_REPLY_BOTTOM_SHEET", 4);
        A0C = enumC168437fd5;
        EnumC168437fd enumC168437fd6 = new EnumC168437fd("RESPECTFUL_STORY_REPLY_LIGHTWEIGHT", 5);
        A0D = enumC168437fd6;
        EnumC168437fd enumC168437fd7 = new EnumC168437fd("PENDING_REVIEW_STORY_REPLY_BOTTOM_SHEET", 6);
        A06 = enumC168437fd7;
        EnumC168437fd enumC168437fd8 = new EnumC168437fd("WELCOME_LIGHTWEIGHT", 7);
        A0H = enumC168437fd8;
        EnumC168437fd enumC168437fd9 = new EnumC168437fd("WARNING_LIGHTWEIGHT", 8);
        A0G = enumC168437fd9;
        EnumC168437fd enumC168437fd10 = new EnumC168437fd("PERSISTENT_WELCOME_LIGHTWEIGHT", 9);
        A09 = enumC168437fd10;
        EnumC168437fd enumC168437fd11 = new EnumC168437fd("PERSISTENT_WARNING_LIGHTWEIGHT", 10);
        A08 = enumC168437fd11;
        EnumC168437fd enumC168437fd12 = new EnumC168437fd("SET_TONE_LIGHTWEIGHT", 11);
        A0E = enumC168437fd12;
        EnumC168437fd enumC168437fd13 = new EnumC168437fd("PERSISTENT_SET_TONE_LIGHTWEIGHT", 12);
        A07 = enumC168437fd13;
        EnumC168437fd enumC168437fd14 = new EnumC168437fd("DIRECT_CHANNEL_REPLY_NUDGE", 13);
        A03 = enumC168437fd14;
        EnumC168437fd enumC168437fd15 = new EnumC168437fd("TEXT_POST_APP_SET_TONE", 14);
        A0F = enumC168437fd15;
        EnumC168437fd enumC168437fd16 = new EnumC168437fd(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 15);
        A05 = enumC168437fd16;
        EnumC168437fd[] enumC168437fdArr = {enumC168437fd, enumC168437fd2, enumC168437fd3, enumC168437fd4, enumC168437fd5, enumC168437fd6, enumC168437fd7, enumC168437fd8, enumC168437fd9, enumC168437fd10, enumC168437fd11, enumC168437fd12, enumC168437fd13, enumC168437fd14, enumC168437fd15, enumC168437fd16};
        A01 = enumC168437fdArr;
        A00 = AbstractC12190kN.A00(enumC168437fdArr);
    }

    public static EnumC168437fd valueOf(String str) {
        return (EnumC168437fd) Enum.valueOf(EnumC168437fd.class, str);
    }

    public static EnumC168437fd[] values() {
        return (EnumC168437fd[]) A01.clone();
    }

    public EnumC168437fd(String str, int i) {
    }
}
