package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.W2q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70093W2q {
    public C69116Vi6 A00;
    public CharSequence[] A01;
    public final Fragment A02;
    public final UserSession A03;
    public final C42520Irz A04;
    public final InterfaceC60442pS A05;

    public static final CharSequence[] A00(C70093W2q c70093W2q) {
        CharSequence[] charSequenceArr = c70093W2q.A01;
        if (charSequenceArr == null) {
            Resources A09 = AbstractC31177DnL.A09(c70093W2q.A02);
            CharSequence[] charSequenceArr2 = {A09.getString(2131963555), A09.getString(2131963529), A09.getString(2131974339)};
            c70093W2q.A01 = charSequenceArr2;
            return charSequenceArr2;
        }
        return charSequenceArr;
    }

    public C70093W2q(Fragment fragment, UserSession userSession, C42520Irz c42520Irz, InterfaceC60442pS interfaceC60442pS) {
        this.A03 = userSession;
        this.A02 = fragment;
        this.A05 = interfaceC60442pS;
        this.A04 = c42520Irz;
    }
}
