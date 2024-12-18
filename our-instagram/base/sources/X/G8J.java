package X;

import android.content.Context;
import android.util.Patterns;
import com.instagram.actionbar.ActionButton;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class G8J implements InterfaceC57949Pmv {
    public final int A00;
    public final Object A01;

    public G8J(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC57949Pmv
    public final C54543O7v getState(C54543O7v c54543O7v, CharSequence charSequence, boolean z) {
        V0W v0w;
        int i;
        String string;
        int i2;
        Context context;
        int i3;
        String obj;
        switch (this.A00) {
            case 0:
                boolean A1R = AbstractC167007dF.A1R(0, c54543O7v, charSequence);
                if (AbstractC001900j.A0T(charSequence)) {
                    v0w = (V0W) this.A01;
                    v0w.A06 = false;
                    c54543O7v.A01 = "error";
                    i = 2131971012;
                } else {
                    Pattern pattern = Patterns.WEB_URL;
                    if (!AbstractC31175DnJ.A1Z(charSequence.toString(), pattern)) {
                        v0w = (V0W) this.A01;
                        v0w.A06 = false;
                        v0w.A05 = charSequence.toString();
                        V0W.A00(v0w);
                        c54543O7v.A01 = "error";
                        i = 2131971010;
                    } else {
                        if (!AbstractC31175DnJ.A1Z(charSequence.toString(), pattern)) {
                            return c54543O7v;
                        }
                        V0W v0w2 = (V0W) this.A01;
                        v0w2.A05 = charSequence.toString();
                        v0w2.A06 = A1R;
                        V0W.A00(v0w2);
                        c54543O7v.A01 = "confirmed";
                        return c54543O7v;
                    }
                }
                string = v0w.getString(i);
                c54543O7v.A00 = string;
                return c54543O7v;
            case 1:
                boolean A1R2 = AbstractC167007dF.A1R(0, c54543O7v, charSequence);
                C32297EKk c32297EKk = (C32297EKk) this.A01;
                String A1A = AbstractC25228BEl.A1A(charSequence);
                c32297EKk.A04 = A1A;
                String str = "newFolderName";
                if (A1A != null) {
                    if (A1A.length() > 15) {
                        ActionButton actionButton = c32297EKk.A00;
                        if (actionButton != null) {
                            actionButton.setEnabled(false);
                            c54543O7v.A01 = "error";
                            i2 = 2131959819;
                            string = c32297EKk.getString(i2);
                            c54543O7v.A00 = string;
                            return c54543O7v;
                        }
                        C14360o3.A0F("saveButton");
                        throw C00O.createAndThrow();
                    }
                    ArrayList arrayList = c32297EKk.A06;
                    if (arrayList == null) {
                        str = "otherFolderNames";
                    } else {
                        if (arrayList.contains(A1A)) {
                            ActionButton actionButton2 = c32297EKk.A00;
                            if (actionButton2 != null) {
                                actionButton2.setEnabled(false);
                                c54543O7v.A01 = "error";
                                i2 = 2131959818;
                                string = c32297EKk.getString(i2);
                                c54543O7v.A00 = string;
                                return c54543O7v;
                            }
                        } else {
                            String str2 = c32297EKk.A04;
                            if (str2 != null) {
                                if (str2.length() != 0) {
                                    String str3 = c32297EKk.A03;
                                    if (str3 == null) {
                                        str = "initialFolderName";
                                    } else if (!str2.equals(str3)) {
                                        ActionButton actionButton3 = c32297EKk.A00;
                                        if (actionButton3 != null) {
                                            actionButton3.setEnabled(A1R2);
                                            return c54543O7v;
                                        }
                                    }
                                }
                                ActionButton actionButton4 = c32297EKk.A00;
                                if (actionButton4 != null) {
                                    actionButton4.setEnabled(false);
                                    return c54543O7v;
                                }
                            }
                        }
                        C14360o3.A0F("saveButton");
                        throw C00O.createAndThrow();
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                boolean A1R3 = AbstractC167007dF.A1R(0, c54543O7v, charSequence);
                int length = charSequence.length();
                FQE fqe = (FQE) this.A01;
                if (length < 6) {
                    fqe.A01 = A1R3;
                    fqe.A03.A0E();
                    c54543O7v.A01 = "error";
                    context = fqe.A02;
                    i3 = 2131969374;
                    break;
                } else {
                    fqe.A01 = false;
                    fqe.A03.A0E();
                    return c54543O7v;
                }
            case 3:
                AbstractC167017dG.A1N(c54543O7v, charSequence);
                FQE fqe2 = (FQE) this.A01;
                String A0x = AbstractC31174DnI.A0x(fqe2.A04);
                if (fqe2.A01 || AbstractC31174DnI.A1a(charSequence, A0x) || (obj = charSequence.toString()) == null || obj.length() == 0) {
                    return c54543O7v;
                }
                c54543O7v.A01 = "error";
                context = fqe2.A02;
                i3 = 2131969379;
                break;
                break;
            case 4:
                AbstractC167017dG.A1N(c54543O7v, charSequence);
                C32277EJm c32277EJm = (C32277EJm) this.A01;
                if (!c32277EJm.A05) {
                    return c54543O7v;
                }
                if (charSequence.length() == 0) {
                    c54543O7v.A01 = "error";
                    context = c32277EJm.requireContext();
                    i3 = 2131972450;
                    break;
                } else {
                    if (AbstractC31175DnJ.A1Z(charSequence, Patterns.WEB_URL)) {
                        return c54543O7v;
                    }
                    c54543O7v.A01 = "error";
                    context = c32277EJm.requireContext();
                    i3 = 2131970142;
                    break;
                }
            default:
                return null;
        }
        string = context.getString(i3);
        c54543O7v.A00 = string;
        return c54543O7v;
    }
}
