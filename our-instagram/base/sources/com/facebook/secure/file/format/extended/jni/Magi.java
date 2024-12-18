package com.facebook.secure.file.format.extended.jni;

import X.AbstractC25233BEq;
import X.C09170dP;
import X.C14360o3;
import X.C53746Npy;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: classes9.dex */
public final class Magi {
    public static final C53746Npy Companion = new Object();
    public final HybridData mHybridData;

    /* loaded from: classes9.dex */
    public final class MatchResult {
        public final String error;
        public final String extension;
        public final boolean match;
        public final String mimeType;

        public MatchResult(boolean z, String str, String str2, String str3) {
            AbstractC25233BEq.A0w(2, str, str2, str3);
            this.match = z;
            this.extension = str;
            this.mimeType = str2;
            this.error = str3;
        }

        public final String getError() {
            return this.error;
        }

        public final String getExtension() {
            return this.extension;
        }

        public final boolean getMatch() {
            return this.match;
        }

        public final String getMimeType() {
            return this.mimeType;
        }
    }

    public Magi(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    public static final native long nativeCreate();

    public static final native void nativeDispose(long j);

    public static final native MatchResult nativeMatch(long j, String str, List list, List list2);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Npy] */
    static {
        C09170dP.A0C("magi-jni");
    }

    public Magi() {
        this(initHybrid0());
    }
}
