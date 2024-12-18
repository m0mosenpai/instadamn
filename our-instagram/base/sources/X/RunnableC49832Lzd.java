package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Lzd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49832Lzd implements Runnable {
    public final /* synthetic */ KC0 A00;

    public RunnableC49832Lzd(KC0 kc0) {
        this.A00 = kc0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KC0 kc0 = this.A00;
        SearchEditText searchEditText = kc0.A09;
        if (searchEditText != null) {
            AbstractC13880nE.A0T(searchEditText);
            C87T c87t = kc0.A06;
            if (c87t != null) {
                c87t.A0P.Egh(EnumC1824387i.A03);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
