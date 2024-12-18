package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.ERo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32462ERo extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC37215GaQ A03;
    public final GXk A04;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int i3;
        IgSimpleImageView igSimpleImageView;
        View.OnClickListener viewOnClickListenerC35688FpN;
        int i4;
        int A03 = C0f9.A03(515779323);
        FOC foc = (FOC) obj;
        Integer A00 = FVZ.A00(foc);
        Integer num = C05F.A00;
        if (A00 != num && A00 != C05F.A01) {
            A00.getClass();
            IllegalArgumentException A0c = AbstractC167007dF.A0c("Unaccepted recommendation type for InterestRecommendation: ", F8P.A00(A00));
            C0f9.A0A(-265003628, A03);
            throw A0c;
        }
        Context context = this.A00;
        FOA foa = (FOA) AbstractC31172DnG.A0x(view);
        int A0H = AbstractC166987dD.A0H(obj2);
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        InterfaceC37215GaQ interfaceC37215GaQ = this.A03;
        GXk gXk = this.A04;
        if (FVZ.A00(foc) == num) {
            Hashtag hashtag = foc.A00;
            hashtag.getClass();
            if (hashtag.Bhu() != null) {
                foa.A05.setUrl(hashtag.Bhu(), interfaceC11380iw);
            }
            i3 = 0;
            foa.A02.setText(AbstractC13670mt.A06("#%s", hashtag.getName()));
            ViewOnClickListenerC35688FpN.A00(foa.A00, interfaceC37215GaQ, hashtag, A0H, 8);
            ReelBrandingBadgeView reelBrandingBadgeView = foa.A07;
            reelBrandingBadgeView.setIconDrawable(R.drawable.reel_hash_branding_icon);
            reelBrandingBadgeView.setVisibility(0);
            i2 = 8;
            foa.A08.setVisibility(8);
            HashtagFollowButton hashtagFollowButton = foa.A06;
            hashtagFollowButton.setVisibility(0);
            hashtagFollowButton.A01(interfaceC11380iw, new C36496G7u(interfaceC37215GaQ, A0H), hashtag);
        } else if (FVZ.A00(foc) == C05F.A01) {
            User user = foc.A02;
            user.getClass();
            AbstractC31173DnH.A1T(interfaceC11380iw, foa.A05, user);
            AbstractC31173DnH.A1F(foa.A02, user);
            ViewOnClickListenerC35688FpN.A00(foa.A00, interfaceC37215GaQ, user, A0H, 6);
            i2 = 8;
            foa.A07.setVisibility(8);
            foa.A06.setVisibility(8);
            FollowButton followButton = foa.A08;
            i3 = 0;
            followButton.setVisibility(0);
            ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
            viewOnAttachStateChangeListenerC110564yT.A08(new C33269EnQ(interfaceC37215GaQ, A0H));
            viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, user);
        } else {
            Integer A002 = FVZ.A00(foc);
            A002.getClass();
            throw AbstractC167007dF.A0c("Unaccepted recommendation type for InterestRecommendation: ", F8P.A00(A002));
        }
        TextView textView = foa.A01;
        textView.setText(foc.A05);
        textView.setVisibility(i3);
        if (AbstractC167007dF.A0K(context).widthPixels <= 1000) {
            if (FVZ.A00(foc) == num) {
                i4 = 2131960997;
            } else if (FVZ.A00(foc) == C05F.A01) {
                i4 = 2131960998;
            } else {
                Integer A003 = FVZ.A00(foc);
                A003.getClass();
                throw AbstractC167007dF.A0c("Unaccepted recommendation type for InterestRecommendation: ", F8P.A00(A003));
            }
            String string = context.getString(i4);
            foa.A03.setVisibility(i2);
            igSimpleImageView = foa.A04;
            igSimpleImageView.setVisibility(i3);
            viewOnClickListenerC35688FpN = new ViewOnClickListenerC35637FoW(context, interfaceC37215GaQ, gXk, foc, string, new CharSequence[]{string}, A0H);
        } else {
            foa.A04.setVisibility(i2);
            igSimpleImageView = foa.A03;
            igSimpleImageView.setVisibility(i3);
            viewOnClickListenerC35688FpN = new ViewOnClickListenerC35688FpN(A0H, 7, interfaceC37215GaQ, foc);
        }
        C0fQ.A00(viewOnClickListenerC35688FpN, igSimpleImageView);
        C0f9.A0A(1516954681, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        int i;
        Integer A00 = FVZ.A00((FOC) obj);
        if (A00 == C05F.A00) {
            i = 0;
        } else if (A00 == C05F.A01) {
            i = 1;
        } else {
            A00.getClass();
            throw AbstractC167007dF.A0c("Unaccepted recommendation type for InterestRecommendation: ", F8P.A00(A00));
        }
        anonymousClass306.A7a(i);
    }

    public C32462ERo(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37215GaQ interfaceC37215GaQ, GXk gXk) {
        this.A00 = context;
        this.A03 = interfaceC37215GaQ;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = gXk;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1387527727);
        if (i != 0 && i != 1) {
            IllegalArgumentException A0n = AbstractC25230BEn.A0n("Unaccepted viewType InterestRecommendation: ", i);
            C0f9.A0A(1943421561, A03);
            throw A0n;
        }
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(this.A00), R.layout.row_recommended_user);
        A0C.setTag(new FOA(A0C));
        C0f9.A0A(-1553251795, A03);
        return A0C;
    }
}
