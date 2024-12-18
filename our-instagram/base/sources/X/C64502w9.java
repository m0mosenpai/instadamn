package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.2w9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64502w9 implements InterfaceC43071ya {
    public static final Long A06 = 2L;
    public Queue A00;
    public boolean A01;
    public final C18920wW A02;
    public final C64482w7 A03;
    public final InterfaceC60442pS A04;
    public final C64512wA A05 = new C64512wA();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0lZ, java.lang.Object, X.2wB] */
    public C64502w9(C18920wW c18920wW, C64482w7 c64482w7, InterfaceC60442pS interfaceC60442pS) {
        LinkedList linkedList = new LinkedList();
        this.A00 = linkedList;
        this.A01 = false;
        this.A04 = interfaceC60442pS;
        this.A02 = c18920wW;
        this.A03 = c64482w7;
        C218914p c218914p = C218914p.A08;
        ?? obj = new Object();
        obj.A01 = linkedList;
        obj.A00 = new WeakReference(this);
        c218914p.A0A(obj);
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String str;
        Integer num;
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0 && intValue != 1) {
            C64512wA c64512wA = this.A05;
            long j = c64512wA.A00;
            if (j != -1) {
                long BmE = interfaceC57162jr.BmE() - j;
                c64512wA.A00 = -1L;
                if (BmE >= 250 && ((InterfaceC62602sz) c59062n7.A03).CL7()) {
                    C25531Mh A0D = C25531Mh.A0D(this.A02);
                    if (((AbstractC02600Aj) A0D).A00.isSampled()) {
                        if (this.A01) {
                            num = C05F.A00;
                        } else {
                            num = C05F.A0C;
                        }
                        A0D.A0R(DatePickerDialogModule.ARG_MODE, c64512wA.A02);
                        A0D.A0Q("time_elapsed", Long.valueOf(BmE));
                        A0D.A0m(this.A04.getModuleName());
                        A0D.A0Q("version", A06);
                        A0D.A0Q("spinner_position", Long.valueOf(c64512wA.A01));
                        A0D.A0R("ranking_session_id", c64512wA.A03);
                        A0D.A0R("reqeust_id", c64512wA.A04);
                        if (num == C05F.A0C) {
                            A0D.A0R("spinner_outcome", "content_loaded");
                            A0D.Cht();
                        } else {
                            Queue queue = this.A00;
                            synchronized (queue) {
                                queue.add(A0D);
                            }
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: X.TLv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Queue<C25531Mh> queue2 = C64502w9.this.A00;
                                    synchronized (queue2) {
                                        for (C25531Mh c25531Mh : queue2) {
                                            c25531Mh.A0R("spinner_outcome", "surface_exit");
                                            c25531Mh.Cht();
                                        }
                                        queue2.clear();
                                    }
                                }
                            }, 10000L);
                        }
                    }
                    this.A01 = false;
                    return;
                }
                return;
            }
            return;
        }
        C64512wA c64512wA2 = this.A05;
        this.A01 = false;
        if (interfaceC57162jr.CGk(c59062n7) >= 0.5f && c64512wA2.A00 <= -1) {
            C61842rl c61842rl = this.A03.A04;
            c64512wA2.A01 = c61842rl.A00;
            String str2 = "";
            String str3 = c61842rl.A0J;
            if (str3 == null) {
                str3 = "";
            }
            c64512wA2.A04 = str3;
            String str4 = c61842rl.A0I;
            if (str4 != null) {
                str2 = str4;
            }
            c64512wA2.A03 = str2;
            c64512wA2.A00 = interfaceC57162jr.BmE();
            if ("feed_timeline".equals(this.A04.getModuleName()) && c61842rl.A0M) {
                str = "feed_head_load_streaming";
            } else {
                str = "feed_tail_load";
            }
            c64512wA2.A02 = str;
        }
        long BmE2 = interfaceC57162jr.BmE() - c64512wA2.A00;
        C64482w7 c64482w7 = this.A03;
        if ((C18U.A06(C06090Tz.A05, c64482w7.A02, 36322916379405035L) && !c64512wA2.A02.equals("feed_tail_load")) || BmE2 < 250) {
            return;
        }
        InterfaceC62612t0 interfaceC62612t0 = c64482w7.A01;
        if (interfaceC62612t0 != null) {
            interfaceC62612t0.AD4();
        }
        c64482w7.A03.AD4();
    }
}
