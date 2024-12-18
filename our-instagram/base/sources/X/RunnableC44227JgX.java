package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.JgX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44227JgX implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SearchEditText A02;

    public RunnableC44227JgX(SearchEditText searchEditText, int i, int i2) {
        this.A00 = i;
        this.A02 = searchEditText;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass693 anonymousClass693;
        int i = this.A00;
        SearchEditText searchEditText = this.A02;
        if (i == 0) {
            i = this.A01;
            anonymousClass693 = searchEditText.A06;
            if (anonymousClass693 != null && !anonymousClass693.isPlaying()) {
                if (i == -1) {
                    anonymousClass693.EH1();
                    anonymousClass693.E4S();
                }
            } else {
                return;
            }
        } else {
            anonymousClass693 = searchEditText.A05;
            if (anonymousClass693 == null || anonymousClass693.isPlaying()) {
                return;
            }
        }
        anonymousClass693.EH0(i);
        anonymousClass693.E4S();
    }
}
