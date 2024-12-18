package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class KS2 extends AbstractC161667Mb {
    public User A00;
    public final C18A A01;

    @Override // X.AbstractC161677Mc, X.AbstractC161687Md
    public final void A02() {
        this.A00 = null;
        super.A02();
    }

    @Override // X.AbstractC161677Mc, X.AbstractC161687Md
    public final /* bridge */ /* synthetic */ void A03(C7VC c7vc) {
        C7M8 c7m8 = (C7M8) c7vc;
        C14360o3.A0B(c7m8, 0);
        User user = this.A00;
        User A02 = this.A01.A02(c7m8.A03.A03);
        if (user == null ? A02 == null : user.equals(A02)) {
            if (c7m8.A04 == null) {
                return;
            }
        }
        this.A00 = A02;
        super.A03(c7m8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KS2(LayoutInflater layoutInflater, ViewGroup viewGroup, JW4 jw4, C18A c18a) {
        super(new C44697Jqg(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.thread_message_typing_indicator, false), jw4.A02), jw4);
        AbstractC37302Gc3.A1U(jw4, c18a);
        this.A01 = c18a;
    }
}
