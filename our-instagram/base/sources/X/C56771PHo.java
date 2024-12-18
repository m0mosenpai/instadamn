package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;

/* renamed from: X.PHo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56771PHo implements C7XU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C56771PHo(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C7XU
    public final void DAy() {
        switch (this.A00) {
            case 0:
                new Handler().postDelayed(new PQ3(this, new C56769PHm(this, 2)), 400L);
                return;
            case 1:
                Handler handler = new Handler();
                final C54687ODn c54687ODn = (C54687ODn) this.A02;
                final Object obj = this.A03;
                handler.post(new Runnable() { // from class: X.PQk
                    @Override // java.lang.Runnable
                    public final void run() {
                        C54687ODn c54687ODn2 = C54687ODn.this;
                        Object obj2 = obj;
                        PHU phu = c54687ODn2.A01;
                        if (phu != null) {
                            phu.Dhr(obj2);
                        }
                    }
                });
                return;
            case 2:
                C189478aR c189478aR = ((C54770OIj) this.A03).A01;
                if (c189478aR == null) {
                    return;
                }
                c189478aR.A03((Context) this.A01, (Fragment) this.A02);
                return;
            default:
                EnumC39627Hel enumC39627Hel = (EnumC39627Hel) this.A02;
                if (C41719Idq.A01((C38321qM) this.A01, enumC39627Hel)) {
                    ((C37607Gh2) this.A03).A0H.A0D(enumC39627Hel);
                    return;
                }
                return;
        }
    }

    @Override // X.C7XU
    public final void DB3() {
    }
}
