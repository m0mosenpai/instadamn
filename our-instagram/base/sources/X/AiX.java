package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Iterator;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class AiX implements BC4 {
    public C1NJ A00;
    public final C25821No A01;

    @Override // X.BC4
    public final void BOI(C148286ly c148286ly, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16820sZ, 2);
        ImmutableList A02 = c148286ly.A02();
        int i = 0;
        if (A02 == null || A02.isEmpty()) {
            interfaceC16820sZ.invoke();
        }
        this.A00 = new C23602Acw(1, new TreeMap(), this, c148286ly, interfaceC16660sJ, interfaceC16820sZ);
        ImmutableList A022 = c148286ly.A02();
        if (A022 != null) {
            Iterator<E> it = A022.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C1OG A0J = this.A01.A0J(new SimpleImageUrl(((A59) next).A00), null);
                A0J.A08 = Integer.valueOf(i);
                A0J.A02(this.A00);
                A0J.A01();
                i = i2;
            }
        }
    }

    public /* synthetic */ AiX(C25821No c25821No, DefaultConstructorMarker defaultConstructorMarker, int i) {
        C25821No A00 = C25821No.A00();
        C14360o3.A0B(A00, 1);
        this.A01 = A00;
    }

    public AiX() {
        C25821No A00 = C25821No.A00();
        C14360o3.A0B(A00, 1);
        this.A01 = A00;
    }
}
