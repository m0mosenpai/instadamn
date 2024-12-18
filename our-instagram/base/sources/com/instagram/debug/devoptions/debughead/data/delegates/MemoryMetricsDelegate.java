package com.instagram.debug.devoptions.debughead.data.delegates;

import X.AbstractC12190kN;
import X.AbstractC72463XeB;
import kotlin.enums.EnumEntries;

/* loaded from: classes12.dex */
public interface MemoryMetricsDelegate {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes12.dex */
    public final class MetricType {
        public static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* synthetic */ MetricType[] $VALUES;
        public static final MetricType MEM_INFO = new MetricType("MEM_INFO", 0);

        public static final /* synthetic */ MetricType[] $values() {
            return new MetricType[]{MEM_INFO};
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        static {
            MetricType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC12190kN.A00($values);
        }

        public static MetricType valueOf(String str) {
            return (MetricType) Enum.valueOf(MetricType.class, str);
        }

        public static MetricType[] values() {
            return (MetricType[]) $VALUES.clone();
        }

        public MetricType(String str, int i) {
        }
    }

    void onMemoryMetricsReported(MetricType metricType, AbstractC72463XeB abstractC72463XeB);
}
