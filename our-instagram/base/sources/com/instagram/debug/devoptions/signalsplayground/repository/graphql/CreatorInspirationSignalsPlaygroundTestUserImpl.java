package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AbstractC166997dE;
import X.AbstractC38851rI;
import X.AbstractC58320PtC;
import X.AbstractC70143W6w;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C2JS;
import X.C39891tD;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import android.os.Parcelable;
import com.facebook.pando.TreeJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundTestUserImpl extends C2JS implements CreatorInspirationSignalsPlaygroundTestUser {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = 1421285739;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTestUser
    public User asApiTypeModel(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        Parcelable.Creator creator = User.CREATOR;
        TreeJNI reinterpret = reinterpret(ImmutablePandoUserDict.class);
        C14360o3.A07(reinterpret);
        return AbstractC38851rI.A01(new C1DY(c1dv, 6, false), (ImmutablePandoUserDict) reinterpret);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTestUser
    public User asRestModel__DO_NOT_USE(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        Parcelable.Creator creator = User.CREATOR;
        TreeJNI reinterpret = reinterpret(ImmutablePandoUserDict.class);
        C14360o3.A07(reinterpret);
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) reinterpret;
        C1DY c1dy = new C1DY(c1dv, 6, false);
        C14360o3.A0B(immutablePandoUserDict, 0);
        return (User) c1dy.A00(new User(new C39891tD(immutablePandoUserDict).F7e(c1dy.A00)));
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTestUser
    public String getFullName() {
        return A09("full_name");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTestUser
    public String getId() {
        return A07("strong_id__");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTestUser
    public String getProfilePicUrl() {
        return A0A("profile_pic_url");
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return AbstractC58320PtC.A0U(c94754Oe, AbstractC166997dE.A0V(c94754Oe), new C4OW(c94754Oe, AbstractC70143W6w.A00()), new C4OW(c94754Oe, "full_name"), "profile_pic_url");
    }

    public CreatorInspirationSignalsPlaygroundTestUserImpl(int i) {
        super(i);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTestUser
    public String getUsername() {
        return A08(AbstractC70143W6w.A00());
    }

    public CreatorInspirationSignalsPlaygroundTestUserImpl() {
        super(TYPE_TAG);
    }
}
