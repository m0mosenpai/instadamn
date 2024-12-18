package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.OwU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56162OwU implements C3PE, InterfaceC60152ox {
    public Animator A00;
    public AnonymousClass195 A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final EditText A07;
    public final AbstractC59962oe A08;
    public final UserSession A09;
    public final C3I9 A0A;
    public final NG3 A0B;
    public final EnumC142806cg A0C;
    public final OU9 A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC216113n A0H;

    public C56162OwU(View view, View view2, AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg) {
        AbstractC167007dF.A1G(userSession, 2, view2);
        this.A08 = abstractC59962oe;
        this.A09 = userSession;
        this.A0C = enumC142806cg;
        this.A02 = view2;
        C57547PgL c57547PgL = new C57547PgL(this, 34);
        InterfaceC09390do A01 = C57547PgL.A01(new C57547PgL(abstractC59962oe, 31), EnumC09460dv.A02, 32);
        this.A0G = AbstractC25225BEi.A0a(new C57547PgL(A01, 33), c57547PgL, C57532Pg6.A00(null, A01, 33), AbstractC25225BEi.A1D(C51026MgZ.class));
        this.A06 = AbstractC31176DnK.A0C(view, R.id.iglive_reactions_layout);
        View A0S = AbstractC166997dE.A0S(view, R.id.iglive_reactions_composer);
        this.A05 = A0S;
        View A0S2 = AbstractC166997dE.A0S(view, R.id.iglive_comment_composer_container);
        this.A04 = A0S2;
        this.A03 = AbstractC166997dE.A0S(view, R.id.comment_composer);
        this.A07 = (EditText) AbstractC166997dE.A0R(view, R.id.comment_composer_edit_text);
        this.A0E = C57547PgL.A00(view, 29);
        this.A0F = C57547PgL.A00(view, 30);
        C3I8 A012 = C3I7.A01(this, false, false);
        this.A0A = A012;
        this.A0B = new NG3(this, 2);
        this.A0D = new OU9(view2, A0S2, A0S, AbstractC13620mo.A02(AbstractC166997dE.A0L(view)));
        this.A0H = C55805OqG.A00;
        if (enumC142806cg != EnumC142806cg.A05) {
            A02(abstractC59962oe);
        }
        View A0d = AbstractC166987dD.A0d(this.A0E);
        if (A0d != null) {
            AbstractC50522MSa.A12(A0d, this);
        }
        View A0L = AbstractC167007dF.A0L(this.A0F);
        if (A0L != null) {
            AbstractC50522MSa.A12(A0L, this);
        }
        A012.A9e(this);
    }

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        String A0E = AnonymousClass001.A0E(str, '@', ' ');
        EditText editText = this.A07;
        editText.setText(A0E);
        editText.requestFocus();
        AbstractC13880nE.A0R(editText);
    }

    @Override // X.C3PE
    public final void DQY(View view) {
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        C14360o3.A0B(view, 0);
        if (MSX.A1Y(view, this.A0E)) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0G);
            C57164PZi.A03(A0Z, AbstractC141776au.A00(A0Z), 3);
            return true;
        }
        if (!view.equals(AbstractC166987dD.A17(this.A0F))) {
            return true;
        }
        C51026MgZ A00 = A00(this);
        NG3 ng3 = this.A0B;
        long A002 = ng3.A00();
        int i = ((AbstractC13100lw) ng3).A00;
        ((AbstractC13100lw) ng3).A00 = 0;
        A00.A01("", i, A002, true);
        return true;
    }

    public static C51026MgZ A00(C56162OwU c56162OwU) {
        return (C51026MgZ) c56162OwU.A0G.getValue();
    }

    public static final void A01(C56162OwU c56162OwU) {
        EditText editText = c56162OwU.A07;
        String A0g = AbstractC167007dF.A0g(editText);
        int length = A0g.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(A0g, i2);
            if (!z) {
                if (!A19) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!A19) {
                break;
            } else {
                length--;
            }
        }
        String A0g2 = AbstractC31177DnL.A0g(A0g, length, i);
        editText.clearFocus();
        editText.setText(A0g2);
    }

    public final void A02(Fragment fragment) {
        this.A05.setEnabled(true);
        EditText editText = this.A07;
        editText.setFocusable(true);
        editText.setEnabled(true);
        editText.setFocusableInTouchMode(true);
        ViewOnFocusChangeListenerC55473OkS.A00(editText, 6, this);
        Ok4.A00(editText, 30, this);
        editText.setOnEditorActionListener(new C55536OlV(this, 2));
        editText.addTextChangedListener(this.A0B);
        InterfaceC09390do interfaceC09390do = this.A0G;
        this.A01 = AbstractC50522MSa.A0s(fragment, new PZN(fragment, this, null, 8), ((C51026MgZ) interfaceC09390do.getValue()).A0E);
        AbstractC37301Gc2.A0w(fragment.getViewLifecycleOwner(), ((C51026MgZ) interfaceC09390do.getValue()).A01, new C57751Pje(24, fragment, this), 21);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        C51026MgZ A00 = A00(this);
        if (i <= AbstractC166987dD.A0H(this.A0H.get())) {
            C51026MgZ.A00(null, A00, null, 19, false, false, false);
        }
    }
}
