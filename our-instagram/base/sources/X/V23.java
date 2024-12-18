package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Currency;

/* loaded from: classes11.dex */
public final class V23 extends AbstractC67958V3x {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ VG4 A02;
    public final /* synthetic */ W6E A03;
    public final /* synthetic */ SpinnerImageView A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V23(Bundle bundle, FragmentActivity fragmentActivity, VG4 vg4, C70399WUb c70399WUb, W6E w6e, SpinnerImageView spinnerImageView, String str, String str2) {
        super(c70399WUb, str);
        this.A03 = w6e;
        this.A02 = vg4;
        this.A00 = bundle;
        this.A01 = fragmentActivity;
        this.A05 = str2;
        this.A04 = spinnerImageView;
    }

    @Override // X.AbstractC67958V3x, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1785528396);
        W6E w6e = this.A03;
        VRC.A00(w6e.A08).A09(this.A02.toString(), "campaign_controls", w6e.A03.A1S, "failed to fetch init data");
        super.onFail(abstractC115105If);
        C0f9.A0A(-638383893, A03);
    }

    @Override // X.AbstractC67958V3x, X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(241088117);
        super.onStart();
        C0f9.A0A(1165837071, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1320615889);
        C67837UzA c67837UzA = (C67837UzA) obj;
        int A032 = C0f9.A03(-829786114);
        W6E w6e = this.A03;
        C70399WUb c70399WUb = w6e.A02;
        VG4 vg4 = this.A02;
        c70399WUb.A0E(vg4, "initial_fetch");
        C69494VoH c69494VoH = c67837UzA.A03;
        c69494VoH.getClass();
        PromoteData promoteData = w6e.A03;
        promoteData.A1n = c69494VoH.A0a;
        promoteData.A06 = c69494VoH.A00;
        promoteData.A1j = Currency.getInstance(c69494VoH.A0O);
        promoteData.A0X = c67837UzA.A00;
        promoteData.A1B = c69494VoH.A0M;
        AbstractC65702TsY.A0q();
        C67871V0c c67871V0c = new C67871V0c();
        c67871V0c.setArguments(this.A00);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = w6e.A08;
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A0A = this.A05;
        c140966Yy.A0D = false;
        c140966Yy.A0E(c67871V0c);
        c140966Yy.A04();
        SpinnerImageView spinnerImageView = this.A04;
        if (spinnerImageView != null) {
            spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
        }
        VRC.A00(userSession).A04("campaign_controls_budget_duration", "campaign_controls_fetch", promoteData.A1S);
        A01(c67837UzA);
        w6e.A06(vg4.toString());
        C0f9.A0A(1225245616, A032);
        C0f9.A0A(1640580530, A03);
    }
}
