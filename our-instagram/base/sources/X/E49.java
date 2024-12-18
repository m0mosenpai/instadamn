package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class E49 extends C3OO implements C7QE {
    public static final List A0H = AbstractC16960so.A1Q(Integer.valueOf(R.id.winner_media_1), Integer.valueOf(R.id.winner_media_2), Integer.valueOf(R.id.winner_media_3));
    public static final List A0I = AbstractC16960so.A1Q(Integer.valueOf(R.id.winner_mention_1), Integer.valueOf(R.id.winner_mention_2), Integer.valueOf(R.id.winner_mention_3));
    public C7QH A00;
    public final Context A01;
    public final View A02;
    public final View A03;
    public final ViewStub A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final IgTextView A07;
    public final InterfaceC56392iX A08;
    public final InterfaceC56392iX A09;
    public final InterfaceC56392iX A0A;
    public final InterfaceC56392iX A0B;
    public final InterfaceC56392iX A0C;
    public final FFG A0D;
    public final C34646FOd A0E;
    public final IgdsMediaButton A0F;
    public final View A0G;

    public static final Al9 A00(C32717Eai c32717Eai) {
        String str;
        String str2;
        String str3;
        String str4;
        URJ urj = new URJ(null, null, null, null, null, c32717Eai.A03, null, null, null);
        C59626Qiq c59626Qiq = c32717Eai.A01;
        if (c59626Qiq == null || (str = c59626Qiq.A09(AbstractC31422DrR.A01())) == null) {
            str = "";
        }
        if (c59626Qiq != null) {
            str2 = c59626Qiq.A0A("profile_image_uri(size:256)");
        } else {
            str2 = null;
        }
        SimpleImageUrl A0t = AbstractC25225BEi.A0t(str2);
        List<C26079Bg8> list = c32717Eai.A06;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (C26079Bg8 c26079Bg8 : list) {
            Parcelable.Creator creator = User.CREATOR;
            C2JS c2js = (C2JS) c26079Bg8.A02;
            if (c2js != null) {
                str3 = c2js.A08("igid");
                str4 = c2js.A0A(AbstractC31422DrR.A01());
            } else {
                str3 = null;
                str4 = null;
            }
            A0q.add(new ChannelChallengeStickerWinnerModel(AbstractC25225BEi.A0t(c26079Bg8.A03), new User(str3, str4), null));
        }
        return new Al9(urj, A0t, Integer.valueOf(list.size()), str, null, null, null, null, null, A0q, null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E49(Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, FFG ffg, C34646FOd c34646FOd) {
        super(view);
        AbstractC25234BEr.A1P(context, userSession, c34646FOd);
        AbstractC167017dG.A1T(interfaceC11380iw, ffg);
        this.A01 = context;
        this.A06 = userSession;
        this.A0G = view;
        this.A0E = c34646FOd;
        this.A05 = interfaceC11380iw;
        this.A0D = ffg;
        this.A02 = AbstractC166987dD.A0c(view, R.id.card);
        this.A0F = (IgdsMediaButton) AbstractC166987dD.A0c(view, R.id.cta_button);
        this.A03 = AbstractC166987dD.A0c(view, R.id.action_status_container);
        this.A07 = AbstractC31175DnJ.A0L(view, R.id.status);
        this.A08 = AbstractC31179DnN.A0M(view, R.id.full_screen_winner_media);
        this.A09 = AbstractC31179DnN.A0M(view, R.id.stacked_media_1);
        this.A0A = AbstractC31179DnN.A0M(view, R.id.stacked_media_2);
        this.A0B = AbstractC31179DnN.A0M(view, R.id.stacked_media_3);
        View findViewById = view.findViewById(R.id.stacked_media_v2);
        C14360o3.A0C(findViewById, AbstractC111324zv.A00(13));
        ViewStub viewStub = (ViewStub) findViewById;
        this.A04 = viewStub;
        this.A0C = AbstractC56372iV.A00(viewStub);
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }
}
