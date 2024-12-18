package com.facebook.video.heroplayer.common;

import X.AnonymousClass001;
import X.C4B5;
import X.C4B6;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class MosScoreCalculation {
    public static float A00(C4B6 c4b6, int i, boolean z) {
        C4B5 c4b5 = c4b6.A0N;
        String str = c4b5.A04;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = c4b5.A05;
        if (str3 != null) {
            str2 = str3;
        }
        if (!z || str.isEmpty()) {
            str = str2;
        }
        return A03(A04(str), i);
    }

    public static float A01(String str, int i) {
        if (str != null) {
            float A03 = A03(A04(str), i);
            if (Float.valueOf(A03) != null) {
                return A03;
            }
        }
        return -1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [float] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [float] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float A02(java.lang.String r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.common.MosScoreCalculation.A02(java.lang.String, int, int):float");
    }

    public static TreeMap A04(String str) {
        TreeMap treeMap = new TreeMap();
        try {
            for (String str2 : str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)) {
                String[] split = str2.split(":");
                if (split.length == 2) {
                    treeMap.put(Integer.valueOf(Integer.parseInt(split[0])), Float.valueOf(Float.parseFloat(split[1])));
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0R("Ill formatted string:", str2));
                }
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
            treeMap.clear();
        }
        return treeMap;
    }

    public static float A03(TreeMap treeMap, int i) {
        Object value;
        if (treeMap.isEmpty()) {
            return 0.0f;
        }
        Integer valueOf = Integer.valueOf(i);
        if (treeMap.containsKey(valueOf)) {
            value = treeMap.get(valueOf);
        } else {
            Map.Entry lowerEntry = treeMap.lowerEntry(valueOf);
            Map.Entry higherEntry = treeMap.higherEntry(valueOf);
            if (lowerEntry == null) {
                value = higherEntry.getValue();
            } else if (higherEntry == null) {
                value = lowerEntry.getValue();
            } else {
                return ((Number) higherEntry.getValue()).floatValue() + (((((Number) higherEntry.getKey()).intValue() - i) * (((Number) lowerEntry.getValue()).floatValue() - ((Number) higherEntry.getValue()).floatValue())) / (((Number) higherEntry.getKey()).intValue() - ((Number) lowerEntry.getKey()).intValue()));
            }
        }
        return ((Number) value).floatValue();
    }
}
