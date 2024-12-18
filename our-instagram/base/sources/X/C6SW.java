package X;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationSet;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6SW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SW {
    public static XjS A00;
    public static final C6SW A01 = new Object();
    public static final int[] A03 = {R.color.netego_background_gradient_start, R.color.netego_su_background_gradient_start_1, R.color.netego_su_background_gradient_start_2, R.color.netego_su_background_gradient_end_6, R.color.netego_su_background_gradient_start_4, R.color.netego_su_background_gradient_start_1, R.color.netego_su_background_gradient_start_4};
    public static final int[] A02 = {R.color.netego_background_gradient_end, R.color.cyan_5, R.color.netego_su_background_gradient_end_2, R.color.cyan_5, R.color.netego_su_background_gradient_end_4, R.color.netego_su_background_gradient_end_4, R.color.netego_su_background_gradient_end_6};

    public static final int A00(C141596ac c141596ac, String str, int i) {
        if (c141596ac != null && c141596ac.A11) {
            Number number = (Number) c141596ac.A1C.get(str);
            if (number != null) {
                return number.intValue();
            }
            return -1;
        }
        return i;
    }

    public static final void A02(C141596ac c141596ac, C6SY c6sy, User user) {
        int A0H;
        C14360o3.A0B(c6sy, 0);
        FollowButton followButton = c6sy.A0E;
        followButton.setCustomForegroundColor(-1);
        ((FollowButtonBase) followButton).A09 = false;
        if (c141596ac.A13) {
            followButton.setPrismStyle(EnumC110544yR.A05);
            FollowStatus B7L = user.B7L();
            FollowStatus followStatus = FollowStatus.A06;
            Context context = followButton.getContext();
            C14360o3.A07(context);
            if (B7L == followStatus) {
                A0H = C1QI.A06(context, C1QI.A0E());
            } else {
                A0H = C1QI.A08(context, C1QI.A0E());
            }
        } else if (user.B7L() == FollowStatus.A06) {
            Context context2 = followButton.getContext();
            C14360o3.A07(context2);
            A0H = C1QI.A03(context2);
        } else {
            A0H = AbstractC53242c7.A0H(followButton.getContext(), R.attr.igds_color_secondary_text);
        }
        followButton.setCustomForegroundColor(A0H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0301, code lost:
    
        if (r14 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r6.isEmpty() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f9, code lost:
    
        if (r4 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(final android.view.animation.Animation r56, final X.InterfaceC11380iw r57, final com.instagram.common.session.UserSession r58, final X.C41181vS r59, final X.C41551w4 r60, final X.InterfaceC139206Sb r61, final X.C141596ac r62, final X.InterfaceC144936gD r63, final X.C6SY r64, X.C6SE r65, final int r66, boolean r67) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6SW.A01(android.view.animation.Animation, X.0iw, com.instagram.common.session.UserSession, X.1vS, X.1w4, X.6Sb, X.6ac, X.6gD, X.6SY, X.6SE, int, boolean):void");
    }

    public final void A04(C41551w4 c41551w4, C6SE c6se, boolean z) {
        InterfaceC144936gD interfaceC144936gD;
        int length;
        C41181vS c41181vS = c6se.A08;
        if (c41181vS != null) {
            C104294ms c104294ms = c41181vS.A09;
            if (c104294ms != null) {
                List A012 = c104294ms.A01();
                int size = A012.size();
                C6SY[] A04 = c6se.A04();
                C141596ac c141596ac = c6se.A09;
                if (c141596ac != null) {
                    if (!c141596ac.A11 && size < (length = A04.length)) {
                        throw new IllegalArgumentException(AnonymousClass001.A0n("There are ", " SU cardViewHolders but only ", " SuggestedUserItems.", length, size));
                    }
                    UserSession userSession = c6se.A06;
                    if (userSession != null) {
                        InterfaceC11380iw interfaceC11380iw = c6se.A05;
                        if (interfaceC11380iw != null) {
                            if (z) {
                                String moduleName = interfaceC11380iw.getModuleName();
                                boolean z2 = c141596ac.A11;
                                C14360o3.A0B(moduleName, 1);
                                AbstractC139216Sc.A01(new C19270xB(moduleName), userSession, c104294ms, z2);
                                if (!z2) {
                                    AbstractC139216Sc.A02 = System.currentTimeMillis();
                                }
                                if (c41551w4 != null && c41551w4.A0H.A0P == ReelType.A0I && (interfaceC144936gD = c6se.A0A) != null) {
                                    interfaceC144936gD.Clq(c41551w4, "tap", "ess_su_card_shuffle", c141596ac.A0B, c141596ac.A0A, c6se.A00);
                                }
                            }
                            int i = c141596ac.A0M;
                            int size2 = A012.size();
                            int length2 = A04.length;
                            int min = Math.min(size2, length2);
                            AbstractC139216Sc.A01 = i;
                            AbstractC139216Sc.A00 = min;
                            for (int i2 = 0; i2 < length2; i2++) {
                                C6SY c6sy = A04[i2];
                                if (A012.size() <= i2) {
                                    c6sy.A05.setVisibility(4);
                                } else {
                                    int i3 = (i2 + i) % size;
                                    InterfaceC139206Sb interfaceC139206Sb = (InterfaceC139206Sb) A012.get(i3);
                                    InterfaceC144936gD interfaceC144936gD2 = c6se.A0A;
                                    AnimationSet animationSet = c6se.A02;
                                    if (animationSet != null) {
                                        A01(animationSet, interfaceC11380iw, userSession, c41181vS, c41551w4, interfaceC139206Sb, c141596ac, interfaceC144936gD2, c6sy, c6se, i3, c104294ms.A00.A0G);
                                        if (i2 == 0 && A00 != null) {
                                            String id = ((C139196Sa) interfaceC139206Sb).A02.getId();
                                            C144576fd.A06 = i3;
                                            C144576fd.A05 = id;
                                        }
                                        if (z) {
                                            if (c141596ac.A11) {
                                                AbstractC139216Sc.A04(((C139196Sa) interfaceC139206Sb).A02.getId());
                                            }
                                            View view = c6sy.A05;
                                            view.clearAnimation();
                                            AbstractC125325le A002 = AbstractC125325le.A00(view);
                                            A002.A0G();
                                            AbstractC125325le A0E = A002.A0E(C55942hf.A03(5.0d, 5.0d));
                                            A0E.A0U(0.95f, 1.0f, -1.0f);
                                            A0E.A0V(0.95f, 1.0f, -1.0f);
                                            A0E.A0H();
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("This is only null when the item is not a netego SU unit");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A03(Context context, C41551w4 c41551w4, int i) {
        int A022 = AbstractC84863qa.A02(context);
        C14360o3.A0B(context, 0);
        if ((A022 - (C143726eF.A03(context) + context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material))) - (C143726eF.A04(context, c41551w4) * 2) < AbstractC13880nE.A04(context, i)) {
            return false;
        }
        return true;
    }
}
