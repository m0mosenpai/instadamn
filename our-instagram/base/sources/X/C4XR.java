package X;

import android.os.Looper;

/* renamed from: X.4XR, reason: invalid class name */
/* loaded from: classes2.dex */
public interface C4XR {
    public static final C4XR A00;

    @Deprecated
    public static final C4XR A01;

    C5T9 A7O(C4B6 c4b6, C4XY c4xy);

    int AtU(C4B6 c4b6);

    InterfaceC98614bg E55(C4B6 c4b6, C4XY c4xy);

    void E5P();

    void Eb4(Looper looper, C4WZ c4wz);

    void release();

    static {
        C4XR c4xr = new C4XR() { // from class: X.4XS
            @Override // X.C4XR
            public final /* synthetic */ void E5P() {
            }

            @Override // X.C4XR
            public final void Eb4(Looper looper, C4WZ c4wz) {
            }

            @Override // X.C4XR
            public final /* synthetic */ void release() {
            }

            @Override // X.C4XR
            public final C5T9 A7O(C4B6 c4b6, C4XY c4xy) {
                if (c4b6.A0O == null) {
                    return null;
                }
                return new WbZ(new C5PN(6001, new Exception()));
            }

            @Override // X.C4XR
            public final int AtU(C4B6 c4b6) {
                if (c4b6.A0O == null) {
                    return 0;
                }
                return 1;
            }

            @Override // X.C4XR
            public final /* synthetic */ InterfaceC98614bg E55(C4B6 c4b6, C4XY c4xy) {
                return InterfaceC98614bg.A00;
            }
        };
        A00 = c4xr;
        A01 = c4xr;
    }
}
