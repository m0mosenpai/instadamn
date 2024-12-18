package X;

import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Field;

/* renamed from: X.0iI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11020iI extends AbstractC05380Qm implements C0DH {
    public static Class A04;
    public static Field A05;
    public static Field A06;
    public static Field A07;
    public static Field A08;
    public static boolean A09;
    public static boolean A0A;
    public static final C03720In A0B = new C03720In("PauseActivityInfo");
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    @Override // X.AbstractC05380Qm
    public final boolean A04(Message message) {
        return A01(message, null);
    }

    @Override // X.AbstractC05380Qm
    public final boolean A06(Parcel parcel) {
        if (!A00()) {
            return false;
        }
        try {
            boolean z = false;
            if (parcel.readInt() != 0) {
                z = true;
            }
            this.A02 = z;
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            this.A03 = z2;
            this.A00 = parcel.readInt();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z3 = true;
            }
            this.A01 = z3;
            return true;
        } catch (Exception e) {
            A0B.A04("Failed to parse on paise data because the form was different than expected", e);
            return false;
        }
    }

    private boolean A00() {
        boolean z;
        C0H5 c0h5 = this.A0G;
        if (A0A) {
            z = !A09;
        } else {
            try {
                C0H3 c0h3 = C0H3.A02;
                Class A0G = c0h5.A0G(c0h3, "android.app.servertransaction.PauseActivityItem");
                A04 = A0G;
                Class cls = Boolean.TYPE;
                Field A052 = C0H5.A05(c0h3, A0G, cls, "mFinished");
                if (A052 != null) {
                    A052.setAccessible(true);
                }
                A07 = A052;
                Field A053 = C0H5.A05(c0h3, A0G, cls, "mUserLeaving");
                if (A053 != null) {
                    A053.setAccessible(true);
                }
                A08 = A053;
                Field A054 = C0H5.A05(c0h3, A0G, Integer.TYPE, "mConfigChanges");
                if (A054 != null) {
                    A054.setAccessible(true);
                }
                A05 = A054;
                Field A055 = C0H5.A05(c0h3, A0G, Boolean.TYPE, "mDontReport");
                if (A055 != null) {
                    A055.setAccessible(true);
                }
                A06 = A055;
                z = true;
            } catch (Exception e) {
                A0B.A0C(e, "Could not get Pause Activity ClientTransaction code", new Object[0]);
                z = false;
            }
            A09 = !z;
            A0A = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC05380Qm
    public final StringBuilder A03(StringBuilder sb, boolean z) {
        if (this.A0A) {
            sb.append(" finished: ");
            sb.append(this.A02);
            sb.append(" userLeaving: ");
            sb.append(this.A03);
            sb.append(" config: ");
            sb.append(this.A00);
            sb.append(" dontReport: ");
            sb.append(this.A01);
            return sb;
        }
        sb.append("Not yet parsed");
        return sb;
    }

    @Override // X.AbstractC05380Qm
    public final boolean A07(Parcelable parcelable, Object obj) {
        Class cls;
        C03720In c03720In;
        Object[] objArr;
        String str;
        String str2 = this.A0D.A03;
        if (A00() && (cls = A04) != null) {
            if (obj == null) {
                c03720In = AbstractC05380Qm.A0J;
                objArr = new Object[]{str2, cls};
                str = "Not activityLifecycleItem item found for %s so it is definitely not of type %s.";
            } else {
                Class<?> cls2 = obj.getClass();
                if (!cls.isAssignableFrom(cls2)) {
                    c03720In = AbstractC05380Qm.A0J;
                    objArr = new Object[]{str2, cls2, cls};
                    str = "Cannot parse ClientTransaction %s because the ActivityLifecycleItem class is %s when it should be assignable from %s.";
                } else {
                    Field field = A07;
                    Field field2 = A08;
                    Field field3 = A05;
                    Field field4 = A06;
                    if (field == null || field2 == null || field3 == null || field4 == null) {
                        c03720In = A0B;
                        objArr = new Object[0];
                        str = "Failed to parse on pause since we are missing some needed fields";
                    } else {
                        try {
                            this.A02 = field.getBoolean(obj);
                            this.A03 = field2.getBoolean(obj);
                            this.A00 = field3.getInt(obj);
                            this.A01 = field4.getBoolean(obj);
                            return true;
                        } catch (ClassCastException | IllegalAccessException e) {
                            A0B.A04("Failed to get on pause info from client transaction.", e);
                            return false;
                        }
                    }
                }
            }
            c03720In.A08(str, objArr);
        }
        return false;
    }

    private boolean A01(Message message, AbstractC05350Qi abstractC05350Qi) {
        int i;
        boolean z = false;
        if (!A00()) {
            return false;
        }
        boolean z2 = false;
        if (message.what == 102) {
            z2 = true;
        }
        int i2 = message.arg1;
        if (abstractC05350Qi != null) {
            i2 = abstractC05350Qi.A01(1, i2);
            i = abstractC05350Qi.A01(2, message.arg2);
        } else {
            i = message.arg2;
        }
        this.A02 = z2;
        boolean z3 = false;
        if ((i2 & 1) != 0) {
            z3 = true;
        }
        this.A03 = z3;
        this.A00 = i;
        if ((i2 & 2) != 0) {
            z = true;
        }
        this.A01 = z;
        return true;
    }

    @Override // X.AbstractC05380Qm
    public final boolean A05(Message message, AbstractC05350Qi abstractC05350Qi) {
        return A01(message, abstractC05350Qi);
    }
}
