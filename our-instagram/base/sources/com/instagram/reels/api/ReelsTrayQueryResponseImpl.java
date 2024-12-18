package com.instagram.reels.api;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C173847oc;
import X.C2JS;
import X.C2JT;
import X.C4OK;
import X.C4OM;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C67A;
import X.C94754Oe;
import X.C94894Ou;
import X.C95124Py;

/* loaded from: classes10.dex */
public final class ReelsTrayQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtApiV1FeedReelsTray extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Broadcasts extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0a(BroadcastFragmentImpl.class, "BroadcastFragment", 1811615736);
            }

            public Broadcasts() {
                super(1803191269);
            }
        }

        /* loaded from: classes10.dex */
        public final class PersonalizationFeatures extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OW A0i = AbstractC166987dD.A0i(C173847oc.A00, "avg_core_sessions_per_day");
                C94894Ou c94894Ou = C94894Ou.A00;
                C4OW A0i2 = AbstractC166987dD.A0i(c94894Ou, "follow_count");
                C95124Py c95124Py = C95124Py.A00;
                return AbstractC58319PtB.A0U(A0i, A0i2, AbstractC166987dD.A0i(c95124Py, "is_high_usage_likelihood"), AbstractC166987dD.A0i(c95124Py, "is_teen"), AbstractC166987dD.A0i(c94894Ou, "stories_imp_bucket"));
            }

            public PersonalizationFeatures() {
                super(469207818);
            }
        }

        /* loaded from: classes10.dex */
        public final class StoryLikesConfig extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Y(C94894Ou.A00, AbstractC166987dD.A0i(C95124Py.A00, "is_enabled"), "ufi_type");
            }

            public StoryLikesConfig() {
                super(-539239447);
            }
        }

        /* loaded from: classes10.dex */
        public final class Tray extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0a(ReelDictFragmentImpl.class, "ReelDictFragment", 1884166355);
            }

            public Tray() {
                super(1044873890);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C4OK A0h = AbstractC166987dD.A0h(C4OO.A00(), Broadcasts.class, "broadcasts", 1803191269);
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW A0i = AbstractC166987dD.A0i(c94754Oe, "btp_timestamps");
            C4OW A0i2 = AbstractC166987dD.A0i(c94754Oe, "cursor");
            C94894Ou c94894Ou = C94894Ou.A00;
            C4OW A0i3 = AbstractC166987dD.A0i(c94894Ou, "face_filter_nux_version");
            C95124Py c95124Py = C95124Py.A00;
            return AbstractC166987dD.A0k(new C4OM[]{A0h, A0i, A0i2, A0i3, AbstractC166987dD.A0i(c95124Py, "has_new_nux_story"), AbstractC166987dD.A0i(c95124Py, "is_streaming_last_chunk"), AbstractC166987dD.A0i(c94894Ou, "lookahead_count_tray"), AbstractC166987dD.A0i(c94894Ou, "lookahead_count_viewer"), AbstractC166987dD.A0i(c94894Ou, "next_page_size"), AbstractC58318PtA.A0O(PersonalizationFeatures.class, "personalization_features", 469207818), AbstractC166987dD.A0i(c94894Ou, "refresh_window_ms"), AbstractC166987dD.A0i(C67A.A00, "response_timestamp"), AbstractC166987dD.A0i(c94894Ou, "sticker_version"), AbstractC166987dD.A0i(c95124Py, "stories_viewer_gestures_nux_eligible"), AbstractC58318PtA.A0O(StoryLikesConfig.class, "story_likes_config", -539239447), AbstractC166987dD.A0i(c94754Oe, AbstractC111324zv.A00(3169)), AbstractC166987dD.A0h(C4OO.A02(), Tray.class, "tray", 1044873890)});
        }

        public XdtApiV1FeedReelsTray() {
            super(1869972267);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtApiV1FeedReelsTray.class, "xdt_api__v1__feed__reels_tray(request_data:{\"page_size\":$page_size,\"reason\":$reason})", 1869972267);
    }

    public ReelsTrayQueryResponseImpl() {
        super(-1046115776);
    }
}
