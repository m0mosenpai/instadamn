package X;

import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.Arv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24414Arv implements Runnable {
    public final /* synthetic */ C191478dz A00;

    public RunnableC24414Arv(C191478dz c191478dz) {
        this.A00 = c191478dz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C191478dz c191478dz = this.A00;
        IgdsMediaButton igdsMediaButton = c191478dz.A0F;
        if (igdsMediaButton != null) {
            C5SU A0f = AbstractC167017dG.A0f(c191478dz.A0X, c191478dz.A0S.getString(2131955485));
            A0f.A02();
            A0f.A03(igdsMediaButton);
            A0f.A07(C5SV.A07);
            A0f.A06 = new C23963Ajx(c191478dz);
            A0f.A00().A07(c191478dz.A0b);
        }
    }
}
