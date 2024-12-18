package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.gallery.Medium;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.8nP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196948nP implements Comparable {
    public int A00;
    public long A01;
    public EnumC198268pb A02;
    public C183978Ee A03;
    public C195868lW A04;
    public String A05;
    public final String A06;

    public static final void A00(Exception exc, String str) {
        C0f5 AEp = C18950wb.A01.AEp("CapturedMediaRecentsInfo", 817895516);
        AEp.ABW(DialogModule.KEY_MESSAGE, str);
        AEp.ERI(exc);
        AEp.report();
    }

    public final Medium A01() {
        EnumC198268pb enumC198268pb = this.A02;
        if (enumC198268pb != null) {
            int ordinal = enumC198268pb.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C195868lW c195868lW = this.A04;
                    if (c195868lW == null) {
                        return null;
                    }
                    return c195868lW.A0R;
                }
            } else {
                C183978Ee c183978Ee = this.A03;
                if (c183978Ee == null) {
                    return null;
                }
                return c183978Ee.A0F;
            }
        }
        throw new IllegalArgumentException("Invalid media type to get medium from.");
    }

    public final String A02() {
        EnumC198268pb enumC198268pb = this.A02;
        if (enumC198268pb != null) {
            int ordinal = enumC198268pb.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C195868lW c195868lW = this.A04;
                    if (c195868lW == null) {
                        return null;
                    }
                    return c195868lW.A0k;
                }
            } else {
                C183978Ee c183978Ee = this.A03;
                if (c183978Ee == null) {
                    return null;
                }
                return c183978Ee.A06();
            }
        }
        throw new IllegalArgumentException("Invalid media type to load thumbnail for.");
    }

    public final boolean A03() {
        Object obj;
        String A02;
        if (this.A02 == EnumC198268pb.A07) {
            obj = this.A04;
        } else {
            obj = this.A03;
        }
        if (obj != null && (A02 = A02()) != null && new File(A02).exists()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C196948nP c196948nP = (C196948nP) obj;
        C14360o3.A0B(c196948nP, 0);
        return C14360o3.A01(this.A01, c196948nP.A01);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (!(obj instanceof C196948nP)) {
            return false;
        }
        EnumC198268pb enumC198268pb = this.A02;
        C196948nP c196948nP = (C196948nP) obj;
        if (enumC198268pb != c196948nP.A02) {
            return false;
        }
        if (enumC198268pb == EnumC198268pb.A07) {
            obj2 = this.A04;
            obj3 = c196948nP.A04;
        } else {
            obj2 = this.A03;
            obj3 = c196948nP.A03;
        }
        return C14360o3.A0K(obj2, obj3);
    }

    public final int hashCode() {
        Object obj;
        if (this.A02 == EnumC198268pb.A07) {
            obj = this.A04;
        } else {
            obj = this.A03;
        }
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public C196948nP(C183978Ee c183978Ee) {
        this();
        this.A02 = EnumC198268pb.A04;
        this.A03 = c183978Ee;
        long j = c183978Ee.A0B;
        this.A01 = j <= 0 ? c183978Ee.A0A : j;
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AbstractC196958nQ.A00(A0A, c183978Ee);
            A0A.close();
            this.A05 = stringWriter.toString();
        } catch (IOException e) {
            A00(e, "Failed to process photo");
        }
    }

    public C196948nP(C195868lW c195868lW) {
        this();
        this.A02 = EnumC198268pb.A07;
        this.A04 = c195868lW;
        this.A01 = c195868lW.A0M;
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            C9NR.A00(A0A, c195868lW);
            A0A.close();
            this.A05 = stringWriter.toString();
        } catch (IOException e) {
            A00(e, "Failed to process video in ctor");
        }
    }

    public C196948nP() {
        String str = null;
        if (this.A02 == EnumC198268pb.A07) {
            C195868lW c195868lW = this.A04;
            if (c195868lW != null) {
                str = c195868lW.A07();
            }
        } else {
            C183978Ee c183978Ee = this.A03;
            if (c183978Ee != null) {
                str = c183978Ee.A0h;
            }
        }
        this.A06 = str;
    }
}
