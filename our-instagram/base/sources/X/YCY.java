package X;

/* loaded from: classes12.dex */
public final class YCY implements YNt {
    @Override // X.YNt
    public final /* bridge */ /* synthetic */ Object ECl(Object obj, Object obj2) {
        C72681Xl8 c72681Xl8;
        long j;
        boolean z;
        boolean z2;
        Y07 y07 = (Y07) obj;
        AbstractC72503XfI abstractC72503XfI = (AbstractC72503XfI) obj2;
        if (abstractC72503XfI instanceof XYZ) {
            j = y07.A00;
            z = y07.A02;
            z2 = y07.A03;
            c72681Xl8 = ((XYZ) abstractC72503XfI).A00;
        } else if (abstractC72503XfI instanceof XY5) {
            XY5 xy5 = (XY5) abstractC72503XfI;
            c72681Xl8 = y07.A01;
            j = ((AbstractC72503XfI) xy5).A00;
            z = xy5.A00;
            z2 = xy5.A01;
        } else {
            if (!(abstractC72503XfI instanceof XYB)) {
                return y07;
            }
            c72681Xl8 = null;
            j = 0;
            z = true;
            z2 = false;
        }
        return new Y07(c72681Xl8, j, z, z2);
    }
}
