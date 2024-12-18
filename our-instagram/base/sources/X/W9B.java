package X;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class W9B {
    public int A00;
    public TextWatcher A01;
    public View A02;
    public EditText A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public TextView A06;
    public C124385ju A07;
    public C124385ju A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final ViewStub A0J;
    public final InputMethodManager A0K;
    public final C44G A0L;
    public final V00 A0M;

    public static void A00(W9B w9b, String str) {
        int length;
        EditText editText = w9b.A03;
        editText.getClass();
        editText.removeTextChangedListener(w9b.A01);
        w9b.A03.setText(str);
        Editable text = w9b.A03.getText();
        Matcher matcher = Pattern.compile("\\d\\D*$").matcher(str);
        if (matcher.find()) {
            length = matcher.start() + 1;
        } else {
            length = str.length();
        }
        Selection.setSelection(text, length);
        EditText editText2 = w9b.A03;
        TextWatcher textWatcher = w9b.A01;
        textWatcher.getClass();
        editText2.addTextChangedListener(textWatcher);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(X.W9B r9) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W9B.A01(X.W9B):boolean");
    }

    public W9B(View view, C44G c44g, V00 v00, boolean z) {
        this.A0J = (ViewStub) view.requireViewById(R.id.fundraiser_sticker_currency_amount_selector_stub);
        Context context = view.getContext();
        this.A0I = context;
        Object systemService = context.getSystemService("input_method");
        systemService.getClass();
        this.A0K = (InputMethodManager) systemService;
        this.A0L = c44g;
        this.A0M = v00;
        this.A0D = z;
        this.A0F = context.getResources().getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material);
        this.A0H = context.getColor(AbstractC53242c7.A07(context));
        this.A0G = context.getColor(R.color.default_cta_dominant_color);
    }
}
