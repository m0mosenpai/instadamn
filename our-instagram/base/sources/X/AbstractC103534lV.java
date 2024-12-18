package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4lV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC103534lV {
    public static C103574lZ parseFromJson(C16L c16l) {
        C0KX c0kx;
        String str;
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            C103584la c103584la = null;
            String str4 = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str5 = null;
            ArrayList arrayList4 = null;
            String str6 = null;
            E8L e8l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("carrier_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("carrier_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("carrier_signal_config".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            URW parseFromJson = AbstractC53790Nqg.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("content_type_pricing_map".equals(A0q)) {
                    c103584la = AbstractC225589xd.parseFromJson(c16l);
                } else if ("deadline".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("enabled_wallet_defs_keys".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList2.add(A1P2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("features".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList3.add(A1P);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("mqtt_host".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("request_time".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("rewrite_rules".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C103554lX parseFromJson2 = AbstractC103544lW.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList4.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("token_hash".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("ttl".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("zero_balance_detection_config".equals(A0q)) {
                    e8l = AbstractC33771Evx.parseFromJson(c16l);
                } else if ("zero_cms_fetch_interval_seconds".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("carrier_id", "ZeroToken");
            } else if (str3 != null || !(c16l instanceof C07950bF)) {
                if (arrayList == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("carrier_signal_config", "ZeroToken");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("deadline", "ZeroToken");
                } else if (arrayList2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("enabled_wallet_defs_keys", "ZeroToken");
                } else if (arrayList3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("features", "ZeroToken");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("request_time", "ZeroToken");
                } else if (arrayList4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("rewrite_rules", "ZeroToken");
                } else {
                    if (str6 == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "token_hash";
                    } else if (num2 != null || !(c16l instanceof C07950bF)) {
                        if (num3 == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "zero_cms_fetch_interval_seconds";
                        } else {
                            return new C103574lZ(e8l, c103584la, str2, str3, str4, str5, str6, arrayList, arrayList2, arrayList3, arrayList4, num.intValue(), num2.intValue(), num3.intValue());
                        }
                    } else {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "ttl";
                    }
                    c0kx.A00(str, "ZeroToken");
                }
            } else {
                ((C07950bF) c16l).A03.A00("carrier_name", "ZeroToken");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
