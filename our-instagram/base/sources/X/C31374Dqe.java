package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Dqe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31374Dqe {
    public static final long A05 = TimeUnit.SECONDS.toMillis(15);
    public C31373Dqd A00;
    public Runnable A01;
    public final Handler A02;
    public final AbstractC12990ll A03;
    public final List A04;

    public C31374Dqe(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A03 = abstractC12990ll;
        this.A04 = AbstractC16960so.A1Q("com.instagram.urlhandlers.clips.ClipsUrlHandlerActivity", "com.instagram.urlhandlers.media.MediaExternalUrlHandlerActivity", "com.instagram.urlhandler.WebAndUserExternalUrlHandler");
        this.A00 = new C31373Dqd(abstractC12990ll, new C31575Du3(this, 21));
        this.A02 = new Handler(C1CG.A00());
    }

    public static final void A00(Intent intent, android.net.Uri uri, C31374Dqe c31374Dqe, String str, String str2) {
        String string;
        C31373Dqd c31373Dqd = c31374Dqe.A00;
        if (((AbstractC69603Au) c31373Dqd).A01) {
            c31373Dqd.A0J("handler", str);
            if (uri != null) {
                String scheme = uri.getScheme();
                if (scheme != null) {
                    c31374Dqe.A00.A0J("url_scheme", scheme);
                }
                String host = uri.getHost();
                if (host != null) {
                    c31374Dqe.A00.A0J("url_host", host);
                }
                String path = uri.getPath();
                if (path != null) {
                    c31374Dqe.A00.A0J("absolute_url", path);
                }
            }
            String stringExtra = intent.getStringExtra("EXTRA_REFERRER");
            if (stringExtra != null && stringExtra.length() != 0) {
                c31374Dqe.A00.A0J("source_application", stringExtra);
            }
            Bundle extras = intent.getExtras();
            if (extras != null && (string = extras.getString("short_url")) != null && string.length() != 0) {
                c31374Dqe.A00.A0J("short_url", string);
            }
            c31374Dqe.A00.A01.A05();
            if (!AbstractC001800i.A0u(c31374Dqe.A04, str2)) {
                c31374Dqe.A00.A00.A05();
                return;
            }
            RunnableC36873GMu runnableC36873GMu = new RunnableC36873GMu(c31374Dqe);
            c31374Dqe.A02.postDelayed(runnableC36873GMu, A05);
            c31374Dqe.A01 = runnableC36873GMu;
        }
    }

    public final void A01() {
        C31373Dqd c31373Dqd = this.A00;
        if (((AbstractC69603Au) c31373Dqd).A01) {
            c31373Dqd.A00.A05();
        }
    }

    public final void A02(String str) {
        C31373Dqd c31373Dqd = this.A00;
        if (((AbstractC69603Au) c31373Dqd).A01) {
            c31373Dqd.A00.A07(str);
        }
    }
}
