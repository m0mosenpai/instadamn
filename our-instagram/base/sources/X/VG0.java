package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VG0 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VG0[] A03;
    public static final VG0 A04;
    public static final VG0 A05;
    public static final VG0 A06;
    public static final VG0 A07;
    public static final VG0 A08;
    public static final VG0 A09;
    public static final VG0 A0A;
    public static final VG0 A0B;
    public static final VG0 A0C;
    public static final VG0 A0D;
    public static final VG0 A0E;
    public static final VG0 A0F;
    public static final VG0 A0G;
    public static final VG0 A0H;
    public static final VG0 A0I;
    public static final VG0 A0J;
    public static final VG0 A0K;
    public static final VG0 A0L;
    public static final VG0 A0M;
    public static final VG0 A0N;
    public final String A00;

    static {
        VG0 vg0 = new VG0("UNSTYLED", 0, "UNSTYLED");
        A0N = vg0;
        VG0 vg02 = new VG0("PARAGRAPH", 1, "PARAGRAPH");
        A0H = vg02;
        VG0 vg03 = new VG0("UNORDERED_LIST_ITEM", 2, "UNORDERED_LIST_ITEM");
        A0M = vg03;
        VG0 vg04 = new VG0("ORDERED_LIST_ITEM", 3, "ORDERED_LIST_ITEM");
        A0G = vg04;
        VG0 vg05 = new VG0("BLOCKQUOTE", 4, "BLOCKQUOTE");
        A04 = vg05;
        VG0 vg06 = new VG0("HEADER_ONE", 5, "HEADER_ONE");
        A09 = vg06;
        VG0 vg07 = new VG0("HEADER_TWO", 6, "HEADER_TWO");
        A0C = vg07;
        VG0 vg08 = new VG0("HEADER_THREE", 7, "HEADER_THREE");
        A0B = vg08;
        VG0 vg09 = new VG0("HEADER_FOUR", 8, "HEADER_FOUR");
        A08 = vg09;
        VG0 vg010 = new VG0("HEADER_FIVE", 9, "HEADER_FIVE");
        A07 = vg010;
        VG0 vg011 = new VG0("HEADER_SIX", 10, "HEADER_SIX");
        A0A = vg011;
        VG0 vg012 = new VG0("CODE", 11, "CODE");
        A06 = vg012;
        VG0 vg013 = new VG0("MEDIA", 12, "MEDIA");
        A0E = vg013;
        VG0 vg014 = new VG0("PULLQUOTE", 13, "PULLQUOTE");
        A0I = vg014;
        VG0 vg015 = new VG0("CHECKBOX_LIST_ITEM", 14, "CHECKBOX_LIST_ITEM");
        A05 = vg015;
        VG0 vg016 = new VG0("TABLE", 15, "TABLE");
        A0K = vg016;
        VG0 vg017 = new VG0("THEMATIC_BREAK", 16, "THEMATIC_BREAK");
        A0L = vg017;
        VG0 vg018 = new VG0("LINK", 17, "LINK");
        A0D = vg018;
        VG0 vg019 = new VG0("SUBTITLE", 18, "SUBTITLE");
        A0J = vg019;
        VG0 vg020 = new VG0(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 19, NetInfoModule.CONNECTION_TYPE_NONE);
        A0F = vg020;
        VG0[] vg0Arr = {vg0, vg02, vg03, vg04, vg05, vg06, vg07, vg08, vg09, vg010, vg011, vg012, vg013, vg014, vg015, vg016, vg017, vg018, vg019, vg020};
        A03 = vg0Arr;
        A02 = AbstractC12190kN.A00(vg0Arr);
        A01 = new HashMap();
        for (VG0 vg021 : values()) {
            A01.put(vg021.A00, vg021);
        }
    }

    public static VG0 valueOf(String str) {
        return (VG0) Enum.valueOf(VG0.class, str);
    }

    public static VG0[] values() {
        return (VG0[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public VG0(String str, int i, String str2) {
        this.A00 = str2;
    }
}
