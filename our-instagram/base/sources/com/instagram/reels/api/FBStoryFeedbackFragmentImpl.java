package com.instagram.reels.api;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.C126885oS;
import X.C2JS;
import X.C2JT;
import X.C4OM;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94894Ou;
import X.C95124Py;
import com.facebook.react.modules.dialog.DialogModule;

/* loaded from: classes10.dex */
public final class FBStoryFeedbackFragmentImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class EdgeStoryMediaViewers extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Edges extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class EmojiReactions extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0Y(c94754Oe, AbstractC166987dD.A0i(c94754Oe, "reactor_id"), "reaction");
                }

                public EmojiReactions() {
                    super(-1242013829);
                }
            }

            /* loaded from: classes10.dex */
            public final class Node extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0a(FBStoryViewerFragmentImpl.class, "FBStoryViewerFragment", -47832053);
                }

                public Node() {
                    super(921598298);
                }
            }

            /* loaded from: classes10.dex */
            public final class Reply extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0Y(c94754Oe, AbstractC166987dD.A0i(c94754Oe, "replier_id"), DialogModule.KEY_MESSAGE);
                }

                public Reply() {
                    super(776447298);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0V(new C126885oS(AbstractC166987dD.A0h(C4OO.A02(), EmojiReactions.class, "emoji_reactions", -1242013829), "include_reactions"), new C126885oS(AbstractC58318PtA.A0O(Reply.class, "reply", 776447298), "include_replies"), Node.class, "node", 921598298);
            }

            public Edges() {
                super(-1542550260);
            }
        }

        /* loaded from: classes10.dex */
        public final class PageInfo extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                C4OW A0B = AbstractC58319PtB.A0B(c95124Py);
                C4OW A0i = AbstractC166987dD.A0i(c95124Py, "has_previous_page");
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC58320PtC.A0U(c94754Oe, A0B, A0i, AbstractC166987dD.A0i(c94754Oe, "start_cursor"), "end_cursor");
            }

            public PageInfo() {
                super(-867972959);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58319PtB.A0T(AbstractC166987dD.A0h(C4OO.A02(), Edges.class, "edges", -1542550260), AbstractC58318PtA.A0O(PageInfo.class, "page_info", -867972959), new C126885oS(AbstractC58322PtE.A0N(), "include_count"));
        }

        public EdgeStoryMediaViewers() {
            super(697836456);
        }
    }

    public final EdgeStoryMediaViewers A0E() {
        return (EdgeStoryMediaViewers) A03(EdgeStoryMediaViewers.class, "edge_story_media_viewers(after:$after,before:$before,first:$first,last:$last)", 697836456);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC166987dD.A0k(new C4OM[]{AbstractC58318PtA.A0O(EdgeStoryMediaViewers.class, "edge_story_media_viewers(after:$after,before:$before,first:$first,last:$last)", 697836456), new C126885oS(AbstractC166987dD.A0i(C94894Ou.A00, "nonfriend_viewers_count"), "include_count")});
    }

    public FBStoryFeedbackFragmentImpl() {
        super(-1063303607);
    }
}
