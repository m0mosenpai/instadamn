package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39587Hdx {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39587Hdx[] A03;
    public static final EnumC39587Hdx A04;
    public static final EnumC39587Hdx A05;
    public static final EnumC39587Hdx A06;
    public static final EnumC39587Hdx A07;
    public static final EnumC39587Hdx A08;
    public static final EnumC39587Hdx A09;
    public static final EnumC39587Hdx A0A;
    public static final EnumC39587Hdx A0B;
    public static final EnumC39587Hdx A0C;
    public static final EnumC39587Hdx A0D;
    public static final EnumC39587Hdx A0E;
    public static final EnumC39587Hdx A0F;
    public static final EnumC39587Hdx A0G;
    public static final EnumC39587Hdx A0H;
    public static final EnumC39587Hdx A0I;
    public static final EnumC39587Hdx A0J;
    public static final EnumC39587Hdx A0K;
    public static final EnumC39587Hdx A0L;
    public static final EnumC39587Hdx A0M;
    public static final EnumC39587Hdx A0N;
    public static final EnumC39587Hdx A0O;
    public static final EnumC39587Hdx A0P;
    public final String A00;

    static {
        EnumC39587Hdx enumC39587Hdx = new EnumC39587Hdx("ADS", 0, "ads");
        A04 = enumC39587Hdx;
        EnumC39587Hdx enumC39587Hdx2 = new EnumC39587Hdx("FOLLOWING", 1, "following");
        A08 = enumC39587Hdx2;
        EnumC39587Hdx enumC39587Hdx3 = new EnumC39587Hdx("EXPLORE", 2, "explore");
        A07 = enumC39587Hdx3;
        EnumC39587Hdx enumC39587Hdx4 = new EnumC39587Hdx("POPULAR", 3, "popular");
        A0C = enumC39587Hdx4;
        EnumC39587Hdx enumC39587Hdx5 = new EnumC39587Hdx("USER", 4, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        A0L = enumC39587Hdx5;
        EnumC39587Hdx enumC39587Hdx6 = new EnumC39587Hdx("USER_VIDEO", 5, "uservideo");
        A0O = enumC39587Hdx6;
        EnumC39587Hdx enumC39587Hdx7 = new EnumC39587Hdx("USER_MOST_VIEWED", 6, "usermostviewed");
        A0M = enumC39587Hdx7;
        EnumC39587Hdx enumC39587Hdx8 = new EnumC39587Hdx("USER_POST_LIVES_ONLY", 7, "userpostlives");
        A0N = enumC39587Hdx8;
        EnumC39587Hdx enumC39587Hdx9 = new EnumC39587Hdx("SINGLE_MEDIA", 8, "single_media");
        A0I = enumC39587Hdx9;
        EnumC39587Hdx enumC39587Hdx10 = new EnumC39587Hdx("CHAINING", 9, "chaining");
        A05 = enumC39587Hdx10;
        EnumC39587Hdx enumC39587Hdx11 = new EnumC39587Hdx("SEARCH_MEDIA_CHAINING", 10, "searchmediachaining");
        A0F = enumC39587Hdx11;
        EnumC39587Hdx enumC39587Hdx12 = new EnumC39587Hdx("SERIES", 11, "series");
        A0G = enumC39587Hdx12;
        EnumC39587Hdx enumC39587Hdx13 = new EnumC39587Hdx("EMPTY_PLACEHOLDER", 12, "empty_placeholder");
        A06 = enumC39587Hdx13;
        EnumC39587Hdx enumC39587Hdx14 = new EnumC39587Hdx("HASHTAG", 13, "hashtag");
        A09 = enumC39587Hdx14;
        EnumC39587Hdx enumC39587Hdx15 = new EnumC39587Hdx("SAVED", 14, "saved");
        A0E = enumC39587Hdx15;
        EnumC39587Hdx enumC39587Hdx16 = new EnumC39587Hdx("SHOPPING", 15, "shopping");
        A0H = enumC39587Hdx16;
        EnumC39587Hdx enumC39587Hdx17 = new EnumC39587Hdx("TOPIC", 16, "topical");
        A0J = enumC39587Hdx17;
        EnumC39587Hdx enumC39587Hdx18 = new EnumC39587Hdx("WATCHED", 17, "continue_watching");
        A0P = enumC39587Hdx18;
        EnumC39587Hdx enumC39587Hdx19 = new EnumC39587Hdx("LIVE", 18, "live");
        A0A = enumC39587Hdx19;
        EnumC39587Hdx enumC39587Hdx20 = new EnumC39587Hdx("POST_LIVE", 19, "post_live");
        A0D = enumC39587Hdx20;
        EnumC39587Hdx enumC39587Hdx21 = new EnumC39587Hdx(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 20, NetInfoModule.CONNECTION_TYPE_NONE);
        A0B = enumC39587Hdx21;
        EnumC39587Hdx enumC39587Hdx22 = new EnumC39587Hdx("UNRECOGNIZED", 21, "unrecognized");
        A0K = enumC39587Hdx22;
        EnumC39587Hdx[] enumC39587HdxArr = {enumC39587Hdx, enumC39587Hdx2, enumC39587Hdx3, enumC39587Hdx4, enumC39587Hdx5, enumC39587Hdx6, enumC39587Hdx7, enumC39587Hdx8, enumC39587Hdx9, enumC39587Hdx10, enumC39587Hdx11, enumC39587Hdx12, enumC39587Hdx13, enumC39587Hdx14, enumC39587Hdx15, enumC39587Hdx16, enumC39587Hdx17, enumC39587Hdx18, enumC39587Hdx19, enumC39587Hdx20, enumC39587Hdx21, enumC39587Hdx22};
        A03 = enumC39587HdxArr;
        A02 = AbstractC12190kN.A00(enumC39587HdxArr);
        EnumC39587Hdx[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (EnumC39587Hdx enumC39587Hdx23 : values) {
            A18.put(enumC39587Hdx23.A00, enumC39587Hdx23);
        }
        A01 = A18;
    }

    public static EnumC39587Hdx valueOf(String str) {
        return (EnumC39587Hdx) Enum.valueOf(EnumC39587Hdx.class, str);
    }

    public static EnumC39587Hdx[] values() {
        return (EnumC39587Hdx[]) A03.clone();
    }

    public EnumC39587Hdx(String str, int i, String str2) {
        this.A00 = str2;
    }
}
