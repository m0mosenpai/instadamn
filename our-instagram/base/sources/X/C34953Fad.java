package X;

import android.app.Activity;
import android.widget.AutoCompleteTextView;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.Fad, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34953Fad {
    public final Activity A00;
    public final AutoCompleteTextView A01;
    public final AbstractC12990ll A02;
    public final EnumC31713DwI A03;

    public C34953Fad(Activity activity, AutoCompleteTextView autoCompleteTextView, AbstractC12990ll abstractC12990ll, EnumC31713DwI enumC31713DwI) {
        AbstractC167027dH.A13(abstractC12990ll, activity, autoCompleteTextView);
        this.A02 = abstractC12990ll;
        this.A00 = activity;
        this.A01 = autoCompleteTextView;
        this.A03 = enumC31713DwI;
    }

    public static final void A00(C34953Fad c34953Fad, Integer num, String str, String str2, String str3, int i, boolean z) {
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        AbstractC12990ll abstractC12990ll = c34953Fad.A02;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "email_field_prefilled");
        AbstractC31177DnL.A1B(A0f, A01, A00);
        AbstractC31172DnG.A1O(A0f);
        EnumC31713DwI enumC31713DwI = c34953Fad.A03;
        AbstractC31179DnN.A1A(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, "email", A00);
        AbstractC31176DnK.A1K(A0f, A01);
        A0f.A7v("is_valid", Boolean.valueOf(z));
        A0f.AAP(CacheBehaviorLogger.SOURCE, str2);
        A0f.A9K("avail_emails", AbstractC31171DnF.A0V(i));
        AbstractC35274Fh9.A05(A0f);
        Activity activity = c34953Fad.A00;
        CountryCodeData A002 = AnonymousClass780.A00(activity);
        AbstractC167027dH.A13(activity, abstractC12990ll, enumC31713DwI);
        A0f.AAP("available_prefills", AbstractC35099FdA.A01(activity, A002, null, str3, C35270Fh5.A04(activity, abstractC12990ll, enumC31713DwI, C35270Fh5.A05(num)), AbstractC35100FdB.A02(activity, abstractC12990ll, num)));
        if (str.length() != 0) {
            A0f.AAP("error", str);
        }
        A0f.Cht();
    }
}
