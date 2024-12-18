package X;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.util.SparseArray;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes11.dex */
public abstract class VQQ {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        boolean z;
        boolean z2;
        boolean z3;
        Button button;
        Button button2;
        Button button3;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            C102884kP c102884kP = (C102884kP) c6fw.A03(0);
            C14360o3.A0B(c102884kP, 3);
            FragmentActivity A03 = C6BQ.A03(C6BQ.A09(c6fq));
            boolean z4 = c6fg.A05;
            int i = R.style.Theme.Material.Light.Dialog.Alert;
            if (z4) {
                i = R.style.Theme.Material.Dialog.Alert;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(A03, i);
            String A0F = c102884kP.A0F();
            if (A0F != null) {
                Context context = builder.getContext();
                int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, AbstractC167007dF.A0K(context));
                int applyDimension2 = (int) TypedValue.applyDimension(1, 18.0f, AbstractC167007dF.A0K(context));
                TextView textView = new TextView(context, null, R.attr.textAppearanceMedium);
                textView.setText(A0F);
                textView.setTypeface(C1LZ.A00().A05.A00(context, "sans-serif-medium"));
                int i2 = -14277082;
                if (z4) {
                    i2 = -1;
                }
                textView.setTextColor(i2);
                textView.setPadding(applyDimension, applyDimension2, applyDimension, 0);
                builder.setCustomTitle(textView);
            }
            String A0E = c102884kP.A0E();
            if (A0E != null) {
                builder.setMessage(A0E);
            }
            C102884kP A08 = c102884kP.A08(36);
            SparseArray sparseArray = null;
            if (A08 == null) {
                z = false;
            } else {
                String A0L = A08.A0L(46);
                if (A0L != null) {
                    sparseArray = new SparseArray();
                    sparseArray.append(com.facebook.R.id.testing_id_view_tag_key, A0L);
                }
                String str = "";
                String A0L2 = A08.A0L(36);
                if (A0L2 != null) {
                    str = A0L2;
                }
                WHj wHj = new WHj(0, c6fg, A08, c6fq);
                A08.A0L(40);
                z = true;
                builder.setPositiveButton(str, wHj);
            }
            C102884kP A082 = c102884kP.A08(38);
            SparseArray sparseArray2 = null;
            if (A082 == null) {
                z2 = false;
            } else {
                String A0L3 = A082.A0L(46);
                if (A0L3 != null) {
                    sparseArray2 = new SparseArray();
                    sparseArray2.append(com.facebook.R.id.testing_id_view_tag_key, A0L3);
                }
                String str2 = "";
                String A0G = A082.A0G();
                if (A0G != null) {
                    str2 = A0G;
                }
                WHj wHj2 = new WHj(0, c6fg, A082, c6fq);
                A082.A0L(40);
                z2 = true;
                builder.setNegativeButton(str2, wHj2);
            }
            C102884kP A083 = c102884kP.A08(44);
            SparseArray sparseArray3 = null;
            if (A083 == null) {
                z3 = false;
            } else {
                String A0L4 = A083.A0L(46);
                if (A0L4 != null) {
                    sparseArray3 = new SparseArray();
                    sparseArray3.append(com.facebook.R.id.testing_id_view_tag_key, A0L4);
                }
                String str3 = "";
                String A0G2 = A083.A0G();
                if (A0G2 != null) {
                    str3 = A0G2;
                }
                WHj wHj3 = new WHj(0, c6fg, A083, c6fq);
                A083.A0L(40);
                z3 = true;
                builder.setNeutralButton(str3, wHj3);
            }
            AlertDialog create = builder.create();
            C0fJ.A00(create);
            if (z && (button3 = create.getButton(-1)) != null) {
                int i3 = -16777216;
                if (z4) {
                    i3 = -1;
                }
                button3.setTextColor(i3);
                if (sparseArray != null) {
                    for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                        int keyAt = sparseArray.keyAt(i4);
                        button3.setTag(keyAt, sparseArray.get(keyAt));
                    }
                }
            }
            if (z2 && (button2 = create.getButton(-2)) != null) {
                int i5 = -16777216;
                if (z4) {
                    i5 = -1;
                }
                button2.setTextColor(i5);
                if (sparseArray2 != null) {
                    for (int i6 = 0; i6 < sparseArray2.size(); i6++) {
                        int keyAt2 = sparseArray2.keyAt(i6);
                        button2.setTag(keyAt2, sparseArray2.get(keyAt2));
                    }
                }
            }
            if (z3 && (button = create.getButton(-3)) != null) {
                int i7 = -16777216;
                if (z4) {
                    i7 = -1;
                }
                button.setTextColor(i7);
                if (sparseArray3 != null) {
                    for (int i8 = 0; i8 < sparseArray3.size(); i8++) {
                        int keyAt3 = sparseArray3.keyAt(i8);
                        button.setTag(keyAt3, sparseArray3.get(keyAt3));
                    }
                }
            }
        }
        return null;
    }
}
