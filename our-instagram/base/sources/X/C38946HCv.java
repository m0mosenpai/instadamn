package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.HCv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38946HCv extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "SurveyQuestionFragment";
    public int A00;
    public UserSession A01;
    public C41222IMn A02;
    public C41232IMx A03;
    public C189478aR A04;
    public C38896HAs A05;
    public String A06;
    public HashMap A07;
    public IgdsStepperHeader A08;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.fragment.app.Fragment, X.HCv, X.2oe] */
    public static C38946HCv A00(UserSession userSession, C38896HAs c38896HAs, HashMap hashMap, int i) {
        ?? abstractC59962oe = new AbstractC59962oe();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putSerializable("ARG_CONTEXT_DATA_MAP", hashMap);
        A05.putInt("ARG_QUESTION_INDEX", i);
        try {
            A05.putSerializable("ARG_SERIALIZED_SURVEY_DATA", C41708Ide.A00(c38896HAs));
            abstractC59962oe.setArguments(A05);
            return abstractC59962oe;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A05.A05;
        str.getClass();
        return str;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        String str = this.A05.A05;
        str.getClass();
        if (str.equals("landing_page_quality_survey")) {
            UserSession userSession = this.A01;
            String str2 = this.A06;
            String str3 = this.A03.A03.A03;
            str3.getClass();
            HashMap hashMap = this.A07;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, userSession), "instagram_landing_page_quality_survey_exit");
            if (A0f.isSampled() && hashMap != null) {
                AbstractC40896I9u.A00(A0f, userSession, str2, hashMap);
                A0f.AAP("question_id", str3);
                A0f.Cht();
            }
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        H6W h6w;
        int A02 = C0f9.A02(1024898942);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC31176DnK.A0S(this);
        this.A07 = (HashMap) requireArguments.getSerializable("ARG_CONTEXT_DATA_MAP");
        this.A00 = requireArguments.getInt("ARG_QUESTION_INDEX");
        String string = requireArguments.getString("ARG_SERIALIZED_SURVEY_DATA");
        try {
            string.getClass();
            C38896HAs parseFromJson = C41708Ide.parseFromJson(C16V.A00(string));
            this.A05 = parseFromJson;
            List list = parseFromJson.A06;
            list.getClass();
            C41021IEq c41021IEq = (C41021IEq) list.get(0);
            String str = c41021IEq.A00;
            str.getClass();
            this.A06 = str;
            c41021IEq.A01.getClass();
            c41021IEq.A01.get(0).getClass();
            IKO iko = (IKO) c41021IEq.A01.get(0);
            C41222IMn c41222IMn = iko.A05;
            if (c41222IMn == null && (h6w = iko.A01) != null) {
                c41222IMn = new C41222IMn(h6w);
                iko.A05 = c41222IMn;
            }
            c41222IMn.getClass();
            this.A02 = c41222IMn;
            this.A03 = c41222IMn.A01(this.A00);
            C0f9.A09(-2119741063, A02);
        } catch (IOException e) {
            RuntimeException runtimeException = new RuntimeException(e);
            C0f9.A09(-891580813, A02);
            throw runtimeException;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1624853661);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.survey_question_bottom_sheet_fragment);
        C0f9.A09(26895136, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.question_title);
        TextView A0T2 = AbstractC166997dE.A0T(view, R.id.question_disclaimer_text);
        A0T.setText(this.A03.A03.A07);
        String str = this.A03.A03.A02;
        if (str != null && !str.trim().isEmpty()) {
            A0T2.setVisibility(0);
            A0T2.setText(this.A03.A03.A02);
        } else {
            A0T2.setVisibility(8);
        }
        AbstractC31172DnG.A0G(view, R.id.question_answer_recycler_view).setAdapter(new C38354Gtq(requireContext(), this, AbstractC31171DnF.A0n(this.A03.A04)));
        IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
        this.A08 = igdsStepperHeader;
        int i = 1;
        if (this.A00 == 0) {
            i = 0;
        }
        igdsStepperHeader.A03(i, 2, true, true);
        this.A08.A01();
        String str2 = this.A05.A05;
        str2.getClass();
        if (str2.equals("landing_page_quality_survey") && this.A00 == 0) {
            UserSession userSession = this.A01;
            String str3 = this.A06;
            HashMap hashMap = this.A07;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, userSession), "instagram_landing_page_quality_survey_invitation_impression");
            if (A0f.isSampled() && hashMap != null) {
                AbstractC40896I9u.A00(A0f, userSession, str3, hashMap);
                A0f.Cht();
            }
        }
    }
}
