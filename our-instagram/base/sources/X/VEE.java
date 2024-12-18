package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEE {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VEE[] A03;
    public static final VEE A04;
    public static final VEE A05;
    public static final VEE A06;
    public static final VEE A07;
    public static final VEE A08;
    public static final VEE A09;
    public static final VEE A0A;
    public static final VEE A0B;
    public static final VEE A0C;
    public static final VEE A0D;
    public static final VEE A0E;
    public static final VEE A0F;
    public static final VEE A0G;
    public static final VEE A0H;
    public static final VEE A0I;
    public static final VEE A0J;
    public static final VEE A0K;
    public static final VEE A0L;
    public static final VEE A0M;
    public static final VEE A0N;
    public static final VEE A0O;
    public static final VEE A0P;
    public static final VEE A0Q;
    public static final VEE A0R;
    public final String A00;

    public static VEE valueOf(String str) {
        return (VEE) Enum.valueOf(VEE.class, str);
    }

    public static VEE[] values() {
        return (VEE[]) A03.clone();
    }

    static {
        VEE vee = new VEE("CUSTOM_UNDERLINE", 0, "custom_underline");
        A04 = vee;
        VEE vee2 = new VEE("GRADIENT_UNDERLINE", 1, "gradient_underline");
        A05 = vee2;
        VEE vee3 = new VEE("ROUNDED_CORNER_BACKGROUND", 2, "rounded_corner_background");
        A06 = vee3;
        VEE vee4 = new VEE("STORY_MENTION", 3, "story_mention");
        A08 = vee4;
        VEE vee5 = new VEE("STORY_HASHTAG", 4, "story_hashtag");
        A07 = vee5;
        VEE vee6 = new VEE("TEXT_CASE", 5, "text_case");
        A09 = vee6;
        VEE vee7 = new VEE("TEXT_COLOR", 6, "text_color");
        A0A = vee7;
        VEE vee8 = new VEE("TEXT_EMPHASIS_COORDINATOR", 7, "text_emphasis_coordinator");
        A0B = vee8;
        VEE vee9 = new VEE("TEXT_EMPHASIS_DIRECTIONAL", 8, "text_emphasis_directional");
        A0C = vee9;
        VEE vee10 = new VEE("TEXT_EMPHASIS_ELEGANT", 9, "text_emphasis_elegant");
        A0D = vee10;
        VEE vee11 = new VEE("TEXT_EMPHASIS_LINE", 10, "text_emphasis_line");
        A0E = vee11;
        VEE vee12 = new VEE("TEXT_EMPHASIS_OUTLINE", 11, "text_emphasis_outline");
        A0J = vee12;
        VEE vee13 = new VEE("TEXT_EMPHASIS_LITERATURE", 12, "text_emphasis_literature");
        A0F = vee13;
        VEE vee14 = new VEE("TEXT_EMPHASIS_MEME", 13, "text_emphasis_meme");
        A0G = vee14;
        VEE vee15 = new VEE("TEXT_EMPHASIS_MODERN", 14, "text_emphasis_modern");
        A0H = vee15;
        VEE vee16 = new VEE("TEXT_EMPHASIS_NEON", 15, "text_emphasis_neon");
        A0I = vee16;
        VEE vee17 = new VEE("TEXT_EMPHASIS_PAINT", 16, "text_emphasis_paint");
        A0K = vee17;
        VEE vee18 = new VEE("TEXT_EMPHASIS_ROUNDED_BACKGROUND", 17, "text_emphasis_rounded_background");
        A0L = vee18;
        VEE vee19 = new VEE("TEXT_EMPHASIS_STRONG", 18, "text_emphasis_strong");
        A0N = vee19;
        VEE vee20 = new VEE("TEXT_EMPHASIS_SIMPLE_BOX", 19, "text_emphasis_simple_box");
        A0M = vee20;
        VEE vee21 = new VEE("TEXT_FONT", 20, "text_font");
        A0O = vee21;
        VEE vee22 = new VEE("TEXT_FORMAT", 21, "text_format");
        A0P = vee22;
        VEE vee23 = new VEE("TEXT_SIZE", 22, "text_size");
        A0Q = vee23;
        VEE vee24 = new VEE("UNKNOWN", 23, "");
        A0R = vee24;
        VEE[] veeArr = {vee, vee2, vee3, vee4, vee5, vee6, vee7, vee8, vee9, vee10, vee11, vee12, vee13, vee14, vee15, vee16, vee17, vee18, vee19, vee20, vee21, vee22, vee23, vee24};
        A03 = veeArr;
        A02 = AbstractC12190kN.A00(veeArr);
        VEE[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(values.length));
        for (VEE vee25 : values) {
            linkedHashMap.put(vee25.A00, vee25);
        }
        A01 = linkedHashMap;
    }

    public VEE(String str, int i, String str2) {
        this.A00 = str2;
    }
}
