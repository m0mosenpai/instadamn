package X;

import android.net.ConnectivityManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EVI extends AbstractC60592pi {
    public EVQ A00;
    public boolean A02;
    public EVG A03;
    public final FragmentActivity A04;
    public final AbstractC59962oe A05;
    public final C07270a1 A06;
    public final EnumC31713DwI A07;
    public EHN A01 = null;
    public final InterfaceC41501vz A08 = new C36155FxU(this, 3);

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        FragmentActivity fragmentActivity;
        boolean z;
        C07270a1 c07270a1 = this.A06;
        AbstractC59962oe abstractC59962oe = this.A05;
        EnumC31713DwI enumC31713DwI = this.A07;
        this.A00 = new EVQ(abstractC59962oe, abstractC59962oe, c07270a1, null, enumC31713DwI, null);
        AbstractC37391oc abstractC37391oc = AbstractC37391oc.$redex_init_class;
        AbstractC37401od abstractC37401od = AbstractC37401od.$redex_init_class;
        if (AbstractC37391oc.A00()) {
            C0w9.A03("failed_to_load_library_logged_out", "failed_to_load_library_logged_out");
            FragmentActivity fragmentActivity2 = this.A04;
            C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity2);
            A0H.A0s(false);
            A0H.A0A(2131961880);
            AbstractC31173DnH.A16(fragmentActivity2, A0H, 2131976049);
            AbstractC31176DnK.A15(DialogInterfaceOnClickListenerC35454FkB.A00(this, 31), A0H);
        }
        try {
            C16030qx c16030qx = C16030qx.A02;
            fragmentActivity = this.A04;
            c16030qx.A05(fragmentActivity);
        } catch (RuntimeException unused) {
            C0w9.A03("failed_to_write_to_fs", AbstractC111324zv.A00(2682));
            DialogInterfaceOnClickListenerC35454FkB A00 = DialogInterfaceOnClickListenerC35454FkB.A00(this, 32);
            fragmentActivity = this.A04;
            C193328hC A0H2 = AbstractC31171DnF.A0H(fragmentActivity);
            A0H2.A0a(A00, AbstractC167007dF.A0f(fragmentActivity, "http://bit.ly/igfilesystem", 2131971518), "http://bit.ly/igfilesystem");
            AbstractC31176DnK.A17(DialogInterfaceOnClickListenerC35454FkB.A00(this, 33), A0H2, 2131960994);
        }
        Object systemService = fragmentActivity.getSystemService(AbstractC43591JPw.A00(141));
        systemService.getClass();
        String A0A = AbstractC15820qc.A0A(((ConnectivityManager) systemService).getActiveNetworkInfo());
        boolean A0B = AbstractC14490oL.A0B(fragmentActivity);
        C18920wW A02 = AbstractC12220kQ.A02(c07270a1);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, "landing_created");
        AbstractC31179DnN.A15(A0f);
        AbstractC31178DnM.A15(A0f, currentTimeMillis, C1Q9.A00());
        AbstractC31176DnK.A1J(A0f, AbstractC31171DnF.A00());
        String str = enumC31713DwI.A01;
        AbstractC31171DnF.A1A(A0f, str);
        A0f.A7v("is_facebook_app_installed", Boolean.valueOf(A0B));
        AbstractC31178DnM.A13(A0f);
        synchronized (C35264Fgy.class) {
            z = C35264Fgy.A00.A00.getBoolean("did_facebook_sso", false);
        }
        A0f.A7v("did_facebook_sso", Boolean.valueOf(z));
        A0f.A7v("did_log_in", Boolean.valueOf(C35264Fgy.A05()));
        A0f.AAP(MSV.A00(111), A0A);
        A0f.AAP("app_lang", C1Q2.A02().toString());
        A0f.AAP("device_lang", C1Q2.A03().toString());
        A0f.AAP("funnel_name", enumC31713DwI.A00);
        AbstractC31175DnJ.A10(A0f, currentTimeMillis);
        A0f.Cht();
        C14120nc.A00().ATO(new EZT(fragmentActivity));
        FEW.A00(c07270a1, str, abstractC59962oe.getModuleName());
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A05.unregisterLifecycleListener(this.A03);
        C41451vu.A01.A03(this.A08, C36036FvY.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        EHN ehn = this.A01;
        if (ehn != null) {
            ehn.A07();
        }
    }

    public EVI(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, EnumC31713DwI enumC31713DwI) {
        this.A06 = c07270a1;
        this.A04 = fragmentActivity;
        this.A05 = abstractC59962oe;
        this.A07 = enumC31713DwI;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        String displayName;
        view.requireViewById(R.id.landing_container);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.language_selector_button);
        if (A0e != null) {
            AbstractC56952jT.A01(A0e);
            FragmentActivity fragmentActivity = this.A04;
            if (!AbstractC53242c7.A0L(fragmentActivity, R.attr.nuxAllowLanguagePicker, true)) {
                A0e.setVisibility(8);
            } else {
                String A01 = C1Q2.A01();
                if (!TextUtils.isEmpty(A01)) {
                    for (C32110E9i c32110E9i : AbstractC35114FeG.A01) {
                        if (c32110E9i.A02.equals(A01)) {
                            displayName = fragmentActivity.getString(c32110E9i.A01);
                            break;
                        }
                    }
                }
                displayName = fragmentActivity.getResources().getConfiguration().locale.getDisplayName();
                int A03 = AbstractC31174DnI.A03(fragmentActivity);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) displayName);
                spannableStringBuilder.append((CharSequence) "  ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(new ImageSpan(AbstractC22728A0y.A00(fragmentActivity, R.drawable.feed_sponsored_chevron, 8, A03), 1), length - 1, length, 33);
                A0e.setText(spannableStringBuilder);
                A0e.setContentDescription(AbstractC166997dE.A0r(A0e.getResources(), A0e.getText(), 2131964794));
                ViewOnClickListenerC31724DwT.A00(A0e, 39, this);
            }
        }
        this.A03 = new EVG(this.A06, null, this.A07);
        C41451vu.A01.A02(this.A08, C36036FvY.class);
        this.A05.registerLifecycleListener(this.A03);
    }
}
