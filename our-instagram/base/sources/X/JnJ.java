package X;

/* loaded from: classes8.dex */
public final class JnJ extends AbstractC65412xd {
    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        InterfaceC66492zQ interfaceC66492zQ = (InterfaceC66492zQ) obj;
        if (interfaceC66492zQ.getClass().equals(obj2.getClass()) && interfaceC66492zQ.isContentSame(obj2)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) obj;
        InterfaceC66482zP interfaceC66482zP2 = (InterfaceC66482zP) obj2;
        if (interfaceC66482zP == interfaceC66482zP2 || (interfaceC66482zP.getClass().equals(interfaceC66482zP2.getClass()) && interfaceC66482zP.getKey().equals(interfaceC66482zP2.getKey()))) {
            return true;
        }
        return false;
    }
}
