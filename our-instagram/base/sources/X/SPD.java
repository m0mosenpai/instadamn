package X;

import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class SPD {
    public boolean A00 = true;
    public final C63222SfT A01;
    public final InterfaceC65573Tn7 A02;
    public final C64104SzL A03;
    public final Object A04;

    public final void A01(SYG syg, InterfaceC16660sJ interfaceC16660sJ) {
        InterfaceC65615To6 interfaceC65615To6;
        LinkedHashMap A03;
        Map map;
        String str;
        InterfaceC65615To6 interfaceC65615To62;
        String str2;
        int i = syg.A00;
        InterfaceC65573Tn7 interfaceC65573Tn7 = this.A02;
        Map BOo = interfaceC65573Tn7.BOo();
        boolean z = this instanceof C60516R1x;
        if (i == 0) {
            if (z) {
                interfaceC65615To62 = this.A01.A00;
                str2 = "client_execute_iap_store_start_connection_success";
            } else if (this instanceof R22) {
                interfaceC65615To62 = this.A01.A00;
                str2 = "client_execute_iap_store_query_sku_details_success";
            } else if (this instanceof R21) {
                interfaceC65615To62 = this.A01.A00;
                str2 = "client_execute_iap_store_query_purchases_success";
            } else if (this instanceof R20) {
                interfaceC65615To62 = this.A01.A00;
                str2 = "client_execute_iap_store_query_purchase_hist_success";
            } else if (this instanceof C60517R1z) {
                interfaceC65615To62 = this.A01.A00;
                str2 = "client_execute_iap_store_query_product_details_success";
            } else if (this instanceof R23) {
                interfaceC65615To62 = this.A01.A00;
                str2 = "client_execute_iap_store_launch_billing_flow_success";
            } else {
                boolean z2 = this instanceof R1y;
                interfaceC65615To62 = this.A01.A00;
                if (z2) {
                    str2 = "client_execute_iap_store_consume_success";
                } else {
                    str2 = "client_execute_iap_store_acknowledge_purchases_success";
                }
            }
            interfaceC65615To62.Ci3(BOo, null, str2);
        } else {
            if (z) {
                interfaceC65615To6 = this.A01.A00;
                if (BOo == null) {
                    BOo = AbstractC06930Yk.A0E();
                }
                A03 = AbstractC06930Yk.A03(BOo);
                AbstractC63051SbX.A00(syg, A03);
                map = null;
                str = "client_execute_iap_store_start_connection_fail";
            } else if (this instanceof R22) {
                interfaceC65615To6 = this.A01.A00;
                if (BOo == null) {
                    BOo = AbstractC06930Yk.A0E();
                }
                A03 = AbstractC06930Yk.A03(BOo);
                AbstractC63051SbX.A00(syg, A03);
                map = null;
                str = "client_execute_iap_store_query_sku_details_fail";
            } else if (this instanceof R21) {
                interfaceC65615To6 = this.A01.A00;
                if (BOo == null) {
                    BOo = AbstractC06930Yk.A0E();
                }
                A03 = AbstractC06930Yk.A03(BOo);
                AbstractC63051SbX.A00(syg, A03);
                map = null;
                str = "client_execute_iap_store_query_purchases_fail";
            } else if (this instanceof R20) {
                interfaceC65615To6 = this.A01.A00;
                if (BOo == null) {
                    BOo = AbstractC06930Yk.A0E();
                }
                A03 = AbstractC06930Yk.A03(BOo);
                AbstractC63051SbX.A00(syg, A03);
                map = null;
                str = "client_execute_iap_store_query_purchase_hist_fail";
            } else if (this instanceof C60517R1z) {
                interfaceC65615To6 = this.A01.A00;
                if (BOo == null) {
                    BOo = AbstractC06930Yk.A0E();
                }
                A03 = AbstractC06930Yk.A03(BOo);
                AbstractC63051SbX.A00(syg, A03);
                map = null;
                str = "client_execute_iap_store_query_product_details_fail";
            } else if (this instanceof R23) {
                interfaceC65615To6 = this.A01.A00;
                if (BOo == null) {
                    BOo = AbstractC06930Yk.A0E();
                }
                A03 = AbstractC06930Yk.A03(BOo);
                AbstractC63051SbX.A00(syg, A03);
                map = null;
                str = "client_execute_iap_store_launch_billing_flow_fail";
            } else {
                boolean z3 = this instanceof R1y;
                interfaceC65615To6 = this.A01.A00;
                if (z3) {
                    if (BOo == null) {
                        BOo = AbstractC06930Yk.A0E();
                    }
                    A03 = AbstractC06930Yk.A03(BOo);
                    AbstractC63051SbX.A00(syg, A03);
                    map = null;
                    str = "client_execute_iap_store_consume_fail";
                } else {
                    if (BOo == null) {
                        BOo = AbstractC06930Yk.A0E();
                    }
                    A03 = AbstractC06930Yk.A03(BOo);
                    AbstractC63051SbX.A00(syg, A03);
                    map = null;
                    str = "client_execute_iap_store_acknowledge_purchases_fail";
                }
            }
            interfaceC65615To6.Ci3(A03, map, str);
        }
        if (AbstractC58319PtB.A1W(C64104SzL.A05, syg.A00) && interfaceC65573Tn7.AJu()) {
            long B2t = interfaceC65573Tn7.B2t();
            interfaceC65573Tn7.ECP();
            if (B2t > 0) {
                this.A03.A01.postDelayed(new TKR(this), B2t);
                return;
            } else {
                A00();
                return;
            }
        }
        if (this.A00 && syg.A00 == -1 && interfaceC65573Tn7.AJu()) {
            long B2t2 = interfaceC65573Tn7.B2t();
            interfaceC65573Tn7.ECP();
            this.A00 = false;
            C64104SzL c64104SzL = this.A03;
            c64104SzL.A04.add(this);
            Handler handler = c64104SzL.A01;
            if (B2t2 > 0) {
                handler.postDelayed(c64104SzL.A03, B2t2);
                return;
            } else {
                handler.post(c64104SzL.A03);
                return;
            }
        }
        interfaceC16660sJ.invoke(this.A04);
    }

    public final void A00() {
        InterfaceC65615To6 interfaceC65615To6;
        String str;
        InterfaceC65573Tn7 interfaceC65573Tn7 = this.A02;
        Map BOo = interfaceC65573Tn7.BOo();
        if (this instanceof C60516R1x) {
            interfaceC65615To6 = this.A01.A00;
            str = "client_execute_iap_store_start_connection_init";
        } else if (this instanceof R22) {
            interfaceC65615To6 = this.A01.A00;
            str = "client_execute_iap_store_query_sku_details_init";
        } else if (this instanceof R21) {
            interfaceC65615To6 = this.A01.A00;
            str = "client_execute_iap_store_query_purchases_init";
        } else if (this instanceof R20) {
            interfaceC65615To6 = this.A01.A00;
            str = "client_execute_iap_store_query_purchase_hist_init";
        } else if (this instanceof C60517R1z) {
            interfaceC65615To6 = this.A01.A00;
            str = "client_execute_iap_store_query_product_details_init";
        } else if (this instanceof R23) {
            interfaceC65615To6 = this.A01.A00;
            str = "client_execute_iap_store_launch_billing_flow_init";
        } else {
            boolean z = this instanceof R1y;
            interfaceC65615To6 = this.A01.A00;
            if (z) {
                str = "client_execute_iap_store_consume_init";
            } else {
                str = "client_execute_iap_store_acknowledge_purchases_init";
            }
        }
        interfaceC65615To6.Ci3(BOo, null, str);
        if (this.A00) {
            C64104SzL c64104SzL = this.A03;
            if (!c64104SzL.A00.A0F()) {
                C60516R1x c60516R1x = new C60516R1x(new C63702SsG(this, 0), interfaceC65573Tn7.AKs(), c64104SzL);
                ((SPD) c60516R1x).A00 = false;
                c60516R1x.A00();
                return;
            }
        }
        A02(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.SAL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.SAM, java.lang.Object] */
    public final void A02(Object obj) {
        if (this instanceof C60516R1x) {
            C60516R1x c60516R1x = (C60516R1x) this;
            C64104SzL c64104SzL = c60516R1x.A00;
            c64104SzL.A04.add(c60516R1x);
            c64104SzL.A01.post(c64104SzL.A03);
            return;
        }
        if (this instanceof R22) {
            R22 r22 = (R22) this;
            InterfaceC65318Thu interfaceC65318Thu = (InterfaceC65318Thu) obj;
            C14360o3.A0B(interfaceC65318Thu, 0);
            r22.A01.A00.A0E(r22.A00, interfaceC65318Thu);
            return;
        }
        if (this instanceof R21) {
            R21 r21 = (R21) this;
            InterfaceC65316Ths interfaceC65316Ths = (InterfaceC65316Ths) obj;
            C14360o3.A0B(interfaceC65316Ths, 0);
            r21.A01.A00.A0D(interfaceC65316Ths, r21.A00);
            return;
        }
        if (this instanceof R20) {
            R20 r20 = (R20) this;
            InterfaceC65315Thr interfaceC65315Thr = (InterfaceC65315Thr) obj;
            C14360o3.A0B(interfaceC65315Thr, 0);
            r20.A00.A00.A0C(interfaceC65315Thr, r20.A01);
            return;
        }
        if (this instanceof C60517R1z) {
            C60517R1z c60517R1z = (C60517R1z) this;
            InterfaceC65314Thq interfaceC65314Thq = (InterfaceC65314Thq) obj;
            C14360o3.A0B(interfaceC65314Thq, 0);
            c60517R1z.A01.A00.A0B(interfaceC65314Thq, c60517R1z.A00);
            return;
        }
        if (this instanceof R23) {
            R23 r23 = (R23) this;
            InterfaceC65344TiR interfaceC65344TiR = (InterfaceC65344TiR) obj;
            C14360o3.A0B(interfaceC65344TiR, 0);
            SYG A06 = r23.A02.A00.A06(r23.A00, r23.A01);
            C14360o3.A07(A06);
            interfaceC65344TiR.DOT(A06);
            return;
        }
        if (this instanceof R1y) {
            R1y r1y = (R1y) this;
            InterfaceC65313Thp interfaceC65313Thp = (InterfaceC65313Thp) obj;
            C14360o3.A0B(interfaceC65313Thp, 0);
            String str = r1y.A01;
            ?? obj2 = new Object();
            obj2.A00 = str;
            r1y.A00.A00.A0A(obj2, interfaceC65313Thp);
            return;
        }
        C60515R1w c60515R1w = (C60515R1w) this;
        InterfaceC65312Tho interfaceC65312Tho = (InterfaceC65312Tho) obj;
        C14360o3.A0B(interfaceC65312Tho, 0);
        String str2 = c60515R1w.A01;
        ?? obj3 = new Object();
        obj3.A00 = str2;
        c60515R1w.A00.A00.A08(obj3, interfaceC65312Tho);
    }

    public SPD(InterfaceC65573Tn7 interfaceC65573Tn7, C64104SzL c64104SzL, Object obj) {
        this.A04 = obj;
        this.A03 = c64104SzL;
        this.A02 = interfaceC65573Tn7;
        this.A01 = c64104SzL.A02;
    }
}
