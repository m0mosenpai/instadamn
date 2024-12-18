package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33396EpT {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33396EpT[] A02;
    public static final EnumC33396EpT A03;
    public static final EnumC33396EpT A04;
    public static final EnumC33396EpT A05;
    public static final EnumC33396EpT A06;
    public static final EnumC33396EpT A07;
    public static final EnumC33396EpT A08;
    public final long A00;

    static {
        EnumC33396EpT enumC33396EpT = new EnumC33396EpT("HScrollProfilePicture", 0, 0L);
        A05 = enumC33396EpT;
        EnumC33396EpT enumC33396EpT2 = new EnumC33396EpT("HScrollIcon", 1, 1L);
        A03 = enumC33396EpT2;
        EnumC33396EpT enumC33396EpT3 = new EnumC33396EpT("HScrollMediaPreview", 2, 2L);
        A04 = enumC33396EpT3;
        EnumC33396EpT enumC33396EpT4 = new EnumC33396EpT("RecipientListProfilePicture", 3, 3L);
        A08 = enumC33396EpT4;
        EnumC33396EpT enumC33396EpT5 = new EnumC33396EpT("RecipientListBubbleOnly", 4, 4L);
        A06 = enumC33396EpT5;
        EnumC33396EpT enumC33396EpT6 = new EnumC33396EpT("RecipientListMediaPreviewOnly", 5, 5L);
        A07 = enumC33396EpT6;
        EnumC33396EpT[] enumC33396EpTArr = {enumC33396EpT, enumC33396EpT2, enumC33396EpT3, enumC33396EpT4, enumC33396EpT5, enumC33396EpT6};
        A02 = enumC33396EpTArr;
        A01 = AbstractC12190kN.A00(enumC33396EpTArr);
    }

    public static EnumC33396EpT valueOf(String str) {
        return (EnumC33396EpT) Enum.valueOf(EnumC33396EpT.class, str);
    }

    public static EnumC33396EpT[] values() {
        return (EnumC33396EpT[]) A02.clone();
    }

    public EnumC33396EpT(String str, int i, long j) {
        this.A00 = j;
    }
}
