package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.DvE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC31648DvE {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC31648DvE[] A02;
    public static final EnumC31648DvE A03;
    public static final EnumC31648DvE A04;
    public static final EnumC31648DvE A05;
    public static final EnumC31648DvE A06;
    public static final EnumC31648DvE A07;
    public static final EnumC31648DvE A08;
    public static final EnumC31648DvE A09;
    public static final EnumC31648DvE A0A;
    public static final EnumC31648DvE A0B;
    public static final EnumC31648DvE A0C;
    public final String A00;

    static {
        EnumC31648DvE enumC31648DvE = new EnumC31648DvE("INBOX", 0, "inbox");
        A06 = enumC31648DvE;
        EnumC31648DvE enumC31648DvE2 = new EnumC31648DvE("PENDING", 1, "pending");
        A08 = enumC31648DvE2;
        EnumC31648DvE enumC31648DvE3 = new EnumC31648DvE("OTHER", 2, "other");
        A07 = enumC31648DvE3;
        EnumC31648DvE enumC31648DvE4 = new EnumC31648DvE("SPAM", 3, "spam");
        A0B = enumC31648DvE4;
        EnumC31648DvE enumC31648DvE5 = new EnumC31648DvE("BC_PARTNERSHIP", 4, "bc_partnership");
        A03 = enumC31648DvE5;
        EnumC31648DvE enumC31648DvE6 = new EnumC31648DvE("PRIMARY", 5, "primary");
        A0A = enumC31648DvE6;
        EnumC31648DvE enumC31648DvE7 = new EnumC31648DvE("GENERAL", 6, "general");
        A04 = enumC31648DvE7;
        EnumC31648DvE enumC31648DvE8 = new EnumC31648DvE("TOP_THREADS", 7, "top_threads");
        A0C = enumC31648DvE8;
        EnumC31648DvE enumC31648DvE9 = new EnumC31648DvE("PENDING_STORY_REPLIES", 8, "pending_story_replies");
        A09 = enumC31648DvE9;
        EnumC31648DvE enumC31648DvE10 = new EnumC31648DvE("HIDDEN_WORDS", 9, "hidden_words");
        A05 = enumC31648DvE10;
        EnumC31648DvE[] enumC31648DvEArr = {enumC31648DvE, enumC31648DvE2, enumC31648DvE3, enumC31648DvE4, enumC31648DvE5, enumC31648DvE6, enumC31648DvE7, enumC31648DvE8, enumC31648DvE9, enumC31648DvE10};
        A02 = enumC31648DvEArr;
        A01 = AbstractC12190kN.A00(enumC31648DvEArr);
    }

    public static EnumC31648DvE valueOf(String str) {
        return (EnumC31648DvE) Enum.valueOf(EnumC31648DvE.class, str);
    }

    public static EnumC31648DvE[] values() {
        return (EnumC31648DvE[]) A02.clone();
    }

    public EnumC31648DvE(String str, int i, String str2) {
        this.A00 = str2;
    }
}
