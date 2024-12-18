package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53178Nfa {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53178Nfa[] A01;
    public static final EnumC53178Nfa A02;
    public static final EnumC53178Nfa A03;
    public static final EnumC53178Nfa A04;
    public static final EnumC53178Nfa A05;
    public static final EnumC53178Nfa A06;
    public static final EnumC53178Nfa A07;
    public static final EnumC53178Nfa A08;

    static {
        EnumC53178Nfa enumC53178Nfa = new EnumC53178Nfa("COMMENT_DELETE_UPSELL_TYPE_NONE", 0);
        A08 = enumC53178Nfa;
        EnumC53178Nfa enumC53178Nfa2 = new EnumC53178Nfa("COMMENT_DELETE_UPSELL_TYPE_HMC", 1);
        A06 = enumC53178Nfa2;
        EnumC53178Nfa enumC53178Nfa3 = new EnumC53178Nfa("COMMENT_DELETE_UPSELL_TYPE_BLOCK", 2);
        A02 = enumC53178Nfa3;
        EnumC53178Nfa enumC53178Nfa4 = new EnumC53178Nfa("COMMENT_DELETE_UPSELL_TYPE_HIDDEN_WORDS", 3);
        A04 = enumC53178Nfa4;
        EnumC53178Nfa enumC53178Nfa5 = new EnumC53178Nfa("COMMENT_DELETE_UPSELL_TYPE_HIDDEN_WORDS_V2", 4);
        A05 = enumC53178Nfa5;
        EnumC53178Nfa enumC53178Nfa6 = new EnumC53178Nfa("COMMENT_DELETE_UPSELL_TYPE_BLOCK_COMMENTS_FROM", 5);
        A03 = enumC53178Nfa6;
        EnumC53178Nfa enumC53178Nfa7 = new EnumC53178Nfa("COMMENT_DELETE_UPSELL_TYPE_HRT_BLOCK_COMMENTS_FROM", 6);
        A07 = enumC53178Nfa7;
        EnumC53178Nfa[] enumC53178NfaArr = {enumC53178Nfa, enumC53178Nfa2, enumC53178Nfa3, enumC53178Nfa4, enumC53178Nfa5, enumC53178Nfa6, enumC53178Nfa7};
        A01 = enumC53178NfaArr;
        A00 = AbstractC12190kN.A00(enumC53178NfaArr);
    }

    public static EnumC53178Nfa valueOf(String str) {
        return (EnumC53178Nfa) Enum.valueOf(EnumC53178Nfa.class, str);
    }

    public static EnumC53178Nfa[] values() {
        return (EnumC53178Nfa[]) A01.clone();
    }

    public EnumC53178Nfa(String str, int i) {
    }
}
