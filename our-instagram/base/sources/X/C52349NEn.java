package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.NEn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52349NEn extends AbstractC66412zI {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC58279PsX A02;
    public final ODD A03;
    public final boolean A04;

    public C52349NEn(Context context, UserSession userSession, InterfaceC58279PsX interfaceC58279PsX, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = z;
        this.A02 = interfaceC58279PsX;
        this.A03 = OPO.A00(userSession);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        boolean z = this.A04;
        int i = R.layout.media_kit_description_view_layout;
        if (z) {
            i = R.layout.media_kit_description_edit_layout;
        }
        return new C51303MlQ(AbstractC25226BEj.A0R(layoutInflater, viewGroup, i, false), z);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        TextWatcher textWatcher;
        C56094OvE c56094OvE = (C56094OvE) interfaceC66482zP;
        C51303MlQ c51303MlQ = (C51303MlQ) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c56094OvE, c51303MlQ);
        if (this.A04) {
            EditText editText = c51303MlQ.A01;
            if (editText != null) {
                CharSequence charSequence = c56094OvE.A00;
                if (charSequence == null) {
                    charSequence = "";
                }
                editText.setText(charSequence);
            }
            C57745PjY A00 = C57745PjY.A00(c56094OvE, 14);
            if (editText != null) {
                editText.removeTextChangedListener(c51303MlQ.A00);
                textWatcher = new LO2(A00, 16);
                editText.addTextChangedListener(textWatcher);
            } else {
                textWatcher = null;
            }
            c51303MlQ.A00 = textWatcher;
            int i = this.A03.A00;
            if (editText != null) {
                AbstractC50523MSb.A0n(editText, i);
            }
        } else {
            IgTextView igTextView = c51303MlQ.A02;
            if (igTextView != null) {
                UserSession userSession = this.A01;
                String str = c56094OvE.A00;
                int A06 = AbstractC53242c7.A06(this.A00);
                C56389P2a c56389P2a = c56094OvE.A01;
                C14360o3.A0B(userSession, A1a ? 1 : 0);
                int color = igTextView.getContext().getColor(A06);
                if (str != null) {
                    C85383rT c85383rT = new C85383rT(AbstractC25225BEi.A0H(str), userSession);
                    c85383rT.A01 = color;
                    c85383rT.A03 = color;
                    c85383rT.A04 = color;
                    c85383rT.A02(c56389P2a);
                    c85383rT.A03(c56389P2a);
                    AbstractC31176DnK.A1G(igTextView, c85383rT.A00());
                }
            }
        }
        EditText editText2 = c51303MlQ.A01;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(new LQ3(new C57546PgK(this, 5), 6));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56094OvE.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C51303MlQ c51303MlQ = (C51303MlQ) c3oo;
        C14360o3.A0B(c51303MlQ, 0);
        EditText editText = c51303MlQ.A01;
        if (editText != null) {
            editText.setOnFocusChangeListener(null);
            editText.removeTextChangedListener(c51303MlQ.A00);
        }
    }
}
