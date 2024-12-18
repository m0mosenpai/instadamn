package X;

/* loaded from: classes8.dex */
public final class K2K extends C0T6 implements MNE {
    public final int A00;
    public final String A01;

    public K2K(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof K2K) {
            K2K k2k = (K2K) obj;
            if (k2k.A00 != i || !C14360o3.A0K(this.A01, k2k.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K2K() {
        this("deleteBroadcastChannelReply_request_error", 1);
        this.A00 = 1;
    }
}
