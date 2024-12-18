package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.9BF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BF extends C0T6 implements InterfaceC57817Pkj {
    public final int A00;
    public final Object A01;

    public C9BF(Integer num) {
        this.A00 = 1;
        this.A01 = num;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9BF) && ((C9BF) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C9BF) obj).A01)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        Object obj;
        switch (this.A00) {
            case 0:
            case 1:
                obj = this.A01;
                if (obj == null) {
                    return 0;
                }
                return obj.hashCode();
            default:
                obj = this.A01;
                return obj.hashCode();
        }
    }

    public C9BF(Drawable drawable, int i) {
        this.A00 = i;
        if (i != 0) {
            C14360o3.A0B(drawable, 1);
        }
        this.A01 = drawable;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9BF() {
        this(null);
        this.A00 = 1;
    }
}
