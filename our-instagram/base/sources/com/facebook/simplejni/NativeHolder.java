package com.facebook.simplejni;

import X.C09170dP;
import X.C1EM;
import X.C4DN;
import X.C4DO;
import X.C4DP;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class NativeHolder {
    public final Destructor mDestructor;
    public final long mNativePointer;

    /* loaded from: classes2.dex */
    public class Destructor extends C4DN {
        public long mNativeDestructorFunctionPointer;
        public long mNativePointer;

        public static native void deleteNative(long j, long j2);

        static {
            C09170dP.A0C("simplejni");
        }

        public Destructor(Object obj, long j, long j2) {
            super(obj, C4DO.A02);
            AtomicReference atomicReference;
            C4DN c4dn;
            C4DP c4dp = C4DO.A01;
            do {
                atomicReference = c4dp.A00;
                c4dn = (C4DN) atomicReference.get();
                this.A00 = c4dn;
            } while (!C1EM.A00(c4dn, this, atomicReference));
            this.mNativePointer = j;
            this.mNativeDestructorFunctionPointer = j2;
        }

        @Override // X.C4DN
        public void destruct() {
            long j = this.mNativePointer;
            if (j != 0) {
                deleteNative(j, this.mNativeDestructorFunctionPointer);
                this.mNativePointer = 0L;
            }
        }
    }

    static {
        C09170dP.A0C("simplejni");
    }

    public NativeHolder(long j, long j2) {
        this.mNativePointer = j;
        this.mDestructor = new Destructor(this, j, j2);
    }
}
