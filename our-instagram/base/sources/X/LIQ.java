package X;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class LIQ {
    public static final LIQ A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    public final C2EY A01(MS0 ms0, Integer num, Integer num2, Integer num3, Integer num4, String str) {
        AbstractC907342m A002;
        int intValue;
        if (num != null) {
            int intValue2 = num.intValue();
            if (intValue2 != 2 && intValue2 != 4) {
                if (intValue2 == 5) {
                    return C2EY.A1m;
                }
                if (intValue2 == 7) {
                    if (num2 != null && ((intValue = num2.intValue()) == 4000 || intValue == 4001 || intValue == 4002 || intValue == 4003 || intValue == 4004 || intValue == 4005 || intValue == 4006 || intValue == 4007)) {
                        return C2EY.A1k;
                    }
                    return C2EY.A0s;
                }
                if (intValue2 == 1) {
                    if (ms0 != 0 && (A002 = ((AbstractC907342m) ms0).A00(C44922Jua.class, "ig_avatar_sticker")) != null) {
                        JSONObject jSONObject = A002.A00;
                        boolean z = true;
                        if (jSONObject.optInt("is_avatar_sticker") != 1) {
                            z = false;
                        }
                        if (jSONObject.optBoolean("is_avatar_sticker", z)) {
                            return C2EY.A0O;
                        }
                    }
                    return C2EY.A1d;
                }
                if (intValue2 == 3) {
                    return C2EY.A0K;
                }
            } else {
                if (num3 != null && num3.intValue() == 8) {
                    return C2EY.A1l;
                }
                return C2EY.A1C;
            }
        } else {
            if (num4 != null && num4.intValue() == 2) {
                return C2EY.A0l;
            }
            if (num3 != null) {
                int intValue3 = num3.intValue();
                if (intValue3 == 1) {
                    return C2EY.A0G;
                }
                if (intValue3 != -2 && intValue3 != -1 && intValue3 != 5) {
                    if (intValue3 == 4) {
                        return C2EY.A1I;
                    }
                    if (intValue3 == 11) {
                        return C2EY.A0k;
                    }
                }
            }
            if (str == null) {
                str = "";
            }
            if (AbstractC85433rY.A07(str).isEmpty()) {
                return C2EY.A1i;
            }
            return C2EY.A19;
        }
        return C2EY.A1O;
    }

    public static final C2EY A00(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        interfaceC50520MRx.Ad2(i);
        String C5u = interfaceC50520MRx.C5u(i);
        if (C5u != null && c99e != null) {
            C5u = c99e.ANm(C5u);
        }
        return A00.A01(interfaceC50520MRx.Bkq(i), interfaceC50520MRx.Ad6(i), interfaceC50520MRx.CID(i), Integer.valueOf(interfaceC50520MRx.BSl(i)), Integer.valueOf(interfaceC50520MRx.BSk(i)), C5u);
    }
}
