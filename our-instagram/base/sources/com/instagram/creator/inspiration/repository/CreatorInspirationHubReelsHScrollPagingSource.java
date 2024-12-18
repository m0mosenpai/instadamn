package com.instagram.creator.inspiration.repository;

import X.C14360o3;
import X.C62832tM;
import androidx.paging.PagingSource;
import com.instagram.common.session.UserSession;
import com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl;
import java.util.Map;

/* loaded from: classes9.dex */
public final class CreatorInspirationHubReelsHScrollPagingSource extends PagingSource {
    public final UserSession A00;
    public final C62832tM A01;
    public final String A02;
    public final Map A03;
    public final String A04;
    public final Map A05;

    public CreatorInspirationHubReelsHScrollPagingSource(UserSession userSession, C62832tM c62832tM, String str, String str2, Map map, Map map2) {
        C14360o3.A0B(map, 4);
        this.A00 = userSession;
        this.A04 = str;
        this.A02 = str2;
        this.A03 = map;
        this.A05 = map2;
        this.A01 = c62832tM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.2tM] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.creator.inspiration.repository.CreatorInspirationHubReelsHScrollPagingSource r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.inspiration.repository.CreatorInspirationHubReelsHScrollPagingSource.A00(com.instagram.creator.inspiration.repository.CreatorInspirationHubReelsHScrollPagingSource, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final String A01(CreatorInspirationHubReelsHScrollPagingSource creatorInspirationHubReelsHScrollPagingSource, GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent sectionContent) {
        String A07;
        if (sectionContent != null) {
            GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.PagingInfo A0F = sectionContent.A0F();
            if (A0F != null && (A07 = A0F.A07("max_id")) != null) {
                creatorInspirationHubReelsHScrollPagingSource.A05.put(creatorInspirationHubReelsHScrollPagingSource.A02, A07);
            }
            GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.PagingInfo A0F2 = sectionContent.A0F();
            if (A0F2 != null && A0F2.getRequiredBooleanField(1, "more_available")) {
                return sectionContent.A0F().A07("max_id");
            }
            return null;
        }
        return null;
    }
}
