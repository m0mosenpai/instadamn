package X;

import android.content.Context;
import com.facebook.R;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class M8Y implements InterfaceC09250da, InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    public M8Y(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.7aM, X.7Zb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.7Zb, X.7ZZ] */
    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        switch (this.A00) {
            case 2:
                C7IM c7im = (C7IM) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return AbstractC43594JPz.A0C(c7im);
            case 3:
                Jo0 jo0 = (Jo0) this.A01;
                List emptyList = Collections.emptyList();
                ?? r3 = jo0.A08;
                C7DK c7dk = jo0.A0A;
                AnonymousClass988 anonymousClass988 = jo0.A09;
                return new C1579277b(jo0.A06, jo0.A07, r3, anonymousClass988, c7dk, emptyList, false, jo0.A0B);
            case 4:
                Jo0 jo02 = (Jo0) this.A01;
                Context context = jo02.A05.getContext();
                ?? r32 = jo02.A08;
                return C7AY.A00(context, jo02.A06, jo02.A07, r32, jo02.A09, null);
            case 5:
                return ((C43771JXk) this.A01).A06.getResources().getDrawable(R.drawable.instagram_add_filled);
            default:
                C190398bx.A0C((C190398bx) this.A01);
                return C0eB.A00;
        }
    }
}
