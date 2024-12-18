package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;

/* renamed from: X.Jxf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45110Jxf extends C0T6 {
    public long A00;
    public Object A01;
    public String A02;
    public final int A03 = 2;

    public C45110Jxf(EnumC101664hb enumC101664hb, String str, long j) {
        AbstractC167007dF.A1E(str, 2, enumC101664hb);
        this.A00 = j;
        this.A02 = str;
        this.A01 = enumC101664hb;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A03) {
            case 0:
                if (this != obj) {
                    if (obj instanceof C45110Jxf) {
                        C45110Jxf c45110Jxf = (C45110Jxf) obj;
                        if (c45110Jxf.A03 == 0 && this.A00 == c45110Jxf.A00 && C14360o3.A0K(this.A01, c45110Jxf.A01)) {
                            obj2 = this.A02;
                            obj3 = c45110Jxf.A02;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (obj instanceof C45110Jxf) {
                        C45110Jxf c45110Jxf2 = (C45110Jxf) obj;
                        if (c45110Jxf2.A03 == 1 && this.A00 == c45110Jxf2.A00 && C14360o3.A0K(this.A02, c45110Jxf2.A02)) {
                            obj2 = this.A01;
                            obj3 = c45110Jxf2.A01;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof C45110Jxf) {
                        C45110Jxf c45110Jxf3 = (C45110Jxf) obj;
                        if (c45110Jxf3.A03 != 2 || !AbstractC50102Ry.A00(Long.valueOf(this.A00), Long.valueOf(c45110Jxf3.A00)) || !AbstractC50102Ry.A00(this.A01, c45110Jxf3.A01) || !AbstractC50102Ry.A00(this.A02, c45110Jxf3.A02)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        int hashCode;
        switch (this.A03) {
            case 0:
                A0J = AbstractC166997dE.A0J(this.A01, AbstractC25235BEs.A03(this.A00));
                hashCode = this.A02.hashCode();
                break;
            case 1:
                A0J = AbstractC166997dE.A0K(this.A02, AbstractC25235BEs.A03(this.A00));
                hashCode = this.A01.hashCode();
                break;
            default:
                return Arrays.hashCode(new Object[]{this.A01, Long.valueOf(this.A00), this.A02});
        }
        return A0J + hashCode;
    }

    public C45110Jxf(ImageUrl imageUrl, String str, long j) {
        C14360o3.A0B(str, 3);
        this.A00 = j;
        this.A01 = imageUrl;
        this.A02 = str;
    }

    public C45110Jxf(C5QE c5qe, String str, long j) {
        C14360o3.A0B(str, 2);
        this.A00 = j;
        this.A02 = str;
        this.A01 = c5qe;
    }
}
