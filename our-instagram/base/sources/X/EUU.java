package X;

import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EUU extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C33000Egn A03;

    public EUU(C33000Egn c33000Egn, int i, int i2, int i3) {
        this.A03 = c33000Egn;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-173641167);
        super.onFail(abstractC115105If);
        C33000Egn c33000Egn = this.A03;
        if (c33000Egn.A02 != null) {
            AbstractC35259Fgt.A08(c33000Egn.A02, AbstractC31173DnH.A0m(c33000Egn));
        }
        C0f9.A0A(1678603216, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-513585876);
        ProgressButton progressButton = this.A03.A03;
        if (progressButton != null) {
            progressButton.setShowProgressBar(false);
        }
        C0f9.A0A(-87620714, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-356655461);
        ProgressButton progressButton = this.A03.A03;
        if (progressButton != null) {
            progressButton.setShowProgressBar(true);
        }
        C0f9.A0A(440653426, A03);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.instagram.registration.model.UserBirthDate, java.lang.Object] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1684424777);
        ECW ecw = (ECW) obj;
        int A032 = C0f9.A03(1304917226);
        C33000Egn c33000Egn = this.A03;
        RegFlowExtras regFlowExtras = ((EHT) c33000Egn).A01;
        boolean z = ecw.A00;
        regFlowExtras.A0s = z;
        int i = this.A02;
        int i2 = this.A01;
        int i3 = this.A00;
        if (z) {
            regFlowExtras.A0v = ecw.A01;
            ?? obj2 = new Object();
            obj2.A02 = i;
            obj2.A01 = i2;
            obj2.A00 = i3;
            regFlowExtras.A03 = obj2;
            c33000Egn.A03(EnumC33523Erw.A08.A00);
        } else {
            c33000Egn.A04(regFlowExtras.A0J, i, i2, i3);
        }
        C0f9.A0A(1859221810, A032);
        C0f9.A0A(-1342631179, A03);
    }
}
