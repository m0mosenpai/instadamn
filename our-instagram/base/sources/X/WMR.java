package X;

import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes11.dex */
public final class WMR implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public WMR(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(247383473);
                int i2 = this.A01;
                UEx uEx = ((UGV) this.A02).A00;
                int i3 = uEx.A07.A03;
                Calendar A0l = AbstractC65702TsY.A0l();
                A0l.set(1, i2);
                A0l.set(2, i3);
                Month month = new Month(A0l);
                CalendarConstraints calendarConstraints = uEx.A04;
                Month month2 = calendarConstraints.A05;
                Calendar calendar = month.A05;
                if (calendar.compareTo(month2.A05) >= 0) {
                    Month month3 = calendarConstraints.A04;
                    if (calendar.compareTo(month3.A05) > 0) {
                        month = month3;
                    }
                    month2 = month;
                }
                uEx.A00(month2);
                uEx.A08 = C05F.A00;
                uEx.A01.setVisibility(8);
                uEx.A00.setVisibility(0);
                uEx.A00(uEx.A07);
                i = -195383731;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(1950524496);
                V0J v0j = (V0J) this.A02;
                C70399WUb c70399WUb = v0j.A00;
                if (c70399WUb == null) {
                    str = "logger";
                } else {
                    VG4 vg4 = VG4.A09;
                    List list = v0j.A01;
                    str = "listOfPreviewInfo";
                    if (list != null) {
                        int i4 = this.A01;
                        String str2 = ((C69216Vjj) list.get(i4)).A02;
                        if (str2 != null) {
                            c70399WUb.A0G(vg4, str2);
                            List list2 = v0j.A01;
                            if (list2 != null) {
                                V0J.A00(v0j, ((C69216Vjj) list2.get(i4)).A03);
                                i = -616243583;
                                C0f9.A0C(i, A05);
                                return;
                            }
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException("the webview preview title cannot be null");
                            C0f9.A0C(475158026, A05);
                            throw illegalStateException;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                A05 = C0f9.A05(1997385765);
                C685736u.A01(((C66418UGm) this.A02).A03, this.A01);
                i = 744052700;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(-2136712785);
                int i5 = this.A01;
                if (i5 != -1) {
                    UBD.A01((UBD) this.A02, i5);
                }
                i = 1781463337;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(416773525);
                X8S x8s = ((C69148Vid) this.A02).A02;
                if (x8s != null) {
                    int i6 = this.A01;
                    V1E v1e = ((C70989Wlz) x8s).A00;
                    List list3 = v1e.A0A;
                    if (list3 != null && list3.size() > i6) {
                        C38321qM c38321qM = (C38321qM) v1e.A0A.get(i6);
                        UserSession userSession = v1e.A01;
                        IgFragmentFactoryImpl.A00();
                        String id = c38321qM.getId();
                        C35028Fc1 c35028Fc1 = new C35028Fc1();
                        c35028Fc1.A0B = id;
                        c35028Fc1.A0E = AbstractC111324zv.A00(1311);
                        c35028Fc1.A0N = true;
                        C6XJ c6xj = new C6XJ(v1e.requireActivity(), c35028Fc1.A01(), userSession, ModalActivity.class, AbstractC111324zv.A00(525));
                        c6xj.A08();
                        c6xj.A0C(v1e.requireActivity());
                    }
                }
                i = -1847929717;
                C0f9.A0C(i, A05);
                return;
        }
    }
}
