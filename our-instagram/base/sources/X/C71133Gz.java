package X;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.3Gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71133Gz extends ImageView {
    public InterfaceC59502nt A00;
    public String A01;
    public final Queue A02;
    public final C1NJ A03;

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (isEnabled()) {
            super.onDraw(canvas);
            A00();
        }
    }

    public final void A00() {
        int i;
        ImageUrl imageUrl = (ImageUrl) this.A02.poll();
        if (imageUrl != null) {
            C1OG A0J = C25821No.A00().A0J(imageUrl, this.A01);
            A0J.A0I = true;
            A0J.A0F = true;
            A0J.A02(this.A03);
            i = 0;
            A0J.A0M = false;
            A0J.A0E = false;
            InterfaceC59502nt A00 = A0J.A00();
            this.A00 = A00;
            A00.E7X();
        } else {
            i = 4;
        }
        setVisibility(i);
    }

    public final void A01(ImageUrl imageUrl) {
        if (imageUrl != null) {
            Queue queue = this.A02;
            if (!(queue instanceof Collection) || !queue.isEmpty()) {
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    if (C14360o3.A0K(((ImageUrl) it.next()).getUrl(), imageUrl.getUrl())) {
                        return;
                    }
                }
            }
            if (queue.size() == 3) {
                queue.poll();
            }
            queue.add(imageUrl);
        }
    }

    public C71133Gz(Context context) {
        super(context);
        this.A02 = new LinkedBlockingQueue();
        this.A03 = new C1NJ() { // from class: X.3H0
            @Override // X.C1NJ
            public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                C14360o3.A0B(interfaceC59502nt, 0);
                C14360o3.A0B(c73033Pe, 1);
                C71133Gz c71133Gz = C71133Gz.this;
                if (c71133Gz.A00 == interfaceC59502nt) {
                    c71133Gz.setImageBitmap(c73033Pe.A01);
                }
            }

            @Override // X.C1NJ
            public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
            }

            @Override // X.C1NJ
            public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
            }
        };
    }

    public final void setSource(String str) {
        this.A01 = str;
    }
}
