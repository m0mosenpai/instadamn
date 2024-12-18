package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.memories.model.MemoryItem;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217639jw extends C202688xm {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C217639jw(android.content.Context r12, com.instagram.common.session.UserSession r13, com.instagram.reels.memories.model.MemoryItem r14, int r15) {
        /*
            r11 = this;
            r3 = r12
            java.lang.String r5 = A01(r12, r14)
            r4 = r13
            java.lang.String r6 = A00(r12, r13, r14)
            int r8 = X.AbstractC167017dG.A0G(r12)
            X.9sT r1 = r14.A00
            X.9sT r0 = X.EnumC222889sT.A05
            if (r1 != r0) goto L30
            int r9 = X.AbstractC167017dG.A05(r12)
        L18:
            int r10 = X.AbstractC167017dG.A0F(r12)
            r2 = r11
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            X.6RB r2 = r11.A01
            X.AbstractC167017dG.A1N(r12, r2)
            X.0qs r1 = X.AbstractC15960qq.A00(r12)
            X.0qp r0 = X.EnumC15950qp.A12
            X.AbstractC166987dD.A1U(r0, r1, r2)
            return
        L30:
            r9 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217639jw.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.reels.memories.model.MemoryItem, int):void");
    }

    public static String A00(Context context, UserSession userSession, MemoryItem memoryItem) {
        ArrayList A1E = AbstractC166987dD.A1E();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int ordinal = memoryItem.A00.ordinal();
        if (ordinal != 1 && ordinal != 0) {
            if (ordinal == 2) {
                User user = memoryItem.A01.A02;
                A1E.add(user);
                Resources resources = context.getResources();
                user.getClass();
                spannableStringBuilder.append((CharSequence) AbstractC166997dE.A0r(resources, user.getUsername(), 2131962939));
                C85383rT c85383rT = new C85383rT(spannableStringBuilder, userSession);
                c85383rT.A0L = true;
                c85383rT.A01 = -1;
                c85383rT.A03(null);
                c85383rT.A00();
            }
        } else {
            C38321qM c38321qM = memoryItem.A01.A01;
            c38321qM.getClass();
            User A2E = c38321qM.A2E(userSession);
            A2E.getClass();
            if (A2E.equals(AbstractC166987dD.A10(userSession))) {
                List A3l = c38321qM.A3l();
                if (A3l != null) {
                    A1E.addAll(A3l);
                }
            } else {
                A1E.add(c38321qM.A2E(userSession));
            }
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                spannableStringBuilder.setSpan(new C202858y3(context.getResources(), (User) it.next()), 0, 0, 18);
            }
        }
        return spannableStringBuilder.toString();
    }

    public static String A01(Context context, MemoryItem memoryItem) {
        int i = Calendar.getInstance().get(1);
        int ordinal = memoryItem.A00.ordinal();
        if (ordinal != 1 && ordinal != 0) {
            if (ordinal == 2) {
                i = memoryItem.A01.A00;
            }
        } else {
            Calendar calendar = Calendar.getInstance();
            C38321qM c38321qM = memoryItem.A01.A01;
            c38321qM.getClass();
            calendar.setTimeInMillis(c38321qM.A1B() * 1000);
            i = calendar.get(1);
        }
        return AbstractC167017dG.A0k(context.getResources(), Calendar.getInstance().get(1) - i, R.plurals.canvas_memories_sticker_title_text);
    }
}
