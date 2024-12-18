package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.MtM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51739MtM extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C51739MtM(C5QE c5qe, C5QE c5qe2, C5QE c5qe3, EnumC53223NgL enumC53223NgL, String str) {
        this.A00 = 1;
        this.A00 = 1;
        C14360o3.A0B(str, 1);
        this.A06 = str;
        this.A04 = c5qe;
        this.A03 = c5qe2;
        this.A05 = enumC53223NgL;
        this.A01 = c5qe3;
        this.A02 = null;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C51739MtM)) {
                        return false;
                    }
                    C51739MtM c51739MtM = (C51739MtM) obj;
                    if (c51739MtM.A00 != 1 || !C14360o3.A0K(this.A06, c51739MtM.A06) || !C14360o3.A0K(this.A04, c51739MtM.A04) || !C14360o3.A0K(this.A03, c51739MtM.A03) || this.A05 != c51739MtM.A05 || !C14360o3.A0K(this.A01, c51739MtM.A01)) {
                        return false;
                    }
                    obj2 = this.A02;
                    obj3 = c51739MtM.A02;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    if (!(obj instanceof C51739MtM)) {
                        return false;
                    }
                    C51739MtM c51739MtM2 = (C51739MtM) obj;
                    if (c51739MtM2.A00 != 2 || this.A02 != c51739MtM2.A02 || !C14360o3.A0K(this.A03, c51739MtM2.A03) || !C14360o3.A0K(this.A06, c51739MtM2.A06) || !C14360o3.A0K(this.A05, c51739MtM2.A05) || !C14360o3.A0K(this.A01, c51739MtM2.A01)) {
                        return false;
                    }
                    obj2 = this.A04;
                    obj3 = c51739MtM2.A04;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    if (obj instanceof C51739MtM) {
                        C51739MtM c51739MtM3 = (C51739MtM) obj;
                        if (c51739MtM3.A00 == 3 && C14360o3.A0K(this.A04, c51739MtM3.A04) && C14360o3.A0K(this.A06, c51739MtM3.A06) && C14360o3.A0K(this.A05, c51739MtM3.A05) && C14360o3.A0K(this.A02, c51739MtM3.A02) && C14360o3.A0K(this.A03, c51739MtM3.A03)) {
                            obj2 = this.A01;
                            obj3 = c51739MtM3.A01;
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
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        int A0M;
        String str;
        switch (this.A00) {
            case 1:
                A0J = AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A06)))));
                A0M = AbstractC167017dG.A0M(this.A02);
                break;
            case 2:
                int A0H = AbstractC166987dD.A0H(this.A02);
                switch (A0H) {
                    case 1:
                        str = "SOME_LOADED";
                        break;
                    case 2:
                        str = "FAILED";
                        break;
                    default:
                        str = "LOADING";
                        break;
                }
                A0M = AbstractC166997dE.A0J(this.A01, (((((AbstractC25228BEl.A0F(str, A0H) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31);
                A0J = AbstractC166997dE.A0I(this.A04);
                break;
            default:
                A0J = ((((((((AbstractC167017dG.A0M(this.A04) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31;
                A0M = this.A01.hashCode();
                break;
        }
        return A0J + A0M;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Cta(id=");
        A1C.append(this.A06);
        A1C.append(", title=");
        A1C.append(this.A04);
        A1C.append(", subTitle=");
        A1C.append(this.A03);
        A1C.append(", type=");
        A1C.append(this.A05);
        A1C.append(", contentDescription=");
        A1C.append(this.A01);
        A1C.append(", icon=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }

    public C51739MtM(C51755Mte c51755Mte, ImageUrl imageUrl, User user, Integer num, Integer num2, String str) {
        this.A00 = 3;
        this.A04 = imageUrl;
        this.A06 = str;
        this.A05 = user;
        this.A02 = num;
        this.A03 = num2;
        this.A01 = c51755Mte;
    }

    public C51739MtM(Bitmap bitmap, Bitmap bitmap2, C29229CuY c29229CuY, Integer num, String str, List list) {
        this.A00 = 2;
        this.A02 = num;
        this.A03 = bitmap;
        this.A06 = str;
        this.A05 = c29229CuY;
        this.A01 = list;
        this.A04 = bitmap2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51739MtM() {
        this((Bitmap) null, (Bitmap) null, (C29229CuY) null, C05F.A00, (String) null, C16930sl.A00);
        this.A00 = 2;
    }
}
