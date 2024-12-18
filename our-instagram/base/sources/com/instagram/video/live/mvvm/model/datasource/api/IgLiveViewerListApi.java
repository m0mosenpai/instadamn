package com.instagram.video.live.mvvm.model.datasource.api;

import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.C14360o3;
import X.C168027ex;
import X.C168037ey;
import X.C25621Ms;
import X.InterfaceC19390xP;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class IgLiveViewerListApi {
    public final UserSession A00;

    public IgLiveViewerListApi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final InterfaceC19390xP A00(String str) {
        C14360o3.A0B(str, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A00);
        A0M.A0L("live/%s/get_viewer_list/", str);
        return AbstractC31172DnG.A0R(null, A0M, C168027ex.class, C168037ey.class, true).A03(479941114);
    }
}
