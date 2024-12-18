package X;

import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.NPv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52622NPv extends AbstractC55959Osr {
    public final RtcStartCoWatchPlaybackArguments A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52622NPv) {
                C52622NPv c52622NPv = (C52622NPv) obj;
                if (!C14360o3.A0K(this.A00, c52622NPv.A00) || !C14360o3.A0K(this.A01, c52622NPv.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A01);
    }

    public C52622NPv(RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, String str) {
        this.A00 = rtcStartCoWatchPlaybackArguments;
        this.A01 = str;
    }
}
