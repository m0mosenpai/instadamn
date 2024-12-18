package X;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.mindeputils.IVerboseDebuggable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: X.0Qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05380Qm implements C0DH, IVerboseDebuggable {
    public static final C03720In A0J = new C03720In("FoundActivityLifecycleInfo");
    public Activity A00;
    public Intent A01;
    public ActivityInfo A02;
    public IBinder A03;
    public Parcelable A04;
    public AbstractC05350Qi A05;
    public Object A06;
    public Object A07;
    public final EnumC05430Qs A0D;
    public final C0Cz A0E;
    public final C0D6 A0F;
    public final C0H5 A0G;
    public final String A0H;
    public final boolean A0I;
    public WeakReference A08 = null;
    public WeakReference A09 = null;
    public boolean A0B = false;
    public boolean A0A = false;
    public boolean A0C = false;

    public abstract StringBuilder A03(StringBuilder sb, boolean z);

    public abstract boolean A04(Message message);

    public abstract boolean A05(Message message, AbstractC05350Qi abstractC05350Qi);

    public abstract boolean A06(Parcel parcel);

    public abstract boolean A07(Parcelable parcelable, Object obj);

    private boolean A00(Parcelable parcelable) {
        IBinder iBinder;
        C0Cz c0Cz;
        Object A01;
        C0D6 c0d6 = this.A0F;
        c0d6.getClass();
        try {
            Method method = c0d6.A06;
            if (method != null && (iBinder = (IBinder) method.invoke(parcelable, new Object[0])) != null && (A01 = (c0Cz = c0d6.A09).A01(iBinder)) != null) {
                if (!c0Cz.A02(iBinder, this, A01)) {
                    C0D6.A0D.A08("We were unable to parse activity info for %s from activity client record %s.", this.A0D.A03, A01);
                    return false;
                }
                return A07(parcelable, this.A07);
            }
            return false;
        } catch (Exception e) {
            C0D6.A0D.A0C(e, "Could not get activity lifecycle state for %s from the client transaction", this.A0D.A03);
            return false;
        }
    }

    @Override // X.C0DH
    public final boolean AWk() {
        IBinder iBinder;
        Class forName;
        Field[] A00;
        Field[] A002;
        Class cls;
        Parcelable parcelable;
        if (this.A0A) {
            return this.A0C;
        }
        if (!this.A0B) {
            return false;
        }
        try {
            WeakReference weakReference = this.A08;
            boolean z = false;
            if (weakReference != null) {
                Message message = (Message) weakReference.get();
                if (message != null) {
                    if (this.A0I) {
                        C0D6 c0d6 = this.A0F;
                        c0d6.getClass();
                        if (this.A04 == null) {
                            Object obj = message.obj;
                            if (obj != null && (cls = c0d6.A03) != null && cls.isAssignableFrom(obj.getClass()) && (parcelable = (Parcelable) obj) != null) {
                                this.A04 = parcelable;
                            }
                        }
                    }
                    Parcelable parcelable2 = this.A04;
                    if (parcelable2 != null) {
                        z = A00(parcelable2);
                    } else {
                        C0Cz c0Cz = this.A0E;
                        Object obj2 = message.obj;
                        if (obj2 != null) {
                            if (obj2 instanceof IBinder) {
                                IBinder iBinder2 = (IBinder) obj2;
                                if (!c0Cz.A02(iBinder2, this, c0Cz.A01(iBinder2))) {
                                }
                            } else {
                                C0H5 c0h5 = c0Cz.A0E;
                                Class<?> cls2 = obj2.getClass();
                                AbstractC05350Qi A003 = C0DE.A00(obj2);
                                if (A003 == null) {
                                    boolean z2 = C10980iE.A02;
                                    boolean z3 = !z2;
                                    if (!z2 && !C10980iE.A03) {
                                        try {
                                            forName = c0h5.forName("com.android.internal.os.SomeArgs");
                                            A00 = C10980iE.A00(forName, Object.class, "arg", 9);
                                        } catch (Exception e) {
                                            C0DF.A00.A03("Could not find SomeArgs class.", e);
                                        }
                                        if (A00 != null && (A002 = C10980iE.A00(forName, Integer.TYPE, "argi", 6)) != null) {
                                            Arrays.toString(A00);
                                            Arrays.toString(A002);
                                            C10980iE.A01 = forName;
                                            C10980iE.A05 = A00;
                                            C10980iE.A04 = A002;
                                            z3 = true;
                                            C10980iE.A02 = !z3;
                                            C10980iE.A03 = true;
                                        }
                                        z3 = false;
                                        C10980iE.A02 = !z3;
                                        C10980iE.A03 = true;
                                    }
                                    if (z3 && !(obj2 instanceof IBinder)) {
                                        Class cls3 = C10980iE.A01;
                                        cls3.getClass();
                                        if (cls3.isAssignableFrom(cls2)) {
                                            A003 = new C10980iE(obj2);
                                        }
                                    }
                                }
                                try {
                                    Object A03 = A003.A03(1);
                                    if (A03 != null) {
                                        try {
                                            IBinder iBinder3 = (IBinder) A03;
                                            if (iBinder3 != null && c0Cz.A02(iBinder3, this, c0Cz.A01(iBinder3))) {
                                                this.A05 = A003;
                                            }
                                        } catch (ClassCastException e2) {
                                            C0DF.A00.A03("Could not convert arg 1 to IBinder", e2);
                                        }
                                    }
                                } catch (C03800Iv e3) {
                                    C0DF.A00.A0A(e3, "Could not get SomeArgs object arg at %d.", 1);
                                }
                            }
                            AbstractC05350Qi abstractC05350Qi = this.A05;
                            z = abstractC05350Qi != null ? A05(message, abstractC05350Qi) : A04(message);
                        }
                    }
                }
                this.A0C |= z;
                this.A0A = true;
                return z;
            }
            WeakReference weakReference2 = this.A09;
            if (weakReference2 != null) {
                Parcel parcel = (Parcel) weakReference2.get();
                if (parcel != null) {
                    if (this.A0I) {
                        C0D6 c0d62 = this.A0F;
                        c0d62.getClass();
                        if (this.A04 == null) {
                            Parcelable A01 = c0d62.A01(parcel);
                            if (A01 != null) {
                                this.A04 = A01;
                            }
                        }
                    }
                    Parcelable parcelable3 = this.A04;
                    if (parcelable3 != null) {
                        z = A00(parcelable3);
                    } else {
                        C0Cz c0Cz2 = this.A0E;
                        try {
                            parcel.enforceInterface("android.app.IApplicationThread");
                            iBinder = parcel.readStrongBinder();
                        } catch (Exception e4) {
                            C0Cz.A0G.A05("Failed to parse a token from the parcel data.", e4);
                            iBinder = null;
                        }
                        if (c0Cz2.A02(iBinder, this, c0Cz2.A01(iBinder))) {
                            z = A06(parcel);
                        }
                    }
                }
            } else {
                z = true;
            }
            this.A0C |= z;
            this.A0A = true;
            return z;
        } finally {
        }
        WeakReference weakReference3 = null;
        this.A08 = weakReference3;
        this.A09 = weakReference3;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Activity ");
        Activity activity = this.A00;
        if (this.A0A) {
            str = "<Not Parsed>";
        } else {
            str = "Unknown";
        }
        if (activity != null) {
            str = activity.getClass().getName();
        }
        sb.append(str);
        sb.append(" Lifecycle ");
        sb.append(this.A0H);
        sb.append(" for ");
        sb.append(this.A0D.A03);
        sb.append(' ');
        A03(sb, false);
        return sb.toString();
    }

    public AbstractC05380Qm(EnumC05430Qs enumC05430Qs, C0Cz c0Cz, C0D6 c0d6, C0H5 c0h5, String str, boolean z) {
        this.A0H = str;
        this.A0G = c0h5;
        this.A0E = c0Cz;
        this.A0D = enumC05430Qs;
        this.A0F = c0d6;
        this.A0I = z;
    }

    public final void A02() {
        if (AWk()) {
        } else {
            throw new Exception();
        }
    }
}
