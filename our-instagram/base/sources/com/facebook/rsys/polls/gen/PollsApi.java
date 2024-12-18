package com.facebook.rsys.polls.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class PollsApi {
    public static C2N9 CONVERTER = YAM.A00(30);

    /* loaded from: classes12.dex */
    public final class CProxy extends PollsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native PollsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.polls.gen.PollsApi
        public native void closeActivity();

        @Override // com.facebook.rsys.polls.gen.PollsApi
        public native void createTextPoll(String str, ArrayList arrayList);

        public native int hashCode();

        @Override // com.facebook.rsys.polls.gen.PollsApi
        public native void removePoll(String str);

        @Override // com.facebook.rsys.polls.gen.PollsApi
        public native void removeVote(String str);

        @Override // com.facebook.rsys.polls.gen.PollsApi
        public native void vote(String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof PollsApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void closeActivity();

    public abstract void createTextPoll(String str, ArrayList arrayList);

    public abstract void removePoll(String str);

    public abstract void removeVote(String str);

    public abstract void vote(String str);
}
