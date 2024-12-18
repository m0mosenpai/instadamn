package com.instagram.direct.request.graphql;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.AbstractC65703TsZ;
import X.C126315nS;
import X.C2JS;
import X.C2JT;
import X.C4OK;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C67A;
import X.C94754Oe;
import X.C94774Oi;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public final class IGGetThemePreviewResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes11.dex */
    public final class XdtThemePreview extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class AlternativeThemes extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0a(ThreadThemeImpl.class, "ThreadTheme", -158150994);
            }

            public AlternativeThemes() {
                super(260988390);
            }
        }

        public final ImmutableList A0E() {
            return getRequiredCompactedTreeListField(3, "alternative_themes", AlternativeThemes.class, 260988390);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167007dF.A0Q(new C4OW(new C94774Oi(C67A.A00), "theme_id"), AbstractC65703TsZ.A0K(C94754Oe.A00), new C126315nS(ThreadThemeImpl.class, "ThreadTheme", -158150994), new C4OK(C4OO.A02(), AlternativeThemes.class, "alternative_themes", 260988390));
        }

        public XdtThemePreview() {
            super(1568985831);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XdtThemePreview.class, AbstractC43591JPw.A00(495), 1568985831);
    }

    public IGGetThemePreviewResponseImpl() {
        super(-1566123658);
    }
}
