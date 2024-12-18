package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.C14360o3;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants;

/* loaded from: classes11.dex */
public final class LocalMediaInjectionFetcher {
    public static final LocalMediaInjectionFetcher INSTANCE = new Object();

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalMediaInjectionConstants.InjectionContentType.values().length];
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.FEED_ADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.FEED_NETEGO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.STORIES_ADS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.STORIES_NETEGO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.REELS_ADS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.REELS_ORGANIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.THREADS_ADS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final LocalMediaInjectionDataStoreManager fetchInjectionData(LocalMediaInjectionConstants.InjectionContentType injectionContentType) {
        Object obj;
        C14360o3.A0B(injectionContentType, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (injectionContentType.ordinal()) {
            case 0:
                obj = new Object();
                break;
            case 1:
                obj = new Object();
                break;
            case 2:
                obj = new Object();
                break;
            case 3:
                obj = new Object();
                break;
            case 4:
                obj = new Object();
                break;
            case 5:
                obj = new Object();
                break;
            case 6:
                obj = new Object();
                break;
            default:
                throw new IllegalArgumentException("Unsupported injection content type!");
        }
        return (LocalMediaInjectionDataStoreManager) obj;
    }
}
