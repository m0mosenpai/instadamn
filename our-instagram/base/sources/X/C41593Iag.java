package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iag, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41593Iag {
    public static final C41184IKx A06 = new Object();
    public final Context A00;
    public final SpannableStringBuilder A01;
    public final UserSession A02;
    public final HZ1 A03;
    public final IIY A04;
    public final String A05;

    public C41593Iag(Context context, UserSession userSession, HZ1 hz1, IIY iiy, String str) {
        C14360o3.A0B(hz1, 5);
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = str;
        this.A04 = iiy;
        this.A03 = hz1;
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        SpannableStringBuilder A00 = AbstractC41758IeZ.A00(context);
        A01.append((CharSequence) context.getResources().getString(2131954442));
        A01.append((CharSequence) A00);
        A01.setSpan(new C39404Hao(this, AbstractC31174DnI.A01(context)), 0, A01.length(), 34);
        this.A01 = A01;
    }
}
