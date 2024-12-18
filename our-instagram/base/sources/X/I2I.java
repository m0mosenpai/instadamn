package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I2I {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.IEq, java.lang.Object] */
    public static C41021IEq parseFromJson(C16L c16l) {
        Integer num;
        C38321qM c38321qM;
        C3XG c3xg;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    ArrayList arrayList = null;
                    if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                        obj.A00 = AbstractC167017dG.A0m(c16l);
                    } else if ("modules".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                try {
                                    IKO iko = new IKO();
                                    if (c16l.A11() != c16r) {
                                        c16l.A0z();
                                        iko = null;
                                    } else {
                                        while (c16l.A1J() != c16r2) {
                                            String A0s = AbstractC166997dE.A0s(c16l);
                                            if ("feed_item".equals(A0s)) {
                                                iko.A06 = I2H.parseFromJson(c16l);
                                            } else if ("question_list".equals(A0s)) {
                                                iko.A01 = IPM.parseFromJson(c16l);
                                            } else if ("reel".equals(A0s)) {
                                                iko.A07 = AbstractC38741r6.parseFromJson(c16l);
                                            } else if ("clips_item".equals(A0s)) {
                                                iko.A00 = AbstractC111024zE.parseFromJson(c16l);
                                            } else if ("business_card".equals(A0s)) {
                                                iko.A04 = AbstractC40656I0o.parseFromJson(c16l);
                                            }
                                            c16l.A0z();
                                        }
                                        IGZ igz = iko.A06;
                                        if (igz != null) {
                                            iko.A08 = C05F.A00;
                                            C38321qM c38321qM2 = igz.A01;
                                            if (c38321qM2 != null) {
                                                iko.A03 = c38321qM2;
                                            } else {
                                                IGY igy = igz.A02;
                                                if (igy != null) {
                                                    c38321qM2 = igy.A00;
                                                    iko.A03 = c38321qM2;
                                                    if (c38321qM2 != null) {
                                                        c38321qM2.A0C.EUh(igy.A01);
                                                    }
                                                } else {
                                                    C88523xA c88523xA = igz.A00;
                                                    if (c88523xA != null) {
                                                        C88533xB c88533xB = new C88533xB(c88523xA);
                                                        c3xg = new C3XG(c88533xB, C1XV.A0H, c88533xB.getId());
                                                        iko.A02 = c3xg;
                                                    } else {
                                                        C0w9.A03("SurveyModule", "Error parsing feed_item in SurveyModule");
                                                    }
                                                }
                                            }
                                            c3xg = C3XH.A01(c38321qM2);
                                            iko.A02 = c3xg;
                                        } else {
                                            if (iko.A01 != null) {
                                                num = C05F.A01;
                                            } else {
                                                C37771pE c37771pE = iko.A07;
                                                if (c37771pE != null) {
                                                    iko.A08 = C05F.A0C;
                                                    c38321qM = AbstractC25225BEi.A0x(AbstractC37741pB.A05(c37771pE), 0);
                                                } else {
                                                    C111034zF c111034zF = iko.A00;
                                                    if (c111034zF != null) {
                                                        iko.A08 = C05F.A0N;
                                                        c38321qM = c111034zF.A00;
                                                    } else if (iko.A04 != null) {
                                                        num = C05F.A0Y;
                                                    } else {
                                                        num = C05F.A0j;
                                                    }
                                                }
                                                iko.A03 = c38321qM;
                                            }
                                            iko.A08 = num;
                                        }
                                    }
                                    C14360o3.A0A(iko);
                                    if (iko != null) {
                                        arrayList.add(iko);
                                    }
                                } catch (IOException e) {
                                    throw e;
                                } catch (Exception e2) {
                                    throw AbstractC166987dD.A0m(e2);
                                }
                            }
                        }
                        obj.A01 = arrayList;
                    } else {
                        continue;
                    }
                    c16l.A0z();
                } else {
                    return obj;
                }
            }
        } catch (IOException e3) {
            throw e3;
        } catch (Exception e4) {
            throw AbstractC166987dD.A0m(e4);
        }
    }
}
