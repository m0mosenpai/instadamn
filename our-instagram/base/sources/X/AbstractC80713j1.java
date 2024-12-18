package X;

import com.google.common.collect.RegularImmutableMap;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.Map;

/* renamed from: X.3j1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC80713j1 {
    public OD3 A00;
    public final C13920nI A01 = C13920nI.A00;

    public final synchronized Object A01() {
        Object A00;
        OD3 od3 = this.A00;
        if (od3 != null) {
            A00 = od3.A02;
        } else {
            A00 = A00();
        }
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r1.A00) > com.facebook.proxygen.LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A03(java.lang.Object r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            X.OD3 r1 = r5.A00     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L27
            boolean r0 = r1.A01     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.A02     // Catch: java.lang.Throwable -> L2c
            boolean r0 = X.C2I7.A00(r0, r6)     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L24
            X.OD3 r1 = r5.A00     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r1.A01     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L27
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c
            long r0 = r1.A00     // Catch: java.lang.Throwable -> L2c
            long r3 = r3 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L27
        L24:
            r0 = 0
            r5.A00 = r0     // Catch: java.lang.Throwable -> L2c
        L27:
            r5.A02(r6)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r5)
            return
        L2c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC80713j1.A03(java.lang.Object):void");
    }

    public final synchronized void A04(Object obj, String str, boolean z) {
        if (z) {
            A02(obj);
        }
        OD3 od3 = this.A00;
        if (od3 != null && od3.A03.equals(str)) {
            if (z) {
                if (!od3.A01) {
                    od3.A01 = true;
                    od3.A00 = System.currentTimeMillis();
                }
            } else {
                this.A00 = null;
            }
        }
    }

    public final synchronized void A05(String str, Object obj) {
        this.A00 = new OD3(this.A01, obj, str);
    }

    public Object A00() {
        int i;
        boolean z;
        if (this instanceof C80813jB) {
            i = ((C80813jB) this).A00.A04;
        } else {
            if (this instanceof C80723j2) {
                z = ((C80723j2) this).A00.A2b;
            } else if (this instanceof C80733j3) {
                z = ((C80733j3) this).A00.A2d;
            } else {
                if (this instanceof C80863jG) {
                    Map map = ((C80863jG) this).A00.A2D;
                    if (map == null) {
                        return RegularImmutableMap.A02;
                    }
                    return map;
                }
                if (this instanceof C80933jN) {
                    return ((C80933jN) this).A00.A0x;
                }
                if (this instanceof C80903jK) {
                    return ((C80903jK) this).A00.A1p;
                }
                if (this instanceof C80793j9) {
                    z = ((C80793j9) this).A00.A2k;
                } else {
                    if (this instanceof C80963jQ) {
                        return Boolean.valueOf(Boolean.TRUE.equals(((C80963jQ) this).A00.A1W));
                    }
                    if (this instanceof C3j0) {
                        i = ((C3j0) this).A00.A0H;
                    } else if (this instanceof C80773j7) {
                        z = ((C80773j7) this).A00.A2l;
                    } else if (this instanceof C80883jI) {
                        z = ((C80883jI) this).A00.A2n;
                    } else if (this instanceof C80973jR) {
                        i = ((C80973jR) this).A00.A0A;
                    } else if (this instanceof C80763j6) {
                        z = ((C80763j6) this).A00.A2h;
                    } else if (this instanceof C80743j4) {
                        z = ((C80743j4) this).A00.A2c;
                    } else {
                        if (this instanceof C80823jC) {
                            return ((C80823jC) this).A00.A1j;
                        }
                        if (this instanceof C80953jP) {
                            i = ((C80953jP) this).A00.A05;
                        } else if (this instanceof C80803jA) {
                            z = ((C80803jA) this).A00.A2T;
                        } else if (this instanceof C80853jF) {
                            z = ((C80853jF) this).A00.A2I;
                        } else if (this instanceof C80843jE) {
                            z = ((C80843jE) this).A00.A2m;
                        } else if (this instanceof C80833jD) {
                            z = ((C80833jD) this).A00.A2S;
                        } else {
                            if (this instanceof C80943jO) {
                                return ((C80943jO) this).A00.A0Q;
                            }
                            if (this instanceof C80923jM) {
                                return ((C80923jM) this).A00.A1R;
                            }
                            i = ((C80913jL) this).A00.A0G;
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        return Integer.valueOf(i);
    }

    public void A02(Object obj) {
        if (this instanceof C80963jQ) {
            ((C80963jQ) this).A00.A1W = (Boolean) obj;
            return;
        }
        if (this instanceof C80733j3) {
            C80733j3 c80733j3 = (C80733j3) this;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                return;
            }
            c80733j3.A00.A2d = bool.booleanValue();
            return;
        }
        if (this instanceof C80933jN) {
            ((C80933jN) this).A00.A0x = (DirectThreadThemeInfo) obj;
            return;
        }
        if (this instanceof C80923jM) {
            ((C80923jM) this).A00.A1R = (C1118752z) obj;
            return;
        }
        if (this instanceof C80903jK) {
            ((C80903jK) this).A00.A1p = (String) obj;
            return;
        }
        if (this instanceof C80883jI) {
            C80883jI c80883jI = (C80883jI) this;
            Boolean bool2 = (Boolean) obj;
            if (bool2 == null) {
                return;
            }
            c80883jI.A00.A2n = bool2.booleanValue();
            return;
        }
        if (this instanceof C80823jC) {
            ((C80823jC) this).A00.A1j = (String) obj;
            return;
        }
        if (this instanceof C80813jB) {
            C80813jB c80813jB = (C80813jB) this;
            Number number = (Number) obj;
            if (number == null) {
                return;
            }
            c80813jB.A00.A04 = number.intValue();
            return;
        }
        if (this instanceof C80793j9) {
            C80793j9 c80793j9 = (C80793j9) this;
            Boolean bool3 = (Boolean) obj;
            if (bool3 == null) {
                return;
            }
            c80793j9.A00.A2k = bool3.booleanValue();
            return;
        }
        if (this instanceof C80773j7) {
            C80773j7 c80773j7 = (C80773j7) this;
            Boolean bool4 = (Boolean) obj;
            if (bool4 == null) {
                return;
            }
            c80773j7.A00.A2l = bool4.booleanValue();
            return;
        }
        if (this instanceof C80763j6) {
            C80763j6 c80763j6 = (C80763j6) this;
            Boolean bool5 = (Boolean) obj;
            if (bool5 == null) {
                return;
            }
            c80763j6.A00.A2h = bool5.booleanValue();
            return;
        }
        if (this instanceof C80743j4) {
            C80743j4 c80743j4 = (C80743j4) this;
            Boolean bool6 = (Boolean) obj;
            if (bool6 == null) {
                return;
            }
            c80743j4.A00.A2c = bool6.booleanValue();
            return;
        }
        if (this instanceof C80723j2) {
            C80723j2 c80723j2 = (C80723j2) this;
            Boolean bool7 = (Boolean) obj;
            if (bool7 == null) {
                return;
            }
            c80723j2.A00.A2b = bool7.booleanValue();
            return;
        }
        if (this instanceof C3j0) {
            C3j0 c3j0 = (C3j0) this;
            Number number2 = (Number) obj;
            if (number2 == null) {
                return;
            }
            c3j0.A00.A0H = number2.intValue();
            return;
        }
        if (this instanceof C80973jR) {
            C80973jR c80973jR = (C80973jR) this;
            Number number3 = (Number) obj;
            if (number3 == null) {
                return;
            }
            c80973jR.A00.A0A = number3.intValue();
            return;
        }
        if (this instanceof C80953jP) {
            C80953jP c80953jP = (C80953jP) this;
            Number number4 = (Number) obj;
            if (number4 == null) {
                return;
            }
            c80953jP.A00.A05 = number4.intValue();
            return;
        }
        if (this instanceof C80863jG) {
            C80863jG c80863jG = (C80863jG) this;
            Map map = (Map) obj;
            if (map == null) {
                return;
            }
            c80863jG.A00.A2D = map;
            return;
        }
        if (this instanceof C80853jF) {
            C80853jF c80853jF = (C80853jF) this;
            Boolean bool8 = (Boolean) obj;
            if (bool8 == null) {
                return;
            }
            c80853jF.A00.A2I = bool8.booleanValue();
            return;
        }
        if (this instanceof C80843jE) {
            C80843jE c80843jE = (C80843jE) this;
            Boolean bool9 = (Boolean) obj;
            if (bool9 == null) {
                return;
            }
            c80843jE.A00.A2m = bool9.booleanValue();
            return;
        }
        if (this instanceof C80833jD) {
            C80833jD c80833jD = (C80833jD) this;
            Boolean bool10 = (Boolean) obj;
            if (bool10 == null) {
                return;
            }
            c80833jD.A00.A2S = bool10.booleanValue();
            return;
        }
        if (this instanceof C80913jL) {
            C80913jL c80913jL = (C80913jL) this;
            Number number5 = (Number) obj;
            if (number5 == null) {
                return;
            }
            c80913jL.A00.A0G = number5.intValue();
            return;
        }
        if (this instanceof C80803jA) {
            C80803jA c80803jA = (C80803jA) this;
            Boolean bool11 = (Boolean) obj;
            if (bool11 == null) {
                return;
            }
            c80803jA.A00.A2T = bool11.booleanValue();
            return;
        }
        ((C80943jO) this).A00.A0Q = (C9BO) obj;
    }
}
