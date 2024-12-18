package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class JUU implements InterfaceC43071ya {
    public final C160697Id A00;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        long j;
        String str;
        String str2;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        C160697Id c160697Id = this.A00;
        Object obj = c59062n7.A03;
        C160787Im c160787Im = (C160787Im) obj;
        C83403nh c83403nh = c160787Im.A0e;
        String A0h = c83403nh.A0h();
        C005001p c005001p = c160697Id.A00;
        String str3 = A0h;
        if (A0h == null) {
            str3 = "";
        }
        JVX jvx = (JVX) c005001p.get(str3);
        if (jvx == null) {
            jvx = new JVX();
            if (A0h == null) {
                A0h = "";
            }
            c005001p.put(A0h, jvx);
        }
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0 && intValue != 1) {
            long BmE = interfaceC57162jr.BmE();
            long j2 = jvx.A00;
            if (j2 >= 0) {
                long j3 = BmE - j2;
                jvx.A02 += j3;
                long j4 = jvx.A01;
                if (j4 < j3) {
                    j4 = j3;
                }
                jvx.A01 = j4;
                jvx.A00 = -1L;
            }
            C14360o3.A06(obj);
            int i = c160787Im.A0G.A08;
            if (jvx.A02 >= 250) {
                Map map = c160697Id.A01;
                C160727Ig c160727Ig = (C160727Ig) map.get(Integer.valueOf(i));
                if (c160727Ig != null && ((Boolean) c160727Ig.A01.getValue()).booleanValue()) {
                    C160727Ig c160727Ig2 = (C160727Ig) map.get(Integer.valueOf(c160787Im.A0G.A08));
                    if (c160727Ig2 != null) {
                        C18920wW c18920wW = c160727Ig2.A00.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "igd_channels_message_impressions");
                        if (A00.isSampled()) {
                            C7TT c7tt = c160787Im.A0G;
                            int i2 = c7tt.A08;
                            int i3 = c7tt.A01;
                            if (i2 != 28) {
                                if (i2 != 29) {
                                    if (i2 != 32 && i2 != 62) {
                                        throw new Exception("Unsupported thread subtype");
                                    }
                                    str = "social";
                                } else if (i3 == 2) {
                                    str = AbstractC111324zv.A00(535);
                                } else {
                                    str = "broadcast";
                                }
                            } else {
                                str = "subscriber_social";
                            }
                            A00.AAP("channel_type", str);
                            A00.AAP("action", "vpvd_impression");
                            A00.AAP("event", "message_viewed");
                            InterfaceC83733oI interfaceC83733oI = c160787Im.A0G.A0P;
                            if (interfaceC83733oI != null) {
                                str2 = AbstractC1345466e.A07(interfaceC83733oI);
                            } else {
                                str2 = null;
                            }
                            A00.AAP("ig_thread_id", str2);
                            A00.AAP("item_id", c83403nh.A0h());
                            A00.AAP("client_context_id", c83403nh.A0g());
                            A00.Cht();
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            jvx.A01 = 0L;
            jvx.A02 = 0L;
            return;
        }
        float CGk = interfaceC57162jr.CGk(c59062n7);
        long j5 = jvx.A00;
        if (j5 < 0 && CGk >= 0.5f) {
            j = interfaceC57162jr.BmE();
        } else if (j5 >= 0 && CGk < 0.5f) {
            long BmE2 = interfaceC57162jr.BmE() - j5;
            jvx.A02 += BmE2;
            long j6 = jvx.A01;
            if (j6 < BmE2) {
                j6 = BmE2;
            }
            jvx.A01 = j6;
            j = -1;
        } else {
            return;
        }
        jvx.A00 = j;
    }

    public JUU(C160697Id c160697Id) {
        this.A00 = c160697Id;
    }
}
