package X;

import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class VWN {
    public static void A00(AnonymousClass182 anonymousClass182, C68837Vct c68837Vct) {
        anonymousClass182.A0d();
        VgA vgA = c68837Vct.A00;
        anonymousClass182.A0r("multi_relay_discovery");
        anonymousClass182.A0d();
        Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "turns", vgA.A01);
        while (A0q.hasNext()) {
            C69308VlG c69308VlG = (C69308VlG) A0q.next();
            if (c69308VlG != null) {
                anonymousClass182.A0d();
                String str = c69308VlG.A00;
                if (str != null) {
                    anonymousClass182.A0S("ip", str);
                }
                String str2 = c69308VlG.A01;
                if (str2 != null) {
                    anonymousClass182.A0S("ip_6", str2);
                }
                String str3 = c69308VlG.A02;
                if (str3 != null) {
                    anonymousClass182.A0S("ssl_tcp_port", str3);
                }
                String str4 = c69308VlG.A03;
                if (str4 != null) {
                    anonymousClass182.A0S("tcp_port", str4);
                }
                String str5 = c69308VlG.A04;
                if (str5 != null) {
                    anonymousClass182.A0S("udp_port", str5);
                }
                anonymousClass182.A0a();
            }
        }
        anonymousClass182.A0Z();
        Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "edgerays", vgA.A00);
        while (A0q2.hasNext()) {
            C69246VkF c69246VkF = (C69246VkF) A0q2.next();
            if (c69246VkF != null) {
                anonymousClass182.A0d();
                String str6 = c69246VkF.A00;
                if (str6 != null) {
                    anonymousClass182.A0S("ip", str6);
                }
                String str7 = c69246VkF.A01;
                if (str7 != null) {
                    anonymousClass182.A0S("ip_6", str7);
                }
                String str8 = c69246VkF.A02;
                if (str8 != null) {
                    anonymousClass182.A0S("secret", str8);
                }
                String str9 = c69246VkF.A03;
                if (str9 != null) {
                    anonymousClass182.A0S("token", str9);
                }
                anonymousClass182.A0a();
            }
        }
        anonymousClass182.A0Z();
        anonymousClass182.A0a();
        anonymousClass182.A0a();
    }
}
