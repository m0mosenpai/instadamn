package X;

import android.content.Context;
import android.view.Choreographer;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC69603Au implements InterfaceC12870lZ {
    public int A00;
    public boolean A01;
    public C63082tl A02;
    public boolean A03;
    public final C2LR A09;
    public final java.util.Set A08 = new HashSet();
    public final java.util.Set A07 = new HashSet();
    public final java.util.Set A06 = new HashSet();
    public boolean A04 = true;
    public final C006802i A05 = C006802i.A0p;

    public void A05() {
    }

    public final C69613Av A02(String str) {
        C69613Av c69613Av = new C69613Av(this, str);
        this.A07.add(c69613Av);
        this.A06.add(c69613Av);
        return c69613Av;
    }

    public void A03() {
        if (this.A08.isEmpty()) {
            A0A(AwakeTimeSinceBootClock.INSTANCE.now(), (short) 2);
        }
    }

    public void A04() {
        if (!this.A01) {
            Iterator it = this.A07.iterator();
            while (it.hasNext()) {
                ((C69613Av) it.next()).A00 = C05F.A00;
            }
        }
    }

    public final void A06() {
        if (this.A01) {
            boolean z = this.A04;
            C006802i c006802i = this.A05;
            int A01 = A01();
            if (z) {
                c006802i.dropAllInstancesOfMarker(A01);
            } else {
                c006802i.markerDrop(A01, this.A00);
            }
            this.A01 = false;
        }
    }

    public final void A07() {
        if (this.A01) {
            this.A03 = true;
            final long now = AwakeTimeSinceBootClock.INSTANCE.now();
            C218914p c218914p = C218914p.A08;
            C14270nr.A00().A01(new AbstractRunnableC14200nk() { // from class: X.6rY
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(609);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC69603Au.this.A0A(now, (short) 4);
                }
            }, 5500L);
        }
    }

    public final void A08() {
        if (this.A01) {
            this.A03 = true;
            A0A(AwakeTimeSinceBootClock.INSTANCE.now(), (short) 4);
        }
    }

    public void A0A(long j, short s) {
        if (this.A01 && s != 2) {
            java.util.Set set = this.A08;
            if (!set.isEmpty()) {
                String[] strArr = new String[set.size()];
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    strArr[i] = ((C69613Av) it.next()).A02;
                    i++;
                }
                if (this.A01) {
                    this.A05.markerAnnotate(A01(), this.A00, "remaining_components", strArr);
                }
                C2ZI.A00.A09(A01(), "remaining_components", strArr);
            }
        }
        if (this.A01) {
            if (!this.A03 || s != 2) {
                C63082tl c63082tl = this.A02;
                if (c63082tl != null) {
                    C63032tg A01 = c63082tl.A01();
                    A0G("1_frame_drop_bucket", A01.A01);
                    A0F("4_frame_drop_bucket", A01.A00);
                }
                C2LR c2lr = this.A09;
                if (c2lr != null && c2lr.A02 && c2lr.A01) {
                    A0G("user_sample_rate", c2lr.A00);
                }
                A05();
                this.A01 = false;
                this.A03 = false;
                this.A05.markerEnd(A01(), this.A00, s, j, TimeUnit.MILLISECONDS);
                C218914p.A06(this);
            }
        }
    }

    public final void A0B(Context context) {
        C008002u A00;
        if (this.A02 == null) {
            C14360o3.A0B(context, 0);
            InterfaceC63062tj interfaceC63062tj = (InterfaceC63062tj) C62992tc.A01.getValue();
            C14360o3.A0B(interfaceC63062tj, 0);
            C15920qm c15920qm = AbstractC15930qn.A02;
            if (c15920qm.A0a) {
                boolean z = c15920qm.A0Z;
                float f = C63012te.A00;
                A00 = new C008002u(Float.valueOf(60.0f));
                C19L c19l = C63012te.A04;
                AbstractC23641Du.A05(AnonymousClass191.A00, new D4w(context, (InterfaceC23621Ds) null, A00, 80, z), c19l);
            } else {
                A00 = C10E.A00(Float.valueOf(C63012te.A03.A00(context, 80)));
            }
            AnonymousClass059 A02 = AbstractC208910l.A02(A00);
            Choreographer choreographer = Choreographer.getInstance();
            C14360o3.A07(choreographer);
            this.A02 = new C63082tl((C63102tn) C63082tl.A0B.getValue(), interfaceC63062tj, new C63072tk(choreographer), A02, true);
        }
    }

    public void A0C(C69613Av c69613Av, String str, long j) {
        if (this.A01) {
            this.A05.markerPoint(A01(), this.A00, AnonymousClass001.A0R(c69613Av.A02, "_start"), str, j, TimeUnit.MILLISECONDS);
        }
        C2ZI.A00.A07(A01(), AnonymousClass001.A0R(c69613Av.A02, "_start"), str, j);
    }

    public final void A0D(C69613Av c69613Av, String str, boolean z) {
        if (this.A01) {
            C006802i c006802i = this.A05;
            int A01 = A01();
            c006802i.markerPoint(A01, this.A00, AnonymousClass001.A0R(c69613Av.A02, "_failed"));
            if (str != null) {
                c006802i.markerAnnotate(A01, this.A00, "error_message", str);
            }
            if (z) {
                A0A(AwakeTimeSinceBootClock.INSTANCE.now(), (short) 3);
            }
        }
        C2ZI c2zi = C2ZI.A00;
        int A012 = A01();
        c2zi.A01(A012, AnonymousClass001.A0R(c69613Av.A02, "_failed"));
        if (str != null) {
            C2ZI.A00.A06(A012, "error_message", str);
        }
    }

    public final void A0E(String str) {
        if (this.A01) {
            this.A05.markerPoint(A01(), this.A00, str);
        }
        C2ZI.A00.A01(A01(), str);
    }

    public final void A0F(String str, float f) {
        if (this.A01) {
            this.A05.markerAnnotate(A01(), this.A00, str, f);
        }
        C2ZI.A00.A02(A01(), str, f);
    }

    public final void A0G(String str, int i) {
        if (this.A01) {
            this.A05.markerAnnotate(A01(), this.A00, str, i);
        }
        C2ZI.A00.A03(A01(), str, i);
    }

    public final void A0H(String str, long j) {
        if (this.A01) {
            this.A05.markerPoint(A01(), this.A00, str, j, TimeUnit.MILLISECONDS);
        }
        C2ZI.A00.A05(A01(), str, j);
    }

    public final void A0I(String str, Long l) {
        if (this.A01) {
            this.A05.markerAnnotate(A01(), this.A00, str, l.longValue());
        }
        C2ZI.A00.A04(A01(), str, l.longValue());
    }

    public final void A0J(String str, String str2) {
        if (this.A01) {
            this.A05.markerAnnotate(A01(), this.A00, str, str2);
        }
        C2ZI.A00.A06(A01(), str, str2);
    }

    public final void A0K(String str, boolean z) {
        if (this.A01) {
            this.A05.markerAnnotate(A01(), this.A00, str, z);
        }
        C2ZI.A00.A08(A01(), str, z);
    }

    public AbstractC69603Au(AbstractC12990ll abstractC12990ll) {
        this.A09 = (C2LR) abstractC12990ll.A00(C2LR.class);
    }

    public final void A09(long j) {
        int A01 = A01();
        if (this.A01) {
            C0w9.A03("BaseNavigationPerfLogger", "Starting navigation logging while logging in progress!!");
            A06();
        }
        C218914p.A03(EnumC220415e.A03, this);
        java.util.Set set = this.A08;
        set.clear();
        set.addAll(this.A07);
        A04();
        int hashCode = C0HM.A00().hashCode();
        this.A00 = hashCode;
        C006802i c006802i = this.A05;
        c006802i.markerStart(A01, hashCode, j, TimeUnit.MILLISECONDS);
        c006802i.markerAnnotate(A01, this.A00, "APP_STARTUP_TIME_BUCKET", C1CC.A00());
        C2ZI.A00.A03(A01, "APP_STARTUP_TIME_BUCKET", C1CC.A00());
        C63082tl c63082tl = this.A02;
        if ((c006802i.isMarkerOn(A01, this.A00) || c006802i.isMarkerOn(A01)) && c63082tl != null) {
            c63082tl.A01();
            c63082tl.A02();
        }
        this.A01 = true;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1739856572);
        C218914p c218914p = C218914p.A08;
        A0A(AwakeTimeSinceBootClock.INSTANCE.now() - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, (short) 630);
        C0f9.A0A(1087518353, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(132611307, C0f9.A03(1786099256));
    }

    public int A01() {
        return 31784991;
    }
}
