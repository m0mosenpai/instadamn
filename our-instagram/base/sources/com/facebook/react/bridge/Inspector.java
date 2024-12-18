package com.facebook.react.bridge;

import X.AbstractC166987dD;
import X.AbstractC167027dH;
import X.STV;
import com.facebook.jni.HybridData;

/* loaded from: classes10.dex */
public class Inspector {
    public final HybridData mHybridData;

    /* loaded from: classes10.dex */
    public interface RemoteConnection {
        void onDisconnect();

        void onMessage(String str);
    }

    private native LocalConnection connectNative(int i, RemoteConnection remoteConnection);

    private native Page[] getPagesNative();

    public static native Inspector instance();

    /* loaded from: classes10.dex */
    public class LocalConnection {
        public final HybridData mHybridData;

        public native void disconnect();

        public native void sendMessage(String str);

        public LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }
    }

    /* loaded from: classes10.dex */
    public class Page {
        public final int mId;
        public final String mTitle;
        public final String mVM;

        public Page(int i, String str, String str2) {
            this.mId = i;
            this.mTitle = str;
            this.mVM = str2;
        }

        public String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Page{mId=");
            A1C.append(this.mId);
            A1C.append(", mTitle='");
            A1C.append(this.mTitle);
            A1C.append('\'');
            return AbstractC167027dH.A0R(A1C);
        }
    }

    static {
        STV.A00();
    }

    public Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
