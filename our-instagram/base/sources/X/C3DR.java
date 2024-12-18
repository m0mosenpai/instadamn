package X;

import com.facebook.quicklog.MarkerEditor;

/* renamed from: X.3DR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DR extends C3DS implements C3DT {
    public final String A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3DR(String str, String str2, String str3, long j) {
        super("", j);
        C14360o3.A0B(str2, 2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    @Override // X.C3DT
    public final void ABv(MarkerEditor markerEditor) {
        C14360o3.A0B(markerEditor, 0);
        StringBuilder sb = new StringBuilder();
        sb.append('/');
        sb.append(this.A02);
        sb.append('/');
        sb.append(this.A01);
        markerEditor.point(sb.toString(), this.A00, super.A00);
    }

    public final String toString() {
        String str = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("markerPoint /");
        sb.append(this.A02);
        sb.append('/');
        String str2 = this.A01;
        if (str == null) {
            sb.append(str2);
        } else {
            sb.append(str2);
            sb.append(" = ");
            sb.append(str);
        }
        sb.append(" at ");
        sb.append(super.A00);
        return sb.toString();
    }
}
