package X;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Elc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33242Elc extends C36731GHa {
    public final Context A00;
    public final CompoundButton.OnCheckedChangeListener A01;
    public final CompoundButton.OnCheckedChangeListener A02;
    public final Fragment A03;
    public final UserSession A04;
    public final C35033Fc6 A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33242Elc(Context context, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, Fragment fragment, UserSession userSession, C35033Fc6 c35033Fc6, CharSequence charSequence, String str, boolean z) {
        super((CompoundButton.OnCheckedChangeListener) null, charSequence, z);
        AbstractC167027dH.A0a(1, context, userSession, fragment, c35033Fc6);
        C14360o3.A0B(charSequence, 6);
        this.A00 = context;
        this.A04 = userSession;
        this.A03 = fragment;
        this.A05 = c35033Fc6;
        this.A06 = str;
        this.A01 = onCheckedChangeListener;
        C35745Fqd c35745Fqd = new C35745Fqd(this, 41);
        this.A02 = c35745Fqd;
        this.A08 = c35745Fqd;
    }
}
