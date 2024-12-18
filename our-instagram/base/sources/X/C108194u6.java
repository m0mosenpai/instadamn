package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsExampleData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4u6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108194u6 implements InterfaceC108204u7 {
    public List A00;
    public boolean A01;
    public IgSignalsExampleData A02;
    public boolean A03;
    public final UserSession A04;
    public final InterfaceC09390do A05;

    public C108194u6(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A05 = AbstractC09440dt.A01(new C9EM(this, 40));
        this.A03 = true;
    }

    public final void A01(C22977ABb c22977ABb) {
        A00(this);
        List list = this.A00;
        if (list != null) {
            this.A01 = true;
            C22977ABb c22977ABb2 = (C22977ABb) AbstractC001800i.A0L(list);
            if (c22977ABb2 != null && c22977ABb2.A02 == c22977ABb.A02) {
                this.A01 = true;
                return;
            }
            list.add(c22977ABb);
            if (list.size() <= 200) {
                return;
            }
            list.remove(0);
        }
    }

    public static final void A00(C108194u6 c108194u6) {
        if (c108194u6.A00 == null) {
            ArrayList arrayList = new ArrayList();
            String string = ((InterfaceC19630xq) c108194u6.A05.getValue()).getString(MSV.A00(1460), null);
            if (string == null) {
                string = "";
            }
            for (String str : AbstractC001900j.A0R(string, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0)) {
                C14360o3.A0B(str, 0);
                List A0R = AbstractC001900j.A0R(str, new String[]{";"}, 0);
                if (A0R.size() == 4) {
                    int parseInt = Integer.parseInt((String) A0R.get(0));
                    long parseLong = Long.parseLong((String) A0R.get(1));
                    long parseLong2 = Long.parseLong((String) A0R.get(2));
                    int parseInt2 = Integer.parseInt((String) A0R.get(3));
                    Integer[] A00 = C05F.A00(3);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            Integer num = A00[i];
                            if (A18.A00(num) == parseInt2) {
                                if (num != null) {
                                    arrayList.add(new C22977ABb(num, parseInt, parseLong, parseLong2));
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            c108194u6.A00 = arrayList;
            arrayList.size();
        }
    }

    @Override // X.InterfaceC108204u7
    public final IgSignalsExampleData EKW(String str) {
        IgSignalsExampleData igSignalsExampleData = this.A02;
        this.A02 = null;
        if (igSignalsExampleData == null && this.A03) {
            String string = ((InterfaceC19630xq) this.A05.getValue()).getString("open_tab_model_example", null);
            if (string == null) {
                string = "";
            }
            if (string.length() != 0) {
                C3R9[] c3r9Arr = IgSignalsExampleData.A06;
                igSignalsExampleData = IgSignalsExampleData.Companion.A00(string);
            }
        }
        if (this.A03) {
            InterfaceC19610xo ARD = ((InterfaceC19630xq) this.A05.getValue()).ARD();
            ARD.EEj("open_tab_model_example");
            ARD.apply();
            this.A03 = false;
        }
        return igSignalsExampleData;
    }

    @Override // X.InterfaceC108204u7
    public final void Eou(IgSignalsExampleData igSignalsExampleData) {
        String A02 = C5KX.A00(C25114B9k.A00, AbstractC73763Sg.A03).A02(igSignalsExampleData, C71739X0e.A00);
        this.A02 = igSignalsExampleData;
        this.A03 = true;
        InterfaceC19610xo ARD = ((InterfaceC19630xq) this.A05.getValue()).ARD();
        ARD.E7K("open_tab_model_example", A02);
        ARD.apply();
    }
}
