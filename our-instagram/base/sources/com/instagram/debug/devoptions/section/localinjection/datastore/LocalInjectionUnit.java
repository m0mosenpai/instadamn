package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C14360o3;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class LocalInjectionUnit implements Comparable {
    public final String filePath;
    public final InjectionUnitType injectionUnitType;
    public boolean isSelected;
    public final String unitId;
    public final String unitName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes11.dex */
    public final class InjectionUnitType {
        public static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* synthetic */ InjectionUnitType[] $VALUES;
        public static final InjectionUnitType STORIES_ADS = new InjectionUnitType("STORIES_ADS", 0);
        public static final InjectionUnitType STORIES_NETEGO = new InjectionUnitType("STORIES_NETEGO", 1);
        public static final InjectionUnitType FEED_ADS = new InjectionUnitType("FEED_ADS", 2);
        public static final InjectionUnitType FEED_NETEGO = new InjectionUnitType("FEED_NETEGO", 3);
        public static final InjectionUnitType REELS_ADS = new InjectionUnitType("REELS_ADS", 4);
        public static final InjectionUnitType REELS_ORGANIC = new InjectionUnitType("REELS_ORGANIC", 5);
        public static final InjectionUnitType THREADS_ADS = new InjectionUnitType("THREADS_ADS", 6);

        public static final /* synthetic */ InjectionUnitType[] $values() {
            return new InjectionUnitType[]{STORIES_ADS, STORIES_NETEGO, FEED_ADS, FEED_NETEGO, REELS_ADS, REELS_ORGANIC, THREADS_ADS};
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        static {
            InjectionUnitType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC12190kN.A00($values);
        }

        public static InjectionUnitType valueOf(String str) {
            return (InjectionUnitType) Enum.valueOf(InjectionUnitType.class, str);
        }

        public static InjectionUnitType[] values() {
            return (InjectionUnitType[]) $VALUES.clone();
        }

        public InjectionUnitType(String str, int i) {
        }
    }

    /* loaded from: classes11.dex */
    public final class Item {
        public final String filename;
        public final String id;
        public final String name;

        public final String getFilename() {
            return this.filename;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public Item(String str, String str2, String str3) {
            AbstractC167017dG.A1P(str, str2);
            this.name = str;
            this.filename = str2;
            this.id = str3;
        }

        public /* synthetic */ Item(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }
    }

    public LocalInjectionUnit(String str, String str2, String str3, InjectionUnitType injectionUnitType) {
        AbstractC167027dH.A0a(1, str, str2, str3, injectionUnitType);
        this.unitId = str;
        this.filePath = str2;
        this.unitName = str3;
        this.injectionUnitType = injectionUnitType;
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalInjectionUnit localInjectionUnit) {
        C14360o3.A0B(localInjectionUnit, 0);
        int m = LocalInjectionUnit$$ExternalSyntheticBackport0.m(localInjectionUnit.isSelected, this.isSelected);
        if (m == 0) {
            return this.unitName.compareTo(localInjectionUnit.unitName);
        }
        return m;
    }

    public boolean equals(Object obj) {
        if (obj == null || !AbstractC167017dG.A1Z(obj, this)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        LocalInjectionUnit localInjectionUnit = (LocalInjectionUnit) obj;
        return C14360o3.A0K(localInjectionUnit.unitId, this.unitId) && C14360o3.A0K(localInjectionUnit.filePath, this.filePath) && C14360o3.A0K(localInjectionUnit.unitName, this.unitName) && localInjectionUnit.injectionUnitType == this.injectionUnitType;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getUnitId() {
        return this.unitId;
    }

    public final String getUnitName() {
        return this.unitName;
    }

    public int hashCode() {
        return this.unitId.hashCode() * this.filePath.hashCode() * this.unitName.hashCode() * this.injectionUnitType.hashCode();
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        return this.unitName;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
