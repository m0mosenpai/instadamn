package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ScrollView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.EMd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32331EMd extends AbstractC59962oe implements InterfaceC189488aT, C51D, InterfaceC60152ox, InterfaceC37155GYs, C7OC {
    public static final String __redex_internal_original_name = "DirectReplyModalFragment";
    public C35209Fg1 A00;
    public C2EC A01;
    public C34567FLb A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public C3I9 A0A;
    public InterfaceC37193Ga4 A0B;
    public C7TM A0C;
    public C2DS A0D;
    public C38321qM A0E;
    public DirectPendingLayeredXma A0F;
    public DirectShareTarget A0G;
    public C38E A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public List A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final String A0U;
    public final GXT A0X = new G2L(this);
    public final GWY A0W = new G2I(this);
    public final InterfaceC09390do A0V = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.C7OC
    public final void DDL(Drawable drawable, View view, C148336m3 c148336m3) {
        String str;
        C14360o3.A0B(c148336m3, 0);
        C35209Fg1 c35209Fg1 = this.A00;
        if (c35209Fg1 == null) {
            str = "composerController";
        } else {
            String str2 = c148336m3.A02;
            C14360o3.A0B(str2, 0);
            ComposerAutoCompleteTextView composerAutoCompleteTextView = c35209Fg1.A00;
            if (composerAutoCompleteTextView == null) {
                str = "messageEditText";
            } else {
                composerAutoCompleteTextView.append(str2);
                InterfaceC37193Ga4 interfaceC37193Ga4 = this.A0B;
                if (interfaceC37193Ga4 == null) {
                    str = "replyController";
                } else {
                    interfaceC37193Ga4.DDM(c148336m3);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        String str;
        boolean A1N = AbstractC167007dF.A1N(i);
        View view = this.mView;
        if (A1N && this.A0T) {
            C35209Fg1 c35209Fg1 = this.A00;
            if (c35209Fg1 == null) {
                str = "composerController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            String A02 = c35209Fg1.A02();
            if (A02 == null || A02.length() == 0) {
                if (this.A04) {
                    A00(this);
                } else if (view != null) {
                    AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
                    A01.A0G();
                    AbstractC125325le A0B = A01.A0A().A0B(0.5f);
                    A0B.A0K(view.getHeight());
                    A0B.A0H();
                } else {
                    throw AbstractC166997dE.A0g();
                }
                this.A0T = false;
                return;
            }
        }
        this.A0T = !A1N;
        if (this.A04) {
            InterfaceC37193Ga4 interfaceC37193Ga4 = this.A0B;
            if (interfaceC37193Ga4 == null) {
                str = "replyController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            G2H g2h = (G2H) interfaceC37193Ga4;
            FragmentActivity requireActivity = requireActivity();
            if (i != 0) {
                requireActivity.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                ScrollView scrollView = g2h.A00;
                scrollView.getClass();
                float dimension = (r1.heightPixels - i) - scrollView.getResources().getDimension(R.dimen.direct_reply_modal_private_reply_non_comment_content_height);
                g2h.A01.getClass();
                if (r0.getMeasuredHeight() > dimension) {
                    ViewGroup.LayoutParams layoutParams = g2h.A00.getLayoutParams();
                    IgTextView igTextView = g2h.A02;
                    igTextView.getClass();
                    layoutParams.height = ((int) dimension) + igTextView.getMeasuredHeight();
                    g2h.A00.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
        this.A06 = false;
        if (this.A07) {
            this.A07 = false;
            A01(this);
            return;
        }
        if (this.A08) {
            this.A08 = false;
            A02(this);
            return;
        }
        if (!this.A0Q) {
            return;
        }
        C35209Fg1 c35209Fg1 = this.A00;
        if (c35209Fg1 == null) {
            C14360o3.A0F("composerController");
            throw C00O.createAndThrow();
        }
        String A02 = c35209Fg1.A02();
        if (A02 != null && A02.length() != 0) {
            return;
        }
        A00(this);
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
        this.A06 = true;
        this.A0Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    @Override // X.InterfaceC37155GYs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DkY(java.lang.String r20, boolean r21) {
        /*
            r19 = this;
            r4 = 0
            r15 = r20
            X.C14360o3.A0B(r15, r4)
            int r0 = r15.length()
            r8 = 1
            if (r0 == 0) goto Le3
            r1 = r19
            X.FLb r3 = r1.A02
            if (r3 == 0) goto L50
            java.util.regex.Pattern r0 = X.AbstractC13670mt.A01
            X.IwE r2 = r3.A02
            X.FQu r0 = r2.A04
            X.2pS r7 = r2.A03
            com.instagram.user.model.User r6 = r3.A01
            X.1qM r5 = r3.A00
            X.0wW r2 = r0.A00
            java.lang.String r0 = "reel_viewer_dashboard_send_reply"
            X.0Ai r3 = X.AbstractC166987dD.A0f(r2, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L50
            X.AbstractC31175DnJ.A14(r3, r7)
            java.lang.String r0 = r6.getId()
            X.AbstractC31178DnM.A18(r3, r0)
            int r0 = r6.BJ8()
            java.lang.Long r2 = X.AbstractC31171DnF.A0V(r0)
            java.lang.String r0 = "target_user_type"
            r3.A9K(r0, r2)
            java.lang.String r0 = r5.A38()
            if (r0 == 0) goto Lde
            X.AbstractC25236BEt.A0r(r3, r0)
            r3.Cht()
        L50:
            boolean r0 = r1.A05
            java.lang.String r2 = "replyController"
            java.lang.String r3 = "shareTarget"
            r10 = 0
            if (r0 == 0) goto L79
            java.lang.String r0 = r1.A0K
            if (r0 != 0) goto L63
            r0 = 885(0x375, float:1.24E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
        L63:
            X.1qM r11 = r1.A0E
            java.lang.String r14 = r1.A0J
            if (r11 == 0) goto Le3
            if (r14 == 0) goto Le3
            X.7TM r9 = r1.A0C
            if (r9 != 0) goto L95
            java.lang.String r3 = "sendShareManager"
        L71:
            X.C14360o3.A0F(r3)
        L74:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L79:
            X.Ga4 r11 = r1.A0B
            if (r11 == 0) goto Lda
            X.2DS r13 = r1.A0D
            if (r13 != 0) goto L84
            java.lang.String r3 = "threadStore"
            goto L71
        L84:
            X.2EC r12 = r1.A01
            if (r12 != 0) goto L8b
            java.lang.String r3 = "thread"
            goto L71
        L8b:
            com.instagram.model.direct.DirectShareTarget r14 = r1.A0G
            if (r14 == 0) goto L71
            r16 = r21
            r11.EOe(r12, r13, r14, r15, r16)
            goto La4
        L95:
            com.instagram.model.direct.DirectShareTarget r13 = r1.A0G
            if (r13 == 0) goto L71
            com.instagram.model.direct.DirectPendingLayeredXma r12 = r1.A0F
            r18 = r4
            r17 = r4
            r16 = r0
            r9.ENG(r10, r11, r12, r13, r14, r15, r16, r17, r18)
        La4:
            android.content.Context r0 = r1.requireContext()
            android.content.Context r11 = r0.getApplicationContext()
            X.Ga4 r0 = r1.A0B
            if (r0 == 0) goto Lda
            com.instagram.user.model.User r15 = r0.CE6()
            boolean r0 = r1.A04
            if (r0 != 0) goto Ld6
            boolean r0 = r1.A0R
            if (r0 == 0) goto Lbe
            java.lang.String r10 = "ig_shopping_pdp_share_sheet_confirmation_toast"
        Lbe:
            X.C14360o3.A0A(r11)
            X.FLb r2 = r1.A02
            X.0do r0 = r1.A0V
            com.instagram.common.session.UserSession r13 = X.AbstractC166987dD.A0r(r0)
            com.instagram.model.direct.DirectShareTarget r0 = r1.A0G
            if (r0 == 0) goto L71
            r12 = r1
            r14 = r0
            r16 = r2
            r17 = r10
            X.F2L.A00(r11, r12, r13, r14, r15, r16, r17)
        Ld6:
            A00(r1)
            return r8
        Lda:
            X.C14360o3.A0F(r2)
            goto L74
        Lde:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        Le3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32331EMd.DkY(java.lang.String, boolean):boolean");
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 13369 && i2 == -1) {
            InterfaceC09390do interfaceC09390do = this.A0V;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            InterfaceC37193Ga4 interfaceC37193Ga4 = this.A0B;
            String str = "replyController";
            String str2 = null;
            if (interfaceC37193Ga4 != null) {
                AbstractC34052F1f.A00(A0r, interfaceC37193Ga4.CE6().getId());
                A00(this);
                if (!this.A04) {
                    InterfaceC37193Ga4 interfaceC37193Ga42 = this.A0B;
                    if (interfaceC37193Ga42 != null) {
                        User CE6 = interfaceC37193Ga42.CE6();
                        Context requireContext = requireContext();
                        C34567FLb c34567FLb = this.A02;
                        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                        DirectShareTarget directShareTarget = this.A0G;
                        if (directShareTarget == null) {
                            str = "shareTarget";
                        } else {
                            if (this.A0R) {
                                str2 = "ig_shopping_pdp_share_sheet_confirmation_toast";
                            }
                            F2L.A00(requireContext, this, A0r2, directShareTarget, CE6, c34567FLb, str2);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC31178DnM.A0M(r9.A0V), 36315232682904691L) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        r7 = X.AbstractC166987dD.A0r(r9.A0V);
        X.C14360o3.A0B(r7, 2);
        r4 = X.AbstractC31173DnH.A0F(r10, com.facebook.R.id.comment_emoji_picker_v1_emoji_container);
        r8 = X.AbstractC166987dD.A1E();
        r3 = r4.getContext();
        r2 = X.AbstractC167017dG.A0C(r3);
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        r0 = X.AbstractC168777gB.A01(r3, r2, false);
        r4.addView(r0);
        r8.add(r0);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        if (r1 < 8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        r3 = X.C148336m3.A04.A05(r7, X.AbstractC25226BEj.A1I(X.AbstractC22793A3l.A00, r4));
        r2 = (android.view.View) r8.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        r1 = r2.getTag();
        X.C14360o3.A0C(r1, X.AbstractC43591JPw.A00(87));
        X.AbstractC168777gB.A02(r9, r7, r3, r9, (X.C168757g9) r1);
        r2.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c5, code lost:
    
        if (r4 < 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r9.A04 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        r1 = r9.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
    
        if (r1 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
    
        r2 = "replyController";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        X.C14360o3.A0F(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        r1 = (X.G2H) r1;
        X.C162337Ov.A0O(r1.A05, r1.A06, null, null, X.AbstractC111324zv.A00(4365), r1.A03.A0G, r1.A04.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
    
        if (r9.A05 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fc, code lost:
    
        r1 = r9.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fe, code lost:
    
        if (r1 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0100, code lost:
    
        r2 = "composerController";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
    
        r0 = r1.A00;
        r2 = "messageEditText";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0107, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0109, code lost:
    
        r0.requestFocus();
        r0 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010e, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0110, code lost:
    
        X.AbstractC13880nE.A0T(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0113, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        r2.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0069, code lost:
    
        if (r9.A05 != false) goto L18;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32331EMd.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final void A00(C32331EMd c32331EMd) {
        C3DN A01 = C3DN.A00.A01(c32331EMd.requireContext());
        if (A01 != null) {
            C35209Fg1 c35209Fg1 = c32331EMd.A00;
            if (c35209Fg1 == null) {
                C14360o3.A0F("composerController");
                throw C00O.createAndThrow();
            }
            c35209Fg1.A03();
            A01.A0B();
        }
    }

    @Override // X.InterfaceC37155GYs
    public final void D6m() {
        if (this.A04) {
            InterfaceC37193Ga4 interfaceC37193Ga4 = this.A0B;
            if (interfaceC37193Ga4 == null) {
                C14360o3.A0F("replyController");
                throw C00O.createAndThrow();
            }
            G2H g2h = (G2H) interfaceC37193Ga4;
            C162337Ov.A0S(g2h.A05, g2h.A06, "sheet_compose_message", g2h.A03.A0G, g2h.A04.getId(), null);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0V);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        C35209Fg1 c35209Fg1 = this.A00;
        if (c35209Fg1 == null) {
            C14360o3.A0F("composerController");
            throw C00O.createAndThrow();
        }
        c35209Fg1.A03();
    }

    public C32331EMd() {
        String str = this.A0K;
        this.A0U = str == null ? AbstractC111324zv.A00(884) : str;
    }

    public static final void A01(C32331EMd c32331EMd) {
        A00(c32331EMd);
        C36881nl A01 = C36881nl.A01(c32331EMd.requireActivity(), c32331EMd, AbstractC166987dD.A0r(c32331EMd.A0V), "ig_home_reply_to_author");
        List list = c32331EMd.A0N;
        if (list == null) {
            C14360o3.A0F("pendingRecipientAsList");
            throw C00O.createAndThrow();
        }
        A01.A0B(list);
        A01.A06();
    }

    public static final void A02(C32331EMd c32331EMd) {
        A00(c32331EMd);
        InterfaceC09390do interfaceC09390do = c32331EMd.A0V;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        InterfaceC37193Ga4 interfaceC37193Ga4 = c32331EMd.A0B;
        if (interfaceC37193Ga4 == null) {
            C14360o3.A0F("replyController");
            throw C00O.createAndThrow();
        }
        C31368DqX A01 = AbstractC31402Dr6.A01(A0r, interfaceC37193Ga4.CE6().getId(), "reel_emoji_reaction_user", c32331EMd.A0U);
        AbstractC25236BEt.A0h(AbstractC31364DqT.A00(A01, interfaceC09390do), c32331EMd, AbstractC166987dD.A0o(interfaceC09390do));
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0U;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00bb, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC166987dD.A0o(r3), 36324668726063452L) == false) goto L8;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32331EMd.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f6, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC31178DnM.A0M(r22.A0V), 36315232682904691L) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fc, code lost:
    
        X.AbstractC167007dF.A0M(r7, com.facebook.R.id.layout_direct_reply_composer_emoji_picker_stub).inflate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0106, code lost:
    
        if (r6 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010a, code lost:
    
        if (r22.A04 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010c, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010e, code lost:
    
        if (r8 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0110, code lost:
    
        r1 = requireContext().getDrawable(com.facebook.R.drawable.chevron_right);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011b, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011d, code lost:
    
        X.AbstractC166997dE.A1F(r1, X.AbstractC53242c7.A01(requireContext()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0128, code lost:
    
        r4.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, r1, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012b, code lost:
    
        r3 = requireContext();
        r2 = r22.A05;
        r0 = r22.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0133, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0135, code lost:
    
        r1 = r0.CE6().getUsername();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013d, code lost:
    
        if (r6 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013f, code lost:
    
        if (r5 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0141, code lost:
    
        r0 = X.AbstractC167007dF.A0f(r3, r1, 2131959950);
        X.C14360o3.A0A(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014b, code lost:
    
        r4.setText(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        if (r22.A04 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0152, code lost:
    
        X.C0fQ.A00(new X.ViewOnClickListenerC35590Fnh(r22, r6, r5, r8), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015a, code lost:
    
        r3 = r22.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015c, code lost:
    
        if (r3 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015e, code lost:
    
        r3.CNX(X.AbstractC167007dF.A0M(r7, com.facebook.R.id.context_image_container_stub), X.AbstractC167007dF.A0M(r7, com.facebook.R.id.reply_modal_detailed_context_stub), X.AbstractC167007dF.A0M(r7, com.facebook.R.id.reply_modal_more_context_stub));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0178, code lost:
    
        if (r22.A0B == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017a, code lost:
    
        r0 = r22.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x017c, code lost:
    
        if (r0 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017e, code lost:
    
        r14 = "composerController";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x019b, code lost:
    
        r0.A04(r7);
        X.C0f9.A09(-1363178985, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a4, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0197, code lost:
    
        r0 = 2131959948;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0187, code lost:
    
        r0 = X.AbstractC31177DnL.A0b(r3, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0182, code lost:
    
        if (r5 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0184, code lost:
    
        r0 = 2131959949;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018c, code lost:
    
        if (r8 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018e, code lost:
    
        r0 = 2131959946;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0191, code lost:
    
        if (r2 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0193, code lost:
    
        r0 = 2131959947;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fa, code lost:
    
        if (r22.A05 != false) goto L30;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32331EMd.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        String str;
        int A02 = C0f9.A02(57162886);
        super.onPause();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            window.setSoftInputMode(this.A09);
            this.A0Q = false;
            this.A0T = false;
            C35209Fg1 c35209Fg1 = this.A00;
            if (c35209Fg1 == null) {
                str = "composerController";
            } else {
                c35209Fg1.A03();
                C3I9 c3i9 = this.A0A;
                if (c3i9 == null) {
                    str = "keyboardHeightChangeDetector";
                } else {
                    c3i9.onStop();
                    C0f9.A09(-1049902223, A02);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1404999402, A02);
        throw A0g;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        IllegalStateException A14;
        int i;
        Window window;
        String str;
        int A02 = C0f9.A02(1022681397);
        super.onResume();
        C35209Fg1 c35209Fg1 = this.A00;
        Window window2 = null;
        if (c35209Fg1 == null) {
            str = "composerController";
        } else {
            ComposerAutoCompleteTextView composerAutoCompleteTextView = c35209Fg1.A00;
            if (composerAutoCompleteTextView != null) {
                composerAutoCompleteTextView.requestFocus();
                ComposerAutoCompleteTextView composerAutoCompleteTextView2 = c35209Fg1.A00;
                if (composerAutoCompleteTextView2 != null) {
                    AbstractC13880nE.A0S(composerAutoCompleteTextView2);
                    Activity rootActivity = getRootActivity();
                    if (rootActivity != null) {
                        window2 = rootActivity.getWindow();
                    }
                    if (window2 != null) {
                        this.A09 = window2.getAttributes().softInputMode;
                        Activity rootActivity2 = getRootActivity();
                        if (rootActivity2 != null && (window = rootActivity2.getWindow()) != null) {
                            window.setSoftInputMode(48);
                            C3I9 c3i9 = this.A0A;
                            if (c3i9 == null) {
                                str = "keyboardHeightChangeDetector";
                            } else {
                                c3i9.Dnr(requireActivity());
                                C0f9.A09(-429209213, A02);
                                return;
                            }
                        } else {
                            A14 = AbstractC166987dD.A14("Required value was null.");
                            i = -1001038493;
                        }
                    } else {
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i = -111695942;
                    }
                    C0f9.A09(i, A02);
                    throw A14;
                }
            }
            C14360o3.A0F("messageEditText");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
