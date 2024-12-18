package X;

import android.app.ActivityThread;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Method;

/* renamed from: X.0D6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0D6 {
    public static C0D6 A0C;
    public static final C03720In A0D = new C03720In("ClientTranLifecycleHelper");
    public static final Object A0E = new Object();
    public static volatile boolean A0F;
    public static volatile boolean A0G;
    public Object A04;
    public Method A08;
    public final C0Cz A09;
    public final C0D8 A0A;
    public final C0H5 A0B;
    public ActivityThread A00 = null;
    public Class A03 = null;
    public Method A07 = null;
    public Method A06 = null;
    public Parcelable.Creator A01 = null;
    public Class A02 = null;
    public Method A05 = null;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0D6 A00(X.C0H5 r11) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D6.A00(X.0H5):X.0D6");
    }

    public final Parcelable A01(Parcel parcel) {
        Parcelable parcelable;
        if (parcel == null) {
            return null;
        }
        parcel.enforceInterface("android.app.IApplicationThread");
        try {
            Parcelable.Creator creator = this.A01;
            if (creator == null) {
                A0D.A07("Cannot get the ClientTransaction obj since we are missing the CREATOR inst", new Object[0]);
                parcelable = null;
            } else {
                parcelable = (Parcelable) parcel.readTypedObject(creator);
            }
        } catch (ClassCastException e) {
            A0D.A06("Trouble reading a client transaction object from the given parcel.", e, new Object[0], 6, 0);
            parcelable = null;
        }
        if (parcelable == null) {
            A0D.A08("Can't create a client transaction obj from the given data since we don't know how to parse it", new Object[0]);
            return null;
        }
        return parcelable;
    }

    public C0D6(C0Cz c0Cz, C0H5 c0h5) {
        this.A0B = c0h5;
        this.A09 = c0Cz;
        this.A0A = new C0D8(c0Cz, c0h5);
    }
}
