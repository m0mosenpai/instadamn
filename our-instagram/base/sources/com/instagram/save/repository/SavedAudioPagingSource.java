package com.instagram.save.repository;

import X.AbstractC167017dG;
import X.OQ0;
import androidx.paging.PagingSource;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class SavedAudioPagingSource extends PagingSource {
    public final UserSession A00;
    public final String A01;
    public final OQ0 A02;

    public SavedAudioPagingSource(UserSession userSession, OQ0 oq0, String str) {
        AbstractC167017dG.A1P(userSession, oq0);
        this.A00 = userSession;
        this.A02 = oq0;
        this.A01 = str;
    }
}
