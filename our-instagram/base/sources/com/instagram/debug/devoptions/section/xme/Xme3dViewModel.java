package com.instagram.debug.devoptions.section.xme;

import X.AbstractC25227BEk;
import X.AbstractC40691uc;
import X.AbstractC52922bZ;
import X.AbstractC61132qb;
import X.AnonymousClass436;
import X.C05A;
import X.C0UO;
import X.C14360o3;
import X.C40701ud;
import X.C9GR;
import X.InterfaceC48192Ji;
import X.InterfaceC48212Jk;
import android.content.Context;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.xme.graphql.Sample3dPhotoQueryImpl;
import com.instagram.debug.devoptions.section.xme.graphql.Sample3dPhotoResponse;

/* loaded from: classes5.dex */
public final class Xme3dViewModel extends AbstractC52922bZ {
    public final C05A _sampleUrl;
    public final UserSession userSession;

    /* loaded from: classes5.dex */
    public final class Factory extends AbstractC61132qb {
        public final UserSession userSession;

        public Factory(UserSession userSession) {
            C14360o3.A0B(userSession, 1);
            this.userSession = userSession;
        }

        @Override // X.AbstractC61132qb
        public /* bridge */ /* synthetic */ AbstractC52922bZ create() {
            return new Xme3dViewModel(this.userSession);
        }

        @Override // X.AbstractC61132qb
        public Xme3dViewModel create() {
            return new Xme3dViewModel(this.userSession);
        }
    }

    public Xme3dViewModel(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.userSession = userSession;
        this._sampleUrl = AbstractC25227BEk.A0z();
    }

    public final void maybeFetchSampleFile(final Context context) {
        C14360o3.A0B(context, 0);
        if (this._sampleUrl.getValue() == null) {
            PandoGraphQLRequest A00 = new Sample3dPhotoQueryImpl.Builder().A00();
            C40701ud A01 = AbstractC40691uc.A01(this.userSession);
            C14360o3.A0A(A00);
            A01.ATV(new InterfaceC48212Jk() { // from class: com.instagram.debug.devoptions.section.xme.Xme3dViewModel$maybeFetchSampleFile$2
                @Override // X.InterfaceC48212Jk
                public final void invoke(Throwable th) {
                    C9GR.A00(context, th.getMessage(), "sample_3d_asset_url_fetch_fail", 0);
                }
            }, new InterfaceC48192Ji() { // from class: com.instagram.debug.devoptions.section.xme.Xme3dViewModel$maybeFetchSampleFile$1
                @Override // X.InterfaceC48192Ji
                public final void invoke(AnonymousClass436 anonymousClass436) {
                    String str;
                    Sample3dPhotoResponse sample3dPhotoResponse;
                    Sample3dPhotoResponse.Sample3dPhoto sample3dPhoto;
                    if (anonymousClass436 != null && (sample3dPhotoResponse = (Sample3dPhotoResponse) anonymousClass436.Bos()) != null && (sample3dPhoto = sample3dPhotoResponse.getSample3dPhoto()) != null) {
                        str = sample3dPhoto.getGlbUrl();
                    } else {
                        str = null;
                    }
                    Xme3dViewModel.this._sampleUrl.Egh(str);
                }
            }, A00);
        }
    }

    public final C0UO getSampleUrl() {
        return this._sampleUrl;
    }
}
