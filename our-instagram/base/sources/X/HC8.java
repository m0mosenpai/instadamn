package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HC8 extends AbstractC59962oe implements InterfaceC60122ou, JPi {
    public static final String __redex_internal_original_name = "QuestionResponseListFragment";
    public C38370Gu6 A00;
    public C41096IHn A01;
    public C41189ILc A02;
    public C1M1 A03;
    public String A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, AbstractC166997dE.A0N(this).getString(2131971786));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "comments_question_responses_list";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.question_responses_list);
        int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        C41189ILc c41189ILc = this.A02;
        if (c41189ILc == null) {
            C14360o3.A0F("questionResponsesListHelper");
            throw C00O.createAndThrow();
        }
        c41189ILc.A00(recyclerView, dimensionPixelSize, dimensionPixelSize);
        C07S c07s = C07S.RESUMED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MC8(c07s, this, viewLifecycleOwner, null, 17), C07Y.A00(viewLifecycleOwner));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
    
        if (X.C28151Xt.A02 == null) goto L13;
     */
    @Override // X.JHI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dcf(X.C41628IbJ r34, int r35) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HC8.Dcf(X.IbJ, int):void");
    }

    @Override // X.JHI
    public final void Dch(C41628IbJ c41628IbJ, int i) {
        C38321qM A02;
        InterfaceC09390do interfaceC09390do = this.A05;
        C18920wW A0M = AbstractC31176DnK.A0M(this, interfaceC09390do);
        C1DX A0Z = AbstractC31176DnK.A0Z(interfaceC09390do);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0M, MSV.A00(482));
        if (A0f.isSampled() && (A02 = A0Z.A02(this.A04)) != null) {
            A0f.AAP("organic_tap_action", "question_sticker_reply");
            A0f.AAP("organic_tap_action_source", "question_sticker_response_sheet");
            AbstractC25225BEi.A1O(A0f, "comments_question_responses_list");
            AbstractC25229BEm.A19(A0f, i);
            C1M1 c1m1 = this.A03;
            Long l = null;
            if (c1m1 == null) {
                C14360o3.A0F("sessionIdProvider");
                throw C00O.createAndThrow();
            }
            String sessionId = c1m1.getSessionId();
            if (sessionId == null) {
                sessionId = "";
            }
            AbstractC25225BEi.A1P(A0f, sessionId);
            AbstractC37300Gc1.A0h(A0f, AbstractC37302Gc3.A0W(A02.getId()));
            User A14 = AbstractC25226BEj.A14(A02);
            if (A14 != null) {
                l = AbstractC25231BEo.A0k(A14);
            }
            AbstractC37300Gc1.A0k(A0f, l);
            A0f.Cht();
        }
        FragmentActivity requireActivity = requireActivity();
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        int A01 = c41628IbJ.A01();
        QuestionResponsesModelIntf questionResponsesModelIntf = c41628IbJ.A01;
        String BjV = questionResponsesModelIntf.BjV();
        C14360o3.A07(BjV);
        String id = c41628IbJ.A00.getId();
        String question = questionResponsesModelIntf.getQuestion();
        C14360o3.A07(question);
        QuestionResponseType Bol = c41628IbJ.A00.Bol();
        C14360o3.A07(Bol);
        QuestionResponseReshareModel questionResponseReshareModel = new QuestionResponseReshareModel(c41628IbJ.A00.BVk(), Bol, c41628IbJ.A00.BRR(), questionResponsesModelIntf.BjR(), C41628IbJ.A00(c41628IbJ), BjV, id, question, c41628IbJ.A02(), C41628IbJ.A00(c41628IbJ).getId(), A01, true);
        C22P c22p = C22P.A0u;
        C14360o3.A0B(A0o, 2);
        INH A0C = AbstractC86593tX.A0C(c22p);
        A0C.A0D = questionResponseReshareModel;
        C6XJ.A02(requireActivity, A0C.A00(), A0o, TransparentModalActivity.class, "clips_camera").A0D(this, 9587);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-328633929);
        super.onCreate(bundle);
        this.A04 = requireArguments().getString("QuestionResponseListFragment.MEDIA_ID");
        this.A03 = C1M0.A01.A01(requireArguments().getString(AbstractC111324zv.A00(608)));
        String string = requireArguments().getString("QuestionResponseListFragment.QUESTION_ID");
        InterfaceC09390do interfaceC09390do = this.A05;
        C41189ILc c41189ILc = new C41189ILc(this, AbstractC166987dD.A0r(interfaceC09390do), this, C05F.A01, this.A04, string);
        this.A02 = c41189ILc;
        C38370Gu6 c38370Gu6 = c41189ILc.A01;
        this.A00 = c38370Gu6;
        if (c38370Gu6 == null) {
            str = "adapter";
        } else {
            c38370Gu6.setHasStableIds(true);
            C41189ILc c41189ILc2 = this.A02;
            if (c41189ILc2 == null) {
                str = "questionResponsesListHelper";
            } else {
                c41189ILc2.A02.A00(true);
                this.A01 = new C41096IHn(AbstractC018607g.A00(this), this, AbstractC166987dD.A0r(interfaceC09390do));
                C0f9.A09(2054094338, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1594290357);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_question_responses_list, viewGroup, false);
        C0f9.A09(-1266063324, A02);
        return inflate;
    }
}
