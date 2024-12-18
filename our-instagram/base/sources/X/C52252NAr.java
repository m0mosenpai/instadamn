package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.NAr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52252NAr extends AbstractC60592pi {
    public InputMethodManager A00;
    public EditText A01;
    public C50821Mcw A02;
    public boolean A03 = false;
    public TextWatcher A04;
    public View A05;
    public IgLinearLayout A06;
    public final FragmentActivity A07;
    public final AbstractC10360h2 A08;
    public final AbstractC018607g A09;
    public final C55197Oe4 A0A;
    public final C54377O1j A0B;
    public final EnumC53243Ngg A0C;
    public final UserSession A0D;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A05 = null;
        this.A01 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A01.getClass();
        InputMethodManager inputMethodManager = this.A00;
        inputMethodManager.getClass();
        inputMethodManager.hideSoftInputFromWindow(this.A01.getWindowToken(), 0);
        this.A01.getClass();
        EditText editText = this.A01;
        TextWatcher textWatcher = this.A04;
        textWatcher.getClass();
        editText.removeTextChangedListener(textWatcher);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        FragmentActivity fragmentActivity = this.A07;
        if (fragmentActivity.getWindow() != null && !C55197Oe4.A02(this.A0A).isEmpty()) {
            UserSession userSession = this.A0D;
            if (!C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36330896428647493L)) {
                fragmentActivity.getWindow().setSoftInputMode(16);
            }
            this.A01.getClass();
            InputMethodManager inputMethodManager = this.A00;
            inputMethodManager.getClass();
            inputMethodManager.showSoftInput(this.A01, 1);
            EditText editText = this.A01;
            TextWatcher textWatcher = this.A04;
            textWatcher.getClass();
            editText.addTextChangedListener(textWatcher);
            return;
        }
        C9GR.A0F(fragmentActivity, "highlight_create_selected_item_failure", 2131963575);
        View view = this.A05;
        view.getClass();
        view.post(new PLH(this));
    }

    public C52252NAr(FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, C55197Oe4 c55197Oe4, C54377O1j c54377O1j, EnumC53243Ngg enumC53243Ngg, UserSession userSession) {
        this.A0D = userSession;
        this.A07 = fragmentActivity;
        this.A08 = abstractC10360h2;
        this.A09 = abstractC018607g;
        this.A0C = enumC53243Ngg;
        this.A0A = c55197Oe4;
        this.A0B = c54377O1j;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        EditText editText = (EditText) view.requireViewById(R.id.highlight_title);
        this.A01 = editText;
        UserSession userSession = this.A0D;
        editText.setText(C55197Oe4.A00(userSession).A01);
        AbstractC167017dG.A18(this.A01);
        EditText editText2 = this.A01;
        C55842Oqs c55842Oqs = new C55842Oqs(this);
        C14360o3.A0B(editText2, 0);
        this.A04 = new Oi8(editText2, c55842Oqs);
        FragmentActivity fragmentActivity = this.A07;
        this.A00 = (InputMethodManager) fragmentActivity.getSystemService("input_method");
        C14360o3.A0B(userSession, 0);
        if (AnonymousClass502.A00(userSession) && C18U.A06(C06090Tz.A05, userSession, 36328925038722925L)) {
            IgLinearLayout igLinearLayout = (IgLinearLayout) view.requireViewById(R.id.toggle_highlights_to_main_grid);
            this.A06 = igLinearLayout;
            Context context = view.getContext();
            ViewOnClickListenerC55361OiN viewOnClickListenerC55361OiN = new ViewOnClickListenerC55361OiN(0);
            Integer valueOf = Integer.valueOf(R.drawable.instagram_photo_grid_pano_outline_24);
            C14360o3.A0B(context, 0);
            C50821Mcw c50821Mcw = new C50821Mcw(context);
            c50821Mcw.setTitle(context.getResources().getString(2131956957));
            C0fQ.A00(viewOnClickListenerC55361OiN, c50821Mcw);
            c50821Mcw.setIcon(MSX.A07(context, valueOf));
            AbstractC50522MSa.A0z(c50821Mcw);
            if (igLinearLayout != null) {
                igLinearLayout.addView(c50821Mcw);
            }
            this.A02 = c50821Mcw;
            ViewOnClickListenerC55467OkM.A00(c50821Mcw, 2, this);
            this.A03 = true;
            String string = fragmentActivity.getResources().getString(2131956959);
            C50821Mcw c50821Mcw2 = this.A02;
            if (c50821Mcw2 != null) {
                c50821Mcw2.setInlineSubtitle(string);
            }
            this.A06.setVisibility(0);
            return;
        }
        IgLinearLayout igLinearLayout2 = (IgLinearLayout) view.requireViewById(R.id.toggle_highlights_to_main_grid);
        this.A06 = igLinearLayout2;
        igLinearLayout2.setVisibility(8);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        this.A05 = view;
    }
}
