package com.facebook.soloader;

import X.C09170dP;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NativeLibrary {
    public List A01;
    public final Object A03 = new Object();
    public Boolean A00 = true;
    public boolean A02 = false;
    public volatile UnsatisfiedLinkError A04 = null;

    public final boolean A01() {
        boolean z;
        synchronized (this.A03) {
            if (!this.A00.booleanValue()) {
                z = this.A02;
            } else {
                try {
                    List list = this.A01;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C09170dP.A0C((String) it.next());
                        }
                    }
                    this.A02 = true;
                    z = true;
                    this.A01 = null;
                } catch (UnsatisfiedLinkError e) {
                    Log.e("com.facebook.soloader.NativeLibrary", "Failed to load native lib (initial check): ", e);
                    this.A04 = e;
                    this.A02 = false;
                    z = false;
                    this.A00 = false;
                    return z;
                } catch (Throwable th) {
                    Log.e("com.facebook.soloader.NativeLibrary", "Failed to load native lib (other error): ", th);
                    this.A04 = new UnsatisfiedLinkError("Failed loading libraries");
                    this.A04.initCause(th);
                    this.A02 = false;
                    z = false;
                    this.A00 = false;
                    return z;
                }
                this.A00 = false;
            }
        }
        return z;
    }

    public NativeLibrary(List list) {
        this.A01 = list;
    }

    public final void A00() {
        if (A01()) {
        } else {
            throw this.A04;
        }
    }
}
