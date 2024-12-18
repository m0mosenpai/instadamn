package com.instagram.debug.log.tags;

import X.AnonymousClass001;
import android.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class DLogTag {
    public final int color;
    public final String name;
    public final int nameResourceId;

    /* loaded from: classes8.dex */
    public final class ASYNC_ADS extends DLogTag {
        public static final ASYNC_ADS INSTANCE = new ASYNC_ADS();

        public ASYNC_ADS() {
            super("async_ads", 2131957584, -16711681);
        }
    }

    /* loaded from: classes11.dex */
    public final class CANVAS extends DLogTag {
        public static final CANVAS INSTANCE = new CANVAS();

        public CANVAS() {
            super("canvas", 2131957585, -16711681);
        }
    }

    /* loaded from: classes8.dex */
    public final class CONTEXTUAL_CONFIG extends DLogTag {
        public static final CONTEXTUAL_CONFIG INSTANCE = new CONTEXTUAL_CONFIG();

        public CONTEXTUAL_CONFIG() {
            super("contextual_config", 2131957586, -16711681);
        }
    }

    /* loaded from: classes8.dex */
    public final class DIRECT_HTTP extends DLogTag {
        public static final DIRECT_HTTP INSTANCE = new DIRECT_HTTP();

        public DIRECT_HTTP() {
            super("direct_http", 2131957587, Color.argb(255, 255, 165, 0));
        }
    }

    /* loaded from: classes8.dex */
    public final class DIRECT_REAL_TIME extends DLogTag {
        public static final DIRECT_REAL_TIME INSTANCE = new DIRECT_REAL_TIME();

        public DIRECT_REAL_TIME() {
            super("direct_real_time", 2131957588, -16711936);
        }
    }

    /* loaded from: classes8.dex */
    public final class IG_VIDEO_REAL_TIME extends DLogTag {
        public static final IG_VIDEO_REAL_TIME INSTANCE = new IG_VIDEO_REAL_TIME();

        public IG_VIDEO_REAL_TIME() {
            super("ig_video_real_time", 2131957589, -16711681);
        }
    }

    /* loaded from: classes9.dex */
    public final class LIVE extends DLogTag {
        public static final LIVE INSTANCE = new LIVE();

        public LIVE() {
            super("live", 2131957590, -16711681);
        }
    }

    /* loaded from: classes8.dex */
    public final class PENDING_MEDIA extends DLogTag {
        public static final PENDING_MEDIA INSTANCE = new PENDING_MEDIA();

        public PENDING_MEDIA() {
            super("pending_media", 2131957591, -65281);
        }
    }

    /* loaded from: classes8.dex */
    public final class QE_EXPOSURE extends DLogTag {
        public static final QE_EXPOSURE INSTANCE = new QE_EXPOSURE();

        public QE_EXPOSURE() {
            super("qe_exposure", 2131957592, -256);
        }
    }

    /* loaded from: classes8.dex */
    public final class REAL_TIME_FLEET_BEACON extends DLogTag {
        public static final REAL_TIME_FLEET_BEACON INSTANCE = new REAL_TIME_FLEET_BEACON();

        public REAL_TIME_FLEET_BEACON() {
            super("real_time_fleet_beacon", 2131957594, -16711681);
        }
    }

    /* loaded from: classes8.dex */
    public final class REEL extends DLogTag {
        public static final REEL INSTANCE = new REEL();

        public REEL() {
            super("reel", 2131957595, -16711681);
        }
    }

    /* loaded from: classes9.dex */
    public final class RTC extends DLogTag {
        public static final RTC INSTANCE = new RTC();

        public RTC() {
            super("rtc", 2131957596, -65281);
        }
    }

    /* loaded from: classes8.dex */
    public final class VIDEO_CALL extends DLogTag {
        public static final VIDEO_CALL INSTANCE = new VIDEO_CALL();

        public VIDEO_CALL() {
            super("video_call", 2131957597, -16711681);
        }
    }

    public /* synthetic */ DLogTag(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2);
    }

    /* loaded from: classes.dex */
    public final class REAL_TIME extends DLogTag {
        public static final REAL_TIME INSTANCE = new REAL_TIME();

        public REAL_TIME() {
            super("real_time", 2131957593, -16711681);
        }
    }

    public final int getColor() {
        return this.color;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNameResourceId() {
        return this.nameResourceId;
    }

    public String toString() {
        return AnonymousClass001.A0S("DLogTag {", this.name, '}');
    }

    public DLogTag(String str, int i, int i2) {
        this.name = str;
        this.nameResourceId = i;
        this.color = i2;
    }
}
