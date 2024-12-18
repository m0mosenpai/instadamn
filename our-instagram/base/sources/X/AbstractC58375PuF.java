package X;

/* renamed from: X.PuF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58375PuF implements InterfaceC65625Tpl {
    public int memoizedHashCode = 0;

    public static int A03(InterfaceC65588TnS interfaceC65588TnS, Object obj) {
        AbstractC58375PuF abstractC58375PuF = (AbstractC58375PuF) obj;
        AbstractC58374PuE abstractC58374PuE = (AbstractC58374PuE) abstractC58375PuF;
        int i = abstractC58374PuE.memoizedSerializedSize;
        if (i == -1) {
            int BtW = interfaceC65588TnS.BtW(abstractC58375PuF);
            abstractC58374PuE.memoizedSerializedSize = BtW;
            return BtW;
        }
        return i;
    }
}
