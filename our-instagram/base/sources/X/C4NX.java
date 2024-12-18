package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4NX, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4NX {
    public static C4NQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C4NQ c4nq = new C4NQ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                String str2 = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                if ("userId".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c4nq.A02 = str;
                } else if ("promotionId".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c4nq.A01 = str2;
                } else if ("primaryActionTimes".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf = Long.valueOf(c16l.A0y());
                            if (valueOf != null) {
                                arrayList2.add(valueOf);
                            }
                        }
                    }
                    c4nq.A05 = arrayList2;
                } else if ("secondaryActionTimes".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf2 = Long.valueOf(c16l.A0y());
                            if (valueOf2 != null) {
                                arrayList3.add(valueOf2);
                            }
                        }
                    }
                    c4nq.A06 = arrayList3;
                } else if ("dismissActionTimes".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf3 = Long.valueOf(c16l.A0y());
                            if (valueOf3 != null) {
                                arrayList4.add(valueOf3);
                            }
                        }
                    }
                    c4nq.A04 = arrayList4;
                } else if ("impressionTimes".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf4 = Long.valueOf(c16l.A0y());
                            if (valueOf4 != null) {
                                arrayList5.add(valueOf4);
                            }
                        }
                    }
                    c4nq.A03 = arrayList5;
                } else if ("totalDismissTimes".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf5 = Long.valueOf(c16l.A0y());
                            if (valueOf5 != null) {
                                arrayList.add(valueOf5);
                            }
                        }
                    }
                    c4nq.A07 = arrayList;
                } else if ("endTime".equals(A0q)) {
                    c4nq.A00 = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            if (c4nq.A02 != null) {
                if (c4nq.A01 != null) {
                    if (c4nq.A00 != null) {
                        if (c4nq.A05 == null) {
                            c4nq.A05 = new ArrayList();
                        }
                        if (c4nq.A06 == null) {
                            c4nq.A06 = new ArrayList();
                        }
                        if (c4nq.A04 == null) {
                            c4nq.A04 = new ArrayList();
                        }
                        if (c4nq.A03 == null) {
                            c4nq.A03 = new ArrayList();
                        }
                        if (c4nq.A07 == null) {
                            c4nq.A07 = new ArrayList();
                            return c4nq;
                        }
                        return c4nq;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C4NQ c4nq) {
        anonymousClass182.A0d();
        String str = c4nq.A02;
        if (str != null) {
            anonymousClass182.A0S("userId", str);
        }
        String str2 = c4nq.A01;
        if (str2 != null) {
            anonymousClass182.A0S("promotionId", str2);
        }
        if (c4nq.A05 != null) {
            C16V.A03(anonymousClass182, "primaryActionTimes");
            for (Number number : c4nq.A05) {
                if (number != null) {
                    anonymousClass182.A0i(number.longValue());
                }
            }
            anonymousClass182.A0Z();
        }
        if (c4nq.A06 != null) {
            C16V.A03(anonymousClass182, "secondaryActionTimes");
            for (Number number2 : c4nq.A06) {
                if (number2 != null) {
                    anonymousClass182.A0i(number2.longValue());
                }
            }
            anonymousClass182.A0Z();
        }
        if (c4nq.A04 != null) {
            C16V.A03(anonymousClass182, "dismissActionTimes");
            for (Number number3 : c4nq.A04) {
                if (number3 != null) {
                    anonymousClass182.A0i(number3.longValue());
                }
            }
            anonymousClass182.A0Z();
        }
        if (c4nq.A03 != null) {
            C16V.A03(anonymousClass182, "impressionTimes");
            for (Number number4 : c4nq.A03) {
                if (number4 != null) {
                    anonymousClass182.A0i(number4.longValue());
                }
            }
            anonymousClass182.A0Z();
        }
        if (c4nq.A07 != null) {
            C16V.A03(anonymousClass182, "totalDismissTimes");
            for (Number number5 : c4nq.A07) {
                if (number5 != null) {
                    anonymousClass182.A0i(number5.longValue());
                }
            }
            anonymousClass182.A0Z();
        }
        Long l = c4nq.A00;
        if (l != null) {
            anonymousClass182.A0R("endTime", l.longValue());
        }
        anonymousClass182.A0a();
    }
}
