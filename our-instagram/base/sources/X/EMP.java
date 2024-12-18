package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class EMP extends AbstractC59962oe implements InterfaceC63982vJ {
    public static final String __redex_internal_original_name = "GroupMentionUserListFragment";
    public View A00;
    public View A01;
    public RecyclerView A02;
    public InterfaceC37240Gap A03;
    public C38E A04;
    public User A05;
    public String A06;
    public String A07;
    public List A08 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A0B = C1XM.A00(new B8P(this, 39));
    public final InterfaceC09390do A0A = C1XM.A00(new B8P(this, 38));
    public final InterfaceC09390do A0C = C1XM.A00(GUI.A00);
    public final InterfaceC09390do A0E = C1XM.A00(GUJ.A00);
    public final InterfaceC09390do A09 = C1XM.A00(new B8P(this, 37));
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_group_mention_user_list";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = view.requireViewById(R.id.spinner);
        this.A00 = view.requireViewById(R.id.divider);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.group_mention_sticker_users);
        A0G.setAdapter((C2UU) this.A0A.getValue());
        AbstractC31174DnI.A16(requireContext(), A0G, 1, false);
        this.A02 = A0G;
        InterfaceC09390do interfaceC09390do = this.A0D;
        C38E c38e = new C38E(this, AbstractC166987dD.A0r(interfaceC09390do), new C38C(this));
        this.A04 = c38e;
        c38e.A0C = AbstractC166997dE.A0n();
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        String str2 = ((C217859kI) this.A0B.getValue()).A04;
        C14360o3.A0B(A0o, 0);
        C14360o3.A0B(str2, 1);
        C25621Ms A0M = AbstractC31177DnL.A0M(A0o);
        A0M.A0B("stories/group_mention_stickers/details/");
        A0M.A9s("sticker_id", str2);
        C31702Dw7.A00(this, AbstractC25227BEk.A0e(A0M, C32146EAt.class, FSO.class), 32);
        if (this.mView != null) {
            View view2 = this.A01;
            if (view2 == null) {
                str = "spinner";
            } else {
                view2.setVisibility(0);
                View view3 = this.A00;
                if (view3 == null) {
                    str = "divider";
                } else {
                    view3.setVisibility(8);
                    RecyclerView recyclerView = this.A02;
                    if (recyclerView == null) {
                        str = "mentionedUsersRecyclerView";
                    } else {
                        recyclerView.setVisibility(8);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC63982vJ
    public final void DHC(Reel reel, C6X4 c6x4) {
        ((C2UU) this.A0A.getValue()).notifyDataSetChanged();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    public final void A00(User user) {
        requireView();
        InterfaceC09390do interfaceC09390do = this.A0D;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        AbstractC31173DnH.A1I(this, AbstractC31171DnF.A0L(getActivity(), AbstractC31364DqT.A02().A01(AbstractC166987dD.A0r(interfaceC09390do), AbstractC31402Dr6.A03(AbstractC166987dD.A0r(interfaceC09390do), user.getId(), "group_mention_user_list_user_row", "ig_group_mention_user_list")), A0o, ModalActivity.class, "profile"));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        String string;
        User user;
        int A02 = C0f9.A02(621284407);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            str = bundle2.getString("group_mention_base_reel_id");
        }
        if (str != null) {
            this.A06 = str;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null && (string = bundle3.getString("group_mention_base_reel_item_id")) != null) {
                this.A07 = string;
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null && (user = (User) bundle4.getParcelable("group_mention_base_reel_owner")) != null) {
                    this.A05 = user;
                    C0f9.A09(-567123401, A02);
                    return;
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = -1896077776;
                }
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -1963200226;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 897302171;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1095873783);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.group_mention_user_list_sheet_fragment, false);
        C0f9.A09(-1626449654, A02);
        return A0R;
    }
}
