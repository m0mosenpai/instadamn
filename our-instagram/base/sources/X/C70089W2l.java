package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.W2l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70089W2l {
    public C69176Vj5 A00;
    public CharSequence[] A01;
    public final Context A02;
    public final Fragment A03;
    public final UserSession A04;

    public static CharSequence[] A00(C70089W2l c70089W2l) {
        if (c70089W2l.A01 == null) {
            ArrayList arrayList = new ArrayList();
            Context context = c70089W2l.A02;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(2131963556));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(R.color.red_4)), 0, spannableStringBuilder.length(), 18);
            arrayList.add(spannableStringBuilder);
            arrayList.add(context.getString(2131951992));
            CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
            c70089W2l.A01 = charSequenceArr;
            arrayList.toArray(charSequenceArr);
        }
        return c70089W2l.A01;
    }

    public C70089W2l(Fragment fragment, UserSession userSession) {
        this.A03 = fragment;
        this.A02 = fragment.getContext();
        this.A04 = userSession;
    }
}
