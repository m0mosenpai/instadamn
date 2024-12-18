package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* loaded from: classes6.dex */
public final class G9L implements C33I {
    public final int A00;
    public final Object A01;

    public G9L(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C33I
    public final boolean Dtk(C5SW c5sw) {
        String str;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c5sw, 0);
                EL6 el6 = (EL6) this.A01;
                FragmentActivity activity = el6.getActivity();
                Object obj = null;
                if (activity != null) {
                    obj = AbstractC31171DnF.A0X(activity);
                }
                ClipboardManager clipboardManager = (ClipboardManager) obj;
                if (clipboardManager == null) {
                    return true;
                }
                TextView textView = el6.A02;
                if (textView == null) {
                    str = "backupCodesTextView";
                    break;
                } else {
                    AbstractC31173DnH.A0x(clipboardManager, "Backup Codes", textView.getText());
                    AbstractC31173DnH.A13(el6.getContext(), el6, 2131956830);
                    c5sw.A08(true);
                    return true;
                }
            case 1:
                C14360o3.A0B(c5sw, 0);
                C32262EIw c32262EIw = (C32262EIw) this.A01;
                Context requireContext = c32262EIw.requireContext();
                ClipboardManager clipboardManager2 = (ClipboardManager) AbstractC31171DnF.A0X(requireContext);
                if (clipboardManager2 == null) {
                    return true;
                }
                ClipData primaryClip = clipboardManager2.getPrimaryClip();
                if (primaryClip != null && primaryClip.getItemCount() > 0 && primaryClip.getItemAt(0) != null) {
                    CharSequence text = primaryClip.getItemAt(0).getText();
                    str = "confirmationCodeEditText";
                    if (text != null) {
                        int length = text.length();
                        ConfirmationCodeEditText confirmationCodeEditText = c32262EIw.A0A;
                        if (confirmationCodeEditText != null) {
                            if (length == confirmationCodeEditText.A03) {
                                confirmationCodeEditText.setText(text, TextView.BufferType.EDITABLE);
                                ConfirmationCodeEditText confirmationCodeEditText2 = c32262EIw.A0A;
                                if (confirmationCodeEditText2 != null) {
                                    confirmationCodeEditText2.setSelection(text.length());
                                }
                            }
                        }
                    }
                    AbstractC31173DnH.A13(requireContext, c32262EIw, 2131975881);
                }
                c5sw.A08(true);
                return true;
            default:
                ConfirmationCodeEditText confirmationCodeEditText3 = (ConfirmationCodeEditText) ((ViewOnLongClickListenerC35705Fpf) this.A01).A01;
                Context context = confirmationCodeEditText3.getContext();
                Object A0X = AbstractC31171DnF.A0X(context);
                A0X.getClass();
                ClipData primaryClip2 = ((ClipboardManager) A0X).getPrimaryClip();
                if (primaryClip2 != null && primaryClip2.getItemCount() > 0) {
                    CharSequence text2 = primaryClip2.getItemAt(0).getText();
                    text2.getClass();
                    if (text2.length() == confirmationCodeEditText3.A03) {
                        confirmationCodeEditText3.setText(text2);
                        confirmationCodeEditText3.setSelection(text2.length());
                        return true;
                    }
                    C9GR.A09(context, context.getString(2131975881));
                    return true;
                }
                return true;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C33I
    public final void Dto(C5SW c5sw) {
    }

    @Override // X.C33I
    public final void Dtq(C5SW c5sw) {
    }

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
    }
}
