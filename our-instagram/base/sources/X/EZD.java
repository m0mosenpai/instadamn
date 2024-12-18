package X;

import android.content.Context;
import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class EZD extends C2AG {
    public long A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ C36007Fv5 A02;
    public final /* synthetic */ EnumC31713DwI A03;

    @Override // X.C11R
    public final int getRunnableId() {
        return 262;
    }

    public EZD(AbstractC12990ll abstractC12990ll, C36007Fv5 c36007Fv5, EnumC31713DwI enumC31713DwI) {
        this.A02 = c36007Fv5;
        this.A01 = abstractC12990ll;
        this.A03 = enumC31713DwI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1vw, java.lang.Object] */
    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C36007Fv5 c36007Fv5 = this.A02;
        c36007Fv5.A01 = (C203158yX) obj;
        C41451vu.A01.E4s(new Object());
        C203158yX c203158yX = c36007Fv5.A01;
        long currentTimeMillis = System.currentTimeMillis();
        long A00 = C1Q9.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(this.A01), "facebook_first_party_auth");
        if (A0f.isSampled()) {
            double d = currentTimeMillis;
            AbstractC31176DnK.A1K(A0f, d);
            AbstractC31179DnN.A17(A0f, d, A00);
            AbstractC31175DnJ.A0y(A0f);
            A0f.A7v("has_facebook_session", Boolean.valueOf(AbstractC167007dF.A1W(c203158yX)));
            A0f.A7v("is_facebook_app_installed", Boolean.valueOf(AbstractC23851Es.A03()));
            AbstractC31172DnG.A1O(A0f);
            A0f.A9K("ts", Long.valueOf(SystemClock.elapsedRealtime() - this.A00));
            AbstractC31178DnM.A14(A0f);
            A0f.AAP("release_channel", AbstractC31176DnK.A0r(EnumC12920le.A00()));
            AbstractC31178DnM.A13(A0f);
            String str2 = null;
            if (c203158yX == null) {
                str = null;
            } else {
                str = c203158yX.A01.A01;
            }
            A0f.AAP("sso_package_name", str);
            EnumC31713DwI enumC31713DwI = this.A03;
            if (enumC31713DwI != null) {
                str2 = enumC31713DwI.A01;
            }
            AbstractC31171DnF.A1A(A0f, str2);
            A0f.A7v("is_internal_build", AbstractC166997dE.A0a());
            A0f.Cht();
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        C203168yY c203168yY;
        this.A00 = SystemClock.elapsedRealtime();
        C36007Fv5 c36007Fv5 = this.A02;
        Context context = c36007Fv5.A00;
        AbstractC12990ll abstractC12990ll = this.A01;
        Boolean bool = (Boolean) ((C52342aZ) C52542at.A01.CES(C52542at.A00, C52542at.A02[0])).A01(abstractC12990ll);
        C203158yX c203158yX = c36007Fv5.A01;
        if (c203158yX != null && (c203168yY = c203158yX.A00) != null) {
            str = c203168yY.A01;
        } else {
            str = null;
        }
        return AbstractC200748uH.A00(context, abstractC12990ll, bool, str);
    }
}
