package X;

import android.view.View;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.FnY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35581FnY implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C31876Dzi A01;
    public final /* synthetic */ String A02;

    public ViewOnClickListenerC35581FnY(C31876Dzi c31876Dzi, String str, int i) {
        this.A01 = c31876Dzi;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-733739434);
        C31876Dzi c31876Dzi = this.A01;
        FML fml = (FML) c31876Dzi.A01;
        SearchEditText searchEditText = fml.A03;
        String str = this.A02;
        searchEditText.setText(str);
        searchEditText.setSelection(str.length());
        AbstractC167007dF.A0x(fml.A00);
        AbstractC13880nE.A0R(searchEditText);
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) c31876Dzi.A02;
        int i = this.A00;
        C35037FcA A06 = C1Q9.A1X.A02(abstractC12990ll).A06(EnumC33445EqI.A07, EnumC33523Erw.A0E.A00);
        A06.A03("username_position", i);
        A06.A02();
        C0f9.A0C(527197948, A05);
    }
}
