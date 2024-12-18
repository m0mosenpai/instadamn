package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6RP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6RP {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C6RP[] A03;
    public static final C6RP A04;
    public static final C6RP A05;
    public static final C6RP A06;
    public static final C6RP A07;
    public static final C6RP A08;
    public final int A00;

    static {
        C6RP c6rp = new C6RP("DOMINANT_COLOR_DOMINANT_TEXT_WITH_SENTENCE_CASE", 0, 0);
        A07 = c6rp;
        C6RP c6rp2 = new C6RP("BLUE_ICON_BLACK_TEXT_WITH_SENTENCE_CASE", 1, 1);
        A04 = c6rp2;
        C6RP c6rp3 = new C6RP("DOMINANT_COLOR_DOMINANT_TEXT_WITH_UPPER_CASE", 2, 2);
        A08 = c6rp3;
        C6RP c6rp4 = new C6RP("DOMINANT_COLOR_BLACK_TEXT_WITH_UPPER_CASE", 3, 3);
        A06 = c6rp4;
        C6RP c6rp5 = new C6RP("DOMINANT_COLOR_BLACK_TEXT_WITH_SENTENCE_CASE", 4, 4);
        A05 = c6rp5;
        C6RP[] c6rpArr = {c6rp, c6rp2, c6rp3, c6rp4, c6rp5};
        A03 = c6rpArr;
        A02 = AbstractC12190kN.A00(c6rpArr);
        C6RP[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (C6RP c6rp6 : values) {
            linkedHashMap.put(Integer.valueOf(c6rp6.A00), c6rp6);
        }
        A01 = linkedHashMap;
    }

    public static C6RP valueOf(String str) {
        return (C6RP) Enum.valueOf(C6RP.class, str);
    }

    public static C6RP[] values() {
        return (C6RP[]) A03.clone();
    }

    public C6RP(String str, int i, int i2) {
        this.A00 = i2;
    }
}
