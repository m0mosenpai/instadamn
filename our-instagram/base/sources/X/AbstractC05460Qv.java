package X;

import com.facebook.common.mindeputils.IVerboseDebuggable;
import java.lang.reflect.Field;

/* renamed from: X.0Qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05460Qv implements IVerboseDebuggable {
    public static final C03720In A09 = new C03720In("ActivityLifecycleCode");
    public int A01;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public int A00 = -19842;
    public boolean A03 = false;
    public boolean A02 = false;

    public abstract Class A01(C0Cz c0Cz, C0H5 c0h5);

    public abstract Field A03(C0H5 c0h5, Class cls, String str);

    public final int A00() {
        int i = this.A00;
        if (i == -19842) {
            int i2 = this.A01;
            if (i2 == -19842) {
                return this.A04;
            }
            return i2;
        }
        return i;
    }

    public final String A02() {
        String str;
        StringBuilder sb = new StringBuilder("Lifecycle ");
        sb.append(AbstractC03770Is.A01(this.A07));
        sb.append(" Code: ");
        if (A04()) {
            sb.append(A00());
            sb.append(" ");
            if (this.A03 && this.A00 != -19842) {
                str = "certain";
            } else {
                if (this.A02) {
                    if (this.A01 != -19842) {
                        str = "sketchy";
                    } else {
                        str = "guessed";
                    }
                }
                sb.append("<Needs Processing>");
            }
            sb.append(str);
        } else {
            if (this.A02) {
                str = "Unknown";
                sb.append(str);
            }
            sb.append("<Needs Processing>");
        }
        return sb.toString();
    }

    public final boolean A04() {
        if (this.A01 != -19842 || ((this.A03 && this.A00 != -19842) || this.A04 != -19842)) {
            return true;
        }
        return false;
    }

    public AbstractC05460Qv(String str, String str2, String str3, int i, boolean z) {
        this.A07 = str;
        this.A04 = i;
        this.A06 = str2;
        this.A08 = z;
        this.A05 = str3;
        this.A01 = i;
    }

    public final String toString() {
        return A02();
    }
}
