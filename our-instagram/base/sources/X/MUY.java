package X;

/* loaded from: classes9.dex */
public abstract class MUY {
    public static final AbstractC107294sa A00(AbstractC107294sa abstractC107294sa, Object obj) {
        if (abstractC107294sa instanceof C107284sZ) {
            return C107284sZ.A00;
        }
        if (abstractC107294sa instanceof C109384wN) {
            return new C109384wN(obj);
        }
        if (abstractC107294sa instanceof C109374wM) {
            if (obj != null) {
                return new C109374wM(obj);
            }
            return new C109374wM(((C109374wM) abstractC107294sa).A00);
        }
        if (abstractC107294sa instanceof C6DN) {
            return new C6DN(obj, ((C6DN) abstractC107294sa).A00);
        }
        throw B4Z.A00();
    }
}
