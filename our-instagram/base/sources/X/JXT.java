package X;

import android.view.View;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.widget.expanding.ExpandingListView;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes8.dex */
public final class JXT extends C1I7 {
    public final int A00;
    public final Object A01;

    public JXT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018a  */
    @Override // X.C1I7, X.C1I2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScroll(X.C3FQ r28, int r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JXT.onScroll(X.3FQ, int, int, int, int, int):void");
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03;
        int i2;
        N5Z n5z;
        SearchEditText searchEditText;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(741505767);
                if (i == 1 && (searchEditText = (n5z = (N5Z) this.A01).A0J) != null) {
                    searchEditText.clearFocus();
                    n5z.A0J.A04();
                }
                i2 = -1582492379;
                break;
            case 1:
                A03 = C0f9.A03(151513610);
                if (i != 0) {
                    if (i == 1) {
                        ((JR2) this.A01).A1C = true;
                    }
                } else {
                    ((JR2) this.A01).A1C = false;
                }
                i2 = -874547831;
                break;
            case 2:
                A03 = C0f9.A03(-900748153);
                if (i == 1) {
                    AbstractC13880nE.A0O((View) this.A01);
                }
                i2 = -865658572;
                break;
            case 3:
                A03 = C0f9.A03(-89829456);
                IgdsInlineSearchBox igdsInlineSearchBox = ((ENP) this.A01).A01;
                if (igdsInlineSearchBox != null && i == 1) {
                    igdsInlineSearchBox.A03();
                }
                i2 = 1595101184;
                break;
            case 4:
                A03 = C0f9.A03(-1708167874);
                ExpandingListView expandingListView = (ExpandingListView) this.A01;
                if (expandingListView.A00) {
                    expandingListView.A01 = AbstractC167007dF.A1N(i);
                }
                i2 = 939223258;
                break;
            case 5:
                A03 = C0f9.A03(1421886238);
                IgdsInlineSearchBox igdsInlineSearchBox2 = ((ENZ) this.A01).A08;
                if (igdsInlineSearchBox2 != null && i == 1) {
                    igdsInlineSearchBox2.A03();
                }
                i2 = 471513041;
                break;
            default:
                A03 = C0f9.A03(-230114264);
                C41118IIj c41118IIj = (C41118IIj) this.A01;
                IgdsInlineSearchBox igdsInlineSearchBox3 = c41118IIj.A03;
                if (i == 1) {
                    igdsInlineSearchBox3.A03();
                    c41118IIj.A01 = false;
                }
                i2 = 984611;
                break;
        }
        C0f9.A0A(i2, A03);
    }
}
