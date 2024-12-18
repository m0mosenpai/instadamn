package X;

import android.view.View;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.rtc.statemodel.RtcSettingsParticipant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PC8 implements InterfaceC57985PnV {
    public final View A00;
    public final O5G A01;
    public final InterfaceC09390do A02 = C57543PgH.A01(this, 32);
    public final InterfaceC09390do A05 = C57543PgH.A01(this, 35);
    public final InterfaceC09390do A03 = C57543PgH.A01(this, 33);
    public final InterfaceC09390do A04 = C57543PgH.A01(this, 34);

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        boolean z;
        C51890MwY c51890MwY = (C51890MwY) interfaceC57856PlM;
        C14360o3.A0B(c51890MwY, 0);
        if (c51890MwY.A02) {
            AbstractC167017dG.A1W(this.A04, 0);
            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
            List<RtcSettingsParticipant> list = c51890MwY.A01;
            if (AbstractC166987dD.A1b(list)) {
                A0E.A00(new C51813MvH(AbstractC166997dE.A0q(AbstractC166987dD.A0d(this.A05).getResources(), 2131954524), false));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0E.A00(new C51814MvI((RtcSettingsParticipant) it.next(), new C57753Pjg(this, 30)));
                }
                z = false;
            } else {
                z = true;
            }
            List list2 = c51890MwY.A00;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list2) {
                RtcSettingsParticipant rtcSettingsParticipant = (RtcSettingsParticipant) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (RtcSettingsParticipant rtcSettingsParticipant2 : list) {
                        if (!C14360o3.A0K(rtcSettingsParticipant2.A04, rtcSettingsParticipant.A04) && !C14360o3.A0K(rtcSettingsParticipant2.A06, rtcSettingsParticipant.A06)) {
                        }
                    }
                }
                A1E.add(obj);
            }
            if (AbstractC166987dD.A1b(A1E)) {
                A0E.A00(new C51813MvH(AbstractC166997dE.A0q(AbstractC166987dD.A0d(this.A05).getResources(), 2131954523), !z));
                Iterator it2 = A1E.iterator();
                while (it2.hasNext()) {
                    A0E.A00(new C51814MvI((RtcSettingsParticipant) it2.next(), new C57753Pjg(this, 31)));
                }
            }
            ((C66362zD) this.A03.getValue()).A05(A0E);
        }
    }

    public PC8(View view, O5G o5g) {
        this.A00 = view;
        this.A01 = o5g;
    }
}
