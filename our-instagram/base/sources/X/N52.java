package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.igds.components.form.IgFormField;

/* loaded from: classes9.dex */
public final class N52 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ClipsDraftRenameFragment";
    public InterfaceC57925PmV A00;
    public IgFormField A01;
    public TextWatcher A02;
    public IgButton A03;
    public IgButton A04;
    public String A05 = "";
    public final InterfaceC09390do A06 = C57537PgB.A00(this, 25);
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgButton igButton = (IgButton) view.findViewById(R.id.draft_rename_save_button);
        this.A04 = igButton;
        if (igButton == null) {
            str = "saveButton";
        } else {
            ViewOnClickListenerC55463OkI.A00(igButton, 39, this);
            IgButton igButton2 = (IgButton) view.findViewById(R.id.draft_rename_cancel_button);
            this.A03 = igButton2;
            if (igButton2 == null) {
                str = "cancelButton";
            } else {
                ViewOnClickListenerC55463OkI.A00(igButton2, 40, this);
                IgFormField igFormField = (IgFormField) view.findViewById(R.id.rename_edit_text);
                this.A01 = igFormField;
                str = "nameFormField";
                if (igFormField != null) {
                    igFormField.setMaxLength(28);
                    IgFormField igFormField2 = this.A01;
                    if (igFormField2 != null) {
                        igFormField2.A0D();
                        IgFormField igFormField3 = this.A01;
                        if (igFormField3 != null) {
                            igFormField3.setTextProperty(this.A05);
                            if (AbstractC167007dF.A1Z(this.A06)) {
                                IgFormField igFormField4 = this.A01;
                                if (igFormField4 != null) {
                                    AbstractC25227BEk.A12(igFormField4.getBottomSubtitleErrorView(), this, 2131961181);
                                    C55346Oi6 c55346Oi6 = new C55346Oi6(this, 30);
                                    IgFormField igFormField5 = this.A01;
                                    if (igFormField5 != null) {
                                        igFormField5.getMEditText().addTextChangedListener(c55346Oi6);
                                        this.A02 = c55346Oi6;
                                    }
                                }
                            }
                            IgFormField igFormField6 = this.A01;
                            if (igFormField6 != null) {
                                igFormField6.getMEditText().setOnEditorActionListener(new C55536OlV(this, 4));
                                IgFormField igFormField7 = this.A01;
                                if (igFormField7 != null) {
                                    AbstractC13880nE.A0T(igFormField7.getMEditText());
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(N52 n52) {
        IgFormField igFormField = n52.A01;
        String str = "nameFormField";
        if (igFormField != null) {
            String obj = igFormField.getText().toString();
            if (obj.length() == 0 && AbstractC167007dF.A1Z(n52.A06)) {
                IgFormField igFormField2 = n52.A01;
                if (igFormField2 != null) {
                    igFormField2.getBottomSubtitleErrorView().setVisibility(0);
                    return;
                }
            } else {
                if (!obj.equals(n52.A05)) {
                    InterfaceC57925PmV interfaceC57925PmV = n52.A00;
                    if (interfaceC57925PmV != null) {
                        interfaceC57925PmV.DBt(obj);
                    } else {
                        str = "delegate";
                    }
                }
                AbstractC31177DnL.A12(n52);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        String string;
        int A02 = C0f9.A02(-1888649603);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            bool = Boolean.valueOf(bundle2.getBoolean("args_clips_drafts_fragment_should_use_dark_mode", false));
        } else {
            bool = null;
        }
        if (AbstractC31177DnL.A1b(bool)) {
            setDayNightMode(EnumC60792q3.A03);
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (string = bundle3.getString("args_draft_name", null)) != null && string.length() > 0) {
            this.A05 = string;
        }
        C0f9.A09(-1161024901, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-116522725);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_draft_rename_fragment, viewGroup, false);
        C0f9.A09(-1980280946, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1736566660);
        TextWatcher textWatcher = this.A02;
        if (textWatcher != null) {
            IgFormField igFormField = this.A01;
            if (igFormField == null) {
                C14360o3.A0F("nameFormField");
                throw C00O.createAndThrow();
            }
            AbstractC31173DnH.A1D(textWatcher, igFormField);
        }
        super.onDestroy();
        C0f9.A09(-1395444049, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1035749729);
        super.onResume();
        IgFormField igFormField = this.A01;
        if (igFormField == null) {
            C14360o3.A0F("nameFormField");
            throw C00O.createAndThrow();
        }
        igFormField.getMEditText().requestFocus();
        C0f9.A09(-711391108, A02);
    }
}
