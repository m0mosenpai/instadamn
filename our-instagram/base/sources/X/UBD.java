package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.R;
import com.instagram.api.schemas.SuggestedUsersStyle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes11.dex */
public final class UBD extends BaseAdapter {
    public C69229Vjx A00;
    public C47K A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final InterfaceC63682up A07;
    public final Runnable A08;
    public final C25671My A09;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    public static final void A00(SuggestedUsersStyle suggestedUsersStyle, AbstractC68982VfK abstractC68982VfK, int i, int i2) {
        View view = abstractC68982VfK.A00;
        SuggestedUsersStyle suggestedUsersStyle2 = SuggestedUsersStyle.A07;
        int i3 = R.drawable.ui_drop_shadow_rounded_corner;
        if (suggestedUsersStyle == suggestedUsersStyle2) {
            i3 = R.drawable.suggested_user_card_drop_shadow;
        }
        Drawable drawable = view.getContext().getDrawable(i3);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(view);
        int i4 = rect.left;
        ((ViewGroup.LayoutParams) A0G).width = i + i4 + rect.right;
        int i5 = rect.top;
        ((ViewGroup.LayoutParams) A0G).height = i2 + i5 + rect.bottom;
        A0G.topMargin = (int) ((r0 - i5) / 2.0f);
        A0G.setMarginStart(Math.round((r2 - i4) / 2.0f));
        view.setLayoutParams(A0G);
        view.setBackground(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
    public static final void A01(UBD ubd, int i) {
        C3A9 c3a9;
        List list;
        C47K c47k = ubd.A01;
        if (c47k != null && ((list = c47k.A0P) != null || (list = c47k.A0M) != null)) {
            list.remove(i);
        }
        C69229Vjx c69229Vjx = ubd.A00;
        if (c69229Vjx != null && (c3a9 = c69229Vjx.A03) != null) {
            c3a9.A01();
        }
        if (ubd.getCount() == 0) {
            ubd.A09.E4s(new Object());
        } else {
            C0fA.A00(ubd, 388110832);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C47K c47k = this.A01;
        if (c47k != null) {
            List list = c47k.A0P;
            if (list != null || (list = c47k.A0M) != null) {
                return list.size();
            }
            return 0;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2;
        List list;
        C47K c47k = this.A01;
        if (c47k != null) {
            if (c47k.A0P != null) {
                return c47k.A02(i);
            }
            List list2 = c47k.A0M;
            if (list2 != null) {
                i2 = list2.size();
            } else {
                i2 = -1;
            }
            if (i >= i2 || i < 0 || (list = c47k.A0M) == null) {
                return null;
            }
            return list.get(i);
        }
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        C47K c47k = this.A01;
        if (c47k != null && c47k.A0P != null) {
            Object item = getItem(i);
            C14360o3.A0C(item, "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedItem");
            C47R c47r = ((C47L) item).A07;
            if (c47r != null) {
                int ordinal = c47r.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1 || ordinal == 2 || ordinal == 4 || ordinal == 5) {
                        return 2;
                    }
                } else {
                    return 1;
                }
            }
            C0w9.A03("SuggestedUsersViewPagerAdapter", AbstractC167017dG.A0n(c47r, "Unhandled item view type: ", new StringBuilder()));
            return -1;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x026c, code lost:
    
        if (r1 == null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UBD.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public UBD(Context context, UserSession userSession, InterfaceC63682up interfaceC63682up, Runnable runnable, int i, int i2) {
        this.A04 = context;
        this.A06 = userSession;
        this.A07 = interfaceC63682up;
        this.A03 = i;
        this.A02 = i2;
        this.A08 = runnable;
        this.A09 = AbstractC25651Mw.A00(userSession);
        this.A05 = interfaceC63682up.Abd();
    }
}
