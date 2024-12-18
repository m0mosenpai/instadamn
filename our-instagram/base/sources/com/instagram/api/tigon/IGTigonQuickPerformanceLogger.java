package com.instagram.api.tigon;

import X.C14360o3;
import X.C1QW;
import X.C26761Rf;
import X.C3JZ;
import X.C74773Xm;
import X.C9F3;
import X.C9FC;
import X.C9G1;
import X.C9G4;
import X.C9GF;
import X.InterfaceC16660sJ;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class IGTigonQuickPerformanceLogger {
    public final boolean appStartRequestsEnabled;
    public final Pattern filteredQplUrlPattern;
    public final String filteredQplUrlRegex;
    public final AtomicInteger firstFeedRequestId;
    public final AtomicBoolean firstFeedRequestLogged;
    public final AtomicInteger firstStaticRequestId;
    public final AtomicBoolean firstStaticRequestLogged;
    public final AtomicInteger firstStoryRequestId;
    public final AtomicBoolean firstStoryRequestLogged;
    public final boolean highSampleRateEnabled;
    public final LightweightQuickPerformanceLogger logger;

    public IGTigonQuickPerformanceLogger(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, boolean z, boolean z2, String str) {
        Pattern compile;
        C14360o3.A0B(lightweightQuickPerformanceLogger, 1);
        C14360o3.A0B(str, 4);
        this.logger = lightweightQuickPerformanceLogger;
        this.highSampleRateEnabled = z;
        this.appStartRequestsEnabled = z2;
        this.filteredQplUrlRegex = str;
        this.firstFeedRequestId = new AtomicInteger(0);
        this.firstStoryRequestId = new AtomicInteger(0);
        this.firstStaticRequestId = new AtomicInteger(0);
        this.firstFeedRequestLogged = new AtomicBoolean(false);
        this.firstStoryRequestLogged = new AtomicBoolean(false);
        this.firstStaticRequestLogged = new AtomicBoolean(false);
        if (str.equals("")) {
            compile = null;
        } else {
            compile = Pattern.compile(str, 2);
        }
        this.filteredQplUrlPattern = compile;
        if (z2) {
            lightweightQuickPerformanceLogger.markerStart(429333119, hashCode());
        }
    }

    public final String getAppStartRequestType(int i, String str) {
        StringBuilder sb;
        String str2;
        C14360o3.A0B(str, 1);
        if (i == this.firstFeedRequestId.get()) {
            sb = new StringBuilder();
            str2 = "FEED_";
        } else if (i == this.firstStoryRequestId.get()) {
            sb = new StringBuilder();
            str2 = "STORY_";
        } else if (i == this.firstStaticRequestId.get()) {
            sb = new StringBuilder();
            str2 = "STATIC_";
        } else {
            return "";
        }
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    public final void markerAnnotate(C1QW c1qw, String str, String str2) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        withMarkers(c1qw, new C9GF(this, c1qw, str, str2, 0));
    }

    public final void markerEnd(C1QW c1qw, short s) {
        C14360o3.A0B(c1qw, 0);
        withMarkers(c1qw, new C9FC(s, 1, this, c1qw));
        if (this.appStartRequestsEnabled) {
            if (!this.firstFeedRequestLogged.get() || !this.firstStoryRequestLogged.get() || !this.firstStaticRequestLogged.get()) {
                int hashCode = c1qw.hashCode();
                if (hashCode == this.firstFeedRequestId.get()) {
                    this.firstFeedRequestLogged.set(true);
                }
                if (hashCode == this.firstStoryRequestId.get()) {
                    this.firstStoryRequestLogged.set(true);
                }
                if (hashCode == this.firstStaticRequestId.get()) {
                    this.firstStaticRequestLogged.set(true);
                }
                String appStartRequestType = getAppStartRequestType(hashCode, "END");
                if (!C14360o3.A0K(appStartRequestType, "")) {
                    this.logger.markerPoint(429333119, hashCode(), appStartRequestType);
                }
                if (this.firstFeedRequestLogged.get() && this.firstStoryRequestLogged.get() && this.firstStaticRequestLogged.get()) {
                    this.logger.markerEnd(429333119, hashCode(), (short) 467);
                }
            }
        }
    }

    public final void markerPoint(C1QW c1qw, String str, long j, TimeUnit timeUnit) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(timeUnit, 3);
        withMarkers(c1qw, new C74773Xm(this, c1qw, str, timeUnit, j));
        if (this.appStartRequestsEnabled) {
            if (!this.firstFeedRequestLogged.get() || !this.firstStoryRequestLogged.get() || !this.firstStaticRequestLogged.get()) {
                int hashCode = c1qw.hashCode();
                String upperCase = str.toUpperCase(Locale.ROOT);
                C14360o3.A07(upperCase);
                String appStartRequestType = getAppStartRequestType(hashCode, upperCase);
                if (!C14360o3.A0K(appStartRequestType, "")) {
                    this.logger.markerPoint(429333119, hashCode(), appStartRequestType, j, timeUnit);
                }
            }
        }
    }

    public final void markerStart(C1QW c1qw) {
        C14360o3.A0B(c1qw, 0);
        withMarkers(c1qw, new C9F3(27, this, c1qw));
        if (this.appStartRequestsEnabled) {
            if (!this.firstFeedRequestLogged.get() || !this.firstStoryRequestLogged.get() || !this.firstStaticRequestLogged.get()) {
                String appStartRequestType = getAppStartRequestType(c1qw.hashCode(), "START");
                if (!C14360o3.A0K(appStartRequestType, "")) {
                    this.logger.markerPoint(429333119, hashCode(), appStartRequestType);
                }
            }
        }
    }

    public final long currentMonotonicTimestampNanos() {
        return this.logger.currentMonotonicTimestampNanos();
    }

    public final AtomicInteger getFirstFeedRequestId() {
        return this.firstFeedRequestId;
    }

    public final AtomicBoolean getFirstFeedRequestLogged() {
        return this.firstFeedRequestLogged;
    }

    public final AtomicInteger getFirstStaticRequestId() {
        return this.firstStaticRequestId;
    }

    public final AtomicBoolean getFirstStaticRequestLogged() {
        return this.firstStaticRequestLogged;
    }

    public final AtomicInteger getFirstStoryRequestId() {
        return this.firstStoryRequestId;
    }

    public final AtomicBoolean getFirstStoryRequestLogged() {
        return this.firstStoryRequestLogged;
    }

    public final void setFirstMediaRequest() {
        if (this.appStartRequestsEnabled) {
            this.logger.markerAnnotate(429333119, hashCode(), "is_first_media_request", true);
        }
    }

    public final void setTheFirstFeedRequestId(int i) {
        this.firstFeedRequestId.getAndSet(i);
    }

    public final void setTheFirstStaticRequestId(int i) {
        this.firstStaticRequestId.getAndSet(i);
    }

    public final void setTheFirstStoryRequestId(int i) {
        this.firstStoryRequestId.getAndSet(i);
    }

    private final void withMarkers(C1QW c1qw, InterfaceC16660sJ interfaceC16660sJ) {
        Matcher matcher;
        interfaceC16660sJ.invoke(926483817);
        if (this.highSampleRateEnabled) {
            interfaceC16660sJ.invoke(677319650);
        }
        if (this.appStartRequestsEnabled && (!this.firstFeedRequestLogged.get() || !this.firstStoryRequestLogged.get() || !this.firstStaticRequestLogged.get())) {
            interfaceC16660sJ.invoke(429329736);
        }
        Pattern pattern = this.filteredQplUrlPattern;
        if (pattern != null && (matcher = pattern.matcher(c1qw.A09.toString())) != null && matcher.find()) {
            interfaceC16660sJ.invoke(183640166);
        }
    }

    public final void markerAnnotate(C1QW c1qw, String str, boolean z) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(str, 1);
        withMarkers(c1qw, new C26761Rf(this, c1qw, str, z));
    }

    public final void markerPoint(C1QW c1qw, String str) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(str, 1);
        withMarkers(c1qw, new C9G1(this, c1qw, str, 0));
    }

    public final void markerAnnotate(C1QW c1qw, String str, long j) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(str, 1);
        withMarkers(c1qw, new C9G4(this, c1qw, str, 0, j));
    }

    public final void markerAnnotate(C1QW c1qw, String str, int i) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(str, 1);
        withMarkers(c1qw, new C3JZ(this, c1qw, str, i));
    }
}
