package X;

import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;

/* loaded from: classes10.dex */
public final class TQE implements Runnable {
    public final /* synthetic */ R7U A00;
    public final /* synthetic */ C63904Svf A01;
    public final /* synthetic */ String A02;

    public TQE(R7U r7u, C63904Svf c63904Svf, String str) {
        this.A01 = c63904Svf;
        this.A00 = r7u;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InstantExperiencesBrowserChrome instantExperiencesBrowserChrome = this.A01.A00;
        instantExperiencesBrowserChrome.A06.setText(this.A00.getTitle());
        instantExperiencesBrowserChrome.A05.setText(this.A02);
        instantExperiencesBrowserChrome.A06.setVisibility(0);
        instantExperiencesBrowserChrome.A05.setVisibility(0);
        instantExperiencesBrowserChrome.A04.setVisibility(8);
    }
}
