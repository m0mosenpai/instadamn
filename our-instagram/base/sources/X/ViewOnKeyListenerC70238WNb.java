package X;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import androidx.appcompat.widget.SearchView;
import androidx.preference.SeekBarPreference;

/* renamed from: X.WNb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnKeyListenerC70238WNb implements View.OnKeyListener {
    public final int A00;
    public final Object A01;

    public ViewOnKeyListenerC70238WNb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        switch (this.A00) {
            case 0:
                SearchView searchView = (SearchView) this.A01;
                if (searchView.A00 == null) {
                    return false;
                }
                SearchView.SearchAutoComplete searchAutoComplete = searchView.A0d;
                if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                    if (searchView.A00 == null || searchView.A05 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    if (i != 66 && i != 84 && i != 61) {
                        if (i != 21) {
                            if (i == 22) {
                                i2 = searchAutoComplete.length();
                            } else {
                                if (i != 19) {
                                    return false;
                                }
                                searchAutoComplete.getListSelection();
                                return false;
                            }
                        } else {
                            i2 = 0;
                        }
                        searchAutoComplete.setSelection(i2);
                        searchAutoComplete.setListSelection(0);
                        searchAutoComplete.clearListSelection();
                        searchAutoComplete.A00();
                        return true;
                    }
                    searchView.A0D(searchAutoComplete.getListSelection());
                    return true;
                }
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                searchView.A0G(AbstractC167007dF.A0g(searchAutoComplete));
                return true;
            case 1:
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.A01;
                if ((!seekBarPreference.A06 && (i == 21 || i == 22)) || i == 23 || i == 66) {
                    return false;
                }
                SeekBar seekBar = seekBarPreference.A04;
                if (seekBar == null) {
                    android.util.Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                    return false;
                }
                return seekBar.onKeyDown(i, keyEvent);
            case 2:
                C14360o3.A0B(keyEvent, 2);
                if (keyEvent.getAction() == 0 && i == 66) {
                    C67677Uvp c67677Uvp = (C67677Uvp) this.A01;
                    UvM uvM = c67677Uvp.A04;
                    if (uvM != null) {
                        if (!uvM.A0F()) {
                            UvM uvM2 = c67677Uvp.A04;
                            if (uvM2 != null) {
                                MSX.A1B(uvM2.A06, true);
                                return true;
                            }
                        } else {
                            return true;
                        }
                    }
                    C14360o3.A0F("viewModel");
                    throw C00O.createAndThrow();
                }
                return false;
            default:
                if (i == 67) {
                    EditText editText = (EditText) this.A01;
                    if (C14360o3.A0K(AbstractC167007dF.A0g(editText), editText.getContext().getString(2131955125))) {
                        editText.getText().clear();
                    }
                }
                return false;
        }
    }
}
