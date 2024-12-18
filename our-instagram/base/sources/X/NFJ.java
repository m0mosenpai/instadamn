package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.rtc.statemodel.RtcSettingsParticipant;

/* loaded from: classes9.dex */
public final class NFJ extends AbstractC66422zJ {
    public static final NFJ A00 = new Object();

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C51814MvI c51814MvI = (C51814MvI) interfaceC66482zP;
        C51342Mm3 c51342Mm3 = (C51342Mm3) c3oo;
        AbstractC167017dG.A1N(c51814MvI, c51342Mm3);
        c51342Mm3.A00 = c51814MvI;
        RtcSettingsParticipant rtcSettingsParticipant = c51814MvI.A00;
        IgTextView igTextView = c51342Mm3.A04;
        igTextView.setVisibility(0);
        IgTextView igTextView2 = c51342Mm3.A03;
        C14360o3.A0B(rtcSettingsParticipant, 0);
        String str2 = rtcSettingsParticipant.A03;
        int length = str2.length();
        if (length == 0) {
            str2 = rtcSettingsParticipant.A06;
        }
        igTextView2.setText(str2);
        if (length == 0) {
            str = "";
        } else {
            str = rtcSettingsParticipant.A06;
        }
        int i = 8;
        if (str.length() > 0) {
            i = 0;
        }
        igTextView.setVisibility(i);
        igTextView.setText(str);
        c51342Mm3.A05.setUrl(rtcSettingsParticipant.A01, c51342Mm3.A02);
        c51342Mm3.A01.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51814MvI.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        return new C51342Mm3(layoutInflater, viewGroup);
    }
}
