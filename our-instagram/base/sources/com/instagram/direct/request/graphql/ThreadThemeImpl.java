package com.instagram.direct.request.graphql;

import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C2JS;
import X.C2JT;
import X.C4OK;
import X.C4OM;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;

/* loaded from: classes11.dex */
public final class ThreadThemeImpl extends C2JS implements C2JT {

    /* loaded from: classes11.dex */
    public final class ThreadBackgroundAsset extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class BackgroundImages extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(C94754Oe.A00, "url");
            }

            public BackgroundImages() {
                super(-479661724);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Y(AbstractC58318PtA.A0Q(), new C4OK(C4OO.A00(), BackgroundImages.class, "background_images", -479661724), "four_hundred_eighty");
        }

        public ThreadBackgroundAsset() {
            super(-1908335913);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, "composer_input_background_color"), new C4OW(c94754Oe, "composer_placeholder_text_color"), new C4OW(c94754Oe, "composer_secondary_button_color"), new C4OW(c94754Oe, "outbound_message_text_color"), new C4OW(c94754Oe, "incoming_message_bubble_color"), new C4OW(C94754Oe.A00(), "emphasis_colors"), new C4OW(C94754Oe.A01(), "gradient_colors"), new C4OW(c94754Oe, "emphasized_action_color"), new C4OW(c94754Oe, "navigation_bar_color"), new C4OW(c94754Oe, "navigation_bar_subtitle_color"), new C4OW(c94754Oe, "bottom_gradient_color"), new C4OW(c94754Oe, "secondary_text_color"), new C4OW(AbstractC58319PtB.A0S(), "should_show_incoming_message_bubble_border"), new C4OW(c94754Oe, "solid_composer_background_color"), new C4OW(c94754Oe, "thread_background_color"), new C4OK(ThreadBackgroundAsset.class, "thread_background_asset", -1908335913)});
    }

    public ThreadThemeImpl() {
        super(-158150994);
    }
}
