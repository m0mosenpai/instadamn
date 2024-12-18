package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.follow.chaining.FollowChainingButton;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.73L, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C73L {
    public static void A04(Context context, LinearLayout linearLayout, C51745MtU c51745MtU, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC155676yw enumC155676yw, C70O c70o, C73M c73m, User user) {
        int A01 = AbstractC13890nF.A01(context);
        if (A01 != c73m.A00) {
            C73N.A01(context, c73m.A08, A01);
            c73m.A00 = A01;
        }
        for (C73R c73r : (List) c51745MtU.A01) {
            View A00 = A00(context, interfaceC11380iw, userSession, null, c70o, c73m, c73r, null, user, null, null, null, c51745MtU.A00);
            linearLayout.addView(A00);
            AbstractC56952jT.A01(A00);
            if (c73r instanceof C73T) {
                c70o.BhX().Elb(A00);
            } else if (c73r instanceof C73Z) {
                c70o.BhX().EkW(A00);
            } else if (c73r instanceof C73Q) {
                c70o.BhX().Ekq(A00);
            } else if (c73r instanceof C1569673a) {
                c70o.BhX().ElI(A00);
                c70o.BhX().EDh(A00, user);
            } else if (c73r instanceof C1569773b) {
                c70o.BhX().Ekp(A00);
            } else if (c73r instanceof C151216rO) {
                c70o.BiC().El6(A00);
            } else if (c73r instanceof C151576s3) {
                c70o.BhX().Eli(A00);
            }
        }
        if (c51745MtU.A02) {
            linearLayout.addView(A03(context, userSession, enumC155676yw, c70o, c73m, user));
        }
    }

    public static void A06(LinearLayout linearLayout, C73M c73m) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            Object tag = childAt.getTag();
            Map map = c73m.A07;
            if (!map.containsKey(tag)) {
                map.put(tag, new LinkedList());
            }
            Object obj = map.get(tag);
            obj.getClass();
            ((Queue) obj).offer(childAt);
        }
        linearLayout.removeAllViews();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View A00(android.content.Context r20, X.InterfaceC11380iw r21, com.instagram.common.session.UserSession r22, X.C38321qM r23, X.C70O r24, X.C73M r25, final X.C73R r26, com.instagram.profile.intf.UserDetailEntryInfo r27, com.instagram.user.model.User r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73L.A00(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.1qM, X.70O, X.73M, X.73R, com.instagram.profile.intf.UserDetailEntryInfo, com.instagram.user.model.User, java.lang.String, java.lang.String, java.lang.String, int):android.view.View");
    }

    public static View A01(Context context, UserSession userSession, C73M c73m, final C73R c73r, int i) {
        View inflate;
        Queue queue = (Queue) c73m.A07.get("generic");
        if (queue != null && !queue.isEmpty()) {
            inflate = (View) queue.poll();
        } else if (C18U.A06(C06090Tz.A05, userSession, 36322641501694332L)) {
            inflate = C50802Vb.A02(LayoutInflater.from(context), c73m.A02, R.layout.profile_header_user_actions_generic_button);
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.profile_header_user_actions_generic_button, c73m.A02, false);
        }
        inflate.getClass();
        IgdsButton igdsButton = (IgdsButton) inflate.requireViewById(R.id.button_container);
        igdsButton.setTag("generic");
        Integer BEt = c73r.BEt();
        if (BEt != null) {
            igdsButton.A02(EnumC99774dy.A03, BEt.intValue());
            igdsButton.setIconPadding(context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
        }
        igdsButton.setText(c73r.Aj7());
        C0fQ.A00(new View.OnClickListener() { // from class: X.6wv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C73R.this.onClick();
            }
        }, igdsButton);
        igdsButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.6ww
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C73R.this.DQZ();
            }
        });
        A05(inflate, c73m, i);
        inflate.requireViewById(R.id.dot_badge).setVisibility(8);
        return inflate;
    }

    public static View A02(ViewGroup viewGroup, UserSession userSession) {
        View inflate;
        C13080lu A00 = AbstractC13090lv.A00("ProfileUserActionsViewBinder.newView");
        try {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            if (C18U.A06(C06090Tz.A05, userSession, 36322641502218624L)) {
                inflate = C50802Vb.A02(LayoutInflater.from(context), viewGroup, R.layout.profile_header_user_actions_row);
            } else {
                inflate = from.inflate(R.layout.profile_header_user_actions_row, viewGroup, false);
            }
            inflate.setTag(new C73M(inflate, false));
            A00.close();
            return inflate;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public static FollowChainingButton A03(Context context, UserSession userSession, EnumC155676yw enumC155676yw, final C70O c70o, C73M c73m, User user) {
        View inflate;
        FollowChainingButton followChainingButton;
        View.OnClickListener onClickListener;
        Queue queue = (Queue) c73m.A07.get("chaining");
        if (queue != null && !queue.isEmpty()) {
            followChainingButton = (FollowChainingButton) queue.poll();
        } else {
            if (C18U.A06(C06090Tz.A05, userSession, 36323406010658002L)) {
                inflate = C50802Vb.A00(LayoutInflater.from(context), null, c73m.A02, R.layout.profile_header_chaining_icon, 0, false, true);
            } else {
                inflate = LayoutInflater.from(context).inflate(R.layout.profile_header_chaining_icon, c73m.A02, false);
            }
            followChainingButton = (FollowChainingButton) inflate;
            followChainingButton.setCustomButtonStyle(new C154686xJ(AbstractC53242c7.A0H(context, R.attr.secondaryButtonSelector), AbstractC53242c7.A0H(context, R.attr.secondaryButtonSelector), AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text), AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text)));
        }
        followChainingButton.getClass();
        followChainingButton.setTag("chaining");
        followChainingButton.A01(enumC155676yw, true);
        if (enumC155676yw == EnumC155676yw.A03) {
            onClickListener = null;
        } else {
            onClickListener = new View.OnClickListener() { // from class: X.73c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C70O.this.BiC().D2g("button_tray");
                }
            };
        }
        C0fQ.A00(onClickListener, followChainingButton);
        if (C2TN.A04(userSession, user)) {
            followChainingButton.setContentDescription(context.getString(2131960982));
        }
        c70o.BxR().D2f();
        return followChainingButton;
    }

    public static void A05(View view, C73M c73m, int i) {
        ViewGroup.LayoutParams layoutParams;
        if (view.getLayoutParams() == null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            layoutParams2.setMarginEnd(dimensionPixelSize);
            layoutParams2.setMarginEnd(dimensionPixelSize);
            layoutParams = layoutParams2;
        } else {
            layoutParams = view.getLayoutParams();
        }
        Object obj = c73m.A08.get(Integer.valueOf(i));
        obj.getClass();
        layoutParams.width = ((Number) obj).intValue();
        view.setLayoutParams(layoutParams);
    }
}
