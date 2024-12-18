package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* renamed from: X.Biy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26234Biy extends C0T6 implements InterfaceC58259Ps3 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C26234Biy(AudioOverlayTrack audioOverlayTrack, String str, List list) {
        AbstractC167007dF.A1E(str, 1, list);
        this.A03 = str;
        this.A02 = audioOverlayTrack;
        this.A01 = list;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26234Biy) && ((C26234Biy) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (A00(obj, 1)) {
                    C26234Biy c26234Biy = (C26234Biy) obj;
                    if (C14360o3.A0K(this.A03, c26234Biy.A03) && C14360o3.A0K(this.A02, c26234Biy.A02)) {
                        obj2 = this.A01;
                        obj3 = c26234Biy.A01;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!A00(obj, 0)) {
                return false;
            }
            C26234Biy c26234Biy2 = (C26234Biy) obj;
            if (!C14360o3.A0K(this.A03, c26234Biy2.A03) || !C14360o3.A0K(this.A01, c26234Biy2.A01)) {
                return false;
            }
            obj2 = this.A02;
            obj3 = c26234Biy2.A02;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        Object obj;
        int i;
        int i2 = this.A00;
        int A0J2 = AbstractC166987dD.A0J(this.A03);
        if (i2 != 0) {
            A0J = AbstractC166997dE.A0J(this.A02, A0J2);
            obj = this.A01;
        } else {
            A0J = AbstractC166997dE.A0J(this.A01, A0J2);
            obj = this.A02;
            if (obj == null) {
                i = 0;
                return A0J + i;
            }
        }
        i = obj.hashCode();
        return A0J + i;
    }

    public C26234Biy(ImageUrl imageUrl, C38321qM c38321qM, String str) {
        this.A03 = str;
        this.A01 = c38321qM;
        this.A02 = imageUrl;
    }
}
