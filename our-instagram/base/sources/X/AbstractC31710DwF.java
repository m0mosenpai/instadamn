package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.login.credentialmanager.CredentialManagerFetchHelper;

/* renamed from: X.DwF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31710DwF {
    public static InterfaceC37129GXq A00;
    public static String A01;

    public static final void A02(Fragment fragment, AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, InterfaceC65531Tm1 interfaceC65531Tm1, EnumC31713DwI enumC31713DwI, String str, String str2, boolean z) {
        AbstractC25229BEm.A1I(str2, 2, abstractC12990ll);
        C121275eQ instanceAsync = AbstractC27461Uz.getInstanceAsync();
        instanceAsync.A00 = new C60937Rbr(fragment, abstractC12990ll, imageUrl, interfaceC65531Tm1, enumC31713DwI, str, str2, z);
        C1GJ.A03(instanceAsync);
    }

    public static final void A00(Fragment fragment, C07270a1 c07270a1, InterfaceC65576TnA interfaceC65576TnA, EnumC31713DwI enumC31713DwI, boolean z) {
        C31712DwH c31712DwH = C31712DwH.A00;
        if (c31712DwH.A01(c07270a1)) {
            C121275eQ instanceAsync = AbstractC27461Uz.getInstanceAsync();
            instanceAsync.A00 = new HJ1(0, enumC31713DwI, interfaceC65576TnA, c07270a1, fragment, z);
            C1GJ.A03(instanceAsync);
        } else {
            if (fragment == null || fragment.getContext() == null || !c31712DwH.A00(c07270a1)) {
                return;
            }
            Context context = fragment.getContext();
            if (context != null) {
                CredentialManagerFetchHelper credentialManagerFetchHelper = new CredentialManagerFetchHelper(context);
                OC2 oc2 = new OC2(fragment, c07270a1, interfaceC65576TnA, enumC31713DwI);
                credentialManagerFetchHelper.A00 = oc2;
                AbstractC166987dD.A1Z(new PZM(credentialManagerFetchHelper, oc2, null, 17), credentialManagerFetchHelper.A01);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A01(Fragment fragment, AbstractC12990ll abstractC12990ll) {
        AbstractC167017dG.A1N(abstractC12990ll, fragment);
        C121275eQ instanceAsync = AbstractC27461Uz.getInstanceAsync();
        instanceAsync.A00 = new EZ5(4, fragment, abstractC12990ll);
        C1GJ.A03(instanceAsync);
    }
}
