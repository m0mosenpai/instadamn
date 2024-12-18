package X;

import java.util.List;

/* renamed from: X.DLf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30019DLf extends C0YY implements InterfaceC16660sJ {
    public static final C30019DLf A00 = new C30019DLf();

    public C30019DLf() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1132359l c1132359l;
        C119365at c119365at;
        C14360o3.A0B(obj, 0);
        List list = (List) obj;
        C122215gH c122215gH = C122215gH.A03;
        Object obj2 = list.get(0);
        long j = C1132359l.A01;
        C28797CnT c28797CnT = AbstractC28160Cb7.A0E;
        C14360o3.A0K(obj2, false);
        Number number = null;
        if (obj2 != null) {
            c1132359l = (C1132359l) c28797CnT.A00.invoke(obj2);
        } else {
            c1132359l = null;
        }
        C14360o3.A0A(c1132359l);
        long j2 = c1132359l.A00;
        Object A0t = AbstractC25227BEk.A0t(list);
        C28797CnT c28797CnT2 = AbstractC28160Cb7.A0F;
        C14360o3.A0K(A0t, false);
        if (A0t != null) {
            c119365at = (C119365at) c28797CnT2.A00.invoke(A0t);
        } else {
            c119365at = null;
        }
        C14360o3.A0A(c119365at);
        long j3 = c119365at.A00;
        Object obj3 = list.get(2);
        if (obj3 != null) {
            number = (Number) obj3;
        }
        C14360o3.A0A(number);
        return new C122215gH(number.floatValue(), j2, j3);
    }
}
