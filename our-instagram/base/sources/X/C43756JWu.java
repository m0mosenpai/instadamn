package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.JWu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43756JWu extends AbstractC37623GhI {
    public FrameLayout A00;
    public FrameLayout A01;
    public IgTextView A02;
    public LIi A03;
    public AbstractC43757JWv A04;
    public boolean A05;
    public List A06;
    public final Activity A07;
    public final ClipsReplyBarData A08;
    public final InterfaceC11380iw A09;
    public final UserSession A0A;

    public C43756JWu(Activity activity, ClipsReplyBarData clipsReplyBarData, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC25233BEq.A0w(2, userSession, interfaceC11380iw, activity);
        this.A08 = clipsReplyBarData;
        this.A0A = userSession;
        this.A09 = interfaceC11380iw;
        this.A07 = activity;
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        View A0U = AbstractC167017dG.A0U(view, R.id.clips_emoji_reaction_bar_stub);
        if (A0U != null) {
            this.A01 = (FrameLayout) A0U.requireViewById(R.id.emoji_reaction_container);
            this.A02 = AbstractC31172DnG.A0X(A0U, R.id.emoji_reaction_bar_title);
            this.A00 = (FrameLayout) A0U.requireViewById(R.id.emoji_reaction_bar);
        }
        ClipsReplyBarData clipsReplyBarData = this.A08;
        IgTextView igTextView = this.A02;
        if (clipsReplyBarData != null) {
            if (igTextView != null) {
                igTextView.setVisibility(0);
            }
            IgTextView igTextView2 = this.A02;
            if (igTextView2 != null) {
                Resources resources = this.A07.getResources();
                String str = clipsReplyBarData.A0C;
                if (str == null) {
                    str = clipsReplyBarData.A09;
                }
                igTextView2.setText(AbstractC166997dE.A0r(resources, str, 2131955769));
            }
        } else if (igTextView != null) {
            igTextView.setVisibility(8);
        }
        FrameLayout frameLayout = this.A01;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        FrameLayout frameLayout2 = this.A00;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
    }

    public static final void A00(C43756JWu c43756JWu) {
        C3o9 c3o9;
        int i;
        ClipsReplyBarData clipsReplyBarData = c43756JWu.A08;
        if (clipsReplyBarData != null) {
            c3o9 = AbstractC140946Yw.A06(clipsReplyBarData.A02.A01());
            if (c3o9 == null) {
                return;
            }
        } else {
            c3o9 = null;
        }
        C47467Kxw c47467Kxw = new C47467Kxw(c43756JWu);
        UserSession userSession = c43756JWu.A0A;
        FrameLayout frameLayout = c43756JWu.A01;
        if (frameLayout != null) {
            Context A0L = AbstractC166997dE.A0L(frameLayout);
            int i2 = 0;
            if (clipsReplyBarData != null) {
                i = clipsReplyBarData.A01;
                i2 = clipsReplyBarData.A00;
            } else {
                i = 0;
            }
            FrameLayout frameLayout2 = c43756JWu.A01;
            if (frameLayout2 != null) {
                IgTextView igTextView = c43756JWu.A02;
                if (igTextView != null) {
                    FrameLayout frameLayout3 = c43756JWu.A00;
                    if (frameLayout3 != null) {
                        c43756JWu.A03 = new LIi(A0L, frameLayout2, frameLayout3, c43756JWu.A09, userSession, igTextView, c3o9, c47467Kxw, c43756JWu.A06, i, i2);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final boolean A0B(List list, boolean z) {
        FrameLayout frameLayout;
        if (C7M3.A05(this.A0A)) {
            this.A06 = list;
        }
        boolean z2 = this.A05;
        if (z) {
            if (!z2) {
                return false;
            }
        } else if (!z2) {
            A00(this);
            LIi lIi = this.A03;
            if (lIi != null) {
                LKK lkk = lIi.A02;
                if (lkk != null) {
                    frameLayout = lkk.A0D;
                } else {
                    frameLayout = null;
                }
                FrameLayout frameLayout2 = lIi.A07;
                frameLayout2.addView(frameLayout);
                LIi.A00(frameLayout2, lIi, AbstractC167017dG.A04(lIi.A06));
                LIi.A01(lIi);
            }
            FrameLayout frameLayout3 = this.A01;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            IgTextView igTextView = this.A02;
            if (igTextView != null) {
                igTextView.setVisibility(0);
            }
            FrameLayout frameLayout4 = this.A00;
            if (frameLayout4 != null) {
                frameLayout4.setVisibility(0);
            }
            this.A05 = true;
            return true;
        }
        LIi lIi2 = this.A03;
        if (lIi2 != null) {
            AbstractC125325le A0A = AbstractC43592JPx.A0o(lIi2.A07, 0).A0A();
            A0A.A0U(1.0f, 0.0f, r5.getMeasuredWidth());
            A0A.A0V(1.0f, 0.0f, r5.getMeasuredHeight());
            A0A.A0M(1.0f, 0.0f);
            A0A.A06 = new C49608Lw1(lIi2, 3);
            C44065Jdq.A00(A0A, lIi2, 14);
        }
        this.A05 = false;
        return false;
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        super.onDestroyView();
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A06 = null;
    }
}
