package com.instagram.reels.api;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58323PtF;
import X.C2JS;
import X.C2JT;
import X.C4OM;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C95124Py;

/* loaded from: classes10.dex */
public final class FBStoryViewerFragmentImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class ProfilePhoto extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class InlineXFBXPSProfilePhoto extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0Y(c94754Oe, AbstractC166997dE.A0V(c94754Oe), "url");
            }

            public InlineXFBXPSProfilePhoto() {
                super(-497406717);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58323PtF.A0Z(AbstractC58318PtA.A0M(InlineXFBXPSProfilePhoto.class, "InlineXFBXPSProfilePhoto", -497406717), "XFBXPSProfilePhoto");
        }

        public ProfilePhoto() {
            super(-519054585);
        }
    }

    public final ProfilePhoto A0E() {
        return (ProfilePhoto) getOptionalTreeField(3, "profile_photo(height:$profile_pic_height,width:$profile_pic_width)", ProfilePhoto.class, -519054585);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0V = AbstractC166997dE.A0V(c94754Oe);
        C4OW A0U = AbstractC58321PtD.A0U(c94754Oe);
        C95124Py c95124Py = C95124Py.A00;
        return AbstractC166987dD.A0k(new C4OM[]{A0V, A0U, AbstractC58319PtB.A0P(c95124Py), AbstractC58318PtA.A0O(ProfilePhoto.class, "profile_photo(height:$profile_pic_height,width:$profile_pic_width)", -519054585), AbstractC166987dD.A0i(c95124Py, "has_interop_enabled"), AbstractC166987dD.A0i(c95124Py, "is_blocked_by_viewer"), AbstractC166987dD.A0i(c95124Py, "is_friends_with_viewer"), AbstractC166987dD.A0i(c95124Py, "is_viewer_story_hidden_from_user")});
    }

    public FBStoryViewerFragmentImpl() {
        super(-47832053);
    }
}
