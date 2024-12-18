package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductItemWithAR;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.88X, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C88X implements InterfaceC120325cX {
    public static final C88X A0T = new C88X(new C189128Zd(null, C88Z.A0G, null));
    public static final C88X A0U = new C88X(new C189128Zd(null, C88Z.A0Q, null));
    public int A00;
    public Drawable A01;
    public H3P A02;
    public CameraAREffect A03;
    public C88Z A04;
    public ImageUrl A05;
    public ProductItemWithAR A06;
    public C214509eo A07;
    public C189138Ze A08;
    public A68 A09;
    public A69 A0A;
    public C22881A7b A0B;
    public C38828H7z A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public List A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public int A0P;
    public String A0Q;
    public String A0R;
    public String A0S;

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C88X c88x = (C88X) obj;
            C88Z c88z = this.A04;
            if (c88z == C88Z.A0J) {
                if (c88z == c88x.A04) {
                    obj2 = this.A0E;
                    obj3 = c88x.A0E;
                } else {
                    return false;
                }
            } else if (c88z != C88Z.A0H && c88z != C88Z.A05) {
                if (c88z == c88x.A04) {
                    obj2 = this.A03;
                    obj3 = c88x.A03;
                } else {
                    return false;
                }
            } else if (c88z == c88x.A04) {
                obj2 = this.A0Q;
                obj3 = c88x.A0Q;
            } else {
                return false;
            }
            if (!C2I7.A00(obj2, obj3)) {
                return false;
            }
        }
        return true;
    }

    public final CameraAREffect A00() {
        C88Z c88z = this.A04;
        if ((c88z == C88Z.A04 || c88z == C88Z.A08) && this.A03 == null) {
            C0w9.A03("DialElement", "DialElement.getCameraArEffect() found null");
        }
        return this.A03;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.AlD] */
    public final List A02() {
        List<URE> list = this.A0J;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        for (URE ure : list) {
            C14360o3.A0B(ure, 0);
            ?? obj = new Object();
            obj.A00 = ure;
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final boolean A03() {
        CameraAREffect cameraAREffect = this.A03;
        if (cameraAREffect != null && "INSTAGRAM_CAMERA".equals(cameraAREffect.A0E)) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        C88Z c88z = this.A04;
        if (c88z == null) {
            c88z = C88Z.A0G;
        }
        if (c88z != C88Z.A0Y && c88z != C88Z.A0Z && c88z != C88Z.A0X && c88z != C88Z.A0W) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC120325cX
    public final String getId() {
        String str;
        C88Z c88z = this.A04;
        if (c88z == null) {
            c88z = C88Z.A0G;
        }
        if (c88z != C88Z.A04 && c88z != C88Z.A06 && c88z != C88Z.A08) {
            if (c88z != C88Z.A0C && c88z != C88Z.A0J) {
                if (c88z != C88Z.A0H && c88z != C88Z.A05) {
                    if (c88z == C88Z.A0X) {
                        str = this.A0S;
                    } else if (c88z == C88Z.A0W) {
                        str = this.A0R;
                    }
                } else {
                    str = this.A0Q;
                }
            } else {
                str = this.A0E;
            }
            str.getClass();
            return str;
        }
        CameraAREffect A00 = A00();
        if (A00 != null) {
            return A00.A0K;
        }
        C0w9.A03("DialElement", "DialElement.getId() found null cameraArEffect");
        return this.A04.A00;
    }

    public final int hashCode() {
        Object[] objArr;
        Object obj;
        C88Z c88z = this.A04;
        if (c88z == C88Z.A0J) {
            objArr = new Object[2];
            objArr[0] = c88z;
            obj = this.A0E;
        } else if (c88z != C88Z.A0H && c88z != C88Z.A05) {
            objArr = new Object[2];
            objArr[0] = c88z;
            obj = this.A03;
        } else {
            objArr = new Object[2];
            objArr[0] = c88z;
            obj = this.A0Q;
        }
        objArr[1] = obj;
        return Arrays.hashCode(objArr);
    }

    public C88X(C189128Zd c189128Zd) {
        this.A04 = c189128Zd.A0E;
        this.A0G = c189128Zd.A0I;
        this.A05 = c189128Zd.A02;
        this.A01 = c189128Zd.A0C;
        this.A03 = c189128Zd.A0D;
        this.A06 = c189128Zd.A0F;
        this.A08 = c189128Zd.A0G;
        this.A0H = null;
        this.A0E = c189128Zd.A0H;
        this.A00 = c189128Zd.A00;
        this.A0Q = c189128Zd.A03;
        this.A0D = c189128Zd.A04;
        this.A0M = c189128Zd.A09;
        this.A0N = c189128Zd.A0A;
        this.A0S = c189128Zd.A07;
        this.A0R = c189128Zd.A06;
        this.A0K = c189128Zd.A08;
        this.A0F = c189128Zd.A05;
        this.A0P = c189128Zd.A01;
        this.A0O = c189128Zd.A0B;
    }

    public final String A01(Context context) {
        int i;
        CameraAREffect A00 = A00();
        C88Z c88z = this.A04;
        if (c88z == null) {
            c88z = C88Z.A0G;
        }
        if (c88z == C88Z.A0Y) {
            i = 2131971303;
        } else if (c88z == C88Z.A0Z || (c88z == C88Z.A0W && this.A0O)) {
            int i2 = this.A0P;
            if (i2 <= 0) {
                i = 2131971352;
            } else {
                return context.getResources().getQuantityString(R.plurals.quick_snap_audience_list_dial_element_subtitle, i2, Integer.valueOf(i2));
            }
        } else {
            if (A00 == null) {
                return null;
            }
            return context.getString(2131953236, A00.A0C);
        }
        return context.getString(i);
    }

    public C88X() {
    }
}
