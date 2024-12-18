package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.brandedcontent.adseligibility.util.AdsEligibilityErrorDataItem;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Onr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55666Onr implements InterfaceC48192Ji {
    public final /* synthetic */ C8Y5 A00;
    public final /* synthetic */ C47Z A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public C55666Onr(C8Y5 c8y5, C47Z c47z, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = interfaceC16820sZ;
        this.A00 = c8y5;
        this.A01 = c47z;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS A0k;
        C2JS optionalTreeField;
        int i;
        if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (optionalTreeField = A0k.getOptionalTreeField(0, "validate_new_ig_media_for_ads_eligibility(input:$input)", C59110QXq.class, 1605628860)) != null && !optionalTreeField.getCoercedBooleanField(0, AbstractC111324zv.A00(33))) {
            ImmutableList A0D = MSX.A0D(optionalTreeField, C59109QXp.class, "error_data", 1, -1285538584);
            ArrayList A0i = AbstractC167007dF.A0i(A0D);
            Iterator<E> it = A0D.iterator();
            while (it.hasNext()) {
                C2JS A0l = AbstractC25225BEi.A0l(it);
                String A0A = A0l.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                String str = "";
                if (A0A == null) {
                    A0A = "";
                }
                String A07 = A0l.A07(AbstractC58317Pt9.A00(5));
                if (A07 == null) {
                    A07 = "";
                }
                String A08 = A0l.A08(AbstractC58317Pt9.A00(98));
                if (A08 != null) {
                    str = A08;
                }
                A0i.add(new AdsEligibilityErrorDataItem(A0A, A07, str));
            }
            ArrayList A0i2 = AbstractC167007dF.A0i(A0D);
            Iterator<E> it2 = A0D.iterator();
            while (it2.hasNext()) {
                A0i2.add(String.valueOf(AbstractC25225BEi.A0l(it2).A00(TraceFieldType.ErrorCode)));
            }
            N4D n4d = new N4D();
            Bundle A0b = AbstractC166987dD.A0b();
            C8Y5 c8y5 = this.A00;
            C8Y4 c8y4 = c8y5.A03;
            A0b.putSerializable("media_type", c8y4);
            A0b.putSerializable("error_data_list", AbstractC166987dD.A1F(A0i));
            A0b.putStringArrayList("error_data_codes", AbstractC166987dD.A1F(A0i2));
            n4d.setArguments(A0b);
            UserSession userSession = c8y5.A04;
            C47Z c47z = this.A01;
            String str2 = c47z.A32;
            String str3 = c8y4.A00;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(n4d, userSession), "instagram_bc_ads_ppl_boost_eligibility_error");
            AbstractC31171DnF.A1B(A0f, "instagram_bc_ad_ppl_boost_eligibility_error_surface_impression");
            A0f.AAk("error_codes", A0i2);
            MSW.A1S(A0f, str2);
            A0f.AAP("media_type", str3);
            A0f.Cht();
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            Context context = c8y5.A01;
            AbstractC25226BEj.A1M(context, A0y, 2131969367);
            A0y.A0g = C8Y5.A01(c8y5, c8y4);
            A0y.A1J = true;
            A0y.A0K = new ViewOnClickListenerC55417OjS(1, n4d, A0i2, c47z, c8y5);
            A0y.A0h = C8Y5.A02(c8y5, c8y4);
            A0y.A0L = new ViewOnClickListenerC55417OjS(2, n4d, A0i2, c47z, c8y5);
            A0y.A1N = true;
            int ordinal = c8y4.ordinal();
            if (ordinal != 2) {
                i = 2131974620;
                if (ordinal != 0) {
                    i = 2131962471;
                }
            } else {
                i = 2131971710;
            }
            A0y.A0b = AbstractC166997dE.A0p(context, i);
            A0y.A0U = new C56758PHa(0, c8y5, this.A02);
            A0y.A00().A02(c8y5.A02, n4d);
            return;
        }
        this.A02.invoke();
    }
}
