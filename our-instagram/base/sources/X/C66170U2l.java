package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.User;

/* renamed from: X.U2l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66170U2l {
    public static final String A01(Tx0 tx0, C66172U2n c66172U2n, User user) {
        String fullName;
        String ByJ;
        if (tx0.A0H && (ByJ = user.A03.ByJ()) != null && ByJ.length() != 0) {
            return null;
        }
        if (tx0.A0J) {
            return tx0.A09;
        }
        String B3r = user.A03.B3r();
        if (B3r != null && B3r.length() != 0) {
            fullName = user.A03.B3r();
        } else {
            fullName = user.getFullName();
        }
        if (c66172U2n.A07) {
            return fullName;
        }
        if (user.A03.BrH() != null) {
            return user.A03.BrH();
        }
        if (c66172U2n.A0A) {
            return fullName;
        }
        String BrE = user.A03.BrE();
        if (fullName != null) {
            int length = fullName.length();
            if (length != 0 && BrE != null && BrE.length() != 0) {
                return AnonymousClass001.A0g(fullName, " • ", BrE);
            }
            if (length != 0) {
                return fullName;
            }
        }
        if (BrE != null && BrE.length() != 0) {
            return BrE;
        }
        return null;
    }

    public static final ViewGroup A00(Context context, ViewGroup viewGroup, boolean z) {
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(LayoutInflater.from(context), viewGroup, R.layout.row_search_user, false);
        if (context != null) {
            C66171U2m c66171U2m = new C66171U2m(context, viewGroup2, z);
            c66171U2m.A0M.A00 = true;
            c66171U2m.A0L.A00 = true;
            c66171U2m.A0J.A00 = true;
            viewGroup2.setTag(c66171U2m);
            return viewGroup2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void A02(Context context, IgTextView igTextView, Tx0 tx0, boolean z) {
        int A03;
        Drawable drawable = context.getDrawable(R.drawable.blue_dot_medium_padded);
        Drawable drawable2 = null;
        if (z) {
            drawable2 = drawable;
            drawable = null;
        }
        igTextView.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, drawable, (Drawable) null);
        if (tx0.A0F) {
            A03 = 0;
        } else {
            A03 = AbstractC167017dG.A03(context);
        }
        int i = 0;
        if (z) {
            i = A03;
            A03 = 0;
        }
        igTextView.setPadding(i, 0, A03, 0);
        igTextView.setCompoundDrawablePadding(AbstractC167017dG.A04(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0530, code lost:
    
        if (r4 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0549, code lost:
    
        if (r5 != null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x060c, code lost:
    
        if (r0.A27() != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0673, code lost:
    
        if (X.C14360o3.A0K(r0.getId(), r55.userId) == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x069a, code lost:
    
        if (r5 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x03e2, code lost:
    
        if (r56.A0G != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0343, code lost:
    
        if (r22 == r21) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03d8, code lost:
    
        if (r5 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0406, code lost:
    
        if (r4 != null) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0679  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.app.Activity r52, android.content.Context r53, X.InterfaceC11380iw r54, com.instagram.common.session.UserSession r55, X.Tx0 r56, X.C65741TtG r57, X.C50622MWj r58, X.XLU r59, X.C66171U2m r60, X.C66172U2n r61, X.InterfaceC72020XFi r62) {
        /*
            Method dump skipped, instructions count: 2107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66170U2l.A03(android.app.Activity, android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.Tx0, X.TtG, X.MWj, X.XLU, X.U2m, X.U2n, X.XFi):void");
    }
}
