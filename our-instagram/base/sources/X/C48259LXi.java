package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.facebook.R;
import com.instagram.aistudio.logging.AiStudioLoggingData;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.LXi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48259LXi implements InterfaceC11380iw, InterfaceC60072op {
    public static final String __redex_internal_original_name = "MessageActionsController";
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public FrameLayout A09;
    public FrameLayout A0A;
    public LinearLayout A0B;
    public PopupWindow A0C;
    public L6M A0D;
    public MRL A0E;
    public C47988LJq A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final int A0M;
    public final int A0N;
    public final Activity A0O;
    public final UserSession A0P;
    public final C47794L9b A0Q;
    public final C47372KwN A0R;
    public final MessageActionsViewModel A0S;
    public final InterfaceC83713oG A0T;
    public final C3o9 A0U;
    public final C3DN A0V;
    public final InterfaceC08830cm A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_message_actions_fragment";
    }

    public static int A00(Context context, C48259LXi c48259LXi) {
        MessageActionsViewModel messageActionsViewModel = c48259LXi.A0S;
        PointF pointF = messageActionsViewModel.A04;
        pointF.getClass();
        int A07 = ((int) pointF.y) - AbstractC43594JPz.A07(context);
        if (messageActionsViewModel.A0U) {
            Rect rect = messageActionsViewModel.A05;
            int A06 = AbstractC167017dG.A06(context);
            MRL mrl = c48259LXi.A0E;
            if (rect != null && mrl != null) {
                int i = rect.top - A06;
                int A00 = A07 - ((int) AbstractC13880nE.A00(context, (float) C18U.A01(C06090Tz.A05, c48259LXi.A0P, 36597948905753675L)));
                if (A00 > i) {
                    A07 = A00;
                }
                int i2 = (c48259LXi.A02 - A07) - A06;
                if (i2 < 0) {
                    A07 -= Math.abs(i2);
                }
            }
        }
        return Math.min((AbstractC13880nE.A0E(context).y - C30D.A00) - AbstractC167017dG.A06(context), A07) - c48259LXi.A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r3.A0E != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(android.content.res.Resources r6, X.C48259LXi r7) {
        /*
            com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel r3 = r7.A0S
            java.lang.String r0 = r3.A0E
            if (r0 == 0) goto L60
            android.graphics.Rect r0 = r3.A05
            if (r0 == 0) goto L5e
            int r6 = r0.left
        Lc:
            android.app.Activity r1 = r7.A0O
            r0 = 2131435249(0x7f0b1ef1, float:1.8492335E38)
            android.view.View r7 = r1.findViewById(r0)
            r0 = 2131435262(0x7f0b1efe, float:1.8492361E38)
            android.view.View r2 = r1.findViewById(r0)
            androidx.slidingpanelayout.widget.SlidingPaneLayout r2 = (androidx.slidingpanelayout.widget.SlidingPaneLayout) r2
            boolean r0 = r3.A0Y
            if (r0 == 0) goto L27
            java.lang.String r1 = r3.A0E
            r0 = 1
            if (r1 == 0) goto L28
        L27:
            r0 = 0
        L28:
            boolean r0 = X.AbstractC31174DnI.A1b(r0)
            if (r0 != 0) goto L5d
            if (r2 == 0) goto L5d
            if (r7 == 0) goto L5d
            boolean r0 = r2.A08
            if (r0 != 0) goto L5d
            android.graphics.RectF r0 = X.AbstractC13880nE.A01
            r1 = 0
            r0 = 2
            int[] r5 = new int[r0]
            r7.getLocationInWindow(r5)
            r2 = r5[r1]
            float r4 = (float) r2
            r1 = 1
            r0 = r5[r1]
            float r3 = (float) r0
            int r0 = r7.getMeasuredWidth()
            int r2 = r2 + r0
            float r2 = (float) r2
            r1 = r5[r1]
            int r0 = r7.getMeasuredHeight()
            int r1 = r1 + r0
            float r1 = (float) r1
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r4, r3, r2, r1)
            float r0 = r0.right
            int r0 = (int) r0
            int r6 = r6 + r0
        L5d:
            return r6
        L5e:
            r6 = 0
            goto Lc
        L60:
            boolean r0 = r3.A0V
            if (r0 == 0) goto L6c
            r1 = 2131165339(0x7f07009b, float:1.7944892E38)
        L67:
            int r6 = r6.getDimensionPixelSize(r1)
            goto Lc
        L6c:
            boolean r0 = r3.A0Y
            boolean r0 = X.AbstractC167007dF.A1M(r0)
            boolean r0 = X.AbstractC31174DnI.A1b(r0)
            r1 = 2131165236(0x7f070034, float:1.7944683E38)
            if (r0 == 0) goto L67
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48259LXi.A01(android.content.res.Resources, X.LXi):int");
    }

    public static void A02(LongPressActionData longPressActionData, C48259LXi c48259LXi, String str) {
        String str2;
        C81663kb A0c;
        C83403nh BSh;
        C7BW c7bw;
        C3o9 c3o9 = c48259LXi.A0U;
        DirectThreadKey A02 = JRE.A02(c3o9);
        if (A02 != null && (BSh = C2JD.A00(c48259LXi.A0P).BSh(A02, c48259LXi.A0S.A08.A01)) != null && (c7bw = BSh.A0Q) != null) {
            str2 = AbstractC46830KnP.A00(c7bw.A06);
        } else {
            str2 = null;
        }
        C47794L9b c47794L9b = c48259LXi.A0Q;
        MessageActionsViewModel messageActionsViewModel = c48259LXi.A0S;
        String A00 = LC1.A00(longPressActionData.A03);
        AiStudioLoggingData aiStudioLoggingData = messageActionsViewModel.A06;
        UserSession userSession = c48259LXi.A0P;
        C14360o3.A0B(userSession, 1);
        EnumC72433Xdd enumC72433Xdd = null;
        if (A02 != null && (A0c = AbstractC43594JPz.A0c(userSession, A02)) != null) {
            enumC72433Xdd = AbstractC34774FTx.A00(A0c);
        }
        c47794L9b.A00(enumC72433Xdd, aiStudioLoggingData, messageActionsViewModel, c3o9, A00, str, str2);
    }

    public static void A03(final C48259LXi c48259LXi) {
        c48259LXi.A0B.getClass();
        c48259LXi.A0G = true;
        AbstractC125325le A0F = AbstractC43592JPx.A0n(c48259LXi.A0B).A0F(true);
        float f = c48259LXi.A00;
        A0F.A0T(f, AbstractC43594JPz.A06(c48259LXi.A0O) + f + C30D.A00);
        C44065Jdq.A00(A0F, c48259LXi, 13);
        PopupWindow popupWindow = c48259LXi.A0C;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        C47988LJq c47988LJq = c48259LXi.A0F;
        if (c47988LJq != null) {
            c47988LJq.A03();
        }
        MRL mrl = c48259LXi.A0E;
        if (mrl != null) {
            mrl.DAl();
        }
        final View view = c48259LXi.A08;
        if (c48259LXi.A0H && view != null) {
            AbstractC43594JPz.A0G(view).withEndAction(new Runnable() { // from class: X.M4B
                @Override // java.lang.Runnable
                public final void run() {
                    C48259LXi c48259LXi2 = c48259LXi;
                    view.setVisibility(8);
                    c48259LXi2.A0H = false;
                }
            });
        }
    }

    public final void A04() {
        FrameLayout frameLayout = this.A0A;
        if (frameLayout != null) {
            Activity activity = this.A0O;
            int min = Math.min(activity.getResources().getDimensionPixelSize(R.dimen.emoji_reaction_creation_tray_max_width), AbstractC13890nF.A01(activity) - (AbstractC167017dG.A06(activity) * 2));
            int i = 1;
            if (this.A0S.A0W) {
                min = activity.getResources().getDimensionPixelSize(R.dimen.audio_translations_language_list_cell_row_height);
                i = 8388611;
            }
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(min, -2, i));
        }
    }

    public C48259LXi(Activity activity, UserSession userSession, C47372KwN c47372KwN, MRL mrl, MessageActionsViewModel messageActionsViewModel, InterfaceC83713oG interfaceC83713oG, C3o9 c3o9, C3DN c3dn, InterfaceC08830cm interfaceC08830cm, float f, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        this.A0O = activity;
        this.A0P = userSession;
        this.A0R = c47372KwN;
        this.A0E = mrl;
        this.A0W = interfaceC08830cm;
        this.A00 = f;
        this.A0N = i;
        this.A0S = messageActionsViewModel;
        this.A05 = i2;
        this.A0U = c3o9;
        this.A0X = z;
        this.A0a = z2;
        this.A0Y = z3;
        this.A0b = z4;
        this.A0T = interfaceC83713oG;
        this.A0M = i3;
        this.A0V = c3dn;
        this.A0Q = new C47794L9b(userSession);
        if (Build.VERSION.SDK_INT >= 30) {
            this.A00 = 0.0f;
            z5 = true;
        } else {
            z5 = false;
        }
        this.A0Z = z5;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A03(this);
        return true;
    }
}
