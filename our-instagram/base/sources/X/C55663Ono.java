package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.brandedcontent.adseligibility.util.AdsEligibilityErrorDataItem;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ono, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55663Ono implements InterfaceC48192Ji {
    public final /* synthetic */ C8Y5 A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public C55663Ono(C8Y5 c8y5, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC16820sZ;
        this.A00 = c8y5;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C25531Mh A0G;
        C2JS A0k;
        C2JS optionalTreeField;
        if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (optionalTreeField = A0k.getOptionalTreeField(0, "validate_ig_story_media_for_boost_eligibility(input:$input)", C59106QXm.class, -1741123855)) != null && !optionalTreeField.getCoercedBooleanField(0, AbstractC111324zv.A00(33))) {
            ImmutableList A0D = MSX.A0D(optionalTreeField, C59105QXl.class, "error_data", 1, -1030875462);
            ArrayList A0i = AbstractC167007dF.A0i(A0D);
            Iterator<E> it = A0D.iterator();
            while (it.hasNext()) {
                C2JS A0l = AbstractC25225BEi.A0l(it);
                String optionalStringField = A0l.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                String str = "";
                if (optionalStringField == null) {
                    optionalStringField = "";
                }
                String A0A = A0l.A0A(AbstractC58317Pt9.A00(5));
                if (A0A == null) {
                    A0A = "";
                }
                String A09 = A0l.A09(AbstractC58317Pt9.A00(98));
                if (A09 != null) {
                    str = A09;
                }
                A0i.add(new AdsEligibilityErrorDataItem(optionalStringField, A0A, str));
            }
            ArrayList A0i2 = AbstractC167007dF.A0i(A0D);
            Iterator<E> it2 = A0D.iterator();
            while (it2.hasNext()) {
                A0i2.add(String.valueOf(AbstractC25225BEi.A0l(it2).getCoercedIntField(1, TraceFieldType.ErrorCode)));
            }
            Fragment n4d = new N4D();
            Bundle A0b = AbstractC166987dD.A0b();
            C8Y5 c8y5 = this.A00;
            C8Y4 c8y4 = c8y5.A03;
            A0b.putSerializable("media_type", c8y4);
            A0b.putSerializable("error_data_list", AbstractC166987dD.A1F(A0i));
            A0b.putStringArrayList("error_data_codes", AbstractC166987dD.A1F(A0i2));
            A0b.putBoolean("is_ads_mode", true);
            n4d.setArguments(A0b);
            UserSession userSession = c8y5.A04;
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            Context context = c8y5.A01;
            AbstractC25226BEj.A1M(context, A0y, 2131954032);
            A0y.A0g = C8Y5.A01(c8y5, c8y4);
            A0y.A1J = true;
            A0y.A0K = new ViewOnClickListenerC55464OkJ(10, c8y5, A0i2);
            A0y.A0h = C8Y5.A02(c8y5, c8y4);
            A0y.A0L = new ViewOnClickListenerC55464OkJ(11, c8y5, A0i2);
            A0y.A1N = true;
            A0y.A0b = context.getString(2131954061);
            A0y.A0U = new C36729GGy(0, A0i2, c8y5, this.A01);
            A0y.A00().A02(c8y5.A02, n4d);
            C22C A01 = AnonymousClass229.A01(userSession);
            ArrayList A1F = AbstractC166987dD.A1F(A0i2);
            C448124l c448124l = A01.A09;
            A0G = MSW.A0G(c448124l);
            EnumC114925Hg A0J = c448124l.A0J();
            if (AbstractC25226BEj.A1Z(A0G) && A0J != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it3 = A1F.iterator();
                while (it3.hasNext()) {
                    A1E.add(Long.valueOf(AbstractC166987dD.A1B(it3)));
                }
                MSW.A1W(A0G);
                AbstractC50522MSa.A1H(A0G, A0J, c448124l, "ADS_MODE_ERROR_REVIEW_SHEET_SHOWN");
                A0G.A0O("ads_mode_boost_story_enabled", true);
                A0G.A0S("ads_mode_boost_story_error_codes", A1E);
            } else {
                return;
            }
        } else {
            this.A01.invoke();
            C22C A012 = AnonymousClass229.A01(this.A00.A04);
            A0G = MSW.A0G(A012);
            EnumC114925Hg A0J2 = A012.A0J();
            C22M c22m = ((C22F) A012).A04;
            String str2 = c22m.A0L;
            if (AbstractC25226BEj.A1Z(A0G) && A0J2 != null && str2 != null) {
                A0G.A0a(A0J2);
                A0G.A0q("ADS_MODE_STORY_SHARE_NO_ERROR_REVIEW_SHEET");
                AbstractC167007dF.A14(A0G, c22m);
                A0G.A0U();
                A0G.A0R("camera_session_id", str2);
                AbstractC167007dF.A13(A0G);
                A0G.A0R("sticker_tray_session_id", c22m.A0U);
                JQ0.A1C(A0G, c22m);
                MSY.A1A(A0G);
                A0G.A0O("ads_mode_boost_story_enabled", AbstractC166997dE.A0b());
            } else {
                return;
            }
        }
        A0G.Cht();
    }
}
