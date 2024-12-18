package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3FV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FV extends C1I7 {
    public long A00 = -1;
    public Integer A01;
    public final C0JO A02;
    public final C18920wW A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC62602sz A05;
    public final Map A06;

    public final void A00(String str, Integer num, String str2) {
        String str3;
        C14360o3.A0B(str2, 1);
        Integer num2 = this.A01;
        if (num2 != null) {
            C11T.A06("This operation must be run on UI thread.");
            if (this.A01 != null && this.A00 != -1) {
                C25531Mh A0D = C25531Mh.A0D(this.A03);
                if (((AbstractC02600Aj) A0D).A00.isSampled()) {
                    long now = this.A02.now();
                    if (1 - num2.intValue() != 0) {
                        str3 = "feed_head_load";
                    } else {
                        str3 = "feed_tail_load";
                    }
                    A0D.A0R(DatePickerDialogModule.ARG_MODE, str3);
                    A0D.A0Q("time_elapsed", Long.valueOf(now - this.A00));
                    A0D.A0m(this.A04.getModuleName());
                    A0D.A0Q("version", 1L);
                    A0D.A0R("ranking_session_id", str);
                    A0D.A0R("reqeust_id", str2);
                    if (num == C05F.A0C) {
                        A0D.A0R("spinner_outcome", "content_loaded");
                        A0D.Cht();
                    } else {
                        this.A06.put(A0D, Long.valueOf(System.currentTimeMillis()));
                    }
                }
                this.A01 = null;
                this.A00 = -1L;
            }
        }
    }

    public C3FV(C0JO c0jo, C18920wW c18920wW, InterfaceC60442pS interfaceC60442pS, InterfaceC62602sz interfaceC62602sz) {
        this.A04 = interfaceC60442pS;
        this.A05 = interfaceC62602sz;
        this.A02 = c0jo;
        this.A03 = c18920wW;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A06 = linkedHashMap;
        C218914p c218914p = C218914p.A08;
        final WeakReference weakReference = new WeakReference(linkedHashMap);
        C218914p.A03(EnumC220415e.A03, new InterfaceC12870lZ(weakReference) { // from class: X.3FW
            public final WeakReference A00;

            {
                this.A00 = weakReference;
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                Integer num;
                String str;
                int A03 = C0f9.A03(-1012124305);
                WeakReference weakReference2 = this.A00;
                Map map = (Map) weakReference2.get();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        AbstractC02600Aj abstractC02600Aj = (AbstractC02600Aj) entry.getKey();
                        if (System.currentTimeMillis() - ((Number) entry.getValue()).longValue() < 7000) {
                            num = C05F.A01;
                        } else {
                            num = C05F.A00;
                        }
                        if (num.intValue() != 0) {
                            str = "app_background";
                        } else {
                            str = "surface_exit";
                        }
                        abstractC02600Aj.A0R("spinner_outcome", str);
                        abstractC02600Aj.Cht();
                    }
                }
                Map map2 = (Map) weakReference2.get();
                if (map2 != null) {
                    map2.clear();
                }
                if (weakReference2.get() == null) {
                    C218914p.A06(this);
                }
                C0f9.A0A(-777221000, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                C0f9.A0A(-652677703, C0f9.A03(99639608));
            }
        });
    }

    @Override // X.C1I7, X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(-819299535);
        C14360o3.A0B(c3fq, 0);
        int B6q = c3fq.B6q();
        int BM3 = c3fq.BM3();
        if (B6q <= BM3) {
            while (true) {
                if (C81203jp.A0B(c3fq, B6q) == EnumC81483kI.A0B) {
                    InterfaceC62602sz interfaceC62602sz = this.A05;
                    if (interfaceC62602sz.isLoading() && interfaceC62602sz.CL7()) {
                        Integer num = C05F.A01;
                        C11T.A06("This operation must be run on UI thread.");
                        if (this.A01 == null) {
                            this.A01 = num;
                            this.A00 = this.A02.now();
                        }
                    }
                }
                if (B6q == BM3) {
                    break;
                } else {
                    B6q++;
                }
            }
        }
        C0f9.A0A(2055303013, A03);
    }
}
