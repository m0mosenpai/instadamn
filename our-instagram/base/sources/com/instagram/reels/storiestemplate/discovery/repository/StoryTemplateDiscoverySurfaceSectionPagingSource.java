package com.instagram.reels.storiestemplate.discovery.repository;

import X.C14360o3;
import X.O8X;
import androidx.paging.PagingSource;

/* loaded from: classes9.dex */
public final class StoryTemplateDiscoverySurfaceSectionPagingSource extends PagingSource {
    public final O8X A00;

    public StoryTemplateDiscoverySurfaceSectionPagingSource(O8X o8x) {
        C14360o3.A0B(o8x, 1);
        this.A00 = o8x;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionPagingSource r15, X.InterfaceC23621Ds r16) {
        /*
            r4 = 19
            r5 = r16
            boolean r0 = X.PXD.A03(r5, r4)
            if (r0 == 0) goto La8
            r3 = r5
            X.PXD r3 = (X.PXD) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La8
            int r2 = r2 - r1
            r3.A00 = r2
        L18:
            java.lang.Object r4 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L4d
            if (r1 != r0) goto Ld0
            X.AbstractC09560e7.A00(r4)
        L26:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto Lbe
            X.2JS r3 = X.AbstractC25232BEp.A18(r4)
            if (r3 == 0) goto Lae
            java.lang.Class<X.Qw6> r2 = X.C60232Qw6.class
            java.lang.String r1 = "xdt_trending_template_sections(fetch_reel_templates:$fetch_reel_templates)"
            r0 = 1891574422(0x70bf2296, float:4.732276E29)
            X.2JS r3 = r3.A05(r2, r1, r0)
            java.lang.Class<X.Qw5> r2 = X.C60231Qw5.class
            java.lang.String r1 = "section_infos"
            r0 = -1940154261(0xffffffff8c5b986b, float:-1.6917013E-31)
            com.google.common.collect.ImmutableList r0 = r3.A06(r2, r1, r0)
            X.3NX r2 = X.AbstractC25225BEi.A0z(r0)
            return r2
        L4d:
            X.AbstractC09560e7.A00(r4)
            X.O8X r4 = r15.A00
            r3.A00 = r0
            r12 = 0
            X.2JM r8 = X.AbstractC25225BEi.A0b()
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            com.instagram.common.session.UserSession r6 = r4.A00
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36329848456626732(0x8111ce0000422c, double:3.038480680303988E-306)
            java.lang.Boolean r1 = X.AbstractC166997dE.A0c(r5, r6, r0)
            java.lang.String r0 = "fetch_reel_templates"
            r8.A02(r0, r1)
            boolean r0 = X.AbstractC167007dF.A1W(r1)
            X.1uJ r6 = X.AbstractC25227BEk.A0U(r0)
            java.util.Map r8 = r8.getParamsCopy()
            java.util.Map r9 = r7.getParamsCopy()
            java.lang.Class<X.Qw7> r10 = X.C60233Qw7.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "StoryTemplateDiscoverySurfaceSectionQuery"
            r11 = 0
            java.lang.String r15 = "xdt_trending_template_sections"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 600000(0x927c0, double:2.964394E-318)
            X.1Dk r5 = r5.setFreshCacheAgeMs(r0)
            r0 = 900000(0xdbba0, double:4.44659E-318)
            X.1Dk r1 = r5.setMaxToleratedCacheAgeMs(r0)
            X.1ud r0 = r4.A01
            java.lang.Object r4 = r0.A04(r1, r3)
            if (r4 != r2) goto L26
            return r2
        La8:
            X.PXD r3 = X.PXD.A00(r15, r5, r4)
            goto L18
        Lae:
            java.lang.String r0 = "Empty response received from server"
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A14(r0)
            X.5Ie r0 = new X.5Ie
            r0.<init>(r1)
            X.8jk r2 = X.AbstractC43592JPx.A0p(r0)
            return r2
        Lbe:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto Lcb
            X.8jk r4 = (X.C194848jk) r4
            java.lang.Object r0 = r4.A00
            X.8jk r2 = X.AbstractC43592JPx.A0p(r0)
            return r2
        Lcb:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld0:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionPagingSource.A00(com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionPagingSource, X.1Ds):java.lang.Object");
    }
}
