package com.instagram.reels.api;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC58323PtF;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C95124Py;

/* loaded from: classes10.dex */
public final class FetchXPSFBStoryCardViewersQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XcxpFetchStory extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class InlineXFBXPSStoryCardCXPWrapper extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class FbStory extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class Author extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class InlineXFBXPSUser extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class StorySettings extends C2JS implements C2JT {

                            /* loaded from: classes10.dex */
                            public final class InlineXFBXPSStorySettings extends C2JS implements C2JT {
                                @Override // X.C2JS
                                public final C4OU modelSelectionSet() {
                                    return AbstractC167017dG.A0Z(C95124Py.A00, "is_public");
                                }

                                public InlineXFBXPSStorySettings() {
                                    super(593418214);
                                }
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0Z(AbstractC58318PtA.A0M(InlineXFBXPSStorySettings.class, "InlineXFBXPSStorySettings", 593418214), "XFBXPSStorySettings");
                            }

                            public StorySettings() {
                                super(-1680007459);
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0b(StorySettings.class, "story_settings", -1680007459);
                        }

                        public InlineXFBXPSUser() {
                            super(-1947391127);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58323PtF.A0Z(AbstractC58318PtA.A0M(InlineXFBXPSUser.class, "InlineXFBXPSUser", -1947391127), "XFBXPSUser");
                    }

                    public Author() {
                        super(-2122200585);
                    }
                }

                public final FBStoryFeedbackFragmentImpl A0E() {
                    return (FBStoryFeedbackFragmentImpl) reinterpretRequired(3, FBStoryFeedbackFragmentImpl.class, -1063303607);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167007dF.A0Q(AbstractC58318PtA.A0O(Author.class, "author", -2122200585), AbstractC58320PtC.A0N(), AbstractC166987dD.A0i(C95124Py.A00, "is_archived_story"), AbstractC58318PtA.A0M(FBStoryFeedbackFragmentImpl.class, "FBStoryFeedbackFragment", -1063303607));
                }

                public FbStory() {
                    super(276374327);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(FbStory.class, "story_card", 276374327);
            }

            public InlineXFBXPSStoryCardCXPWrapper() {
                super(-1351886448);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58323PtF.A0Z(AbstractC58318PtA.A0M(InlineXFBXPSStoryCardCXPWrapper.class, "InlineXFBXPSStoryCardCXPWrapper", -1351886448), "XFBXPSStoryCardCXPWrapper");
        }

        public XcxpFetchStory() {
            super(-1568071472);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A02(), XcxpFetchStory.class, "xcxp_fetch_story(content_destinations:[\"FB\"],content_source:\"IG\",id:$id)", -1568071472);
    }

    public FetchXPSFBStoryCardViewersQueryResponseImpl() {
        super(-1453994290);
    }
}
