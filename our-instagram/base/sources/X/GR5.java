package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GR5 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ EnumC33344Eod A03;
    public final /* synthetic */ InterfaceC83733oI A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public GR5(FragmentActivity fragmentActivity, UserSession userSession, EnumC33344Eod enumC33344Eod, InterfaceC83733oI interfaceC83733oI, String str, String str2, String str3, int i) {
        this.A03 = enumC33344Eod;
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = interfaceC83733oI;
        this.A07 = str;
        this.A00 = i;
        this.A05 = str2;
        this.A06 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment kBh;
        EnumC33344Eod enumC33344Eod = this.A03;
        int ordinal = enumC33344Eod.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            UserSession userSession = this.A02;
            FragmentActivity fragmentActivity = this.A01;
            InterfaceC83733oI interfaceC83733oI = this.A04;
            String str = this.A07;
            int i = this.A00;
            String str2 = this.A05;
            String str3 = this.A06;
            Bundle A00 = AbstractC34776FTz.A00(enumC33344Eod, interfaceC83733oI, str, str2, i);
            if (ordinal != 3) {
                kBh = new EK7();
            } else {
                kBh = new KBh();
            }
            kBh.setArguments(A00);
            C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
            C14360o3.A0A(kBh);
            A0r.A0D(kBh);
            AbstractC31174DnI.A1M(A0r, str3);
            return;
        }
        UserSession userSession2 = this.A02;
        FragmentActivity fragmentActivity2 = this.A01;
        Bundle A002 = AbstractC34776FTz.A00(enumC33344Eod, this.A04, this.A07, null, this.A00);
        EKB ekb = new EKB();
        AbstractC167007dF.A0J().post(new GPG(fragmentActivity2, ekb, GH5.A00(AbstractC31174DnI.A0W(A002, ekb, userSession2), userSession2, 4)));
    }
}
