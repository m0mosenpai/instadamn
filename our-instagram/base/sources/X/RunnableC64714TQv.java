package X;

import android.webkit.WebResourceResponse;

/* renamed from: X.TQv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64714TQv implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ WebResourceResponse A01;
    public final /* synthetic */ QF4 A02;
    public final /* synthetic */ QF6 A03;
    public final /* synthetic */ String A04;

    public RunnableC64714TQv(WebResourceResponse webResourceResponse, QF4 qf4, QF6 qf6, String str, long j) {
        this.A02 = qf4;
        this.A03 = qf6;
        this.A04 = str;
        this.A01 = webResourceResponse;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QF6 qf6 = this.A03;
        String str = this.A04;
        boolean A1W = AbstractC167007dF.A1W(this.A01);
        long j = this.A00;
        if (!qf6.A0I()) {
            char c = 1;
            AbstractC63254SgB.A03("FB tracking %s requested", new Object[]{str});
            switch (str.hashCode()) {
                case 3710:
                    if (!str.equals("tr")) {
                        return;
                    }
                    c = 0;
                    break;
                case 98107086:
                    if (!str.equals("ga_js")) {
                        return;
                    }
                    break;
                case 1017223877:
                    if (!str.equals("ga_collect")) {
                        return;
                    }
                    c = 2;
                    break;
                case 1457680597:
                    if (!str.equals("fbevents")) {
                        return;
                    }
                    c = 3;
                    break;
                default:
                    return;
            }
            switch (c) {
                case 0:
                    if (qf6.A09 != -1) {
                        return;
                    }
                    qf6.A09 = j;
                    qf6.A0a = A1W;
                    return;
                case 1:
                    if (qf6.A03 != -1) {
                        return;
                    }
                    qf6.A03 = j;
                    qf6.A0R = A1W;
                    return;
                case 2:
                    if (qf6.A02 != -1) {
                        return;
                    }
                    qf6.A02 = j;
                    qf6.A0Q = A1W;
                    return;
                default:
                    if (qf6.A00 != -1) {
                        return;
                    }
                    qf6.A00 = j;
                    qf6.A0Z = A1W;
                    return;
            }
        }
    }
}
