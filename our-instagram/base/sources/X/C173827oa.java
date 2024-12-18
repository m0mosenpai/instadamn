package X;

import com.instagram.camera.effect.models.CameraAREffect;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173827oa extends C0T6 {
    public final int A00;
    public final C88X A01;
    public final List A02;
    public final InterfaceC09390do A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C173827oa(C88X c88x, List list, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(list, 2);
        this.A01 = c88x;
        this.A02 = list;
        this.A05 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A00 = i;
        this.A03 = AbstractC09440dt.A01(new C9ET(this, 4));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C173827oa) {
                C173827oa c173827oa = (C173827oa) obj;
                if (!C14360o3.A0K(this.A01, c173827oa.A01) || !C14360o3.A0K(this.A02, c173827oa.A02) || this.A05 != c173827oa.A05 || this.A04 != c173827oa.A04 || this.A06 != c173827oa.A06 || this.A00 != c173827oa.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final float A00() {
        InterfaceC09390do interfaceC09390do = this.A03;
        if (!((List) interfaceC09390do.getValue()).isEmpty()) {
            List list = (List) interfaceC09390do.getValue();
            int i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("25025320".equals(((CameraAREffect) it.next()).A0B) && (i = i + 1) < 0) {
                        AbstractC16960so.A1T();
                        throw C00O.createAndThrow();
                    }
                }
            }
            return i / ((List) interfaceC09390do.getValue()).size();
        }
        return 0.0f;
    }

    public final int hashCode() {
        int hashCode;
        C88X c88x = this.A01;
        if (c88x == null) {
            hashCode = 0;
        } else {
            hashCode = c88x.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A06) {
            i5 = 1231;
        }
        return ((i4 + i5) * 31) + this.A00;
    }
}
