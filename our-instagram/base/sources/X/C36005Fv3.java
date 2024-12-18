package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Fv3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36005Fv3 implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "SuggestedRecipientViewModel";
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final SpannableStringBuilder A05;
    public final SpannableStringBuilder A06;
    public final ImageUrl A07;
    public final C31243DoR A08;
    public final DirectShareTarget A09;
    public final UserStoryTarget A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final String A0H;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r5.A00, 36315520445779307L) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        if (X.C6X6.A0M(r22, X.C35143Fek.A00(r22, r23)) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C36005Fv3 A00(android.content.Context r21, com.instagram.common.session.UserSession r22, com.instagram.model.direct.DirectShareTarget r23, java.lang.String r24, int r25, int r26, int r27, int r28, boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36005Fv3.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.model.direct.DirectShareTarget, java.lang.String, int, int, int, int, boolean, boolean, boolean, boolean):X.Fv3");
    }

    public final boolean A02() {
        DirectShareTarget directShareTarget = this.A09;
        directShareTarget.getClass();
        if (!(AbstractC31171DnF.A0O(directShareTarget) instanceof InterfaceC2056098k) && TextUtils.isEmpty(this.A06)) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        if (this.A0D.size() > 1) {
            return true;
        }
        return false;
    }

    public C36005Fv3(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, ImageUrl imageUrl, C31243DoR c31243DoR, DirectShareTarget directShareTarget, UserStoryTarget userStoryTarget, String str, String str2, String str3, List list, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0D = list;
        this.A0C = str;
        this.A06 = spannableStringBuilder;
        this.A05 = spannableStringBuilder2;
        this.A01 = i;
        this.A00 = z;
        this.A09 = directShareTarget;
        this.A0A = userStoryTarget;
        this.A0F = z2;
        this.A08 = c31243DoR;
        this.A07 = imageUrl;
        this.A03 = i2;
        this.A04 = i3;
        this.A0H = str2;
        this.A0B = str3;
        this.A02 = i4;
        this.A0G = z3;
        this.A0E = z4;
    }

    public static C36005Fv3 A01(Context context, UserStoryTarget userStoryTarget, User user, String str, boolean z) {
        return new C36005Fv3(null, null, null, null, null, userStoryTarget, context.getResources().getString(2131960275), str, null, AbstractC31175DnJ.A0g(user), 1, -1, -1, -1, z, false, false, false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0H;
    }
}
