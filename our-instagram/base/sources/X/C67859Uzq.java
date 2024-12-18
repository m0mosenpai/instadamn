package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Uzq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67859Uzq extends AbstractC72473Mu {
    public C69127ViI A00;
    public UB6 A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.W1u, X.VAR] */
    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        String str;
        Context context = getContext();
        if (context != null) {
            String str2 = this.A04;
            if (str2 == null) {
                str = "introToast";
            } else {
                String str3 = this.A03;
                if (str3 == null) {
                    str = "introButton";
                } else {
                    ArrayList arrayList = new ArrayList();
                    ?? c70077W1u = new C70077W1u(VDB.IMAGEBLOCK, "");
                    c70077W1u.A01 = str2;
                    c70077W1u.A00 = str3;
                    arrayList.add(c70077W1u);
                    UB6 ub6 = new UB6(context, arrayList);
                    this.A01 = ub6;
                    ub6.A01 = new WNS(this, 12);
                    Context context2 = getContext();
                    if (context2 != null) {
                        C193328hC c193328hC = new C193328hC(context2);
                        c193328hC.A0s(true);
                        Dialog A02 = c193328hC.A02();
                        A02.setContentView(R.layout.rapidfeedback_dialog_view);
                        WNS.A00(A02.findViewById(R.id.close_button), 11, this);
                        AbsListView absListView = (AbsListView) AbstractC166997dE.A0R(A02.findViewById(R.id.rapidfeedback_page), R.id.rapidfeedback_page_list);
                        UB6 ub62 = this.A01;
                        if (ub62 == null) {
                            str = "currentAdapter";
                        } else {
                            absListView.setAdapter((ListAdapter) ub62);
                            String str4 = this.A02;
                            if (str4 == null) {
                                str = "integrationPointId";
                            } else {
                                String str5 = this.A07;
                                if (str5 == null) {
                                    str = "surveyId";
                                } else {
                                    String str6 = this.A06;
                                    if (str6 == null) {
                                        str = "sessionBlob";
                                    } else {
                                        AbstractC68578VWf.A00((UserSession) this.A08.getValue(), C05F.A00, str4, str5, str6, null);
                                        return A02;
                                    }
                                }
                            }
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(424100968);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = AbstractC153636vY.A01(requireArguments, "ARG_TOAST_TEXT");
        this.A03 = AbstractC153636vY.A01(requireArguments, "ARG_INTRO_TOAST_BUTTON");
        this.A05 = AbstractC153636vY.A01(requireArguments, "ARG_OUTRO_TOAST_TEXT");
        this.A02 = AbstractC153636vY.A01(requireArguments, "ARG_INTEGRATION_POINT_ID");
        this.A07 = AbstractC153636vY.A01(requireArguments, "ARG_SURVEY_ID");
        this.A06 = AbstractC153636vY.A01(requireArguments, "ARG_SESSION_BLOB");
        try {
            this.A00 = AbstractC69952VyS.parseFromJson(C16V.A00(AbstractC153636vY.A01(requireArguments, "ARG_SERIALIZED_MODEL_DATA")));
            C0f9.A09(-1200580557, A02);
        } catch (IOException e) {
            RuntimeException runtimeException = new RuntimeException(e);
            C0f9.A09(487521712, A02);
            throw runtimeException;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-807645346);
        super.onResume();
        if (this.A07 == null) {
            A07();
        }
        C0f9.A09(1411324257, A02);
    }
}
