package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4FD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FD extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C4F8 A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C4FD(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C4F8 c4f8, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A04 = z;
        this.A02 = c4f8;
        this.A03 = z2;
        this.A05 = C18U.A01(C06090Tz.A05, userSession, 36604880986051722L) > 0;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36323406011182293L));
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        if (A07) {
            Context context = layoutInflater.getContext();
            C14360o3.A07(context);
            Resources resources = context.getResources();
            C14360o3.A07(resources);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.featured_user_story_ring_size);
            Context context2 = layoutInflater.getContext();
            C14360o3.A07(context2);
            Resources resources2 = context2.getResources();
            C14360o3.A07(resources2);
            inflate = C50802Vb.A00(layoutInflater, new ViewGroup.LayoutParams(dimensionPixelSize, resources2.getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxxlarge)), viewGroup, R.layout.item_pog, 0, false, this.A05);
        } else {
            inflate = layoutInflater.inflate(R.layout.item_pog, viewGroup, false);
            C14360o3.A07(inflate);
        }
        return new C43800JYn(inflate, this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C4FL c4fl = (C4FL) interfaceC66482zP;
        C43800JYn c43800JYn = (C43800JYn) c3oo;
        C14360o3.A0B(c4fl, 0);
        C14360o3.A0B(c43800JYn, 1);
        boolean z = this.A04;
        c43800JYn.A00 = c4fl;
        if (z) {
            View view = c43800JYn.A02;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        }
        NoteAvatarView noteAvatarView = c43800JYn.A04;
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = noteAvatarView.A0J;
        User user = c4fl.A00;
        ImageUrl Bhu = user.Bhu();
        C4FD c4fd = c43800JYn.A05;
        reelAvatarWithBadgeView.setSingleAvatarUrlAndVisibility(Bhu, c4fd.A00);
        noteAvatarView.A0G(user);
        IgTextView igTextView = c43800JYn.A03;
        View view2 = c43800JYn.A01;
        Resources resources = view2.getResources();
        int i = 2131977186;
        if (c4fd.A03) {
            i = 2131971034;
        }
        igTextView.setText(resources.getString(i));
        View view3 = c43800JYn.A02;
        view3.setContentDescription(resources.getString(2131952327));
        Context context = view2.getContext();
        igTextView.setTextColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text)));
        noteAvatarView.setCreationContent(c4fl.A01);
        if (c4fl.A02 && C4AC.A02(c4fd.A01)) {
            Context context2 = noteAvatarView.getContext();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material);
            noteAvatarView.A0J.setBadgeOffset(context2.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap));
            Drawable drawable = context2.getDrawable(R.drawable.birthday_pog_indicator);
            if (drawable != null) {
                noteAvatarView.A0E(drawable, dimensionPixelOffset, false);
                noteAvatarView.setBadgeDrawableOnClickDelegate(new C50170MDx(38, c4fl, c4fd));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            noteAvatarView.A0E(null, 0, false);
            noteAvatarView.A0D();
        }
        noteAvatarView.setPadding(0, 0, 0, 0);
        AbstractC56932jR.A01(view3);
        UserSession userSession = c4fd.A01;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36329290111402233L)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long minutes = timeUnit.toMinutes(C18U.A01(c06090Tz, userSession, 36610765088168144L));
            long hours = timeUnit.toHours(C18U.A01(c06090Tz, userSession, 36610765088299218L));
            if (System.currentTimeMillis() - A00.A01.getLong("notes_self_pog_animation__last_seen_timestamp_ms", 0L) > TimeUnit.MINUTES.toMillis(minutes) && C23031Ai.A08(A00, AbstractC43591JPw.A00(1191), hours)) {
                noteAvatarView.getNoteAnimatedBubbleView().getView().setVisibility(0);
                NoteBubbleView noteBubbleView = (NoteBubbleView) noteAvatarView.getNoteAnimatedBubbleView().getView();
                Context context3 = noteAvatarView.getContext();
                C14360o3.A07(context3);
                UserSession userSession2 = noteAvatarView.A05;
                if (userSession2 != null) {
                    noteBubbleView.setText(AbstractC92944En.A03(context3, userSession2), false, "", C25052B6z.A00);
                    C152716tz.A00(noteAvatarView.getNoteAnimatedBubbleView().getView());
                    ((NoteBubbleView) noteAvatarView.getNoteAnimatedBubbleView().getView()).A0F(null, AbstractC53242c7.A09(context3));
                    noteAvatarView.invalidate();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    UserSession userSession3 = noteAvatarView.A05;
                    if (userSession3 != null) {
                        long A01 = C18U.A01(c06090Tz, userSession3, 36610765088233681L);
                        ofFloat.setDuration(A01);
                        ofFloat.setStartDelay(300L);
                        ofFloat.addUpdateListener(new C48000LLt(noteAvatarView));
                        ofFloat.addListener(new C46071KaS(noteAvatarView, A01));
                        ofFloat.start();
                        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                        ARD.E7G("notes_self_pog_animation__last_seen_timestamp_ms", System.currentTimeMillis());
                        ARD.apply();
                        return;
                    }
                }
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C4FL.class;
    }

    public C4FD() {
    }
}
