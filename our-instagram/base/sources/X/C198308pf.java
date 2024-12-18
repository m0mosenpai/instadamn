package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;

/* renamed from: X.8pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198308pf {
    public Bitmap A00;
    public Bitmap A01;
    public C183978Ee A02;
    public C195868lW A03;
    public boolean A04;
    public final EnumC198268pb A05;
    public final String A06;

    public C198308pf(C183978Ee c183978Ee) {
        this(null, c183978Ee, c183978Ee.A0h, false);
    }

    public final Medium A00() {
        if (this.A05.ordinal() != 0) {
            C195868lW c195868lW = this.A03;
            c195868lW.getClass();
            return c195868lW.A0R;
        }
        C183978Ee c183978Ee = this.A02;
        c183978Ee.getClass();
        return c183978Ee.A0F;
    }

    public final String A01() {
        if (this.A05.ordinal() != 0) {
            C195868lW c195868lW = this.A03;
            c195868lW.getClass();
            return c195868lW.A0h;
        }
        C183978Ee c183978Ee = this.A02;
        c183978Ee.getClass();
        return c183978Ee.A06();
    }

    public final String A02() {
        if (this.A05.ordinal() != 0) {
            C195868lW c195868lW = this.A03;
            c195868lW.getClass();
            return c195868lW.A0k;
        }
        C183978Ee c183978Ee = this.A02;
        c183978Ee.getClass();
        return c183978Ee.A06();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C198308pf)) {
            return false;
        }
        C198308pf c198308pf = (C198308pf) obj;
        if (this.A05 != c198308pf.A05) {
            return false;
        }
        return AbstractC50102Ry.A00(this.A06, c198308pf.A06);
    }

    public final int hashCode() {
        return this.A06.hashCode();
    }

    public C198308pf(Bitmap bitmap, C183978Ee c183978Ee, String str, boolean z) {
        this.A04 = false;
        this.A05 = EnumC198268pb.A04;
        this.A02 = c183978Ee;
        this.A06 = str;
        this.A01 = bitmap;
        this.A04 = z;
    }

    public C198308pf(Bitmap bitmap, C195868lW c195868lW, String str) {
        this.A04 = false;
        this.A05 = EnumC198268pb.A07;
        this.A03 = c195868lW;
        this.A06 = str;
        this.A00 = bitmap;
    }

    public C198308pf(C195868lW c195868lW, String str) {
        this.A04 = false;
        this.A05 = EnumC198268pb.A07;
        this.A03 = c195868lW;
        this.A06 = str;
    }

    public C198308pf(C195868lW c195868lW) {
        this(c195868lW, c195868lW.A07());
    }
}
