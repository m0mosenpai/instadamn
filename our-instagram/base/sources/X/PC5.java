package X;

import android.view.View;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class PC5 implements InterfaceC57985PnV {
    public final int A00;
    public final View A01;
    public final O55 A02;
    public final C3PX A03;

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        C51900Mwi c51900Mwi = (C51900Mwi) interfaceC57856PlM;
        C14360o3.A0B(c51900Mwi, 0);
        C3PX c3px = this.A03;
        View A00 = c3px.A00();
        boolean z = c51900Mwi.A02;
        int i = 0;
        A00.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        if (z) {
            if (!c51900Mwi.A01) {
                i = this.A01.getWidth() - this.A00;
            }
            c3px.A00().setTranslationX(i);
        }
    }

    public PC5(View view, O55 o55) {
        this.A02 = o55;
        C3PX A00 = C3PW.A00(view, R.id.mock_participants_controls_stub);
        this.A03 = A00;
        View A0S = AbstractC166997dE.A0S(A00.A00(), R.id.show_mock_participants_button);
        this.A01 = A0S;
        this.A00 = AbstractC167017dG.A08(view.getContext());
        View A002 = A00.A00();
        Ok3.A00(A002.findViewById(R.id.add_mock_participant_button), 24, this);
        Ok3.A00(A002.findViewById(R.id.add_landscape_mock_participant_button), 25, this);
        Ok3.A00(A002.findViewById(R.id.remove_mock_participant_button), 26, this);
        Ok3.A00(A002.findViewById(R.id.hide_mock_participants_button), 27, this);
        Ok3.A00(A0S, 28, this);
    }
}
