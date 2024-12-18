package X;

import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.3KL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KL {
    public AbstractC12990ll A01;
    public Handler A07;
    public boolean A08;
    public boolean A09;
    public final boolean A0A;
    public C114845Gu A00 = null;
    public String A04 = null;
    public boolean A06 = false;
    public String A03 = "";
    public String A02 = null;
    public WeakReference A05 = new WeakReference(null);

    public static C3KL A00(final AbstractC12990ll abstractC12990ll) {
        return (C3KL) abstractC12990ll.A01(C3KL.class, new InterfaceC16820sZ() { // from class: X.3KM
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C3KL(AbstractC12990ll.this);
            }
        });
    }

    private void A01() {
        C114845Gu c114845Gu = this.A00;
        if (c114845Gu != null && this.A06) {
            AbstractC12990ll abstractC12990ll = this.A01;
            C18920wW A00 = AbstractC12220kQ.A00((InterfaceC11380iw) c114845Gu.A01.A02, C12180kM.A05, abstractC12990ll);
            InterfaceC02590Ai A002 = A00.A00(A00.A00, AbstractC111324zv.A00(2564));
            A002.AAP("event_trace_id", this.A00.A03);
            A002.AAk("tracking", this.A00.A04);
            A002.AAP("dest_module_uri", this.A03);
            A002.AAP("extra_dest_module", this.A02);
            A002.AAP(MSV.A00(1013), AbstractC123905j4.A00);
            A002.Cht();
            if (!this.A0A) {
                String str = this.A02;
                String str2 = this.A03;
                GestureDetectorOnGestureListenerC72583Nf gestureDetectorOnGestureListenerC72583Nf = (GestureDetectorOnGestureListenerC72583Nf) this.A05.get();
                if (str != null && gestureDetectorOnGestureListenerC72583Nf != null) {
                    gestureDetectorOnGestureListenerC72583Nf.A00(str, str2);
                }
            }
            this.A06 = false;
            this.A00 = null;
            this.A03 = "";
            this.A02 = null;
            C3N0.A00(abstractC12990ll).EQ7(null);
        }
    }

    public static void A02(C3KL c3kl, boolean z) {
        long j;
        AbstractC12990ll abstractC12990ll = c3kl.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (z) {
            j = 37155955351420944L;
        } else {
            j = 37155955351355407L;
        }
        double A00 = C18U.A00(c06090Tz, abstractC12990ll, j);
        C114845Gu c114845Gu = c3kl.A00;
        if (c114845Gu != null) {
            if ((System.currentTimeMillis() - c114845Gu.A00) / 1000.0d >= A00 && (c114845Gu.A01.A02 instanceof InterfaceC11380iw)) {
                AbstractC46580KjJ.A00(abstractC12990ll);
            }
        }
    }

    public static boolean A03(C3KL c3kl, long j) {
        if ((System.currentTimeMillis() - j) / 1000.0d >= C18U.A00(C06090Tz.A05, c3kl.A01, 37154903084236806L)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.5Gu, java.lang.Object] */
    public final void A04(C93574Hy c93574Hy, List list, List list2, int i, boolean z) {
        String AX2;
        C12180kM c12180kM;
        String str;
        Integer num;
        String A0H;
        C0x9 c0x9 = new C0x9();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C71353Hw c71353Hw = (C71353Hw) it.next();
            C19260xA c19260xA = new C19260xA();
            C19260xA.A00(c19260xA, Long.valueOf(((EnumC71343Hv) c71353Hw.A01).A00), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            Integer num2 = c71353Hw.A00;
            if (num2 != null) {
                C19260xA.A00(c19260xA, num2, "index");
            }
            String str2 = c71353Hw.A03;
            if (str2 != null) {
                C19260xA.A00(c19260xA, str2, AbstractC111324zv.A00(1339));
            }
            String str3 = c71353Hw.A02;
            if (str3 != null) {
                C19260xA.A00(c19260xA, str3, "product_id");
            }
            c0x9.A00.add(c19260xA);
        }
        ?? obj = new Object();
        obj.A03 = UUID.randomUUID().toString();
        obj.A04 = list;
        obj.A01 = c93574Hy;
        obj.A05 = list2;
        obj.A00 = System.currentTimeMillis();
        obj.A02 = c0x9;
        Object obj2 = c93574Hy.A01;
        Long l = null;
        if (obj2 instanceof C38321qM) {
            AbstractC12990ll abstractC12990ll = this.A01;
            if ((abstractC12990ll instanceof UserSession) && (A0H = AbstractC41071vF.A0H((UserSession) abstractC12990ll, ((C38321qM) obj2).getId())) != null) {
                try {
                    l = Long.valueOf(Long.parseLong(A0H));
                } catch (NumberFormatException unused) {
                    C18950wb.A01.AEp(AnonymousClass001.A0R(AbstractC43591JPw.A00(115), A0H), 817902424).report();
                }
            }
        }
        Object obj3 = c93574Hy.A01;
        String str4 = null;
        if (obj3 instanceof C38321qM) {
            C38321qM c38321qM = (C38321qM) obj3;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Integer num3 = ((C71353Hw) it2.next()).A00;
                if (num3 != null) {
                    C38321qM A1e = c38321qM.A1e(num3.intValue());
                    if (A1e != null) {
                        str4 = A1e.A0C.Azz();
                    } else {
                        str4 = null;
                    }
                    if (str4 != null) {
                        break;
                    }
                }
            }
        }
        Object obj4 = c93574Hy.A01;
        String str5 = null;
        if (obj4 instanceof C38321qM) {
            C38321qM c38321qM2 = (C38321qM) obj4;
            Iterator it3 = list2.iterator();
            while (it3.hasNext() && ((num = ((C71353Hw) it3.next()).A00) == null || (str5 = c38321qM2.A3B(num.intValue())) == null)) {
            }
        }
        A02(this, true);
        this.A00 = obj;
        C3u8 c3u8 = obj.A01.A00;
        if (c3u8 == null) {
            AX2 = null;
        } else {
            AX2 = c3u8.AX2();
        }
        this.A04 = AX2;
        AbstractC12990ll abstractC12990ll2 = this.A01;
        C14360o3.A0B(abstractC12990ll2, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, abstractC12990ll2, 36320545558307497L) || !z) {
            C93574Hy c93574Hy2 = obj.A01;
            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) c93574Hy2.A02;
            if (c93574Hy2.A06) {
                c12180kM = C12180kM.A05;
            } else {
                c12180kM = C12180kM.A02;
            }
            C18920wW A00 = AbstractC12220kQ.A00(interfaceC11380iw, c12180kM, abstractC12990ll2);
            InterfaceC02590Ai A002 = A00.A00(A00.A00, AbstractC111324zv.A00(1021));
            ArrayList A02 = AbstractC123955j9.A02(obj);
            String str6 = C1QM.A00.A02.A00;
            A002.AAP("event_trace_id", obj.A03);
            A002.AAk("tracking", obj.A04);
            A002.AAk("tracking_nodes", A02);
            A002.A8p("gesture_type", Integer.valueOf(i));
            A002.AAP("nav_chain", str6);
            if (l != null) {
                A002.A9K("host_profile_id", l);
            }
            if (str4 != null) {
                A002.AAP("dynamic_creator_item_id", str4);
            }
            if (str5 != null) {
                A002.AAP("dynamic_item_id", str5);
            }
            A002.AAP("dest_uri", this.A04);
            if (C18U.A06(c06090Tz, abstractC12990ll2, 36317186893353822L)) {
                A002.AAP("correlation_id", AbstractC72593Ng.A00(abstractC12990ll2).Ary());
            }
            if (C18U.A06(c06090Tz, abstractC12990ll2, 36315580575911338L)) {
                C3N2 A003 = C3N0.A00(abstractC12990ll2);
                String CB3 = A003.CB3(C05F.A00);
                A002.AAP("trigger_id", CB3);
                A003.Ciu(CB3);
            }
            A002.Cht();
        }
        AbstractC46580KjJ.A00(abstractC12990ll2).A00 = obj;
        if (C18U.A06(C06090Tz.A06, abstractC12990ll2, 36320545558241960L)) {
            AbstractC39708Hje.A00(C3N0.A00(abstractC12990ll2), obj);
        }
        if (C18U.A06(c06090Tz, abstractC12990ll2, 36315580575255975L)) {
            Object obj5 = c93574Hy.A01;
            if (obj5 instanceof C38321qM) {
                str = ((C38321qM) obj5).A2u();
            } else {
                str = null;
            }
            C3N0.A00(abstractC12990ll2).EQ7(new IGD(list, new ArrayList(list2), str));
        }
    }

    public final void A06(String str) {
        C12180kM c12180kM;
        String AX2;
        C114845Gu c114845Gu = this.A00;
        if (c114845Gu != null && A03(this, c114845Gu.A00)) {
            C114845Gu c114845Gu2 = this.A00;
            ArrayList A02 = AbstractC123955j9.A02(c114845Gu2);
            AbstractC12990ll abstractC12990ll = this.A01;
            C93574Hy c93574Hy = c114845Gu2.A01;
            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) c93574Hy.A02;
            if (c93574Hy.A06) {
                c12180kM = C12180kM.A05;
            } else {
                c12180kM = C12180kM.A02;
            }
            C18920wW A00 = AbstractC12220kQ.A00(interfaceC11380iw, c12180kM, abstractC12990ll);
            InterfaceC02590Ai A002 = A00.A00(A00.A00, "instagram_media_metrics_state_change");
            A002.AAP("event_trace_id", c114845Gu2.A03);
            A002.AAk("tracking", c114845Gu2.A04);
            A002.AAP("extra_dest_module", str);
            A002.AAk("tracking_nodes", A02);
            C3u8 c3u8 = c114845Gu2.A01.A00;
            if (c3u8 == null) {
                AX2 = null;
            } else {
                AX2 = c3u8.AX2();
            }
            A002.AAP("dest_module_uri", AX2);
            A002.Cht();
            this.A00 = null;
            C3N0.A00(abstractC12990ll).EQ7(null);
        }
    }

    public final void A07(String str) {
        if (!this.A09 && !this.A08) {
            this.A02 = str;
            return;
        }
        Handler handler = this.A07;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.A07 = handler;
        }
        handler.post(new J4L(this, str));
    }

    public final void A08(String str, String str2, String str3, java.util.Set set, long j, boolean z) {
        boolean z2 = this.A0A;
        String A00 = AbstractC58317Pt9.A00(4);
        if (z2) {
            if (set != null && set.contains(A00)) {
                GestureDetectorOnGestureListenerC72583Nf gestureDetectorOnGestureListenerC72583Nf = (GestureDetectorOnGestureListenerC72583Nf) this.A05.get();
                if (gestureDetectorOnGestureListenerC72583Nf != null) {
                    gestureDetectorOnGestureListenerC72583Nf.A00("webview", str);
                }
            } else {
                String str4 = this.A02;
                GestureDetectorOnGestureListenerC72583Nf gestureDetectorOnGestureListenerC72583Nf2 = (GestureDetectorOnGestureListenerC72583Nf) this.A05.get();
                if (str4 != null && gestureDetectorOnGestureListenerC72583Nf2 != null) {
                    gestureDetectorOnGestureListenerC72583Nf2.A00(str4, str);
                }
            }
        }
        C114845Gu c114845Gu = this.A00;
        if (c114845Gu != null && A03(this, c114845Gu.A00)) {
            this.A06 = true;
            this.A03 = str;
            if (C18U.A06(C06090Tz.A05, this.A01, 36311354327433726L) && set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(A00)) {
                        A07("webview");
                    }
                }
            }
            if (!this.A09 && !this.A08) {
                A01();
            }
        } else {
            A02(this, false);
        }
        C70104W4a A002 = C70104W4a.A00(this.A01);
        A002.A04 = str2;
        A002.A03 = Long.valueOf(j);
        A002.A05 = str3;
        Boolean valueOf = Boolean.valueOf(z);
        if (!str.isEmpty()) {
            if (str2 == null) {
                str2 = AbstractC111324zv.A00(2846);
            }
            C18920wW A003 = AbstractC12220kQ.A00(new C70681Wf2(A002, str2), C12180kM.A05, A002.A00);
            InterfaceC02590Ai A004 = A003.A00(A003.A00, "open_external_link_ig");
            if (valueOf.booleanValue()) {
                str = "";
            }
            A004.AAP("raw_url", str);
            A004.A9K("a_pk", A002.A01);
            A004.A9K("ad_id", A002.A02);
            A004.AAP("containermodule", A002.A04);
            A004.A9K("m_pk", A002.A03);
            A004.AAP("ranking_info_token", A002.A05);
            A004.Cht();
        }
        A002.A03 = null;
        A002.A01 = null;
        A002.A04 = null;
        A002.A02 = null;
    }

    public C3KL(AbstractC12990ll abstractC12990ll) {
        this.A01 = abstractC12990ll;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A08 = C18U.A06(c06090Tz, abstractC12990ll, 36311354327499263L);
        this.A09 = C18U.A06(c06090Tz, abstractC12990ll, 36311354327564800L);
        this.A0A = C18U.A06(c06090Tz, abstractC12990ll, 36311633502536353L);
    }

    public final void A05(Integer num) {
        boolean z;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                z = this.A08;
            } else {
                z = this.A09;
            }
            if (z) {
                A01();
                return;
            }
            return;
        }
        if (!this.A08) {
            return;
        }
        C114845Gu c114845Gu = this.A00;
        AbstractC12990ll abstractC12990ll = this.A01;
        if (!C18U.A06(C06090Tz.A05, abstractC12990ll, 36311530421158479L) && this.A06 && c114845Gu != null && (c114845Gu.A01.A02 instanceof InterfaceC11380iw)) {
            AbstractC46580KjJ.A00(abstractC12990ll);
        }
        this.A06 = false;
        this.A03 = "";
        this.A02 = null;
    }
}
