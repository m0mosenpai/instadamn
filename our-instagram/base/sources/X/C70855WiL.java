package X;

import android.text.SpannableStringBuilder;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WiL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70855WiL implements InterfaceC25174BBv {
    public final /* synthetic */ C70827Whk A00;

    public C70855WiL(C70827Whk c70827Whk) {
        this.A00 = c70827Whk;
    }

    @Override // X.InterfaceC25174BBv
    public final void DK5(Hashtag hashtag, int i) {
        if (hashtag != null) {
            C70827Whk c70827Whk = this.A00;
            UFV A00 = C70827Whk.A00(c70827Whk);
            A00.A0A(new SpannableStringBuilder(((UQN) A00.A07.getValue()).A01), hashtag, c70827Whk.A05.getSelectionEnd());
        }
    }
}
