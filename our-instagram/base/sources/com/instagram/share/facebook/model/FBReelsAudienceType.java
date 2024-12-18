package com.instagram.share.facebook.model;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.EnumC53316Nhs;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class FBReelsAudienceType {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FBReelsAudienceType[] A03;
    public static final FBReelsAudienceType A04;
    public static final FBReelsAudienceType A05;
    public static final FBReelsAudienceType A06;
    public static final FBReelsAudienceType A07;
    public static final FBReelsAudienceType A08;
    public final EnumC53316Nhs A00;

    static {
        FBReelsAudienceType fBReelsAudienceType = new FBReelsAudienceType(null, "NOT_VALID", 0);
        A07 = fBReelsAudienceType;
        FBReelsAudienceType fBReelsAudienceType2 = new FBReelsAudienceType(EnumC53316Nhs.PUBLIC, "PUBLIC", 1);
        A08 = fBReelsAudienceType2;
        FBReelsAudienceType fBReelsAudienceType3 = new FBReelsAudienceType(EnumC53316Nhs.FRIENDS, "FRIENDS", 2);
        A04 = fBReelsAudienceType3;
        FBReelsAudienceType fBReelsAudienceType4 = new FBReelsAudienceType(EnumC53316Nhs.FRIENDS_EXCEPT, "FRIENDS_EXCEPT", 3);
        A05 = fBReelsAudienceType4;
        FBReelsAudienceType fBReelsAudienceType5 = new FBReelsAudienceType(EnumC53316Nhs.FRIENDS_OF_FRIENDS, "FRIENDS_OF_FRIENDS", 4);
        A06 = fBReelsAudienceType5;
        FBReelsAudienceType[] fBReelsAudienceTypeArr = {fBReelsAudienceType, fBReelsAudienceType2, fBReelsAudienceType3, fBReelsAudienceType4, fBReelsAudienceType5, new FBReelsAudienceType(EnumC53316Nhs.ONLY_ME, "ONLY_ME", 5)};
        A03 = fBReelsAudienceTypeArr;
        A02 = AbstractC12190kN.A00(fBReelsAudienceTypeArr);
        FBReelsAudienceType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (FBReelsAudienceType fBReelsAudienceType6 : values) {
            A18.put(fBReelsAudienceType6.A00, fBReelsAudienceType6);
        }
        A01 = A18;
    }

    public static FBReelsAudienceType valueOf(String str) {
        return (FBReelsAudienceType) Enum.valueOf(FBReelsAudienceType.class, str);
    }

    public static FBReelsAudienceType[] values() {
        return (FBReelsAudienceType[]) A03.clone();
    }

    public FBReelsAudienceType(EnumC53316Nhs enumC53316Nhs, String str, int i) {
        this.A00 = enumC53316Nhs;
    }
}
