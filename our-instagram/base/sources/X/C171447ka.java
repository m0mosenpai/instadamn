package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.7ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171447ka extends AbstractC59962oe implements InterfaceC60152ox {
    public static final String __redex_internal_original_name = "UserPayBroadcasterBottomSheetFragment";
    public EditText A00;
    public TextView A01;
    public C171457kb A02;
    public IgdsButton A03;
    public C3I9 A04;
    public final InterfaceC09390do A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C3I8 A01 = C3I7.A01(this, false, false);
        this.A04 = A01;
        A01.A9e(this);
        A01.Dnr(getActivity());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    @Override // X.InterfaceC60152ox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DOK(int r3, boolean r4) {
        /*
            r2 = this;
            com.instagram.igds.components.button.IgdsButton r0 = r2.A03
            if (r3 <= 0) goto L1f
            if (r0 == 0) goto L23
            r1 = 8
        L8:
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.A01
            if (r0 != 0) goto L19
            java.lang.String r0 = "helperText"
        L11:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L19:
            r0.setVisibility(r1)
            java.lang.String r0 = "suggestionText"
            goto L11
        L1f:
            if (r0 == 0) goto L23
            r1 = 0
            goto L8
        L23:
            java.lang.String r0 = "actionButton"
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C171447ka.DOK(int, boolean):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A05.getValue();
    }

    public C171447ka() {
        new C19270xB(__redex_internal_original_name);
        this.A05 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0f9.A02(-733052583);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.iglive_user_pay_broadcaster_bottom_sheet, viewGroup, false);
        this.A03 = (IgdsButton) inflate.requireViewById(R.id.action_button);
        this.A01 = (TextView) inflate.requireViewById(R.id.helper_text);
        this.A00 = (EditText) inflate.requireViewById(R.id.goal_setting_input_text);
        inflate.findViewById(R.id.title);
        C14360o3.A0F("sheetConfig");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-226893459);
        super.onDestroy();
        C3I9 c3i9 = this.A04;
        if (c3i9 != null) {
            c3i9.onStop();
        }
        C0f9.A09(1891558704, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(1442589773);
        super.onResume();
        if (this.A00 != null) {
            if (!AbstractC001900j.A0T(String.valueOf(r0.getText()))) {
                if (this.A00 != null) {
                    if (!AbstractC001900j.A0T(r0.getText().toString())) {
                        str = "userName";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
            }
            C0f9.A09(1699403426, A02);
            return;
        }
        str = "editText";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
