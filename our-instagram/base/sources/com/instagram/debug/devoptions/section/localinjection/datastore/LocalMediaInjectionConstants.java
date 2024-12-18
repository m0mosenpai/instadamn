package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.AbstractC06950Ym;
import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.C14360o3;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class LocalMediaInjectionConstants {
    public static final String CONTENT_TYPE_KEY = "content_type_key";
    public static final String ID_REELS_CAROUSEL_WITH_MUSIC = "clips_mixed_media_carousel_with_music";
    public static final String ID_REELS_PHOTO = "clips_mixed_media_photo";
    public static final String ID_REELS_PHOTO_CAROUSEL = "clips_mixed_media_photo_carousel";
    public static final String ID_REELS_PHOTO_WITH_MUSIC = "clips_mixed_media_photo_with_music";
    public static final String ID_REELS_UNAVAILABLE = "clips_unavailable";
    public static final String ID_REELS_VIDEO_AND_PHOTO_CAROUSEL = "clips_mixed_media_video_and_photo_carousel";
    public static final String ID_REELS_VIDEO_CAROUSEL = "clips_mixed_media_video_carousel";
    public static final LocalMediaInjectionConstants INSTANCE = new Object();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes8.dex */
    public final class InjectionContentType {
        public static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* synthetic */ InjectionContentType[] $VALUES;
        public static final Companion Companion;
        public static final Map reverseMap;
        public final String value;
        public static final InjectionContentType FEED_ADS = new InjectionContentType("FEED_ADS", 0, "Feed Ads");
        public static final InjectionContentType FEED_NETEGO = new InjectionContentType("FEED_NETEGO", 1, "Feed Netego");
        public static final InjectionContentType STORIES_ADS = new InjectionContentType("STORIES_ADS", 2, "Stories Ads");
        public static final InjectionContentType STORIES_NETEGO = new InjectionContentType("STORIES_NETEGO", 3, "Stories Netego");
        public static final InjectionContentType REELS_ADS = new InjectionContentType("REELS_ADS", 4, "Reels Ads");
        public static final InjectionContentType REELS_ORGANIC = new InjectionContentType("REELS_ORGANIC", 5, "Organic Reels");
        public static final InjectionContentType THREADS_ADS = new InjectionContentType("THREADS_ADS", 6, "Threads Ads");

        public static final /* synthetic */ InjectionContentType[] $values() {
            return new InjectionContentType[]{FEED_ADS, FEED_NETEGO, STORIES_ADS, STORIES_NETEGO, REELS_ADS, REELS_ORGANIC, THREADS_ADS};
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType$Companion] */
        static {
            InjectionContentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC12190kN.A00($values);
            Companion = new Object();
            EnumEntries entries = getEntries();
            LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(entries, 10)));
            for (Object obj : entries) {
                A18.put(((InjectionContentType) obj).value, obj);
            }
            reverseMap = A18;
        }

        public static InjectionContentType valueOf(String str) {
            return (InjectionContentType) Enum.valueOf(InjectionContentType.class, str);
        }

        public static InjectionContentType[] values() {
            return (InjectionContentType[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public InjectionContentType(String str, int i, String str2) {
            this.value = str2;
        }

        /* loaded from: classes8.dex */
        public final class Companion {
            public final InjectionContentType fromValue(String str) {
                C14360o3.A0B(str, 0);
                return (InjectionContentType) InjectionContentType.reverseMap.get(str);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }
    }

    /* loaded from: classes8.dex */
    public final class InjectionGroup {
        public final String name;
        public final List options;

        public final String getName() {
            return this.name;
        }

        public final List getOptions() {
            return this.options;
        }

        public InjectionGroup(String str, List list) {
            AbstractC167017dG.A1P(str, list);
            this.name = str;
            this.options = list;
        }
    }
}
