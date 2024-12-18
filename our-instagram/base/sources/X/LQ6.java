package X;

import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes8.dex */
public final class LQ6 implements View.OnFocusChangeListener, GZD {
    public boolean A00;
    public final IgdsInlineSearchBox A01;
    public final C45486KCa A02;

    @Override // X.GZD
    public final void onSearchCleared(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // X.GZD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSearchTextChanged(java.lang.String r9) {
        /*
            r8 = this;
            r3 = 0
            X.C14360o3.A0B(r9, r3)
            X.KCa r4 = r8.A02
            int r7 = r9.length()
            r2 = 1
            boolean r0 = X.AbstractC167007dF.A1O(r7)
            java.lang.String r6 = "emojiSheetHolder"
            java.lang.String r5 = "emojiSearchResultsController"
            X.LRC r1 = r4.A04
            if (r0 == 0) goto L4d
            if (r1 == 0) goto L6b
            boolean r0 = r1.A00
            if (r0 != 0) goto L34
            r1.A00 = r2
            android.view.View r0 = r1.A01
            android.view.View[] r0 = new android.view.View[]{r0}
            X.AbstractC125325le.A07(r0, r2)
            X.LRC.A00(r1, r3)
            X.Kz3 r0 = r4.A00
            if (r0 == 0) goto L6f
            com.instagram.ui.listview.CustomFadingEdgeListView r0 = r0.A00
            X.AbstractC166997dE.A1L(r0, r2)
        L34:
            X.LRC r1 = r4.A04
            if (r1 == 0) goto L6b
            if (r7 != 0) goto L43
            X.LRC.A00(r1, r3)
            X.KEH r0 = r1.A02
            r0.A03()
        L42:
            return
        L43:
            boolean r0 = r1.A00
            if (r0 == 0) goto L42
            X.KQL r0 = r1.A03
            r0.A00(r9)
            return
        L4d:
            if (r1 == 0) goto L6b
            boolean r0 = r1.A00
            if (r0 == 0) goto L34
            r1.A00 = r3
            android.view.View r0 = r1.A01
            X.AbstractC166997dE.A1L(r0, r2)
            X.LRC.A00(r1, r3)
            X.Kz3 r0 = r4.A00
            if (r0 == 0) goto L6f
            com.instagram.ui.listview.CustomFadingEdgeListView r0 = r0.A00
            android.view.View[] r0 = new android.view.View[]{r0}
            X.AbstractC125325le.A07(r0, r2)
            goto L34
        L6b:
            X.C14360o3.A0F(r5)
            goto L72
        L6f:
            X.C14360o3.A0F(r6)
        L72:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LQ6.onSearchTextChanged(java.lang.String):void");
    }

    public final void A00() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A01;
        igdsInlineSearchBox.A03();
        igdsInlineSearchBox.A0E.setText("");
        C45486KCa c45486KCa = this.A02;
        LRC lrc = c45486KCa.A04;
        String str = "emojiSearchResultsController";
        if (lrc != null) {
            if (lrc.A00) {
                lrc.A00 = false;
                AbstractC166997dE.A1L(lrc.A01, true);
                LRC.A00(lrc, false);
                C47536Kz3 c47536Kz3 = c45486KCa.A00;
                if (c47536Kz3 == null) {
                    str = "emojiSheetHolder";
                } else {
                    AbstractC125325le.A07(new View[]{c47536Kz3.A00}, true);
                }
            }
            this.A00 = false;
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z && !this.A00) {
            LRC lrc = this.A02.A04;
            if (lrc == null) {
                C14360o3.A0F("emojiSearchResultsController");
                throw C00O.createAndThrow();
            }
            if ("".length() == 0) {
                LRC.A00(lrc, false);
                lrc.A02.A03();
            } else if (lrc.A00) {
                lrc.A03.A00("");
            }
            this.A00 = true;
        }
    }

    public LQ6(View view, C45486KCa c45486KCa) {
        this.A02 = c45486KCa;
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AbstractC166997dE.A0R(view, R.id.asset_search_bar);
        this.A01 = igdsInlineSearchBox;
        igdsInlineSearchBox.A02 = this;
        igdsInlineSearchBox.A00 = this;
        igdsInlineSearchBox.A05(R.style.DirectDarkMode);
    }
}
