package com.instagram.debug.devoptions.avatars;

import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC52922bZ;
import X.AbstractC61132qb;
import X.C05A;
import X.C0UO;
import X.C14360o3;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class ImmersiveAvatarViewerEffectConfigViewModel extends AbstractC52922bZ {
    public final C05A _effectConfig;
    public final ImmersiveAvatarConfigRepository repository;
    public final UserSession userSession;

    /* loaded from: classes8.dex */
    public final class EffectConfigViewState {
        public final String effectId;
        public final boolean isLoaded;

        public final String getEffectId() {
            return this.effectId;
        }

        public final boolean isLoaded() {
            return this.isLoaded;
        }

        public EffectConfigViewState(boolean z, String str) {
            this.isLoaded = z;
            this.effectId = str;
        }
    }

    /* loaded from: classes8.dex */
    public final class Factory extends AbstractC61132qb {
        public final UserSession userSession;

        public Factory(UserSession userSession) {
            C14360o3.A0B(userSession, 1);
            this.userSession = userSession;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.debug.devoptions.avatars.ImmersiveAvatarConfigRepository, java.lang.Object] */
        @Override // X.AbstractC61132qb
        public ImmersiveAvatarViewerEffectConfigViewModel create() {
            return new ImmersiveAvatarViewerEffectConfigViewModel(this.userSession, new Object());
        }
    }

    public final C0UO getEffectConfig() {
        return this._effectConfig;
    }

    public ImmersiveAvatarViewerEffectConfigViewModel(UserSession userSession, ImmersiveAvatarConfigRepository immersiveAvatarConfigRepository) {
        AbstractC167017dG.A1P(userSession, immersiveAvatarConfigRepository);
        this.userSession = userSession;
        this.repository = immersiveAvatarConfigRepository;
        this._effectConfig = AbstractC25225BEi.A1H(new EffectConfigViewState(false, ""));
        fetchImmersiveViewerConfig();
    }

    private final void fetchImmersiveViewerConfig() {
        AbstractC166987dD.A1Z(new ImmersiveAvatarViewerEffectConfigViewModel$fetchImmersiveViewerConfig$1(this, null), AbstractC141776au.A00(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ImmersiveAvatarViewerEffectConfigViewModel(UserSession userSession, ImmersiveAvatarConfigRepository immersiveAvatarConfigRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession, (i & 2) != 0 ? new Object() : immersiveAvatarConfigRepository);
    }
}
