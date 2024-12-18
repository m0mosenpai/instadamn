package go;

import go.Seq;

/* loaded from: classes12.dex */
public abstract class Universe {

    /* loaded from: classes12.dex */
    public final class proxyerror extends Exception implements Seq.Proxy, error {
        public final int refnum;

        @Override // go.error
        public native String error();

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public proxyerror(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return error();
        }
    }

    public static native void _init();

    public static void touch() {
    }

    static {
        Seq.touch();
        _init();
    }
}
