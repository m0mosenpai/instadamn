package com.instagram.creator.inspiration.repository.graphql;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C14360o3;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94894Ou;
import X.MSV;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public final class GetCreatorInspirationHubQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtAsyncGetCreatorInspirationHub extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class SectionContent extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Data extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class AccountsSectionContentData extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class UserItems extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0a(UserInfoFragmentImpl.class, "UserInfoFragment", 1766112135);
                        }

                        public UserItems() {
                            super(-924154888);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A02(), UserItems.class, "user_items", -924154888);
                    }

                    public AccountsSectionContentData() {
                        super(-1283851880);
                    }
                }

                /* loaded from: classes10.dex */
                public final class AudiosSectionContentData extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class AudioItems extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0a(AudioFragmentImpl.class, "AudioFragment", -1423030943);
                        }

                        public AudioItems() {
                            super(-1820006451);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A02(), AudioItems.class, "audio_items", -1820006451);
                    }

                    public AudiosSectionContentData() {
                        super(-701503055);
                    }
                }

                /* loaded from: classes10.dex */
                public final class ClipsSectionContentData extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class ClipsItems extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class Media extends C2JS implements C2JT {
                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC167017dG.A0a(IGCreatorInspirationHubMediaFragmentImpl.class, "IGCreatorInspirationHubMediaFragment", -1290013599);
                            }

                            public Media() {
                                super(-251780288);
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A01(), Media.class, "media", -251780288);
                        }

                        public ClipsItems() {
                            super(1639908408);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A02(), ClipsItems.class, "clips_items", 1639908408);
                    }

                    public ClipsSectionContentData() {
                        super(-2052938767);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58320PtC.A0V(AbstractC58318PtA.A0O(ClipsSectionContentData.class, MSV.A00(1033), -2052938767), AbstractC58318PtA.A0O(AudiosSectionContentData.class, MSV.A00(969), -701503055), AccountsSectionContentData.class, MSV.A00(895), -1283851880);
                }

                public Data() {
                    super(27989596);
                }
            }

            /* loaded from: classes10.dex */
            public final class PagingInfo extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Y(AbstractC58319PtB.A0S(), AbstractC166987dD.A0i(C94754Oe.A00, "max_id"), "more_available");
                }

                public PagingInfo() {
                    super(1229464085);
                }
            }

            public final Data A0E() {
                C2JS A05 = A05(Data.class, "data", 27989596);
                C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data");
                return (Data) A05;
            }

            public final PagingInfo A0F() {
                C2JS requiredTreeField = getRequiredTreeField(1, "paging_info", PagingInfo.class, 1229464085);
                C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.PagingInfo");
                return (PagingInfo) requiredTreeField;
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0U(AbstractC58319PtB.A0S(), AbstractC166987dD.A0h(C4OO.A01(), Data.class, "data", 27989596), AbstractC166987dD.A0h(C4OO.A01(), PagingInfo.class, "paging_info", 1229464085), AbstractC166987dD.A0i(AbstractC58318PtA.A0Q(), "section_id"), MSV.A00(573));
            }

            public SectionContent() {
                super(744944815);
            }
        }

        /* loaded from: classes10.dex */
        public final class Sections extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94894Ou c94894Ou = C94894Ou.A00;
                C4OW A0i = AbstractC166987dD.A0i(c94894Ou, MSV.A00(1187));
                C4OW A0i2 = AbstractC166987dD.A0i(AbstractC166987dD.A0j(c94894Ou), AbstractC43591JPw.A00(80));
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC58319PtB.A0U(A0i, A0i2, AbstractC166987dD.A0i(AbstractC166987dD.A0j(c94754Oe), "section_id"), AbstractC166987dD.A0i(AbstractC166987dD.A0j(c94754Oe), "section_type"), AbstractC166987dD.A0i(AbstractC166987dD.A0j(c94754Oe), AbstractC111324zv.A00(1342)));
            }

            public Sections() {
                super(1404705625);
            }
        }

        public final ImmutableList A0E() {
            return getRequiredCompactedTreeListField(1, "section_content", SectionContent.class, 744944815);
        }

        public final ImmutableList A0F() {
            return getOptionalCompactedTreeListField(0, "sections", Sections.class, 1404705625);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58320PtC.A0T(C4OO.A02(), AbstractC166987dD.A0h(C4OO.A00(), Sections.class, "sections", 1404705625), SectionContent.class, "section_content", 744944815);
        }

        public XdtAsyncGetCreatorInspirationHub() {
            super(347885277);
        }
    }

    public final XdtAsyncGetCreatorInspirationHub A0E() {
        C2JS A05 = A05(XdtAsyncGetCreatorInspirationHub.class, "xdt_async_get_creator_inspiration_hub(data:$input)", 347885277);
        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub");
        return (XdtAsyncGetCreatorInspirationHub) A05;
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtAsyncGetCreatorInspirationHub.class, "xdt_async_get_creator_inspiration_hub(data:$input)", 347885277);
    }

    public GetCreatorInspirationHubQueryResponseImpl() {
        super(-1349916154);
    }
}
