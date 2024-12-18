package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5NP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5NP {
    public static final Map A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ C5NP[] A04;
    public static final C5NP A05;
    public static final C5NP A06;
    public static final C5NP A07;
    public static final C5NP A08;
    public static final C5NP A09;
    public final int A00;
    public final String A01;

    static {
        C5NP c5np = new C5NP(0, 1, "IMAGE", "not_animated");
        A07 = c5np;
        C5NP c5np2 = new C5NP(1, 1, "GIF", "animated");
        A06 = c5np2;
        C5NP c5np3 = new C5NP(2, 1, "STICKER", "sticker");
        A08 = c5np3;
        C5NP c5np4 = new C5NP(3, 1, "CUTOUT_VIDEO", "cutout_video");
        A05 = c5np4;
        C5NP c5np5 = new C5NP(4, 0, "VIDEO", MediaStreamTrack.VIDEO_TRACK_KIND);
        A09 = c5np5;
        C5NP[] c5npArr = {c5np, c5np2, c5np3, c5np4, c5np5};
        A04 = c5npArr;
        A03 = AbstractC12190kN.A00(c5npArr);
        C5NP[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (C5NP c5np6 : values) {
            linkedHashMap.put(c5np6.A01, c5np6);
        }
        A02 = linkedHashMap;
    }

    public static C5NP valueOf(String str) {
        return (C5NP) Enum.valueOf(C5NP.class, str);
    }

    public static C5NP[] values() {
        return (C5NP[]) A04.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A01;
    }

    public C5NP(int i, int i2, String str, String str2) {
        this.A01 = str2;
        this.A00 = i2;
    }
}
