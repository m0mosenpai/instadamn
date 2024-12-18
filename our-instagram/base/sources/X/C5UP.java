package X;

/* renamed from: X.5UP, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5UP extends C5UQ {
    public C117685Ud A02(Object obj) {
        boolean z;
        InterfaceC74893Ye interfaceC74893Ye;
        boolean z2;
        C5UP c5up;
        C5UP c5up2 = this;
        if (this instanceof C5UO) {
            z = false;
            if (obj == null) {
                z = true;
            }
            interfaceC74893Ye = null;
            z2 = false;
            c5up = c5up2;
        } else {
            C117745Uk c117745Uk = (C117745Uk) c5up2;
            z = false;
            if (obj == null) {
                z = true;
            }
            interfaceC74893Ye = c117745Uk.A00;
            z2 = true;
            c5up = c117745Uk;
        }
        return new C117685Ud(c5up, interfaceC74893Ye, obj, z, z2);
    }
}
