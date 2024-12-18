package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.facebook.R;

/* renamed from: X.FMy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34615FMy {
    public ArrayAdapter A00;
    public final AutoCompleteTextView A01;
    public final C31771DxS A02;
    public final InterfaceC37138GXz A03;
    public final EnumC31713DwI A04;

    public C34615FMy(Context context, AutoCompleteTextView autoCompleteTextView, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, FH0 fh0, InterfaceC37138GXz interfaceC37138GXz, EnumC31713DwI enumC31713DwI, int i, boolean z) {
        this.A01 = autoCompleteTextView;
        autoCompleteTextView.setDropDownHorizontalOffset(context.getResources().getDimensionPixelOffset(R.dimen.menu_popup_panel_shadow_offset));
        autoCompleteTextView.setDropDownBackgroundDrawable(context.getDrawable(AbstractC53242c7.A0H(context, R.attr.menuPanelBackground)));
        this.A02 = new C31771DxS(context, interfaceC11380iw, abstractC12990ll, fh0, i, z);
        this.A03 = interfaceC37138GXz;
        this.A04 = enumC31713DwI;
    }
}
