package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ivv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42757Ivv implements AnonymousClass749 {
    public int A00;
    public String A01 = ProfileBannerType.A0C.A00;
    public String A02;
    public String A03;
    public String A04;
    public final Context A05;
    public final UserSession A06;
    public final C73F A07;
    public final User A08;

    @Override // X.AnonymousClass749
    public final void DLA() {
    }

    @Override // X.AnonymousClass749
    public final /* synthetic */ void Der() {
    }

    @Override // X.AnonymousClass749
    public final String AZw() {
        return this.A01;
    }

    @Override // X.AnonymousClass749
    public final long B37() {
        return 0L;
    }

    @Override // X.AnonymousClass749
    public final boolean BDo() {
        return false;
    }

    @Override // X.AnonymousClass749
    public final Drawable BEl() {
        return null;
    }

    @Override // X.AnonymousClass749
    public final int BEo() {
        return this.A00;
    }

    @Override // X.AnonymousClass749
    public final String BH9() {
        return "impression_related_accounts_banner";
    }

    @Override // X.AnonymousClass749
    public final boolean Bwm() {
        return false;
    }

    @Override // X.AnonymousClass749
    public final boolean CDe() {
        return false;
    }

    @Override // X.AnonymousClass749
    public final void D3R(boolean z) {
        this.A07.DeV(this.A08);
    }

    @Override // X.AnonymousClass749
    public final String getId() {
        return this.A02;
    }

    @Override // X.AnonymousClass749
    public final String getSubtitle() {
        return this.A03;
    }

    @Override // X.AnonymousClass749
    public final String getTitle() {
        return this.A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r0 != 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C42757Ivv(android.content.Context r6, com.instagram.common.session.UserSession r7, X.C73F r8, com.instagram.user.model.User r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.A05 = r6
            r5.A06 = r7
            r5.A08 = r9
            r5.A07 = r8
            java.lang.String r0 = r9.getId()
            r5.A02 = r0
            com.instagram.api.schemas.ProfileBannerType r0 = com.instagram.api.schemas.ProfileBannerType.A0C
            java.lang.String r0 = r0.A00
            r5.A01 = r0
            int r0 = r9.A03()
            r4 = 1
            if (r0 != r4) goto Lba
            com.instagram.api.schemas.UserBannerInlineOtherProfileDict r0 = r9.A0B()
            if (r0 == 0) goto Lba
            com.instagram.api.schemas.UserBannerInlineOtherProfileDict r0 = r9.A0B()
            if (r0 == 0) goto L39
            com.instagram.api.schemas.IgUserRelatedAccountTypeEnum r0 = r0.AY7()
            if (r0 == 0) goto L39
            int r0 = r0.ordinal()
            r1 = 2131238354(0x7f081dd2, float:1.8092984E38)
            if (r0 == r4) goto L3c
        L39:
            r1 = 2131237935(0x7f081c2f, float:1.8092135E38)
        L3c:
            r5.A00 = r1
            int r0 = r9.A03()
            if (r0 != r4) goto L9c
            com.instagram.api.schemas.UserBannerInlineOtherProfileDict r0 = r9.A0B()
            if (r0 == 0) goto L9c
            com.instagram.api.schemas.UserBannerInlineOtherProfileDict r0 = r9.A0B()
            if (r0 == 0) goto L56
            java.lang.String r1 = r0.AY6()
            if (r1 != 0) goto L58
        L56:
            java.lang.String r1 = ""
        L58:
            r5.A04 = r1
            int r0 = r9.A03()
            if (r0 != r4) goto L6a
            com.instagram.api.schemas.UserBannerInlineOtherProfileDict r0 = r9.A0B()
            if (r0 == 0) goto L6a
            r2 = 0
        L67:
            r5.A03 = r2
            return
        L6a:
            android.content.Context r0 = r5.A05
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131820797(0x7f1100fd, float:1.927432E38)
            int r1 = r9.A03()
            int r0 = r9.A03()
            java.lang.Object[] r0 = X.AbstractC25228BEl.A1Y(r0)
            java.lang.String r2 = r3.getQuantityString(r2, r1, r0)
            X.C14360o3.A07(r2)
            X.17P r0 = r9.A03
            com.instagram.api.schemas.UserRelatedAccountsInfoDict r0 = r0.BTO()
            if (r0 == 0) goto L67
            java.lang.String r1 = r0.AfS()
            if (r1 == 0) goto L67
            int r0 = r1.length()
            if (r0 == 0) goto L67
            r2 = r1
            goto L67
        L9c:
            com.instagram.common.session.UserSession r3 = r5.A06
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36885711715959459(0x830b5c001e02a3, double:3.3900108437876925E-306)
            java.lang.String r1 = X.C18U.A04(r2, r3, r0)
            int r0 = r1.length()
            if (r0 == 0) goto Lb7
            java.lang.String r0 = "None"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
        Lb7:
            java.lang.String r1 = "Other Profiles"
            goto L58
        Lba:
            r1 = 2131239024(0x7f082070, float:1.8094343E38)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42757Ivv.<init>(android.content.Context, com.instagram.common.session.UserSession, X.73F, com.instagram.user.model.User):void");
    }
}
