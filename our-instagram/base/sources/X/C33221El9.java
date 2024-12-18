package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.login.twofac.model.TotpSeed;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.El9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33221El9 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacMultipleTotpFragment";
    public Bundle A00;
    public C36731GHa A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131975952);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    public static final void A00(C33221El9 c33221El9) {
        Bundle bundle = c33221El9.A00;
        String str = "twoFacResponseBundle";
        if (bundle != null) {
            boolean z = bundle.getBoolean("can_add_additional_totp_seed");
            C36731GHa c36731GHa = c33221El9.A01;
            if (c36731GHa == null) {
                str = "authenticatorAppSwitch";
            } else {
                ArrayList A1N = AbstractC16960so.A1N(c36731GHa);
                C34966Faq c34966Faq = new C34966Faq(new ViewOnClickListenerC35669Fp4(6, c33221El9, z), 2131975883);
                c34966Faq.A07 = true;
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(c33221El9.getString(2131952265));
                A0H.setSpan(new C60977Rd5(AbstractC31181DnP.A02(c33221El9), 3), 0, A0H.length(), 18);
                c34966Faq.A03 = A0H;
                A1N.add(c34966Faq);
                C34965Fap c34965Fap = new C34965Fap(c33221El9.getString(2131975914));
                c34965Fap.A05 = new C34626FNj(AbstractC166997dE.A0N(c33221El9).getDimensionPixelSize(R.dimen.abc_dialog_padding_material), AbstractC166997dE.A0N(c33221El9).getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), AbstractC31177DnL.A02(c33221El9, R.dimen.account_discovery_bottom_gap), AbstractC31177DnL.A02(c33221El9, R.dimen.account_discovery_bottom_gap), AbstractC166997dE.A0N(c33221El9).getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AbstractC31177DnL.A02(c33221El9, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                c34965Fap.A03 = R.style.TwoFacRowBodyText;
                A1N.add(c34965Fap);
                Bundle bundle2 = c33221El9.A00;
                if (bundle2 != null) {
                    ArrayList parcelableArrayList = bundle2.getParcelableArrayList("totp_seeds");
                    if (parcelableArrayList != null) {
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            TotpSeed totpSeed = (TotpSeed) it.next();
                            boolean A1P = AbstractC167007dF.A1P(parcelableArrayList.size(), 1);
                            String str2 = totpSeed.A01;
                            C14360o3.A07(str2);
                            String str3 = totpSeed.A00;
                            C14360o3.A07(str3);
                            C35200Ffs c35200Ffs = new C35200Ffs(new ViewOnClickListenerC35672Fp7(12, totpSeed, c33221El9, A1P), str2, str3, "");
                            c35200Ffs.A0C = true;
                            String str4 = totpSeed.A00;
                            if (str4 == null || str4.length() == 0) {
                                c35200Ffs.A08 = null;
                            }
                            A1N.add(c35200Ffs);
                        }
                    }
                    c33221El9.setItems(A1N);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C33221El9 r5, com.instagram.login.twofac.model.TotpSeed r6, boolean r7, boolean r8, boolean r9) {
        /*
            r0 = 1379(0x563, float:1.932E-42)
            java.lang.String r3 = X.AbstractC111324zv.A00(r0)
            r0 = 1381(0x565, float:1.935E-42)
            java.lang.String r2 = X.AbstractC111324zv.A00(r0)
            if (r8 == 0) goto L70
            if (r7 == 0) goto L70
            if (r9 == 0) goto L5e
            if (r6 == 0) goto L5e
            r0 = 2131975942(0x7f135f06, float:1.958899E38)
            java.lang.String r4 = r5.getString(r0)
            r1 = 2131975941(0x7f135f05, float:1.9588988E38)
        L1e:
            java.lang.String r0 = r6.A01
            java.lang.String r1 = X.AbstractC31174DnI.A0w(r5, r0, r1)
            r0 = 2131975977(0x7f135f29, float:1.9589062E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r0 = X.AnonymousClass001.A11(r2, r1, r3, r0, r2)
            java.lang.String r3 = X.AbstractC16490ru.A0p(r0)
        L33:
            r0 = 2131976002(0x7f135f42, float:1.9589112E38)
        L36:
            java.lang.String r1 = r5.getString(r0)
            X.8hC r2 = X.AbstractC31175DnJ.A0O(r5)
            r2.A05 = r4
            r2.A0r(r3)
            r0 = 61
            X.FkA r0 = X.DialogInterfaceOnClickListenerC35453FkA.A00(r5, r0)
            r2.A0d(r0, r1)
            r1 = 2131954754(0x7f130c42, float:1.9546016E38)
            if (r9 == 0) goto L54
            r1 = 2131975913(0x7f135ee9, float:1.9588932E38)
        L54:
            r0 = 62
            X.FkA r0 = X.DialogInterfaceOnClickListenerC35453FkA.A00(r5, r0)
            X.AbstractC31176DnK.A16(r0, r2, r1)
            return
        L5e:
            r0 = 2131975828(0x7f135e94, float:1.958876E38)
            java.lang.String r4 = r5.getString(r0)
            r0 = 2131975827(0x7f135e93, float:1.9588757E38)
            java.lang.String r3 = r5.getString(r0)
            r0 = 2131975976(0x7f135f28, float:1.958906E38)
            goto L36
        L70:
            if (r9 == 0) goto L7f
            if (r6 == 0) goto L7f
            r0 = 2131975940(0x7f135f04, float:1.9588986E38)
            java.lang.String r4 = r5.getString(r0)
            r1 = 2131975939(0x7f135f03, float:1.9588984E38)
            goto L1e
        L7f:
            r0 = 2131975826(0x7f135e92, float:1.9588755E38)
            java.lang.String r4 = r5.getString(r0)
            r0 = 2131975825(0x7f135e91, float:1.9588753E38)
            java.lang.String r3 = r5.getString(r0)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33221El9.A01(X.El9, com.instagram.login.twofac.model.TotpSeed, boolean, boolean, boolean):void");
    }

    public final void A02() {
        C32539EUp c32539EUp = new C32539EUp(this, 10);
        C1ON A01 = AbstractC35177FfU.A01(requireContext(), AbstractC166987dD.A0r(this.A02));
        A01.A00 = c32539EUp;
        schedule(A01);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-752794386);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments;
        boolean z = requireArguments.getBoolean("is_totp_two_factor_enabled");
        Bundle bundle2 = this.A00;
        if (bundle2 == null) {
            C14360o3.A0F("twoFacResponseBundle");
            throw C00O.createAndThrow();
        }
        C36731GHa c36731GHa = new C36731GHa(C35743Fqb.A00, new G9F(this, 1, bundle2.getBoolean("is_two_factor_enabled"), z), 2131975952, z);
        this.A01 = c36731GHa;
        c36731GHa.A0A = getString(2131975954);
        A02();
        C0f9.A09(724341396, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(325272472);
        super.onResume();
        A02();
        C0f9.A09(-1843027971, A02);
    }
}
