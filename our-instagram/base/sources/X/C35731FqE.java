package X;

import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;

/* renamed from: X.FqE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35731FqE implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C35731FqE(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.1gp, X.1OW] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        if (this.A00 != 0) {
            UserSession userSession = ((C36367G2t) this.A01).A00;
            String str2 = this.A02;
            C26141Ov A01 = C26141Ov.A01(userSession);
            ?? c1ow = new C1OW(AbstractC31277Doz.A09(userSession, C32651gp.class, 1));
            c1ow.A00 = str2;
            c1ow.A01 = z;
            A01.A0B(c1ow);
            return;
        }
        C33205Eks c33205Eks = (C33205Eks) this.A01;
        ((C163527Tp) c33205Eks.A00.getValue()).A01(this.A02, z);
        InterfaceC83733oI A00 = AbstractC35077Fco.A00(c33205Eks.requireArguments(), "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (A00 != null) {
            str = AbstractC1345466e.A07(A00);
        } else {
            str = null;
        }
        AbstractC31172DnG.A0c(c33205Eks.A01).A0D(null, str, z);
    }
}
