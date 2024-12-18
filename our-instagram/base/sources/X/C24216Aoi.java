package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Aoi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24216Aoi implements BE4 {
    public C90Z A00;

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
        C90Z c90z;
        String str;
        C14360o3.A0B(bundle, 0);
        if (this.A00 != null && bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 1) {
                if (bundle.containsKey("amplitudes") && bundle.containsKey("timings")) {
                    float[] floatArray = bundle.getFloatArray("amplitudes");
                    float[] floatArray2 = bundle.getFloatArray("timings");
                    if (floatArray != null && floatArray2 != null) {
                        int length = floatArray2.length;
                        if (length != floatArray.length) {
                            str = "Vibration timings and amplitudes must be the same size";
                        } else if (length > 1000) {
                            str = "Vibrations exceeded limit";
                        } else {
                            for (float f : floatArray2) {
                                if (f < 0.0f) {
                                    str = "Vibration timings must be positive";
                                } else {
                                    for (float f2 : floatArray) {
                                        if (f2 < 0.0f || f2 > 1.0f) {
                                            str = "Amplitudes must be normalized between [0,1]";
                                        }
                                    }
                                    C90Z c90z2 = this.A00;
                                    if (c90z2 != null) {
                                        c90z2.FDc(new C024409s(floatArray2), new C024409s(floatArray));
                                    }
                                }
                            }
                            return;
                        }
                        C0K8.A0C("HapticService", str);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 0) {
                C90Z c90z3 = this.A00;
                if (c90z3 == null) {
                    return;
                }
                c90z3.FDd();
                return;
            }
            if (i != 2 || (c90z = this.A00) == null) {
                return;
            }
            c90z.cancel();
        }
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return AbstractC167027dH.A08(37);
    }

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        C90Z c90z;
        if (anonymousClass904 != null) {
            C203848zt c203848zt = C90X.A01;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
                C90X c90x = (C90X) anonymousClass904.A02(c203848zt);
                if (c90x != null) {
                    c90z = c90x.A00;
                } else {
                    c90z = null;
                }
                this.A00 = c90z;
            }
        }
    }

    @Override // X.BE4
    public final List Epn() {
        return AbstractC166987dD.A1J(AbstractC167027dH.A08(37));
    }
}
