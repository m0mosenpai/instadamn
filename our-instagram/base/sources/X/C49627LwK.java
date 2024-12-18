package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.LwK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49627LwK implements C7XU {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ KBR A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    @Override // X.C7XU
    public final void DB3() {
    }

    public C49627LwK(FragmentActivity fragmentActivity, KBR kbr, String str, boolean z) {
        this.A01 = kbr;
        this.A00 = fragmentActivity;
        this.A03 = z;
        this.A02 = str;
    }

    @Override // X.C7XU
    public final void DAy() {
        JZ8 jz8 = AbstractC47193KtS.A01;
        KBR kbr = this.A01;
        UserSession A0r = AbstractC166987dD.A0r(kbr.A07);
        C53O c53o = kbr.A03;
        jz8.A03(this.A00, c53o, A0r, "ig_stories_creation", "ig_stories_creation_avatar_cta_dialog", null, this.A02, null, null, false, this.A03);
    }
}
