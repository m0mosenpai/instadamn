package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.List;

/* renamed from: X.Ejv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33152Ejv extends ELn implements InterfaceC189488aT {
    public static final String __redex_internal_original_name = "CollabNoteInvitationListFragment";
    public RecyclerView A00;
    public IgTextView A01;
    public FG6 A02;
    public int A04;
    public List A03 = C16930sl.A00;
    public final String A05 = "ig_collab_notes_invitee_selector";
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final boolean A07 = true;

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 0.75f;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
    }

    @Override // X.ELn, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0A().A00 = new C34624FNh(requireContext(), null, null, 0, true);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AbstractC166997dE.A0S(requireView(), R.id.search_box);
        View A0S = AbstractC166997dE.A0S(requireView(), R.id.search_exit_button);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A06);
        C33153Ejw c33153Ejw = new C33153Ejw(requireContext, A0S, AbstractC018607g.A00(this), A0r, igdsInlineSearchBox, new C36695GFq(this, 1), A0A());
        C169127gl A00 = AbstractC169097gi.A00(null, c33153Ejw.A02, new C61972ry(c33153Ejw.A00, c33153Ejw.A01, null), c33153Ejw.A03, MSV.A00(28), null, true);
        ((GFg) c33153Ejw).A00 = A00;
        A00.EYJ(c33153Ejw);
        super.A01 = c33153Ejw;
        RecyclerView A0F = AbstractC31176DnK.A0F(requireView());
        this.A00 = A0F;
        if (A0F == null) {
            str = "recyclerView";
        } else {
            C3F1 c3f1 = A0F.A0C;
            C14360o3.A0C(c3f1, MSV.A00(526));
            ((C3F0) c3f1).A00 = false;
            IgTextView A0X = AbstractC31172DnG.A0X(requireView(), R.id.collab_note_invitation_done_button);
            this.A01 = A0X;
            if (A0X == null) {
                str = "doneButton";
            } else {
                ViewOnClickListenerC35666Fp0.A00(A0X, 5, this);
                A0A().A03(requireContext(), null, EnumC153216up.A06);
                GSR.A02(this, C07Y.A00(this), 41);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.ELn
    public final void A0D(IgdsCheckBox igdsCheckBox, C32069E6v c32069E6v) {
        AbstractC167017dG.A1N(c32069E6v, igdsCheckBox);
        if (!igdsCheckBox.isChecked() && AbstractC31173DnH.A0L(A0A().A0D).size() == this.A04) {
            C146106i8 A0j = AbstractC25229BEm.A0j();
            A0j.A0H = "note_max_collaborators_limit_reached";
            A0j.A0D = AbstractC31174DnI.A0w(this, Integer.valueOf(this.A04), 2131956332);
            C31349DqE A00 = A0j.A00();
            View view = this.mView;
            if (view != null) {
                view.postDelayed(new GLO(A00), 100L);
                return;
            }
            return;
        }
        super.A0D(igdsCheckBox, c32069E6v);
        A0B().A00();
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return this.A07;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 0.75f;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25233BEq.A14(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1599972536);
        super.onCreate(bundle);
        this.A04 = AbstractC25225BEi.A07(C06090Tz.A05, AbstractC31178DnM.A0M(this.A06), 36610958361303284L);
        C0f9.A09(6239961, A02);
    }

    @Override // X.ELn, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(775185422);
        ELn.A01(this, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_collab_note_invitation_list, false);
        C0f9.A09(1094047048, A02);
        return A0R;
    }
}
