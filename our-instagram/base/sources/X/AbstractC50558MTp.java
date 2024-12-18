package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.modal.ModalActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.MTp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50558MTp {
    public static final C54662OCo A00(Context context, UserSession userSession, Reel reel, List list) {
        C38091pt c38091pt = reel.A0L;
        if (c38091pt != null) {
            String str = c38091pt.A02;
            if (str != null && AbstractC001800i.A0u(list, str) && reel.A0O(userSession).size() > 1) {
                List<C41181vS> A0O = reel.A0O(userSession);
                C14360o3.A07(A0O);
                for (C41181vS c41181vS : A0O) {
                    if (c41181vS.A0e == EnumC41231vY.A09 && !list.contains(c41181vS.A0j)) {
                        C38321qM c38321qM = c41181vS.A0b;
                        if (c38321qM != null) {
                            String id = c38321qM.getId();
                            ExtendedImageUrl A1q = c38321qM.A1q(context);
                            if (A1q != null) {
                                return new C54662OCo(MX2.A01(new Rect(0, 0, A1q.getWidth(), A1q.getHeight())), A1q, id, null);
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                return null;
            }
            return null;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final EnumC53243Ngg A01(C3G2 c3g2) {
        int A05 = AbstractC25227BEk.A05(c3g2, 0);
        if (A05 != 11) {
            if (A05 != 5) {
                if (A05 != 0) {
                    return EnumC53243Ngg.A0B;
                }
                return EnumC53243Ngg.A0D;
            }
            return EnumC53243Ngg.A0E;
        }
        return EnumC53243Ngg.A0A;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.common.typedurl.ImageUrl A02(android.content.Context r8, com.instagram.common.session.UserSession r9, java.lang.String r10, boolean r11) {
        /*
            r0 = 3
            r6 = r9
            X.C14360o3.A0B(r9, r0)
            r5 = 0
            if (r11 != 0) goto L11
            java.io.File r0 = X.AbstractC166987dD.A11(r10)
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.AbstractC81033jX.A01(r0)
            return r0
        L11:
            java.io.File r3 = X.AbstractC166987dD.A11(r10)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323393120775367(0x810bef00002cc7, double:3.034398299918034E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 == 0) goto L52
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165325(0x7f07008d, float:1.7944864E38)
            int r8 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            if (r0 == 0) goto L52
            java.lang.String r7 = r3.getPath()
            r10 = 0
            r9 = r8
            android.graphics.Bitmap r1 = X.AbstractC209669Pc.A00(r6, r7, r8, r9, r10)
        L3e:
            if (r1 == 0) goto L90
            java.lang.String r4 = X.C50472Tr.A01()
            java.lang.String r2 = "direct_temp_cover_frame"
            java.lang.String r0 = ".jpg"
            java.lang.String r0 = X.AbstractC917048o.A04(r2, r0)
            java.io.File r3 = new java.io.File
            r3.<init>(r4, r0)
            goto L5d
        L52:
            java.lang.String r2 = r3.getPath()
            r0 = 0
            android.graphics.Bitmap r1 = X.AbstractC209669Pc.A01(r2, r0)
            goto L3e
        L5d:
            java.io.FileOutputStream r0 = X.MSW.A0x(r3)     // Catch: java.io.FileNotFoundException -> L7c java.lang.Throwable -> L88 java.io.IOException -> L8d
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.io.FileNotFoundException -> L7c java.lang.Throwable -> L88 java.io.IOException -> L8d
            r2.<init>(r0)     // Catch: java.io.FileNotFoundException -> L7c java.lang.Throwable -> L88 java.io.IOException -> L8d
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.io.FileNotFoundException -> L7c java.lang.Throwable -> L88 java.io.IOException -> L8d
            boolean r0 = X.AbstractC50673MYr.A00(r0, r1, r2)     // Catch: java.io.FileNotFoundException -> L7c java.lang.Throwable -> L88 java.io.IOException -> L8d
            if (r0 != 0) goto L6f
            r3 = r5
        L6f:
            r2.close()     // Catch: java.io.FileNotFoundException -> L7c java.lang.Throwable -> L88 java.io.IOException -> L8d
            r1.recycle()
            if (r3 == 0) goto L90
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.AbstractC81033jX.A01(r3)
            return r0
        L7c:
            r3 = move-exception
            java.lang.String r2 = "MediaCaptureUtil"
            java.lang.String r0 = "could not find file"
            X.C0w9.A06(r2, r0, r3)     // Catch: java.lang.Throwable -> L88
            r1.recycle()
            goto L90
        L88:
            r0 = move-exception
            r1.recycle()
            throw r0
        L8d:
            r1.recycle()
        L90:
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r6)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bhu()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50558MTp.A02(android.content.Context, com.instagram.common.session.UserSession, java.lang.String, boolean):com.instagram.common.typedurl.ImageUrl");
    }

    public static final void A05(Activity activity, EnumC53169NfQ enumC53169NfQ, UserSession userSession, long j) {
        AbstractC25228BEl.A1G(activity, AbstractC61636Rr0.A00(AbstractC167007dF.A1b("reel_id", null, AbstractC166987dD.A1L("archive_stories_tab", enumC53169NfQ), AbstractC166987dD.A1L("reel_item_taken_at_ms", Long.valueOf(j)))), userSession, ModalActivity.class, AbstractC111324zv.A00(97));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A08(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, int i) {
        C2d5 c2d5;
        C3O0 By1;
        boolean A1b = AbstractC25233BEq.A1b(userSession, fragmentActivity, c38321qM);
        if ((fragmentActivity instanceof C2d5) && (c2d5 = (C2d5) fragmentActivity) != null && (By1 = c2d5.By1()) != null) {
            C146106i8 A0K = AbstractC31171DnF.A0K();
            ImageUrl A1S = c38321qM.A1S();
            if (A1S != null) {
                A0K.A09 = A1S;
                A0K.A03();
                AbstractC31172DnG.A1H(fragmentActivity.getResources(), A0K, 2131953188);
                A0K.A0I = fragmentActivity.getResources().getString(2131953187);
                A0K.A0L = A1b;
                A0K.A0G = AbstractC166997dE.A0q(fragmentActivity.getResources(), 2131976827);
                A0K.A06();
                A0K.A0R = A1b;
                A0K.A02 = i;
                A0K.A0A(new P3I(0, fragmentActivity, userSession));
                By1.A0A(A0K.A00());
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A09(FragmentActivity fragmentActivity, UserSession userSession, Reel reel) {
        C2d5 c2d5;
        C3O0 By1;
        C14360o3.A0B(userSession, 0);
        if ((fragmentActivity instanceof C2d5) && (c2d5 = (C2d5) fragmentActivity) != null && (By1 = c2d5.By1()) != null) {
            C146106i8 A0K = AbstractC31171DnF.A0K();
            SimpleImageUrl A08 = reel.A08();
            if (A08 != null) {
                A0K.A09 = A08;
                A0K.A03();
                AbstractC31172DnG.A1H(fragmentActivity.getResources(), A0K, 2131953188);
                A0K.A0I = fragmentActivity.getResources().getString(2131963566);
                A0K.A0L = true;
                A0K.A0G = AbstractC166997dE.A0q(fragmentActivity.getResources(), 2131976827);
                A0K.A06();
                A0K.A0R = true;
                A0K.A0A(new P3I(1, fragmentActivity, userSession));
                By1.A0A(A0K.A00());
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final List A04(C54662OCo c54662OCo) {
        Rect rect = c54662OCo.A00;
        ImageUrl imageUrl = c54662OCo.A02;
        RectF A07 = MX2.A07(rect, imageUrl.getWidth(), imageUrl.getHeight());
        return AbstractC16960so.A1Q(Float.valueOf(A07.left), Float.valueOf(A07.top), Float.valueOf(A07.right), Float.valueOf(A07.bottom));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A07(FragmentActivity fragmentActivity) {
        C2d5 c2d5;
        C3O0 By1;
        if ((fragmentActivity instanceof C2d5) && (c2d5 = (C2d5) fragmentActivity) != null && (By1 = c2d5.By1()) != null) {
            C146106i8 A0j = AbstractC25229BEm.A0j();
            AbstractC31172DnG.A1H(fragmentActivity.getResources(), A0j, 2131963586);
            A0j.A06();
            A0j.A0R = true;
            By1.A0A(A0j.A00());
        }
    }

    public static final String A03(Context context, long j) {
        return C23831Eq.A0D(AbstractC166997dE.A0M(context), EnumC89613z1.A04, C05F.A00, j, AbstractC31177DnL.A06(), true, true, false, false, false);
    }

    public static final void A06(Activity activity, EnumC53243Ngg enumC53243Ngg, UserSession userSession, boolean z) {
        boolean A1a = AbstractC167017dG.A1a(activity, userSession);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("archive_multi_select_mode", A1a);
        A0b.putBoolean("is_standalone_reel_archive", A1a);
        A0b.putBoolean("hide_privacy_footer", A1a);
        A0b.putSerializable("highlight_management_source", enumC53243Ngg);
        A0b.putBoolean("suggested_highlights_enabled", z);
        AbstractC31171DnF.A0L(activity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(730)).A0A(activity, 501);
    }
}
