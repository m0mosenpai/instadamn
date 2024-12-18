package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OR0 {
    public static final List A00 = Arrays.asList(EnumC53103NeG.A04, EnumC53103NeG.A01, EnumC53103NeG.A03, EnumC53103NeG.A05, EnumC53103NeG.A02);

    public static C50813Mcj A00(Context context, AutofillData autofillData, boolean z) {
        String str;
        ArrayList A1E;
        int i;
        Object obj;
        String join;
        int i2;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (EnumC53103NeG enumC53103NeG : EnumC53103NeG.values()) {
            if (enumC53103NeG.A01(autofillData) != null) {
                A1E2.add(enumC53103NeG);
            }
        }
        int size = A1E2.size();
        if (z) {
            int i3 = 0;
            if (size == 1) {
                str = ((EnumC53103NeG) A1E2.get(0)).A00(context, autofillData);
                obj = A1E2.get(0);
                join = ((EnumC53103NeG) obj).A01(autofillData);
            } else {
                Iterator it = A00.iterator();
                while (true) {
                    if (it.hasNext()) {
                        EnumC53103NeG enumC53103NeG2 = (EnumC53103NeG) it.next();
                        if (A1E2.contains(enumC53103NeG2)) {
                            str = enumC53103NeG2.A01(autofillData);
                            A1E2.remove(enumC53103NeG2);
                            if (enumC53103NeG2 == EnumC53103NeG.A01) {
                                EnumC53103NeG enumC53103NeG3 = EnumC53103NeG.A02;
                                if (A1E2.contains(enumC53103NeG3)) {
                                    str = AnonymousClass001.A0g(str, ", ", enumC53103NeG3.A01(autofillData));
                                    A1E2.remove(enumC53103NeG3);
                                }
                            }
                        }
                    } else {
                        str = "";
                        break;
                    }
                }
                A1E = AbstractC166987dD.A1E();
                while (i3 < A1E2.size()) {
                    EnumC53103NeG enumC53103NeG4 = (EnumC53103NeG) A1E2.get(i3);
                    EnumC53103NeG enumC53103NeG5 = EnumC53103NeG.A01;
                    if (enumC53103NeG4 == enumC53103NeG5 && (i2 = i3 + 1) < A1E2.size()) {
                        Object obj2 = A1E2.get(i2);
                        EnumC53103NeG enumC53103NeG6 = EnumC53103NeG.A02;
                        if (obj2 == enumC53103NeG6) {
                            A1E.add(AnonymousClass001.A0g(enumC53103NeG5.A01(autofillData), ", ", enumC53103NeG6.A01(autofillData)));
                            i3 = i2;
                            i3++;
                        }
                    }
                    A1E.add(enumC53103NeG4.A01(autofillData));
                    i3++;
                }
                join = TextUtils.join("\n", A1E);
            }
        } else {
            int i4 = 0;
            if (size == 1) {
                str = ((EnumC53103NeG) A1E2.get(0)).A00(context, autofillData);
                obj = A1E2.get(0);
                join = ((EnumC53103NeG) obj).A01(autofillData);
            } else {
                Iterator it2 = A00.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        EnumC53103NeG enumC53103NeG7 = (EnumC53103NeG) it2.next();
                        if (A1E2.contains(enumC53103NeG7)) {
                            str = enumC53103NeG7.A01(autofillData);
                            A1E2.remove(enumC53103NeG7);
                            break;
                        }
                    } else {
                        str = null;
                        break;
                    }
                }
                A1E = AbstractC166987dD.A1E();
                while (i4 < A1E2.size()) {
                    EnumC53103NeG enumC53103NeG8 = (EnumC53103NeG) A1E2.get(i4);
                    EnumC53103NeG enumC53103NeG9 = EnumC53103NeG.A03;
                    if (enumC53103NeG8 == enumC53103NeG9 && (i = i4 + 1) < A1E2.size()) {
                        Object obj3 = A1E2.get(i);
                        EnumC53103NeG enumC53103NeG10 = EnumC53103NeG.A05;
                        if (obj3 == enumC53103NeG10) {
                            A1E.add(AnonymousClass001.A0g(enumC53103NeG9.A01(autofillData), " · ", enumC53103NeG10.A01(autofillData)));
                            i4 += 2;
                        }
                    }
                    A1E.add(enumC53103NeG8.A01(autofillData));
                    i4++;
                }
                join = TextUtils.join("\n", A1E);
            }
        }
        Pair create = Pair.create(str, join);
        C50813Mcj c50813Mcj = new C50813Mcj(context);
        c50813Mcj.setId(View.generateViewId());
        c50813Mcj.setTitle((String) create.first);
        c50813Mcj.setSubtitle((String) create.second);
        c50813Mcj.setExtraButtonText(context.getResources().getString(2131961561));
        return c50813Mcj;
    }
}
