package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.datepicker.IgDatePicker;
import com.instagram.igds.components.datepicker.IgTimePicker;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes11.dex */
public final class V1G extends AbstractC59962oe implements InterfaceC189488aT {
    public static final String __redex_internal_original_name = "DatePickerSheetFragment";
    public int A00;
    public int A01;
    public int A02 = 5;
    public InterfaceC58115Ppe A03;
    public IgDatePicker A04;
    public IgTimePicker A05;
    public String A06;
    public Calendar A07;
    public Date A08;
    public Date A09;
    public Date A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public UserSession A0E;
    public boolean A0F;

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d6  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1G.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(V1G v1g, int i, int i2) {
        Calendar calendar = v1g.A07;
        if (calendar != null) {
            calendar.set(1, v1g.A0D);
            Calendar calendar2 = v1g.A07;
            if (calendar2 != null) {
                calendar2.set(2, i);
                Calendar calendar3 = v1g.A07;
                if (calendar3 != null) {
                    calendar3.set(5, i2);
                    Calendar calendar4 = v1g.A07;
                    if (calendar4 != null) {
                        calendar4.set(11, 0);
                        Calendar calendar5 = v1g.A07;
                        if (calendar5 != null) {
                            calendar5.set(12, 0);
                            Calendar calendar6 = v1g.A07;
                            if (calendar6 != null) {
                                calendar6.set(13, 0);
                                Calendar calendar7 = v1g.A07;
                                if (calendar7 != null) {
                                    if (calendar7.getTime().before(new Date())) {
                                        Calendar calendar8 = v1g.A07;
                                        if (calendar8 != null) {
                                            calendar8.add(1, 1);
                                        }
                                    }
                                    InterfaceC58115Ppe interfaceC58115Ppe = v1g.A03;
                                    if (interfaceC58115Ppe != null) {
                                        Calendar calendar9 = v1g.A07;
                                        if (calendar9 != null) {
                                            interfaceC58115Ppe.D9K(calendar9.getTime());
                                            return;
                                        }
                                    } else {
                                        throw AbstractC166997dE.A0g();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("datePickerCalendar");
        throw C00O.createAndThrow();
    }

    public static final void A02(V1G v1g, boolean z) {
        String str;
        IgDatePicker igDatePicker = v1g.A04;
        if (igDatePicker == null) {
            str = "datePicker";
        } else {
            AbstractC125325le.A06(new View[]{igDatePicker}, z);
            IgTimePicker igTimePicker = v1g.A05;
            if (igTimePicker == null) {
                str = "timePicker";
            } else {
                AbstractC125325le.A07(new View[]{igTimePicker}, z);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A03() {
        InterfaceC58115Ppe interfaceC58115Ppe = this.A03;
        if (interfaceC58115Ppe != null) {
            IgTimePicker igTimePicker = this.A05;
            Date date = null;
            if (igTimePicker == null) {
                C14360o3.A0F("timePicker");
                throw C00O.createAndThrow();
            }
            Calendar selectedTime = igTimePicker.getSelectedTime();
            if (selectedTime != null) {
                date = selectedTime.getTime();
            }
            interfaceC58115Ppe.DBG(date);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "datepicker";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A0E;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        Calendar calendar = this.A07;
        String str = "datePickerCalendar";
        if (calendar != null) {
            calendar.setTime(new Date());
            IgDatePicker igDatePicker = this.A04;
            if (igDatePicker == null) {
                str = "datePicker";
            } else {
                Calendar calendar2 = this.A07;
                if (calendar2 != null) {
                    int i = calendar2.get(2);
                    Calendar calendar3 = this.A07;
                    if (calendar3 != null) {
                        igDatePicker.A02(i, calendar3.get(5));
                        IgTimePicker igTimePicker = this.A05;
                        if (igTimePicker == null) {
                            str = "timePicker";
                        } else {
                            igTimePicker.A01();
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(V1G v1g, Calendar calendar) {
        Date time = calendar.getTime();
        InterfaceC58115Ppe interfaceC58115Ppe = v1g.A03;
        if (interfaceC58115Ppe != null) {
            if (time.before(new Date()) && !v1g.A0F) {
                time = null;
            }
            interfaceC58115Ppe.D9K(time);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-248749324);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0E = C023409i.A0A.A06(bundle2);
            this.A01 = getThemedContext().getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top);
            this.A00 = AbstractC53242c7.A0H(getThemedContext(), R.attr.igds_color_elevated_separator);
            Calendar calendar = Calendar.getInstance();
            this.A07 = calendar;
            if (calendar == null) {
                C14360o3.A0F("datePickerCalendar");
                throw C00O.createAndThrow();
            }
            this.A0D = calendar.get(1);
            this.A0B = bundle2.getBoolean(AbstractC43591JPw.A00(367));
            this.A0A = (Date) bundle2.getSerializable(AbstractC43591JPw.A00(366));
            this.A09 = (Date) bundle2.getSerializable(AbstractC43591JPw.A00(364));
            this.A08 = (Date) bundle2.getSerializable(AbstractC43591JPw.A00(363));
            this.A0C = bundle2.getBoolean(AbstractC43591JPw.A00(368));
            this.A06 = bundle2.getString(AbstractC43591JPw.A00(365));
            this.A02 = bundle2.getInt(AbstractC43591JPw.A00(975), 5);
            this.A0F = bundle2.getBoolean(AbstractC43591JPw.A00(974));
            C0f9.A09(-1725468548, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(130883312, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1701074628);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.date_picker_sheet, viewGroup, false);
        C0f9.A09(-1426881226, A02);
        return inflate;
    }
}
