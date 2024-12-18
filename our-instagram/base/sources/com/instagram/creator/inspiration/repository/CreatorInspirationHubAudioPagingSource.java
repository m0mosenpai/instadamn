package com.instagram.creator.inspiration.repository;

import X.AbstractC40691uc;
import X.C14360o3;
import X.CTm;
import androidx.paging.PagingSource;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class CreatorInspirationHubAudioPagingSource extends PagingSource {
    public final UserSession A00;
    public final CTm A01;

    public /* synthetic */ CreatorInspirationHubAudioPagingSource(UserSession userSession) {
        CTm cTm = new CTm(userSession, AbstractC40691uc.A01(userSession));
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = cTm;
    }
}
