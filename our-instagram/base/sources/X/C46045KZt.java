package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KZt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46045KZt extends AbstractC86353t7 {
    public final int A00;
    public final Object A01;

    public C46045KZt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void CwQ(float f) {
        if (1 - this.A00 != 0) {
            super.CwQ(f);
            return;
        }
        C47988LJq c47988LJq = (C47988LJq) this.A01;
        c47988LJq.A04(c47988LJq.A0A, c47988LJq.A01);
        c47988LJq.A0L.setAlpha(1.0f);
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DB6() {
        switch (this.A00) {
            case 0:
                LIi lIi = (LIi) this.A01;
                LKK lkk = lIi.A02;
                if (lkk != null) {
                    lkk.A04();
                }
                LIi.A01(lIi);
                return;
            case 1:
                C47988LJq c47988LJq = (C47988LJq) this.A01;
                c47988LJq.A0D = true;
                C48259LXi c48259LXi = c47988LJq.A0S.A00;
                MRL mrl = c48259LXi.A0E;
                if (mrl != null) {
                    mrl.DEq();
                    PopupWindow popupWindow = c48259LXi.A0C;
                    if (popupWindow != null && popupWindow.getContentView() != null) {
                        popupWindow.getContentView().setVisibility(0);
                        popupWindow.setTouchable(true);
                        popupWindow.update();
                    }
                }
                LKK lkk2 = c47988LJq.A08;
                String str = null;
                if (lkk2 == null) {
                    C14360o3.A0F("reactionsTrayController");
                    throw C00O.createAndThrow();
                }
                lkk2.A04();
                c47988LJq.A04(c47988LJq.A0A, c47988LJq.A00);
                View view = c47988LJq.A0L;
                view.setVisibility(8);
                view.setAlpha(0.0f);
                ViewGroup viewGroup = c47988LJq.A05;
                if (viewGroup != null) {
                    C47988LJq.A01(viewGroup, c47988LJq, AbstractC167017dG.A04(c47988LJq.A0I));
                }
                if (!c47988LJq.A0B) {
                    return;
                }
                c47988LJq.A0B = false;
                c47988LJq.A02 = -1;
                List A03 = lkk2.A03();
                UserSession userSession = c47988LJq.A0Q;
                int i = c47988LJq.A0H;
                if (!C14360o3.A0K(AbstractC47991LKc.A00(userSession, i), A03.get(0)) && mrl != null) {
                    mrl.DBP();
                }
                if (i == 29) {
                    ImmutableList immutableList = C83863oV.A03;
                    Collections.replaceAll(A03, "❤", "❤");
                }
                try {
                    StringWriter stringWriter = new StringWriter();
                    C17z A0S = AbstractC167007dF.A0S(stringWriter);
                    C16V.A03(A0S, "reactions");
                    Iterator it = A03.iterator();
                    while (it.hasNext()) {
                        AbstractC167017dG.A1F(A0S, it);
                    }
                    A0S.A0Z();
                    String A0l = AbstractC167017dG.A0l(A0S, stringWriter);
                    C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                    InterfaceC16530ry interfaceC16530ry = A00.A0x;
                    C0YR[] c0yrArr = C23031Ai.A8c;
                    interfaceC16530ry.Egi(A00, A0l, c0yrArr[157]);
                    A00.A0w.Egi(A00, A03.get(0), c0yrArr[158]);
                } catch (IOException e) {
                    C0w9.A06("DirectReactionSetUtil", "failed to save reaction set", e);
                }
                C18920wW c18920wW = c47988LJq.A0P;
                C3o9 c3o9 = c47988LJq.A0T;
                if (c3o9 != null) {
                    str = AbstractC43827JZq.A01(c3o9);
                }
                C14360o3.A0B(c18920wW, 0);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "direct_edit_customize_reactions");
                A0f.AAk("emojis", A03);
                if (str != null) {
                    AbstractC31171DnF.A1H(A0f, str);
                }
                A0f.Cht();
                c47988LJq.A0R.setVisibility(8);
                return;
            default:
                C37987GnX c37987GnX = (C37987GnX) this.A01;
                c37987GnX.A00 = null;
                JIC jic = c37987GnX.A0B;
                jic.Dcg();
                if (c37987GnX.A03) {
                    c37987GnX.A03 = false;
                    c37987GnX.A02(c37987GnX.A01);
                    return;
                }
                if (c37987GnX.A04) {
                    c37987GnX.A04 = false;
                    c37987GnX.A03(c37987GnX.A01);
                    return;
                }
                if (c37987GnX.A02) {
                    c37987GnX.A02 = false;
                    C189478aR c189478aR = c37987GnX.A00;
                    if (c189478aR != null) {
                        c37987GnX.A02 = true;
                        c189478aR.A07();
                        return;
                    } else {
                        jic.EMa();
                        return;
                    }
                }
                if (!c37987GnX.A05) {
                    return;
                }
                c37987GnX.A05 = false;
                c37987GnX.A01(c37987GnX.A01);
                return;
        }
    }
}
