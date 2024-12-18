package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Aei, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23709Aei implements InterfaceC60152ox {
    public int A00;
    public View A01;
    public View A02;
    public Medium A03;
    public Medium A04;
    public IgEditText A05;
    public IgEditText A06;
    public IgSimpleImageView A07;
    public IgSimpleImageView A08;
    public IgSimpleImageView A09;
    public IgSimpleImageView A0A;
    public IgTextView A0B;
    public AFz A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final int A0G;
    public final Context A0H;
    public final View.OnFocusChangeListener A0I;
    public final UserSession A0J;
    public final InterfaceC1810081c A0K;
    public final C8NW A0L;
    public final C88W A0M;
    public final String A0N;
    public final List A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final Resources A0S;
    public final InterfaceC195198kL A0T;

    public C23709Aei(View view, UserSession userSession, C3I9 c3i9, InterfaceC1810081c interfaceC1810081c, C8NW c8nw, String str) {
        C14360o3.A0B(str, 5);
        this.A0L = c8nw;
        this.A0K = interfaceC1810081c;
        this.A0N = str;
        this.A0J = userSession;
        Context context = view.getContext();
        this.A0H = context;
        Resources resources = context.getResources();
        this.A0S = resources;
        this.A0O = AbstractC166987dD.A1E();
        this.A0G = resources.getDimensionPixelSize(R.dimen.before_and_after_media_card_width);
        this.A0F = resources.getDimensionPixelSize(R.dimen.before_and_after_media_card_height);
        this.A0Q = C1XM.A00(new C50151MDe(view, 26));
        this.A0P = C1XM.A00(new C50151MDe(view, 25));
        this.A0R = C1XM.A00(new C50151MDe(view, 27));
        C24161Ank c24161Ank = new C24161Ank(this, 0);
        this.A0T = c24161Ank;
        C88W c88w = new C88W(context, c3i9, c24161Ank);
        C195208kM c195208kM = c88w.A03;
        c195208kM.A03 = true;
        c195208kM.A06 = true;
        c195208kM.A00 = c88w.A00;
        c195208kM.A05 = true;
        this.A0M = c88w;
        this.A0I = new WNZ(1, this, c3i9);
    }

    public static final void A01(IgEditText igEditText, int i) {
        igEditText.setText((CharSequence) null);
        igEditText.setHint(igEditText.getContext().getString(i));
        if (igEditText.hasFocus()) {
            igEditText.clearFocus();
        }
    }

    public static final void A02(C23709Aei c23709Aei) {
        String str;
        List list = c23709Aei.A0O;
        if (!list.isEmpty()) {
            C211699Zd c211699Zd = (C211699Zd) AbstractC001800i.A0O(list, c23709Aei.A00 % list.size());
            IgEditText igEditText = c23709Aei.A06;
            String str2 = null;
            if (igEditText != null) {
                igEditText.getText().clear();
                if (c211699Zd != null) {
                    str = c211699Zd.A00;
                } else {
                    str = null;
                }
                igEditText.setHint(str);
            }
            IgEditText igEditText2 = c23709Aei.A05;
            if (igEditText2 != null) {
                igEditText2.getText().clear();
                if (c211699Zd != null) {
                    str2 = c211699Zd.A01;
                }
                igEditText2.setHint(str2);
            }
            c23709Aei.A00++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r2.A03 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C23709Aei r2, com.instagram.ui.text.fittingtextview.FittingTextView r3) {
        /*
            com.instagram.common.gallery.Medium r0 = r2.A04
            if (r0 == 0) goto L9
            com.instagram.common.gallery.Medium r1 = r2.A03
            r0 = 1
            if (r1 != 0) goto La
        L9:
            r0 = 0
        La:
            r3.setEnabled(r0)
            X.0do r0 = r2.A0Q
            android.view.View r1 = X.AbstractC167007dF.A0L(r0)
            boolean r0 = r3.isEnabled()
            X.AJq.A01(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23709Aei.A03(X.Aei, com.instagram.ui.text.fittingtextview.FittingTextView):void");
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        IgSimpleImageView igSimpleImageView = this.A0A;
        if (igSimpleImageView != null) {
            AbstractC125325le A00 = AbstractC125325le.A00(igSimpleImageView);
            A00.A0G();
            A00.A0K(i * (-1.0f));
            A00.A0H();
        }
    }

    public static final String A00(IgEditText igEditText) {
        CharSequence hint;
        Editable text = igEditText.getText();
        if (text != null && text.length() != 0) {
            hint = igEditText.getText();
        } else {
            hint = igEditText.getHint();
            if (hint == null) {
                hint = "";
            }
        }
        return hint.toString();
    }
}
