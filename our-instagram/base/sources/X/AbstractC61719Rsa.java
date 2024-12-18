package X;

/* renamed from: X.Rsa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61719Rsa {
    public static final void A00(C62620SJd c62620SJd) {
        C14360o3.A0B(c62620SJd, 0);
        C50627MWo c50627MWo = c62620SJd.A03;
        Integer num = C05F.A01;
        if (c50627MWo == null) {
            Integer num2 = C05F.A00;
            c62620SJd.A03 = new C50627MWo(new C51760Mtj(num, num2, num2, 3), num);
        } else {
            c50627MWo.A00 = num;
            Integer num3 = C05F.A00;
            c50627MWo.A01 = new C51760Mtj(num, num3, num3, 3);
        }
    }
}
