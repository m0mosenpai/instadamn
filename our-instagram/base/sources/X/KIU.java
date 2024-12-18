package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;

/* loaded from: classes8.dex */
public final class KIU extends AbstractC66412zI {
    public final Fragment A00;
    public final UserSession A01;
    public final C45516KDh A02;
    public final boolean A03;

    public KIU(Fragment fragment, UserSession userSession, C45516KDh c45516KDh, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = c45516KDh;
        this.A00 = fragment;
        this.A03 = z;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C44745JrS(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.notes_audience_item, false), this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C47647L2g c47647L2g;
        String string;
        C45830KQl c45830KQl = (C45830KQl) interfaceC66482zP;
        C44745JrS c44745JrS = (C44745JrS) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c45830KQl, c44745JrS);
        KIU kiu = c44745JrS.A06;
        Fragment fragment = kiu.A00;
        NoteAudience noteAudience = c45830KQl.A00;
        switch (noteAudience.ordinal()) {
            case 0:
            case 1:
            case 5:
                C14360o3.A0B(fragment, 0);
                LayerDrawable A0B = AbstractC43593JPy.A0B(LIN.A00(fragment), fragment.requireContext().getDrawable(R.drawable.instagram_user_following_pano_outline_24));
                int A02 = AbstractC43593JPy.A02(fragment.requireContext(), A1R ? 1 : 0);
                int A022 = AbstractC43593JPy.A02(fragment.requireContext(), 8);
                A0B.setLayerInset(0, A02, A02, A02, A02);
                A0B.setLayerInset(A1R ? 1 : 0, A022, A022, A022, A022);
                c47647L2g = new C47647L2g(A0B, new NoteAudienceItem(NoteAudience.A07, null, null, 0), AbstractC166997dE.A0q(AbstractC166997dE.A0N(fragment), 2131968739), null);
                break;
            case 2:
                UserSession userSession = kiu.A01;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(fragment, A1R ? 1 : 0);
                NoteAudienceItem noteAudienceItem = new NoteAudienceItem(NoteAudience.A05, null, null, 0);
                String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(fragment), 2131956264);
                int A00 = AbstractC34041F0u.A00(userSession);
                Resources A0N = AbstractC166997dE.A0N(fragment);
                if (A00 > 0) {
                    string = AbstractC167017dG.A0k(A0N, A00, R.plurals.recipient_picker_close_friends_count);
                } else {
                    string = A0N.getString(2131968736);
                }
                C14360o3.A0A(string);
                c47647L2g = new C47647L2g(AbstractC172497mJ.A00(fragment.requireContext()), noteAudienceItem, A0q, string);
                break;
            case 3:
                boolean z = kiu.A03;
                C14360o3.A0B(fragment, 0);
                LayerDrawable A0B2 = AbstractC43593JPy.A0B(LIN.A00(fragment), fragment.requireContext().getDrawable(R.drawable.instagram_lock_pano_outline_24));
                int A023 = AbstractC43593JPy.A02(fragment.requireContext(), A1R ? 1 : 0);
                int A024 = AbstractC43593JPy.A02(fragment.requireContext(), 8);
                A0B2.setLayerInset(0, A023, A023, A023, A023);
                A0B2.setLayerInset(A1R ? 1 : 0, A024, A024, A024, A024);
                NoteAudienceItem noteAudienceItem2 = new NoteAudienceItem(NoteAudience.A06, null, null, 0);
                Resources A0N2 = AbstractC166997dE.A0N(fragment);
                int i = 2131968738;
                if (z) {
                    i = 2131954083;
                }
                String string2 = A0N2.getString(i);
                C14360o3.A0A(string2);
                c47647L2g = new C47647L2g(A0B2, noteAudienceItem2, string2, null);
                break;
            case 4:
                UserSession userSession2 = kiu.A01;
                C14360o3.A0B(userSession2, 0);
                C14360o3.A0B(fragment, A1R ? 1 : 0);
                Drawable drawable = fragment.requireContext().getDrawable(R.drawable.instagram_user_following_outline_96);
                AbstractC166997dE.A0Y(userSession2).A03.B7S();
                c47647L2g = new C47647L2g(drawable, new NoteAudienceItem(NoteAudience.A04, null, null, 0), AbstractC166997dE.A0q(AbstractC166997dE.A0N(fragment), 2131968737), null);
                break;
            default:
                throw B4Z.A00();
        }
        ViewOnClickListenerC48066LPr.A00(c44745JrS.A01, 61, c47647L2g, kiu);
        IgSimpleImageView igSimpleImageView = c44745JrS.A02;
        igSimpleImageView.setImageDrawable(c47647L2g.A01);
        NoteAudience noteAudience2 = NoteAudience.A05;
        if (noteAudience != noteAudience2) {
            Context context = c44745JrS.A00.getContext();
            AbstractC31173DnH.A11(context, igSimpleImageView, AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon));
        }
        IgTextView igTextView = c44745JrS.A04;
        AbstractC56952jT.A01(igTextView);
        igTextView.setText(c47647L2g.A03);
        IgTextView igTextView2 = c44745JrS.A03;
        String str = c47647L2g.A00;
        igTextView2.setText(str);
        int i2 = 0;
        if (str == null || str.length() == 0) {
            i2 = 8;
        }
        igTextView2.setVisibility(i2);
        if (c47647L2g.A02.A00 == noteAudience2) {
            ViewOnClickListenerC48062LPn.A00(igTextView2, 21, kiu);
        } else {
            igTextView2.setCompoundDrawables(null, null, null, null);
        }
        c44745JrS.A05.setChecked(c45830KQl.A01);
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        Context context2 = c44745JrS.A00.getContext();
        layoutParams.width = context2.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        layoutParams.height = AbstractC166997dE.A04(context2, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        igSimpleImageView.setLayoutParams(layoutParams);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45830KQl.class;
    }

    public KIU() {
    }
}
