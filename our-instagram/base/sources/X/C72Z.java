package X;

import java.io.StringWriter;
import java.util.List;
import java.util.Locale;

/* renamed from: X.72Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C72Z {
    public static C50627MWo A00;
    public static String A01;
    public static final C72Z A02 = new Object();

    public static final String A00() {
        String str;
        synchronized (A02) {
            str = A01;
            if (str == null) {
                C50627MWo c50627MWo = A00;
                if (c50627MWo != null) {
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    A0A.A0d();
                    List<C26087BgG> list = (List) c50627MWo.A01;
                    if (list != null) {
                        C16V.A03(A0A, "push_notifications");
                        for (C26087BgG c26087BgG : list) {
                            if (c26087BgG != null) {
                                A0A.A0d();
                                if (((Integer) c26087BgG.A01) != null) {
                                    String lowerCase = "NOTIFICATION_CLICKED".toLowerCase(Locale.ROOT);
                                    C14360o3.A07(lowerCase);
                                    A0A.A0S("source_event_type", lowerCase);
                                }
                                Long l = (Long) c26087BgG.A00;
                                if (l != null) {
                                    A0A.A0R("timestamp", l.longValue());
                                }
                                String str2 = c26087BgG.A03;
                                if (str2 != null) {
                                    A0A.A0S("landing_path", str2);
                                }
                                QJ0 qj0 = (QJ0) c26087BgG.A02;
                                if (qj0 != null) {
                                    A0A.A0r("notification_context");
                                    A0A.A0d();
                                    String str3 = qj0.A01;
                                    if (str3 != null) {
                                        A0A.A0S("notification_delivery_id", str3);
                                    }
                                    String str4 = qj0.A03;
                                    if (str4 != null) {
                                        A0A.A0S("recipient_ig_id", str4);
                                    }
                                    String str5 = qj0.A02;
                                    if (str5 != null) {
                                        A0A.A0S("notification_type", str5);
                                    }
                                    String str6 = qj0.A04;
                                    if (str6 != null) {
                                        A0A.A0S("sender_ig_id", str6);
                                    }
                                    Integer num = (Integer) qj0.A00;
                                    if (num != null) {
                                        A0A.A0Q("notification_channel", num.intValue());
                                    }
                                    A0A.A0a();
                                }
                                A0A.A0a();
                            }
                        }
                        A0A.A0Z();
                    }
                    List<C26086BgF> list2 = (List) c50627MWo.A00;
                    if (list2 != null) {
                        C16V.A03(A0A, "af_notifications");
                        for (C26086BgF c26086BgF : list2) {
                            if (c26086BgF != null) {
                                A0A.A0d();
                                if (((Integer) c26086BgF.A00) != null) {
                                    String lowerCase2 = "NOTIFICATION_CLICKED".toLowerCase(Locale.ROOT);
                                    C14360o3.A07(lowerCase2);
                                    A0A.A0S("source_event_type", lowerCase2);
                                }
                                Long l2 = (Long) c26086BgF.A02;
                                if (l2 != null) {
                                    A0A.A0R("timestamp", l2.longValue());
                                }
                                String str7 = c26086BgF.A03;
                                if (str7 != null) {
                                    A0A.A0S("af_agg_id", str7);
                                }
                                String str8 = c26086BgF.A04;
                                if (str8 != null) {
                                    A0A.A0S("landing_path", str8);
                                }
                                C45126Jxv c45126Jxv = (C45126Jxv) c26086BgF.A01;
                                if (c45126Jxv != null) {
                                    A0A.A0r("notification_context");
                                    A0A.A0d();
                                    String str9 = c45126Jxv.A02;
                                    if (str9 != null) {
                                        A0A.A0S("notification_type", str9);
                                    }
                                    String str10 = c45126Jxv.A03;
                                    if (str10 != null) {
                                        A0A.A0S("recipient_ig_id", str10);
                                    }
                                    List<Long> list3 = (List) c45126Jxv.A00;
                                    if (list3 != null) {
                                        C16V.A03(A0A, "mentioned_user_ids");
                                        for (Long l3 : list3) {
                                            if (l3 != null) {
                                                A0A.A0i(l3.longValue());
                                            }
                                        }
                                        A0A.A0Z();
                                    }
                                    String str11 = c45126Jxv.A01;
                                    if (str11 != null) {
                                        A0A.A0S("notification_channel", str11);
                                    }
                                    A0A.A0a();
                                }
                                A0A.A0a();
                            }
                        }
                        A0A.A0Z();
                    }
                    A0A.A0a();
                    A0A.close();
                    str = stringWriter.toString();
                    C14360o3.A07(str);
                } else {
                    str = null;
                }
                A01 = str;
            }
        }
        return str;
    }

    public static final void A01(C50627MWo c50627MWo) {
        synchronized (A02) {
            A01 = null;
            A00 = c50627MWo;
        }
    }
}
