package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.9gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215759gr extends AbstractC66412zI {
    public C210989Uv A00;
    public final View A01;
    public final InterfaceC60152ox A02;
    public final C3I9 A03;
    public final A5W A04;

    public C215759gr(View view, C3I9 c3i9, A5W a5w) {
        C14360o3.A0B(a5w, 3);
        this.A01 = view;
        this.A03 = c3i9;
        this.A04 = a5w;
        C48548Ldl c48548Ldl = new C48548Ldl(this, 2);
        this.A02 = c48548Ldl;
        AbstractC56952jT.A01(view);
        ViewOnClickListenerC23249ASk.A00(view, 19, this);
        c3i9.A9e(c48548Ldl);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C211859aC c211859aC = (C211859aC) interfaceC66482zP;
        C210989Uv c210989Uv = (C210989Uv) c3oo;
        AbstractC167017dG.A1N(c211859aC, c210989Uv);
        if (C14360o3.A0K(this.A00, c210989Uv)) {
            this.A00 = null;
        }
        if (c211859aC.A03) {
            this.A00 = c210989Uv;
        }
        c210989Uv.A00 = c211859aC;
        EditText editText = c210989Uv.A01;
        float f = 0.0f;
        if (c211859aC.A04) {
            f = 1.0f;
        }
        editText.setAlpha(f);
        int i = 4;
        if (c211859aC.A04) {
            i = 0;
        }
        editText.setVisibility(i);
        editText.setText(c211859aC.A02, TextView.BufferType.EDITABLE);
        AbstractC167017dG.A18(editText);
        if (c211859aC.A03) {
            editText.requestFocus();
        }
        editText.setHint(c211859aC.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C211859aC.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C210989Uv c210989Uv = (C210989Uv) c3oo;
        C14360o3.A0B(c210989Uv, 0);
        if (C14360o3.A0K(this.A00, c210989Uv)) {
            this.A00 = null;
        }
        c210989Uv.A00 = null;
        c210989Uv.A01.clearFocus();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        A5W a5w = this.A04;
        View inflate = layoutInflater.inflate(R.layout.karaoke_sticker_edit_row, viewGroup, AbstractC167007dF.A1U(a5w));
        C14360o3.A0C(inflate, AbstractC111324zv.A00(239));
        return new C210989Uv((EditText) inflate, a5w);
    }
}
