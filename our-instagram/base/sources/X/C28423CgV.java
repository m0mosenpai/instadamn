package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.regex.Pattern;

/* renamed from: X.CgV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28423CgV {
    public static final C28423CgV A00 = new Object();

    public static final void A01(Context context, SpannableStringBuilder spannableStringBuilder, C38321qM c38321qM, C77143d0 c77143d0, InterfaceC75453aC interfaceC75453aC, C75113Zb c75113Zb, User user, boolean z) {
        int A08;
        if (user != null && (A08 = AbstractC001900j.A08(spannableStringBuilder, user.getUsername(), 0, false)) != -1) {
            String username = user.getUsername();
            Pattern pattern = AbstractC13670mt.A00;
            int length = A08 + username.length();
            if (user.isVerified()) {
                C85963sQ.A03(context, spannableStringBuilder, length);
            }
            if (z) {
                spannableStringBuilder.setSpan(new C25722BYh(c38321qM, c77143d0, interfaceC75453aC, c75113Zb, user), A08, length, 33);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        if (r3 != 2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r8 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C26085BgE A02(android.content.Context r23, com.instagram.common.session.UserSession r24, X.C38321qM r25, X.InterfaceC75453aC r26, X.C75113Zb r27, boolean r28) {
        /*
            r22 = this;
            r1 = 0
            r12 = 1
            r3 = 3
            r5 = 4
            r7 = r24
            r6 = r25
            com.instagram.user.model.User r14 = r6.A2E(r7)
            if (r14 == 0) goto La9
            X.1rF r0 = r6.A0C
            java.util.List r8 = r0.Ab8()
            r2 = 35
            X.JEd r0 = new X.JEd
            r10 = r26
            r0.<init>(r10, r2)
            X.DI9 r4 = new X.DI9
            r9 = r27
            r11 = r28
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.DGp r19 = X.C29901DGp.A00(r10, r9, r7, r6, r3)
            r2 = r23
            X.DGp r18 = X.C29901DGp.A00(r2, r9, r7, r6, r5)
            X.Dfs r11 = new X.Dfs
            r13 = r8
            r15 = r6
            r16 = r7
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r16 = 8
            X.BgB r15 = new X.BgB
            r17 = r11
            r20 = r0
            r21 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21)
            boolean r0 = r6.A5u()
            if (r0 != 0) goto L99
            if (r8 == 0) goto L56
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L5e
        L56:
            boolean r0 = r6.A6c(r7)
            if (r0 == 0) goto L99
            if (r8 == 0) goto L96
        L5e:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L96
            com.instagram.user.model.User[] r0 = new com.instagram.user.model.User[]{r14}
            java.util.ArrayList r5 = X.AbstractC16960so.A1N(r0)
            r5.addAll(r8)
        L6f:
            X.41D r0 = X.C41D.A00
            boolean r0 = r0.A01(r7, r6)
            if (r0 == 0) goto L8f
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36601719888548174(0x8209120020114e, double:3.210413268589494E-306)
            long r3 = X.C18U.A01(r2, r7, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L8f
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L90
        L8f:
            r1 = 0
        L90:
            X.BgE r2 = new X.BgE
            r2.<init>(r15, r5, r12, r1)
            return r2
        L96:
            X.0sl r5 = X.C16930sl.A00
            goto L6f
        L99:
            boolean r0 = r6.A5u()
            if (r0 == 0) goto La7
            X.0sl r0 = X.C16930sl.A00
            X.BgE r2 = new X.BgE
            r2.<init>(r15, r0, r1, r1)
            return r2
        La7:
            r2 = 0
            return r2
        La9:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28423CgV.A02(android.content.Context, com.instagram.common.session.UserSession, X.1qM, X.3aC, X.3Zb, boolean):X.BgE");
    }

    public static final SpannableStringBuilder A00(Context context, C38321qM c38321qM, C77143d0 c77143d0, InterfaceC75453aC interfaceC75453aC, C76853cX c76853cX, User user, User user2) {
        String str;
        if (user2 != null) {
            str = user2.getUsername();
        } else {
            str = null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Resources resources = context.getResources();
        int i = 1;
        if (str != null) {
            i = 2;
        }
        String username = user.getUsername();
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) AbstractC07900bA.A02(resources, new String[]{username, str}, R.plurals.open_carousel_media_user_name_header_v2_with_contributor, i));
        C14360o3.A0A(append);
        C75113Zb c75113Zb = c76853cX.A0E;
        A01(context, append, c38321qM, c77143d0, interfaceC75453aC, c75113Zb, user, true);
        A01(context, append, c38321qM, c77143d0, interfaceC75453aC, c75113Zb, user2, true);
        return append;
    }
}
