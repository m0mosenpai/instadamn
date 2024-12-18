package com.instagram.ui.widget.nametag;

import X.AbstractC15960qq;
import X.EnumC15950qp;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes11.dex */
public class UsernameTextView extends TextView {
    public String A00;
    public Drawable A01;
    public String A02;

    public static void A01(UsernameTextView usernameTextView, String str, String[] strArr, int i, int i2) {
        String str2;
        int lastIndexOf;
        if (i != 0 && !TextUtils.isEmpty(str)) {
            StaticLayout staticLayout = new StaticLayout(str, usernameTextView.getPaint(), i2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < staticLayout.getLineCount(); i3++) {
                arrayList.add(str.substring(staticLayout.getLineStart(i3), staticLayout.getLineEnd(i3)));
            }
            if (arrayList.size() == 1) {
                strArr[3 - i] = str;
                return;
            }
            String str3 = (String) arrayList.get(0);
            int length = str3.length();
            int max = Math.max(str3.lastIndexOf(95), str3.lastIndexOf(46));
            if (max > 0) {
                int i4 = max;
                do {
                    char charAt = str3.charAt(i4);
                    if (charAt != '_' && charAt != '.') {
                        length = max + 1;
                        break;
                    }
                    i4--;
                } while (i4 >= 0);
            }
            if (!TextUtils.isEmpty(usernameTextView.A02) && (lastIndexOf = str3.lastIndexOf((str2 = usernameTextView.A02))) >= 0) {
                length = lastIndexOf + str2.length();
            } else if (arrayList.size() == 2) {
                length = Math.round(str.length() / 2.0f);
            }
            strArr[3 - i] = str.substring(0, length);
            A01(usernameTextView, str.substring(length), strArr, i - 1, i2);
        }
    }

    public void setName(String str, String str2) {
        this.A00 = str;
        if (!TextUtils.isEmpty(str2)) {
            String trim = str2.trim();
            int indexOf = trim.indexOf(32);
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            this.A02 = trim;
            this.A02 = trim.toUpperCase(Locale.US);
        }
    }

    public UsernameTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        Context context = getContext();
        this.A01 = context.getDrawable(R.drawable.nametag_card_glyph);
        setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width));
        setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A0W));
        setAllCaps(true);
        setIncludeFontPadding(false);
        setGravity(17);
        setLetterSpacing(0.03f);
    }

    public UsernameTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public UsernameTextView(Context context) {
        super(context);
        A00();
    }
}
