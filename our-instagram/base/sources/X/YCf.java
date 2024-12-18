package X;

/* loaded from: classes12.dex */
public final class YCf implements InterfaceC73605YNu {
    public String A00;

    @Override // X.InterfaceC73605YNu
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        boolean z;
        YDO ydo = (YDO) XkD.A00.get(obj);
        if (ydo != null) {
            z = ydo.A00.contains(this.A00);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
