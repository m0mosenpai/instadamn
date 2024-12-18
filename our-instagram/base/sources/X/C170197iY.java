package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.7iY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170197iY extends AbstractC77583di {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C3F1 A07;
    public final C7LD A08;
    public final AbstractC61802rh A09;
    public final C2Z7 A0A;
    public final InterfaceC168047ez A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final C51722Yv A0P;
    public final C169987iD A0Q;
    public final Integer A0R;
    public final List A0S;
    public final InterfaceC16820sZ A0T;
    public final boolean A0E = true;
    public final boolean A0K = true;

    public C170197iY(C3F1 c3f1, C7LD c7ld, AbstractC61802rh abstractC61802rh, C51722Yv c51722Yv, C2Z7 c2z7, InterfaceC168047ez interfaceC168047ez, C169987iD c169987iD, Integer num, List list, List list2, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A0A = c2z7;
        this.A0R = num;
        this.A0H = z;
        this.A01 = i;
        this.A06 = i2;
        this.A05 = i3;
        this.A04 = i4;
        this.A0G = z2;
        this.A0C = list;
        this.A0I = z3;
        this.A0O = z4;
        this.A0J = z5;
        this.A0M = z6;
        this.A0N = z7;
        this.A0F = z8;
        this.A00 = i5;
        this.A03 = i6;
        this.A02 = i7;
        this.A07 = c3f1;
        this.A0Q = c169987iD;
        this.A0S = list2;
        this.A09 = abstractC61802rh;
        this.A0L = z9;
        this.A0B = interfaceC168047ez;
        this.A08 = c7ld;
        this.A0T = interfaceC16820sZ;
        this.A0D = z10;
        this.A0P = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C51532Yb c51532Yb;
        InterfaceC16660sJ c25241BEz;
        C14360o3.A0B(c77993eR, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c77993eR, C170207iZ.A00);
        C51762Yz A002 = AbstractC77073ct.A00(c77993eR, new C206859Dq(this, 18));
        Integer num = this.A0R;
        if (num == null) {
            num = c77993eR.A05.A02.A01.A06;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                InterfaceC16820sZ interfaceC16820sZ = this.A0T;
                List list = this.A0S;
                C169987iD c169987iD = this.A0Q;
                Object obj = A002.A03;
                c51532Yb = new C51532Yb(C77603dk.A00, new InterfaceC51522Ya() { // from class: X.7ia
                    /* JADX WARN: Type inference failed for: r2v0, types: [X.7hf, androidx.recyclerview.widget.RecyclerView] */
                    @Override // X.InterfaceC51522Ya
                    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
                        C14360o3.A0B(context, 0);
                        ?? recyclerView = new RecyclerView(context, null, 0);
                        recyclerView.A03 = true;
                        recyclerView.A04 = true;
                        recyclerView.A05 = true;
                        recyclerView.A02 = true;
                        C2Z8 c2z8 = new C2Z8(context, recyclerView);
                        c2z8.setId(R.id.recycler_view_container_id);
                        return c2z8;
                    }
                }, 3, false);
                c25241BEz = new C207329Fl(0, c77993eR, this, obj, A00, interfaceC16820sZ, list, c169987iD);
            } else {
                throw new RuntimeException();
            }
        } else {
            InterfaceC16820sZ interfaceC16820sZ2 = this.A0T;
            List list2 = this.A0S;
            C169987iD c169987iD2 = this.A0Q;
            Object obj2 = A002.A03;
            c51532Yb = new C51532Yb(C77603dk.A00, new C23481Aau(this), 3, false);
            c25241BEz = new C25241BEz(0, obj2, A00, interfaceC16820sZ2, c77993eR, this, list2, c169987iD2);
        }
        C2YP c2yp = new C2YP(c51532Yb, null, c25241BEz, c77993eR.A01());
        return new C78053eX(this.A0P, new C170227ib(this.A0A, new C206859Dq(A00, 17), this.A01, this.A05, this.A06), c2yp);
    }
}
