package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadGenInfoFieldData;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Oeh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55218Oeh {
    public static final SpannableStringBuilder A01(Context context, String str) {
        String A0p = AbstractC166997dE.A0p(context, 2131964996);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
        AnonymousClass773.A03(A0H, new StyleSpan(1), A0p);
        return A0H;
    }

    public static final String A02(Context context, LeadGenFormData leadGenFormData) {
        C14360o3.A0B(leadGenFormData, 1);
        JSONArray A0p = AbstractC31171DnF.A0p();
        if (leadGenFormData.A08) {
            A0p.put(AbstractC31171DnF.A0q().put("label", context.getString(2131964927)).put("type_", LeadGenInfoFieldTypes.A0D.A00));
        }
        if (leadGenFormData.A09) {
            A0p.put(AbstractC31171DnF.A0q().put("label", context.getString(2131964928)).put("type_", LeadGenInfoFieldTypes.A0P.A00));
        }
        if (leadGenFormData.A07) {
            A0p.put(AbstractC31171DnF.A0q().put("label", context.getString(2131964926)).put("type_", LeadGenInfoFieldTypes.A0A.A00));
        }
        if (leadGenFormData.A0A) {
            A0p.put(AbstractC31171DnF.A0q().put("label", context.getString(2131964933)).put("type_", LeadGenInfoFieldTypes.A0a.A00));
        }
        if (AbstractC25226BEj.A1b(leadGenFormData.A06)) {
            Iterator it = leadGenFormData.A06.iterator();
            while (it.hasNext()) {
                LeadFormCustomQuestion leadFormCustomQuestion = (LeadFormCustomQuestion) it.next();
                JSONObject put = AbstractC31171DnF.A0q().put("label", leadFormCustomQuestion.A01).put("type_", LeadGenInfoFieldTypes.A07.A00);
                if (leadFormCustomQuestion.A00 == EnumC53203Nfz.A03) {
                    put.put("options", new JSONArray((Collection) leadFormCustomQuestion.A02));
                }
                A0p.put(put);
            }
        }
        return AbstractC166987dD.A19(A0p);
    }

    public static final void A07(Activity activity, Context context, UserSession userSession, String str) {
        boolean A1Y = AbstractC25229BEm.A1Y(userSession);
        C2Fb c2Fb = C2Fb.A3W;
        Context context2 = activity;
        if (activity == null) {
            context2 = context;
        }
        C63397SjR c63397SjR = new C63397SjR(context2, userSession, c2Fb, str, A1Y);
        c63397SjR.A0S = "lead_gen";
        c63397SjR.A0A();
    }

    public static final ArrayList A04(Resources resources, LeadGenFormData leadGenFormData) {
        boolean A1Y = AbstractC25229BEm.A1Y(leadGenFormData);
        ArrayList A1E = AbstractC166987dD.A1E();
        if (leadGenFormData.A08) {
            A1E.add(new LeadGenFormBaseQuestion(VEF.A0O, null, null, AbstractC166997dE.A0q(resources, 2131964927), "", "", null, null, null, null, null, C16930sl.A00, null, null, null, AbstractC06930Yk.A0E(), A1Y ? 1 : 0, A1Y, A1Y, A1Y, A1Y));
        }
        if (leadGenFormData.A09) {
            A1E.add(new LeadGenFormBaseQuestion(VEF.A0P, null, null, AbstractC166997dE.A0q(resources, 2131964928), "", "", null, null, null, null, null, C16930sl.A00, null, null, null, AbstractC06930Yk.A0E(), A1Y ? 1 : 0, A1Y, A1Y, A1Y, A1Y));
        }
        if (leadGenFormData.A07) {
            A1E.add(new LeadGenFormBaseQuestion(VEF.A0A, null, null, AbstractC166997dE.A0q(resources, 2131964926), "", "", null, null, null, null, null, C16930sl.A00, null, null, null, AbstractC06930Yk.A0E(), A1Y ? 1 : 0, A1Y, A1Y, A1Y, A1Y));
        }
        if (leadGenFormData.A0A) {
            A1E.add(new LeadGenFormBaseQuestion(VEF.A0a, null, null, AbstractC166997dE.A0q(resources, 2131964933), "", "", null, null, null, null, null, C16930sl.A00, null, null, null, AbstractC06930Yk.A0E(), A1Y ? 1 : 0, A1Y, A1Y, A1Y, A1Y));
        }
        Iterator A13 = AbstractC166997dE.A13(leadGenFormData.A06);
        while (A13.hasNext()) {
            LeadFormCustomQuestion leadFormCustomQuestion = (LeadFormCustomQuestion) AbstractC166997dE.A0l(A13);
            A1E.add(new LeadGenFormBaseQuestion(VEF.A06, null, null, leadFormCustomQuestion.A01, "", "", null, null, null, null, null, leadFormCustomQuestion.A02, null, null, null, AbstractC06930Yk.A0E(), A1Y ? 1 : 0, A1Y, A1Y, A1Y, A1Y));
        }
        return A1E;
    }

    public static final List A05() {
        return AbstractC16960so.A1Q(XIGIGBoostCallToAction.A05, XIGIGBoostCallToAction.A0L, XIGIGBoostCallToAction.A0I, XIGIGBoostCallToAction.A0Q);
    }

    public static final List A06(LeadForm leadForm) {
        VEF vef;
        List<LeadGenInfoFieldData> list = leadForm.A05;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (LeadGenInfoFieldData leadGenInfoFieldData : list) {
            String str = leadGenInfoFieldData.A00;
            if (leadGenInfoFieldData.A02) {
                vef = VEF.A06;
            } else {
                vef = VEF.A07;
            }
            List list2 = leadGenInfoFieldData.A01;
            if (list2 == null) {
                list2 = C16930sl.A00;
            }
            A0q.add(new LeadGenFormBaseQuestion(vef, null, null, str, "", "", null, null, null, null, null, list2, null, null, null, AbstractC06930Yk.A0E(), 0, false, false, false, false));
        }
        return A0q;
    }

    public static final SpannableStringBuilder A00(Activity activity, Context context, UserSession userSession, int i, int i2) {
        Object[] objArr;
        String A0p = AbstractC166997dE.A0p(context, 2131965026);
        String A0p2 = AbstractC166997dE.A0p(context, 2131965025);
        if (A08(userSession)) {
            objArr = new Object[]{A0p, A0p2};
        } else {
            objArr = new Object[]{A0p};
        }
        String string = context.getString(i, objArr);
        C14360o3.A0A(string);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(string);
        AnonymousClass773.A05(A0H, new C52788NXx(activity, context, userSession, "https://business.facebook.com/ads/leadgen/restricted_tos", context.getColor(i2)), A0p);
        if (A08(userSession)) {
            AnonymousClass773.A05(A0H, new C52788NXx(activity, context, userSession, AbstractC43591JPw.A00(382), context.getColor(i2)), A0p2);
        }
        return A0H;
    }

    public static final String A03(List list) {
        JSONArray A0p = AbstractC31171DnF.A0p();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) it.next();
            A0p.put(AbstractC31171DnF.A0q().put("field_key", leadGenFormBaseQuestion.A09).put("values", leadGenFormBaseQuestion.A00));
        }
        return AbstractC166987dD.A19(A0p);
    }

    public static final boolean A08(UserSession userSession) {
        return AbstractC167007dF.A1T(AbstractC166997dE.A0Y(userSession).A03.CTD());
    }

    public final SpannableStringBuilder A09(Activity activity, Context context, UserSession userSession) {
        int i = 2131964875;
        if (A08(userSession)) {
            i = 2131964876;
        }
        return A00(activity, context, userSession, i, AbstractC53242c7.A06(context));
    }
}
