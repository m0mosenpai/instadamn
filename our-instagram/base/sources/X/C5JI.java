package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5JI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5JI {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C5JI[] A03;
    public static final C5JI A04;
    public static final C5JI A05;
    public static final C5JI A06;
    public static final C5JI A07;
    public static final C5JI A08;
    public static final C5JI A09;
    public static final C5JI A0A;
    public final String A00;

    public static C5JI valueOf(String str) {
        return (C5JI) Enum.valueOf(C5JI.class, str);
    }

    public static C5JI[] values() {
        return (C5JI[]) A03.clone();
    }

    static {
        C5JI c5ji = new C5JI("ORIGINAL", 0, "original");
        A05 = c5ji;
        C5JI c5ji2 = new C5JI("AUDIO_TRACK", 1, "audio_track");
        A04 = c5ji2;
        C5JI c5ji3 = new C5JI("VOICEOVER", 2, "voiceover");
        A0A = c5ji3;
        C5JI c5ji4 = new C5JI("VIDEO_STICKER", 3, "video_sticker");
        A09 = c5ji4;
        C5JI c5ji5 = new C5JI("TEXT_TO_SPEECH", 4, "text_to_speech");
        A07 = c5ji5;
        C5JI c5ji6 = new C5JI("SOUND_EFFECTS", 5, "sound_effects");
        A06 = c5ji6;
        C5JI c5ji7 = new C5JI("UNKNOWN", 6, "unknown");
        A08 = c5ji7;
        C5JI[] c5jiArr = {c5ji, c5ji2, c5ji3, c5ji4, c5ji5, c5ji6, c5ji7};
        A03 = c5jiArr;
        A02 = AbstractC12190kN.A00(c5jiArr);
        C5JI[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (C5JI c5ji8 : values) {
            linkedHashMap.put(c5ji8.A00, c5ji8);
        }
        A01 = linkedHashMap;
    }

    public C5JI(String str, int i, String str2) {
        this.A00 = str2;
    }
}
