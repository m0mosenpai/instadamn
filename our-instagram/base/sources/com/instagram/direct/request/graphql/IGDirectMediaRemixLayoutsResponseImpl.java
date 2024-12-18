package com.instagram.direct.request.graphql;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C173847oc;
import X.C2JS;
import X.C2JT;
import X.C4OK;
import X.C4OM;
import X.C4OO;
import X.C4OU;
import X.C94754Oe;
import X.C94894Ou;
import X.EnumC46246KdN;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* loaded from: classes10.dex */
public final class IGDirectMediaRemixLayoutsResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class IgdMagicRemixLayout extends C2JS implements C2JT {

        /* loaded from: classes4.dex */
        public final class Response extends C2JS implements C2JT {

            /* loaded from: classes4.dex */
            public final class BackgroundImages extends C2JS implements C2JT {

                /* loaded from: classes4.dex */
                public final class PositionData extends C2JS implements C2JT {
                    public PositionData() {
                        super(-1996884977);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167027dH.A0F();
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Y(C94754Oe.A00, new C4OK(PositionData.class, "position_data", -1996884977), "sticker_bundle_id");
                }

                public BackgroundImages() {
                    super(-617995249);
                }
            }

            /* loaded from: classes4.dex */
            public final class ForegroundImages extends C2JS implements C2JT {

                /* loaded from: classes4.dex */
                public final class PositionData extends C2JS implements C2JT {
                    public PositionData() {
                        super(-531718080);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167027dH.A0F();
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0X(C94754Oe.A01(), new C4OK(PositionData.class, "position_data", -531718080), AbstractC166987dD.A0i(C94754Oe.A00, "sticker_bundle_id"), "decorations");
                }

                public ForegroundImages() {
                    super(-1318871329);
                }
            }

            /* loaded from: classes4.dex */
            public final class Stickers extends C2JS implements C2JT {

                /* loaded from: classes4.dex */
                public final class StickerBundleIds extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return AbstractC167017dG.A0X(c94754Oe, AbstractC166987dD.A0i(c94754Oe, "sticker_name"), AbstractC166987dD.A0i(c94754Oe, "sticker_bundle_id"), "sticker_url");
                    }

                    public StickerBundleIds() {
                        super(-1750171034);
                    }
                }

                /* loaded from: classes4.dex */
                public final class PositionData extends C2JS implements C2JT {
                    public PositionData() {
                        super(1524157116);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167027dH.A0F();
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC166987dD.A0k(new C4OM[]{new C4OK(PositionData.class, "position_data", 1524157116), AbstractC166987dD.A0i(C94754Oe.A00, "sticker_type"), AbstractC166987dD.A0h(C4OO.A02(), StickerBundleIds.class, "sticker_bundle_ids", -1750171034)});
                }

                public Stickers() {
                    super(-777291604);
                }
            }

            /* loaded from: classes4.dex */
            public final class Text extends C2JS implements C2JT {

                /* loaded from: classes4.dex */
                public final class PositionData extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C173847oc c173847oc = C173847oc.A00;
                        return AbstractC166987dD.A0k(new C4OM[]{AbstractC166987dD.A0i(c173847oc, "x"), AbstractC166987dD.A0i(c173847oc, "y"), AbstractC166987dD.A0i(C94894Ou.A00, "z"), AbstractC166987dD.A0i(c173847oc, "rotation"), AbstractC166987dD.A0i(c173847oc, IgReactMediaPickerNativeModule.HEIGHT), AbstractC166987dD.A0i(c173847oc, IgReactMediaPickerNativeModule.WIDTH)});
                    }

                    public PositionData() {
                        super(-359087256);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC166987dD.A0k(new C4OM[]{AbstractC166987dD.A0i(C94754Oe.A00, "font"), AbstractC166987dD.A0i(C94894Ou.A00, "font_size"), new C4OK(PositionData.class, "position_data", -359087256)});
                }

                public Text() {
                    super(-809030976);
                }
            }

            public final ImmutableList A0E() {
                return getRequiredCompactedTreeListField(1, "background_images", BackgroundImages.class, -617995249);
            }

            public final ImmutableList A0F() {
                return getRequiredCompactedTreeListField(2, "foreground_images", ForegroundImages.class, -1318871329);
            }

            public final EnumC46246KdN A0G() {
                return (EnumC46246KdN) getOptionalEnumField(0, "layout_type", EnumC46246KdN.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC166987dD.A0k(new C4OM[]{AbstractC166987dD.A0i(C94754Oe.A00, "layout_type"), AbstractC166987dD.A0h(C4OO.A02(), BackgroundImages.class, "background_images", -617995249), AbstractC166987dD.A0h(C4OO.A02(), ForegroundImages.class, "foreground_images", -1318871329), AbstractC166987dD.A0h(C4OO.A02(), Stickers.class, "stickers", -777291604), AbstractC166987dD.A0h(C4OO.A02(), Text.class, "text", -809030976)});
            }

            public Response() {
                super(668897747);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0W(C4OO.A02(), Response.class, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 668897747);
        }

        public IgdMagicRemixLayout() {
            super(-1921261300);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(IgdMagicRemixLayout.class, "igd_magic_remix_layout", -1921261300);
    }

    public IGDirectMediaRemixLayoutsResponseImpl() {
        super(1816326084);
    }
}
