package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Lgs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48724Lgs implements AnonymousClass760 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C48724Lgs(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.AnonymousClass760
    public final void EQQ(Drawable drawable) {
        if (this.A00 != 0) {
            KCS kcs = (KCS) this.A02;
            ConstraintLayout constraintLayout = kcs.A02;
            if (constraintLayout != null) {
                constraintLayout.setBackground(drawable);
            }
            ConstraintLayout constraintLayout2 = kcs.A01;
            if (constraintLayout2 != null) {
                constraintLayout2.setBackground(drawable);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = kcs.A09;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setBackground(null);
                return;
            }
            return;
        }
        ((View) this.A02).setBackground(drawable);
    }

    @Override // X.AnonymousClass760
    public final void ERs(int i, int i2, int i3, int i4) {
        if (this.A00 != 0) {
            KCS kcs = (KCS) this.A02;
            boolean A1P = AbstractC167007dF.A1P(AbstractC166997dE.A0N(kcs).getConfiguration().uiMode & 48, 32);
            IgdsInlineSearchBox igdsInlineSearchBox = kcs.A0A;
            if (igdsInlineSearchBox != null) {
                int i5 = 255;
                if (A1P) {
                    i5 = 30;
                }
                igdsInlineSearchBox.setSearchRowColor((i & 16777215) | (i5 << 24));
            }
            IgdsInlineSearchBox igdsInlineSearchBox2 = kcs.A0A;
            if (igdsInlineSearchBox2 != null) {
                igdsInlineSearchBox2.setSearchGlyphColor(i2);
            }
            IgdsInlineSearchBox igdsInlineSearchBox3 = kcs.A0A;
            if (igdsInlineSearchBox3 != null) {
                igdsInlineSearchBox3.setClearButtonColor(i2);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = kcs.A09;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setBackgroundColor(i3);
            }
            C30D.A04((Activity) this.A01, i4);
        }
    }

    @Override // X.AnonymousClass760
    public final void setBackgroundColor(int i) {
        C189478aR c189478aR;
        if (this.A00 == 0 && (c189478aR = (C189478aR) this.A01) != null) {
            c189478aR.A03.A0S(i);
        }
    }
}
