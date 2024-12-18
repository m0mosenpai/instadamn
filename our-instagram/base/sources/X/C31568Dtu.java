package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Dtu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31568Dtu extends AbstractC65632xz {
    public FNE A00;
    public final Context A01;
    public final C38M A02;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        if (i != 1) {
            return Integer.MAX_VALUE;
        }
        return Integer.MIN_VALUE;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        if (i != 1) {
            return Integer.MAX_VALUE;
        }
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C31576Du4 c31576Du4 = (C31576Du4) obj;
        boolean A1R = AbstractC167007dF.A1R(0, anonymousClass306, c31576Du4);
        Integer num = c31576Du4.A03;
        if (num != C05F.A0Y && num != C05F.A0j) {
            anonymousClass306.A7a(0);
            FNE fne = this.A00;
            String str = c31576Du4.A01;
            if (fne != null && str != null) {
                C63622uj c63622uj = fne.A01;
                AbstractC31176DnK.A1V(fne.A03, C59062n7.A00(c31576Du4, 0, str), c63622uj, str);
                return;
            }
            return;
        }
        anonymousClass306.A7a(A1R ? 1 : 0);
    }

    public C31568Dtu(Context context, C38M c38m) {
        this.A01 = context;
        this.A02 = c38m;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1708816509);
        AbstractC167017dG.A1P(view, obj);
        C31576Du4 c31576Du4 = (C31576Du4) obj;
        C3OO c3oo = (C3OO) view.getTag();
        if (c3oo != null) {
            AbstractC35096Fd7.A01(this.A01, c3oo, c31576Du4, this.A02, i);
        }
        if (i == 0) {
            FNE fne = this.A00;
            String str = c31576Du4.A01;
            if (fne != null && str != null) {
                C59062n7 A00 = fne.A01.A00(str);
                if (!C14360o3.A0K(A00, C59062n7.A07)) {
                    fne.A00.A05(view, A00);
                }
            }
        }
        C0f9.A0A(-1609335347, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1687832520);
        View A00 = AbstractC35096Fd7.A00(this.A01, i, viewGroup);
        C0f9.A0A(2026517760, A0G);
        return A00;
    }
}
