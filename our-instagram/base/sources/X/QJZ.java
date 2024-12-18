package X;

/* loaded from: classes10.dex */
public final class QJZ extends AbstractC61283Rku {
    public final String A00;
    public final String A01;

    public QJZ(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QJZ) {
                QJZ qjz = (QJZ) obj;
                if (!C14360o3.A0K(this.A01, qjz.A01) || !C14360o3.A0K(this.A00, qjz.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("NoMainThreadLayoutState(root=", this.A01, ", breadcrumb=", this.A00, ')');
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0J(this.A01));
    }
}
