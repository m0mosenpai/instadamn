package X;

import android.content.DialogInterface;
import android.graphics.RectF;
import com.instagram.model.reels.Reel;

/* renamed from: X.9Be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206219Be extends C0T6 implements InterfaceC166427cB {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C206219Be(DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        this.A03 = onClickListener;
        this.A01 = onClickListener2;
        this.A02 = onCancelListener;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C206219Be) {
                    C206219Be c206219Be = (C206219Be) obj;
                    if (c206219Be.A00 == 1 && C14360o3.A0K(this.A03, c206219Be.A03) && C14360o3.A0K(this.A01, c206219Be.A01)) {
                        obj2 = this.A02;
                        obj3 = c206219Be.A02;
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
            if (!(obj instanceof C206219Be)) {
                return false;
            }
            C206219Be c206219Be2 = (C206219Be) obj;
            if (c206219Be2.A00 != 0 || !C14360o3.A0K(this.A03, c206219Be2.A03) || !C14360o3.A0K(this.A02, c206219Be2.A02)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = c206219Be2.A01;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj;
        if (this.A00 != 0) {
            hashCode = ((this.A03.hashCode() * 31) + this.A01.hashCode()) * 31;
            obj = this.A02;
        } else {
            hashCode = ((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31;
            obj = this.A01;
        }
        return hashCode + obj.hashCode();
    }

    public C206219Be(RectF rectF, Reel reel, InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = reel;
        this.A02 = rectF;
        this.A01 = interfaceC16820sZ;
    }
}
