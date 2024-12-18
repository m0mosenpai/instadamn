package X;

import java.util.Comparator;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2EB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EB {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C2EB[] A03;
    public static final C2EB A04;
    public static final C2EB A05;
    public static final C2EB A06;
    public static final C2EB A07;
    public static final C2EB A08;
    public static final C2EB A09;
    public static final C2EB A0A;
    public static final C2EB A0B;
    public final String A00;
    public final Comparator A01;

    static {
        Comparator comparator = C2EC.A00;
        C2EB c2eb = new C2EB("DEFAULT", null, comparator, 0);
        A04 = c2eb;
        C2EB c2eb2 = new C2EB("RELEVANT", "relevant", null, 1);
        A0B = c2eb2;
        C2EB c2eb3 = new C2EB("MEDIA_ACTIVITY", "media_activity", C2EC.A01, 2);
        A0A = c2eb3;
        C2EB c2eb4 = new C2EB("FILTERED_ALL", "filtered_all", comparator, 3);
        A05 = c2eb4;
        C2EB c2eb5 = new C2EB("FILTERED_TOP", "filtered_top", comparator, 4);
        A09 = c2eb5;
        C2EB c2eb6 = new C2EB("FILTERED_STORY_REPLIES", "filtered_story_replies", comparator, 5);
        A07 = c2eb6;
        C2EB c2eb7 = new C2EB("FILTERED_ALL_RELEVANT", "filtered_all_relevant", null, 6);
        A06 = c2eb7;
        C2EB c2eb8 = new C2EB("FILTERED_STORY_REPLIES_RELEVANT", "filtered_story_replies_relevant", null, 7);
        A08 = c2eb8;
        C2EB[] c2ebArr = {c2eb, c2eb2, c2eb3, c2eb4, c2eb5, c2eb6, c2eb7, c2eb8};
        A03 = c2ebArr;
        A02 = AbstractC12190kN.A00(c2ebArr);
    }

    public static C2EB valueOf(String str) {
        return (C2EB) Enum.valueOf(C2EB.class, str);
    }

    public static C2EB[] values() {
        return (C2EB[]) A03.clone();
    }

    public C2EB(String str, String str2, Comparator comparator, int i) {
        this.A00 = str2;
        this.A01 = comparator;
    }
}
