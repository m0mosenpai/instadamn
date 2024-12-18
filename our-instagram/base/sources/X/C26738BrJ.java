package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.api.schemas.NoteReactionType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BrJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26738BrJ extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ContentNoteDetailsFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C = C29889DGd.A00(this, 36);
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0E;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgImageView A0T = AbstractC167007dF.A0T(view, R.id.content_note_owner_profile_pic);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("MODULE_NAME_ARGUMENT", "");
        ArrayList A02 = AbstractC53062bn.A02(requireArguments, NoteEmojiReactionInfo.class, "LIKERS_LIST_ARGUMENT");
        if (A02 != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((NoteEmojiReactionInfo) next).A00 == NoteReactionType.A05) {
                    A1E.add(next);
                }
            }
            list = AbstractC166987dD.A1E();
            Iterator it2 = A1E.iterator();
            while (it2.hasNext()) {
                User user = ((NoteEmojiReactionInfo) it2.next()).A01;
                if (user != null) {
                    list.add(user);
                }
            }
        } else {
            list = C16930sl.A00;
        }
        ImageUrl imageUrl = (ImageUrl) this.A04.getValue();
        if (imageUrl != null) {
            A0T.setUrl(imageUrl, this);
        }
        TextView A0N = AbstractC167007dF.A0N(view, R.id.title);
        String string2 = requireArguments.getString("TEXT_ARGUMENT");
        if (string2 != null) {
            AbstractC25227BEk.A11(A0N);
            FragmentActivity requireActivity = requireActivity();
            UserSession A0r = AbstractC166987dD.A0r(this.A0D);
            C14360o3.A0A(string);
            String A15 = AbstractC25225BEi.A15(this.A05);
            String A152 = AbstractC25225BEi.A15(this.A0B);
            A0N.setText(JX9.A02(requireActivity, null, A0r, (Integer) this.A03.getValue(), AbstractC25231BEo.A0j(0, AbstractC25225BEi.A15(this.A09)), string2, string, A15, A152, AbstractC25225BEi.A15(this.A02)));
        }
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.audience_text);
        InterfaceC09390do interfaceC09390do = this.A0D;
        interfaceC09390do.getValue();
        Resources A0N3 = AbstractC166997dE.A0N(this);
        C14360o3.A07(A0N3);
        NoteAudienceItem noteAudienceItem = (NoteAudienceItem) this.A00.getValue();
        boolean A1V = AbstractC167007dF.A1V(noteAudienceItem);
        String A0r2 = AbstractC166997dE.A0r(A0N3, AbstractC46776KmX.A00(A0N3, noteAudienceItem), 2131954101);
        C14360o3.A07(A0r2);
        A0N2.setText(A0r2);
        if (AbstractC166987dD.A1b(list)) {
            ((L8C) this.A0C.getValue()).A00((ViewStub) AbstractC166997dE.A0S(view, R.id.note_reactions_layout), requireActivity(), list, new ME3(string, this, 21), A1V);
        }
        View A0S = AbstractC166997dE.A0S(view, R.id.note_action_buttons);
        C14360o3.A0A(string);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57161PZf(viewLifecycleOwner, c07s, this, A0S, string, null, 8), C07Y.A00(viewLifecycleOwner));
        UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
        String A153 = AbstractC25225BEi.A15(this.A09);
        String A154 = AbstractC25225BEi.A15(this.A05);
        String A155 = AbstractC25225BEi.A15(this.A02);
        Number number = (Number) this.A03.getValue();
        C14360o3.A0B(A0r3, 0);
        AbstractC167007dF.A1E(string, A1V ? 1 : 0, A153);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0r3), "instagram_media_note_replace_sheet_impression_client");
        Long A00 = BSo.A00(A0r3, A153);
        if (A0f.isSampled() && A00 != null) {
            A0f.A9K("note_id", A00);
            A0f.AAP("container_module", string);
            A0f.A9K("carousel_index", AbstractC25234BEr.A0X(A0f, number, "inventory_source", A154));
            A0f.AAP("carousel_media_id", A155);
            AbstractC167017dG.A1C(A0f);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    public C26738BrJ() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C29648D5q(this));
        this.A09 = DH6.A01(this, "NOTE_ID_ARGUMENT", enumC09460dv, 24);
        this.A07 = DH6.A01(this, "MEDIA_ID_ARGUMENT", enumC09460dv, 25);
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C29649D5r(this));
        this.A01 = DH6.A01(this, "AUDIENCE_ARGUMENT", enumC09460dv, 26);
        this.A00 = C29889DGd.A00(this, 35);
        this.A0B = AbstractC09440dt.A00(enumC09460dv, new C29650D5s(this));
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C29651D5t(this));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C29652D5u(this));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C29653D5v(this));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C29654D5w(this));
        this.A0A = AbstractC09440dt.A00(enumC09460dv, new C29655D5x(this));
        C29889DGd c29889DGd = new C29889DGd(this, 40);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C29889DGd(new C29889DGd(this, 37), 38));
        this.A0E = AbstractC25225BEi.A0a(new C29889DGd(A00, 39), c29889DGd, C29899DGn.A00(null, A00, 36), AbstractC25225BEi.A1D(C25858BcD.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1851533465);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.content_notes_delete_bottomsheet, viewGroup, false);
        C0f9.A09(-1507167157, A02);
        return inflate;
    }
}
