package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158727Ai {
    public static final C158727Ai A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    public static final C7QY A00(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        return new C1582378i(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3).A01(context, userSession, C7QK.A02(userSession, anonymousClass988, c160787Im, c7im, c160787Im.A0e.A10, null, null, AbstractC09440dt.A01(C7SV.A00), true), anonymousClass988, c160787Im);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r4.A0F != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (r4.A0D == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C129535tI A04(android.content.Context r25, com.instagram.common.session.UserSession r26, X.AnonymousClass988 r27, X.C160787Im r28, X.C7IM r29, X.C18A r30) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158727Ai.A04(android.content.Context, com.instagram.common.session.UserSession, X.988, X.7Im, X.7IM, X.18A):X.5tI");
    }

    public static final C129535tI A05(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c18a, 2);
        C14360o3.A0B(c160787Im, 3);
        C14360o3.A0B(c7im, 4);
        C14360o3.A0B(anonymousClass988, 5);
        C7QY A002 = A00(context, userSession, anonymousClass988, c160787Im, c7im);
        C14360o3.A0B(A002, 6);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        C158727Ai c158727Ai = A00;
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        return c158727Ai.A03(context, userSession, null, anonymousClass988, A002, A01(userSession, c160787Im), c160787Im, A09(c2ey, c83403nh.A1T, false));
    }

    public static final C129535tI A06(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a, Map map) {
        C27210BzT c27210BzT;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c18a, 2);
        C14360o3.A0B(c160787Im, 3);
        C14360o3.A0B(c7im, 4);
        C14360o3.A0B(anonymousClass988, 5);
        C14360o3.A0B(map, 6);
        C158727Ai c158727Ai = A00;
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        Object obj = c83403nh.A1T;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectPostLiveReply");
        E71 e71 = (E71) obj;
        C105824pt c105824pt = (C105824pt) e71.A01;
        if (c105824pt != null && !c105824pt.A09(userSession)) {
            String str = c105824pt.A0X;
            str.getClass();
            map.put(str, c105824pt);
            c27210BzT = new C27210BzT(str, e71.A00);
        } else {
            c27210BzT = null;
        }
        return c158727Ai.A03(context, userSession, null, anonymousClass988, A00(context, userSession, anonymousClass988, c160787Im, c7im), new C158817At(null, c27210BzT), c160787Im, false);
    }

    public final C129535tI A0A(Context context, C7QY c7qy, AbstractC158777Ao abstractC158777Ao, AbstractC158787Ap abstractC158787Ap) {
        return A07(context, null, c7qy, abstractC158777Ao, abstractC158787Ap, null, null, null, Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size)), "H,0.62857143:1", false, false);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.6ZI, java.lang.Object] */
    public static final C158817At A01(UserSession userSession, C160787Im c160787Im) {
        C1N9 c1n9;
        C27211BzU c27211BzU;
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        C2EY c2ey = c83403nh.A10;
        AbstractC158767Am abstractC158767Am = AbstractC158767Am.$redex_init_class;
        if (c2ey.ordinal() != 28) {
            return null;
        }
        Object obj = c83403nh.A1T;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectStoryShareMedia");
        C7QP c7qp = (C7QP) obj;
        C38321qM c38321qM = c7qp.A01;
        if (c38321qM != null) {
            User A2E = c38321qM.A2E(userSession);
            C38471qb c38471qb = c7qp.A00;
            if (c38471qb == null) {
                C14360o3.A0A(A2E);
                c1n9 = new C1N9(A2E);
            } else {
                ?? obj2 = new Object();
                obj2.A00 = c38471qb;
                c1n9 = obj2;
            }
            C1N9 c1n92 = c1n9;
            ReelType reelType = c7qp.A02;
            boolean z = true;
            if (!c7qp.A0A && !C14360o3.A0K(c7qp.A03, true)) {
                z = false;
            }
            if (c38321qM.A5V() && reelType != ReelType.A0P && !z) {
                c27211BzU = null;
            } else {
                String id = c38321qM.getId();
                if (id != null) {
                    String str = c7qp.A07;
                    if (str == null) {
                        C14360o3.A0A(A2E);
                        str = A2E.getId();
                    }
                    c27211BzU = new C27211BzU(c1n92, null, id, str);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return new C158817At(null, c27211BzU);
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC158787Ap A02(android.content.Context r5, X.C83403nh r6) {
        /*
            com.instagram.model.mediasize.ExtendedImageUrl r4 = r6.A16
            r1 = 0
            if (r4 == 0) goto L10
            java.lang.String r0 = r4.A0A
            if (r0 == 0) goto L10
            int r0 = r0.length()
            if (r0 == 0) goto L10
            r1 = 1
        L10:
            java.lang.String r3 = "Required value was null."
            r2 = 0
            if (r1 == 0) goto L26
            if (r4 == 0) goto Lbd
            java.lang.String r1 = r4.A0A
            if (r1 == 0) goto Lbd
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
            X.7B4 r2 = new X.7B4
            r2.<init>(r0)
        L25:
            return r2
        L26:
            X.4hT r0 = r6.A0Q()
            if (r0 == 0) goto L58
            X.1qM r0 = r0.A05
            if (r0 == 0) goto L58
            X.4hT r0 = r6.A0Q()
            if (r0 == 0) goto L25
            X.1qM r1 = r0.A05
            if (r1 == 0) goto L25
            boolean r0 = r1.Cff()
            if (r0 == 0) goto L4c
            com.instagram.common.typedurl.ImageUrl r0 = r1.A1S()
            if (r0 != 0) goto L52
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L4c:
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r1.A1q(r5)
            if (r0 == 0) goto L25
        L52:
            X.7B6 r2 = new X.7B6
            r2.<init>(r0)
            return r2
        L58:
            X.2EY r1 = r6.A10
            X.7Am r0 = X.AbstractC158767Am.$redex_init_class
            int r1 = r1.ordinal()
            r0 = 57
            if (r1 == r0) goto L82
            r0 = 22
            if (r1 == r0) goto L91
            r0 = 23
            if (r1 == r0) goto L82
            r0 = 46
            if (r1 == r0) goto L75
            r0 = 49
            if (r1 == r0) goto L82
            return r2
        L75:
            java.lang.Object r1 = r6.A1T
            boolean r0 = r1 instanceof X.C1575375n
            if (r0 == 0) goto L25
            X.75n r1 = (X.C1575375n) r1
            if (r1 == 0) goto L25
            java.lang.String r1 = r1.A03
            goto La2
        L82:
            X.2EY r0 = r6.A0z
            if (r0 == 0) goto L25
            int r1 = r0.ordinal()
            r0 = 9
            if (r1 != r0) goto L25
            java.lang.String r1 = r6.A1q
            goto La2
        L91:
            java.lang.Object r1 = r6.A1T
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia"
            X.C14360o3.A0C(r1, r0)
            X.7QR r1 = (X.C7QR) r1
            boolean r0 = X.LHA.A02(r1)
            if (r0 == 0) goto Lb2
            java.lang.String r1 = r1.A0A
        La2:
            if (r1 == 0) goto L25
            java.lang.String r0 = X.C168157fA.A02(r1)
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C168157fA.A00(r0, r1)
            X.7B5 r2 = new X.7B5
            r2.<init>(r0, r1)
            return r2
        Lb2:
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.L2m r0 = r1.A00
            if (r0 == 0) goto L25
            java.lang.String r1 = r0.A00
            goto La2
        Lbd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158727Ai.A02(android.content.Context, X.3nh):X.7Ap");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0059, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r33, 36322783236794933L) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
    
        if (r1 != 8) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C129535tI A03(android.content.Context r32, com.instagram.common.session.UserSession r33, X.C158797Aq r34, X.AnonymousClass988 r35, X.C7QY r36, X.AbstractC158777Ao r37, X.C160787Im r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158727Ai.A03(android.content.Context, com.instagram.common.session.UserSession, X.7Aq, X.988, X.7QY, X.7Ao, X.7Im, boolean):X.5tI");
    }

    public static final C129535tI A07(Context context, C158797Aq c158797Aq, C7QY c7qy, AbstractC158777Ao abstractC158777Ao, AbstractC158787Ap abstractC158787Ap, DirectThreadAnalyticsParams directThreadAnalyticsParams, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, C38321qM c38321qM, Integer num, String str, boolean z, boolean z2) {
        int dimensionPixelSize;
        String str2 = str;
        C14360o3.A0B(c7qy, 2);
        if (str == null) {
            str2 = "H,0.640625:1";
        }
        if (num != null) {
            dimensionPixelSize = num.intValue();
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.clips_editor_timeline_v3_single_segment_drawer_height);
        }
        return new C129535tI(c158797Aq, c7qy, abstractC158777Ao, abstractC158787Ap, directThreadAnalyticsParams, privacyMediaOverlayViewModel, c38321qM, str2, dimensionPixelSize, z, z2);
    }

    public static final PrivacyMediaOverlayViewModel A08(Context context, UserSession userSession, C83403nh c83403nh, AnonymousClass442 anonymousClass442) {
        Object obj;
        String str;
        C910143t c910143t;
        List list;
        Object obj2 = c83403nh.A1T;
        if ((obj2 instanceof List) && (list = (List) obj2) != null) {
            obj = AbstractC001800i.A0J(list);
        } else {
            obj = null;
        }
        if (!(obj instanceof C910143t) || (c910143t = (C910143t) obj) == null || (str = Long.valueOf(c910143t.A0K).toString()) == null) {
            if (anonymousClass442 != null) {
                str = anonymousClass442.A0S;
            } else {
                str = null;
            }
        }
        C1575675q c1575675q = new C1575675q(userSession, c83403nh, str);
        if (!c1575675q.A06()) {
            return null;
        }
        return c1575675q.A04(context, true);
    }

    public static final boolean A09(C2EY c2ey, Object obj, boolean z) {
        ReelType reelType;
        AbstractC158767Am abstractC158767Am = AbstractC158767Am.$redex_init_class;
        int ordinal = c2ey.ordinal();
        if (ordinal != 22) {
            if (ordinal != 23) {
                if (ordinal != 28) {
                    if (ordinal != 24) {
                        return false;
                    }
                } else {
                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectStoryShareMedia");
                    C7QP c7qp = (C7QP) obj;
                    if (c7qp.A0A) {
                        reelType = c7qp.A02;
                    } else {
                        return false;
                    }
                }
            }
            return z;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia");
        C7QR c7qr = (C7QR) obj;
        if (c7qr.A0F) {
            reelType = c7qr.A04;
            reelType.getClass();
        } else {
            return false;
        }
        if (reelType != ReelType.A0P) {
            return true;
        }
        return false;
    }
}
