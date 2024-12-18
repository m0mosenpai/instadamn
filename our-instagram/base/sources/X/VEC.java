package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEC {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VEC[] A03;
    public static final VEC A04;
    public static final VEC A05;
    public static final VEC A06;
    public static final VEC A07;
    public static final VEC A08;
    public static final VEC A09;
    public static final VEC A0A;
    public static final VEC A0B;
    public static final VEC A0C;
    public static final VEC A0D;
    public static final VEC A0E;
    public static final VEC A0F;
    public static final VEC A0G;
    public static final VEC A0H;
    public final String A00;

    public static VEC valueOf(String str) {
        return (VEC) Enum.valueOf(VEC.class, str);
    }

    public static VEC[] values() {
        return (VEC[]) A03.clone();
    }

    static {
        VEC vec = new VEC("DEFAULT", 0, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A05 = vec;
        VEC vec2 = new VEC("SPEAKEASY", 1, "speakeasy");
        A0E = vec2;
        VEC vec3 = new VEC("BEFORE_AND_AFTER", 2, "before_and_after");
        A04 = vec3;
        VEC vec4 = new VEC("TOP_THREE", 3, "top_three");
        A0G = vec4;
        VEC vec5 = new VEC("STORY_TEMPLATE", 4, "story_template");
        A0F = vec5;
        VEC vec6 = new VEC("MAGIC_MOD_RESTYLE", 5, "magic_mod_restyle");
        A0C = vec6;
        VEC vec7 = new VEC("MAGIC_MOD_BRUSH", 6, "magic_mod_brush");
        A0B = vec7;
        VEC vec8 = new VEC("MAGIC_MOD_BACKDROP", 7, "magic_mod_backdrop");
        A09 = vec8;
        VEC vec9 = new VEC("MAGIC_MOD_BACKDROP_TOPIC", 8, "magic_mod_backdrop_topic");
        A0A = vec9;
        VEC vec10 = new VEC("GENAI_IMAGINE_ME", 9, "genai_imagine_me");
        A08 = vec10;
        VEC vec11 = new VEC("GENAI_IMAGINE", 10, "genai_imagine");
        A07 = vec11;
        VEC vec12 = new VEC("ELECTION", 11, "election");
        A06 = vec12;
        VEC vec13 = new VEC("MUSIC_PICK", 12, "music_pick");
        A0D = vec13;
        VEC vec14 = new VEC("UNKNOWN", 13, "unknown");
        A0H = vec14;
        VEC[] vecArr = {vec, vec2, vec3, vec4, vec5, vec6, vec7, vec8, vec9, vec10, vec11, vec12, vec13, vec14};
        A03 = vecArr;
        A02 = AbstractC12190kN.A00(vecArr);
        VEC[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VEC vec15 : values) {
            linkedHashMap.put(vec15.A00, vec15);
        }
        A01 = linkedHashMap;
    }

    public VEC(String str, int i, String str2) {
        this.A00 = str2;
    }
}
