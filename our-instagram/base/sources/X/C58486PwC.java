package X;

/* renamed from: X.PwC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58486PwC extends AbstractC06990Yq<String> {
    public final /* synthetic */ C117315Sq A00;

    public C58486PwC(C117315Sq c117315Sq) {
        this.A00 = c117315Sq;
    }

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.A01.groupCount() + 1;
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        String group = this.A00.A01.group(i);
        if (group == null) {
            return "";
        }
        return group;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.indexOf(obj);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.lastIndexOf(obj);
    }
}
