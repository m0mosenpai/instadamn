package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110064xb extends C0T6 implements InterfaceC110074xc {
    public final long A00;
    public final Integer A01;
    public final Integer A02;

    @Override // X.InterfaceC110074xc
    public final C110064xb EsD() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C110064xb) {
                C110064xb c110064xb = (C110064xb) obj;
                if (this.A00 != c110064xb.A00 || !C14360o3.A0K(this.A01, c110064xb.A01) || !C14360o3.A0K(this.A02, c110064xb.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC110074xc
    public final Integer Bp6() {
        return this.A01;
    }

    @Override // X.InterfaceC110074xc
    public final Integer Bp7() {
        return this.A02;
    }

    @Override // X.InterfaceC110074xc
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateSegmentInfo", AbstractC225449x9.A00(this));
    }

    @Override // X.InterfaceC110074xc
    public final long getDurationInMs() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Integer num = this.A01;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        Integer num2 = this.A02;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return i3 + i2;
    }

    public C110064xb(Integer num, Integer num2, long j) {
        this.A00 = j;
        this.A01 = num;
        this.A02 = num2;
    }
}
