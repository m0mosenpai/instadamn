package X;

/* renamed from: X.9Br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206349Br extends C0T6 {
    public final int A00 = 1;
    public final long A01;
    public final String A02;

    public C206349Br(long j, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = j;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C206349Br) {
                    C206349Br c206349Br = (C206349Br) obj;
                    if (c206349Br.A00 != 1 || this.A01 != c206349Br.A01 || !C14360o3.A0K(this.A02, c206349Br.A02)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C206349Br)) {
                return false;
            }
            C206349Br c206349Br2 = (C206349Br) obj;
            if (c206349Br2.A00 != 0 || !C14360o3.A0K(this.A02, c206349Br2.A02) || this.A01 != c206349Br2.A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        if (this.A00 != 0) {
            long j = this.A01;
            hashCode = ((int) (j ^ (j >>> 32))) * 31;
            i = this.A02.hashCode();
        } else {
            hashCode = this.A02.hashCode() * 31;
            long j2 = this.A01;
            i = (int) (j2 ^ (j2 >>> 32));
        }
        return hashCode + i;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DictionaryIdAndKey(dictionaryId=");
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(3372));
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C206349Br(String str, long j) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = j;
    }
}
