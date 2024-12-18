package X;

import android.content.Context;
import android.graphics.Rect;

/* renamed from: X.OJf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54788OJf {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final Rect A04;
    public final C124375jt[] A05;
    public final C124405jw[] A06;
    public final C55952hg A07;

    public C54788OJf(Context context) {
        C14360o3.A0B(context, 1);
        C55952hg A00 = AbstractC13560mi.A00();
        this.A07 = A00;
        this.A04 = AbstractC166987dD.A0U();
        C124375jt c124375jt = new C124375jt(context, A00, C05F.A0Y);
        C124375jt c124375jt2 = new C124375jt(context, A00, C05F.A0j);
        Integer num = C05F.A0C;
        C124375jt c124375jt3 = new C124375jt(context, A00, num);
        Integer num2 = C05F.A0N;
        this.A05 = new C124375jt[]{c124375jt, c124375jt2, c124375jt3, new C124375jt(context, A00, num2)};
        this.A06 = new C124405jw[]{new C124405jw(context, num), new C124405jw(context, num2), new C124405jw(context, C05F.A00), new C124405jw(context, C05F.A01)};
    }

    public final boolean A00(Rect rect) {
        C124405jw[] c124405jwArr = this.A06;
        c124405jwArr[0].A00 = AbstractC167007dF.A1Q(rect.left, this.A01);
        c124405jwArr[1].A00 = AbstractC25230BEn.A1S(rect.right, this.A02);
        c124405jwArr[2].A00 = AbstractC167007dF.A1Q(rect.top, this.A03);
        c124405jwArr[3].A00 = AbstractC25230BEn.A1S(rect.bottom, this.A00);
        int i = 0;
        while (!c124405jwArr[i].A00) {
            i++;
            if (i >= 4) {
                return false;
            }
        }
        return true;
    }
}
