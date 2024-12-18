package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53242Ngf {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53242Ngf[] A03;
    public static final EnumC53242Ngf A04;
    public static final EnumC53242Ngf A05;
    public static final EnumC53242Ngf A06;
    public static final EnumC53242Ngf A07;
    public static final EnumC53242Ngf A08;
    public static final EnumC53242Ngf A09;
    public static final EnumC53242Ngf A0A;
    public static final EnumC53242Ngf A0B;
    public static final EnumC53242Ngf A0C;
    public static final EnumC53242Ngf A0D;
    public static final EnumC53242Ngf A0E;
    public static final EnumC53242Ngf A0F;
    public final String A00;

    static {
        EnumC53242Ngf enumC53242Ngf = new EnumC53242Ngf("USER", 0, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        A0F = enumC53242Ngf;
        EnumC53242Ngf enumC53242Ngf2 = new EnumC53242Ngf("LIKE_COUNT_CHRONO", 1, "like_count_chrono");
        A08 = enumC53242Ngf2;
        EnumC53242Ngf enumC53242Ngf3 = new EnumC53242Ngf("FOLLOW_COUNT_CHRONO", 2, "follow_count_chrono");
        A06 = enumC53242Ngf3;
        EnumC53242Ngf enumC53242Ngf4 = new EnumC53242Ngf("COMMENT_LIKE_COUNT_CHRONO", 3, "comment_like_count_chrono");
        A05 = enumC53242Ngf4;
        EnumC53242Ngf enumC53242Ngf5 = new EnumC53242Ngf("COMMENT_COUNT", 4, "comment_count");
        A04 = enumC53242Ngf5;
        EnumC53242Ngf enumC53242Ngf6 = new EnumC53242Ngf("LOCATION", 5, "location");
        A09 = enumC53242Ngf6;
        EnumC53242Ngf enumC53242Ngf7 = new EnumC53242Ngf("PHOTOMAP", 6, "photomap");
        A0B = enumC53242Ngf7;
        EnumC53242Ngf enumC53242Ngf8 = new EnumC53242Ngf("HASHTAG", 7, "hashtag");
        A07 = enumC53242Ngf8;
        EnumC53242Ngf enumC53242Ngf9 = new EnumC53242Ngf("TAG", 8, "tag");
        A0E = enumC53242Ngf9;
        EnumC53242Ngf enumC53242Ngf10 = new EnumC53242Ngf("MENTION", 9, "mention");
        A0A = enumC53242Ngf10;
        EnumC53242Ngf enumC53242Ngf11 = new EnumC53242Ngf("STORY_VIEWER_LIST", 10, "story_viewer_list");
        A0D = enumC53242Ngf11;
        EnumC53242Ngf enumC53242Ngf12 = new EnumC53242Ngf("PROFILE_IMAGE_DESTINATION", 11, "profile_image_destination");
        A0C = enumC53242Ngf12;
        EnumC53242Ngf[] enumC53242NgfArr = {enumC53242Ngf, enumC53242Ngf2, enumC53242Ngf3, enumC53242Ngf4, enumC53242Ngf5, enumC53242Ngf6, enumC53242Ngf7, enumC53242Ngf8, enumC53242Ngf9, enumC53242Ngf10, enumC53242Ngf11, enumC53242Ngf12, new EnumC53242Ngf("DESTINATION", 12, "destination")};
        A03 = enumC53242NgfArr;
        A02 = AbstractC12190kN.A00(enumC53242NgfArr);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        for (EnumC53242Ngf enumC53242Ngf13 : values()) {
            A1I.put(enumC53242Ngf13.A00, enumC53242Ngf13);
        }
        A01 = A1I;
    }

    public static EnumC53242Ngf valueOf(String str) {
        return (EnumC53242Ngf) Enum.valueOf(EnumC53242Ngf.class, str);
    }

    public static EnumC53242Ngf[] values() {
        return (EnumC53242Ngf[]) A03.clone();
    }

    public EnumC53242Ngf(String str, int i, String str2) {
        this.A00 = str2;
    }
}
