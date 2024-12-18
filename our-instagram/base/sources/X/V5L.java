package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgEditText;

/* loaded from: classes11.dex */
public final class V5L extends AbstractC66412zI {
    public final TextView.OnEditorActionListener A00;
    public final C3I9 A01;
    public final C52837NZu A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new UJS(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_question_sheet_input, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        UJS ujs = (UJS) c3oo;
        C14360o3.A0B(ujs, 1);
        WNW.A00(ujs.A01, 22, ujs, this);
        WNW.A00(ujs.A03, 23, ujs, this);
        WNW.A00(ujs.A04, 24, ujs, this);
        IgEditText igEditText = ujs.A02;
        igEditText.setOnEditorActionListener(this.A00);
        igEditText.addTextChangedListener(new NG3(ujs, 1));
        this.A01.A9e(new C70826Whj(2, ujs, this));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56077Ouu.class;
    }

    public V5L(TextView.OnEditorActionListener onEditorActionListener, C3I9 c3i9, C52837NZu c52837NZu) {
        AbstractC167017dG.A1R(onEditorActionListener, c3i9);
        this.A02 = c52837NZu;
        this.A00 = onEditorActionListener;
        this.A01 = c3i9;
    }
}
