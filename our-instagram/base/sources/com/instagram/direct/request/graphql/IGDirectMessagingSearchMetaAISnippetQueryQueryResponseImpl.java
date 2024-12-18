package com.instagram.direct.request.graphql;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58323PtF;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.MSV;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes10.dex */
public final class IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XfbMessagingSearchGenaiSnippet extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Edges extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Node extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class AgentResponse extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class PluginResponse extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class ProxyRefusal extends C2JS implements C2JT {
                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC167017dG.A0Z(C94754Oe.A00, "classification");
                            }

                            public ProxyRefusal() {
                                super(-673399849);
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0b(ProxyRefusal.class, "proxy_refusal", -673399849);
                        }

                        public PluginResponse() {
                            super(-1565198237);
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class Response extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Z(C94754Oe.A00, "content");
                        }

                        public Response() {
                            super(-359384102);
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class ResponseMetadata extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            C94754Oe c94754Oe = C94754Oe.A00;
                            return AbstractC167017dG.A0Y(c94754Oe, AbstractC166987dD.A0i(c94754Oe, TraceFieldType.RequestID), "response_id");
                        }

                        public ResponseMetadata() {
                            super(-820079222);
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class ViewModels extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class InlineXFBGenAISearchViewModel extends C2JS implements C2JT {

                            /* loaded from: classes11.dex */
                            public final class SearchData extends C2JS implements C2JT {
                                @Override // X.C2JS
                                public final C4OU modelSelectionSet() {
                                    C94754Oe c94754Oe = C94754Oe.A00;
                                    return AbstractC58319PtB.A0U(new C4OW(c94754Oe, MSV.A00(83)), new C4OW(c94754Oe, "search_query"), new C4OW(c94754Oe, "search_engine"), new C4OW(C94754Oe.A01(), AbstractC43591JPw.A00(95)), new C4OW(C94754Oe.A01(), AbstractC43591JPw.A00(94)));
                                }

                                public SearchData() {
                                    super(-1115050810);
                                }
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC167017dG.A0b(SearchData.class, "search_data", -1115050810);
                            }

                            public InlineXFBGenAISearchViewModel() {
                                super(-1611493295);
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0Y(AbstractC58320PtC.A0R(C94754Oe.A00), AbstractC58318PtA.A0M(InlineXFBGenAISearchViewModel.class, "InlineXFBGenAISearchViewModel", -1611493295), "XFBGenAISearchViewModel");
                        }

                        public ViewModels() {
                            super(1798107368);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167007dF.A0Q(AbstractC58318PtA.A0O(Response.class, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, -359384102), AbstractC58318PtA.A0O(PluginResponse.class, "plugin_response", -1565198237), AbstractC58318PtA.A0O(ResponseMetadata.class, "response_metadata", -820079222), AbstractC166987dD.A0h(C4OO.A02(), ViewModels.class, "view_models", 1798107368));
                    }

                    public AgentResponse() {
                        super(-1157881651);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58320PtC.A0V(AbstractC58319PtB.A0D(C94754Oe.A00), AbstractC166987dD.A0i(C94754Oe.A01(), "suggested_prompts"), AgentResponse.class, "agent_response", -1157881651);
                }

                public Node() {
                    super(-654084169);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0W(AbstractC166987dD.A0i(C94754Oe.A00, "cursor"), Node.class, "node", -654084169);
            }

            public Edges() {
                super(436543290);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0W(C4OO.A02(), Edges.class, "edges", 436543290);
        }

        public XfbMessagingSearchGenaiSnippet() {
            super(-555376563);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XfbMessagingSearchGenaiSnippet.class, "xfb_messaging_search_genai_snippet(entry_point:$entry_point,user_prompt:$user_prompt)", -555376563);
    }

    public IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl() {
        super(-523382187);
    }
}
