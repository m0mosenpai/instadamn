package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import com.facebook.R;
import java.util.regex.Pattern;

/* renamed from: X.JDz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43358JDz extends C0YY implements InterfaceC16660sJ {
    public static final C43358JDz A00 = new C43358JDz();

    public C43358JDz() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        C14360o3.A0B(context, 0);
        String A0p = AbstractC166997dE.A0p(context, 2131970022);
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        A01.append((CharSequence) A0p);
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, R.style.AuthErrorTextAppearance);
        Pattern pattern = AbstractC13670mt.A00;
        A01.setSpan(textAppearanceSpan, 0, A0p.length(), 33);
        return A01;
    }
}
