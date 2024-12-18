package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.HEz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38997HEz extends AbstractC65632xz {
    public final UserSession A00;
    public final InterfaceC63932vE A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        anonymousClass306.A7a(1);
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        View view2;
        int i3;
        Boolean bool;
        int i4;
        View view3;
        int A03 = C0f9.A03(204331228);
        AbstractC167007dF.A1D(view, 1, obj);
        C14360o3.A0B(obj2, 3);
        C41222IMn c41222IMn = (C41222IMn) obj;
        IMQ imq = (IMQ) obj2;
        if (i != 0) {
            if (i == 1) {
                Object tag = view.getTag();
                C14360o3.A0C(tag, AbstractC111324zv.A00(2784));
                C38526Gwm c38526Gwm = (C38526Gwm) tag;
                InterfaceC63932vE interfaceC63932vE = this.A01;
                C14360o3.A0B(c38526Gwm, 0);
                AbstractC167007dF.A1D(c41222IMn, 1, imq);
                C14360o3.A0B(interfaceC63932vE, 3);
                C41232IMx A01 = c41222IMn.A01(imq.A01);
                c38526Gwm.A01 = c41222IMn;
                c38526Gwm.A00 = interfaceC63932vE;
                if (!imq.A04) {
                    imq.A04 = true;
                    String str = A01.A03.A03;
                    if (str != null) {
                        interfaceC63932vE.Dce(str, imq.A01);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                interfaceC63932vE.Dcd(c41222IMn, A01);
                TextView textView = c38526Gwm.A07;
                String str2 = A01.A03.A07;
                if (str2 != null) {
                    SpannableString spannableString = new SpannableString(str2);
                    spannableString.setSpan(new C77373dN(), 0, spannableString.length(), 0);
                    textView.setText(spannableString);
                    H6W h6w = c41222IMn.A00;
                    boolean A1T = AbstractC167007dF.A1T(h6w.A02);
                    i4 = 8;
                    View view4 = c38526Gwm.A04;
                    if (A1T) {
                        ViewOnClickListenerC42034Ik3.A00(view4, 20, c38526Gwm, imq);
                        ViewOnClickListenerC42034Ik3.A00(c38526Gwm.A02, 21, c38526Gwm, imq);
                        c38526Gwm.A00(A01, imq);
                    } else {
                        view4.setVisibility(8);
                        c38526Gwm.A02.setVisibility(8);
                    }
                    boolean A1T2 = AbstractC167007dF.A1T(h6w.A01);
                    TextView textView2 = c38526Gwm.A06;
                    if (A1T2) {
                        textView2.setVisibility(0);
                        c38526Gwm.A01(A01, imq);
                    } else {
                        textView2.setVisibility(8);
                    }
                    imq.A08.add(c38526Gwm);
                    view3 = c38526Gwm.A03;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                UnsupportedOperationException A1D = AbstractC166987dD.A1D("View type unhandled");
                C0f9.A0A(480548989, A03);
                throw A1D;
            }
        } else {
            Context context = view.getContext();
            Object tag2 = view.getTag();
            C14360o3.A0C(tag2, AbstractC111324zv.A00(2785));
            C38497GwI c38497GwI = (C38497GwI) tag2;
            InterfaceC63932vE interfaceC63932vE2 = this.A01;
            C41232IMx A012 = c41222IMn.A01(imq.A01);
            H6V h6v = A012.A03;
            INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types = h6v.A00;
            if (inline_survey_question_types == INLINE_SURVEY_QUESTION_TYPES.A04) {
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c38497GwI.A02.setVisibility(8);
                String str3 = h6v.A05;
                EditText editText = (EditText) c38497GwI.A04.A01();
                if (!TextUtils.isEmpty(str3)) {
                    editText.setHint(str3);
                }
                int i6 = 0;
                editText.setVisibility(0);
                editText.setText(A012.A00);
                String str4 = A012.A00;
                if (str4 != null) {
                    i6 = str4.length();
                }
                editText.setSelection(i6);
                editText.postDelayed(new J34(c38497GwI), 100L);
                editText.setOnFocusChangeListener(new LQ4(1, c38497GwI, A012));
                editText.setImeOptions(6);
                editText.setRawInputType(1);
                editText.setOnEditorActionListener(new C42071Ike());
                boolean A1Z = AbstractC166997dE.A1Z(h6v.A01, true);
                editText.removeTextChangedListener(c38497GwI.A00);
                LO3 lo3 = new LO3(c38497GwI, A012, A1Z);
                c38497GwI.A00 = lo3;
                editText.addTextChangedListener(lo3);
            } else {
                AbstractC41752IeR.A03(context, interfaceC63932vE2, c38497GwI, c41222IMn, A012, imq);
            }
            String str5 = h6v.A02;
            if (!TextUtils.isEmpty(str5)) {
                int i7 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                ((TextView) c38497GwI.A05.A01()).setText(str5);
            }
            int i8 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            c38497GwI.A05.A03(AbstractC31175DnJ.A01(TextUtils.isEmpty(str5) ? 1 : 0));
            boolean A1W = AbstractC167007dF.A1W(c41222IMn.A01);
            if (!AbstractC167007dF.A1X(inline_survey_question_types, INLINE_SURVEY_QUESTION_TYPES.A06) || (A012.A02 ? !((bool = c41222IMn.A00.A03) == null || !bool.booleanValue()) : A012.A01)) {
                C57012jc c57012jc = c38497GwI.A03;
                View A013 = c57012jc.A01();
                String str6 = c38497GwI.A01;
                boolean z = false;
                if (str6 != "v2" && str6 != "v3") {
                    c57012jc.A03(0);
                    TextView textView3 = (TextView) c57012jc.A01();
                    Resources resources = context.getResources();
                    Boolean bool2 = c41222IMn.A00.A03;
                    if (bool2 != null && bool2.booleanValue() && (A012.A02 || A012.A01)) {
                        i3 = 2131975038;
                    } else {
                        i3 = 2131968535;
                    }
                    AbstractC31173DnH.A19(resources, textView3, i3);
                    view2 = A013;
                } else {
                    IgdsButton igdsButton = c38497GwI.A06;
                    igdsButton.setVisibility(0);
                    Resources resources2 = context.getResources();
                    Boolean bool3 = c41222IMn.A00.A03;
                    if (bool3 != null && bool3.booleanValue() && (A012.A02 || A012.A01)) {
                        i2 = 2131975038;
                    } else {
                        i2 = 2131968535;
                    }
                    igdsButton.setText(resources2.getString(i2));
                    view2 = igdsButton;
                }
                if (AbstractC166997dE.A1Z(h6v.A01, true) || A012.A01()) {
                    z = true;
                }
                view2.setActivated(z);
                C0fQ.A00(new ViewOnClickListenerC35632FoN(2, context, interfaceC63932vE2, A012, imq, c41222IMn, A1W), view2);
            } else {
                i4 = 8;
                c38497GwI.A03.A03(8);
                String str7 = c38497GwI.A01;
                if (str7 == "v2" || str7 == "v3") {
                    view3 = c38497GwI.A06;
                }
            }
            C0f9.A0A(-587899250, A03);
        }
        view3.setVisibility(i4);
        C0f9.A0A(-587899250, A03);
    }

    public C38997HEz(UserSession userSession, InterfaceC63932vE interfaceC63932vE) {
        this.A01 = interfaceC63932vE;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A01;
        int A03 = C0f9.A03(1277682609);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i == 1) {
                A01 = AbstractC41686IdF.A00(viewGroup, this.A00, "v1");
            } else {
                UnsupportedOperationException A1D = AbstractC166987dD.A1D("Unhandled view type");
                C0f9.A0A(-1809314992, A03);
                throw A1D;
            }
        } else {
            A01 = AbstractC41752IeR.A01(viewGroup);
        }
        C0f9.A0A(633714190, A03);
        return A01;
    }
}
